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
        expression = "MaterialSymbol.Filled",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun FilledSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Filled(icon, weight, size, grade, tint, modifier)

@Deprecated(
    message = "Deprecated in favor of MaterialSymbol base object",
    replaceWith = ReplaceWith(
        expression = "MaterialSymbol.Filled.Sharp",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun FilledSharpSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Filled.Sharp(icon, weight, size, grade, tint, modifier)

@Deprecated(
    message = "Deprecated in favor of MaterialSymbol base object",
    replaceWith = ReplaceWith(
        expression = "MaterialSymbol.Filled.Rounded",
        "dev.vicart.compose.material.symbols.MaterialSymbol"
    )
)
@Composable
fun FilledRoundedSymbol(
    icon: String,
    weight: FontWeight = FontWeight.Normal,
    size: Dp = 24.dp,
    grade: Float = 0f,
    tint: Color = LocalContentColor.current,
    modifier: Modifier = Modifier
) = MaterialSymbol.Filled.Rounded(icon, weight, size, grade, tint, modifier)