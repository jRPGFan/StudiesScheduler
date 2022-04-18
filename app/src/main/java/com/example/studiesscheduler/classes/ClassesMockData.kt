package com.example.studiesscheduler.classes

import com.example.studiesscheduler.R

class ClassesMockData {
    private val classes = arrayOf(
        Class(1, "09:30", "11:00", "Mr. Brown"),
        Class(2, "11:15", "12:45", "Mrs. Cook"),
        Class(3, "13:00", "14:30", "Mr. Robertson"),
        Class(4, "14:45", "16:15", "Mrs. Thomas"),
        Class(5, "16:30", "18:00", "Mrs. Barros")
    )
    private val icons = arrayOf(
        R.drawable.algebra,
        R.drawable.biology,
        R.drawable.chemistry,
        R.drawable.history,
        R.drawable.literature
    )
    private val classesTitles = arrayOf(
        "Algebra",
        "Biology",
        "Chemistry",
        "History",
        "Literature"
    )

    fun getClasses(): List<Class> = classes.toList()
    fun getClassTitle(index: Int): String = classesTitles[index - 1]
    fun getClassIcon(index: Int): Int = icons[index - 1]
}