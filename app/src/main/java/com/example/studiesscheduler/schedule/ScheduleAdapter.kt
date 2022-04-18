package com.example.studiesscheduler.schedule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studiesscheduler.R
import com.example.studiesscheduler.classes.ClassesMockData
import com.example.studiesscheduler.databinding.ScheduleScreenClassItemBinding
import com.example.studiesscheduler.classes.Class

class ScheduleAdapter(private val scheduleList: List<Class>) :
    RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {
    var classesData = ClassesMockData()
    override fun getItemCount() = scheduleList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(scheduleList[position], position)
    }

    inner class ViewHolder(
        parent: ViewGroup,
        private val binding: ScheduleScreenClassItemBinding = ScheduleScreenClassItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(_class: Class, position: Int) {
            when (position) {
                0 -> binding.scrollerIcon.setImageResource(R.drawable.schedule_scroller_top)
                scheduleList.size - 1 -> binding.scrollerIcon.setImageResource(R.drawable.schedule_scroller_bottom)
                else -> binding.scrollerIcon.setImageResource(R.drawable.schedule_scroller_middle)
            }
            binding.title.text = classesData.getClassTitle(_class.name)
            binding.icon.setImageResource(classesData.getClassIcon(_class.name))
            binding.classesTime.text = String.format("${_class.startTime} - ${_class.stopTime}")
            binding.teacher.append(" " + _class.teacher)
        }
    }
}