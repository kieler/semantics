/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.c

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeSerializeHRExtensions
import java.util.List

/**
 * @author ssm
 * @kieler.design 2018-12-06 proposed 
 * @kieler.rating 2018-12-06 proposed yellow 
 * 
 */
class StatebasedLeanCTemplate extends AbstractStatebasedLeanTemplate {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    
    @Accessors extension StatebasedCCodeSerializeHRExtensions serializer
    
    @Accessors val header = new StringBuilder
    @Accessors val source = new StringBuilder
    
    @Accessors var boolean debug = false;
    
    def void create(State rootState) {
        this.rootState = rootState
        
        scopes = <Scope> newLinkedList
        scopeNames = <Scope, String> newHashMap
        scopeEnumNames = <Scope, String> newHashMap
        contextStructNames = <Scope, String> newHashMap
        regionCounter = 0
        stateEnumCounter = 1
        enumerateScopes(rootState, "", "")
     
        createHeader
        createSource   
    }
    
    protected def void createHeader() {
        val code = 
            '''
            // The chosen scheduling regime (IUR) uses four states to maintain the statuses of threads."),
            typedef enum {
              TERMINATED,
              RUNNING,
              READY,
              PAUSING
            } ThreadStatus;
            
            // Interface
            typedef struct {
              « rootState.createDeclarations »
            } Iface;
            
            « FOR r : scopes.filter(ControlflowRegion).toList.reverse »
             
            // This enum contains all states of the « r.name » region
            typedef enum {
                « FOR s : r.states.indexed »« s.value.uniqueEnumName 
                »« IF s.value.isHierarchical », « s.value.uniqueEnumName»RUNNING« ENDIF 
                »« IF s.key < r.states.size-1 », « ENDIF»« ENDFOR »
            } « r.uniqueName »States;
            
            // The thread data of « r.name »
            typedef struct {
              ThreadStatus threadStatus; 
              « r.uniqueName »States activeState; 
              char delayedEnabled; 
              Iface* iface; 
              « FOR c : r.states.map[ regions ].flatten.filter(ControlflowRegion) »
              « c.uniqueName.capitalize »Context « c.uniqueContextName »;
              « ENDFOR »
            } « r.uniqueName.capitalize »Context;
            « ENDFOR »
            
            // Root level data of the program
            typedef struct {
              Iface iface;
              ThreadStatus threadStatus;
              
              « FOR r : rootState.regions.filter(ControlflowRegion) »
              « r.uniqueContextMemberName » « r.uniqueName »;
              « ENDFOR »
            } TickData;
            
            
«««            « FOR s : scopes »
«««                static inline void « s.uniqueName »(« s.uniqueContextMemberName » *context);
«««                « IF (s instanceof State && (s as State).isHierarchical) && s !== rootState »
«««                static inline void « s.uniqueName »_running(« s.uniqueContextMemberName » *context);
«««                « ENDIF »
«««            « ENDFOR »
            
            void reset(TickData *context);
            void tick(TickData *context);
            '''
        
        header.append(code)        
    }
    
    protected def void createSource() {
        
        for (s : scopes.reverse) {
            switch (s) {
                State: source.append(createSourceState(s))
                ControlflowRegion: source.append(createSourceControlflowRegion(s))
            }
        }
           
        source.append(createSourceReset)
        source.append(createSourceTick)
    }
    
    protected def CharSequence createSourceReset() {
        '''
        void reset(TickData *context) {
          «FOR r : rootState.regions.filter(ControlflowRegion) »
          « setInterface("context->" + r.uniqueContextName + ".", r) »
          context->« r.uniqueContextName ».activeState = « r.states.filter[ initial ].head.uniqueEnumName »;
          context->« r.uniqueContextName ».threadStatus = READY;
          « ENDFOR »
          
          context->threadStatus = READY;
        }
        
        '''
    }
    
    protected def CharSequence createSourceTick() {
        '''
        void tick(TickData *context) {
          « IF debug »printf("TICK\n"); fflush(stdout);« ENDIF »
          if (context->threadStatus == TERMINATED) return;
          
          « rootState.uniqueName »(context);
        }
        
        '''
    }
    
