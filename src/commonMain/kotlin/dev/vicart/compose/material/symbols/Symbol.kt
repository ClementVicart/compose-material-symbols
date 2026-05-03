package dev.vicart.compose.material.symbols

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
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
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) {
    val fontSize = with(LocalDensity.current) {
        remember(this, size) { size.toSp() }
    }

    val fontFamily = rememberMaterialSymbolFontFamily(
        wght = weight,
        fill = filled,
        opsz = size.value,
        grad = grade,
        style = style
    )

    BasicText(
        text = icon,
        maxLines = 1,
        modifier = modifier.offset(y = (-2).dp), //Custom font add extra top padding, that wrongly align with text
        style = TextStyle(
            color = tint,
            fontFamily = fontFamily,
            fontSize = fontSize,
            fontWeight = weight,
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.None
            )
        )
    )
}