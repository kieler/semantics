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

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class TemplateProcessor extends Configurable {
    @Accessors
    protected IProgressMonitor monitor
    @Accessors
    protected IProject project
    
    abstract public def FileGenerationResult process()
    
    new() {
        super()
    }

    public def void initialize(de.cau.cs.kieler.prom.kibuild.TemplateProcessor config) {
        this.updateConfigurableAttributes(config.attributes)
    }
}