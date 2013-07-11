package de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend

import com.google.common.collect.ImmutableList
import com.google.inject.Injector
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.sccharts.model.stext.SynctextStandaloneSetup
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SignalDefinition
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.util.stdlib.CloningExtensions
import org.yakindu.base.types.Type
import org.yakindu.sct.model.sgraph.Choice
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.BoolLiteral
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.LogicalRelationExpression
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.sct.model.stext.types.STextDefaulTypeSystem

import static de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend.SCCTransformations.*
import org.yakindu.sct.model.stext.stext.LogicalOrExpression
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Trigger
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction
import org.eclipse.emf.common.util.EList
import org.yakindu.sct.model.sgraph.Declaration
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression


class SCCTransformations {
 
    private static val Injector synctextInjector = SynctextStandaloneSetup::doSetup();
    private static val STextDefaulTypeSystem typesystem = synctextInjector.getInstance(typeof(STextDefaulTypeSystem));
    private static val String variableValueExtension = "_val";
    private static val String outputSignalExtension = "_out";

    //-------------------------------------------------------------------------
    //--        S C C  -  D U R I N G  -  T R A N S F O R M A T I O N       --
    //-------------------------------------------------------------------------
    // Transforming During Actions.
    def Statechart transformDuring(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.allContents.filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            targetState.transformDuring(targetRootStatechart);
        } 
        targetRootStatechart;
    }

    // For every state do the following:
    // Inspect its declarations, if there is a during action trigger/effect,
    // 1. Create a new region inside state
    // 2. Create two states s1 and s2 with s1 initial
    // 3. Connect s1 and s2 with transitions t1:s1->s2, t2:s2->s1 
    //    with t1 immediate
    // 4. If during action is immediate move its triggers and effects
    //    to t1, else move them to t2
    //  5. Remove the during action from the state declarations  
     def void transformDuring(SyncState state, Statechart targetRootStatechart) {
             val duringActions = state.declarations.filter(typeof(LocalDuringReaction));
             for (duringAction : ImmutableList::copyOf(duringActions)) {
                 val region = state.createRegion;
                 val s1 = region.createInitialState("S1");
                 val s2 = region.createState("S2");
                 val t1 = s1.createImmediateTransition(s2);
                 val t2 = s2.createTransition(s1);
                 if (duringAction.isImmediate) {
                     t1.setTrigger(duringAction.trigger);
                     t1.setEffect(duringAction.effect);
                 } else {
                     t2.setTrigger(duringAction.trigger);
                     t2.setEffect(duringAction.effect);
                 }
                 state.declarations.remove(duringAction);
             }
     }
     
    //-------------------------------------------------------------------------
    //--        S C C  -  S I G N A L S  -  T R A N S F O R M A T I O N       --
    //-------------------------------------------------------------------------

    // Transforming InputOutput Signals.
    def Statechart transformInputOutputSignal(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.allContents.filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            targetState.transformInputOutputSignal(targetRootStatechart);
        } 
        targetRootStatechart;
    }

    // For every state do the following:
    // Inspect its declarations, if there is an input output signal (variable) s
    // 1. Create a new output signal (variable) s_out and add it to the state
    // 2. For all actions, where s is written, replace with s_out
    // 3. Make s just an input signal
     def void transformInputOutputSignal(SyncState state, Statechart targetRootStatechart) {
             val inputOutputSignals = state.declarations.filter(typeof(SignalDefinition)).filter(e | (e as EventDefinition).isInput && (e as EventDefinition).isOutput);
             for (inputOutputSignal : ImmutableList::copyOf(inputOutputSignals)) {
                 val signal = inputOutputSignal as EventDefinition;
                 signal.setIsOutput(false);

                 val replacement = state.createOutputSignal(signal.name + outputSignalExtension);
                 state.replaceInAllInnerReactionEffects(inputOutputSignal, replacement); 
                 
                 val region = state.createRegion;
                 val s = region.createInitialState("I");
                 val t = s.createTransition(s);
                 
                 val effect = createEmtyReaction();
                 effect.actions.add(replacement.assign(true));
                 t.setEffect(effect);
                 //t.setTrigger(signal)
                 
             }

             val inputOutputVariables = state.declarations.filter(typeof(VariableDefinition)).filter(e | (e as VariableDefinition).isInput && (e as VariableDefinition).isOutput);
             for (inputOutputVariable : ImmutableList::copyOf(inputOutputVariables)) {
                 val variable = inputOutputVariable as VariableDefinition;
                 variable.setIsOutput(false);
                 
                 val replacement = state.createOutputVariable(variable.name + outputSignalExtension, variable.type);
                 state.replaceInAllInnerReactionEffects(inputOutputVariable, replacement); 
             }
     }
 
    //-------------------------------------------------------------------------
    //--        S C C  -  S I G N A L S  -  T R A N S F O R M A T I O N       --
    //-------------------------------------------------------------------------
           
    // Transforming Signals.
    def Statechart transformSignal(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.allContents.filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            targetState.transformSignal(targetRootStatechart);
        } 
        targetRootStatechart;
    }

     // For all states do the following:
     // If the state has a specification, then convert all signals
     // (a) simple signal S to boolean variable S (variablePresent)
     // (b) valued signal S to two boolean variables S and S_val (variableValue)
     def void transformSignal(SyncState state, Statechart targetRootStatechart) {
             //input signal S; --> input boolean S;
             //input signal S:bool; --> input boolean S; input boolean S_val;
             //input signal S:integer; --> input boolean S; input integer S_val;
               for (declaration : ImmutableList::copyOf(state.declarations)) {
                 if (declaration instanceof SignalDefinition) {
                     // Store information about the signal in question
                     val signal = declaration as EventDefinition;
                     val signalIsInput = signal.isInput;
                     val signalIsOutput = signal.isOutput;
                     val signalType = signal.type;
                     val signalName = declaration.name;
                     val signalInit = signal.varInitialValue;
                     val signalCombine = signal.varCombineOperator;
                     
                     // Create a present variable
                     val variablePresent = createBooleanVariable(signalName, 
                                                                 signalIsInput, 
                                                                 signalIsOutput
                     );
                     
                     // Check if this is a valued signal -----------------
                     if (signal.isValuedSignal) {
                         
                        // Create a value variable 
                        val variableValue = createVariable(signalName + variableValueExtension, 
                                                           signalType, 
                                                           signalIsInput, 
                                                           signalIsOutput
                        ); 
                        if (signalInit != null) {
                            variableValue.setInitialValue(signalInit);
                        }
                        if (signalCombine != null) {
                            variableValue.setInitialValue(signalInit); 
                        }
                        // Add value variable to the scope
                        state.declarations.add(variableValue);
                        
                        // Replace signal by variableValue in all inner ReactionTriggers
                        state.replaceInAllInnerReactionTrigger(signal, variableValue);
                        
                        // Replace signal by variableValue in all inner ReactionEffects
                        state.replaceInAllInnerReactionEffects(signal, variableValue); 
                        
                        
//                        // Change all references
//                        val transitions = state.allContents.filter(typeof(SyncTransition));
//                        for (transition : transitions) {
//                            
//                            // Change all trigger where the value is inspected (val(S) -> S_val)
//                            val trigger = transition.trigger as ReactionTrigger;
//                            if (trigger != null) {
//                              val valReferences = trigger.eAllContents.toIterable().filter(typeof(EventValueReferenceExpression));
//                              for (valReference : ImmutableList::copyOf(valReferences)) {
//                                  val expression = valReference.value;
//                                  // Exchange reference to valued signal within expression with the
//                                  // new value variable
//                                  if (expression instanceof ElementReferenceExpression) {
//                                      val elementReferenceExpression = expression as ElementReferenceExpression;
//                                      // Only if the signal is involved
//                                      if (elementReferenceExpression.reference == signal) {
//                                        elementReferenceExpression.setReference(variableValue);    
//                                        val container = valReference.eContainer;
//                                        if (container instanceof ReactionTrigger) {
//                                            val reactionTrigger = ((container as ReactionTrigger));
//                                            reactionTrigger.setExpression(expression);
//                                        }
//                                        else if (container instanceof LogicalRelationExpression) {
//                                            val logicalRealtionExpression = ((container as LogicalRelationExpression));
//                                            if (logicalRealtionExpression.leftOperand == valReference) {
//                                              logicalRealtionExpression.setLeftOperand(expression);
//                                            }
//                                            if (logicalRealtionExpression.rightOperand == valReference) {
//                                              logicalRealtionExpression.setRightOperand(expression);
//                                            }
//                                         }
//                                      }
//                                  }
//                              }
//                            }
//
//
//                            // Change all effects where the value is set (S(x) -> S_val = x)
//                            val effect = transition.effect as ReactionEffect;
//                            if (effect != null) {
//                              for (action : ImmutableList::copyOf(effect.actions)) {
//                                if (action instanceof ElementReferenceExpression) {
//                                    val refExpression = action as ElementReferenceExpression;
//                                    // Only if the signal is involved
//                                    if (refExpression.reference == signal) {
//                                        // Now we know that the signals values is changed here
//                                        val value = refExpression.args;
//                                        if (!value.nullOrEmpty) {
//                                            // Assign the first expression only
//                                            val assignmentExpression = variableValue.assign(value.get(0));
//                                            // Add to actions at the same position          
//                                            val i = effect.actions.indexOf(action);
//                                            effect.actions.add(i, assignmentExpression);
//                                        }
//                                    }
//                                }
//                              }
//                            }
//                            
//                        } // for all transitions of the model
                        
                     } // end handle valued signal -----------------
                     
                     // Change all references for the present status
                     val effects = state.allContents.filter(typeof(ReactionEffect));
                     for (effect : effects) {
                          for (action : ImmutableList::copyOf(effect.actions)) {
                                if (action instanceof ElementReferenceExpression) {
                                    val refExpression = action as ElementReferenceExpression;
                                    // Only if the signal is involved
                                    if (refExpression.reference == signal) {
                                        // Also add O = true to mimic the present status
                                        val assignmentExpression = variablePresent.assignRelative(true);
                                        // Add to actions at the same position          
                                        val i = effect.actions.indexOf(action);
                                        effect.actions.add(i, assignmentExpression);
                                        effect.actions.remove(action);
                                    }
                                }
                          }
                     }
                     
                     // Add present variable to the scope
                     state.declarations.add(variablePresent);
                     // Remove signal from the scope
                     state.declarations.remove(signal);
                     
                     // Add a reset as an absolute write during/inside action
                     val duringEffect = createEmtyReaction();
                     duringEffect.actions.add(variablePresent.assign(false));
                     val insideReaction = createDuringReaction(null, duringEffect, true);
                     state.declarations.add(insideReaction);
                 }
               
//                    /* =================================================
//                     * = WORKAROUND -  Mittwoch, 3. Juli 2013 16:05:09 =
//                     * =================================================
//                     * Hallo Christian,
//                     * im wesentlichen läuft es so wie Du gesagt hast. Wenn Du den SText-Modellteil auf
//                     * den semantischen Objekten ändern willst, kannst Du auf der EMF Resource, wenn Du
//                     * diese auf STextResource castest, setSerializerEnabled(true) setzen. Das sorgt 
//                     * dafür, dass ein EAdapter innerhalb der AbstractSCTResource auf semantischen
//                     *  Änderungen in sText lauscht und den String selbst per serializer updated. 
//                     * Diesen Mechanismus benutzen wir für die Refactorings - allerdings bin ich mir
//                     *  gerade gar nicht sicher ob es die in eurem Branch schon gab. Falls nicht, 
//                     * müssten wir versuchen die Resource in euren Branch einzubauen. 
//                     * Viele Grüße, Andreas Andreas Mülder 
//                     */
//                     private static val ISerializer serializer = synctextInjector.getInstance(typeof(ISerializer));
//                     private static val ResourceSet rSet = synctextInjector.getInstance(typeof(ResourceSet));
//                     @Named(Constants::FILE_EXTENSIONS)
//                     @Inject private String fileExt;
//                     i.injectMembers(this);
//                     val res = rSet.createResource(URI::createFileURI("dummy."+ System::currentTimeMillis() + state.hashCode + "." +fileExt))
//                     res.contents+= EcoreUtil::copy(scope)
//                     state.setSpecification(serializer.serialize(res.contents.head));
//                     res.unload;
             }
             
     }
     
    //-------------------------------------------------------------------------
    //--        H E L P E R     S C C H A R T     F U N C T I O N S          --
    //-------------------------------------------------------------------------

    // Advances Signal Reference Operations
    def void replaceInAllInnerReactionEffects(EObject container, EObject toBeReplaced, EObject replacement) {
       val allEffects = container.allContents.filter(typeof(ReactionEffect));
          for (effect : allEffects) {
              val elementReferenceExpressions = effect.allContents.filter(typeof(ElementReferenceExpression)).filter(e | e.reference == toBeReplaced)
              for (elementReferenceExpression : elementReferenceExpressions) {
                  elementReferenceExpression.setReference(replacement);
              }
      }        
    }
    
    def void replaceInAllInnerReactionEffects(EObject container, EventDefinition toBeReplaced, VariableDefinition replacement) {
       val allEffects = container.allContents.filter(typeof(ReactionEffect));
          // Change all trigger where the value is inspected (val(S) -> S_val)
          for (effect : allEffects) {
                   // Change all effects where the value is set (S(x) -> S_val = x)
                   for (action : ImmutableList::copyOf(effect.actions)) {
                         if (action instanceof AssignmentExpression) {
                               val assignmentExpression = action as AssignmentExpression;
                               assignmentExpression.eAllContents
                         }
                         // Signal case
                         if (action instanceof ElementReferenceExpression) {
                               val refExpression = action as ElementReferenceExpression;
                               // Only if the signal is involved
                               if (refExpression.reference == toBeReplaced) {
                                     // Now we know that the signals values is changed here
                                     val value = refExpression.args;
                                     // Add to actions at the same position          
                                     val i = effect.actions.indexOf(action);
                                     if (!value.nullOrEmpty) {
                                         // Assign the first expression only
                                         val assignmentExpression = replacement.assign(value.get(0));
                                         effect.actions.add(i, assignmentExpression);
                                     } else {
                                         // Signal case
                                         refExpression.setReference(replacement);
                                     }
                               }
                        }
            }
        }
    }

    
    // Advances Signal Reference Operations
    def void replaceInAllInnerReactionTrigger(EObject container, EObject toBeReplaced, EObject replacement) {
       // Change all references
       val allTrigger = container.allContents.filter(typeof(ReactionTrigger));
          for (trigger : allTrigger) {
              // Change all trigger where the value is inspected (val(S) -> S_val)
              if (trigger != null) {
                   val valReferences = trigger.eAllContents.toIterable().filter(typeof(ValReferenceExpression));
                   for (valReference : ImmutableList::copyOf(valReferences)) {
                         val expression = valReference.expression;
                         // Exchange reference to valued signal within expression with the
                         // new value variable
                         if (expression instanceof ElementReferenceExpression) {
                              val elementReferenceExpression = expression as ElementReferenceExpression;
                              // Only if the signal is involved
                              if (elementReferenceExpression.reference == toBeReplaced) {
                                   elementReferenceExpression.setReference(replacement);    
                                   val innerContainer = valReference.eContainer;
                                   if (innerContainer instanceof ReactionTrigger) {
                                       val reactionTrigger = ((innerContainer as ReactionTrigger));
                                       reactionTrigger.setExpression(expression);
                                   }
                                   else if (innerContainer instanceof LogicalRelationExpression) {
                                       val logicalRealtionExpression = ((innerContainer as LogicalRelationExpression));
                                       if (logicalRealtionExpression.leftOperand == valReference) {
                                            logicalRealtionExpression.setLeftOperand(expression);
                                       }
                                       if (logicalRealtionExpression.rightOperand == valReference) {
                                            logicalRealtionExpression.setRightOperand(expression);
                                       }
                                  }
                              }
                        }
                  }
              }
         }
    }
    
    def AssignmentExpression assignRelative(EObject variable, boolean trueOrFalse) {
       val trueValueExpression = createBooleanValueExpession(trueOrFalse);
       val elementReferenceExpression = createElementReferenceExpression(variable);
       val logicalOrExpression = createLogicalOrExpression(trueValueExpression, elementReferenceExpression);
       variable.assign(logicalOrExpression)
    }
    
    def List<Declaration> getDeclarations(SyncState state) {
        val stateScope = state.scopes.get(0);
        if (stateScope != null) {
            return stateScope.declarations;
        }
        var List<Declaration> emptyList = <Declaration> newLinkedList;
        return emptyList;
    }
    
    // Advanced Trigger Creation
    
    // Advanced Variable Creation

    def VariableDefinition createInputVariable(SyncState state, String name, Type type) {
        val variable = state.createVariable(name, type);
        (variable as VariableDefinition).setIsInput(true);
        variable;
    }
    def VariableDefinition createOutputVariable(SyncState state, String name, Type type) {
        val variable = state.createVariable(name, type);
        (variable as VariableDefinition).setIsOutput(true);
        variable;
    }
    def VariableDefinition createVariable(SyncState state, String name, Type type) {
        val variable = createVariable(name, type, false, false);
        variable.setName(name);
        state.declarations.add(variable);
        variable;
    }  
    
    // Advanced Signal Creation
    
    def SignalDefinition createInputSignal(SyncState state, String name) {
        val signal = state.createSignal(name);
        (signal as EventDefinition).setIsInput(true);
        signal;
    }
    def SignalDefinition createOutputSignal(SyncState state, String name) {
        val signal = state.createSignal(name);
        (signal as EventDefinition).setIsOutput(true);
        signal;
    }
    def SignalDefinition createSignal(SyncState state, String name) {
        //val signal = SynctextFactory::eINSTANCE.createSignalDefinition;
        val signal = SynctextFactory::eINSTANCE.createEventDefinition;
        signal.setName(name);
        state.declarations.add(signal);
        signal;
    }  
    
    // Transition Creation
    
    def SyncTransition createHistoryTransition(SyncState sourceState, SyncState targetState) {
        val transition = createTransition(sourceState, targetState);
        transition.setIsHistory(true);
        transition;
    }
    def SyncTransition createImmediateTransition(SyncState sourceState, SyncState targetState) {
        val transition = createTransition(sourceState, targetState);
        transition.setIsImmediate(true);
        transition;
    }
    def SyncTransition createTransition(SyncState sourceState, SyncState targetState) {
        val transition = SyncgraphFactory::eINSTANCE.createSyncTransition;
        sourceState.outgoingTransitions.add(transition);
        transition.setTarget(targetState);
        transition;
    }
    
    // State Creation
    
    def SyncState createInitialState(Region parentRegion, String name) {
        val state = createState(parentRegion, name);
        state.setIsInitial(true);
        state;
    }
    def SyncState createFinalState(Region parentRegion, String name) {
        val state = createState(parentRegion, name);
        state.setIsFinal(true);
        state;
    }
    def SyncState createState(Region parentRegion, String name) {
        val state = SyncgraphFactory::eINSTANCE.createSyncState;
        state.setName(name);
        // Add new state to parent region
        parentRegion.vertices.add(state);
        state;
    }

    // Region Creation
    
    def Region createRegion(SyncState parentState) {
        val region = SGraphFactory::eINSTANCE.createRegion;
        parentState.regions.add(region);
        region;
    }
     
    //-------------------------------------------------------------------------
    //--         H E L P E R     C R E A T E     F U N C T I O N S           --
    //-------------------------------------------------------------------------
    
    // SCCHART
    
    // Effects
    def ReactionEffect createEmtyReaction() {
         val reactionEffect = SynctextFactory::eINSTANCE.createReactionEffect;
         reactionEffect
    }
   
    
    // Trigger
    
    def ReactionTrigger createTrueTrigger() {
        val reactionTrigger = SynctextFactory::eINSTANCE.createReactionTrigger;
        reactionTrigger.setExpression(createBooleanValueExpession(true));
        reactionTrigger
    }
    
    // Entry, Inside, Exit Actions
    def LocalEntryReaction createEntryReaction(Trigger trigger, Effect effect) {
        var reaction = SynctextFactory::eINSTANCE.createLocalEntryReaction
        reaction.setTrigger(trigger);
        reaction.setEffect(effect);
        reaction
    }
    def LocalDuringReaction createDuringReaction(Trigger trigger, Effect effect, boolean isImmediate) {
        var reaction = SynctextFactory::eINSTANCE.createLocalDuringReaction
        reaction.setTrigger(trigger);
        reaction.setEffect(effect);
        reaction.setIsImmediate(isImmediate);
        reaction
    }
    def LocalExitReaction createExitReaction(Trigger trigger, Effect effect) {
        var reaction = SynctextFactory::eINSTANCE.createLocalExitReaction
        reaction.setTrigger(trigger);
        reaction.setEffect(effect);
        reaction
    }

    // VARIABLE & REFERENCE CREATION
    
    def VariableDefinition createBooleanInputVariable(String signalName, boolean isInput, boolean isOutput) {
       createBooleanVariable(signalName, true, false);   
    }

    def VariableDefinition createBooleanOutputVariable(String signalName, boolean isInput, boolean isOutput) {
       createBooleanVariable(signalName, false, true);   
    }

    def VariableDefinition createBooleanVariable(String signalName, boolean isInput, boolean isOutput) {
       createVariable(signalName, getBooleanType, isInput, isOutput);   
    }
    
    def VariableDefinition createVariable(String signalName, Type type, boolean isInput, boolean isOutput) {
        val variable =  SynctextFactory::eINSTANCE.createVariableDefinition;
        variable.setName(signalName);
        variable.setIsInput(isInput);
        variable.setIsOutput(isOutput);
        variable.setType(type);
        variable
    }

    def ElementReferenceExpression createElementReferenceExpression(EObject variable) {
       val elementReferenceExpression = StextFactory::eINSTANCE.createElementReferenceExpression;
       elementReferenceExpression.setReference(variable)
       elementReferenceExpression;
    }
    
    // PRE and VAL REFERENCE CREATION
    
    def ValReferenceExpression createValReferenceExpression(EObject signal) {
        val elementReferenceExpression = signal.createElementReferenceExpression;
        elementReferenceExpression.createValReferenceExpression;
    }
    def ValReferenceExpression createValReferenceExpression(Expression expression) {
        val valReferenceExpression = SynctextFactory::eINSTANCE.createValReferenceExpression();
        valReferenceExpression.setExpression(expression);
        valReferenceExpression;
    }
    
    def PreReferenceExpression createPreReferenceExpression(EObject signal) {
        val elementReferenceExpression = signal.createElementReferenceExpression;
        elementReferenceExpression.createPreReferenceExpression;
    }
    def PreReferenceExpression createPreReferenceExpression(Expression expression) {
        val preReferenceExpression = SynctextFactory::eINSTANCE.createPreReferenceExpression();
        preReferenceExpression.setExpression(expression);
        preReferenceExpression;
    }
        
    // EXPRESSION & ASSIGNMENT CREATION     
    
    def LogicalOrExpression createLogicalOrExpression(Expression expressionLeft, Expression expressionRight) {
       val logicalOrExpression = StextFactory::eINSTANCE.createLogicalOrExpression();
       logicalOrExpression.setLeftOperand(expressionLeft);
       logicalOrExpression.setRightOperand(expressionRight);
       logicalOrExpression;
    }

        
    def BoolLiteral createBooleanLiteral(boolean trueOrFalse) {
       val trueValue = StextFactory::eINSTANCE.createBoolLiteral;
       trueValue.setValue(trueOrFalse);
       trueValue;
    }
    
    def PrimitiveValueExpression createBooleanValueExpession(boolean trueOrFalse) {
       val trueValue = createBooleanLiteral(trueOrFalse);
       val trueValueExpression = StextFactory::eINSTANCE.createPrimitiveValueExpression()
       trueValueExpression.setValue(trueValue);
       trueValueExpression;
    }
    
    def AssignmentExpression assign(EObject variable, Expression expression) {
       val assignmentExpression = StextFactory::eINSTANCE.createAssignmentExpression;
       assignmentExpression.setExpression(expression);
       val elementReferenceExpression = createElementReferenceExpression(variable);
       assignmentExpression.setVarRef(elementReferenceExpression);
       assignmentExpression;
    }
    
    def AssignmentExpression assign(EObject variable, boolean trueOrFalse) {
       val trueValueExpression = createBooleanValueExpession(trueOrFalse);
       variable.assign(trueValueExpression);
    }    
    
        
    //-------------------------------------------------------------------------
    //--  H E L P E R     A D V A N C E D    B A S I C     F U N C T I O N S --
    //-------------------------------------------------------------------------

    def boolean isValuedSignal(EventDefinition signal) {
        // Search the whole model if there is an AssignmentExpression with this signal
        // or if there is a EventValueReferenceExpression with this signal
        var found = false;
        val rootObject = signal.rootEObject;
        val elementReferenceExpressions = rootObject.eAllContents.toIterable.filter(typeof(ElementReferenceExpression));
        for (elementReferenceExpression : elementReferenceExpressions) {
            found = found || (elementReferenceExpression.reference == signal && elementReferenceExpression.operationCall);
        }
        val valReferenceExpressions = rootObject.eAllContents.toIterable.filter(typeof(ValReferenceExpression));
        for (valReferenceExpression : valReferenceExpressions) {
            found = found || (valReferenceExpression.eContainer != null 
                             && (valReferenceExpression.eContainer.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).filter(e | e.reference == signal).size > 0)
            );
        }
        return found;
    }
        

    //-------------------------------------------------------------------------
    //--          H E L P E R     B A S I C     F U N C T I O N S            --
    //-------------------------------------------------------------------------
        
    def Type getBooleanType() {
            return typesystem.booleanType;
    }    
    def Type getIntegerType() {
            return typesystem.integerType;
    }    
    
    def EObject getRootEObject(EObject eObject) {
        if (eObject.eContainer != null) {
            return eObject.eContainer.rootEObject;
        }
        return eObject;
    }
    
    def boolean isBoolean(Type type) {
        return (type != null && type.name != null && type.name.equals("boolean"));
    }     
    def boolean isInteger(Type type) {
        return (type != null && type.name != null && type.name.equals("integer"));
    }
    def boolean hasType(EventDefinition signal) {
        signal.type.isBoolean || signal.type.isInteger;
    }     
    def boolean hasType(VariableDefinition variable) {
        variable.type.isBoolean || variable.type.isInteger;
    }     
    
    def allContents(EObject eObject) {
        eObject.eAllContents.toIterable();
    }


    
    //==================================================================================================
    //==================================================================================================
    //==================================================================================================


 
    //-------------------------------------------------------------------------
    //--        S C C  -  A B O R T S  -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming Aborts.
    def Statechart transformAborts(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.allContents.filter(typeof(SyncState)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformAborts(targetRootStatechart);
        } 
        
        targetRootStatechart;
    }
    
    // For all transitions of a state compute the maximal priority
    def int maxPriority(SyncState state) {
        var priority = 0;
        for (transition : state.outgoingTransitions) {
            val newPriority = transition.priority;
            if (newPriority > priority) {
                priority = newPriority;
            }
        }
        priority;
    }
    
    def void transitionAddSignal(SyncTransition transition, String signalName) {
//    	val event = SCChartsExpFactory::eINSTANCE.createSignalDefinition();
//    	event.setName(signalName);
		//transition.setSpecification('WAHBI');
    }

    // Traverse all states 
    def void transformAborts(SyncState state, Statechart targetRootStatechart) {
        
        if (state.isComposite && state.outgoingTransitions.size() > 0) {
            // Remember all outgoing transitions
//            val originalOutgoingTransitions = ImmutableList::copyOf(state.outgoingTransitions as EList<SyncTransition>);
//			val EList<SyncTransition>syncList = state.outgoingTransitions as EList<SyncTransition>;
            val originalOutgoingTransitionsRaw = ImmutableList::copyOf(state.outgoingTransitions);
            var List<SyncTransition> originalOutgoingTransitions = new ArrayList();
            for (raw : originalOutgoingTransitionsRaw) {
            	originalOutgoingTransitions.add(0, raw as SyncTransition);
            }
            val outgoingStrongTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.getType == TransitionType::STRONGABORT));
            val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
            val normalTerminationExists = originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0;
            // Remember all regions
            val originalRegions = ImmutableList::copyOf(state.regions);
            
            
            // For a hierarchical state:
            // 1. for each existing region, create a new Aborted-auxiliary state
            // 2. create a watcher region
            
            // 2. Watcher region
            // Add a Pre and NotPre state
	            val runState = SyncgraphFactory::eINSTANCE.createSyncState();
    	        runState.setName("Run");
        	    runState.setIsInitial(true);
	            val abortState = SyncgraphFactory::eINSTANCE.createSyncState();
    	        abortState.setName("Abort");             
        	    abortState.setIsFinal(true);
            	val watcherRegion = SGraphFactory::eINSTANCE.createRegion();
            	watcherRegion.getVertices.add(runState as State);
            	watcherRegion.getVertices.add(abortState as State);
