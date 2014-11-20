/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.optimizations

import de.cau.cs.kieler.kico.Transformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompiler

/**
 * Deletes conditionals with constant value, unreachable nodes until all eliminated.
 * Resolves unused variables to constants
 * 
 * @author krat
 *
 */
class Optimize extends Transformation {
    
    override transform(EObject eObject, KielerCompilerContext context) {
        var scg = eObject as SCGraph
        var oldNodes = 0
        while (oldNodes != scg.nodes.length) {
            System.out.println("Iterating...")
            oldNodes = scg.nodes.length
            scg =  KielerCompiler.compile("UNUSED_VARIABLES", scg, false, false).EObject as SCGraph
            scg =  KielerCompiler.compile("CONSTCONDS", scg, false, false).EObject as SCGraph
            scg =  KielerCompiler.compile("UNREACHABLE_NODES", scg, false, false).EObject as SCGraph
        }
        scg
    }
    
}