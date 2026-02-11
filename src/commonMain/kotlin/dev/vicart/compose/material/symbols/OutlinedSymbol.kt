package dev.vicart.compose.material.symbols

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.OUTLINED,
        filled = false,
        tint = tint,
        modifier = modifier
    )
}

@Composable
fun OutlinedSharpSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.SHARP,
        filled = false,
        tint = tint,
        modifier = modifier
    )
}

@Composable
fun OutlinedRoundedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.ROUNDED,
        filled = false,
        tint = tint,
        modifier = modifier
    )
}