package com.metehanbolat.adaptivelayoutcompose.screen.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    private var _items = mutableStateListOf<CustomData>()
    val items: List<CustomData> = _items

    init {
        getData()
    }

    private fun getData() {
        for (number in 0 until 10) {
            _items.add(
                element = CustomData(
                    id = number,
                    image = "https://picsum.photos/id/$number/300/300",
                    title = "#$number Lorem Ipsum",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do mirada seporitasle makro miyana, consectetur adipiscing elit, sed do mirada seporitasle makro miyana, consectetur adipiscing elit, sed do mirada seporitasle makro miyana, consectetur adipiscing elit, sed do mirada seporitasle makro miyana",
                    badges = listOf(
                        Icons.Default.Check,
                        Icons.Default.Edit,
                        Icons.Default.Face,
                        Icons.Default.Email,
                        Icons.Default.List,
                        Icons.Default.Home,
                    )
                )
            )
        }
    }
}

data class CustomData(
    val id: Int,
    val image: String,
    val title: String,
    val description: String,
    val badges: List<ImageVector>
)