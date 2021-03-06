package com.github.droibit.stripedlist.sample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.droibit.stripedlist.sample.StripedListAdapter1.ViewHolder
import kotlinx.android.synthetic.main.list_item_striped_1.view.text

class StripedListAdapter1(
  context: Context,
  private val texts: List<String>,
  private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<ViewHolder>() {

  private val inflater = LayoutInflater.from(context)

  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ) = ViewHolder(
      itemView = inflater.inflate(R.layout.list_item_striped_1, parent, false)
  ).apply {
    itemView.setOnClickListener {
      itemClickListener.invoke(texts[adapterPosition])
    }
  }

  override fun onBindViewHolder(
    holder: ViewHolder,
    position: Int
  ) {
    holder.bind(position, texts[position])
  }

  override fun getItemCount() = texts.size

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(
      position: Int,
      text: String
    ) {
      itemView.text.text = text
      itemView.setBackgroundResource(
          if ((position % 2) == 0) R.drawable.background_list_item_light else R.drawable.background_list_item_dark
      )
    }
  }
}