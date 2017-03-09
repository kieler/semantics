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
import de.cau.cs.kieler.scl.scl.Scope
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensionsimport de.cau.cs.kieler.scl.scl.Label

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
    
    extension SclFactory = SclFactory::eINSTANCE
    

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

         
    // M2M Mapping
    private val processedNodes = <Node> newLinkedList
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    private val nodeLabelMapping = new HashMap<Node, Label>
    
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
    def SCLProgram transformSCGToSCL(SCGraph scg) {
        processedNodes.clear
        valuedObjectMapping.clear 
        nodeLabelMapping.clear
        
        // Create new SCL program...
        val scl = createSCLProgram()
        scl.name = 'M' + scg.hashCode.toString
                  
        // ... and copy declarations.
        for(declaration : scg.declarations) {
            val newDeclaration = createDeclaration(declaration)
            newDeclaration.annotations += declaration.annotations.map[copy]
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
    
    def dispatch Scope transform(SCGraph scg, Scope scope) {
       if (scg.nodes.size == 0) return scope
       scg.nodes.head.transform(scope)
       scope
    }
       
    def dispatch Scope transform(Entry entry, Scope scope) {
        if (entry.marked) return scope
        scope.createLabel(entry)
        scope.createJump(entry.next)
        entry.next.target.transform(scope)
        scope
    }

    def dispatch Scope transform(Exit exit, Scope scope) {
        if (exit.marked) return scope
        scope.createLabel(exit)
        scope
    }

    def dispatch Scope transform(Surface surface, Scope scope) {
        if (surface.marked) return scope
        scope.createLabel(surface)
        val statement = createPause;
        scope.statements.add(statement)
        surface.depth.next.target.transform(scope)
        scope
    }
    
    def dispatch Scope transform(Depth depth, Scope scope) {
        if (depth.marked) return scope
        scope
    }
    
    def dispatch Scope transform(Assignment assignment, Scope scope) {
        if (assignment.marked) return scope
        scope.createLabel(assignment)
        val statement = createAssignment => [
            it.valuedObject = assignment.valuedObject.copyValuedObject
            it.expression = assignment.expression.copyExpression
        ]
        scope.statements.add(statement)
        assignment.next.target.transform(scope)
        scope
    }

    def dispatch Scope transform(Conditional conditional, Scope scope) {
        if (conditional.marked) return scope
        scope.createLabel(conditional)
        val statement = createConditional => [
            it.expression = conditional.condition.copyExpression
            it.statements.createJump(conditional.then)
            it.^else.createJump(conditional.getElse)
        ]
        scope.statements.add(statement)
        conditional.then.target.transform(scope)
        conditional.getElse.target.transform(scope)
        scope
    }

    def dispatch Scope transform(Fork fork, Scope scope) {
        if (fork.marked) return scope
        scope.createLabel(fork)
        val statement = createParallel => [
            for(next : fork.getAllNext) {
                val thread = createThread
                if (next.target instanceof Entry) 
                    (next.target as Entry).getThreadNodes.head.transform(thread)
                it.threads.add(thread)
            }
        ]
        scope.statements.add(statement)
        fork.join.transform(scope)
        scope
    }

    def dispatch Scope transform(Join join, Scope scope) {
        if (join.marked) return scope
        join.next.target.transform(scope)
        scope
    }
    
    def Label label(Node node) {
        return nodeLabelMapping.get(node)
    }
    
    def void createLabel(Scope scope, Node node) {
        if (!nodeLabelMapping.containsKey(node)) {
            val label = createLabel
            label.name = "node" + node.hashCode.toString
            nodeLabelMapping.put(node, label)
            scope.statements.add(label)
        }
    }
    
    def void createJump(Scope scope, ControlFlow cf) {
        val statement = createGoto => [ it.target = cf.target.label ]
        scope.statements.add(statement)
    }

    def void createJump(List<Statement> scope, ControlFlow cf) {
        val statement = createGoto => [ it.target = cf.target.label ]
        scope.add(statement)
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