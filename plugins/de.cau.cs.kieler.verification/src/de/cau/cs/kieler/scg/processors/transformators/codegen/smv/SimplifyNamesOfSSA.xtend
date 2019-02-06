/*
 * RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import javax.inject.Inject

/**
 * @author aas
 */
class SimplifyNamesOfSSA extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.simpleNames"
    }

    override getName() {
        return "Simplify SSA Names"
    }

    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension SSACoreExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension IOPreserverExtensions      
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        // Rename last version of variables to original variables (before ssa was applied)
        for (decl : scg.variableDeclarations.filter[isSSA]) {
            if (!decl.input && !decl.valuedObjects.isEmpty) {
                val lastValuedObjectVersion = decl.valuedObjects.filter[!isRegister && !isTerm].last
                val origValuedObject = decl.ssaOrigVO
                lastValuedObjectVersion.name = origValuedObject.name
            }
        }
        // Remove original declarations
        for (decl : scg.variableDeclarations.filter[!isSSA].clone) {
            scg.declarations.remove(decl)
        }
        return scg
    }
}
