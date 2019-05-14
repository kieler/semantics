/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.language.server

import java.lang.Thread
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author sdo
 *
 */
class CompilationThread extends Thread {
    
    @Accessors val CompilationContext context
    
    public var boolean terminated
    
    new(CompilationContext context) {
        this.context = context
        terminated = false
    }
    
    override run()  {
        this.name = "Compilation Thread"
        context.compile()
        return
    }
}