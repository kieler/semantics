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
package de.cau.cs.kieler.scg.processors.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions

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
        // Create two lists, one for original declarations, one for ssa versions
        val ssaDeclarations = newArrayList
        val origDeclarations = newArrayList
        for(decl : scg.variableDeclarations) {
            if(decl.isSSA) {
                ssaDeclarations.add(decl)
            } else {
                origDeclarations.add(decl) 
            }
        }
        
        // Rename last version of variables to original variables (before ssa was applied)
        for (decl : ssaDeclarations) {
            if (!decl.valuedObjects.isEmpty) {
                val origValuedObject = decl.ssaOrigVO
                val lastValuedObjectVersion = decl.valuedObjects.filter[!isRegister && !isTerm].last
                lastValuedObjectVersion.name = origValuedObject.name
            }
        }
        
        // Only keep last version of variables as input / output declaration
        this.snapshot
        for (decl : ssaDeclarations) {
            if (decl.valuedObjects.size > 1) {
                if(decl.input || decl.output) {
                    // Create separate declaration for last valued object
                    val declCopy = createVariableDeclaration
                    declCopy.applyAttributes(decl)
                    declCopy.valuedObjects.add(decl.valuedObjects.last)
                    scg.declarations.add(declCopy)
                    // Remove input / output of source declaration
                    decl.input = false
                    decl.output = false
                }  
            }
        }
        
        // Remove original declarations
        for (decl : origDeclarations.filter(VariableDeclaration).filter[!(it instanceof ClassDeclaration)]) {
            scg.declarations.remove(decl)
        }
        // Remove empty declarations
        for (decl : scg.variableDeclarations.clone) {
            if(decl.valuedObjects.isEmpty) {
                 scg.declarations.remove(decl)
            }
        }
        
        // Print declarations (debugging only)
//        for(decl : scg.variableDeclarations) {
//            println('''in «decl.isInput», out: «decl.isOutput», «decl.valuedObjects.map[it.name]»''')
//        }
        return scg
    }
}
