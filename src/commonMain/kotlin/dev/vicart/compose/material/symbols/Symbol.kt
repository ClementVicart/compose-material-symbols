package dev.vicart.compose.material.symbols

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
internal fun Symbol(
    icon: String,
    size: Dp = 24.dp,
    filled: Boolean,
    weight: FontWeight,
    grade: Float = 0f,
    style: SymbolStyle,
    modifier: Modifier = Modifier
) {
    val fontFamily = rememberMaterialSymbolFontFamily(
        wght = weight,
        fill = filled,
        opsz = size.value,
        grad = grade,
        style = style
    )

    Text(
        text = icon,
        modifier = modifier,
        fontFamily = fontFamily,
        fontSize = with(LocalDensity.current) { size.toSp() }
    )
}