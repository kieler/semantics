/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2026 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.c

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.IODeclaration
import de.cau.cs.kieler.kexpressions.NullValue
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeSerializeHRExtensions2
import de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorStructModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Set

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static extension de.cau.cs.kieler.sccharts.definitions.Semantics.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*
import static de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate.*
import static de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.c.StatebasedLeanCCodeGenerator.*
import de.cau.cs.kieler.sccharts.definitions.Semantics

/**
 * @author als
 * 
 */
class StatebasedModernLeanCTemplate extends ExogenousProcessor<SCCharts, CodeContainer> {
    
    @Inject extension PragmaExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension StatebasedCCodeSerializeHRExtensions2 serializer
    
    public static val IProperty<Boolean> ONLY_WARN = 
       new Property<Boolean>("de.cau.cs.kieler.kicool.codegen.statebased.modern.lean.c.onlyWarn", false)
    public static val IProperty<Boolean> STRONG_EXIT = 
       new Property<Boolean>("de.cau.cs.kieler.kicool.codegen.statebased.modern.lean.c.strongExit", true)   
    
    public static val FN_PREFIX = "_scc_"
    public static val STATE_VAR = "_state"
    
    @Inject StatebasedStructure structure
    @Inject CCodeGeneratorStructModule cStructGenerator
    
