package com.geektech.hw7month3

data class Rick(
    var img: Int,
    var name: String? = "неизвестно",
    var aliveOrNot: AliveOrNot? = AliveOrNot.IDK

):java.io.Serializable
