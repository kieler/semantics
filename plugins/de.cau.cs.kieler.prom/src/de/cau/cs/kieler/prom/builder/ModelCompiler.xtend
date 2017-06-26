/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.builder

import de.cau.cs.kieler.prom.common.ModelImporter
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class ModelCompiler {
    
    @Accessors(PUBLIC_SETTER)
    public var String outputFolder = ""
    @Accessors(PUBLIC_SETTER)
    public var String fileExtension = ""
    
    @Accessors(PUBLIC_SETTER)
    protected var IProgressMonitor monitor
    
    @Accessors(PUBLIC_SETTER)
    protected var SimulationGenerator simulationGenerator
    
    public def ModelCompilationResult compile(IFile file, EObject model)
    public def void updateDependencies(DependencyGraph dependencies, List<IFile> files, ResourceSet resourceSet)
    
    public def String getName()
    
    /**
     * Compile a model file via KiCo. 
     * 
     * @param model model to be built
     */
    public def ModelCompilationResult compile(EObject model) {
        val file = ModelImporter.toPlatformResource(model.eResource)
        return compile(file, model)
    }
}