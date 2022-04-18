package com.example.studiesscheduler.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studiesscheduler.classes.ClassesAdapter
import com.example.studiesscheduler.classes.ClassesMockData
import com.example.studiesscheduler.databinding.FragmentHomeScreenBinding
import com.example.studiesscheduler.exams.ExamTimer
import com.example.studiesscheduler.homework.HomeworkAdapter
import com.example.studiesscheduler.homework.HomeworkMockData
import java.util.*

class HomeScreenFragment : Fragment() {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val classesAdapter = ClassesAdapter(ClassesMockData().getClasses())
        val homeworkAdapter = HomeworkAdapter(HomeworkMockData().getHomeworks())
        binding.classes.classesRecycler.adapter = classesAdapter
        binding.homework.homeworkRecycler.adapter = homeworkAdapter
        startTimer()
    }

    private fun startTimer() {
        val timer = Timer()
        val dayOfExam = Calendar.getInstance()
        dayOfExam.add(Calendar.DAY_OF_MONTH, 7)
        val examTimer = ExamTimer(binding, dayOfExam)
        timer.schedule(examTimer, 1000, 5000)
    }
}