/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.codegen

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule

/**
 * The SCGCodeGeneratorModule allows specific configuration for SCG code generators
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class SCGCodeGeneratorModule extends CodeGeneratorModule<SCGraphs, SCGraph> {
    
    def SCGraphs getSCGraphs() {
        return rootObject
    }
    
    def SCGraph getScg() {
        return moduleObject
    } 
    
}