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
package de.cau.cs.kieler.prom.build

import de.cau.cs.kieler.prom.ModelImporter
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
abstract class ModelCompiler extends Configurable {
    
    public val whitelist = new ConfigurableAttribute("whitelist", null)
    public val blacklist = new ConfigurableAttribute("blacklist", null)
    
    @Accessors(PUBLIC_SETTER)
    protected var String outputFolder = "kieler-gen"
    
    @Accessors(PUBLIC_SETTER)
    protected var IProgressMonitor monitor
    
    @Accessors(PUBLIC_SETTER)
    protected var SimulationTemplateProcessor simulationProcessor
    
    abstract protected def ModelCompilationResult doCompile(IFile file, EObject model)
    
    public def ModelCompilationResult compile(IFile file, EObject model) {
        val whiteListRegex = whitelist.stringValue
        val blackListRegex = blacklist.stringValue
        if(!whiteListRegex.isNullOrEmpty && !file.location.toOSString.matches(".*"+whiteListRegex+".*")) {
            return new ModelCompilationResult
        }
        if(!blackListRegex.isNullOrEmpty && file.location.toOSString.matches(".*"+blackListRegex+".*")) {
            return new ModelCompilationResult
        }
        
        return doCompile(file, model)
    }
    
    public def void updateDependencies(DependencyGraph dependencies, List<IFile> files, ResourceSet resourceSet)
    
    new() {
        super()
    }
    
    public def void initialize(de.cau.cs.kieler.prom.kibuild.ModelCompiler config) {
        this.updateConfigurableAttributes(config.attributes)
        
        // Add simulation template processor to model compiler
        if(config.simulationProcessor != null) {
            val processor = new SimulationTemplateProcessor
            simulationProcessor = processor
            processor.initialize(config.simulationProcessor)
        }
    }
    
    /**
     * Compile a model file via KiCo. 
     * 
     * @param model model to be built
     */
    public def ModelCompilationResult compile(EObject model) {
        val file = ModelImporter.toPlatformResource(model.eResource)
        return compile(file, model)
    }
    
     /**
     * Compile a model file via KiCo. 
     * 
     * @param file file holding the model to be built
     */
    public def ModelCompilationResult compile(IFile file) {
        val model = ModelImporter.load(file)
        return compile(file, model)
    }
}