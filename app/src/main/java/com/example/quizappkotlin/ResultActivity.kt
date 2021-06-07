package com.example.quizappkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN;

        val user_name = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = user_name
        val total_questions = intent.getIntExtra(Constants.TOTAL_QUESTONS, 0)
        val correct_answer = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tv_score.text = "your score is$correct_answer out of $total_questions"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}