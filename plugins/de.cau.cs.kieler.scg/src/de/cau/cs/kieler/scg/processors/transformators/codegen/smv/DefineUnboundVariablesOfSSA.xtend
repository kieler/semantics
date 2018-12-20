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

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import javax.inject.Inject

/**
 * @author aas
 */
class DefineUnboundVariablesOfSSA extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.defineUnbound"
    }

    override getName() {
        return "Define Unbound Variables"
    }

    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension SCGCoreExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        // Set unassigned variables to pre-value of their original variable (original ssa value)
        for (decl : scg.variableDeclarations.filter[isSSA]) {
            if (!decl.input || decl.valuedObjects.size > 1) {
                // Check if the valued object is assigned a value somewhere in the scg
                val valuedObject = decl.valuedObjects.filter[!isRegister && !isTerm && !isGO].head
                val origValuedObject = decl.ssaOrigVO
                if(valuedObject !== null && origValuedObject !== null && !valuedObject.isLeftOfAssignment(scg)) {
                    // This value represents the value of the original valued object in the last tick.
                    // Define it at beginning of control flow.
                    scg.prependAssignmentToPreOperator(valuedObject, origValuedObject)
                }
            }
        }
        return scg
    }
    
    private def void prependAssignmentToPreOperator(SCGraph scg, ValuedObject valuedObject, ValuedObject preOperand) {
        val firstScgTarget = scg.entry.next.target
        val assignment = ScgFactory.eINSTANCE.createAssignment => [
            reference = valuedObject.reference
            expression = createPreExpression(preOperand.reference)
            next = createControlFlow => [
                target = firstScgTarget
            ]
        ]
        scg.nodes.add(assignment)
        scg.entry.next = createControlFlow => [
            target = assignment
        ]
        val schedulingBlock = scg.schedulingBlocks.findFirst[it.nodes.contains(firstScgTarget)]
        schedulingBlock.nodes.add(0, assignment)
    }
    
    private def boolean isLeftOfAssignment(ValuedObject valuedObject, SCGraph scg) {
        for(assignment : scg.nodes.filter(Assignment)) {
            if(assignment.reference.valuedObject == valuedObject) {
                return true
            }
        }
        return false
    }
    
    private def Entry getEntry(SCGraph scg) {
        return scg.nodes.findFirst[it instanceof Entry] as Entry
    }
    
    private def boolean isGO(ValuedObject valuedObject) {
        return valuedObject.name == "_GO"
    }
}
