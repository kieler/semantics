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
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.Action
import static extension de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate.ReturnSourceCode.*

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
    @Inject extension SCChartsTransitionExtensions
    
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
                »« IF s.value.isHierarchical || s.value.hasActions », « s.value.uniqueEnumName»RUNNING« ENDIF
                »« IF s.value.hasEntryActions », « s.value.uniqueEnumName»ENTRY« ENDIF 
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
              char delayedEnabled;
              
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
          context->delayedEnabled = 0;
        « IF rootState.hasEntryActions »  « rootState.uniqueName »_entry(context);
        « ENDIF »
        }
        
        '''
    }
    
    protected def CharSequence createSourceTick() {
        '''
        void tick(TickData *context) {
          « IF debug »printf("TICK\n"); fflush(stdout);« ENDIF »
          if (context->threadStatus == TERMINATED) return;
          
          « rootState.uniqueName »(context);
          context->delayedEnabled = 1;
        }
        
        '''
    }
    
    protected def CharSequence createSourceState(State state) {
        '''
        static inline void « state.uniqueName »(« state.uniqueContextMemberName » *context) {
          « IF debug »printf("« state.uniqueName »\n"); fflush(stdout);« ENDIF »
        « IF state.isHierarchical || state.hasActions »
          « IF state !== rootState »
            « FOR r : state.regions.filter(ControlflowRegion) »
            
              context->« r.uniqueContextName ».activeState = « r.states.filter[ initial ].head.uniqueEnumName »;
              context->« r.uniqueContextName ».delayedEnabled = 0;
              context->« r.uniqueContextName ».threadStatus = READY;
            « ENDFOR »
            « if (state.hasEntryActions) state.addSuperstateEntryActionCode(true) »
              context->activeState = « state.uniqueEnumName »RUNNING;
            }
            
            static inline void « state.uniqueName »_running(« state.uniqueContextMemberName » *context) {
          « ENDIF »                
          « addSuperstateCode(state) »
          « IF state == rootState && state.hasEntryActions »
«««       // Root state has entry actions
          « state.addSuperstateEntryActionCode(false) »
          « ENDIF »
        « ELSE »
        « addSimpleStateCode(state)»
        « ENDIF »
        }
        
        '''
    }
    
    protected def CharSequence addSuperstateEntryActionCode(State state, boolean redirect) {
        val entryActions = state.entryActions.toList
        val hasWeakEntryActions = entryActions.exists[ isWeak ]
        val redirectCode = if (redirect) '''  context->activeState = « state.uniqueEnumName »ENTRY;
''' else '';

        redirectCode + '''
}