//            	val watcherTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
//            	watcherTransition.setTarget(abortState);
//            	watcherTransition.setPriority(1);
//            	watcherTransition.setType(TransitionType::WEAKABORT);
//            	runState.outgoingTransitions.add(watcherTransition);
            	
            val needWatcherRegion = (originalOutgoingTransitions.filter(e | e.type != TransitionType::NORMALTERMINATION).size > 0);
            if (needWatcherRegion) {
                state.regions.add(watcherRegion);
            }
            
            // Add a conditional node outside of the state and connect it with
            // a normal termination transition

             val conditionalState = SGraphFactory::eINSTANCE.createChoice();
			state.getParentRegion.getVertices.add(conditionalState);
            val normalTerminationTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
                normalTerminationTransition.setTarget(conditionalState);
                normalTerminationTransition.setPriority(1);
                normalTerminationTransition.setType(TransitionType::NORMALTERMINATION);
                state.outgoingTransitions.add(normalTerminationTransition);            
   
   
   
   
                        
            // Create complex triggers to be filled with auxiliary signals (sorted strong or weak)                        
            
//            transitionAddSignal(normalTerminationTransition, 'S');
            
            // For every transition 
            for (transition : originalOutgoingTransitions) {
                // Add transition to watcher region
                // ONLY iff this is not a normal termination
                if (transition.type != TransitionType::NORMALTERMINATION) {
                    // Create a signal 
//                    val transitionSignal = StextFactory::eINSTANCE.createEventDefinition();
//                    val transitionSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                    val transitionSignalReference = StextFactory::eINSTANCE.createValuedObjectReference()
//                        transitionSignalReference.setValuedObject(transitionSignal);
//                    val transitionSignalRef = StextFactory::eINSTANCE.createTransitionReaction();
//                  	val eventLiteral = StextFactory::eINSTANCE.createStringLiteral;
                    if (transition.type == TransitionType::STRONGABORT) {
//                    	eventLiteral.setValue("_" + state.getName + "_S" + transition.priority); 
//                        transitionSignal.setEvent("_" + state.id + "_S" + transition.priority);
//                        strongTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
                    } else {
//                    	eventLiteral.setValue("_" + state.getName + "_S" + transition.priority); 
//                        transitionSignal.setName("_" + state.id + "_W" + transition.priority);
//                        weakTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
                    }                    
//                    transitionSignal.setIsInput(false);
//                    transitionSignal.setIsOutput(false);
//                    state.parentRegion.parentState.signals.add(transitionSignal);
//					if (state.getParentRegion.getComposite as SyncState).getScopes.size == 0) {
//					(state.getParentRegion.getComposite as SyncState).getScopes.add(StextFactory::eINSTANCE.createInternalScope());					
//					}
//					(state.getParentRegion.getComposite as SyncState).getScopes.get(0).getEvents.add(transitionSignal);
                                    
                    val watcherTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                    watcherTransition.setTarget(abortState);
                    runState.outgoingTransitions.add(watcherTransition);
                    // Move trigger from original transition to watcher transition
//                    watcherTransition.setTrigger(transition.trigger.copy);
                    // Watcher transition gets the same priority / immediate / delay
                    watcherTransition.setPriority(transition.priority);
//                    watcherTransition.setIsImmediate(transition.isImmediate);
//                    watcherTransition.setDelay(transition.delay);
                    // Watcher transition emits the auxiliary signal
//                    val transitionSignalEmission = SyncchartsFactory::eINSTANCE.createEmission();
//                        transitionSignalEmission.setSignal(transitionSignal);
//                    watcherTransition.effects.add(transitionSignalEmission);
                    // Change trigger of original transition to transitionSignalReference
//                    transition.setTrigger(transitionSignalReference.copy);
//                    val transitionSignalEmission = StextFactory::eINSTANCE.createReactionEffect();
//                        transitionSignalEmission.getActions.add(eventLiteral as Expression);
//                    watcherTransition.setEffect(transitionSignalEmission);
//                    transition.setTrigger(transitionSignalReference.copy);
                }
                
                // Move original transition from state to conditionalState
                // and remove strong, normal termination attributes
                // put immediate attribute
                conditionalState.outgoingTransitions.add(transition);
                transition.setType(TransitionType::WEAKABORT);
//                transition.setIsImmediate(true); 
            }
            
            // Simplify triggers (if they only consist of one signal reference)
