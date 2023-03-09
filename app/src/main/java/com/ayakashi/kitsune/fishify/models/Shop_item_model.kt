package com.ayakashi.kitsune.fishify.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class ShopItemModel(
    val name_Item : String = "defaultname",
    val price_Item : Double = 20.00,
    val rating_Item : Double = 5.00,
    val image_Item: ImageVector = Icons.Rounded.Person
)
