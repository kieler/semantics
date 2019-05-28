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
package de.cau.cs.kieler.esterel.providers

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.SCEstStatement
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.registration.IModelInformationProvider
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Assignment

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelModelInformationProvider implements IModelInformationProvider {
    
    override getResourceExtension(Object model) {
        if (model instanceof EsterelProgram) {
            if (model.eAllContents.exists[
                switch (it) {
                    SCEstStatement,
                    VariableDeclaration,
                    Label,
                    Goto,
                    Conditional,
                    ScopeStatement,
                    Parallel,
                    Assignment : true
                    default : false
                }
            ]) {
                return "scest"
            } else {
                return "strl"
            }
        }
        return null
    }
    
}
