package com.ayakashi.kitsune.fishify.models

import androidx.compose.ui.graphics.ImageBitmap

data class ShopItemModel(
    val name_Item : String = "defaulname",
    val price_Item : Long = 1000L,
    val rating_Item : Double = 5.00,
    val image_Item: ImageBitmap =
)
