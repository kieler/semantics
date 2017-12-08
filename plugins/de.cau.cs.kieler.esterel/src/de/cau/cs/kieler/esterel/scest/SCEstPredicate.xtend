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
import de.cau.cs.kieler.esterel.EsterelDeclaration
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.esterel.UnEmit
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.esterel.SCEstStatement

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCEstPredicate implements Predicate<Object> {
    
    override apply(Object input) {
        if (input instanceof EsterelProgram) {
            return input.eAllContents.filter(Statement).exists[
                switch (it) {
                    SCEstStatement: true
                    Label,
                    Goto,
                    Conditional,
                    Parallel: true
                    Module: declarations.exists[!(it instanceof EsterelDeclaration)]
                    default: false
                }
            ]
        }
        return false
    }
    
}