/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
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
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Statement
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.StatementScope
import java.util.LinkedList
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import java.util.ArrayList
import com.google.common.collect.HashMultimap
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.SCLProgram

/** 
 * SCL to SCG Transformation 
 * 
 * @author ssm
 * @kieler.design 2014-01-27 proposed 
 * @kieler.rating 2014-01-27 proposed yellow
 */
// This class contains all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCLToSCGTransformation extends AbstractModelTransformation {

    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension SCLExtensions

    // M2M Mapping
    //    private val nodeMapping = new HashMap<Node, Node>
    //    private val revNodeMapping = new HashMap<Node, Node>
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    private val nodeMapping = new HashMap<EObject, List<Node>>()
    private val reverseNodeMapping = new HashMap<Node, EObject>()
    private val labelMapping = new HashMap<String, Node>()
    private val gotoFlows = new HashMap<Goto, List<ControlFlow>>()
    private val unmappedLabels = new LinkedList<String>

    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    override transform(EObject eObject) {
        (eObject as SCLProgram).transformSCLToSCG
    }

    /*
	 * Initialize transformation by removing double jumps and explicitly set initial values
	 */
    def SCLProgram initialize(SCLProgram scl) {
        scl.removeDoubleJumps

        // Variable initialization
        scl.declarations.forEach [
            for (valObj : valuedObjects) {
                if (valObj.initialValue != null) {
                    scl.statements.add(0,
                        SclFactory::eINSTANCE.createInstructionStatement => [
                            instruction = SclFactory::eINSTANCE.createAssignment => [
                                valuedObject = valObj
                                expression = valObj.initialValue
                            ]
                        ])
                }
            }
        ]

        scl
    }

    /*
     * Transformation method
     */
    def SCGraph transformSCLToSCG(SCLProgram scl) {

        // Create new SCG...
        val scg = ScgFactory::eINSTANCE.createSCGraph

        // ... and copy declarations.
        for (declaration : scl.declarations) {
            val newDeclaration = createDeclaration(declaration)
            for (valuedObject : declaration.valuedObjects) {
                val newValuedObject = createValuedObject(valuedObject.name)
                newDeclaration.valuedObjects += newValuedObject
                valuedObjectMapping.put(valuedObject, newValuedObject)
            }
            scg.declarations += newDeclaration
        }

        scl.transform(scg, null)
        scl.eAllContents.filter(Goto).forEach[transform(scg, gotoFlows.get(it))]

        scg
    }

    private dispatch def SCLContinuation transform(SCLProgram program, SCGraph scg, List<ControlFlow> incoming) {
        val entry = ScgFactory::eINSTANCE.createEntry.createNodeList(program) as Entry => [
            scg.nodes += it
        ]
        program.initialize
        program.statements.transform(scg, entry.createControlFlow.toList) => [ continuation |
            ScgFactory::eINSTANCE.createExit.createNodeList(program) as Exit => [
                scg.nodes += it
                it.entry = entry
                it.controlFlowTarget(continuation.controlFlows)
                labelMapping.put(continuation.label, it)
                for (l : unmappedLabels)
                    labelMapping.put(l, it)
                unmappedLabels.clear
            ]
        ]

        new SCLContinuation => []
    }

    private dispatch def SCLContinuation transform(List<Statement> statements, SCGraph scg, List<ControlFlow> incoming) {
        var cf = incoming
        var continuation = new SCLContinuation

        //    	var String label = ""
        var ArrayList<String> labelList = new ArrayList<String>()
        if (statements.size > 0) {
            for (statement : statements) {

                continuation = statement.transform(scg, cf)

                if (!continuation.label.nullOrEmpty) {
                    labelList.add(continuation.label)
                } else if (!labelList.empty && continuation.node != null) {
                    val node = continuation.node
                    labelList.forEach[labelMapping.put(it, node)]
                    labelList.clear
                }

                cf = continuation.controlFlows
            }
        } else {
            continuation.controlFlows += incoming
        }
        
        labelList.forEach[ unmappedLabels.add(it) ]

        continuation
    }

    private dispatch def SCLContinuation transform(EmptyStatement statement, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            controlFlows += incoming
            label = statement.label
        ]
    }

    private dispatch def SCLContinuation transform(InstructionStatement statement, SCGraph scg,
        List<ControlFlow> incoming) {
        if (statement.instruction instanceof Goto) {
            gotoFlows.put(statement.instruction as Goto, incoming)
            new SCLContinuation => []
        } else {
            statement.instruction.transform(scg, incoming)
        }
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.scl.Assignment assignment, SCGraph scg,
        List<ControlFlow> incoming) {
        new SCLContinuation => [
            node = ScgFactory::eINSTANCE.createAssignment.createNodeList(assignment) as Assignment => [
                scg.nodes += it
                it.assignment = assignment.expression.copyExpression
                it.valuedObject = assignment.valuedObject.copyValuedObject
                it.controlFlowTarget(incoming)
            ]
            controlFlows += node.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.scl.Conditional conditional, SCGraph scg,
        List<ControlFlow> incoming) {
        new SCLContinuation => [ continue |
            continue.node = ScgFactory::eINSTANCE.createConditional.createNodeList(conditional) as Conditional => [
                scg.nodes += it
                it.condition = conditional.expression.copyExpression
                it.controlFlowTarget(incoming)
                conditional.statements.transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
                conditional.elseStatements.transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
            ]
        ]
    }

    private dispatch def SCLContinuation transform(Parallel parallel, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [ cont |
            val fork = ScgFactory::eINSTANCE.createFork.createNodeList(parallel) as Fork => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
            ]
            val join = ScgFactory::eINSTANCE.createJoin.createNodeList(parallel) as Join => [
                scg.nodes += it
                it.fork = fork
            ]
            parallel.threads.forEach [
                val forkFlow = fork.createControlFlow
                val threadEntry = ScgFactory::eINSTANCE.createEntry.createNodeList(it) => [
                    scg.nodes += it
                    it.controlFlowTarget(forkFlow.toList)
                ]
                val continuation = it.statements.transform(scg, threadEntry.createControlFlow.toList)
                ScgFactory::eINSTANCE.createExit.createNodeList(it) => [
                    (it as Exit).entry = threadEntry as Entry
                    scg.nodes += it
                    it.controlFlowTarget(continuation.controlFlows)
                    it.createControlFlow.setTarget(join)
                    if (!continuation.label.nullOrEmpty) {
                        labelMapping.put(continuation.label, it)
                    }
                    for (l : unmappedLabels)
                        labelMapping.put(l, it)
                    unmappedLabels.clear
                    
                ]
            ]
            cont.node = fork
            cont.controlFlows += join.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(Pause pause, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            val surface = ScgFactory::eINSTANCE.createSurface.createNodeList(pause) as Surface => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
            ]
            node = ScgFactory::eINSTANCE.createDepth.createNodeList(pause) as Depth => [
                scg.nodes += it
                it.surface = surface
            ]
            controlFlows += node.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(Goto goto, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            if (labelMapping.keySet.contains(goto.targetLabel)) {
                val node = labelMapping.get(goto.targetLabel)
                if (node instanceof Depth) {
                    (node as Depth).surface.controlFlowTarget(incoming)
                } else {
                    node.controlFlowTarget(incoming)
                }
            }
        ]
    }

    // Valued objects must be set according to the mapping!
    private def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }

    // References in expressions must be corrected as well!
    private def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = (expression as ValuedObjectReference).valuedObject.
                copyValuedObject
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[vor|
                vor.valuedObject = vor.valuedObject.copyValuedObject]
        }
        newExpression
    }

    private def Node createNodeList(Node node, EObject eObject) {
        if (!nodeMapping.keySet.contains(eObject)) {
            nodeMapping.put(eObject, <Node>newArrayList(node))
        } else {
            node.addNode(eObject)
        }
        reverseNodeMapping.put(node, eObject)
        node
    }

    private def List<Node> getNodeList(EObject eObject) {
        nodeMapping.get(eObject)
    }

    private def Node addNode(Node node, EObject eObject) {
        node => [eObject.nodeList.add(it)]
    }

    private def Node controlFlowTarget(Node node, List<ControlFlow> controlFlows) {
        node => [n|controlFlows.forEach[target = n]]
    }

    private def List<ControlFlow> toList(ControlFlow controlFlow) {
        <ControlFlow>newArrayList(controlFlow)
    }

// -------------------------------------------------------------------------   
}
