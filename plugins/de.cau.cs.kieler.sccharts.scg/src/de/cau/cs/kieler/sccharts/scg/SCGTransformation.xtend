/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.sccharts.scg

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
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
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.serializer.ISerializer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.scg.optimizer.SuperfluousForkRemover
import com.google.inject.Guice

/** 
 * SCCharts CoreTransformation Extensions.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCGTransformation { 

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCGExtensions

    @Inject
    extension SCChartsExtension
    
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    //-------------------------------------------------------------------------
    //--                         U T I L I T Y                               --
    //-------------------------------------------------------------------------
         
    // State mappings         
    HashMap<EObject, Node> stateOrRegion2node = new HashMap<EObject, Node>()    
    HashMap<Node, EObject> node2state = new HashMap<Node, EObject>()    
    
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
    

    
    //-------------------------------------------------------------------------
    //--             T R A N S F O R M      T O    S C G                     --
    //-------------------------------------------------------------------------
    // @requires: none

    // Transforming Local ValuedObjects.
    def SCGraph transformSCG(State rootState) {
        // Fix termination transitions that have effects
        var rootRegion2 = rootState.fixTerminationWithEffects
        // Fix possible halt states
        rootRegion2 = rootRegion2.fixPossibleHaltStates
        // Expose local variables
        rootRegion2 = rootRegion2.transformLocalValuedObject  
        // Clear mappings
        resetMapping
        // Create a new SCGraph
        val sCGraph = ScgFactory::eINSTANCE.createSCGraph
        // Handle declarations
        for (valuedObject : rootRegion2.rootState.valuedObjects) {
            val valuedObjectSCG = sCGraph.createValuedObject(valuedObject.name)
            valuedObjectSCG.applyAttributes(valuedObject)
            valuedObjectSCG.map(valuedObject)
        }
        // Include top most level of hierarchy 
        // if the root state itself already contains multiple regions.
        // Otherwise skip the first layer of hierarchy.
        if (rootRegion2.rootState.regions.size>1) {
            // Generate nodes and recursively traverse model
            rootRegion2.transformSCGGenerateNodes(sCGraph)
            rootRegion2.transformSCGConnectNodes(sCGraph)        
        } else {
            // Generate nodes and recursively traverse model
            for (region : rootRegion2.rootState.regions) {
               region.transformSCGGenerateNodes(sCGraph)
            }
            // Generate nodes and recursively traverse model
            for (region : rootRegion2.rootState.regions) {
                region.transformSCGConnectNodes(sCGraph)
            }
        }
        
        // Fix superfluous exit nodes
        sCGraph.trimExitNodes.trimConditioanlNodes
        
        // Remove superfluous fork constructs 
        // ssm, 04.05.2014
        val SuperfluousForkRemover superfluousForkRemover = Guice.createInjector().getInstance(typeof(SuperfluousForkRemover))
        superfluousForkRemover.optimize(sCGraph)
    }
           
   // -------------------------------------------------------------------------   
           
   def boolean isPause(State state) {
       ((state.outgoingTransitions.filter[e|!e.isImmediate &&
                                             e.trigger == null && 
                                             e.effects.nullOrEmpty &&
                                             e.type != TransitionType::TERMINATION].size == 1) && 
       (state.outgoingTransitions.size == 1)) 
   }           
           
   def boolean isConditional(State state) {
       (
//           (state.outgoingTransitions.filter[e|e.isImmediate && 
//                                            e.trigger != null && 
//                                            e.effects.nullOrEmpty].size == 1) &&
        (state.outgoingTransitions.filter[e|e.isImmediate && 
                                            e.effects.nullOrEmpty].size == 2) &&                                             
       (state.outgoingTransitions.size == 2)) 
   }           

   def boolean isAssignment(State state) {
       ((state.outgoingTransitions.filter[e|e.isImmediate && 
                                            e.trigger == null && 
                                           !e.effects.nullOrEmpty &&
                                            e.type != TransitionType::TERMINATION].size == 1) && 
       (state.outgoingTransitions.size == 1)) 
   }           

   def boolean isFork(State state) {
       (!state.regions.nullOrEmpty && state.regions.allContents.filter(typeof(State)).size > 0)
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
       val exitNodes = sCGraph.eAllContents.filter(typeof(Exit)).toList
       val superfluousExitNodes = exitNodes.filter(e | e.next != null && e.next.target instanceof Exit).toList
       for (exitNode : superfluousExitNodes.immutableCopy) {
          val links = sCGraph.eAllContents.filter(typeof(ControlFlow))
                                          .filter( e | e.target == exitNode).toList
          for (link : links) {
              link.setTarget(exitNode.next.target)
          }                             
          
          if (exitNode.next != null) {
              val link = exitNode.next
              // The removal of the EOpposite relation is necessary
              link.target.incoming.remove(link)
          }
          sCGraph.nodes.remove(exitNode)
       }                    
       sCGraph
   }   
   
   // -------------------------------------------------------------------------

   // If two conditional nodes  with the same condition and the same then branch follow each other, remove the first one.
   def SCGraph trimConditioanlNodes(SCGraph sCGraph) {
       val conditionalNodes = sCGraph.eAllContents.filter(typeof(Conditional)).toList
       val superfluousConditionalNodes = conditionalNodes.filter(e | e.getElse != null 
                                                                  && e.getElse.target instanceof Conditional
                                                                  && (e.getElse.target as Conditional).condition.equals(e.condition)
                                                                  && (e.getElse.target as Conditional).then.target == e.then.target
       ).toList
       for (conditionalNode : superfluousConditionalNodes.immutableCopy) {
          val links = sCGraph.eAllContents.filter(typeof(ControlFlow))
                                          .filter( e | e.target == conditionalNode).toList
          for (link : links) {
              link.setTarget(conditionalNode.getElse.target)
          }                             
          
          if (conditionalNode.getElse != null) {
              val linkThen = conditionalNode.getThen
              val linkElse = conditionalNode.getElse
              // The removal of the EOpposite relation is necessary
              linkThen.target.incoming.remove(linkThen)
              linkElse.target.incoming.remove(linkElse)
          }
          sCGraph.nodes.remove(conditionalNode)
       }                    
       sCGraph
   }   

   // -------------------------------------------------------------------------   
   // --                 G E N E R A T E    N O D E S                        --
   // -------------------------------------------------------------------------   

   def void transformSCGGenerateNodes(Region region, SCGraph sCGraph) {
       val entry = sCGraph.addEntry
       val exit = sCGraph.addExit
       region.map(entry)
       entry.setExit(exit)
       exit.map(region)
       for (state : region.states) {
           state.transformSCGGenerateNodes(sCGraph)
       }
   }
           
   // -------------------------------------------------------------------------   

   // Traverse all states and transform possible local valuedObjects.
   def void transformSCGGenerateNodes(State state, SCGraph sCGraph) {
        System.out.println("Generate Node for State " + state.id)
        if (state.pause) {
            val surface = sCGraph.addSurface
            val depth = sCGraph.addDepth
            surface.setDepth(depth)
            surface.map(state)
            state.map(surface)
        }
        else if (state.assignment) {
            val assignment = sCGraph.addAssignment
            state.map(assignment)
            val transition = state.outgoingTransitions.get(0)
            scopeProvider.parent = transition.sourceState
            val transitionCopy = transition.copy
            transitionCopy.setImmediate(false)
            // Assertion: A SCG normalized SCChart should have just ONE assignment per transition
            val effect = transitionCopy.effects.get(0) as de.cau.cs.kieler.sccharts.Effect
            if (effect instanceof de.cau.cs.kieler.sccharts.Assignment) {
                // For hostcode e.g. there is no need for a valued object - it is allowed to be null
                val sCChartAssignment = (effect as de.cau.cs.kieler.sccharts.Assignment)
                if (sCChartAssignment.valuedObject != null) {
                    assignment.setValuedObject(sCChartAssignment.valuedObject.getSCGValuedObject)
                }
                // TODO: Test if this works correct? Was before: assignment.setAssignment(serializer.serialize(transitionCopy))
                assignment.setAssignment(sCChartAssignment.expression.convertToSCGExpression)
                if (!sCChartAssignment.indices.nullOrEmpty) {
                	sCChartAssignment.indices.forEach[
                		assignment.indices += it.convertToSCGExpression
                	]
                }
            }
            else if (effect instanceof de.cau.cs.kieler.sccharts.TextEffect) {
                assignment.setAssignment((effect as de.cau.cs.kieler.sccharts.TextEffect).convertToSCGExpression)
            }
        }
        else if (state.conditional) {
            val conditional = sCGraph.addConditional
            state.map(conditional)
            scopeProvider.parent = state
            val transition = state.outgoingTransitions.get(0)
            scopeProvider.parent = transition.sourceState
            val transitionCopy = transition.copy
            transitionCopy.setImmediate(false)
            // TODO  Test if this works correct? Was before:  conditional.setCondition(serializer.serialize(transitionCopy))
            conditional.setCondition(transitionCopy.trigger.convertToSCGExpression)
        }
        else if (state.fork) {
            val fork = sCGraph.addFork
            val join = sCGraph.addJoin
            fork.setJoin(join)
            state.map(fork)
            join.map(state)
            // Do recursion for all regions
            for (region : state.regions) {
                region.transformSCGGenerateNodes(sCGraph)
            }
        }
        else if (state.exit) {
            val exit = sCGraph.addExit
            state.map(exit)
        }
    }
    

   // -------------------------------------------------------------------------   
   // --                  C O N N E C T    N O D E S                         --
   // -------------------------------------------------------------------------   

   def void transformSCGConnectNodes(Region region, SCGraph sCGraph) {
       val entry = region.mappedEntry
       // Connect all entry nodes with the initial state's nodes.
       // Also check the parent container in case the "initial" state is the root state.
       val initialState = region.states.filter(e | e.isInitial || e.eContainer.eContainer == null).get(0)
       val initialNode = initialState.mappedNode
       val controlFlowInitial = initialNode.createControlFlow
       entry.setNext(controlFlowInitial)
        
       for (state : region.states) {
           state.transformSCGConnectNodes(sCGraph)
       }
   }
           
   // -------------------------------------------------------------------------   

   // Traverse all states and transform possible local valuedObjects.
   def void transformSCGConnectNodes(State state, SCGraph sCGraph) {
        System.out.println("Connect Node for State " + state.id)
        if (state.pause) {
            // Connect the depth with the node that belongs to the target of
            // the single delayed transition outgoing from the current state
            val surface = state.mappedSurface
            val depth = surface.depth

            val targetState = state.outgoingTransitions.get(0).targetState
            val otherNode = targetState.mappedNode   
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow
                depth.setNext(controlFlow)    
            }   
        }
        else if (state.assignment) {
            // Connect the assignment with the node that belongs to the target
            // of the single immediate assignment transition outgoing  from
            // the current state
            val assignment = state.mappedAssignment

            val targetState = state.outgoingTransitions.get(0).targetState
            val otherNode = targetState.mappedNode   
            if (otherNode != null) {
                val controlFlow = otherNode.createControlFlow
                assignment.setNext(controlFlow)
            }
        }
        else if (state.conditional) {
            // Connect the conditional Then branch with the node that belongs
            // to the target of the single immediate transition with a trigger
            // outgoing  from the current state. Connect the Else branch with the
            // node that belongs to the target of the (other) single immediate
            // transition without a trigger outgoing from the current state.
            val conditional = state.mappedConditional

            val transitionThen = state.outgoingTransitions.filter(e | e.trigger != null).get(0)
            val transitionElse =  state.outgoingTransitions.filter(e | e.trigger == null).get(0)
            val otherNodeThen = transitionThen.targetState.mappedNode
            val otherNodeElse = transitionElse.targetState.mappedNode
            if (otherNodeThen != null) {
                val controlFlowThen = otherNodeThen.createControlFlow
                conditional.setThen(controlFlowThen)
            }
            if (otherNodeElse != null) {
                val controlFlowElse = otherNodeElse.createControlFlow
                conditional.setElse(controlFlowElse)
            }
        }
        else if (state.fork) {
            // For all region find the entry node and connect it with the fork. Find the exit node
            // and connect it with the join. Do the recursive call for the regions. Connect
            // the join node with the single normal termination target's node.
            val fork = state.mappedFork
            val join = fork.join
            // Do recursion for all regions
            for (region : state.regions) {
                val otherNodeEntry = region.mappedEntry
                if (otherNodeEntry != null) {
                    val controlFlowEntry = otherNodeEntry.createControlFlow
                    fork.next.add(controlFlowEntry)
                }   
                val otherNodeExit = region.mappedEntry.exit   
                if (otherNodeExit != null) {
                    val controlFlowFinal = join.createControlFlow
                    otherNodeExit.setNext(controlFlowFinal)
                }   
                region.transformSCGConnectNodes(sCGraph)
            }
            if (state.outgoingTransitions.size>0) {
                val termination = state.outgoingTransitions.get(0)
                val terminationTargetState = termination.targetState
                val otherNodeTermination = terminationTargetState.mappedNode   
                if (otherNodeTermination != null) {

                    val controlFlowTermination = otherNodeTermination.createControlFlow
  
// STEVEN'S HOTHOTFIX                   
//                  // Add another assignment if the termination has an effect.
//                  if (!termination.effects.nullOrEmpty) {
//                      val assignment = sCGraph.addAssignment
//                      val transitionCopy = termination.copy
//                      transitionCopy.setImmediate(false)
//                      val effect = transitionCopy.effects.get(0)
//                      val sCChartAssignment = (effect as de.cau.cs.kieler.sccharts.Assignment)
//                      assignment.setValuedObject(sCChartAssignment.valuedObject.getSCGValuedObject)
//                      assignment.setAssignment(sCChartAssignment.expression.convertToSCGExpression)
//                      assignment.setNext(controlFlowTermination)
//                      join.setNext(assignment.createControlFlow)                  
//                  } else {
                        join.setNext(controlFlowTermination)
//                    }
                    
                }   
            } else {
                // The root state does not have a normal termination.
                // Use the corresponding exit node of the root region in this case. 
                val controlFlow = (state.eContainer as Region).getMappedEntry.exit.createControlFlow 
                join.setNext(controlFlow)
            }
        }
        else if (state.exit) {
            // For a final state connect it's exit node representation with the exit node
            // of the region.
            val nodeExit = state.mappedExit
            val regionExit = state.parentRegion.mappedEntry.exit
            val controlFlowFinal = regionExit.createControlFlow
            nodeExit.setNext(controlFlowFinal)
        }
    }

    //-------------------------------------------------------------------------
    //--              C O N V E R T   E X P R E S S I O N S                  --
    //-------------------------------------------------------------------------

    // Create a new reference Expression to the corresponding sValuedObject of the expression
    def dispatch Expression convertToSCGExpression(ValuedObjectReference expression) {
        expression.valuedObject.SCGValuedObject.reference => [ vor |
        	expression.indices.forEach[
        		vor.indices += it.convertToSCGExpression
        	]
        ]
    }

    // Apply conversion to operator expressions like and, equals, not, greater, val, pre, add, etc.
    def dispatch Expression convertToSCGExpression(OperatorExpression expression) {
        val newExpression = createOperatorExpression(expression.operator)
        for (subExpression : expression.subExpressions) {
            newExpression.subExpressions.add(subExpression.convertToSCGExpression)
        }
        return newExpression;
    }

    // Apply conversion to integer values
    def dispatch Expression convertToSCGExpression(IntValue expression) {
        createIntValue(expression.value)
    }

    // Apply conversion to float values
    def dispatch Expression convertToSCGExpression(FloatValue expression) {
        createFloatValue(expression.value)
    }

    // Apply conversion to boolean values
    def dispatch Expression convertToSCGExpression(BoolValue expression) {
        createBoolValue(expression.value)
    }    

    // Apply conversion to textual host code 
    def dispatch Expression convertToSCGExpression(TextExpression expression) {
        val textExpression = createTextExpression
        textExpression.setText(expression.text.removeEnclosingQuotes)
        textExpression
    }    
    
    // Apply conversion to the default case
    def dispatch Expression convertToSCGExpression(Expression expression) {
        createExpression
    }

   // -------------------------------------------------------------------------   
}
