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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.java

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
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.java.StatebasedJavaCodeSerializeHRExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author wechselberg
 */
class StatebasedLeanJavaTemplate extends AbstractStatebasedLeanTemplate {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension StatebasedJavaCodeSerializeHRExtensions

    @Accessors val source = new StringBuilder

    def void create(State rootState) {
        this.rootState = rootState

        scopes = <Scope>newLinkedList
        scopeNames = <Scope, String>newHashMap
        scopeEnumNames = <Scope, String>newHashMap
        contextStructNames = <Scope, String>newHashMap
        regionCounter = 0
        stateEnumCounter = 1
        enumerateScopes(rootState)

        createCode
    }

    protected def void createCode() {
        source.append('''
          public class « rootState.uniqueName » {

            public Iface iface;
            private TickData rootContext;

            /**
             * Enumeration for the possible thread states.
             * The chosen scheduling regime (IUR) uses four states to maintain the statuses of threads.
             */
            public enum ThreadStatus {
              TERMINATED, RUNNING, READY, PAUSING;
            }

            /**
             * The interface containing all model variables (inputs, outputs)
             */
            public class Iface {
              « rootState.createDeclarations »
            }

            /**
             * Runtime data for the root level program
             */
            public class TickData {
              ThreadStatus threadStatus;

              « FOR r : rootState.regions.filter(ControlflowRegion) »
                « r.uniqueContextMemberName » « r.uniqueName » = new « r.uniqueContextMemberName »();
              « ENDFOR »
            }
            « FOR r : scopes.filter(ControlflowRegion) »

              /**
               * Enumeration for all states of the « r.name » region
               */
              public enum « r.uniqueName »States {
                « FOR s : r.states.indexed SEPARATOR ', ' 
                  »« s.value.uniqueEnumName »« IF s.value.isHierarchical », « s.value.uniqueEnumName»RUNNING« ENDIF 
                  »« ENDFOR »;
              }

              /**
               * The runtime thread data of region « r.name »
               */
              public class « r.uniqueContextMemberName » {
                ThreadStatus threadStatus;
                « r.uniqueName »States activeState; 
                boolean delayedEnabled; 
                « FOR c : r.states.map[ regions ].flatten.filter(ControlflowRegion) »
                  « c.uniqueContextMemberName » « c.uniqueContextName » = new « c.uniqueContextMemberName »();
                « ENDFOR »
              }
            « ENDFOR »            

            «FOR s : scopes»
              « IF (s instanceof State) »
                « createCodeState(s) »
              « ENDIF »
              « IF (s instanceof ControlflowRegion) »
                « createSourceControlflowRegion(s) »
              « ENDIF »

            « ENDFOR »

            public void reset() {
              « FOR r : rootState.regions.filter(ControlflowRegion) »
                rootContext.« r.uniqueContextName ».activeState = « r.uniqueName »States.« r.states.filter[ initial ].head.uniqueEnumName »;
                rootContext.« r.uniqueContextName ».threadStatus = ThreadStatus.READY;
              « ENDFOR »

              rootContext.threadStatus = ThreadStatus.READY;
            }

            public void tick() {
              if (rootContext.threadStatus == ThreadStatus.TERMINATED) return;

              « rootState.uniqueName »_root(rootContext);
            }

            public « rootState.uniqueName »() {
              this.iface = new Iface();
              this.rootContext = new TickData();
            }

            « FOR globalObject : modifications.get(StatebasedJavaCodeSerializeHRExtensions.GLOBAL_OBJECTS) »
              « globalObject »
            « ENDFOR »
          }
        ''')
    }

    protected def CharSequence createCodeState(State state) {
        return '''
          private void « state.uniqueName »« IF (state == rootState) »_root« ENDIF »(« state.uniqueContextMemberName » context) {
          « IF state.isHierarchical »
          « IF state !== rootState »
            « FOR r : state.regions.filter(ControlflowRegion) »
              context.« r.uniqueContextName ».activeState = « r.uniqueName »States.« r.states.filter[ initial ].head.uniqueEnumName »;
              context.« r.uniqueContextName ».delayedEnabled = false;
              context.« r.uniqueContextName ».threadStatus = ThreadStatus.READY;
            « ENDFOR »
          
            context.activeState = « state.parentRegion.uniqueName »States.« state.uniqueEnumName »RUNNING;
          }

          private void « state.uniqueName »_running(« state.uniqueContextMemberName » context) {
          « ENDIF »
            « createCodeSuperstate(state) »
          « ENDIF »
            « addSimpleStateCode(state) »
          }
        '''
    }

