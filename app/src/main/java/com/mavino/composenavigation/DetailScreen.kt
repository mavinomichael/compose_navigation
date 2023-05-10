package com.mavino.composenavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DetailScreen(text: String?) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        if (text != null) {
            Text(text = text)
        }
    }
}