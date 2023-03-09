package com.ayakashi.kitsune.fishify.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.ayakashi.kitsune.fishify.models.ShopItemModel

@Composable
fun shopItem(shopItemModel: ShopItemModel) {
    Surface(

    ) {
        Column {
            Image(imageVector = shopItemModel.image_Item, contentDescription = null)


        }
    }
}

@Preview
@Composable
fun shopItemPreview() {
    shopItem(shopItemModel = ShopItemModel())
}