/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.prio.s.xtend

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TextEffect
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Node
import java.util.List
import org.eclipse.xtend.util.stdlib.TraceComponent
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension

/**
 * Helper class with utility functions for conversion of a SyncChart into an S program.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
 class Helper {
     
    @Inject
    extension SCChartsExtension     

    @Inject
    extension KExpressionsExtension     
     
    // ======================================================================================================
    // ==                       B A S I C   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================

    // Returns true iff the state has at least one outgoing transition
    def boolean hasOutgoingTransitions(State state) {
        !state.outgoingTransitions.nullOrEmpty;
    }
        
    // Returns true if the state is hierarchical or has outgoing transitions.
    // Thus rules out states that are simple and have no further outgoing transitions.
    def boolean needsDependencyRepresentation(State state) {
        state.hierarchical || state.hasOutgoingTransitions
    }    

    // Returns true iff the state is hierarchical and has a weak immediate transition (so it needs an extra surface state).
    def Boolean needsExtraSurfaceSState(State state) {
        (state.hierarchical && (state.weakTransitionsOrdered.filter(e|e.isImmediate).size > 0));
    }

    // Returns true iff the state is hierarchical and has a normal termination (so it needs an extra join state).
    def Boolean needsJoinSState(State state) {
        (state.hierarchical && (state.getNormalTerminationTransition != null));
    }

    // Get weak transitions ordered by their priority.
    def List<Transition> getWeakTransitionsOrdered(State state) {
        state.outgoingTransitions.filter(e|e.type == TransitionType::WEAKABORT).sort(e1, e2 | compareTransitionPriority(e1,e2));
    }

    // Get strong transitions ordered by their priority.
    def List<Transition> getStrongTransitionsOrdered(State state) {
        state.outgoingTransitions.filter(e|e.type == TransitionType::STRONGABORT).sort(e1, e2 | compareTransitionPriority(e1,e2));
    }
    
    // Get normal termination transition.
    def Transition getNormalTerminationTransition(State state) {
        val normalTerminations = state.outgoingTransitions.filter(e|e.type == TransitionType::TERMINATION);
        if (normalTerminations.nullOrEmpty) {
            return null;
        }
        return normalTerminations.toList.get(0);
    }

    // Returns true if the state has no outgoing transitions or if the state is declared to be final 
    // (in which case it SHOULD not have any outgoing transitions).
    def boolean finalState(State state) {
        return (state.outgoingTransitions.nullOrEmpty || state.isFinal);
    }


    // ======================================================================================================
    // ==                            C O N V E R T   E X P R E S S I O N S                                 ==
    // ======================================================================================================

    // Apply conversion on ValuedObjectReference for handling present tests of simple triggers.
    def dispatch Expression convertToSExpression(ValuedObjectReference expression) {
         val sValuedObject = TraceComponent::getSingleTraceTarget(expression.valuedObject, "ValuedObject") as de.cau.cs.kieler.core.kexpressions.ValuedObject
        val newExpression = KExpressionsFactory::eINSTANCE.createValuedObjectReference;
        newExpression.setValuedObject(sValuedObject);
         newExpression; 
    }

    // Retrieve a boolean TRUE KExpression.
    def Expression getTrueBooleanValue() {
        var booleanValue = KExpressionsFactory::eINSTANCE.createBoolValue();
         booleanValue.setValue(true);
         booleanValue    
    }

    // Retrieve a boolean FALSE KExpression.
    def Expression getFalseBooleanValue() {
        var booleanValue = KExpressionsFactory::eINSTANCE.createBoolValue();
         booleanValue.setValue(true);
         booleanValue    
    }


    // Apply conversion to operator expressions like and, equals, not, greater, val, pre, add, etc.
    def dispatch Expression convertToSExpression(OperatorExpression expression) {
        val newExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
        newExpression.setOperator(expression.operator);
        for (subExpression : expression.subExpressions) {
            newExpression.subExpressions.add(subExpression.convertToSExpression)
        }
        return newExpression;
    }

    // Apply conversion to integer values
    def dispatch Expression convertToSExpression(IntValue expression) {
        var newExpression = KExpressionsFactory::eINSTANCE.createIntValue();
        newExpression.setValue(expression.value);
        newExpression;
    }

    // Apply conversion to float values
    def dispatch Expression convertToSExpression(FloatValue expression) {
        var newExpression = KExpressionsFactory::eINSTANCE.createFloatValue();
        newExpression.setValue(expression.value);
        newExpression;
    }

    // Apply conversion to boolean values
    def dispatch Expression convertToSExpression(BoolValue expression) {
        var newExpression = KExpressionsFactory::eINSTANCE.createBoolValue();
        newExpression.setValue(expression.value);
        newExpression;
    }    

    // Apply conversion to textual host code 
    def dispatch Expression convertToSExpression(TextExpression expression) {
        var newExpression = KExpressionsFactory::eINSTANCE.createTextExpression
        newExpression.setText("'" +  expression.text + "'");
        newExpression;
    }    
    
    // Apply conversion to the default case
    def dispatch Expression convertToSExpression(Expression expression) {
        var newExpression = KExpressionsFactory::eINSTANCE.createExpression;
        newExpression;
    }

    // ======================================================================================================
    // ==                               C O N V E R T    E F F E C T S                                     ==
    // ======================================================================================================

    // Convert SyncChart transition effects and add them to an instructions list.
    def dispatch void convertToSEffect(Emission effect, List<de.cau.cs.kieler.s.s.Instruction> instructions) {
        val sAssignment = SFactory::eINSTANCE.createAssignment
        val sValuedObject = TraceComponent::getSingleTraceTarget(effect.valuedObject, "ValuedObject") as de.cau.cs.kieler.core.kexpressions.ValuedObject
        if (effect.newValue != null) {
            val sValuedObjectValue = effect.newValue.convertToSExpression;
            sAssignment.setVariable(sValuedObject)
            sAssignment.setExpression(sValuedObjectValue)
            instructions.add(sAssignment);
        }
    }
    
    // Convert SyncChart variable assignments and add them to an instructions list.
    def dispatch void convertToSEffect(Assignment effect, List<de.cau.cs.kieler.s.s.Instruction> instructions) {
        val sAssignment = SFactory::eINSTANCE.createAssignment
        val sValuedObject = TraceComponent::getSingleTraceTarget(effect.valuedObject, "ValuedObject") as de.cau.cs.kieler.core.kexpressions.ValuedObject
        val sValuedObjectValue = effect.expression.convertToSExpression;
        sAssignment.setVariable(sValuedObject)
        sAssignment.setExpression(sValuedObjectValue)
        instructions.add(sAssignment);
    }

    // Convert SyncChart text effects and add them to an instructions list.
    def dispatch void convertToSEffect(TextEffect effect, List<de.cau.cs.kieler.s.s.Instruction> instructions) {
        val sHostCode = SFactory::eINSTANCE.createHostCodeInstruction;
        sHostCode.setHostCode("'" + effect.text + ";'");
        instructions.add(sHostCode);
    }


    // ======================================================================================================
    // ==        C O N V E R T   S Y N C C H A R T   S I G N A L S   I N T O   S   S I G N A L S           ==
    // ======================================================================================================

//    // Convert SyncChart variables of a state into S textual host code. Return null if there are no variables.    
//    def String getStateVariables (State state){
//        var StringBuffer returnText = new StringBuffer();
//        for (variable : state.variables) {
//            returnText.append(variable.type.getName.toLowerCase);
//            returnText.append(" ");
//            returnText.append(variable.name);
//            if (variable.initialValue != null) {
//                  returnText.append(" = ");
//                returnText.append(variable.initialValue);
//            }
//            returnText.append(";");
//        }
//        if (returnText.length > 0) {
//            "'" + returnText.toString + "'";
//        } else {
//            null;
//        }
//    }    
    
    // Convert a single SyncChart signal and create a new S signal.
    def create target : KExpressionsFactory::eINSTANCE.createValuedObject() transform(ValuedObject valuedObject) {
        target.setCombineOperator(valuedObject.combineOperator) 
        target.setName(valuedObject.name)
        target.setInitialValue(valuedObject.initialValue)
        target.setSignal(valuedObject.isSignal) 
        target.setInput(valuedObject.isInput) 
        target.setOutput(valuedObject.isOutput) 
        target.setType(valuedObject.type)
        
        // Create traces for created signal
        TraceComponent::createTrace(valuedObject, target, "ValuedObject" );
        TraceComponent::createTrace(target, valuedObject, "ValuedObjectBack" );
    }


    // ======================================================================================================
    // ==                           C R E A T E   I D E N T I T Y   L A B E L S                            ==
    // ======================================================================================================

    // Returns a String for a region if a state has more than one inner regions.
    def String getParentRegionString(State state) {
        var Region region = state.parentRegion;
        if (region.parentState.regions.size == 1) {
            ""
        }
        else { 
            "_" + region.id
        }
    }

    // For C variables it is necessary to remove special characters, this may lead
    // to name clashes in unlikely cases. 
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
               .replace("#","").replace("$","").replace("?","")
               .replace("!","").replace("%","").replace("&","")
               .replace("[","").replace("]","").replace("<","")
               .replace(">","").replace(".","").replace(",","")
               .replace(":","").replace(";","").replace("=","");
    }
    
//    // This helper method returns the hierarchical name of a state considering all hierarchical
//    // higher states. A string is formed by the traversed state IDs.
//    def String getHierarchicalName(State state, String StartSymbol) {
//        if (state.parentRegion != null) {
//            if (state.parentRegion.parentState != null) {
//                var higherHierarchyReturnedName = state.parentRegion.parentState.getHierarchicalName(StartSymbol);
//                var regionId = state.parentRegion.id.removeSpecialCharacters;
//                var stateId = state.id.removeSpecialCharacters;
//                // Region IDs can be empty, state IDs normally aren't but the code generation handles 
//                // also this case. 
//                if (stateId.nullOrEmpty) {
//                    stateId = state.hashCode + "";
//                }
//                if (regionId.nullOrEmpty) {
//                    regionId = state.parentRegion.hashCode + "";
//                }
//                if (!higherHierarchyReturnedName.nullOrEmpty) {
//                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
//                }
//                if (state.parentRegion.parentState.regions.size > 1) {
//                    return higherHierarchyReturnedName 
//                           + regionId  + "_" +  state.id.removeSpecialCharacters;
//                }
//                else {
//                    // this is the simplified case, where there is just one region and we can
//                    // omit the region id
//                    return higherHierarchyReturnedName  
//                           + state.id.removeSpecialCharacters;
//                }
//            }
//        }
//        return StartSymbol + "_";
//    }



    // ======================================================================================================
    // ==                                             T R A C I N G                                        ==
    // ======================================================================================================

    // Get the Surface of a State.
    def de.cau.cs.kieler.s.s.State getSurfaceSState(State state) {
           TraceComponent::getSingleTraceTarget(state, "Surface") as de.cau.cs.kieler.s.s.State
       }
   
       // Get the Depth of a State.
       def de.cau.cs.kieler.s.s.State getDepthSState(State state) {
            TraceComponent::getSingleTraceTarget(state, "Depth") as de.cau.cs.kieler.s.s.State
       }
       
       // Get the Join of a State.
       def de.cau.cs.kieler.s.s.State getJoinSState(State state) {
            TraceComponent::getSingleTraceTarget(state, "Join") as de.cau.cs.kieler.s.s.State
       }

       // Get a possibly second ExtraSurface of a State.
       def de.cau.cs.kieler.s.s.State getExtraSurfaceSState(State state) {
            TraceComponent::getSingleTraceTarget(state, "ExtraSurface") as de.cau.cs.kieler.s.s.State
       }

    // ======================================================================================================
    // ==                         P R I O   S T A T E M E N T   H E L P E R S                              ==
    // ======================================================================================================

    // Only add the PRIO statement (a) if the last one was not the same. (b) If the last one came right before
    // and was higher in which case the higher PRIO statement will be replaced by the new lower one.
     def void addOptimized(List<Instruction> instructions, Prio prioStatement) {
         val lastPrioStatementList = instructions.filter(typeof(Prio)).toList()
         // (a) check if PRIO has not changed
         if (!lastPrioStatementList.nullOrEmpty) {
             val lastPrioStatement = lastPrioStatementList.last;
             if (lastPrioStatement.priority == prioStatement.priority) {
                 return
             }
         }
         // (b) Check if a PRIO instruction just before is higher or equal
         val lastInstruction = instructions.toList.last;
         if ((lastInstruction instanceof Prio) && ((lastInstruction as Prio).priority > prioStatement.priority)) {
             // Lower last PRIO statement
             (lastInstruction as Prio).setPriority(prioStatement.priority);
             return;
         }
        instructions.add(prioStatement);
     }
    
    // Add the lowest weak PRIO to the S state. If a state has no weak PRIO because it is a simple SyncChart state
    // the strong PRIO will be taken instead by getLowestDependencyWeakNode().
    def void addLowestWeakPrio(de.cau.cs.kieler.s.s.State sState, State state) {
        var prioStatement = SFactory::eINSTANCE.createPrio();
        var dependencyNode = state.getLowestDependencyWeakNode(null)
        if (dependencyNode != null) {
            val priority = dependencyNode.priority;
            prioStatement.setPriority(priority);
            sState.instructions.addOptimized(prioStatement)
        }
    }

    // Add the highest weak PRIO to the S state. If a state has no weak PRIO because it is a simple SyncChart state
    // the strong PRIO will be taken instead by getLowestDependencyWeakNode().
    def void addHighestWeakPrio(de.cau.cs.kieler.s.s.State sState, State state) {
        addWeakPrio(sState, state, null);
    }
    
    // Add the highest strong PRIO to the S state. There always exists a strong PRIO for each simple or macro
    // SyncChart state.
    def void addHighestStrongPrio(de.cau.cs.kieler.s.s.State sState, State state) {
        addStrongPrio(sState, state, null);
    }    
    
    // Add the concrete weak PRIO of a (state, transition)-tuple to the S state.
    def void addWeakPrio(de.cau.cs.kieler.s.s.State sState, State state, Transition transition) {
        var prioStatement = SFactory::eINSTANCE.createPrio();
        var dependencyNode = state.getHighestDependencyWeakNode(transition)
        if (dependencyNode != null) {
            val priority = dependencyNode.priority;
            prioStatement.setPriority(priority);
            sState.instructions.addOptimized(prioStatement)
        }
    }
    
    // Add the concrete strong PRIO of a (state, transition)-tuple to the S state.
    def void addStrongPrio(de.cau.cs.kieler.s.s.State sState, State state, Transition transition) {
        var prioStatement = SFactory::eINSTANCE.createPrio();
        var dependencyNode = state.getHighestDependencyStrongNode(transition)
        if (dependencyNode != null) {
            val priority = dependencyNode.priority;
            prioStatement.setPriority(priority);
            sState.instructions.addOptimized(prioStatement)
        }
    }    
    
    
    // ======================================================================================================
    // ==                    D E P E N D E N C Y   N O D E S   H E L P E R S                               ==
    // ======================================================================================================

    // Get the highest priority from all strong nodes for a SyncChart state or 0 if no dependency node exists.
    def int getHighestDependencyStrong(State state) {
          val priorityNode = state.highestDependencyStrongNode;
          if (priorityNode != null) {
               return priorityNode.priority;
          } else {
               return 1; // example 109
          }
    }

    // Get the DependenyNode with the highest priority from all strong nodes for a SyncChart state.
    def Node getHighestDependencyStrongNode(State state) {
        return  getHighestDependencyStrongNode(state, null);    
    }
    
    // Get the DependenyNode with the highest priority from all weak nodes for a SyncChart state.
    // For simple state that do not have any representation this function returns  null.
    def Node getHighestDependencyWeakNode(State state) {
        if (!state.needsDependencyRepresentation) {
            return null;
        }
        if (!state.hierarchical) {
            // for simple states, weak priorities are the same as strong priorities
            return getHighestDependencyStrongNode(state, null);
        }
        return  getHighestDependencyWeakNode(state, null);    
    }
    
    // Get the DependenyNode with the lowest priority from all strong nodes for a SyncChart state.
    def Node getLowestDependencyStrongNode(State state) {
        return  getLowestDependencyStrongNode(state, null);    
    }
    
    // Get the DependenyNode with the lowest priority from all weak nodes for a SyncChart state.
    def Node getLowestDependencyWeakNode(State state) {
        if (!state.hierarchical) {
            // for simple states, weak priorities are the same as strong priorities
            return getLowestDependencyStrongNode(state, null);
        }
        return  getLowestDependencyWeakNode(state, null);    
    }    


    // Get the highest priority for all strong nodes of this state in case transition is null
    // or the strong dependency node linked to this transition.
    // For simple state that do not have any representation this function returns null.
    def Node getHighestDependencyStrongNode(State state, Transition transition) {
        val nodes = (TraceComponent::getTraceTargets(state, "DependencyStrong") as List<Node>);
        if (nodes.empty) {
            // in case the strong representation is optimized away (because there are no outgoing strong
            // transitions) take the weak representation instead.
            return state.getHighestDependencyWeakNode();
        }
        var node = nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).get(0);
        if (transition != null) {
            node = nodes.filter(e|e.transition == transition).toList().get(0);    
        }
        if (node != null) {
            return node;
        }
        // in case the strong representation is optimized away (because there are no outgoing strong
        // transitions) take the weak representation instead.
        return state.getHighestDependencyWeakNode();
    }
    
    // Get the highest priority for all strong nodes of this state in case transition is null
    // or the strong dependency node linked to this transition.
    def Node getLowestDependencyStrongNode(State state, Transition transition) {
        val nodes = (TraceComponent::getTraceTargets(state, "DependencyStrong") as List<Node>);
        if (nodes.empty) {
            return null;
        }
        if (transition == null) {
            return    nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).toList.last;
        }
        return nodes.filter(e|e.transition == transition).toList().get(0);
    }
        
    // Get the highest priority for all weak nodes of this state in case transition is null
    // or the weak dependency node linked to this transition.
    def Node getHighestDependencyWeakNode(State state, Transition transition) {
        if (!state.hierarchical) {
            // for simple states, weak priorities are the same as strong priorities
            return getHighestDependencyStrongNode(state, transition)
        }
        val nodes = (TraceComponent::getTraceTargets(state, "DependencyWeak") as List<Node>);
        if (nodes.empty) {
            return null;
        }
        if (transition == null) {
            return nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).get(0);
        }
        return nodes.filter(e|e.transition == transition).toList().get(0);
    }

    // Get the lowest priority for all weak nodes of this state in case transition is null
    // or the weak dependency node linked to this transition.
    def Node getLowestDependencyWeakNode(State state, Transition transition) {
        if (!state.hierarchical) {
            // for simple states, weak priorities are the same as strong priorities
            return getLowestDependencyStrongNode(state, transition)
        }
        val nodes = (TraceComponent::getTraceTargets(state, "DependencyWeak") as List<Node>);
        if (nodes.empty) {
            return null;
        }
        if (transition == null) {
            return nodes.sort(e1, e2 | compareDependencyPriority(e2,e1)).toList.last;
        }
        return nodes.filter(e|e.transition == transition).toList().get(0);
    }


    // ======================================================================================================
    // ==                                          C O M P A R E                                           ==
    // ======================================================================================================

    // Compare highest strong dependencies of two SCCharts states. Make sure the root node has HIGHTEST prio.
    def int compareTraceDependencyPriority(State e1, State e2) {
//        System::out.println("----");
//        System::out.println(e1 + " : "+ e1.id);
//        System::out.println(e2 + " : "+ e2.id);
//        System::out.println("-");
        val node1 = e1.getHighestDependencyStrongNode(null);
        val node2 = e2.getHighestDependencyStrongNode(null)
        var node1Priority = 1;
        var node2Priority = 1;
        if (node1 != null) {
            node1Priority = node1.priority;
        }
        if (node2 != null) {
            node2Priority = node2.priority;
        }
        if (e1.isRootState) {
               return -1;
        }
        if (e2.isRootState) {
               return 1;
        }
        if (node1Priority >= 
            node2Priority) {-1} else {1}
    }

    // Compare two transitions by their prioritiy.
    def int compareTransitionPriority(Transition e1, Transition e2) {
        if (e1.priority < e2.priority) {-1} else {1}    
    }

    // Compare two DependencyNodes by their priority.
    def int compareDependencyPriority(Node e1, Node e2) {
        if (e1.priority < e2.priority) {-1} else {1}    
    }


    // ======================================================================================================
}