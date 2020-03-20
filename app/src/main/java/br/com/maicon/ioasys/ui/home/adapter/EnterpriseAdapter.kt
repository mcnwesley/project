package br.com.maicon.ioasys.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.maicon.ioasys.R
import kotlinx.android.synthetic.main.enterprise_card.view.*

class EnterpriseAdapter(val list: MutableList<String>, val listener: OnItemClickListener<String>) :
    RecyclerView.Adapter<EnterpriseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.enterprise_card,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bindItemView(item) {
            listener.onItemClick(item, position)
        }

    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindItemView(item: String, onItemClick: () -> Unit) {

            view.apply {
                textViewCompany.text = item
                setOnClickListener { onItemClick() }

            }
        }
    }
}