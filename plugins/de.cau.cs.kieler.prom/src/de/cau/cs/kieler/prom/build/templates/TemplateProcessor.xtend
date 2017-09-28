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
package de.cau.cs.kieler.prom.build.templates

import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.configurable.Configurable
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.templates.TemplateContext
import de.cau.cs.kieler.prom.templates.TemplateManager
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Base class for template processors.
 * 
 * @author aas
 *
 */
abstract class TemplateProcessor extends Configurable {
    /**
     * The listeners
     */
    protected static val listeners = <TemplateProcessorListener> newArrayList
    
    /**
     * The input template file. 
     */
    public val template = new ConfigurableAttribute("file")
    
    /**
     * The file to be generated.
     */
    public val target = new ConfigurableAttribute("target")
    
    /**
     * Optional progress monitor
     */
    @Accessors
    protected IProgressMonitor monitor
    
    /**
     * The project
     */
    @Accessors
    protected IProject project
    
    /**
     * The context that is used for template processing
     */
    @Accessors
    protected var TemplateContext context
    
    /**
     * The generated code from template processing
     */
    @Accessors
    protected var String generatedCode
    
    /**
     * The main method that takes care of actual processing of the input template.
     */
    abstract public def FileGenerationResult process()
    
    /**
     * Adds the listener.
     * 
     * @param listener The listener
     */
    public static def void registerListener(TemplateProcessorListener listener) {
        if(!listeners.contains(listener))
            listeners.add(listener)
    }
    
    /**
     * Removes the listener.
     * 
     * @param listener The listener
     */
    public static def void removeListener(TemplateProcessorListener listener) {
        listeners.remove(listener)
    }
    
    /**
     * Constructor
     */
    new() {
        super()
    }

    /**
     * Initializes the configurable attributes of this class.
     * Must be called from the most derived class to include the configurable attributes from all super classes.
     * 
     * @param config The configuration for this instance 
     */
    public def void initialize(de.cau.cs.kieler.prom.kibuild.TemplateProcessor config) {
        this.updateConfigurableAttributes(config.attributes)
    }
    
    /**
     * Processes the template context and notifies listeners. 
     */
    protected def void processContext() {
        // Notify listeners
        for(l : listeners)
            l.beforeProcessing(this)
        // Process
        generatedCode = TemplateManager.process(context)
        // Notify listeners
        for(l : listeners)
            l.afterProcessing(this)
    } 
}