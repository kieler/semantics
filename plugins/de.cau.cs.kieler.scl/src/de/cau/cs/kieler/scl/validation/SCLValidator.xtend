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
package de.cau.cs.kieler.scl.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.Label

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 * 
 * @author als
 * 
 */
class SCLValidator extends SCLJavaValidator {
     /*
     * Checks if labels are unique
     */
    @Check
    def checkUniqueLabel(SCLProgram program) {
        program.eAllContents().filter(Label).groupBy[name].forEach[name, labels|
            if (labels.size > 1) {
                labels.forEach[error("Duplicate label", it, null, -1)]
            }
        ]
    }
}