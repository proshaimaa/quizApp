package com.shaimaa.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    private var userName: String = ""
    private var correctAnswer: Int = 0
    private var totalQuestion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        userName = intent.getStringExtra(Constants.USER_NAME).toString()
        correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,10)

        tv_userName.text = userName
        tv_score.text = "Your Score is "+"$correctAnswer"+" out of "+"$totalQuestion"

        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}

