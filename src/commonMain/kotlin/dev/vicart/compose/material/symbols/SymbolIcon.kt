package dev.vicart.compose.material.symbols

import kotlin.jvm.JvmInline

/**
 * String value wrapper for icon names. Useful for type-safety
 * Use [MaterialSymbols] to get the icon
 */
@JvmInline
value class SymbolIcon internal constructor(val symbolName: String)