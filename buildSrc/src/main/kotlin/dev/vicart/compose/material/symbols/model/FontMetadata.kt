package dev.vicart.compose.material.symbols.model

import kotlinx.serialization.Serializable

@Serializable
internal data class FontMetadata(
    val icons: List<Icon>
)
