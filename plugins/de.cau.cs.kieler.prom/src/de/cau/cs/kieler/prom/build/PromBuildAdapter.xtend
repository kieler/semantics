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

import de.cau.cs.kieler.prom.build.templates.TemplateProcessorListener
import de.cau.cs.kieler.prom.build.compilation.ModelCompiler
import de.cau.cs.kieler.prom.build.templates.TemplateProcessor
import de.cau.cs.kieler.prom.build.compilation.ModelCompilerListener

/**
 * Default implementation that listens to the builder and provides methods to react to to that. 
 * 
 * @author aas
 *
 */
class PromBuildAdapter implements ModelCompilerListener, TemplateProcessorListener {
    /**
     * Constructor
     * 
     * Registers this listener.
     */
    new() {
        ModelCompiler.registerListener(this)
        TemplateProcessor.registerListener(this)
    }
    
    override beforeCompilation(ModelCompiler compiler) {
    }
    
    override beforeIntermediateCompilation(ModelCompiler compiler) {
    }
    
    override afterIntermediateCompilation(ModelCompiler compiler) {
    }
    
    override afterCompilation(ModelCompiler compiler) {
    }
    
    override beforeProcessing(TemplateProcessor processor) {
    }
    
    override afterProcessing(TemplateProcessor processor) {
    }
}