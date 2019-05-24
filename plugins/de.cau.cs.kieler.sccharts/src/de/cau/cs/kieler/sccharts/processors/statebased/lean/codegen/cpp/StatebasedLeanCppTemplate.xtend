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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.cpp

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.cpp.StatebasedCppCodeSerializeHRExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * Code generator template for lean statebased C++ code.
 * 
 * @author wechselberg
 */
class StatebasedLeanCppTemplate extends AbstractStatebasedLeanTemplate {

    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension StatebasedCppCodeSerializeHRExtensions

    @Accessors val header = new StringBuilder
    @Accessors val source = new StringBuilder

    @Accessors var boolean debug = false

    @Accessors var String namespace = null
    @Accessors var String superClass = null
    
    def void create(State rootState) {
        this.rootState = rootState

        scopes = <Scope>newLinkedList
        scopeNames = <Scope, String>newHashMap
        scopeEnumNames = <Scope, String>newHashMap
        contextStructNames = <Scope, String>newHashMap
        regionCounter = 0
        stateEnumCounter = 1
        enumerateScopes(rootState)

        createHeader
        createSource 
    }

    protected def void createHeader() {
        header.append('''
            « IF namespace !== null »
                namespace « namespace » {

            « ENDIF »
            class « rootState.uniqueName »« IF superClass !== null » : public « superClass »« ENDIF »
            {
              public:
                // The chosen scheduling regime (IUR) uses four states to maintain the statuses of threads.
                enum ThreadStatus
                {
                  TERMINATED, RUNNING, READY, PAUSING
                };

                // External interface (and local variables)
                class Iface
                {
                  public:
                    Iface();

                    « FOR valuedObject : rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten »
                        « createDeclaration(valuedObject) »
                    « ENDFOR »
                };
                « FOR r : scopes.filter(ControlflowRegion).toList.reverse »

                    // This enum contains all states of the « r.name » region
                    enum « r.uniqueName »States
                    {
                      « FOR s : r.states.indexed SEPARATOR ', '
                      »« s.value.uniqueEnumName 
                      »« IF s.value.isHierarchical », « s.value.uniqueEnumName »RUNNING« ENDIF »«
                      ENDFOR »
                    };
                    
                    String « r.uniqueName »States_toSourceState(« r.uniqueName »States state);

                    // The thread data of « r.name »
                    class « r.uniqueContextMemberName »
                    {
                      public:
                        ThreadStatus threadStatus;
                        « r.uniqueName »States activeState;
                        bool delayedEnabled;
                        « FOR c : r.states.map[ regions ].flatten.filter(ControlflowRegion) »
                            « c.uniqueContextMemberName » « c.uniqueContextName »;
                        « ENDFOR »
                    };
                « ENDFOR »
            
                // Root level data of the program
                class TickData
                {
                  public:
                    ThreadStatus threadStatus;
                    « FOR r : rootState.regions.filter(ControlflowRegion) »
                        « r.uniqueContextMemberName » « r.uniqueContextName »;
                    « ENDFOR »
                };

                Iface iface;
                TickData rootContext;
                « IF rootState.hasAnnotation("ContextType") »
                « rootState.getStringAnnotationValue("ContextType") » externalContext;
                « ENDIF »

                void reset(); 

                void tick();

                void init();
                « FOR s : scopes »

                « IF (s instanceof State) »
                void logic_« s.uniqueName »(« s.uniqueContextMemberName » &context);
                « IF s.isHierarchical && s != rootState »

                void logic_« s.uniqueName »_running(« s.uniqueContextMemberName » &context);
                « ENDIF »
                « ENDIF »
                « IF (s instanceof ControlflowRegion) »
                void logic_« s.uniqueName »(« s.uniqueContextMemberName » &context);
                « ENDIF »
                « ENDFOR »

              private:
                String toSourceState(
            };
            « IF namespace !== null »

                } // namespace
            « ENDIF »
        ''')
    }

