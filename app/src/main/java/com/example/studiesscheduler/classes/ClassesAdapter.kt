package com.example.studiesscheduler.classes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studiesscheduler.databinding.HomeScreenClassesItemBinding

class ClassesAdapter(private val list: List<Class>) :
    RecyclerView.Adapter<ClassesAdapter.ViewHolder>() {
    private var classesData = ClassesMockData()
    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(
        parent: ViewGroup,
        private val binding: HomeScreenClassesItemBinding = HomeScreenClassesItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    ) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun bind(_class: Class) {
            binding.title.text = classesData.getClassTitle(_class.name)
            binding.icon.setImageResource(classesData.getClassIcon(_class.name))
            binding.classesTime.text = String.format("${_class.startTime} - ${_class.stopTime}")
        }
    }
}