    protected def CharSequence createCodeSuperstate(State state) {
        return '''
          « FOR r : state.regions.filter(ControlflowRegion) »
            if (context.« r.uniqueName ».threadStatus != ThreadStatus.TERMINATED) {
              context.« r.uniqueName ».threadStatus = ThreadStatus.RUNNING;
            }
          « ENDFOR »
          « FOR r : state.regions.filter(ControlflowRegion) »        
            « r.uniqueName »(context.« r.uniqueContextName »);
          « ENDFOR »        
        '''
    }

    protected def CharSequence addSimpleStateCode(State state) {
        val hasDefaultTransition = state.outgoingTransitions.exists [
            trigger === null && delay == DelayType.IMMEDIATE && preemption != PreemptionType.TERMINATION
        ]

        return '''
          « IF state.isFinal »
            context.threadStatus = ThreadStatus.TERMINATED;
          « ELSE »
            « IF state.outgoingTransitions.size == 1 && 
                 state.outgoingTransitions.head.delay == DelayType.IMMEDIATE && 
                 state.outgoingTransitions.head.trigger === null &&
                 state.outgoingTransitions.head.preemption != PreemptionType.TERMINATION »
              « addTransitionEffectCode(state.outgoingTransitions.head) »
            «ELSE»
              « FOR t : state.outgoingTransitions.indexed »
                « addTransitionConditionCode(t.key, state.outgoingTransitions.size, t.value, hasDefaultTransition) »
              « ENDFOR »
              « IF !hasDefaultTransition »
                « IF state.outgoingTransitions.size == 0 »
                  « IF (state.isHierarchical) »
                    « addDelayedEnabledCode(state) »
                  « ENDIF »
                  context.threadStatus = ThreadStatus.READY;
                « ELSE »
                  } else {
                    « IF (state.isHierarchical) »
                      « addDelayedEnabledCode(state) »
                    « ENDIF »
                    context.threadStatus = ThreadStatus.READY;
                  }
                « ENDIF »
              « ENDIF »
            « ENDIF »
          « ENDIF »
        '''
    }

    protected def CharSequence addDelayedEnabledCode(State state) {
        return '''
          « FOR r : state.regions.filter(ControlflowRegion) »
            context.« r.uniqueName ».delayedEnabled = true;
          « ENDFOR » 
        '''
    }

    protected def CharSequence addTransitionConditionCode(int index, int count, Transition transition, boolean hasDefaultTransition) {
        valuedObjectPrefix = "iface."
        val defaultTransition = transition.trigger === null && transition.delay == DelayType.IMMEDIATE;
        var CharSequence condition = ""
        if (transition.preemption == PreemptionType.TERMINATION) {
            val termRegions = transition.sourceState.regions.filter(ControlflowRegion).indexed
            for (r : termRegions) {
                condition = condition + "context." + r.value.uniqueContextName +
                    ".threadStatus == ThreadStatus.TERMINATED"
                if(r.key != termRegions.size - 1) condition = condition + " && \n    "
            }
        } else {
            if (transition.immediate) {
                if(transition.trigger !== null) condition = transition.trigger.serializeHR else condition = "1"
            } else {
                if (transition.trigger === null)
                    condition = "context.delayedEnabled"
                else
                    condition = "context.delayedEnabled && (" + transition.trigger.serializeHR + ")"
            }
        }

        valuedObjectPrefix = ""

        return '''
          « IF index == 0 »
            if (« condition ») {
          « ELSE »
            } else « IF !(defaultTransition) »if (« condition ») « ENDIF »{
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
            context.activeState = « transition.targetState.parentRegion.uniqueName »States.« transition.targetState.uniqueEnumName »;
          « ENDIF »
        '''
        valuedObjectPrefix = ""
        return code
    }

    protected def CharSequence createSourceControlflowRegion(ControlflowRegion region) {
        return '''
          private void « region.uniqueName »(« region.uniqueContextMemberName » context) {
            while (context.threadStatus == ThreadStatus.RUNNING) {
              switch (context.activeState) {
                « FOR s : region.states »
                  case « s.uniqueEnumName »:
                    « s.uniqueName »(context);
                  « IF s.isHierarchical »
                    // Superstate: intended fall-through 

                  case « s.uniqueEnumName »RUNNING:
                    « s.uniqueName »_running(context);
                  « ENDIF »
                    break;

              «ENDFOR»
              }
            }
          }
        '''
    }

    protected def CharSequence createDeclarations(State state) {
        val declarations = rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.toList

        return '''
          « IF declarations.size > 0 »
            « FOR valuedObject : declarations »
              « createDeclaration(valuedObject) »
            « ENDFOR »
          « ENDIF »
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
