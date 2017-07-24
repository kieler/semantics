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
package de.cau.cs.kieler.scg.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import com.google.inject.Inject
import com.google.inject.Injector

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class CodeGeneratorModule {
    
    @Inject protected Injector injector
        
    @Accessors val StringBuilder code = new StringBuilder
    @Accessors var String baseName = ""
    @Accessors var String prefix = ""
    @Accessors var String suffix = ""
    @Accessors var String indentation = "  "
    
    new() {
        
    }
    
    new(String baseName) {
        this.baseName = baseName       
    }
    
    
    protected def indent() {
        code.append(indentation)
    }
    
    protected def indent(int n) {
        for (i : 1..n) {
            code.append(indentation)
        }
    }
}