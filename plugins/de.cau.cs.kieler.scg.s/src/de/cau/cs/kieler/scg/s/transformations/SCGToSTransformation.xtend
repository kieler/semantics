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
package de.cau.cs.kieler.scg.s.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.s.extensions.SExtension
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transform SCG to S
 * 
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 *  
 */
class SCGToSTransformation {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SExtension
    
    @Inject
    extension AnnotationsExtensions    

    private static val GOGUARDNAME = "_GO"
    private static val String ANNOTATION_HOSTCODE = "hostcode"    

    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    private val processedNodes = <Node, Boolean>newHashMap

    private val nodeList = <Node>newLinkedList
    private val nodeInstructionMap = <Node, List<Instruction>>newHashMap

    def Program transformSCGToS(SCGraph scg) {
        valuedObjectMapping.clear
        processedNodes.clear

        val Program sProgram = SFactory::eINSTANCE.createProgram
        sProgram.priority = 1
        sProgram.name = if (!scg.label.nullOrEmpty) scg.label else "S"
        
        val hostcodeAnnotations = scg.getStringAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            sProgram.addAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).value)
        ]   

        val timestamp = System.currentTimeMillis

        for (declaration : scg.declarations) {
            val newDeclaration = createDeclaration => [setType(declaration.type); setHostType(declaration.hostType)]
            sProgram.declarations += newDeclaration
            for (valuedObject : declaration.valuedObjects) {

                //val newValuedObject = valuedObject.copy
                val newValuedObject = createValuedObject(valuedObject.name)
                newDeclaration.valuedObjects += newValuedObject
                newValuedObject.applyAttributes(valuedObject)
                valuedObjectMapping.put(valuedObject, newValuedObject)
            }
        }

        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for S transformation finished (time used: " + (time / 1000) + "s).")

        val tickState = SFactory::eINSTANCE.createState => [
            name = "Tick"
            sProgram.states += it
        ]
        val instructionCache = <Instruction>newLinkedList

        nodeList += scg.nodes.head
        nodeInstructionMap.put(scg.nodes.head, instructionCache)

        while (!nodeList.empty) {
            val node = nodeList.head
            val instructionList = nodeInstructionMap.get(node)
            node.transform(instructionList)
            nodeList.remove(0)
            nodeInstructionMap.remove(node)
        }
        tickState.instructions += instructionCache

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("S transformation finished (time used overall: " + (time / 1000) + "s).")
        sProgram
    }

    private def dispatch void transform(Entry entry, List<Instruction> instructions) {
        if(processedNodes.get(entry) != null) return;
        processedNodes.put(entry, true)
        if (entry.next != null) {
            entry.next.target.addNode(instructions)
        }
    }

    private def dispatch void transform(Exit exit, List<Instruction> instructions) {
    }

    private def dispatch void transform(Assignment assignment, List<Instruction> instructions) {
        if(processedNodes.get(assignment) != null) return;
        processedNodes.put(assignment, true)

        if (assignment.valuedObject != null && assignment.assignment != null) {
            val sAssignment = SFactory::eINSTANCE.createAssignment
            sAssignment.variable = valuedObjectMapping.get(assignment.valuedObject)
            val expression = assignment.assignment.copyExpression.fix.fixHostCode
            sAssignment.expression = expression
            for (index : assignment.indices) {
                sAssignment.indices += index.copyExpression
            }
            instructions += sAssignment
        } else if (assignment.assignment instanceof TextExpression) {

            // This is the case when the valuedObject is null
            val hostCode = (assignment.assignment as TextExpression).text //.copy.fixHostCode as TextExpression
            instructions += hostCode.createHostCode
        } else if (assignment.assignment instanceof FunctionCall) {
            val sAssignment = SFactory::eINSTANCE.createAssignment
            sAssignment.expression = assignment.assignment.copyExpression.fix
            instructions += sAssignment
        }

        if (assignment.next != null) {
            assignment.next.target.addNode(instructions)
        }
    }

    private def dispatch void transform(Conditional conditional, List<Instruction> instructions) {
        if(processedNodes.get(conditional) != null) return;
        processedNodes.put(conditional, true)

        val sIf = SFactory::eINSTANCE.createIf
        sIf.expression = conditional.condition.copyExpression
        instructions += sIf

        if (conditional.^else != null) {
            conditional.^else.target.addNode(instructions)
        }
        if (conditional.then != null) {
            conditional.then.target.addNode(sIf.instructions)
        }

    //        if (conditional.then != null) conditional.then.target.transform(sIf.instructions)        
    //        if (conditional.^else != null) conditional.^else.target.transform(sIf.instructions)     
    }

    //	def ValuedObject findValuedObjectByName(Program s, String name) {
    //   		return valuedObjectCache.get(name)
    //    }    
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }

    def Expression copyExpression(Expression expression) {

        // Use the ecore utils to copy the expression. 
        val newExpression = expression.copy

        if (newExpression instanceof ValuedObjectReference) {

            // If it is a single object reference, simply replace the reference with the object of the target SCG.
            (newExpression as ValuedObjectReference).valuedObject = (expression as ValuedObjectReference).valuedObject.
                getValuedObjectCopy
        } else {

            // Otherwise, query all references in the expression and replace the object with the new copy
            // in the target SCG.
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[
                valuedObject = valuedObject.getValuedObjectCopy]
        }

        // Return the new expression.
        newExpression
    }

    def addNode(Node node, List<Instruction> instructionList) {
        nodeList += node
        nodeInstructionMap.put(node, instructionList)
    }

}
