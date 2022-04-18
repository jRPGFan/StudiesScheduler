package com.example.studiesscheduler.homework

import com.example.studiesscheduler.R

class HomeworkMockData {
    private val homeworks = arrayOf(
        Homework(1, "2 days left", "Find out what al gee bruh is"),
        Homework(2, "3 days left", "Dissect a frog, maybe? Or not"),
        Homework(3, "4 days left", "Don't sniff from the vile directly!"),
        Homework(4, "5 days left", "Find some fun stories to tell"),
        Homework(5, "6 days left", "Pick up a book or something")
    )
    private val homeworkIcons = arrayOf(
        R.drawable.algebra,
        R.drawable.biology,
        R.drawable.chemistry,
        R.drawable.history,
        R.drawable.literature
    )
    private val homeworkTitles = arrayOf(
        "Algebra",
        "Biology",
        "Chemistry",
        "History",
        "Literature"
    )

    fun getHomeworks(): List<Homework> = homeworks.toList()
    fun getHomeworkTitle(index: Int): String = homeworkTitles[index - 1]
    fun getHomeworkIcon(index: Int): Int = homeworkIcons[index - 1]
}