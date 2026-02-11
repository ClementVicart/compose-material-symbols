package dev.vicart.compose.material.symbols

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import dev.vicart.compose.material.symbols.resources.Res
import dev.vicart.compose.material.symbols.resources.material_symbols_outlined
import dev.vicart.compose.material.symbols.resources.material_symbols_rounded
import dev.vicart.compose.material.symbols.resources.material_symbols_sharp
import org.jetbrains.compose.resources.Font

internal enum class SymbolStyle {
    ROUNDED,
    SHARP,
    OUTLINED
}

@Composable
internal fun rememberMaterialSymbolFontFamily(
    wght: FontWeight,
    fill: Boolean,
    opsz: Float,
    grad: Float,
    style: SymbolStyle
) : FontFamily {
    val fontResource = remember(style) {
        when(style) {
            SymbolStyle.ROUNDED -> Res.font.material_symbols_rounded
            SymbolStyle.OUTLINED -> Res.font.material_symbols_outlined
            SymbolStyle.SHARP -> Res.font.material_symbols_sharp
        }
    }

    val variationSettings = remember(wght, fill, opsz, grad) {
        FontVariation.Settings(
            FontVariation.Setting("wght", wght.weight.toFloat()),
            FontVariation.Setting("FILL", if(fill) 1f else 0f),
            FontVariation.Setting("GRAD", grad),
            FontVariation.Setting("opsz", opsz)
        )
    }

    val font = key(fontResource, variationSettings) {
        Font(
            resource = fontResource,
            variationSettings = variationSettings
        )
    }

    return remember(font) {
        FontFamily(font)
    }
}