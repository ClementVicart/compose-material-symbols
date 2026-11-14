package dev.vicart.compose.material.symbols

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private const val FONT_PADDING_RATIO = 1.2f

@Composable
fun Symbol(
    icon: SymbolIcon,
    size: Dp = 24.dp,
    filled: Boolean,
    weight: FontWeight,
    grade: Float = 0f,
    style: SymbolStyle,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) {

    val fontFamily = rememberMaterialSymbolFontFamily(
        wght = weight,
        fill = filled,
        opsz = size.value,
        grad = grade,
        style = style
    )

    BasicText(
        text = icon.symbolName,
        maxLines = 1,
        modifier = modifier.scale(FONT_PADDING_RATIO),
        style = TextStyle(
            color = tint,
            fontFamily = fontFamily,
            fontSize = with(LocalDensity.current) { (size.value / FONT_PADDING_RATIO).dp.toSp() },
            fontWeight = weight,
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.Both
            )
        )
    )
}