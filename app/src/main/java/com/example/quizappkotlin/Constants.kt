package com.example.quizappkotlin

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

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
            3
        )
        questionList.add((ques5))
        val ques6 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Fizi",
            "Germany",
            "belgium",
            "Denmark",
            2
        )
        val ques7 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fizi",
            "Germany",
            "belgium",
            "Denmark",
            1
        )
        questionList.add((ques7))
        val ques8 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Germany",
            "belgium",
            "Denmark",
            1
        )
        questionList.add((ques8))
        val ques9 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Kuwait",
            "Germany",
            "belgium",
            "New Zeland",
            4
        )
        questionList.add((ques9))
        val ques10 = Question(
            1, "Which country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Kuwait",
            "Germany",
            "belgium",
            "New Zealand",
            3
        )
        questionList.add((ques10))
        return questionList
    }

}