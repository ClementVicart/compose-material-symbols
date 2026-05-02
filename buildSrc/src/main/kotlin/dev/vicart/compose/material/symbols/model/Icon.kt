package dev.vicart.compose.material.symbols.model

import kotlinx.serialization.Serializable

@Serializable
internal data class Icon(
    val name: String,
    val unsupported_families: List<String>,
    val categories: List<String>
)
