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
package de.cau.cs.kieler.sccharts.targetman.ui

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil

import static de.cau.cs.kieler.sccharts.targetman.ui.PropertyIds.*

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
                compile(element as IFile)
            }
        }

        return selection
    }

    def void compile(IFile file) {
        val compileOnSave = file.getPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID)
        val targetLanguage = file.getPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID)
        val targetPath = file.getPersistentProperty(TARGET_PATH_PROPERTY_ID)

        if (compileOnSave == null || targetLanguage == null || targetPath == null) {
            println("Can't compile SCT file '" + file.name + "'." +
                "\nSet the compilation target via right click > Set SCT Target.")

            return;
        }

        println("TODO: Compile SCT file to target")
        println("   compile on save: " + compileOnSave)
        println("   target language: " + targetLanguage)
        println("   target path: " + targetPath)
    }
}