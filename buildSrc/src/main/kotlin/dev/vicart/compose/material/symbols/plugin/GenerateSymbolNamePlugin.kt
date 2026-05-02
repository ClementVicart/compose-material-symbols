package dev.vicart.compose.material.symbols.plugin

import dev.vicart.compose.material.symbols.tasks.GenerateSymbolNameTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension

class GenerateSymbolNamePlugin : Plugin<Project> {

    override fun apply(project: Project) {

        val task = project.tasks.register<GenerateSymbolNameTask>("generateSymbolName") {
            outDir.set(project.layout.buildDirectory.dir("generated/material-symbols"))
        }

        project.kotlinExtension.sourceSets.named("commonMain") {
            kotlin.srcDir(task.flatMap { it.outDir })
        }
    }
}