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
package de.scheidtbachmann.statemachine.codegen.lean

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.annotations.Annotatable

/**
 * @author wechselberg
 */
class StatebasedLeanJavaTemplate extends AbstractStatebasedLeanTemplate {

    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension EnhancedStatebasedJavaCodeSerializeHRExtensions

    @Accessors val source = new StringBuilder
    @Accessors val context = new StringBuilder
   
    @Accessors var boolean needsContextInterface = false
    protected Iterable<VariableDeclaration> inputEventDeclarations
    @Accessors var String superClass = null  

    static val INTERFACE_PARAM_NAME = "arg"

    def void create(State rootState) {
        this.rootState = rootState

        needsContextInterface = rootState.declarations.exists[annotations.exists['Context'.equalsIgnoreCase(name)]]
        inputEventDeclarations = rootState.declarations.filter(VariableDeclaration).filter [
            annotations.exists['InputEvent'.equalsIgnoreCase(name)]
        ]
        if (inputEventDeclarations.size > 0) {
            modifications.put("imports", "java.util.Arrays")
        }
        modifications.put("imports", "java.util.stream.Stream")
        modifications.put("imports", "java.util.stream.Collectors")


        scopes = <Scope>newLinkedList
        scopeNames = <Scope, String>newHashMap
        scopeEnumNames = <Scope, String>newHashMap
        contextStructNames = <Scope, String>newHashMap
        regionCounter = 0
        stateEnumCounter = 1
        enumerateScopes(rootState)

        createCode
        createContextInterface    
    }

    protected def void createCode() {
        source.append('''
          @SuppressWarnings("unused")
          public class « rootState.uniqueName »« IF superClass !== null » extends « superClass »« ENDIF » {

            « IF rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.size > 0 »
            public Iface iface;
            « ENDIF »
            private TickData rootContext;
            « IF needsContextInterface »
              private final «rootState.uniqueName»Context externalContext; // Auto-Created context interface
            « ENDIF »      
            « IF inputEventDeclarations.size > 0 »

              public enum InputEvent {
                « FOR decl : inputEventDeclarations SEPARATOR ',' »
                  «FOR vo : decl.valuedObjects SEPARATOR ', ' »«vo.name»« ENDFOR »
                « ENDFOR »
              }
            «ENDIF»

            /**
             * Enumeration for the possible thread states.
             * The chosen scheduling regime (IUR) uses four states to maintain the statuses of threads.
             */
            public enum ThreadStatus {
              TERMINATED, RUNNING, READY, PAUSING;
            }

            « IF rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.size > 0 »
            /**
             * The interface containing all model variables (inputs, outputs)
             */
            public static class Iface {
              « rootState.createDeclarations »
            }

            « ENDIF »
            /**
             * Runtime data for the root level program
             */
            public static class TickData {
              ThreadStatus threadStatus;

              « FOR r : rootState.regions.filter(ControlflowRegion) »
                « r.uniqueContextMemberName » « r.uniqueName » = new « r.uniqueContextMemberName »();
              « ENDFOR »
              
              public Stream<String> getCurrentState() {
                return Stream.of(
                    « FOR r : rootState.regions.filter(ControlflowRegion) SEPARATOR ',' »
                    « r.uniqueName ».getCurrentState()
                    « ENDFOR »
                  ).flatMap(i -> i);
              }
            }
            « FOR r : scopes.filter(ControlflowRegion) »

              /**
               * Enumeration for all states of the « r.name » region
               */
              public enum « r.uniqueName »States {
                « FOR s : r.states.indexed SEPARATOR ', ' 
                  »« s.value.uniqueEnumName »("« s.value.getStringAnnotationValue("SourceState") »")«
                   IF s.value.isHierarchical », « s.value.uniqueEnumName»RUNNING("« s.value.getStringAnnotationValue("SourceState") »")« ENDIF 
                  »« ENDFOR »;

                private String origin;

                « r.uniqueName »States(String origin) {
                  this.origin = origin;
                }
                
                public String getOrigin() {
                  return origin;
                }
              }

              /**
               * The runtime thread data of region « r.name »
               */
              public static class « r.uniqueContextMemberName » {
                ThreadStatus threadStatus;
                « r.uniqueName »States activeState;
                « IF r.states.exists[s | s.outgoingTransitions.exists[t | !t.immediate]] »
                boolean delayedEnabled;
                « ENDIF »
                « FOR c : r.states.map[ regions ].flatten.filter(ControlflowRegion) »
                  « c.uniqueContextMemberName » « c.uniqueContextName » = new « c.uniqueContextMemberName »();
                « ENDFOR »
                
                public Stream<String> getCurrentState() {
                  switch (activeState) {
                  « FOR s : r.states.filter[isHierarchical] »
                  case « s.uniqueEnumName »:
                  case « s.uniqueEnumName »RUNNING:
                    return Stream.of(
                        « FOR subr : s.regions.filter(ControlflowRegion) SEPARATOR ',' »
                        « subr.uniqueContextName ».getCurrentState()
                        « ENDFOR »  
                      ).flatMap(i -> i);
                  « ENDFOR »
                  default:
                    return Stream.of(activeState.getOrigin());
                  }
                }
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

            public void init() {
              reset();
              tick();
            }

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
            « IF inputEventDeclarations.size > 0 »

            public void apply(InputEvent... events) {
              « FOR decl : inputEventDeclarations »
              « FOR vo: decl.valuedObjects »
              iface.«vo.name» = Arrays.stream(events).anyMatch(it -> it == InputEvent.«vo.name»);
              « ENDFOR »
              « ENDFOR »

              tick();
            }
            « ENDIF»
            
            public String getCurrentState() {
              return rootContext.getCurrentState().distinct().collect(Collectors.joining(","));
            }

            public «rootState.uniqueName»(« IF needsContextInterface»«rootState.uniqueName»Context externalContext« ENDIF ») {
              « IF needsContextInterface»
                this.externalContext = externalContext;
              « ENDIF »
              « IF rootState.declarations.filter(VariableDeclaration).map[it.valuedObjects].flatten.size > 0 »
              this.iface = new Iface();
              « ENDIF »
              this.rootContext = new TickData();
            }

            « FOR globalObject : modifications.get(EnhancedStatebasedJavaCodeSerializeHRExtensions.GLOBAL_OBJECTS) »
              « globalObject »
            « ENDFOR »
          }
        ''')
    }

