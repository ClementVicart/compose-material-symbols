![Maven Central Version](https://img.shields.io/maven-central/v/dev.vicart/compose-material-symbols)
# Compose Material Symbols

This library is a **Compose Multiplatform** library that aims to facilitate the use of
the new [Google's Material Symbols](https://fonts.google.com/icons), as the old compose icons libraries
(`material-icons-[extended]`) are now deprecated.

## Table of contents

* [How to use](#how-to-use)
* [Dependency](#dependency)
  * [Kotlin Multiplatform](#kotlin-multiplatform)
  * [Android](#android)

## How to use

This library is built on top of [Symbol's variable fonts](https://developers.google.com/fonts/docs/material_symbols) and therefore allows
to customize the weight, style and size of the symbols.

Compose Material Symbols provided several Compose functions to easily displays different
styles of Material Symbols. They all take the same parameters:

```kotlin
@Composable
<Filled/Outlined>[Sharp/Rounded]Symbol(
    icon: String, // The name of the symbol, available in MaterialSymbols object
    weight: FontWeight, // The weight of the symbol,
    size: Dp, // The size of the symbol, defaults to 24dp,
    grade: Float, // The grade of the symbol, defaults to 0f
    tint: Color, // The tint color of the symbol, defaults to the current content color
    modifier: Modifier // Additional modifiers
)
```

Example:

```kotlin
@Composable
FilledSymbol(
    icon = MaterialSymbols.CLOSE,
    weight = FontWeight.Bold,
    size = 32.dp,
    tint = MaterialTheme.colorScheme.error
)
```
Will display a red bold "close" symbol ( `X` ), with a size of 32dp

> [!TIP]
> Compose Material Symbols is based on font files (.ttf) that are packed into the library binaries. When working with custom build logic that affects the resulting resources structure, make sure these files are included in your final binary, otherwise they won't show up

## Dependency

### Kotlin Multiplatform

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("dev.vicart:compose-material-symbols:1.1.0")
        }
    }
}
```

### Android

```kotlin
dependencies {
    implementation("dev.vicart:compose-material-symbols:1.1.0")
}
```
