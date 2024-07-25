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
package de.cau.cs.kieler.sccharts.processors.scg

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.NullValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.keffects.FunctionCallEffect
import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.kexpressions.keffects.PrintCallEffect
import de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
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
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.processors.transformators.SCLToSCGTransformation
import java.util.HashMap
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/** 
 * SCCharts CoreTransformation Extensions.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCGTransformation extends Processor<SCCharts, SCGraphs> implements Traceable {

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension PragmaExtensions
    
    private var SCLToSCGTransformation methodProcessor;

    public static val PREFIX_REFERENCE_VALUED_OBJECT_NAME = "_r"
    
    protected static val ANNOTATION_IGNORETHREAD = "ignore"
    
    val stateTypeCache = <State, Set<PatternType>>newHashMap
    val uniqueNameCache = new UniqueNameCache

    static val String ANNOTATION_REGIONNAME = "regionName"
    static val String ANNOTATION_HOSTCODE = "hostcode"

    var Entry rootStateEntry = null
    private var SCGraphs scGraphs

    // State mappings         
    HashMap<EObject, Node> stateOrRegion2node = new HashMap<EObject, Node>()
    HashMap<Node, EObject> node2state = new HashMap<Node, EObject>()    
    val SCC2SCGMap = <State, SCGraph> newHashMap

    override getId() {
        "de.cau.cs.kieler.sccharts.scg.processors.SCG"
    }
    
    override getName() {
        "SCG"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        methodProcessor = KiCoolRegistration.getProcessorInstance("de.cau.cs.kieler.scl.processors.transformators.scl2scg") as SCLToSCGTransformation
        methodProcessor?.setEnvironment(sourceEnvironment, environment)
        
        val model = getModel
        scGraphs = ScgFactory.eINSTANCE.createSCGraphs => [
            creationalTransformation(model, it) // Tell KITT that this is not an in-place transformation from here on
            it.trace(model)
            model.copyPragmas(it)
        ]
        model.createSCGs
        scGraphs.scgs.addAll(0, model.rootStates.map[transform])
        setModel(scGraphs)
    }
    
    def createSCGs(EObject obj) {
        SCC2SCGMap.clear
        switch (obj) {
            SCGraph: { return }
            State: {
                ScgFactory::eINSTANCE.createSCGraph => [
                    label = (obj as State).name; 
                    name = (obj as State).name
                    SCC2SCGMap.put(obj as State, it)
                ]
            }
            SCCharts: {
                for (rootState : obj.rootStates) {
                    ScgFactory::eINSTANCE.createSCGraph => [
                        label = rootState.name; 
                        name = rootState.name
                        SCC2SCGMap.put(rootState, it)
                    ]
                }
            }            
        }
    }

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
    
    def SCGraph transform(State rootState) {
        val voStore = VariableStore.get(environment)
        val scopeList = rootState.eAllContents.filter(Scope).toList
        val stateList = scopeList.filter(State).toList

        // Clear mappings
        resetMapping
        stateTypeCache.clear
        uniqueNameCache.clear

        val sCGraph = SCC2SCGMap.get(rootState)

        sCGraph.trace(rootState)
        
        // Copy annotations
        sCGraph.annotations += rootState.annotations.map[copy]
        
        // Handle declarations
        val declMapping = newLinkedHashMap
        val voMapping = newLinkedHashMap
        sCGraph.declarations += rootState.declarations.copyDeclarations(voMapping, declMapping)
        declMapping.entrySet.forEach[
            value.trace(key)
            // Convert method body
            if (key instanceof MethodImplementationDeclaration) {
                val method = key as MethodImplementationDeclaration
                if (!method.statements.nullOrEmpty) {
                    scGraphs.scgs += methodProcessor?.transformMethod(method, value as MethodDeclaration, voMapping)
                }
            }
            if (value instanceof ReferenceDeclaration) {
                (value as ReferenceDeclaration).reference = SCC2SCGMap.get((key as ReferenceDeclaration).reference)
            }
        ]
        voMapping.entrySet.forEach[
            value.trace(key)
            value.map(key)
            
            // Fix VO association in VariableStore
            val info = voStore.getInfo(key)
            if (info !== null) info.valuedObject = value
        ]

        // Include top most level of hierarchy 
        // if the root state itself already contains multiple regions.
        // Otherwise skip the first layer of hierarchy.
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

        rootStateEntry = sCGraph.addEntry.trace(rootState) => [
//            setExit(sCGraph.addExit.trace(rootState))
            setExit(sCGraph.addExit)
        ]

        rootState.transformSCGGenerateNodes(sCGraph)
        rootState.transformSCGConnectNodes(sCGraph)

        rootState.mappedNode.createControlFlow.trace(rootState) => [rootStateEntry.setNext(it)]

        // Fix superfluous exit nodes
        sCGraph.trimExitNodes.trimConditioanlNodes
        
        return sCGraph
    }

    // -------------------------------------------------------------------------   
    def boolean isPause(State state) {
        ((state.outgoingTransitions.filter [e|
            !e.isImplicitlyImmediate && e.trigger === null && e.effects.nullOrEmpty && e.preemption != PreemptionType::TERMINATION
        ].size == 1) && (state.outgoingTransitions.size == 1))
    }

    def boolean isConditional(State state) {
        (
//           (state.outgoingTransitions.filter[e|e.isImmediate && 
//                                            e.trigger != null && 
//                                            e.effects.nullOrEmpty].size == 1) &&
        (state.outgoingTransitions.filter[e|e.isImplicitlyImmediate && e.effects.nullOrEmpty].size == 2) &&
            (state.outgoingTransitions.size == 2))
    }

    def boolean isAssignment(State state) {
        ((state.outgoingTransitions.filter [e|
            e.isImplicitlyImmediate && e.trigger === null && 
            ((e.preemption != PreemptionType::TERMINATION && !e.effects.nullOrEmpty) || state.isReferencing)
        ].size == 1) && (state.outgoingTransitions.size == 1))
    }

    def boolean isFork(State state) {
        (!state.regions.nullOrEmpty && state.controlflowRegionsContainStates)
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
        val superfluousExitNodes = exitNodes.filter(e|e.next !== null && e.next.target instanceof Exit).toList
        for (exitNode : superfluousExitNodes.immutableCopy) {
            val links = <ControlFlow>newArrayList
            links.addAll(exitNode.incomingLinks.filter(typeof(ControlFlow)))
            for (link : links) {
                link.setTarget(exitNode.next.target)
            }

            val link = exitNode.next

            // KITT redirect tracing origins
            links.trace(link)
//            exitNode.next.target.trace(exitNode)
            exitNode.next.target

            // The removal of the EOpposite relation is necessary
            link.target.incomingLinks.remove(link)

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
                e.getElse !== null && e.getElse.target instanceof Conditional &&
                    (e.getElse.target as Conditional).condition.equals(e.condition) &&
                    (e.getElse.target as Conditional).then.target == e.then.target
        ).toList
        for (conditionalNode : superfluousConditionalNodes.immutableCopy) {
            val links = <ControlFlow>newArrayList
            conditionalNode.incomingLinks.filter(typeof(ControlFlow)).forEach[links += it]

            // val links = sCGraph.eAllContents.filter(typeof(ControlFlow))
            // .filter( e | e.target == conditionalNode).toList
            for (link : links) {
                link.setTarget(conditionalNode.getElse.target)
            }

            if (conditionalNode.getElse !== null) {
                val linkThen = conditionalNode.getThen
                val linkElse = conditionalNode.getElse

                // The removal of the EOpposite relation is necessary
                linkThen.target.incomingLinks.remove(linkThen)
                linkElse.target.incomingLinks.remove(linkElse)

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
        if (region.abort) { // Mark for later processing
            entry.addTagAnnotation(SCGAbortRegionProcessor.ANNOTATION_ABORT)
        }
//        val exit = sCGraph.addExit.trace(region, region.parentState)
        val exit = sCGraph.addExit
        region.map(entry)
        entry.setExit(exit)
        exit.map(region)
        
        entry.name = region.name
        
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
            
            surface.name = state.name
        } else if (stateTypeCache.get(state).contains(PatternType::ASSIGNMENT)) {
            val assignment = sCGraph.addAssignment
            state.map(assignment)
            val transition = state.outgoingTransitions.get(0)
            assignment.trace(state, transition)
            transition.setDefaultTrace
            
            assignment.name = state.name

            if (state.isReferencing) {
                if (state.isReferencingScope) {
                    val referenceDeclaration = createReferenceDeclaration => [
                        reference = SCC2SCGMap.get(state.reference.scope)
                        sCGraph.declarations += it    
                    ]
                    val referenceCall = createReferenceCall.trace(state) => [ rc |
                        val VOR = createValuedObject(PREFIX_REFERENCE_VALUED_OBJECT_NAME + state.reference.scope.name) => [
                            referenceDeclaration.valuedObjects += it
                        ]
                        rc.valuedObject = VOR
                        state.reference.parameters.forEach[ rc.parameters += it.convertToSCGParameter ]
                    ]    
                    
                    assignment.expression = referenceCall
                } else {
                    throw new IllegalArgumentException("SCG transformation does not support references to generic types.")
                }
            } else {
    		    // Assertion: A SCG normalized SCChart should have just ONE assignment per transition
    		    val effect = transition.effects.get(0) as Effect
    		    if (effect instanceof de.cau.cs.kieler.kexpressions.keffects.Assignment) {
        			assignment.operator = effect.operator
        
        			// For hostcode e.g. there is no need for a valued object - it is allowed to be null
        			val sCChartAssignment = (effect as de.cau.cs.kieler.kexpressions.keffects.Assignment)
        			if (sCChartAssignment.valuedObject !== null) {
        			    assignment.setValuedObject(sCChartAssignment.valuedObject.getSCGValuedObject)
        			    // Copy sub reference
        			    var scgRef = assignment.reference
        			    var sccSub = sCChartAssignment.reference.subReference
        			    while (sccSub !== null) {
        				var ref = sccSub.valuedObject.SCGValuedObject.reference
        				ref.indices += sccSub.indices.map[copy]
        				ref.indices.filter(ValuedObjectReference).toList.forEach[valuedObject = valuedObject.SCGValuedObject]
        				scgRef.subReference = ref
        				scgRef = ref
        				sccSub = sccSub.subReference
        			    }
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
    			assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
    		    } else if (effect instanceof FunctionCallEffect) {
    			assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
    		    } else if (effect instanceof PrintCallEffect) {
    			assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
    		    } else if (effect instanceof RandomizeCallEffect) {
    			assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
    		    } else if (effect instanceof ReferenceCallEffect) {
    			assignment.setExpression(effect.convertToSCGExpression.trace(transition, effect))
    		    }
    		    
    		    if (!effect.schedule.nullOrEmpty) {
        			for (s : effect.schedule) {
                        assignment.schedule += s.convertToSCGExpression as ScheduleObjectReference
        			}
    		    }
    		}
        } else if (stateTypeCache.get(state).contains(PatternType::CONDITIONAL)) {
            val conditional = sCGraph.addConditional
            state.map(conditional)
            val transition = state.outgoingTransitions.get(0)
            conditional.trace(state, transition)
            
            conditional.name = state.name

            // TODO  Test if this works correct? Was before:  conditional.setCondition(serializer.serialize(transitionCopy))
            conditional.setCondition(transition.trigger.convertToSCGExpression.trace(transition))
            // Pass on trigger schedule
            if (!transition.trigger.schedule.empty) {
                val vors = newArrayList
                if (conditional.condition instanceof ValuedObjectReference) {
                    vors += conditional.condition as ValuedObjectReference
                }
                vors += conditional.condition.eAllContents.filter(ValuedObjectReference).filter[!it.isSubReference].toIterable
                for (vor : vors) {
                    vor.lowermostReference.schedule += transition.trigger.schedule.map[it.convertToSCGExpression as ScheduleObjectReference]
                }
            }
        } else if (stateTypeCache.get(state).contains(PatternType::FORK)) {
            val fork = sCGraph.addFork
            val join = sCGraph.addJoin
            fork.setJoin(join)
            state.map(fork)
            join.map(state)
            
            fork.name = state.name

            // Do recursion for all regions
            for (region : state.regions.filter(ControlflowRegion)) {
                region.transformSCGGenerateNodes(sCGraph)
            }
        } else if (stateTypeCache.get(state).contains(PatternType::EXIT)) {
            val exit = sCGraph.addExit
            state.map(exit)
            
            exit.name = state.name
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
        val initialState = region.states.filter(e|e.isInitial || e.eContainer === null).head
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
            if (otherNode !== null) {
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
            if (otherNode !== null) {
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

            val transitionThen = state.outgoingTransitions.filter(e|e.trigger !== null).head
            val transitionElse = state.outgoingTransitions.filter(e|e.trigger === null).head
            val otherNodeThen = transitionThen.targetState.mappedNode
            val otherNodeElse = transitionElse.targetState.mappedNode
            if (otherNodeThen !== null) {
                val controlFlowThen = otherNodeThen.createControlFlow.trace(transitionThen)
                conditional.setThen(controlFlowThen)
            }
            if (otherNodeElse !== null) {
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
                if (otherNodeEntry !== null) {
                    val controlFlowEntry = otherNodeEntry.createControlFlow.trace(state, region)
                    fork.next.add(controlFlowEntry)
                }
                val otherNodeExit = region.mappedEntry.exit
                if (otherNodeExit !== null) {
                    otherNodeExit.final = region.final 
                    val controlFlowFinal = join.createControlFlow.trace(state, region)
                    otherNodeExit.setNext(controlFlowFinal)
                }
                region.transformSCGConnectNodes(sCGraph)
            }
            if (state.outgoingTransitions.size > 0) {
                val termination = state.outgoingTransitions.get(0)
                val terminationTargetState = termination.targetState
                val otherNodeTermination = terminationTargetState.mappedNode
                if (otherNodeTermination !== null) {

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
    def dispatch Expression convertToSCGExpression(ScheduleObjectReference expression) {
        expression.valuedObject.getSCGValuedObject.createScheduleReference => [ sor |
            sor.trace(expression)
            sor.priority = expression.priority
            sor.handleSubReferences(expression)
            sor.annotations += expression.annotations.map[copy]
            expression.indices.forEach [
                sor.indices += it.convertToSCGExpression
            ]
        ]
    }
    
    // Create a new reference Expression to the corresponding sValuedObject of the expression
    def dispatch Expression convertToSCGExpression(ValuedObjectReference expression) {
        expression.valuedObject.getSCGValuedObject.reference => [ vor |
            vor.trace(expression)
            vor.handleSubReferences(expression)
            expression.indices.forEach [
                vor.indices += it.convertToSCGExpression
            ]
            expression.schedule.forEach [
                vor.schedule += it.convertToSCGExpression as ScheduleObjectReference
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
        createIntValue(Integer.valueOf(expression.value)).trace(expression)
    }

    // Apply conversion to float values
    def dispatch Expression convertToSCGExpression(FloatValue expression) {
        createFloatValue(Float.valueOf(expression.value.floatValue())).trace(expression)
    }

    // Apply conversion to boolean values
    def dispatch Expression convertToSCGExpression(BoolValue expression) {
        createBoolValue(Boolean.valueOf(expression.value)).trace(expression)
    }

    def dispatch Expression convertToSCGExpression(StringValue expression) {
        createStringValue(expression.value).trace(expression)
    }
    
    def dispatch Expression convertToSCGExpression(VectorValue expression) {
        createVectorValue.trace(expression) => [
            for (value : expression.values) {
                it.values += value.convertToSCGExpression
            }
        ]
    }
    
    def dispatch Expression convertToSCGExpression(IgnoreValue expression) {
        createIgnoreValue.trace(expression)
    }
    
    def dispatch Expression convertToSCGExpression(NullValue expression) {
        createNullValue.trace(expression)
    }

    // Apply conversion to textual host code 
    def dispatch Expression convertToSCGExpression(TextExpression expression) {
        val textExpression = createTextExpression.trace(expression)
        textExpression.setText(expression.text)
        expression.copyAnnotations(textExpression)
        textExpression
    }

    def dispatch Expression convertToSCGExpression(FunctionCall expression) {
        createFunctionCall.trace(expression) => [ fc |
            fc.functionName = expression.functionName
            expression.parameters.forEach[fc.parameters += it.convertToSCGParameter]
        ]
    }

    def Parameter convertToSCGParameter(Parameter parameter) {
        KExpressionsFactory.eINSTANCE.createParameter.trace(parameter) => [
            accessType = parameter.accessType
            expression = parameter.expression.convertToSCGExpression
        ]
    }
    
    def dispatch Expression convertToSCGExpression(PrintCall printCall) {
        createPrintCall.trace(printCall) => [ pc |
            printCall.parameters.forEach[ pc.parameters += it.convertToSCGParameter ]
        ]
    }
    
    def dispatch Expression convertToSCGExpression(RandomCall randomCall) {
        createRandomCall.trace(randomCall) => [ rc |
            randomCall.parameters.forEach [ rc.parameters += it.convertToSCGParameter ]
        ] 
    }
    
    def dispatch Expression convertToSCGExpression(RandomizeCall randomizeCall) {
        createRandomizeCall.trace(randomizeCall) => [ rc |
            randomizeCall.parameters.forEach [ rc.parameters += it.convertToSCGParameter ]
        ] 
    }    
    
    def dispatch Expression convertToSCGExpression(ReferenceCall referenceCall) {
        createReferenceCall.trace(referenceCall) => [ rc |
            rc.valuedObject = referenceCall.valuedObject.getSCGValuedObject
            rc.indices += referenceCall.indices.map[convertToSCGExpression]
            rc.handleSubReferences(referenceCall)
            referenceCall.parameters.forEach[ rc.parameters += it.convertToSCGParameter ]
        ]
    }
    
    def void handleSubReferences(ValuedObjectReference dest, ValuedObjectReference src) {
        if (src.subReference !== null) {
            val ref =  src.subReference.valuedObject.SCGValuedObject.reference
            ref.indices += src.subReference.indices.map[convertToSCGExpression]
            ref.schedule += src.schedule.map[it.convertToSCGExpression as ScheduleObjectReference]
            dest.subReference = ref
            dest.subReference.handleSubReferences(src.subReference)
        }
    }
    
// -------------------------------------------------------------------------   
}
