/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions

/** 
 * SCG to SCL Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

// This class contians all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCGToSCLTransformation {
    
    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension SCGThreadExtensions
    
    @Inject 
    extension SCLExtensions
    

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

         
    // M2M Mapping
//    private val nodeMapping = new HashMap<Node, Node>
//    private val revNodeMapping = new HashMap<Node, Node>
    private val processedNodes = <Node> newLinkedList
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
    def SCLProgram transformSCGToSCL(SCGraph scg) {
        // Create new SCL program...
        val scl = SclFactory::eINSTANCE.createSCLProgram()
        scl.name = 'M' + scg.hashCode.toString
                  
        // ... and copy declarations.
        for(declaration : scg.declarations) {
            val newDeclaration = createDeclaration(declaration)
            for (valuedObject : declaration.valuedObjects) {
            	val newValuedObject = createValuedObject(valuedObject.name)
            	newDeclaration.valuedObjects += newValuedObject
	            valuedObjectMapping.put(valuedObject, newValuedObject)
            }
            scl.declarations += newDeclaration 
        }
        
        scg.transform(scl)
        
        scl.removeSuperfluousGotos
        scl.optimizeLabels
        
        return scl;
    }
    
    def dispatch StatementSequence transform(SCGraph scg, StatementSequence sSeq) {
       if (scg.nodes.size == 0) return sSeq
       scg.nodes.head.transform(sSeq)
       sSeq
    }
       
    def dispatch StatementSequence transform(Entry entry, StatementSequence sSeq) {
        if (entry.marked) return sSeq
        sSeq.createLabel(entry.label)
        sSeq.createJump(entry.next)
        entry.next.target.transform(sSeq)
        sSeq
    }

    def dispatch StatementSequence transform(Exit exit, StatementSequence sSeq) {
        if (exit.marked) return sSeq
        sSeq.createLabel(exit.label)
        sSeq
    }

    def dispatch StatementSequence transform(Surface surface, StatementSequence sSeq) {
        if (surface.marked) return sSeq
        sSeq.createLabel(surface.label)
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createPause;
        sSeq.statements.add(statement)
        surface.depth.next.target.transform(sSeq)
        sSeq
    }
    
    def dispatch StatementSequence transform(Depth depth, StatementSequence sSeq) {
        if (depth.marked) return sSeq
        sSeq
    }
    
    def dispatch StatementSequence transform(Assignment assignment, StatementSequence sSeq) {
        if (assignment.marked) return sSeq
        sSeq.createLabel(assignment.label)
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createAssignment => [
            it.valuedObject = assignment.valuedObject.copyValuedObject
            it.expression = assignment.expression.copyExpression
        ]
        sSeq.statements.add(statement)
        assignment.next.target.transform(sSeq)
        sSeq
    }

    def dispatch StatementSequence transform(Conditional conditional, StatementSequence sSeq) {
        if (conditional.marked) return sSeq
        sSeq.createLabel(conditional.label)
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createConditional => [
            it.expression = conditional.condition.copyExpression
            it.statements.createJump(conditional.then)
            it.elseStatements.createJump(conditional.getElse)
        ]
        sSeq.statements.add(statement)
        conditional.then.target.transform(sSeq)
        conditional.getElse.target.transform(sSeq)
        sSeq
    }

    def dispatch StatementSequence transform(Fork fork, StatementSequence sSeq) {
        if (fork.marked) return sSeq
        sSeq.createLabel(fork.label)
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createParallel => [
            for(next : fork.getAllNext) {
                val thread = SclFactory::eINSTANCE.createThread
                if (next.target instanceof Entry) 
                    (next.target as Entry).getThreadNodes.head.transform(thread)
                it.threads.add(thread)
            }
        ]
        sSeq.statements.add(statement)
        fork.join.transform(sSeq)
        sSeq
    }

    def dispatch StatementSequence transform(Join join, StatementSequence sSeq) {
        if (join.marked) return sSeq
        join.next.target.transform(sSeq)
        sSeq
    }
    
    
    
    def String label(Node node) {
        "node" + node.hashCode.toString
    }
    
    def void createLabel(StatementSequence sSeq, String labelName) {
        val label = SclFactory::eINSTANCE.createEmptyStatement
        label.label = labelName
        sSeq.statements.add(label)
    }
    
    def void createJump(StatementSequence sSeq, ControlFlow cf) {
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createGoto => [ it.targetLabel = cf.target.label ]
        sSeq.statements.add(statement)
    }

    def void createJump(List<Statement> sSeq, ControlFlow cf) {
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        statement.instruction = SclFactory::eINSTANCE.createGoto => [ it.targetLabel = cf.target.label ]
        sSeq.add(statement)
    }

    def boolean marked(Node node) {       
        if (processedNodes.contains(node)) return true
        processedNodes.add(node);
        false
    }
       
    
    // Valued objects must be set according to the mapping!
    def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    // References in expressions must be corrected as well!
    def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.copyValuedObject                    
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ vor |
                vor.valuedObject = vor.valuedObject.copyValuedObject ]        
        }
        newExpression
    }

   // -------------------------------------------------------------------------   

}