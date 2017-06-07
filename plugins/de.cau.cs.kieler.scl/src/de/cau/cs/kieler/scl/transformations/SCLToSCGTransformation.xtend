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
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
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
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.scl.features.SCLFeatures
import java.util.Set
import com.google.common.collect.Sets
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Scope
import de.cau.cs.kieler.kitt.tracing.Traceable
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.annotations.AnnotationsFactory

/** 
 * SCL to SCG Transformation 
 * 
 * @author ssm, cmot
 * @kieler.design 2014-01-27 proposed 
 * @kieler.rating 2014-01-27 proposed yellow
 */
// This class contains all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCLToSCGTransformation extends AbstractProductionTransformation implements Traceable {

    private static val String ANNOTATION_HOSTCODE = "hostcode"
    private static val String ANNOTATION_CONTROLFLOWTHREADPATHTYPE = "cfPathType"

    @Inject
    extension SCGControlFlowExtensions 
    
    @Inject
    extension SCGThreadExtensions    

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension SCLExtensions
    
    extension ScgFactory = ScgFactory::eINSTANCE
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE

    override getProducedFeatureId() {
        return SCGFeatures::BASIC_ID
    }
    
    override getId() {
        return SCLTransformations::SCG_ID
    }
    
    
        /**
     * {@inheritDoc}
     */
    override Set<String> getRequiredFeatureIds() {
        return Sets.newHashSet(SCLFeatures.BASIC_ID)
    }
    
    

    // M2M Mapping
    //    private val nodeMapping = new HashMap<Node, Node>
    //    private val revNodeMapping = new HashMap<Node, Node>
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    private val nodeMapping = new HashMap<EObject, List<Node>>()
    private val reverseNodeMapping = new HashMap<Node, EObject>()
    private val labelMapping = new HashMap<Label, Node>()
    private val gotoFlows = new HashMap<Goto, List<ControlFlow>>()
    private val unmappedLabels = new LinkedList<Label>

    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    override transform(EObject eObject) {
        (eObject as SCLProgram).transformSCLToSCG
    }

    /*
	 * Initialize transformation by removing double jumps and explicitly set initial values
	 * Removes local declarations (StatementScopes)
	 */
    def SCLProgram initialize(SCLProgram program) {
        program.removeDoubleJumps
        program.removeLocalDeclarations
        program.removeRedundantForks

        // Variable initialization
        program.declarations.forEach [
            for (valObj : valuedObjects) {
                if (valObj.initialValue != null) {
                    program.statements.add(0,
                        SclFactory::eINSTANCE.createAssignment => [
                            it.trace(valObj)
                            valuedObject = valObj
                            expression = valObj.initialValue
                        ])
                }
            }
        ]

        program
    }
    
    /*
     * Transformation method
     */
    def SCGraph transformSCLToSCG(SCLProgram program) {
    	program.initialize

        // Create new SCG...
        val scg = createSCGraph
        creationalTransformation(program, scg)

        // ... and copy declarations.
        for (declaration : program.declarations) {
            val newDeclaration = createDeclaration(declaration).trace(declaration)
            newDeclaration.annotations.addAll(declaration.annotations.map[copy])
            for (valuedObject : declaration.valuedObjects) {
                val newValuedObject = createValuedObject(valuedObject.name).trace(valuedObject)
                newDeclaration.valuedObjects += newValuedObject
                valuedObjectMapping.put(valuedObject, newValuedObject)
            }
            scg.declarations += newDeclaration
        }

        program.transform(scg, null)
        program.eAllContents.filter(Goto).forEach[transform(scg, gotoFlows.get(it))]

        scg.removeSuperflousConditionals
        
        val hostcodeAnnotations = program.annotations.filter(typeof(StringAnnotation)).filter[ name == ANNOTATION_HOSTCODE ] 
        hostcodeAnnotations.forEach [
            scg.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]        
        
        val threadPathTypes = (scg.nodes.head as Entry).getThreadControlFlowTypes
        for (entry : threadPathTypes.keySet) {
            if (!entry.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE))
                entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(entry).toString2)
        }             

        scg
    }
    
    
    // Removes conditional nodes that have the same target for the then and the else branch.
    private def removeSuperflousConditionals(SCGraph scg) {
        val toDelete = <Conditional>newLinkedList
        for (conditional : scg.eAllContents.filter(typeof(Conditional)).toList) {
            if (conditional.^else.target == conditional.then.target) {
                toDelete += conditional
                for (previous : conditional.incoming.immutableCopy) {
                    previous.target = conditional.^else.target
                }
            }
        }
        toDelete.forEach[it.remove]
    }
    

    private dispatch def SCLContinuation transform(SCLProgram program, SCGraph scg, List<ControlFlow> incoming) {
        val entry = createEntry.trace(program).createNodeList(program) as Entry => [
            scg.nodes += it
        ]
        program.statements.transform(scg, entry.createControlFlow.toList) => [ continuation |
            createExit.trace(program).createNodeList(program) as Exit => [
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
        val labelList = new ArrayList<Label>()
        if (statements.size > 0) {
            for (statement : statements) {

                continuation = statement.transform(scg, cf)

                if (continuation.label != null) {
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

    private dispatch def SCLContinuation transform(Label l, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [
            controlFlows += incoming
            label = l
        ]
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.scl.Assignment assignment, SCGraph scg,
        List<ControlFlow> incoming) {
        if (assignment.hasAnnotation("IS_JOIN")) {
            new SCLContinuation => [ cont |
                val join = createJoin.trace(assignment).createNodeList(assignment) as Join => [
                    scg.nodes += it
                    it.controlFlowTarget(incoming)
                    it.incoming.forEach[
                        annotations += createAnnotation => [
                            name = SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION
                        ]
                    ]
                ]
                cont.node = join
                cont.controlFlows += join.createControlFlow
            ]    
        } else {
            new SCLContinuation => [
                node = createAssignment.trace(assignment).createNodeList(assignment) as Assignment => [
                    scg.nodes += it
                    it.expression = assignment.expression.copyExpression
                    it.valuedObject = assignment.valuedObject.copyValuedObject
                    it.controlFlowTarget(incoming)
                    for(annotation : assignment.annotations) {
                        it.annotations += annotation.copy
                    }
                ]
                controlFlows += node.createControlFlow
            ]
        }
    }

    private dispatch def SCLContinuation transform(de.cau.cs.kieler.scl.scl.Conditional conditional, SCGraph scg,
        List<ControlFlow> incoming) {
        new SCLContinuation => [ continue |
            continue.node = createConditional.trace(conditional).createNodeList(conditional) as Conditional => [
                scg.nodes += it
                it.condition = conditional.expression.copyExpression
                it.controlFlowTarget(incoming)
                conditional.statements.transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
                (conditional.^else?:SclFactory::eINSTANCE.createScopeStatement).transform(scg, it.createControlFlow.toList) =>
                    [continue.controlFlows += it.controlFlows]
                for(annotation : conditional.annotations) {
                    it.annotations += annotation.copy
                }
            ]
        ]
    }

    private dispatch def SCLContinuation transform(Parallel parallel, SCGraph scg, List<ControlFlow> incoming) {
        new SCLContinuation => [ cont |
            val fork = createFork.trace(parallel).createNodeList(parallel) as Fork => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
            ]
            val join = createJoin.trace(parallel).createNodeList(parallel) as Join => [
                scg.nodes += it
                it.fork = fork
            ]
            parallel.threads.forEach [ thread |
                val forkFlow = fork.createControlFlow
                val threadEntry = createEntry.trace(thread).createNodeList(thread) => [
                    scg.nodes += it
                    it.controlFlowTarget(forkFlow.toList)
                    thread.copyAnnotations(it) 
                ]
                val continuation = thread.statements.transform(scg, threadEntry.createControlFlow.toList)
                createExit.trace(thread).createNodeList(thread) => [
                    (it as Exit).entry = threadEntry as Entry
                    scg.nodes += it
                    it.controlFlowTarget(continuation.controlFlows)
                    it.createControlFlow.setTarget(join)
                    if (continuation.label != null) {
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
            val surface = createSurface.trace(pause).createNodeList(pause) as Surface => [
                scg.nodes += it
                it.controlFlowTarget(incoming)
            ]
            node = createDepth.trace(pause).createNodeList(pause) as Depth => [
                scg.nodes += it
                it.surface = surface
            ]
            controlFlows += node.createControlFlow
        ]
    }

    private dispatch def SCLContinuation transform(Goto goto, SCGraph scg, List<ControlFlow> incoming) {
        gotoFlows.put(goto, incoming)
        new SCLContinuation => [
            if (labelMapping.keySet.contains(goto.target)) {
                val node = labelMapping.get(goto.target)
                if (node instanceof Depth) {
                    (node as Depth).surface.controlFlowTarget(incoming)
                } else {
                    node.controlFlowTarget(incoming)
                }
                incoming.forEach[annotations.addAll(goto.annotations.map[copy])]
            }
        ]
    }
    
    private dispatch def SCLContinuation transform(Scope scope, SCGraph scg, List<ControlFlow> incoming) {
    	transform(scope.statements, scg, incoming)
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
