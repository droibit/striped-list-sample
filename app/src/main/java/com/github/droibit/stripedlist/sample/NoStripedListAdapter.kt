package com.github.droibit.stripedlist.sample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.droibit.stripedlist.sample.NoStripedListAdapter.ViewHolder
import kotlinx.android.synthetic.main.list_item_nostriped.view.text

class NoStripedListAdapter(
  context: Context,
  private val texts: List<String>,
  private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<ViewHolder>() {

  private val inflater = LayoutInflater.from(context)

  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ) = ViewHolder(
      itemView = inflater.inflate(R.layout.list_item_nostriped, parent, false)
  ).apply {
    itemView.setOnClickListener {
      itemClickListener.invoke(texts[adapterPosition])
    }
  }

  override fun onBindViewHolder(
    holder: ViewHolder,
    position: Int
  ) {
    holder.bind(texts[position])
  }

  override fun getItemCount() = texts.size

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(
      text: String
    ) {
      itemView.text.text = text
    }
  }
}