    protected def void createSource() {
        source.append('''
            « IF namespace !== null »
                namespace « namespace » {

            « ENDIF »        
            « FOR s : scopes »
            « IF s instanceof State »
                « createSourceState(s) »
            « ELSEIF s instanceof ControlflowRegion »
                « createSourceControlflowRegion(s) »
            « ENDIF »

            « ENDFOR »
            void « rootState.uniqueName »::reset()
            {
              « FOR r : rootState.regions.filter(ControlflowRegion) »
                  rootContext.« r.uniqueContextName ».activeState = « r.states.filter[ initial ].head.uniqueEnumName »;
                  rootContext.« r.uniqueContextName ».threadStatus = READY;

              « ENDFOR »
              rootContext.threadStatus = READY;
            }

            void « rootState.uniqueName »::tick()
            {
              if (rootContext.threadStatus == TERMINATED) return;
            
              logic_« rootState.uniqueName »(rootContext);
            }
            
            void « rootState.uniqueName »::init()
            {
              reset();
              tick();
            }
            
            « rootState.uniqueName »::Iface::Iface()
            {
              « FOR valuedObject : rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten »
                « IF !valuedObject.isArray && valuedObject.type != ValueType.HOST »
                  « valuedObject.serializeInitialization »
                « ENDIF »
              « ENDFOR »
            }
            « IF namespace !== null »

                } // namespace
            « ENDIF »
        ''')
    }

    protected def CharSequence createSourceState(State state) {
        return '''
            void «rootState.uniqueName»::logic_«state.uniqueName»(«state.uniqueContextMemberName» &context)
            {
            « IF state.isHierarchical »
            « IF state !== rootState »
              « FOR r : state.regions.filter(ControlflowRegion) »
                context.« r.uniqueContextName ».activeState = « r.states.filter[ initial ].head.uniqueEnumName »;
                context.« r.uniqueContextName ».delayedEnabled = false;
                context.« r.uniqueContextName ».threadStatus = READY;
              « ENDFOR »
            
              context.activeState = « state.uniqueEnumName »RUNNING;
            }

            void « rootState.uniqueName »::logic_« state.uniqueName »_running(« state.uniqueContextMemberName » &context)
            {
            « ENDIF »
              « addSuperstateCode(state) »

            « ENDIF »
              « addSimpleStateCode(state) »
            }
        '''
    }

    protected def CharSequence addSuperstateCode(State state) {
        return '''
            « FOR r : state.regions.filter(ControlflowRegion) »
                if (context.« r.uniqueName ».threadStatus != TERMINATED)
                {
                  context.« r.uniqueName ».threadStatus = RUNNING;
                }
            « ENDFOR »
            « FOR r : state.regions.filter(ControlflowRegion) »
                « rootState.uniqueName »::logic_« r.uniqueName »(context.« r.uniqueContextName »);
            « ENDFOR »
        '''
    }

    protected def CharSequence addSimpleStateCode(State state) {
        val hasDefaultTransition = state.outgoingTransitions.exists [
            trigger === null && delay == DelayType.IMMEDIATE && preemption != PreemptionType.TERMINATION
        ]

        return '''
            « IF state.isFinal »
                context.threadStatus = TERMINATED;
            « ELSE »
                « IF state.outgoingTransitions.size == 1 && 
                     state.outgoingTransitions.head.delay == DelayType.IMMEDIATE && 
                     state.outgoingTransitions.head.trigger === null &&
                     state.outgoingTransitions.head.preemption != PreemptionType.TERMINATION »
                    « addTransitionEffectCode(state.outgoingTransitions.head) »
                « ELSE »
                    « FOR t : state.outgoingTransitions.indexed »
                        « addTransitionConditionCode(t.key, state.outgoingTransitions.size, t.value, hasDefaultTransition) »
                    « ENDFOR »
                    « IF !hasDefaultTransition »
                        « IF state.outgoingTransitions.size == 0 »
                            « IF state.isHierarchical »
                                « addDelayedEnabledCode(state) »
                            « ENDIF »
                            context.threadStatus = READY;
                        « ELSE »
                            }
                            else
                            {
                              « IF state.isHierarchical »
                                  « addDelayedEnabledCode(state) »
                              « ENDIF »
                              context.threadStatus = READY;
                            }
                        « ENDIF »
                    « ENDIF »
                « ENDIF »
            «ENDIF»
        '''
    }

