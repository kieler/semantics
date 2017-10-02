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

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.templates.TemplateContext
import de.cau.cs.kieler.prom.templates.TemplateManager

/**
 * Template processor that without additional information macro calls
 * that are injected into the template before it is processed.
 * 
 * Lets Freemarker process the input template and saves the output to the target file. 
 * 
 * @author aas
 *
 */
class SimpleTemplateProcessor extends TemplateProcessor {
    /**
     * Constructor
     */
    new() {
        super()
    }
    
    /**
     * {@inheritDoc}
     */
    override process() {
        if(monitor != null) {
            monitor.subTask("Processing template '"+template.stringValue+"'")
        }
        val result = new FileGenerationResult
        // Get file handles
        val templateFile = project.getFile(template.stringValue)
        val targetFile = project.getFile(target.stringValue)
        
        // Process the template
        context = new TemplateContext(templateFile)
        // Notify listeners
        for(l : listeners)
            l.beforeProcessing(this)
        // Process
        generatedCode = TemplateManager.process(context)
        // Notify listeners
        for(l : listeners)
            l.afterProcessing(this)
        
        // Save output
        if(isCanceled) {
            return result
        }
        if(!generatedCode.isNullOrEmpty) {
            PromPlugin.createResource(targetFile, generatedCode, true)
            result.addCreatedFile(targetFile)
        }
        return result
    }
}