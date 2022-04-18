package com.example.studiesscheduler.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studiesscheduler.classes.ClassesMockData
import com.example.studiesscheduler.databinding.FragmentScheduleBinding
import com.example.studiesscheduler.schedule.ScheduleAdapter

class ScheduleFragment : Fragment() {
    private lateinit var binding: FragmentScheduleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val scheduleAdapter = ScheduleAdapter(ClassesMockData().getClasses())
        binding.scheduleRecycler.adapter = scheduleAdapter
    }
}