package dev.vicart.compose.material.symbols

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Deprecated(
    message = "Deprecated in favor of MaterialSymbol base object",
    replaceWith = ReplaceWith(
        expression = "MaterialSymbol.Outlined",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun OutlinedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Outlined(icon, weight, size, grade, tint, modifier)

@Deprecated(
    message = "Deprecated in favor of MaterialSymbol base object",
    replaceWith = ReplaceWith(
        expression = "MaterialSymbol.Outlined.Sharp",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun OutlinedSharpSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Outlined.Sharp(icon, weight, size, grade, tint, modifier)

@Deprecated(
    message = "Deprecated in favor of MaterialSymbol base object",
    replaceWith = ReplaceWith(
        expression = "MaterialSymbol.Outlined.Rounded",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun OutlinedRoundedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Outlined.Rounded(icon, weight, size, grade, tint, modifier)