    protected def CharSequence createSourceState(State state) {
        '''
        static inline void « state.uniqueName »(« state.uniqueContextMemberName » *context) {
          « IF debug »printf("« state.uniqueName »\n"); fflush(stdout);« ENDIF »
        « IF state.isHierarchical »
          « IF state !== rootState »
            « FOR r : state.regions.filter(ControlflowRegion) »
            
              context->« r.uniqueContextName ».activeState = « r.states.filter[ initial ].head.uniqueEnumName »;
              context->« r.uniqueContextName ».delayedEnabled = 0;
              context->« r.uniqueContextName ».threadStatus = READY;
            « ENDFOR »
            
              context->activeState = « state.uniqueEnumName »RUNNING;
            }
            
            static inline void « state.uniqueName »_running(« state.uniqueContextMemberName » *context) {
          « ENDIF »
          « addSuperstateCode(state) »
        « ELSE »
        « addSimpleStateCode(state)»
        « ENDIF »
        }
        
        '''
    }
    
    protected def CharSequence addSuperstateCode(State state) {
        '''
        « FOR r : state.regions.filter(ControlflowRegion) »
        
          if (context->« r.uniqueName ».threadStatus != TERMINATED) {
            context->« r.uniqueName ».threadStatus = RUNNING;
          }
        « ENDFOR »« FOR r : state.regions.filter(ControlflowRegion) »
        
          « r.uniqueName »(&context->« r.uniqueContextName »);
        « ENDFOR »
        
        « IF state.outgoingTransitions.size == 0 »
          « if (state.isHierarchical) addDelayedEnabledCode(state, "") »
            context->threadStatus = READY;
        « ELSE »
        « addTransitionCollectionCode(state.outgoingTransitions, false) »
          } else {
          « if (state.isHierarchical) addDelayedEnabledCode(state, "  ") »
            context->threadStatus = READY;
          }
        « ENDIF »
        '''
    }
    
    protected def CharSequence addSimpleStateCode(State state) {
        if (state.isFinal) {
        '''  context->threadStatus = TERMINATED;''' 
        } else {
        '''
        « addTransitionCollectionCode(state.outgoingTransitions, false) »
        « IF state.outgoingTransitions.defaultTransition === null »
          « IF state.outgoingTransitions.size == 0 »
            context->threadStatus = READY;
          « ELSE »
            } else {
              context->threadStatus = READY;
            }
          « ENDIF »
        « ENDIF »
        '''
        }
    }
    
    protected def getDefaultTransition(List<Transition> transitions) {
        return transitions.indexed.findFirst[ value.trigger === null && 
            value.delay == DelayType.IMMEDIATE && value.preemption != PreemptionType.TERMINATION]
    }
    
    protected def CharSequence addTransitionCollectionCode(List<Transition> transitions, boolean closeBrackets) {
        val defaultTransition = transitions.defaultTransition
        val hasDefaultTransition = defaultTransition !== null
        val defaultTransitionIndex = if (hasDefaultTransition) defaultTransition.key else -1    
            
        '''
        « IF transitions.size == 1 && 
             transitions.head.delay == DelayType.IMMEDIATE && 
             transitions.head.trigger === null &&
             transitions.head.preemption != PreemptionType.TERMINATION »
        « addTransitionEffectCode(transitions.head, "  ") »
        « ELSE »
          « FOR t : transitions.indexed »
          « addTransitionConditionCode(t.key, transitions.size, t.value, defaultTransitionIndex) » 
          « ENDFOR »
          « IF transitions.size > 0 && closeBrackets »  }« ENDIF »
        « ENDIF »
        '''
    }    
    
    protected def CharSequence addDelayedEnabledCode(State state, CharSequence indentation) {
        '''
        
        « FOR r : state.regions.filter(ControlflowRegion) »
        « indentation »  context->« r.uniqueName ».delayedEnabled = 1;
        « ENDFOR » 
        '''        
    }
    
