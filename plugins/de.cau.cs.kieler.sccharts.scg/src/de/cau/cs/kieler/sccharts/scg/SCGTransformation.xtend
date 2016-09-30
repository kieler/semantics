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
package de.cau.cs.kieler.sccharts.scg

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.FunctionCallEffect
import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
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
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.processors.optimizer.SuperfluousForkRemover
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.HashMap
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.scg.processors.analyzer.PotentiallyInstantaneousLoopAnalyzer

/** 
 * SCCharts CoreTransformation Extensions.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCGTransformation extends AbstractProductionTransformation implements Traceable {
    
    protected static val ANNOTATION_IGNORETHREAD = "ignore"
    

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCGTransformations::SCC2SCG_ID
    }

    override getName() {
        return SCGTransformations::SCC2SCG_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::BASIC_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCChartsFeatureGroup::CORE_ID)
    }

    // Property to disable SuperflousForkRemover because KiCo has no proper support for processors
    public static val IProperty<Boolean> ENABLE_SFR = new Property<Boolean>("de.cau.cs.kieler.sccharts.scg.sfr", true);

    // -------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension KEffectsExtensions

    @Inject
    extension SCChartsExtension

    @Inject
    extension SCGThreadExtensions

    private val stateTypeCache = <State, Set<PatternType>>newHashMap
    private val uniqueNameCache = <String>newArrayList
    
    private static val String ANNOTATION_REGIONNAME = "regionName"
    private static val String ANNOTATION_CONTROLFLOWTHREADPATHTYPE = "cfPathType"
    private static val String ANNOTATION_HOSTCODE = "hostcode"

    // -------------------------------------------------------------------------
    // --                         U T I L I T Y                               --
    // -------------------------------------------------------------------------
    private var Entry rootStateEntry = null

    // State mappings         
    HashMap<EObject, Node> stateOrRegion2node = new HashMap<EObject, Node>()
    HashMap<Node, EObject> node2state = new HashMap<Node, EObject>()

    def Node getMappedNode(State state) {
        stateOrRegion2node.get(state)
    }

    def Node getMappedNode(Region region) {
        stateOrRegion2node.get(region)
    }

    def Surface getMappedSurface(State state) {
        state.mappedNode as Surface
    }

    def Assignment getMappedAssignment(State state) {
        state.mappedNode as Assignment
    }

    def Conditional getMappedConditional(State state) {
        state.mappedNode as Conditional
    }

    def Fork getMappedFork(State state) {
        state.mappedNode as Fork
    }

    def Exit getMappedExit(State state) {
        state.mappedNode as Exit
    }

    def Entry getMappedEntry(Region region) {
        region.mappedNode as Entry
    }

    def void map(EObject eObject, Node node) {
        stateOrRegion2node.put(eObject, node)
        node2state.put(node, eObject)
    }

    def void map(Node node, EObject eObject) {
        node2state.put(node, eObject)
    }

    def void resetMapping() {
        stateOrRegion2node.clear
        node2state.clear
        valuedObjectSSChart2SCG.clear
    }

    def State getMappedState(Node node) {
        node2state.get(node) as State
    }

    def Region getMappedRegion(Node node) {
        node2state.get(node) as Region
    }

    // ValuedObject mappings
    HashMap<ValuedObject, ValuedObject> valuedObjectSSChart2SCG = new HashMap<ValuedObject, ValuedObject>()

    def void map(ValuedObject valuedObjectSCG, ValuedObject valuedObjectSCChart) {
        valuedObjectSSChart2SCG.put(valuedObjectSCChart, valuedObjectSCG)
    }

    def ValuedObject getSCGValuedObject(ValuedObject valuedObjectSCChart) {
        valuedObjectSSChart2SCG.get(valuedObjectSCChart)
    }

    //-------------------------------------------------------------------------
    //--             T R A N S F O R M      T O    S C G                     --
    //-------------------------------------------------------------------------

  //override transform(EObject eObject, KielerCompilerContext context) {
  //    if (eObject instanceof SCGraph) {
  //        return (eObject as SCGraph).processSCG
  //    } else {
  //        return (eObject as State).transformSCG
  //    }
  //}
    
  //def SCGraph processSCG(SCGraph scg) {
  //    val SuperfluousForkRemover superfluousForkRemover = Guice.createInjector().getInstance(typeof(SuperfluousForkRemover))
  //    val newSCG = superfluousForkRemover.optimize(scg)
  //    
  //    // SCG thread path types
  //    val threadPathTypes = (newSCG.nodes.head as Entry).getThreadControlFlowTypes
  //    for(entry:threadPathTypes.keySet) {
  //        if (!entry.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
  //            entry.addAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(entry).toString2)
  //        }
  //    }
  //    newSCG
  //}

    def SCGraph transform(State rootState, KielerCompilerContext context, SCGraph sCGraph) {

        System.out.print("Beginning preparation of the SCG generation phase...");
        var timestamp = System.currentTimeMillis

        val scopeList = rootState.eAllContents.filter(Scope).toList
        val stateList = scopeList.filter(State).toList

        // fixTerminationWithEffects() and fixPossibleHaltStates() should be and is (now) handled by trigger/effect and surface/depth transformation!                
//        // Fix termination transitions that have effects
//        System.out.print(" ... ")
//        var state = rootState.fixTerminationWithEffects(stateList.fold(newLinkedList)[first, second |
//            first += second.outgoingTransitions first])
//        // Fix possible halt states
//        state = state.fixPossibleHaltStates(stateList)
//        System.out.print(" ... ")


        // Expose local variables
        scopeList.transformLocalValuedObjectCached(rootState, uniqueNameCache)
        System.out.print(" ... ")

        // Clear mappings
        resetMapping
        stateTypeCache.clear
        uniqueNameCache.clear

        creationalTransformation(rootState, sCGraph) //Tell KITT that this is not an in-place transformation from here on
        sCGraph.trace(rootState)

        // Handle declarations
        // for (valuedObject : state.valuedObjects) {
        // val valuedObjectSCG = sCGraph.createValuedObject(valuedObject.name)
        // valuedObjectSCG.applyAttributes(valuedObject)
        // valuedObjectSCG.map(valuedObject)
        // }
        for (declaration : rootState.declarations) {
            val newDeclaration = createDeclaration(declaration).trace(declaration)
            declaration.valuedObjects.forEach [
                val newValuedObject = it.copy
                newDeclaration.valuedObjects += newValuedObject
                newValuedObject.map(it)
                
                if (declaration instanceof VariableDeclaration)
                if (declaration.input || declaration.output) {
                    sCGraph.annotations += createTypedStringAnnotation("voLink", it.name, rootState.id)
                }
            ]
            sCGraph.declarations += newDeclaration
            
            if (newDeclaration instanceof ReferenceDeclaration) {
                var reference = newDeclaration.reference
                if (reference instanceof State) {
                    newDeclaration.extern = reference.id
                    newDeclaration.reference = null
                }
            }
        }

        val hostcodeAnnotations = rootState.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach [
            sCGraph.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]

        // Include top most level of hierarchy 
        // if the root state itself already contains multiple regions.
        // Otherwise skip the first layer of hierarchy.
        System.out.println(" ... ")

        stateList.add(rootState)

        for (s : stateList) {
            val stateTypeSet = <PatternType>newHashSet
            if (s.isPause)
                stateTypeSet += PatternType::PAUSE
            else if (s.isConditional)
                stateTypeSet += PatternType::CONDITIONAL
            else if (s.isAssignment)
                stateTypeSet += PatternType::ASSIGNMENT
            else {
                if(s.isFork) stateTypeSet += PatternType::FORK
                if(s.isEntry) stateTypeSet += PatternType::ENTRY
                if(s.isExit) stateTypeSet += PatternType::EXIT
            }
            stateTypeCache.put(s, stateTypeSet)
        }

        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for SCG generation finished (time elapsed: " + (time / 1000) + "s).")

        rootStateEntry = sCGraph.addEntry.trace(rootState) => [
            id = rootState.id
            setExit(sCGraph.addExit.trace(rootState))
        ]

        rootState.transformSCGGenerateNodes(sCGraph)
        rootState.transformSCGConnectNodes(sCGraph)

        rootState.mappedNode.createControlFlow.trace(rootState) => [rootStateEntry.setNext(it)]

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("SCG generation finished (overall time elapsed: " + (time / 1000) + "s).")

        // if (state.rootState.regions.size==1) {
        // // Generate nodes and recursively traverse model
        // state.transformSCGGenerateNodes(sCGraph)
        // state.transformSCGConnectNodes(sCGraph)        
        // } else {
        // // Generate nodes and recursively traverse model
        // for (region : state.rootState.regions) {
        // region.transformSCGGenerateNodes(sCGraph)
        // }
        // // Generate nodes and recursively traverse model
        // for (region : state.rootState.regions) {
        // region.transformSCGConnectNodes(sCGraph)
        // }
        // }
        // Fix superfluous exit nodes
        timestamp = System.currentTimeMillis
        sCGraph.trimExitNodes.trimConditioanlNodes
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("SCG node trimming completed (additional time elapsed: " + (time / 1000) + "s).")

        // Remove superfluous fork constructs 
        // ssm, 04.05.2014
        val scg = if (context?.getProperty(ENABLE_SFR)) {
                timestamp = System.currentTimeMillis
                val SuperfluousForkRemover superfluousForkRemover = Guice.createInjector().getInstance(
                    typeof(SuperfluousForkRemover))
                val optimizedSCG = superfluousForkRemover.optimize(sCGraph)
                time = (System.currentTimeMillis - timestamp) as float
                System.out.println("SCG optimization completed (additional time elapsed: " + (time / 1000) + "s).")
                optimizedSCG
            } else {
                sCGraph
            }

        // SCG thread path types
        val threadPathTypes = (scg.nodes.head as Entry).getThreadControlFlowTypes
        for (entry : threadPathTypes.keySet) {
            if (!entry.hasAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE))
                entry.createStringAnnotation(ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(entry).toString2)
        }
        
        PotentiallyInstantaneousLoopAnalyzer.createPotentiallyInstantaneousLoopData(scg, context)

        scg
    }
    
    def SCGraph transform(SCCharts sccharts, KielerCompilerContext context) {
        var scg = ScgFactory::eINSTANCE.createSCGraph => [
            label = if(!sccharts.rootStates.head.label.nullOrEmpty) 
            sccharts.rootStates.head.label else sccharts.rootStates.head.id
        ]

        for(rs: sccharts.rootStates) {
            scg = rs.transform(context, scg)  
        }
        
        scg.createStringAnnotation("main", sccharts.rootStates.head.id)
        
        scg
    }      

    // -------------------------------------------------------------------------   
    def boolean isPause(State state) {
        ((state.outgoingTransitions.filter [e|
            !e.isImmediate && e.trigger == null && e.effects.nullOrEmpty && e.type != TransitionType::TERMINATION
        ].size == 1) && (state.outgoingTransitions.size == 1))
    }

    def boolean isConditional(State state) {
        (
//           (state.outgoingTransitions.filter[e|e.isImmediate && 
//                                            e.trigger != null && 
//                                            e.effects.nullOrEmpty].size == 1) &&
        (state.outgoingTransitions.filter[e|e.isImmediate && e.effects.nullOrEmpty].size == 2) &&
            (state.outgoingTransitions.size == 2))
    }

    def boolean isAssignment(State state) {
        ((state.outgoingTransitions.filter [e|
            e.isImmediate && e.trigger == null && !e.effects.nullOrEmpty && e.type != TransitionType::TERMINATION
        ].size == 1) && (state.outgoingTransitions.size == 1))
    }

    def boolean isFork(State state) {
        (!state.regions.nullOrEmpty && state.controlflowRegionsNotEmpty)
    }

    def boolean isEntry(State state) {
        state.isInitial
    }

    def boolean isExit(State state) {
        state.isFinal
    }

    // -------------------------------------------------------------------------   
    def Surface addSurface(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createSurface
        sCGraph.nodes.add(node)
        node
    }

    def Depth addDepth(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createDepth
        sCGraph.nodes.add(node)
        node
    }

    def Assignment addAssignment(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createAssignment
        sCGraph.nodes.add(node)
        node
    }

    def Conditional addConditional(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createConditional
        sCGraph.nodes.add(node)
        node
    }

    def Fork addFork(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createFork
        sCGraph.nodes.add(node)
        node
    }

    def Join addJoin(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createJoin
        sCGraph.nodes.add(node)
        node
    }

    def Entry addEntry(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createEntry
        sCGraph.nodes.add(node)
        node
    }

    def Exit addExit(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createExit
        sCGraph.nodes.add(node)
        node
    }

    def ControlFlow createControlFlow(Node secondNode) {
        val controlFlow = ScgFactory::eINSTANCE.createControlFlow
        controlFlow.setTarget(secondNode)
        controlFlow
    }

    // -------------------------------------------------------------------------   
    // --                  O P T I M I Z A T I O N S                          --
    // -------------------------------------------------------------------------   
    // If two exit nodes follow each other, remove the first one.
    def SCGraph trimExitNodes(SCGraph sCGraph) {
        val exitNodes = sCGraph.nodes.filter(typeof(Exit)).toList
        val superfluousExitNodes = exitNodes.filter(e|e.next != null && e.next.target instanceof Exit).toList
        for (exitNode : superfluousExitNodes.immutableCopy) {
            val links = <ControlFlow>newArrayList
            links.addAll(exitNode.incoming.filter(typeof(ControlFlow)))
            for (link : links) {
                link.setTarget(exitNode.next.target)
            }

            val link = exitNode.next

            // KITT redirect tracing origins
            links.trace(link)
            exitNode.next.target.trace(exitNode)

            // The removal of the EOpposite relation is necessary
            link.target.incoming.remove(link)

            // Remove superfluous exit node
            sCGraph.nodes.remove(exitNode)
        }
        sCGraph
    }

    // -------------------------------------------------------------------------
    // If two conditional nodes  with the same condition and the same then branch follow each other, remove the first one.
    def SCGraph trimConditioanlNodes(SCGraph sCGraph) {
        val conditionalNodes = sCGraph.nodes.filter(typeof(Conditional)).toList
        val superfluousConditionalNodes = conditionalNodes.filter(
            e |
                e.getElse != null && e.getElse.target instanceof Conditional &&
                    (e.getElse.target as Conditional).condition.equals(e.condition) &&
                    (e.getElse.target as Conditional).then.target == e.then.target
        ).toList
        for (conditionalNode : superfluousConditionalNodes.immutableCopy) {
            val links = <ControlFlow>newArrayList
            conditionalNode.incoming.filter(typeof(ControlFlow)).forEach[links += it]

            // val links = sCGraph.eAllContents.filter(typeof(ControlFlow))
            // .filter( e | e.target == conditionalNode).toList
            for (link : links) {
                link.setTarget(conditionalNode.getElse.target)
            }

            if (conditionalNode.getElse != null) {
                val linkThen = conditionalNode.getThen
                val linkElse = conditionalNode.getElse

                // The removal of the EOpposite relation is necessary
                linkThen.target.incoming.remove(linkThen)
                linkElse.target.incoming.remove(linkElse)

                // KITT redirect tracing origins
                links.trace(linkThen, linkElse)
            }

            // KITT redirect tracing origins          
            conditionalNode.getElse.target.trace(conditionalNode)

            // Remove superfluous conditional      
            sCGraph.nodes.remove(conditionalNode)
        }
        sCGraph
    }

    // -------------------------------------------------------------------------   
    // --                 G E N E R A T E    N O D E S                        --
    // -------------------------------------------------------------------------   
    def void transformSCGGenerateNodes(ControlflowRegion region, SCGraph sCGraph) {
        val entry = sCGraph.addEntry.trace(region, region.parentState)
        if (region.hasAnnotation(ANNOTATION_IGNORETHREAD)) {
              entry.createStringAnnotation(ANNOTATION_IGNORETHREAD, "")
        }
        val exit = sCGraph.addExit.trace(region, region.parentState)
        region.map(entry)
        entry.setExit(exit)
        exit.map(region)
        for (state : region.states) {
            state.transformSCGGenerateNodes(sCGraph)
        }

        if (!region.label.nullOrEmpty)
            entry.annotations += createStringAnnotation(ANNOTATION_REGIONNAME, region.label)
    }

    // -------------------------------------------------------------------------   
    // Traverse all states and transform possible local valuedObjects.
    def void transformSCGGenerateNodes(State state, SCGraph sCGraph) {

        // System.out.println("Generate Node for State " + state.id)
        state.setDefaultTrace // KITT: All following SCG elements will be trace to state by default
        if (stateTypeCache.get(state).contains(PatternType::PAUSE)) {
            val transition = state.outgoingTransitions.get(0)
            val surface = sCGraph.addSurface.trace(state, transition)
            val depth = sCGraph.addDepth.trace(state, transition)
            surface.setDepth(depth)
            surface.map(state)
            state.map(surface)
        } else if (stateTypeCache.get(state).contains(PatternType::ASSIGNMENT)) {
            val assignment = sCGraph.addAssignment
            state.map(assignment)
            val transition = state.outgoingTransitions.get(0)
            assignment.trace(state, transition)
            transition.setDefaultTrace
//            scopeProvider.parent = transition.sourceState

            // Assertion: A SCG normalized SCChart should have just ONE assignment per transition
            val effect = transition.effects.get(0) as Effect
            if (effect instanceof de.cau.cs.kieler.kexpressions.keffects.Assignment) {
                assignment.operator = effect.operator

                // For hostcode e.g. there is no need for a valued object - it is allowed to be null
                val sCChartAssignment = (effect as de.cau.cs.kieler.kexpressions.keffects.Assignment)
                if (sCChartAssignment.valuedObject != null) {
                    assignment.setValuedObject(sCChartAssignment.valuedObject.getSCGValuedObject)
                }

                // TODO: Test if this works correct? Was before: assignment.setAssignment(serializer.serialize(transitionCopy))
                if (!effect.isPostfixOperation) {
                    assignment.setExpression(sCChartAssignment.expression.convertToSCGExpression.trace(transition, effect))
                }
                if (!sCChartAssignment.indices.nullOrEmpty) {
                    sCChartAssignment.indices.forEach [
                        assignment.indices += it.convertToSCGExpression.trace(transition, effect)
                    ]
                }
            } else if (effect instanceof HostcodeEffect) {
                assignment.setExpression((effect as HostcodeEffect).convertToSCGExpression.trace(transition, effect))
            } else if (effect instanceof FunctionCallEffect) {
                assignment.setExpression((effect as FunctionCallEffect).convertToSCGExpression.trace(transition, effect))
            } else if (effect instanceof ReferenceCallEffect) {
                assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
            }
        } else if (stateTypeCache.get(state).contains(PatternType::CONDITIONAL)) {
            val conditional = sCGraph.addConditional
            state.map(conditional)
//            scopeProvider.parent = state
            val transition = state.outgoingTransitions.get(0)
            conditional.trace(state, transition)
//            scopeProvider.parent = transition.sourceState

            // TODO  Test if this works correct? Was before:  conditional.setCondition(serializer.serialize(transitionCopy))
            conditional.setCondition(transition.trigger.convertToSCGExpression.trace(transition))
        } else if (stateTypeCache.get(state).contains(PatternType::FORK)) {
            val fork = sCGraph.addFork
            val join = sCGraph.addJoin
            fork.setJoin(join)
            state.map(fork)
            join.map(state)

            // Do recursion for all regions
            for (region : state.regions.filter(ControlflowRegion)) {
                region.transformSCGGenerateNodes(sCGraph)
            }
        } else if (stateTypeCache.get(state).contains(PatternType::EXIT)) {
            val exit = sCGraph.addExit
            state.map(exit)
        }
        clearDefaultTrace;
    }

    // -------------------------------------------------------------------------   
    // --                  C O N N E C T    N O D E S                         --
    // -------------------------------------------------------------------------   
    def void transformSCGConnectNodes(ControlflowRegion region, SCGraph sCGraph) {
        val entry = region.mappedEntry

        // Connect all entry nodes with the initial state's nodes.
        // Also check the parent container in case the "initial" state is the root state.
        val initialState = region.states.filter(e|e.isInitial || e.eContainer == null).get(0)
        val initialNode = initialState.mappedNode
        val controlFlowInitial = initialNode.createControlFlow.trace(initialNode)
        entry.setNext(controlFlowInitial)

        for (state : region.states) {
            state.transformSCGConnectNodes(sCGraph)
        }
    }

    // -------------------------------------------------------------------------   
    // Traverse all states and transform possible local valuedObjects.
    def void transformSCGConnectNodes(State state, SCGraph sCGraph) {
        if (stateTypeCache.get(state).contains(PatternType::PAUSE)) {

            // Connect the depth with the node that belongs to the target of
            // the single delayed transition outgoing from the current state
            val surface = state.mappedSurface
            val depth = surface.depth
            val transition = state.outgoingTransitions.get(0)
            val targetState = transition.targetState
            val otherNode = targetState.mappedNode
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow.trace(transition)
                depth.setNext(controlFlow)
            }
        } else if (stateTypeCache.get(state).contains(PatternType::ASSIGNMENT)) {

            // Connect the assignment with the node that belongs to the target
            // of the single immediate assignment transition outgoing  from
            // the current state
            val assignment = state.mappedAssignment
            val transition = state.outgoingTransitions.get(0)
            val targetState = transition.targetState
            val otherNode = targetState.mappedNode
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow.trace(transition)
                assignment.setNext(controlFlow)
            }
        } else if (stateTypeCache.get(state).contains(PatternType::CONDITIONAL)) {

            // Connect the conditional Then branch with the node that belongs
            // to the target of the single immediate transition with a trigger
            // outgoing  from the current state. Connect the Else branch with the
            // node that belongs to the target of the (other) single immediate
            // transition without a trigger outgoing from the current state.
            val conditional = state.mappedConditional

            val transitionThen = state.outgoingTransitions.filter(e|e.trigger != null).get(0)
            val transitionElse = state.outgoingTransitions.filter(e|e.trigger == null).get(0)
            val otherNodeThen = transitionThen.targetState.mappedNode
            val otherNodeElse = transitionElse.targetState.mappedNode
            if (otherNodeThen != null) {
                val controlFlowThen = otherNodeThen.createControlFlow.trace(transitionThen)
                conditional.setThen(controlFlowThen)
            }
            if (otherNodeElse != null) {
                val controlFlowElse = otherNodeElse.createControlFlow.trace(transitionElse)
                conditional.setElse(controlFlowElse)
            }
        } else if (stateTypeCache.get(state).contains(PatternType::FORK)) {

            // For all region find the entry node and connect it with the fork. Find the exit node
            // and connect it with the join. Do the recursive call for the regions. Connect
            // the join node with the single normal termination target's node.
            val fork = state.mappedFork
            val join = fork.join

            // Do recursion for all regions
            for (region : state.regions.filter(ControlflowRegion)) {
                val otherNodeEntry = region.mappedEntry
                if (otherNodeEntry != null) {
                    val controlFlowEntry = otherNodeEntry.createControlFlow.trace(state, region)
                    fork.next.add(controlFlowEntry)
                }
                val otherNodeExit = region.mappedEntry.exit
                if (otherNodeExit != null) {
                    val controlFlowFinal = join.createControlFlow.trace(state, region)
                    otherNodeExit.setNext(controlFlowFinal)
                }
                region.transformSCGConnectNodes(sCGraph)
            }
            if (state.outgoingTransitions.size > 0) {
                val termination = state.outgoingTransitions.get(0)
                val terminationTargetState = termination.targetState
                val otherNodeTermination = terminationTargetState.mappedNode
                if (otherNodeTermination != null) {

                    val controlFlowTermination = otherNodeTermination.createControlFlow.trace(termination)

                    // STEVEN'S HOTHOTFIX                	
                    // // Add another assignment if the termination has an effect.
                    // if (!termination.effects.nullOrEmpty) {
                    // val assignment = sCGraph.addAssignment
                    // val transitionCopy = termination.copy
                    // transitionCopy.setImmediate(false)
                    // val effect = transitionCopy.effects.get(0)
                    // val sCChartAssignment = (effect as de.cau.cs.kieler.sccharts.Assignment)
                    // assignment.setValuedObject(sCChartAssignment.valuedObject.getSCGValuedObject)
                    // assignment.setAssignment(sCChartAssignment.expression.convertToSCGExpression)
                    // assignment.setNext(controlFlowTermination)
                    // join.setNext(assignment.createControlFlow)                	
                    // } else {
                    join.setNext(controlFlowTermination)

                // }
                }
            } else {

                // The root state does not have a normal termination.
                // Use the corresponding exit node of the root region in this case. 
                if (state.isRootState) {
                    val controlFlow = rootStateEntry.exit.createControlFlow.trace(state)
                    join.setNext(controlFlow)
                } else {
                    val controlFlow = (state.eContainer as Region).getMappedEntry.exit.createControlFlow.trace(state)
                    join.setNext(controlFlow)
                }
            }
        } else if (stateTypeCache.get(state).contains(PatternType::EXIT)) {

            // For a final state connect it's exit node representation with the exit node
            // of the region.
            val nodeExit = state.mappedExit
            val regionExit = state.parentRegion.mappedEntry.exit
            val controlFlowFinal = regionExit.createControlFlow.trace(state)
            nodeExit.setNext(controlFlowFinal)
        }
    }

    // -------------------------------------------------------------------------
    // --              C O N V E R T   E X P R E S S I O N S                  --
    // -------------------------------------------------------------------------
    // Create a new reference Expression to the corresponding sValuedObject of the expression
    def dispatch Expression convertToSCGExpression(ValuedObjectReference expression) {
        expression.valuedObject.SCGValuedObject.reference => [ vor |
            vor.trace(expression)
            expression.indices.forEach [
                vor.indices += it.convertToSCGExpression
            ]
        ]
    }

    // Apply conversion to operator expressions like and, equals, not, greater, val, pre, add, etc.
    def dispatch Expression convertToSCGExpression(OperatorExpression expression) {
        val newExpression = createOperatorExpression(expression.operator).trace(expression)
        for (subExpression : expression.subExpressions) {
            newExpression.subExpressions.add(subExpression.convertToSCGExpression)
        }
        return newExpression;
    }

    // Apply conversion to integer values
    def dispatch Expression convertToSCGExpression(IntValue expression) {
        createIntValue(new Integer(expression.value)).trace(expression)
    }

    // Apply conversion to float values
    def dispatch Expression convertToSCGExpression(FloatValue expression) {
        createFloatValue(new Float(expression.value)).trace(expression)
    }

    // Apply conversion to boolean values
    def dispatch Expression convertToSCGExpression(BoolValue expression) {
        createBoolValue(new Boolean(expression.value)).trace(expression)
    }

    def dispatch Expression convertToSCGExpression(StringValue expression) {
        createStringValue(expression.value).trace(expression)
    }

    // Apply conversion to textual host code 
    def dispatch Expression convertToSCGExpression(TextExpression expression) {
        val textExpression = createTextExpression.trace(expression)
        textExpression.setText(expression.text)
        textExpression
    }

    def dispatch Expression convertToSCGExpression(ReferenceCall expression) {
        createReferenceCall.trace(expression) => [ fc |
            fc.valuedObject = expression.valuedObject.SCGValuedObject
            expression.parameters.forEach[fc.parameters += it.convertToSCGParameter]
        ]
    }
    
    def Parameter convertToSCGParameter(Parameter parameter) {
        createParameter.trace(parameter) => [
            callByReference = parameter.callByReference
            expression = parameter.expression.convertToSCGExpression
        ]
    }

    // Apply conversion to the default case
    def dispatch Expression convertToSCGExpression(Expression expression) {
        createExpression.trace(expression)
    }
    
// -------------------------------------------------------------------------   
}