''' +   '''
        static inline void « state.uniqueName »_entry(« state.uniqueContextMemberName » *context) {
        « FOR r : entryActions.filter[ isStrong ].indexed »  
        « addActionConditionCode(r.key, entryActions.size, r.value, false, NONE) »
        « ENDFOR »
        « IF hasWeakEntryActions »
        « addTransitionCollectionCode(state.outgoingTransitions.filter[ isStrongAbort ].toList, true, ONLY) »
        « FOR r : entryActions.filter[ isWeak ].indexed »
        « addActionConditionCode(r.key, entryActions.size, r.value, false, NONE) »
        « ENDFOR »
        « ENDIF »
        '''
    }
    
    protected def CharSequence addSuperstateCode(State state) {
        val weakAborts = state.outgoingTransitions.filter[ !isStrongAbort ].toList
        val onlyDefaultTransition = weakAborts.size == 1 && weakAborts.getDefaultTransition !== null
        
        '''
        « FOR r : state.regions.filter(ControlflowRegion) »
        
          if (context->« r.uniqueName ».threadStatus != TERMINATED) {
            context->« r.uniqueName ».threadStatus = RUNNING;
          }
          
        « ENDFOR »
        « state.addSuperstateStrongAbortCode »
        « state.addSuperstateDuringActionCode »
        « FOR r : state.regions.filter(ControlflowRegion) »
        
          « r.uniqueName »(&context->« r.uniqueContextName »);
        « ENDFOR »
        
        « IF weakAborts.size == 0 »
          « if (state.isHierarchical) addDelayedEnabledCode(state, "") »
            context->threadStatus = READY;
        « ELSE »
        « addTransitionCollectionCode(weakAborts, false, NONE) »
        « IF !onlyDefaultTransition »  } else {« ENDIF »
          « if (state.isHierarchical) addDelayedEnabledCode(state, "  ") »
            context->threadStatus = READY;
        « IF !onlyDefaultTransition »  }« ENDIF »
        « ENDIF »
        '''
    }
    
    protected def CharSequence addSuperstateStrongAbortCode(State state) {
        val strongAborts = state.outgoingTransitions.filter[ isStrongAbort ].toList
        
        if (!strongAborts.empty) {
            '''
            « addTransitionCollectionCode(strongAborts, true, ADD) »
            '''
        } else {
            ''''''
        }
    }
    
    protected def CharSequence addSuperstateDuringActionCode(State state) {
        val duringActions = state.duringActions.toList
        
        if (!duringActions.empty) {
        '''
        « FOR r : duringActions.indexed »  
        « addActionConditionCode(r.key, duringActions.size, r.value, true, NONE) »
        « ENDFOR »
        '''
        } else {
            ''''''
        }
    }    
    
    protected def CharSequence addSimpleStateCode(State state) {
        if (state.isFinal) {
        '''  context->threadStatus = TERMINATED;''' 
        } else {
            '''
            « addTransitionCollectionCode(state.outgoingTransitions, false, NONE) »
            « IF state.outgoingTransitions.defaultTransition === null »
            « IF state.outgoingTransitions.size == 0 »  context->threadStatus = READY;
            « ELSE »  } else {
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
    
    protected def CharSequence addTransitionCollectionCode(List<Transition> transitions, boolean closeBrackets, 
        ReturnSourceCode addReturnCode
    ) {
        val defaultTransition = transitions.defaultTransition
        val hasDefaultTransition = defaultTransition !== null
        val defaultTransitionIndex = if (hasDefaultTransition) defaultTransition.key else -1    
            
        '''
        « IF transitions.size == 1 && 
             transitions.head.delay == DelayType.IMMEDIATE && 
             transitions.head.trigger === null &&
             transitions.head.preemption != PreemptionType.TERMINATION »
        « addActionEffectCode(transitions.head, "  ", addReturnCode) »
        « ELSE »
          « FOR t : transitions.indexed »
          « addTransitionConditionCode(t.key, transitions.size, t.value, defaultTransitionIndex, addReturnCode) » 
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
        int defaultTransitionIndex, ReturnSourceCode addReturnCode
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
        « addActionEffectCode(transition, "    ", addReturnCode) »
          « IF (index == count-1 && hasDefaultTransition) || (index == defaultTransitionIndex) »
          }
        « ENDIF »
        '''
    }
    
    protected def CharSequence addActionConditionCode(int index, int count, Action action, 
        boolean addDelayEnabled, ReturnSourceCode addReturnCode
    ) {
        if (action.eContainer == rootState) {
            valuedObjectPrefix = "context->iface."
        } else {
            valuedObjectPrefix = "context->iface->"
        }
        var CharSequence condition = ""
        if (action.immediate) {
            if (action.trigger !== null) condition = action.trigger.serializeHR 
                else condition = ""
        } else {
            if (addDelayEnabled) condition = "context->delayedEnabled" 
            if (action.trigger !== null) {
                condition = condition + " && (" + action.trigger.serializeHR + ")"
             }
        }  
        valuedObjectPrefix = ""
        
        '''
        « IF condition != "" »  if (« condition ») {« ENDIF»
            « addActionEffectCode(action, "", addReturnCode) »
        « IF condition != "" »  }« ENDIF»
        '''
    }    
    
    protected def CharSequence addActionEffectCode(Action action, CharSequence indentation, 
        ReturnSourceCode addReturnCode
    ) {
        
        if (addReturnCode == ONLY) {
            return '''    return;'''
        }
        
        if (action.eContainer == rootState) {
            valuedObjectPrefix = "context->iface."
        } else {
            valuedObjectPrefix = "context->iface->"
        }
     
        '''
          « FOR e : action.effects »
          « indentation »« e.serializeHR »;
          « ENDFOR »
          « IF action instanceof Transition »
          « indentation »context->delayedEnabled = 0;
          « IF action.sourceState != action.targetState || action.targetState.isHierarchical »
          « indentation »context->activeState = « action.targetState.uniqueEnumName »;
          « ENDIF »
          « ENDIF »
          « IF addReturnCode == ADD || addReturnCode == ONLY »    return;« ENDIF»
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
        « IF s.isHierarchical || s.hasActions »// Superstate: intended fall-through 
      « IF s.hasEntryActions »case « s.uniqueEnumName »ENTRY:
        « s.uniqueName »_entry(context);
        // Superstate: intended fall-through « ENDIF »
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
