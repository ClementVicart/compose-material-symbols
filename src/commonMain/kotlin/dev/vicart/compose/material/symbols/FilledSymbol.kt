package dev.vicart.compose.material.symbols

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun FilledSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.OUTLINED,
        filled = true
    )
}

@Composable
fun FilledSharpSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.SHARP,
        filled = true
    )
}

@Composable
fun FilledRoundedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    modifier: Modifier = Modifier
) {
    Symbol(
        icon = icon,
        weight = weight,
        size = size,
        grade = grade,
        style = SymbolStyle.ROUNDED,
        filled = true
    )
}