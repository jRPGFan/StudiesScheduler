package com.example.studiesscheduler.exams

import com.example.studiesscheduler.databinding.FragmentHomeScreenBinding
import java.text.SimpleDateFormat
import java.util.*

class ExamTimer(var binding: FragmentHomeScreenBinding, var dayOfExam: Calendar) : TimerTask() {
    var timer = binding.timer

    override fun run() {
        val timeToExam = dayOfExam.timeInMillis - Date().time
        val dateFormatter = SimpleDateFormat("dd:HH:mm", Locale.getDefault())
        val timeToExamStringArray = dateFormatter.format(timeToExam).split(":")
        binding.timer.textTimer.post {
            timer.timerDays1.text = timeToExamStringArray[0][0].toString()
            timer.timerDays2.text = timeToExamStringArray[0][1].toString()
            timer.timerHours1.text = timeToExamStringArray[1][0].toString()
            timer.timerHours2.text = timeToExamStringArray[1][1].toString()
            timer.timerMinutes1.text = timeToExamStringArray[2][0].toString()
            timer.timerMinutes2.text = timeToExamStringArray[2][1].toString()
        }
    }
}