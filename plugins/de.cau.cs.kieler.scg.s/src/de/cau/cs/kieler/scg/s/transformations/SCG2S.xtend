/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
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
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
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
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.HashMap
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions

/**
 * Transform SCG to S
 * 
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 *
 */
class SCG2S extends AbstractProductionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return CodeGenerationTransformations::SCG2S_ID
    }

    override getName() {
        return CodeGenerationTransformations::SCG2S_NAME
    }

    override getProducedFeatureId() {
        return CodeGenerationFeatures::S_CODE_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension KExpressionsDeclarationExtensions

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

    def Program transform(SCGraph scg) {
        valuedObjectMapping.clear
        processedNodes.clear

        val Program sProgram = SFactory::eINSTANCE.createProgram
        sProgram.priority = 1
        sProgram.name = if (!scg.label.nullOrEmpty) scg.label else "S"
        
        val hostcodeAnnotations = scg.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            sProgram.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        
        // KITT mapping for not inplace transformations
        creationalTransformation(scg, sProgram)
        sProgram.trace(scg)
        scg.setDefaultTrace

        val timestamp = System.currentTimeMillis

//        for (declaration : scg.declarations) {
//            val newDeclaration = createDeclaration => [setType(declaration.type)]
//            sProgram.declarations += newDeclaration
//            for (valuedObject : declaration.valuedObjects) {
//
//                //val newValuedObject = valuedObject.copy
//                val newValuedObject = createValuedObject(valuedObject.name)
//                newDeclaration.valuedObjects += newValuedObject
//                newValuedObject.applyAttributes(valuedObject)
//                valuedObjectMapping.put(valuedObject, newValuedObject)
//            }
//        }
        for (declaration : scg.declarations) {
            val newDeclaration = createDeclaration(declaration).trace(declaration)
            declaration.valuedObjects.forEach[ 
                val newObject = it.copy
                newDeclaration.valuedObjects += newObject
                valuedObjectMapping.put(it, newObject)
            ]
            sProgram.declarations += newDeclaration
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
            node.translate(instructionList)
            nodeList.remove(0)
            nodeInstructionMap.remove(node)
        }
        tickState.instructions += instructionCache

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("S transformation finished (time used overall: " + (time / 1000) + "s).")
        sProgram
    }

    private def dispatch void translate(Entry entry, List<Instruction> instructions) {
        if(processedNodes.get(entry) != null) return;
        processedNodes.put(entry, true)
        if (entry.next != null) {
            entry.next.target.addNode(instructions)
        }
    }

    private def dispatch void translate(Exit exit, List<Instruction> instructions) {
    }

    private def dispatch void translate(Assignment assignment, List<Instruction> instructions) {
        if(processedNodes.get(assignment) != null) return;
        processedNodes.put(assignment, true)

        if (assignment.valuedObject != null) {
            val sAssignment = SFactory::eINSTANCE.createAssignment.trace(assignment)
            sAssignment.operator = assignment.operator
            sAssignment.valuedObject = valuedObjectMapping.get(assignment.valuedObject)
// TODO: VERIFY removal of fixHostCode            
//            val expression = assignment.assignment.copyExpression.fixHostCode     
            if (assignment.assignment != null) {       
                val expression = assignment.assignment.copyExpression
                sAssignment.expression = expression
            }
            for (index : assignment.indices) {
                sAssignment.indices += index.copyExpression
            }
            instructions += sAssignment
        } else if (assignment.assignment instanceof TextExpression) {

            // This is the case when the valuedObject is null
            val hostCode = (assignment.assignment as TextExpression).text //.copy.fixHostCode as TextExpression
            instructions += hostCode.createHostCode
        } else if (assignment.assignment instanceof FunctionCall) {
            val sAssignment = SFactory::eINSTANCE.createAssignment.trace(assignment)
            sAssignment.expression = assignment.assignment.copyExpression
            instructions += sAssignment
        }

        if (assignment.next != null) {
            assignment.next.target.addNode(instructions)
        }
    }

    private def dispatch void translate(Conditional conditional, List<Instruction> instructions) {
        if(processedNodes.get(conditional) != null) return;
        processedNodes.put(conditional, true)

        val sIf = SFactory::eINSTANCE.createIf.trace(conditional)
        sIf.expression = conditional.condition.copyExpression
        instructions += sIf

        if (conditional.^else != null) {
            conditional.^else.target.addNode(instructions)
        }
        if (conditional.then != null) {
            conditional.then.target.addNode(sIf.instructions)
        }

    //        if (conditional.then != null) conditional.then.target.translate(sIf.instructions)        
    //        if (conditional.^else != null) conditional.^else.target.translate(sIf.instructions)     
    }

    //  def ValuedObject findValuedObjectByName(Program s, String name) {
    //          return valuedObjectCache.get(name)
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