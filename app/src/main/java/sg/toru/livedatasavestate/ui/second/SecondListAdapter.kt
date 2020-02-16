package sg.toru.livedatasavestate.ui.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import sg.toru.livedatasavestate.R
import sg.toru.livedatasavestate.databinding.ItemSecondLayoutBinding

class SecondListAdapter(private val list:List<String>):RecyclerView.Adapter<SecondListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondListViewHolder {
        val binding = DataBindingUtil.inflate<ItemSecondLayoutBinding>(LayoutInflater.from(parent.context), R.layout.item_second_layout, parent, false)
        return SecondListViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SecondListViewHolder, position: Int) {
        holder.bindData(list[position])
    }
}

class SecondListViewHolder(private val binding:ItemSecondLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bindData(str:String){
        binding.item = str
        binding.executePendingBindings()
    }
}
