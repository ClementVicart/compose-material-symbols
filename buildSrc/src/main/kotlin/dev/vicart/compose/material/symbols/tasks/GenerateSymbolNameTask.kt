package dev.vicart.compose.material.symbols.tasks

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import dev.vicart.compose.material.symbols.model.FontMetadata
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.net.URI

abstract class GenerateSymbolNameTask : DefaultTask() {

    @get:OutputDirectory
    abstract val outDir: DirectoryProperty

    private val url = "https://fonts.google.com/metadata/icons?key=material_symbols&incomplete=true"

    private val json = Json {
        ignoreUnknownKeys = true
    }

    init {
        group = "build"
        description = "Generate symbol enums"
    }

    @TaskAction
    fun execute() {
        val connection = URI.create(url).toURL().openConnection()

        val jsonString = connection.getInputStream().use {
            it.bufferedReader().use {
                it.readText().lines().drop(1).joinToString(separator = "\n")
            }
        }

        val icons = json.decodeFromString<FontMetadata>(jsonString).icons

        val symbolIcons = icons.filter { !it.unsupported_families.contains("Material Symbols") }
            .distinctBy { it.name }

        val symbolIconClassName = ClassName("dev.vicart.compose.material.symbols", "SymbolIcon")

        val rootObj = TypeSpec.objectBuilder("MaterialSymbols").apply {
            symbolIcons.forEach {
                addProperty(
                    PropertySpec.builder(it.name.uppercase(), symbolIconClassName)
                    .getter(
                        FunSpec.getterBuilder()
                        .addStatement("return %T(%S)", symbolIconClassName, it.name.lowercase())
                        .build())
                    .build())
            }
        }
            .build()

        FileSpec.builder("dev.vicart.compose.material.symbols", "MaterialSymbols")
            .addType(rootObj)
            .build()
            .writeTo(outDir.get().asFile)
    }
}