    protected def CharSequence addDelayedEnabledCode(State state) {
        return '''
            « FOR r : state.regions.filter(ControlflowRegion) »
                context.« r.uniqueName ».delayedEnabled = true;
            « ENDFOR »
        '''
    }

    protected def CharSequence addTransitionConditionCode(int index, int count, Transition transition,
        boolean hasDefaultTransition) {
        valuedObjectPrefix = "iface."
        val defaultTransition = transition.trigger === null && transition.delay == DelayType.IMMEDIATE;
        var CharSequence condition = ""

        if (transition.preemption == PreemptionType.TERMINATION) {
            val termRegions = transition.sourceState.regions.filter(ControlflowRegion).indexed
            for (r : termRegions) {
                condition = condition + "context." + r.value.uniqueContextName + ".threadStatus == TERMINATED"
                if(r.key != termRegions.size - 1) condition = condition + " && \n    "
            }
        } else {
            if (transition.immediate) {
                if(transition.trigger !== null) condition = transition.trigger.serializeHR else condition = "true"
            } else {
                if (transition.trigger === null)
                    condition = "context.delayedEnabled"
                else
                    condition = '''context.delayedEnabled && («transition.trigger.serializeHR»)'''
            }
        }

        valuedObjectPrefix = ""

        return '''
            « IF index == 0 »
                if (« condition »)
                {
            « ELSE »
                }
                else « IF !(defaultTransition) »if (« condition ») « ENDIF »
                {
            « ENDIF » 
              « addTransitionEffectCode(transition) »
            « IF index == count-1 && hasDefaultTransition »
                }
            « ENDIF »
        '''
    }

    protected def CharSequence addTransitionEffectCode(Transition transition) {
        valuedObjectPrefix = "iface."
        val code = '''
            « FOR e : transition.effects »
                « e.serializeHR »;
            « ENDFOR »
            context.delayedEnabled = false;
            « IF transition.sourceState != transition.targetState || transition.targetState.isHierarchical »
                context.activeState = « transition.targetState.uniqueEnumName »;
            « ENDIF »
        '''
        valuedObjectPrefix = ""
        return code
    }

    protected def CharSequence createSourceControlflowRegion(ControlflowRegion region) {
        return '''
            void « rootState.uniqueName »::logic_« region.uniqueName »(« region.uniqueContextMemberName » &context)
            {
              while (context.threadStatus == RUNNING)
              {
                switch (context.activeState)
                {
                  « FOR s : region.states »
                      case « s.uniqueEnumName »:
                        « rootState.uniqueName »::logic_« s.uniqueName »(context);
                      « IF s.isHierarchical »
                        // Superstate: intended fall-through 
                      case « s.uniqueEnumName »RUNNING:
                        «rootState.uniqueName»::logic_« s.uniqueName »_running(context);
                      « ENDIF »
                        break;
                  « ENDFOR »
                }
              }
            }
        '''
    }

    protected def CharSequence createDeclaration(ValuedObject vo) {
        val voType = if (vo.type != ValueType.HOST || vo.variableDeclaration.hostType.nullOrEmpty) {
                vo.variableDeclaration.type.serializeHR
            } else {
                vo.variableDeclaration.hostType
            }
        val voCardinals = if (vo.isArray) {
                '''[«FOR cardinal : vo.cardinalities SEPARATOR ']['»« cardinal.serializeHR »«ENDFOR»]'''
            } else {
                ''
            }

        return '''
            «voType» «vo.name»«voCardinals»;«IF vo.input » // Input«ENDIF»«IF vo.output » // Output«ENDIF»
        '''
    }

    protected def findModifications() {
        return modifications
    }
}
