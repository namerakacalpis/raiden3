package com.hanakusoman.raiden3

import android.net.Uri

/**
 * Created by taihei on 2018/04/17.
 */
class Menu(title: String, uri: Uri) {
}

object MenuManager {
    var list: MutableList<Menu> = mutableListOf()
    fun addMenu(menu: Menu) {
        list.add(menu)
    }
}