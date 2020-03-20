package br.com.maicon.ioasys.ui.home.adapter

import java.text.FieldPosition

interface OnItemClickListener<T> {
    fun onItemClick(item: T, position: Int)
}