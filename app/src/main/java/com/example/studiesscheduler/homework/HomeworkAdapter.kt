package com.example.studiesscheduler.homework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studiesscheduler.databinding.HomeScreenHomeworkItemBinding

class HomeworkAdapter(private val list: List<Homework>) :
    RecyclerView.Adapter<HomeworkAdapter.ViewHolder>() {
    private var homeworkData = HomeworkMockData()
    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(
        parent: ViewGroup,
        private val binding: HomeScreenHomeworkItemBinding = HomeScreenHomeworkItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    ) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun bind(homework: Homework) {
            binding.title.text = homeworkData.getHomeworkTitle(homework.name)
            binding.icon.setImageResource(homeworkData.getHomeworkIcon(homework.name))
            binding.homeworkDue.text = homework.due
            binding.task.text = homework.task
        }
    }
}