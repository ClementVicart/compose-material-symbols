import org.gradle.kotlin.dsl.resources
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.multiplatform.android.library)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.gradle.maven.publish)
}

group = "dev.vicart"
version = "1.0.0"

kotlin {
    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
    }

    androidLibrary {
        compileSdk = libs.versions.compileSdk.get().toInt()
        namespace = "dev.vicart.compose.material.symbols"

        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }

        androidResources {
            enable = true
        }
    }

    wasmJs {
        outputModuleName = "compose-multiplatform-symbols"

        browser()
        d8()
        nodejs()

        binaries.library()
    }

    js {
        outputModuleName = "compose-multiplatform-symbols"

        browser()
        nodejs()

        binaries.library()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.material3)
            implementation(libs.compose.resources)
        }
    }
}

compose.resources {
    packageOfResClass = "dev.vicart.compose.material.symbols.resources"
    publicResClass = false
    generateResClass = always
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(group.toString(), project.name, version.toString())

    pom {
        name = "Compose Material Symbols"
        description = "Compose library to use the new recommended Material Symbols instead of material-icons"
        url = "https://github.com/ClementVicart/compose-material-symbols"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://raw.githubusercontent.com/ClementVicart/compose-material-symbols/refs/heads/main/LICENSE"
                distribution = "https://raw.githubusercontent.com/ClementVicart/compose-material-symbols/refs/heads/main/LICENSE"
            }
        }
        developers {
            developer {
                id = "clement-vicart"
                name = "Clément Vicart"
                url = "https://vicart.dev"
            }
        }
        scm {
            url = "https://github.com/ClementVicart/compose-material-symbols"
            connection = "scm:git:git://github.com/ClementVicart/compose-material-symbols.git"
            developerConnection = "scm:git:git://github.com/ClementVicart/compose-material-symbols.git"
        }
    }
}