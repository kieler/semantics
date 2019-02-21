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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeSerializeHRExtensions
import java.util.List
import de.cau.cs.kieler.sccharts.Scope
import java.util.Map
import de.cau.cs.kieler.sccharts.ControlflowRegion
import static extension de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.StatebasedLeanCCodeGenerator.hostcodeSafeName
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions

/**
 * @author ssm
 * @kieler.design 2018-12-06 proposed 
 * @kieler.rating 2018-12-06 proposed yellow 
 * 
 */
class StatebasedLeanCTemplate {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension StatebasedCCodeSerializeHRExtensions
    
    @Accessors val header = new StringBuilder
    @Accessors val source = new StringBuilder
    
    @Accessors var boolean debug = false;
    
    protected State rootState
    protected List<Scope> scopes
    protected Map<Scope, String> scopeNames
    protected Map<Scope, String> scopeEnumNames
    protected Map<Scope, String> contextStructNames
    protected var int regionCounter
    protected var int stateEnumCounter
    
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
    
    protected def void enumerateScopes(Scope scope, String namePrefix, String contextPrefix) {
        scopes += scope
        if (scope instanceof State) {
            if (!scopeNames.containsKey(scope)) {
                val name = if (namePrefix.nullOrEmpty) scope.name.hostcodeSafeName else namePrefix + '''_state''' + scope.name.hostcodeSafeName
                scopeNames.put(scope, name)
            }
            
            var enumName = scope.name.hostcodeSafeName.toUpperCase
            
            while (scopeEnumNames.containsValue(enumName)) {
                enumName = scope.name.hostcodeSafeName.toUpperCase + (stateEnumCounter++)
            }
            
            scopeEnumNames.put(scope, enumName)
            for (region : scope.regions.filter(ControlflowRegion)) {
                val newContextPrefix = if (scope.parentRegion === null) contextPrefix  
                    else contextPrefix + scope.parentRegion.uniqueName.lowerCapital + '''.'''
                enumerateScopes(region, scopeNames.get(scope), newContextPrefix)
            }
        } else if (scope instanceof ControlflowRegion) {
            if (!scopeNames.containsKey(scope)) {
                val name = if (scope.name.nullOrEmpty) '''R''' + (regionCounter++) else scope.name.hostcodeSafeName
                scopeNames.put(scope, namePrefix + '''_region''' + name)
                
                contextStructNames.put(scope, contextPrefix + scope.uniqueName.lowerCapital)
            }
            for (state : scope.states) {
                enumerateScopes(state, scopeNames.get(scope), contextPrefix)
            }
            
        }
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
          
          « FOR r : rootState.regions.filter(ControlflowRegion) »
          if (context->« r.uniqueContextName ».threadStatus != TERMINATED) {
            context->« r.uniqueContextName ».threadStatus = RUNNING;
            context->« r.uniqueContextName ».delayedEnabled = 1;
          }
          « ENDFOR »
          
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
        « ENDIF »
        
        « addSimpleStateCode(state)»
        }
        
        '''
    }
    
    protected def CharSequence addSuperstateCode(State state) {
        '''
        « FOR r : state.regions.filter(ControlflowRegion) »
        
          if (context->« r.uniqueName ».threadStatus != TERMINATED) {
            context->« r.uniqueName ».threadStatus = RUNNING;
            context->« r.uniqueName ».delayedEnabled = 1;
          }
        « ENDFOR »« FOR r : state.regions.filter(ControlflowRegion) »
        
          « r.uniqueName »(&context->« r.uniqueContextName »);
        « ENDFOR »        
        '''
    }
    
    protected def CharSequence addSimpleStateCode(State state) {
        val hasDefaultTransition = state.outgoingTransitions.exists[ trigger === null && 
            delay == DelayType.IMMEDIATE && preemption != PreemptionType.TERMINATION
        ]
        
        if (state.isFinal) {
        '''  context->threadStatus = TERMINATED;''' 
        } else {
        '''
        « IF state.outgoingTransitions.size == 1 && 
             state.outgoingTransitions.head.delay == DelayType.IMMEDIATE && 
             state.outgoingTransitions.head.trigger === null &&
             state.outgoingTransitions.head.preemption != PreemptionType.TERMINATION »
        « addTransitionEffectCode(state.outgoingTransitions.head, "  ") »
        « ELSE »
          « FOR t : state.outgoingTransitions.indexed »
          « addTransitionConditionCode(t.key, state.outgoingTransitions.size, t.value, hasDefaultTransition) » 
          « ENDFOR »
            « IF !hasDefaultTransition »
              « IF state.outgoingTransitions.size == 0 »
              context->threadStatus = READY;
              « ELSE »
              } else {
                context->threadStatus = READY;
              }
              « ENDIF »
          « ENDIF »
        « ENDIF »
        '''
        }
    }
    
    protected def CharSequence addTransitionConditionCode(int index, int count, Transition transition, 
        boolean hasDefaultTransition
    ) {
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
                    else condition = "context->delayedEnabled && " + transition.trigger.serializeHR
            }  
        }
        
        valuedObjectPrefix = ""
        
        '''
          « IF index == 0 »
          if (« condition ») {
        « ELSE »
          } else «IF !(defaultTransition) »if (« condition ») {« ENDIF »
        « ENDIF » 
        « addTransitionEffectCode(transition, "    ") »
          « IF index == count-1 && hasDefaultTransition »
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
          « IF transition.sourceState != transition.targetState »
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
    
    
    
    
    
    protected def String uniqueName(Scope scope) {
        scopeNames.get(scope)
    }
    
    protected def String capitalize(String string) {
        string.substring(0, 1).toUpperCase + string.substring(1) 
    }

    protected def String lowerCapital(String string) {
        string.substring(0, 1).toLowerCase + string.substring(1) 
    }
    
    protected def String uniqueEnumName(State state) {
        scopeEnumNames.get(state)
    }
    
    protected def String uniqueContextName(Scope scope) {
        if (scope instanceof State) {
            if (scope == rootState) {
                '''TickData'''            
            } else {
                scope.parentRegion.uniqueName
            }
        } else if (scope instanceof ControlflowRegion) {
            scope.uniqueName
        }
    }
    
    protected def String uniqueContextMemberName(Scope scope) {
        if (scope instanceof State) {
            if (scope == rootState) {
                '''TickData'''            
            } else {
                scope.parentRegion.uniqueName + "Context"
            }
        } else if (scope instanceof ControlflowRegion) {
            scope.uniqueName.capitalize + "Context"       
        }
    }
        
}