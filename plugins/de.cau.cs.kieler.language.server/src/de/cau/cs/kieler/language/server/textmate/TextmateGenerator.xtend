/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.textmate

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.core.ls.IHighlighting
import de.cau.cs.kieler.klighd.lsp.launch.Language
import de.cau.cs.kieler.language.server.registration.RegistrationLanguageServerExtension
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.text.ParseException
import java.util.List

/**
 * Generates Textmate grammars for all languages that are registered to be used in the language server.
 * Keywords are provided via the {@link IHighlighting IHighlighting} service interface and
 * a static implementation for the pragmatics languages.
 * 
 * The application should be given an output path that leads to the root directory of a VSCode extension.
 * A relative path begins in the language.server plugin. Therefore, if a vscode-extension is direction next to the
 * semantics folder, the path should be ./../../../vscode-extension
 * 
 * @author sdo
 *
 */
class TextmateGenerator {
    
    def static void main(String[] args) {
        // Get command line parameter
        if (args.size != 1) {
            throw new IllegalArgumentException("Expecting path to VSCode extension as argument.")
        }
        val String pathToOutput = args.get(0)
        
        
        val RegistrationLanguageServerExtension languageRegistration = new RegistrationLanguageServerExtension();

        val List<String> patternKeywords = #["keywords", "strings", "annotations", "constants-and-special-vars"]

        try {     
            val JsonObject packageJson = JsonParser.parseReader(new FileReader(pathToOutput + "package.json")).
                asJsonObject;
            
            var JsonObject contributes = new JsonObject
            if (packageJson.has("contributes")) {
                contributes = packageJson.get("contributes").asJsonObject
            } else {
                packageJson.add("contributes", contributes)
            }
            val JsonArray languageRegistrations = new JsonArray
            val JsonArray grammarRegistrations = new JsonArray
            
            contributes.add("languages", languageRegistrations)
            contributes.add("grammars", grammarRegistrations)

            // Get all languages
            for (Language language : languageRegistration.languageExtensions) {
                val JsonObject textmateJson = new JsonObject
                textmateJson.add("$schema",
                    new JsonPrimitive("https://raw.githubusercontent.com/martinring/tmlanguage/master/tmlanguage.json"))
                
                textmateJson.add("name", new JsonPrimitive(language.name))
                
                textmateJson.add("scopeName", new JsonPrimitive("text." + language.id))
                
                val JsonArray patterns = new JsonArray
                for (patternKey : patternKeywords) {
                    val JsonObject pattern = new JsonObject
                    pattern.add("include", new JsonPrimitive("#" + patternKey))
                    patterns.add(pattern)
                }
                textmateJson.add("patterns", patterns)
                
                val JsonObject repository = new JsonObject
                repository.add(patternKeywords.get(0), generateKeywords(language))
                repository.add(patternKeywords.get(1), generateStrings(language.id))
                repository.add(patternKeywords.get(2), generateAnnotations(language.id))
                repository.add(patternKeywords.get(3), generateConstants(language.id))
                textmateJson.add("repository", repository)
                                
                // Write textmate grammar
                val File textmateFile = new File(pathToOutput + "syntaxes/" + language.id + ".tmLanguage.json");                        
                val FileWriter textmateWriter = new FileWriter(textmateFile);
                val Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(textmateJson, textmateWriter);
                textmateWriter.flush()
                textmateWriter.close()
                
                // Add language to registration
                val JsonObject languageJson = new JsonObject
                
                languageJson.add("id", new JsonPrimitive(language.id))
                
                val JsonArray aliases = new JsonArray
                aliases.add(language.name)
                aliases.add(language.id)
                languageJson.add("aliases", aliases)
                
                val JsonArray extensions = new JsonArray
                extensions.add(language.id)
                languageJson.add("extensions", extensions)
                
                languageJson.add("configuration", new JsonPrimitive("./language-configuration.json"))
                
                // Add registration for package.json
                languageRegistrations.add(languageJson)
                
                // Add simple grammar to registration
                val JsonObject grammarJson = new JsonObject
                
                grammarJson.add("language", new JsonPrimitive(language.id))
                grammarJson.add("scopeName", new JsonPrimitive("text." + language.id))
                grammarJson.add("path", new JsonPrimitive("./syntaxes/" + language.id + ".tmLanguage.json"))
                
                grammarRegistrations.add(grammarJson)
            }
            
            // Write language registration stubs to package.json
            val FileWriter packageJsonWriter = new FileWriter(pathToOutput + "package.json")
            val Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(packageJson, packageJsonWriter);
            packageJsonWriter.flush()
            packageJsonWriter.close()
        } catch (FileNotFoundException e) {
            println("Invalid path vscode extension: ./../../../ leads outside the semantics repository.")
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    def static JsonObject generateKeywords(Language language) {
        val JsonObject keywords = new JsonObject
        val JsonArray patterns = new JsonArray
        val JsonObject pattern = new JsonObject
        pattern.add("name", new JsonPrimitive("keyword.control." + language.id))
        pattern.add("match", new JsonPrimitive("\\b(" + generateKeywordString(language.keywords) + ")\\b"))
        patterns.add(pattern)
        keywords.add("patterns", patterns)
        return keywords
    }
    
    def static String generateKeywordString(List<String> keywords) {
        return keywords.fold("", [keys, key| if (keys != "") keys + "|" + key else key])
    }
    
    def static JsonObject generateStrings(String id) {
        val JsonObject strings = new JsonObject
        strings.add("name", new JsonPrimitive("string.quoted.double." + id))
        strings.add("begin", new JsonPrimitive("\""))
        strings.add("end", new JsonPrimitive("\""))
        val JsonArray patterns = new JsonArray
        val JsonObject pattern = new JsonObject
        pattern.add("name", new JsonPrimitive("constant.character.escape." + id))
        pattern.add("match", new JsonPrimitive("."))
        patterns.add(pattern)
        strings.add("patterns", patterns)
        return strings
    }
    
    def static JsonObject generateAnnotations(String id) {
        val JsonObject annotations = new JsonObject
        val JsonArray patterns = new JsonArray
        val JsonObject pattern = new JsonObject
        pattern.add("name", new JsonPrimitive("storage.type.annotation." + id))
        pattern.add("match", new JsonPrimitive("@\\w*"))
        patterns.add(pattern)
        annotations.add("patterns", patterns)
        return annotations
    }
    
    /**
     * Taken from java textmate grammar constants.
     * @see <a href="https://github.com/microsoft/vscode-textmate/blob/main/test-cases/themes/syntaxes/java.json">java.json</a>
     */
    def static JsonObject generateConstants(String id) {
        val JsonObject constants = new JsonObject
        val JsonArray patterns = new JsonArray
        
        val JsonObject booleanPattern = new JsonObject
        booleanPattern.add("name", new JsonPrimitive("constant.language." + id))
        booleanPattern.add("match", new JsonPrimitive("\\b(true|false)\\b"))
        patterns.add(booleanPattern)
        
        val JsonObject integerPattern = new JsonObject
        integerPattern.add("name", new JsonPrimitive("constant.numeric.integer." + id))
        integerPattern.add("match", new JsonPrimitive("\\b(0|[1-9]([0-9_]*[0-9])?)[lL]?(?!\\w|\\.)"))
        patterns.add(integerPattern)
        
        val JsonObject floatPattern = new JsonObject
        floatPattern.add("name", new JsonPrimitive("constant.numeric.float." + id))
        floatPattern.add("match", new JsonPrimitive(
            "(?x)\n\t\t\t\t\t\t(?<!\\w)\t\t\t\t\t\t\t\t\t\t\t# Ensure word boundry"
            + "\n\t\t\t\t\t\t(?>\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t(0|[1-9]([0-9_]*[0-9])?)\t\t\t\t# Leading digits"
            + "\n\t\t\t\t\t\t\t\t(?=[eEfFdD.])\t\t\t\t\t\t\t# Allow for numbers without ."
            + "\n\t\t\t\t\t\t\t)?\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t(?<=[0-9])(?=[eEfFdD])\t\t\t\t\t# Allow for numbers without ."
            + "\n\t\t\t\t\t\t\t  | \\.\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t[0-9]([0-9_]*[0-9])?\t\t\t\t\t# Numbers after ."
            + "\n\t\t\t\t\t\t\t)?\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t[eE][+-]?(0|[1-9]([0-9_]*[0-9])?)\t\t# Exponent"
            + "\n\t\t\t\t\t\t\t)?\n\t\t\t\t\t\t\t[fFdD]?\t\t\t\t\t\t\t\t\t\t# Float Type Suffix"
            + "\n\t\t\t\t\t\t)\n\t\t\t\t\t\t(?!\\w)\t\t\t\t\t\t\t\t\t\t\t# Ensure word boundry"
            + "\n\t\t\t\t\t"))
        patterns.add(floatPattern)
        
        constants.add("patterns", patterns)
        return constants
    }
}