    protected def CharSequence createCodeState(State state) {
        return '''
          « state.generateJavaDocFromCommentAnnotations »
          private void « state.uniqueName »« IF (state == rootState) »_root« ENDIF »(« state.uniqueContextMemberName » context) {
          « IF state.isHierarchical »
          « IF state !== rootState »
            « FOR r : state.regions.filter(ControlflowRegion) »
              context.« r.uniqueContextName ».activeState = « r.uniqueName »States.« r.states.filter[ initial ].head.uniqueEnumName »;
              « IF r.states.exists[s | s.outgoingTransitions.exists[t | !t.immediate]] »
              context.« r.uniqueContextName ».delayedEnabled = false;
              « ENDIF »
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
            « IF r.states.exists[s | s.outgoingTransitions.exists[t | !t.immediate]] »
            context.« r.uniqueName ».delayedEnabled = true;
            « ENDIF »
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
          « IF transition.sourceState.parentRegion.states.exists[s | s.outgoingTransitions.exists[t | !t.immediate]] »
          context.delayedEnabled = false;
          « ENDIF »
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

    protected def createContextInterface() {
        if (needsContextInterface) {
            // We want to support method overloading (at least roughly)
            // So we gather all method calls and store the information of the used argument types 
            val Multimap<ReferenceDeclaration, List<CharSequence>> referenceUsages = HashMultimap.create
            // Grab all function calls to context methods
            val calls = rootState.eAllContents.filter(ReferenceCall).filter [
                valuedObject.referenceDeclaration.annotations.exists['Context'.equalsIgnoreCase(name)]
            ].toList
            // Gather all different parameter lists we can find
            for (call : calls) {
                // Use the declaration as the key to map the different calls to the same object
                val decl = call.valuedObject.referenceDeclaration
                // Map the parameters to the type by using the existing type inference
                // TODO This inference might need some work to support all cases
                val params = call.parameters.map[expression.inferTypeWithHostTypes]
                if (!referenceUsages.get(decl).exists[it.typesEqual(params)]) {
                    referenceUsages.put(decl, params)
                }
            }

            // Go through all different usages and serialize a method head for each
            context.append('''
              @SuppressWarnings("unused")
              public interface « rootState.uniqueName»«StatebasedLeanJavaCodeGenerator.CONTEXT_SUFFIX » {
                « FOR usage : referenceUsages.entries.sortBy[key.extern.head.code] »
                  « generateMethod(usage.key, usage.value) »
                « ENDFOR »
              }
            ''')
        }
    }

    /**
     * Compare two lists of parameter type strings 
     */
    protected def Boolean typesEqual(List<CharSequence> params1, List<CharSequence> params2) {
        return params1.join(',').equals(params2.join(','))
    }

    /**
     * Try to infer the type of an expression and 
     * create the string representation of the type.
     */
    protected def CharSequence inferTypeWithHostTypes(Expression expression) {
        // We first try the pre-implemented inference, that is able to detect mostly primitive types
        if (expression.inferType != ValueType.UNKNOWN) {
            return expression.inferType.serialize
        } else {
            // The first try returned unknown, so we have to step in. We mostly deal with references to host calls or objects.
            if (expression instanceof ValuedObjectReference) {
                // It is some kind of Reference, it could be many things, but let's start with VOs and calls 
                if (expression instanceof ReferenceCall) {
                    // Just hand it over to the annotation detection
                    return extractContextType(expression.valuedObject.declaration.asReferenceDeclaration)
                } else {
                    // Extract the host type directly from the VO
                    expression.valuedObject.declaration.asVariableDeclaration.hostType
                }
            } else {
                return 'Object'
            }
        }
    }

    /**
     * Generates the method head with the given list of types 
     */
    protected def CharSequence generateMethod(ReferenceDeclaration decl, List<CharSequence> types) {
        val paramList = if (types.length > 1) {
                // If we have multiple parameters, we want to count them down.
                // Sadly, we have to go through the list with a loop and count them manually
                // as there is no way to get the counter through a .map[], right?
                var int i = 0
                // Serialize the type to make sure it is matched to Java (i.e. String vs. string)
                '''«FOR type : types»«type» «INTERFACE_PARAM_NAME»«i++»« IF i < types.length», « ENDIF »«ENDFOR»'''
            } else {
                // If we have (at most) one parameter, we just call it whatever
                types.map[it + " " + INTERFACE_PARAM_NAME].join()
            }
            val comments = decl.annotations.filter(CommentAnnotation).head;

        '''

            « IF comments !== null »
            /**
             « FOR comment : comments.values »
             « FOR line : comment.split("\n") »
             * « line »
             « ENDFOR » 
             « ENDFOR »
             */
            « ENDIF »
            « extractContextType(decl) » « decl.extern.head.code »(« paramList »);
        '''
    }

    /**
     * Checks the given declaration for annotations with the return type. 
     */
    protected def extractContextType(ReferenceDeclaration decl) {
        val typeAnnotations = decl.annotations.filter(StringAnnotation).filter['Context'.equalsIgnoreCase(name)].filter [
            !values.nullOrEmpty
        ]
        if (typeAnnotations.size == 0) {
            return "void"
        } else {
            return typeAnnotations.head.values.head
        }
    }

    protected def findModifications() {
        return modifications
    }
    
    protected def generateJavaDocFromCommentAnnotations(Annotatable annotatable) {
        val comments = annotatable.annotations.filter(CommentAnnotation);
        return '''
            « IF comments !== null »
            /**
             « FOR commentAnnotation : comments»
             « FOR comment : commentAnnotation.values »
             « FOR line : comment.split("\n") »
             * « line »
             « ENDFOR » 
             « ENDFOR »
             « ENDFOR »
             */
            « ENDIF »
        '''
    }
}
