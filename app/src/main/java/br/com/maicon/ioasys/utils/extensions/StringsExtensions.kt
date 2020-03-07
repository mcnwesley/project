package br.com.maicon.ioasys.utils.extensions

fun String.isNotMail() = !this.contains("@") || !this.contains(".")
