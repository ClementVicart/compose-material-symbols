plugins {
    `kotlin-dsl`
    kotlin("plugin.serialization") version libs.versions.kotlin
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup:kotlinpoet:2.3.0")
    implementation(libs.kotlin.multiplatform)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
}

gradlePlugin {
    plugins {
        register("generate-symbol-name") {
            id = "dev.vicart.compose.material.symbols"
            implementationClass = "dev.vicart.compose.material.symbols.plugin.GenerateSymbolNamePlugin"
        }
    }
}