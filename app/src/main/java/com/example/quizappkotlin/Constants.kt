package com.example.quizappkotlin

object Constants {


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val ques1 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Austria",
            "Pakistan",
            1
        )
        questionList.add((ques1))
        val ques2 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "India",
            "Australia",
            "Austria",
            "Pakistan",
            2
        )
        questionList.add((ques2))
        val ques3 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "India",
            "Armenia",
            1
        )
        questionList.add((ques3))
        val ques4 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Fizi",
            "Germany",
            "Canada",
            "Denmark",
            4
        )
        questionList.add((ques4))
        val ques5 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Fizi",
            "Germany",
            "belgium",
            "Denmark",
            4
        )
        questionList.add((ques4))
        return questionList
    }

}