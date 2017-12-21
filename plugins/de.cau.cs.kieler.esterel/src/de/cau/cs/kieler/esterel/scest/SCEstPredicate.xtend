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
package de.cau.cs.kieler.esterel.scest

import com.google.common.base.Predicate
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.esterel.SCEstStatement
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCEstPredicate implements Predicate<Object> {
    
    override apply(Object input) {
        if (input instanceof EsterelProgram) {
            return input.eAllContents.exists[
                switch (it) {
                    SCEstStatement,
                    VariableDeclaration,
                    Label,
                    Goto,
                    Conditional,
                    Parallel : true
                    default : false
                }
            ]
        }
        return false
    }
    
}