/*            if (strongTriggerOperatorExpression.subExpressions.size == 1) {
                strongTrigger = strongTriggerOperatorExpression.subExpressions.get(0);
            }
            if (weakTriggerOperatorExpression.subExpressions.size == 1) {
                weakTrigger = weakTriggerOperatorExpression.subExpressions.get(0);
            }
            // Hotfix for SyncCharts
            if (strongTrigger instanceof OperatorExpression) {
                strongTrigger = (strongTrigger as OperatorExpression).fixForOperatorExpressionLists;
            }
            if (weakTrigger instanceof OperatorExpression) {
                weakTrigger = (weakTrigger as OperatorExpression).fixForOperatorExpressionLists;
            }
*/

            
            // Create an Aborted state for every region
             
            for (region : originalRegions) {
                // Remember all outgoing transitions
                val regionStatesRaw = ImmutableList::copyOf(region.getVertices)
                var List<SyncState> regionStates = new ArrayList<SyncState>()
                for (raw : regionStatesRaw) {
                	regionStates.add(0, raw as SyncState)
                }
                
                val abortedState = SyncgraphFactory::eINSTANCE.createSyncState();
//                abortedState.setId("_Aborted" + state.hashCode);
                abortedState.setName("_Aborted")             
                abortedState.setIsFinal(true)
                val needAbortedState = ((outgoingStrongTransitions.size > 0 || 
                                         outgoingWeakTransitions.size > 0
                                        ) && (regionStates.filter(e | !e.isIsFinal).size > 0));
                if (needAbortedState) {
                       region.getVertices.add(abortedState)
                }
                // Do not add the state here, only add the state iff there are any transitions
                // ending up in this _Aborted state (within the if-for-constructs below)
                
                // For every inner state, connect with a weak and a strong transition
                if (outgoingStrongTransitions.size > 0) {
                    for (regionState : regionStates) {
                        // If the state is a final state do NOT connect it with the _Aborted state
                        if (!regionState.isIsFinal) {
                            // Create a transition ending up in _Aborted
                            val strongAbortTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                            strongAbortTransition.setTarget(abortedState);
//                            strongAbortTransition.setIsImmediate(true);
                            // Now add all strong abort watcher signals as a trigger
//                            strongAbortTransition.setTrigger(strongTrigger.copy);
                            // Set the highest priority
                            strongAbortTransition.setPriority(1);
                            for (regionStateOutgoingTransition : regionState.outgoingTransitions) {
                                regionStateOutgoingTransition.setPriority(regionStateOutgoingTransition.priority + 1);
                            }
                            // Add transition
                            regionState.outgoingTransitions.add(0, strongAbortTransition);
                        }
                    }
                }
                
                if (outgoingWeakTransitions.size > 0) {
                    for (regionState : regionStates) {
                        // If the state is a final state do NOT connect it with the _Aborted state
                        if (!regionState.isIsFinal) {
                            // Create a transition ending up in _Aborted
                            val weakAbortTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                            weakAbortTransition.setTarget(abortedState);
//                            weakAbortTransition.setIsImmediate(true);
                            // Now add all weak abort watcher signals as a trigger
//                            weakAbortTransition.setTrigger(weakTrigger.copy);
                            // Set the lowest priority
                            weakAbortTransition.setPriority(regionState.maxPriority + 1);
                            // Add transition
                            regionState.outgoingTransitions.add(weakAbortTransition);
                        }
                    }
                }
                                 
            }
            
            // Optimization: If a normal termination is outgoing then the following 
            // transformation is necessary to be able to abort the watcher in case
            // of triggering the normal termination.
             if (normalTerminationExists) {
                // If there is at least one such transition then whe need an "_Exit" signal
//                val exitSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                val exitSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                    exitSignalReference.setValuedObject(exitSignal);
//                exitSignal.setName("_Term_" + state.id);
//                state.signals.add(exitSignal);
                // Add a watcher transition from Run to Abort triggered by _Exit
                val watcherTransition =  SyncgraphFactory::eINSTANCE.createSyncTransition();
                watcherTransition.setTarget(abortState);
                runState.outgoingTransitions.add(watcherTransition);
//                watcherTransition.setTrigger(exitSignalReference);
                watcherTransition.setPriority(runState.maxPriority + 1);
//                watcherTransition.setIsImmediate(true);
//                watcherTransition.setDelay(0);
                              
                val mainRegion = SGraphFactory::eINSTANCE.createRegion();
//                mainRegion.setId("Body" + state.hashCode);
                val mainState = SyncgraphFactory::eINSTANCE.createSyncState();
//                mainState.setId("Main" + state.hashCode);
                mainState.setName("Main");
                mainState.setIsInitial(true);
                val termState = SyncgraphFactory::eINSTANCE.createSyncState();
//                termState.setId("Term" + state.hashCode);
                termState.setName("Term");
                termState.setIsFinal(true);
                // Move all inner regions of the state to the mainState
                val regions = ImmutableList::copyOf(state.regions);
                for (region : regions) {
                    mainState.regions.add(region);
//                    if (region.id.nullOrEmpty) {
//                        region.setId("R" + region.hashCode);
//                    }
                }
                mainRegion.getVertices.add(mainState);
                mainRegion.getVertices.add(termState);
                state.regions.add(mainRegion);
                // Create a transition from Main to Term
                val transition = SyncgraphFactory::eINSTANCE.createSyncTransition();
                transition.setTarget(termState);
                transition.setPriority(1);
                transition.setType(TransitionType::NORMALTERMINATION);
                mainState.outgoingTransitions.add(transition);            
//                val exitSignalEmission = SyncchartsFactory::eINSTANCE.createEmission();
//                exitSignalEmission.setSignal(exitSignal);
//                transition.effects.add(exitSignalEmission);
                
                // Move the watcher region outside the mainState
                state.regions.add(watcherRegion);
            }

            
             
        }
        
    }
 
 
 
    //-------------------------------------------------------------------------------
    //--      S C C -  C O N D I T I O N A L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------------
    
    def Statechart transformConditional(Statechart rootStatechart) {
        // Clone the complete SyncCharts region 
        val targetRootStatechart = CloningExtensions::clone(rootStatechart) as Statechart;
        var targetStates = targetRootStatechart.allContents.filter(typeof(Choice)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformConditional(targetRootStatechart);
        }
        
        targetRootStatechart;
    }
    
    // Traverse all states 
    def void transformConditional(Choice choice, Statechart targetRootStatechart) {
              
                var region = choice.eContainer() as Region; 
                
                val choiceReplacement = SyncgraphFactory::eINSTANCE.createSyncState();
                val incomingRedirect  = ImmutableList::copyOf(choice.incomingTransitions)
                val outgoingRedirect  = ImmutableList::copyOf(choice.outgoingTransitions)
                choiceReplacement.setName("");
                region.getVertices().add(choiceReplacement);
                for (transition : incomingRedirect) {
                    transition.setTarget(choiceReplacement);
                }
                for (transition : outgoingRedirect) {
                    transition.setSource(choiceReplacement);
                }
                    
                region.getVertices.remove(choice);
            
    }
  
    
}