    protected def CharSequence addTransitionConditionCode(int index, int count, Transition transition, 
        int defaultTransitionIndex
    ) {
        val hasDefaultTransition = defaultTransitionIndex >= 0
        
        // This transition can be skipped if there is a default transition which has already been processed
        if (hasDefaultTransition && defaultTransitionIndex < index) return "";
        
        valuedObjectPrefix = "context->iface->"
        val defaultTransition = transition.trigger === null && transition.delay == DelayType.IMMEDIATE;
        var CharSequence condition = ""
        if (transition.preemption == PreemptionType.TERMINATION) {
            val termRegions = transition.sourceState.regions.filter(ControlflowRegion).indexed
            for (r : termRegions) {
                condition = condition + "context->" + r.value.uniqueContextName + ".threadStatus == TERMINATED"
                if (r.key != termRegions.size - 1) condition = condition + " && \n    " 
            }                
        } else {
            if (transition.immediate) {
                if (transition.trigger !== null) condition = transition.trigger.serializeHR 
                    else condition = "1"
            } else {
                if (transition.trigger === null) condition = "context->delayedEnabled" 
                    else condition = "context->delayedEnabled && (" + transition.trigger.serializeHR + ")"
            }  
        }
        valuedObjectPrefix = ""
        
        '''
          « IF index == 0 »
          if (« condition ») {
        « ELSE »
          } else «IF !(defaultTransition) »if (« condition ») « ENDIF»{
        « ENDIF » 
        « addTransitionEffectCode(transition, "    ") »
          « IF (index == count-1 && hasDefaultTransition) || (index == defaultTransitionIndex) »
          }
        « ENDIF »
        '''
    }
    
    protected def CharSequence addTransitionEffectCode(Transition transition, CharSequence indentation) {
        valuedObjectPrefix = "context->iface->"     
        '''
          « FOR e : transition.effects »
          « indentation »« e.serializeHR »;
          « ENDFOR »
          « indentation »context->delayedEnabled = 0;
          « IF transition.sourceState != transition.targetState || transition.targetState.isHierarchical »
          « indentation »context->activeState = « transition.targetState.uniqueEnumName »;
          « ENDIF »
          « valuedObjectPrefix = "" »
        '''    
    }
    
    protected def CharSequence createSourceControlflowRegion(ControlflowRegion region) {
        '''
        static void « region.uniqueName »(« region.uniqueContextMemberName » *context) {
          while (context->threadStatus == RUNNING) {
            switch (context->activeState) {
              « FOR s : region.states »
              case « s.uniqueEnumName »:
                « s.uniqueName »(context);
                « IF s.isHierarchical »
                      // Superstate: intended fall-through 
              
                    case « s.uniqueEnumName »RUNNING:
                      « s.uniqueName »_running(context);
                      break;
                « ELSE »
                break;
                « ENDIF »
              
              « ENDFOR »
            }
          }
        }
        
        '''        
    }
    
    protected def CharSequence createDeclarations(State state) {
        val sb = new StringBuilder
        for (declaration : rootState.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects) {
                val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                    declaration.type.serializeHR
                    else declaration.hostType
                sb.append(  
                  '''
                    « declarationType » « valuedObject.name »« 
                    IF (valuedObject.isArray) »« FOR cardinality : valuedObject.cardinalities »[« cardinality.serializeHR »]« 
                    ENDFOR »« ENDIF 
                    »;« IF declaration.input » // Input« ENDIF »« 
                    IF declaration.output » // Output« ENDIF»
                  '''
                )
            }
        }
        
        return sb.toString
    }
    
    protected def String setInterface(String prefix, ControlflowRegion r) {
        var code = 
            '''
              « prefix »iface = &(context->iface);
            '''
        
        for (r2 : r.states.filter[ isHierarchical ].map[ regions ].flatten.filter(ControlflowRegion)) {
            code = code + setInterface(prefix + r2.uniqueName + ".", r2)
        }
        
        return code
    }    
}