    protected Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap
    protected val header = new StringBuilder
    protected val source = new StringBuilder
    protected State rootState
    protected var boolean debug = false
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codegen.statebased.modern.lean.c"
    }
    
    override getName() {
        "State-based C Code (Modern-Lean)"
    }
    
    override process() {
        naming.put(TICK, environment.getProperty(TICK_FUNCTION_NAME))
        naming.put(RESET, environment.getProperty(RESET_FUNCTION_NAME))
        naming.put(LOGIC, environment.getProperty(LOGIC_FUNCTION_NAME))
        naming.put(TICKDATA, environment.getProperty(TICKDATA_STRUCT_NAME))
        serializer.valuedObjectPrefix = "context->"
        cStructGenerator.indentation = "    "
        rootState = model.rootStates.head
        structure.init(rootState, FN_PREFIX.toUpperCase)
        
        // Handle unsupported features
        val level = environment.getProperty(ONLY_WARN) ? environment.warnings : environment.errors
        if (rootState.declarations.exists[it instanceof ScheduleDeclaration]) {
            level.add("This compilation approach cannot handle scheduling directives!")
        }
        if (structure.scopes.filter(State).exists[!it.connector && it.outgoingTransitions.exists[it.isImmediate || it.implicitlyImmediate]]) {
            level.add("This compilation approach cannot handle immediate transitions!")
        }
        if (!model.hasSemantics(Semantics.SCCharts.LEAN)) {
            level.add("This compilation approach only supports the LeanSCCharts semantics (add '#semantics \"lean\"' to switch semantics)!")
        }
        
        // Generate code
        val codeFilename = hostcodeSafeName(rootState.name)
        val hFilename = codeFilename + H_EXTENSION
        val headerMacroName = ("_" + hFilename.replaceAll("\\.", "_") + "_").toUpperCase
        val cFilename = codeFilename + C_EXTENSION
        
        val cc = new CodeContainer
        createHeader(headerMacroName)
        cc.addCHeader(hFilename, header.toString).naming.putAll(naming)
        
        createSource(hFilename)
        cc.addCCode(cFilename, source.toString).naming.putAll(naming)       
        
        setModel(cc)
    }
    
    protected def void createHeader(String headerMacroName) {
        header.append('''
        /*
         * Automatically generated C code by
         * KIELER SCCharts - The Key to Efficient Modeling
         *
         * http://rtsys.informatik.uni-kiel.de/kieler
         */
        #ifndef «headerMacroName»
        #define «headerMacroName»
        «hostcodeHeaderAdditions()»

        «IF rootState.declarations.filter(ClassDeclaration).exists[!host]»
            // SCChart's own classes
            «FOR d : rootState.declarations.filter(ClassDeclaration).filter[!host].toList.reverseView»
                «cStructGenerator.generateClassDeclaration(d, serializer)»
            «ENDFOR»

        «ENDIF»
        // States of regions in the SCChart
        «FOR r : structure.scopes.filter(ControlflowRegion)»
            enum «FN_PREFIX.toUpperCase»«structure.uniqueName(r)»_States {
                «r.states.map[structure.uniqueEnumName(it)].join(", ")»
            };
        «ENDFOR»
        
        // Internal state of the SCChart
        typedef struct {
            // Active states in regions
            «FOR r : structure.scopes.filter(ControlflowRegion)»
                enum «FN_PREFIX.toUpperCase»«structure.uniqueName(r)»_States «structure.uniqueName(r)»_activeState;
            «ENDFOR»
            
            // Entry handling
            «FOR s : structure.scopes.filter(State).filter[it.hasTickBehavior]»
                char «structure.uniqueName(s)»_entry;
            «ENDFOR»
        } «FN_PREFIX»«hostcodeSafeName(rootState.name)»_InternalState;
        
        typedef struct {
            // Internal state
            «FN_PREFIX»«hostcodeSafeName(rootState.name)»_InternalState «STATE_VAR»;
            
            // Internal variables
        «createDeclarations(rootState.declarations.filter[!(it instanceof IODeclaration) || !(it as IODeclaration).input && !(it as IODeclaration).output].map[it as Declaration])»
            
            // IO variables
        «createDeclarations(rootState.declarations.filter(IODeclaration).filter[input || output])»
        } «naming.get(TICKDATA)»;
        
        void «naming.get(RESET)»(«naming.get(TICKDATA)» *context);
        void «naming.get(TICK)»(«naming.get(TICKDATA)» *context);
        
        #endif
       ''')        
    }
    
    protected def createDeclarations(Iterable<? extends Declaration> decls) {
        cStructGenerator.code.length = 0 // clear string builder
        cStructGenerator.generateDeclarations(decls.map[it as Declaration].toList, 0, serializer)
        return cStructGenerator.code.toString
    }
    
    protected def void createSource(String hFilename) {
        // TODO reset local vars
        source.append('''
        /*
         * Automatically generated C code by
         * KIELER SCCharts - The Key to Efficient Modeling
         *
         * http://rtsys.informatik.uni-kiel.de/kieler
         */
        «hostcodeAdditions()»
        #include <stdio.h>
        #include "«hFilename»"
        
        /* Internal behavior */
        «FOR s : structure.scopes.reverseView»
            «IF s instanceof State»
                «createSourceState(s)»
            «ELSEIF s instanceof ControlflowRegion»
                «createSourceControlflowRegion(s)»
            «ENDIF»
        «ENDFOR»
        
        /* External interface */
        void «naming.get(RESET)»(«naming.get(TICKDATA)» *context) {
            «FN_PREFIX»«structure.uniqueName(rootState)»_reset(context);
        }
        
        void «naming.get(TICK)»(«naming.get(TICKDATA)» *context) {
            «FN_PREFIX»«structure.uniqueName(rootState)»_tick(context);
        }
        ''')
    }
    
    protected def CharSequence createSourceState(State state) {
        if (state.isSuperstate) {
            return '''
            
            «IF state.hasTickBehavior || state.hasExitActions»
                /*
                 * State «state.label.nullOrEmpty ? state.name : state.label» «IF state != rootState»(«structure.pathID(state)»)«ENDIF»
                «IF state != rootState» * «structure.pathInfo(state)»«ENDIF»
                 */
                «IF state.hasTickBehavior»
                static inline void «FN_PREFIX»«structure.uniqueName(state)»_reset(«naming.get(TICKDATA)» *context) {
                    context->_state.«structure.uniqueName(state)»_entry = 1;
                    «IF state.isHierarchical»
                        // Reset regions
                        «FOR r : state.regions.filter(ControlflowRegion)»
                            «FN_PREFIX»«structure.uniqueName(r)»_reset(context);
                        «ENDFOR»
                    «ENDIF»
                }
                «ENDIF»
                «IF state.hasExitBehavior»
                static inline void «FN_PREFIX»«structure.uniqueName(state)»_exit(«naming.get(TICKDATA)» *context) {
                    «FOR a : state.exitActions»
                        «IF a.trigger !== null»
                            if («a.trigger.serializeHR») {
                                «FOR e : a.effects»
                                    «e.serializeHR»;
                                «ENDFOR»
                            }
                        «ELSE»
                            «FOR e : a.effects»
                                «e.serializeHR»;
                            «ENDFOR»
                        «ENDIF»
                    «ENDFOR»
                    «IF state.isHierarchical && state.regions.exists[hasExitBehavior]»
                        // Exit inner states
                        «FOR r : state.regions.filter[hasExitBehavior]»
                            «FN_PREFIX»«structure.uniqueName(r)»_exit(context);
                        «ENDFOR»
                    «ENDIF»
                }
                «ENDIF»
                «IF state.hasTickBehavior»
                static inline void «FN_PREFIX»«structure.uniqueName(state)»_tick(«naming.get(TICKDATA)» *context) {
                    if (context->_state.«structure.uniqueName(state)»_entry) {
                        «IF state.hasImmediateDuringActions || state.hasEntryActions»
                            // Entry
                            «FOR a : state.actions.filter[it instanceof EntryAction || (it instanceof DuringAction && (it as DuringAction).immediate)]»
                                «IF a.trigger !== null»
                                    if («a.trigger.serializeHR») {
                                        «FOR e : a.effects»
                                            «e.serializeHR»;
                                        «ENDFOR»
                                    }
                                «ELSE»
                                    «FOR e : a.effects»
                                        «e.serializeHR»;
                                    «ENDFOR»
                                «ENDIF»
                            «ENDFOR»
                        «ENDIF»
                        «IF state.isHierarchical && state.regions.filter(ControlflowRegion).exists[it.initialState.connector || it.initialState.hasTickBehavior]»
                            «IF state.hasImmediateDuringActions || state.hasEntryActions»
                            
                            «ENDIF»
                            // Only execute initial states upon entry to prevent immediate transitioning (except for initial connectors)
                            «FOR r : state.regions.filter(ControlflowRegion)»
                                «IF r.initialState.connector»
                                    «FN_PREFIX»«structure.uniqueName(r)»_tick(context);
                                «ELSEIF r.initialState.hasTickBehavior»
                                    «FN_PREFIX»«structure.uniqueName(r.initialState)»_tick(context);
                                «ENDIF»
                            «ENDFOR»
                            
                        «ENDIF»
                    } else {
                        «IF state.hasDuringActions»
                            // During
                            «FOR a : state.duringActions»
                                «IF a.trigger !== null»
                                    if («a.trigger.serializeHR») {
                                        «FOR e : a.effects»
                                            «e.serializeHR»;
                                        «ENDFOR»
                                    }
                                «ELSE»
                                    «FOR e : a.effects»
                                        «e.serializeHR»;
                                    «ENDFOR»
                                «ENDIF»
                            «ENDFOR»
                        «ENDIF»
                        «IF state.isHierarchical»
                            «IF state.hasDuringActions»
                            
                            «ENDIF»
                            // Regions
                            «FOR r : state.regions.filter(ControlflowRegion)»
                                «FN_PREFIX»«structure.uniqueName(r)»_tick(context);
                            «ENDFOR»
                        «ENDIF»
                    }
                    // Disable entry behavior
                    context->_state.«structure.uniqueName(state)»_entry = 0;
                }
                «ENDIF»
            «ENDIF»
            '''
        }
        return ""
    }
    
    protected def CharSequence createSourceControlflowRegion(ControlflowRegion region) {
        return '''
        
        /* 
         * Region «region.label.nullOrEmpty ? region.name.nullOrEmpty ? "Unnamed" : region.name : region.label» («structure.pathID(region)»)
         * «structure.pathInfo(region)»
         */
        static inline void «FN_PREFIX»«structure.uniqueName(region)»_reset(«naming.get(TICKDATA)» *context) {
            context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(region.initialState)»;
            «IF region.states.exists[it.hasTickBehavior]»
                
                // Reset states
                «FOR s : region.states.filter[it.hasTickBehavior]»
                    «FN_PREFIX»«structure.uniqueName(s)»_reset(context);
                «ENDFOR»
            «ENDIF»
        }
        «IF region.hasExitBehavior»
        static inline void «FN_PREFIX»«structure.uniqueName(region)»_exit(«naming.get(TICKDATA)» *context) {
            // Exit acitve state
            switch (context->_state.«structure.uniqueName(region)»_activeState) {
                «FOR state : region.states.filter[hasExitBehavior]»
                    case «structure.uniqueEnumName(state)»: // «state.label.nullOrEmpty ? state.name : state.label»
                        «FN_PREFIX»«structure.uniqueName(state)»_exit(context);
                        break;
                «ENDFOR»
                «IF region.states.exists[!hasExitBehavior]»
                    «FOR state : region.states.filter[!hasExitBehavior]»
                        case «structure.uniqueEnumName(state)»: // «state.label.nullOrEmpty ? state.name : state.label»
                    «ENDFOR»
                        // Intentional fallthrough
                        // No exit actions
                        break;
                «ENDIF»
            }
        }
        «ENDIF»
        static inline void «FN_PREFIX»«structure.uniqueName(region)»_tick(«naming.get(TICKDATA)» *context) {
            «IF region.states.exists[it.connector]»
            char handle_connector = 0;
            «ENDIF»
            // States
            switch (context->_state.«structure.uniqueName(region)»_activeState) {
                «FOR state : region.states.filter[!connector]»
                    case «structure.uniqueEnumName(state)»: // «state.label.nullOrEmpty ? state.name : state.label»
                        «IF state.outgoingTransitions.exists[isStrongAbort]»
                            // Check preemptive transitions (strong aborts)
                            «FOR t : state.outgoingPreemptiveTransitions»
                            «IF t.trigger === null»
                                if (1) { // Priority «t.priority»
                            «ELSE»
                                if («t.trigger.serializeHR») { // Priority «t.priority»
                            «ENDIF»
                                «IF state.hasExitBehavior && environment.getProperty(STRONG_EXIT)»
                                    // Exit state
                                    «FN_PREFIX»«structure.uniqueName(state)»_exit(context);
                                    
                                «ENDIF»
                                «IF !t.effects.empty»
                                    // Effects
                                    «FOR e : t.effects»
                                        «e.serializeHR»;
                                    «ENDFOR»
                                    
                                «ENDIF»
                                «IF t.targetState.connector»
                                    // Go to connector «t.targetState.name» («structure.pathID(t.targetState)»)
                                    context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                    handle_connector = 1;
                                «ELSE»
                                    // Go to state «t.targetState.label.nullOrEmpty ? t.targetState.name : t.targetState.label» («structure.pathID(t.targetState)»)
                                    context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                    «IF t.targetState.hasTickBehavior»
                                        «IF !t.isHistory»
                                            «FN_PREFIX»«structure.uniqueName(t.targetState)»_reset(context);
                                        «ENDIF»
                                        «FN_PREFIX»«structure.uniqueName(t.targetState)»_tick(context);
                                    «ENDIF»
                                «ENDIF»
                                break;
                            }
                            «ENDFOR»
                        «ENDIF»
                        «IF state.hasTickBehavior»
                            // Execute active state
                            «FN_PREFIX»«structure.uniqueName(state)»_tick(context);
                        «ENDIF»
                        «IF state.outgoingTransitions.exists[isTermination]»
                            // Check termination
                            char «structure.uniqueName(state)»_canTerminate = «state.synthesizeTerminationCondition»;
                        «ENDIF»
                        «IF state.outgoingTransitions.exists[!isStrongAbort]»
                            // Check non-preemptive transitions
                            «FOR t : state.outgoingNonPreemptiveTransitions»
                                «IF t.trigger === null && !t.isTermination»
                                    «IF !t.isFirst(state.outgoingNonPreemptiveTransitions)»else «ENDIF»if (1) { // Priority «t.priority»
                                «ELSEIF t.trigger === null && t.isTermination»
                                    «IF !t.isFirst(state.outgoingNonPreemptiveTransitions)»else «ENDIF»if («structure.uniqueName(state)»_canTerminate) { // Priority «t.priority»
                                «ELSEIF t.isTermination»
                                    «IF !t.isFirst(state.outgoingNonPreemptiveTransitions)»else «ENDIF»if («structure.uniqueName(state)»_canTerminate && («t.trigger.serializeHR»)) { // Priority «t.priority»
                                «ELSE»
                                    «IF !t.isFirst(state.outgoingNonPreemptiveTransitions)»else «ENDIF»if («t.trigger.serializeHR») { // Priority «t.priority»
                                «ENDIF»
                                    «IF state.hasExitBehavior»
                                        // Exit state
                                        «FN_PREFIX»«structure.uniqueName(state)»_exit(context);
                                        
                                    «ENDIF»
                                    «IF !t.effects.empty»
                                        // Effects
                                        «FOR e : t.effects»
                                            «e.serializeHR»;
                                        «ENDFOR»
                                        
                                    «ENDIF»
                                    «IF t.targetState.connector»
                                        // Go to connector «t.targetState.name» («structure.pathID(t.targetState)»)
                                        context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                        handle_connector = 1;
                                    «ELSE»
                                        // Go to state «t.targetState.label.nullOrEmpty ? t.targetState.name : t.targetState.label» («structure.pathID(t.targetState)»)
                                        context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                        «IF t.targetState.hasTickBehavior»
                                            «IF !t.isHistory»
                                                «FN_PREFIX»«structure.uniqueName(t.targetState)»_reset(context);
                                            «ENDIF»
                                            «FN_PREFIX»«structure.uniqueName(t.targetState)»_tick(context);
                                        «ENDIF»
                                    «ENDIF»
                                }
                            «ENDFOR»
                        «ENDIF»
                        break;
                «ENDFOR»
                «IF region.states.exists[connector]»
                    «FOR c : region.states.filter[connector]»
                        case «structure.uniqueEnumName(c)»:
                    «ENDFOR»
                        // Intentional fallthrough
                        // Connectors are transient and handled separately to enable instantaneous traversal
                        handle_connector = 1;
                        break;
                «ENDIF»
            }
            «IF region.states.exists[connector]»
                // Instantaneous connector traversal
                if (handle_connector) {
                    «FOR state : region.connectorsInTopologicalOrder»
                        if (context->_state.«structure.uniqueName(region)»_activeState == «structure.uniqueEnumName(state)») {  // «state.label.nullOrEmpty ? state.name : state.label»
                            «FOR t : state.outgoingTransitions»
                                «IF t.trigger === null»
                                    «IF !t.isFirst(state.outgoingTransitions)»else «ENDIF»if (1) { // Priority «t.priority»
                                «ELSE»
                                    «IF !t.isFirst(state.outgoingTransitions)»else «ENDIF»if («t.trigger.serializeHR») { // Priority «t.priority»
                                «ENDIF»
                                    «IF !t.effects.empty»
                                        // Effects
                                        «FOR e : t.effects»
                                            «e.serializeHR»;
                                        «ENDFOR»
                                        
                                    «ENDIF»
                                    «IF t.targetState.connector»
                                        // Go to next connector «t.targetState.name» («structure.pathID(t.targetState)»)
                                        context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                    «ELSE»
                                        // Go to state «t.targetState.label.nullOrEmpty ? t.targetState.name : t.targetState.label» («structure.pathID(t.targetState)»)
                                        context->_state.«structure.uniqueName(region)»_activeState = «structure.uniqueEnumName(t.targetState)»;
                                        «IF t.targetState.hasTickBehavior»
                                            «FN_PREFIX»«structure.uniqueName(t.targetState)»_reset(context);
                                            «FN_PREFIX»«structure.uniqueName(t.targetState)»_tick(context);
                                        «ENDIF»
                                    «ENDIF»
                                }
                            «ENDFOR»
                        }
                    «ENDFOR»
                }
            «ENDIF»
        }
        '''
    }
    
    def String synthesizeTerminationCondition(State s) {
        return s.regions.filter(ControlflowRegion).map[ r |
            if (!r.final) {
                if (r.allFinalStates.empty) {
                    return "0"
                } else {
                    return r.allFinalStates.join("(", " || ", ")", ['''context->_state.«structure.uniqueName(r)»_activeState == «structure.uniqueEnumName(it)»'''])
                }
            }
        ].join(" && ")
    }
    
    def outgoingPreemptiveTransitions(State s) {
        return s.outgoingTransitions.filter[isStrongAbort]
    }
    
    def outgoingNonPreemptiveTransitions(State s) {
        return s.outgoingTransitions.filter[!isStrongAbort]
    }
    
    def boolean isFirst(Transition t, Iterable<Transition> l) {
        return l.head == t
    }

    def Iterable<State> connectorsInTopologicalOrder(ControlflowRegion r) {
        val sorted = newLinkedHashSet()
        val connectors = newLinkedHashSet
        connectors.addAll(r.states.filter[connector])
        for (c : connectors) {
            if (!sorted.contains(c)) {
                connectorsInTopologicalOrder(c, sorted, newHashSet)
            }
        }
        return sorted
    }
    def void connectorsInTopologicalOrder(State s, LinkedHashSet<State> sorted, Set<State> visited) {
        if (!s.isConnector || sorted.contains(s)) {
            return
        }
        if (visited.contains(s)) {
            environment.errors.add("This compilation approach cannot handle instantaneous cycles in connector states!")
            return
        }
        // Mark
        visited.add(s)
        // Add incoming connectors first
        for (pre : s.incomingTransitions.map[sourceState].filter[connector]) {
            connectorsInTopologicalOrder(pre, sorted, visited)
        }
        sorted.add(s)
    }
    
    def List<List<Transition>> connectorPaths(State s, Set<State> visited) {
        if (visited.contains(s)) {
            environment.errors.add("This compilation approach cannot handle instantaneous cycles in connector states!")
            return emptyList
        }
        if (s.connector) {
            val paths = newLinkedList
            for (t : s.outgoingTransitions) {
                visited.add(s)
                val subPath = connectorPaths(t.targetState, visited)
                visited.remove(s)
                if (subPath.empty) {
                    paths.add(newLinkedList(t))
                } else {
                    for (p : subPath) {
                        paths.add(newLinkedList(t) => [it.addAll(p)])
                    }
                }
            }
            return paths
        }
        return emptyList
    }
    
    def boolean hasTickBehavior(State s) {
        return s.isHierarchical || s.hasDuringActions || s.hasEntryActions
    }
      
    def boolean hasExitBehavior(Scope s) {
        if (s instanceof State) {
            return s.hasExitActions || (s.isHierarchical && s.regions.exists[it.hasExitBehavior])
        } else if (s instanceof ControlflowRegion) {
            s.states.exists[it.hasExitBehavior]
        }
        return false
    }
    
    /**
     * Adds hostcode additions. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def String hostcodeAdditions() {
        val sb = new StringBuilder
        val includes = modifications.get(CCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        val hostcodePragmas = model.getStringPragmas(CCodeGeneratorModule.HOSTCODE) + model.getStringPragmas(CCodeGeneratorModule.HOSTCODE_C)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
        return sb.toString
    }
    
    /**
     * Adds hostcode additions for header. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def String hostcodeHeaderAdditions() {
        val sb = new StringBuilder
        val includes = modifications.get(CCodeSerializeHRExtensions.HEADER_INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        if (model.eAllContents.exists[it instanceof NullValue]) {
            sb.append("#ifndef NULL\n#define NULL 0\n#endif\n")
        }
        
        val hostcodePragmas = model.getStringPragmas(CCodeGeneratorModule.HOSTCODE) + model.getStringPragmas(CCodeGeneratorModule.HOSTCODE_HEADER)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
        return sb.toString
    } 
}

class StatebasedStructure extends AbstractStatebasedLeanTemplate {
    
    var State root
    protected val ids = <Scope, String> newHashMap
    
    def void init(State rootState, String enumPrefix) {
        root = rootState
        ids.clear()
        scopes = <Scope> newLinkedList
        scopeNames = <Scope, String> newHashMap
        scopeEnumNames = <Scope, String> newHashMap
        contextStructNames = <Scope, String> newHashMap
        regionCounter = 0
        stateEnumCounter = 1
        enumerateScopes(rootState, "", enumPrefix) 
    }
    
    def String pathID(Scope scope) {
        var id = ""
        if (!ids.containsKey(scope)) {
            var s = scope
            while (s !== null && s !== root) {
                switch(s) {
                    State: {
                        id = "S" + s.parentRegion.states.indexOf(s) + id
                        s = s.parentRegion
                    },
                    Region: {
                        id = "R" + s.parentState.regions.indexOf(s) + id
                        s = s.parentState
                    }
                }
            }
            ids.put(scope, id)
        } else {
            id = ids.get(scope)
        }
        return id
    }
    
    def String pathInfo(Scope scope) {
        var info = ""
        var s = scope
        while (s !== null) {
            val name = s.label.nullOrEmpty ? s.name : s.label
            if (info.nullOrEmpty) {
                info = name
            } else {
                info = name + " -> " + info
            }
            switch(s) {
                State: {
                    s = s.parentRegion
                },
                Region: {
                    s = s.parentState
                }
            }
        }
        return info
    }
    
    override enumerateState(State scope, String namePrefix, String enumPrefix) {
        // Check if this scope has no unique name yet 
        if (!scopeNames.containsKey(scope)) {
            val name = if (scope == root) {
                    scope.name.hostcodeSafeName
                } else {
                    '''«pathID(scope)»_«scope.name.hostcodeSafeName»'''
                }
            // Store this unique state name in the name cache
            scopeNames.put(scope, name)
            scopeEnumNames.put(scope, enumPrefix + name.toUpperCase)
        }

        // Enumerate all the regions in this state, if this is a superstate
        for (region : scope.regions.filter(ControlflowRegion)) {
            enumerateScopes(region, "", enumPrefix)
        }
    }

    override enumerateControlflowRegion(ControlflowRegion scope, String namePrefix, String enumPrefix) {
        // Check if this scope has no unique name yet 
        if (!scopeNames.containsKey(scope)) {
            var String name
            if (scope.name.nullOrEmpty) {
                // Generate a name with a running number if no region name is defined
                name = '''«pathID(scope)»_anon'''
            } else {
                name = '''«pathID(scope)»_«scope.name.hostcodeSafeName»'''
            }
            // Store this unique region name in the name cache
            scopeNames.put(scope, name)
            contextStructNames.put(scope, pathID(scope) + scope.uniqueName.lowerCapital)
        }
        // Enumerate all the states contained in the region
        for (state : scope.states) {
            enumerateScopes(state, scope.uniqueName, enumPrefix)
        }
    }
}
