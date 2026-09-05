![Maven Central Version](https://img.shields.io/maven-central/v/dev.vicart/compose-material-symbols)
# Compose Material Symbols

This library is a **Compose Multiplatform** library that aims to facilitate the use of
the new [Google's Material Symbols](https://fonts.google.com/icons), as the old compose icons libraries
(`material-icons-[extended]`) are now deprecated. 

It supports all major Compose Multiplatform targets: **Android**, **JVM**, **iOS**, **JS**, and **Wasm**.

## Table of contents

* [How to use](#how-to-use)
* [Dependency](#dependency)
  * [Kotlin Multiplatform](#kotlin-multiplatform)
  * [Android](#android)

## How to use

This library is built on top of [Symbol's variable fonts](https://developers.google.com/fonts/docs/material_symbols) and therefore allows
to customize the weight, style and size of the symbols.

Compose Material Symbols provides a unified `MaterialSymbol` object to easily display different
styles of Material Symbols. The composable functions all take the same parameters:

```kotlin
@Composable
MaterialSymbol.<Filled/Outlined>[.Sharp/.Rounded](
    icon: String, // The name of the symbol (e.g., "close", "home")
    weight: FontWeight, // The weight of the symbol, defaults to FontWeight.Normal
    size: Dp, // The size of the symbol, defaults to 24dp
    grade: Float, // The grade of the symbol, defaults to 0f
    tint: Color, // The tint color of the symbol, defaults to the current content color
    modifier: Modifier // Additional modifiers
)
```

Example:

```kotlin
@Composable
MaterialSymbol.Filled(
    icon = "close",
    weight = FontWeight.Bold,
    size = 32.dp,
    tint = MaterialTheme.colorScheme.error
)
```
Will display a red bold "close" symbol ( `X` ), with a size of 32dp.

> [!NOTE]
> The older standalone composables like `FilledSymbol(...)` or `OutlinedRoundedSymbol(...)` are now deprecated in favor of the unified `MaterialSymbol` API.

> [!TIP]
> Compose Material Symbols is based on font files (.ttf) that are packed into the library binaries. When working with custom build logic that affects the resulting resources structure, make sure these files are included in your final binary, otherwise they won't show up.

## Dependency

### Kotlin Multiplatform

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("dev.vicart:compose-material-symbols:1.1.6")
        }
    }
}
```

### Android

```kotlin
dependencies {
    implementation("dev.vicart:compose-material-symbols:1.1.6")
}
```
