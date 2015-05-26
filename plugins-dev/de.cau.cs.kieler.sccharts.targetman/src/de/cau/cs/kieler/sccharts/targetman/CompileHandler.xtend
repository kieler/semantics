/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.targetman

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.klighd.KiCoModelViewManager
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil

import static de.cau.cs.kieler.sccharts.targetman.PropertyIds.*
import freemarker.template.Version
import freemarker.template.Configuration
import freemarker.template.Template

/**
 * @author aas
 * 
 */
class CompileHandler extends AbstractHandler {

    override execute(ExecutionEvent event) throws ExecutionException {
        val selection = HandlerUtil.getCurrentSelection(event)
        if (selection instanceof IStructuredSelection) {
            val element = (selection as IStructuredSelection).getFirstElement()
            if (element instanceof IFile) {
                val model = KiCoModelViewManager.getModelFromModelEditor(HandlerUtil.getActiveEditor(event))
                compileToTarget(model, element as IFile)
            }
        }

        return selection
    }

    def void compileToTarget(EObject model, IFile file) {
        // Check that parameters are OK
        if (file == null || model == null) {
            println("No SCT file or model to compile!")
            return
        }

        // Load and check properties
        val compileOnSave = file.getPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID)
        val targetLanguage = file.getPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID)
        val targetPath = file.getPersistentProperty(TARGET_PATH_PROPERTY_ID)
        val templatePath = file.getPersistentProperty(TEMPLATE_PATH_PROPERTY_ID)

        if (compileOnSave == null || targetLanguage == null || targetPath == null) {
            println("Can't compile SCT file '" + file.name + "'." +
                "\nSet the compilation target via right click > Set SCT Target.")

            return;
        }

        // Compile
        val languageToTransformationIDMapping = #{"Java" -> "S2JAVA", "C" -> "S2C"}
        val transformationID = languageToTransformationIDMapping.get(targetLanguage)
        if (transformationID != null) {
            val result = KielerCompiler.compile(#[transformationID], #[], model, true, false)
            // Flush compilation result to target file
            if (result != null) {
                if (templatePath != null && templatePath != "") {
                    // Use template
                    val templateReader = new FileReader(new File(templatePath))
                    val cfg = new Configuration(new Version(2, 3, 0))
                    val template = new Template("tmp", templateReader, cfg)
                    val outputWriter = new FileWriter(new File(targetPath))
                    template.process(#{"sct_code" -> result.string}, outputWriter)
                    templateReader.close()
                    outputWriter.close()
                } else {
                    // Write directly to file
                    val writer = new PrintWriter(targetPath, "UTF-8");
                    writer.print(result.string)
                    writer.close()
                }
            }
        } else {
            println("Can't find transformationID for SCT target language '" + targetLanguage + "'.")
        }
    }

    def EObject getModelFromFile(IFile file) {
        // TODO:
        return null
    }

}