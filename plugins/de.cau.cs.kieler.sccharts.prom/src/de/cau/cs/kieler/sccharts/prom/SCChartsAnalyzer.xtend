/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.templates.DeclarationAnalyzer
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXResource
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class SCChartsAnalyzer extends DeclarationAnalyzer {
    
    /**
     * {@inheritDoc}
     */
    override getDependencies(EObject model) {
        val dependencies = <IFile> newArrayList
        if(model instanceof SCCharts) {
            if(model.eResource instanceof SCTXResource) {
                val sctxRes = model.eResource as SCTXResource
                val directImports = sctxRes.directImports
                for(importedFilePath : directImports.keySet) {
                    // Add file extension if needed
                    var IPath path = new Path(importedFilePath)
                    if(!(path.fileExtension == FileExtensions.SCCHART)) {
                        path = path.addFileExtension(FileExtensions.SCCHART)
                    }
                    // Get file handle of imported file
                    val modelFile = ModelImporter.toPlatformResource(sctxRes)
                    val importedFile = modelFile.parent.getFile(path)
                    dependencies.add(importedFile)
                }
            }
        }
        return dependencies
    }
    
    /**
     * {@inheritDoc}
     */
    override getDeclarations(EObject model) {
        if(model instanceof SCCharts) {
            val rootState = model.rootStates.get(0)
            if(rootState != null) {
                return rootState.declarations
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getModelName(EObject model) {
        if (model instanceof SCCharts) {
            if(!model.rootStates.isNullOrEmpty) {
                return model.rootStates.get(0).name
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #[FileExtensions.SCCHART]
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedModelTypes() {
        return #[SCCharts]
    }
    
    /**
     * {@inheritDoc}
     */
    override getDefaultCompileChain() {
        return "de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling, \n"
             + "de.cau.cs.kieler.sccharts.netlist.simple"
    }
}