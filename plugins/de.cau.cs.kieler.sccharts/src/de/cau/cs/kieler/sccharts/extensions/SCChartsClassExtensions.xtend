/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.scl.SCLFactory

/**
 * @author glu
 *
 */
class SCChartsClassExtensions {
    
    def PolicyClassDeclaration createPolicyClassDeclaration() {
        SCChartsFactory::eINSTANCE.createPolicyClassDeclaration
    }
    
    def MethodImplementationDeclaration createMethodImplementationDeclaration() {
        SCLFactory::eINSTANCE.createMethodImplementationDeclaration
    }
}