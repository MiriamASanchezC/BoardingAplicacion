package com.example.boardingapp.viewsModel

import com.example.boardingapp.data.PageData
import com.example.boardingapp.R

class MainViewBoarding {

    val items = ArrayList<PageData>()

    init {
        items.add(
            PageData(
                R.raw.page1, "Titulo 1", "Descripcion 1"
            )
        )
    }
    init {
        items.add(
            PageData(
                R.raw.page2, "Titulo 2", "Descripcion 2"
            )
        )
    }
    init {
        items.add(
            PageData(
                R.raw.page3, "Titulo 3", "Descripcion 3"
            )
        )
    }
}