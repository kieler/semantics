/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.circuit.processors

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import java.util.HashMap
import java.util.LinkedList
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.scg.SCGraphs
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

/**
 * @author fry
 * 
 * Transformation from SSA SCG into Circuit.
 * Follows the control flow of the SCG.
 */
class SSA_SCG2CircuitTransformation extends ExogenousProcessor<SCGraphs, Actor> implements Traceable {// extends AbstractProductionTransformation {

	override getId() {
		"de.cau.cs.kieler.seqssa.circuit"
	}

	override getName() {
		"Circuit Processor"
	}

	@Inject extension KEffectsSerializeExtensions
	@Inject extension KEffectsExtensions
	@Inject extension SCGControlFlowExtensions

	@Inject LinkCreator linkCreator
	@Inject	CircuitInitialization circuitInitialization
	
//	protected var KielerCompilerContext compilerContext
		
	val LinkedList<String> assignmentActor = new LinkedList<String>
	val voExpressions = new HashMap<String, ValuedObject>

	override process() {
       model = model.scgs.head.transform
	}

	def transform(SCGraph scg) {

		assignmentActor.clear
		voExpressions.clear

		// this map stores SSA variables of input output variables and their highest version number
		// only interesting for linkCreator 
//		val inputOutputMap = context.compilationResult.getAuxiliaryData(SSAMapData).head.inputOutputMap
		val inputOutputMap = environment.getProperty(SeqSCG2SSA_SCGTransformation.SSA_MAP_DATA).inputOutputMap
		
		
		// -------------------------------------------------------
		// --              Create Circuit Regions               --
		// -------------------------------------------------------
		/**
		 * Root object which will contain the circuit:
		 * 
		 * - In/Output nodes for each input and output
		 * - ProgramLogic region for the program's logic
		 * - Initialization region for input output registers and reset logic
		 */
		val newCircuit = CircuitFactory::eINSTANCE.createActor
		newCircuit.name = scg.label
		creationalTransformation(model, newCircuit)

		val logicRegion = CircuitFactory::eINSTANCE.createActor
		logicRegion.name = "Program Logic"
		newCircuit.innerActors += logicRegion

		val initializationRegian = CircuitFactory::eINSTANCE.createActor
		initializationRegian.name = "Circuit Initialization"
		newCircuit.innerActors += initializationRegian
		
		// -------------------------------------------------------
		// --              Initialize Circuit Regions           --
		// -------------------------------------------------------

		// filter all input/output declarations to initialize the circuit
		val inputsAndOutputs = scg.declarations.filter(VariableDeclaration).filter[isInput || isOutput].toList

		// initialize circuit creates all inputs/outputs and a tick and reset input
		circuitInitialization.initialize(inputsAndOutputs, initializationRegian, logicRegion, newCircuit)
		
		// -------------------------------------------------------
		// --              Transform SSA SCG Nodes              --
		// -------------------------------------------------------
		
		// create actors of the circuit. chose entry node of SCG as starting point.
		val entry = scg.nodes.filter(Entry).head

        // If the SCG does not have an entry node, use the assignment that does not have any incoming controlflows.
        val firstAssignment = if (entry === null)  
          scg.nodes.filter(Assignment).filter[ it.incomingLinks.filter(ControlFlow).empty ].head
          else (entry.next.target as Assignment)
		
		transformNodesToActors(firstAssignment, logicRegion)
		
		// -------------------------------------------------------
		// --              Create Links                         --
		// -------------------------------------------------------
		// create links for each region of the circuit
		// this has to be done step by step..... otherwise wrong ports are connected
		linkCreator.circuitRegion(newCircuit)
		linkCreator.logicRegion(logicRegion, inputOutputMap)
		linkCreator.initRegion(initializationRegian)

		//return the circuit
		newCircuit

	}

	/**
	 * Follow the control flow of the SSA SCG and check the type of the nodes.
	 * 
	 * - for assignment nodes call transformAssignemnt and check the next node for its type
	 * - for conditional nodes call transformConditionalNodes and let this function call 
	 *   transformNodesToActors if the control flow is unique again
	 */
	def void transformNodesToActors(Node n, Actor logic) {
	    if (n === null) return;
	    
		if (!(n instanceof Exit)) {
			if (n instanceof Assignment) {
				transformAssignment(n, logic)
				transformNodesToActors(n.next?.targetNode, logic)
			} else if (n instanceof Conditional) {
				transformNodesToActors(transformConditionalNodes(n, n.then.targetNode, n.^else.targetNode, logic), logic)
			}
		}
	}

	/**
	 * Creates a MUX for each Assignment node on the "else"-branch. This MUX has the condition as selector port.
	 * The assignment of the "else"-branch is input for the false case of the condition. (port name: In_0)
	 * The assignment on the then branch is input for the true case of the condition. (port name: In_1)
	 * 
	 * In case of a conditional node on the "then"-branch: first transform its assignment nodes before coming back to its "root"
	 */
	def Node transformConditionalNodes(Conditional source, Node thenNode, Node elseNode, Actor logic) {
		checkForVOassignments(source.condition)
		
		//on the "else"-branch should only be assignment nodes. If this is not the case something went wrong before..
		if (elseNode instanceof Assignment) {
			if (thenNode instanceof Conditional) {

				transformConditionalNodes(source,
					transformConditionalNodes(thenNode, thenNode.then.targetNode, thenNode.^else.targetNode, logic),
					elseNode.next.targetNode, logic)
			} else if (thenNode instanceof Assignment) {
				

				// --           Create new MUX           --
				val newMUX = CircuitFactory::eINSTANCE.createActor
				newMUX.type = "MUX"
				newMUX.name = thenNode.valuedObject.name
				newMUX.trace(source)
				
				//add MUX to logic region
				logic.innerActors += newMUX
				
				val truePort = CircuitFactory::eINSTANCE.createPort
				val falsePort = CircuitFactory::eINSTANCE.createPort
				val selectPort = CircuitFactory::eINSTANCE.createPort
				val outputPort = CircuitFactory::eINSTANCE.createPort

				newMUX.ports.add(truePort)
				newMUX.ports.add(falsePort)
				newMUX.ports.add(selectPort)
				newMUX.ports.add(outputPort)
				
				//TODO: maybe there is a better solution than using strings as port types to differentiate between ports.
				truePort.type = "In_1"
				falsePort.type = "In_0"
				selectPort.type = "Sel"
				outputPort.type = "Out"

				outputPort.name = thenNode.valuedObject.name
				selectPort.name = source.condition.serialize.toString
				
				// --           handle input of true port: source is then-branch           --
				// create constant 0 and 1 or take the whole expression as input for the true case of the condition
				// if an expression is assigned: call transformExpression to create all necessary gates
				if (thenNode.expression.serialize.toString == "true") {
					truePort.name = "const1_" + newMUX.name
					circuitInitialization.createConstantOne(logic, truePort.name)
				} else if (thenNode.expression.serialize.toString == "false") {
					truePort.name = "const0_" + newMUX.name
					circuitInitialization.createConstantZero(logic, truePort.name)
				} else {
					val exp = thenNode.expression
					if (exp instanceof ValuedObjectReference) {
						voExpressions.put(thenNode.valuedObject.name, exp.valuedObject)

					} else {
						checkForVOassignments(thenNode.expression)
						truePort.name = thenNode.expression.serialize.toString
						transformExpressions(thenNode.expression, logic)
					}
				}

				// --           handle input of false port: source is else-branch           --
				falsePort.name = elseNode.expression.serialize.toString

				// e.g. O_1 = pre(O)
				if (!(elseNode.expression instanceof ValuedObjectReference)) {
					transformExpressions(elseNode.expression, logic)
				}
				
				// call this method again if the target of then- and else-branch is not the same
				if (!(thenNode.next.target == elseNode.next.target)) {
					transformConditionalNodes(source, thenNode.next.targetNode, elseNode.next.targetNode, logic)
				} else {
					return thenNode.next.targetNode
				}

			}
		}
		else {
			throw new IllegalArgumentException( "No assignment node on else-branch! Node string is: " + elseNode.toString );
		}
	}

	/**
	 * This method receives only assignments with guards on their left sides. 
	 * 
	 * E.g. g3 = !(g1 && !A)
	 * In this case transformAssignment should create a NOT gate with name g3,
	 * one input port named g1 && !A and one output port named g3
	 * 
	 */
	def transformAssignment(Assignment assignment, Actor logic) {

		// Get the right side of assignment. 
		val expr = assignment.expression

		// specify which type of logical gate the actor should be
		if (expr instanceof OperatorExpression) {

			// Create actor for guard gX
			var guardname = assignment.valuedObject.name
			val actor = CircuitFactory::eINSTANCE.createActor
			actor.name = guardname
//			logic.innerActors += actor //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! add for no red regions
            actor.trace(assignment)

			assignmentActor.add(actor.name)
			// Create output port of guard actor gX
			val outputPort = CircuitFactory::eINSTANCE.createPort
			outputPort.type = "Out"
			outputPort.name = guardname
			actor.ports += outputPort

			switch (expr.operator) {
				case LOGICAL_AND:
					actor.type = "AND"
				case LOGICAL_OR:
					actor.type = "OR"
				case NOT:
					actor.type = "NOT"
				case PRE: {
					actor.type = "REG"
					addRegisterPorts(actor, "Reset_pre")
				}
				default: {
//					SCGCircuitPlugin.log("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
				}
			}
			/////////////////////////////////!!!!!!!!!!!!!!!!!!!!!  delete for no red regions
			val actorRegion = CircuitFactory::eINSTANCE.createActor
			actorRegion.innerActors += actor
			actorRegion.name = guardname
			logic.innerActors += actorRegion
			actorRegion.trace(assignment)
			/////////////////////////////////!!!!!!!!!!!!!!!!!!!!!  delete for no red regions
			
			// the created actor gate gX gets an input port for each subExpression
			// and for each subExpression is transformed into gates with method transformExpressions
			for (Expression subexpr : expr.subExpressions) {
				val inputPort = CircuitFactory::eINSTANCE.createPort
				actor.ports += inputPort
				inputPort.type = "In"

				if (!(expr.operator.getName == "PRE")) {
					checkForVOassignments(subexpr) //this replaces all variables with different names but same meanings (e.g. g0 and _GO) by the same variable
					transformExpressions(subexpr, actorRegion) //!!!!!!!!!!!!!!!!!!!! change back to logic as 2nd argument,  add for no red regions
					
				} 
				//else { //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  add for no red regions
				//					logic.innerActors += actor
				//				}
				
				inputPort.name = subexpr.serialize.toString
			}
		}


		/* 
		 * Searches for Assignments with ValuedObjectReferences as Expressions
		 * e.g. g0 = _GO 
		 * 
		 * should solve copy propagation problems like gXb = gX
		 * 
		 * this is a problem because there is no gate for renaming a wire.. so all equivalent names for wires are stored in
		 * list voExpressions. This is working as long as subsequently only the key is used. this key will then be replaced by its value
		 * in all subsequent assignment nodes.
		 * 
		 * g0 = _GO is an exception. Key and value are interchanged. 
		 * This is done because in the simulation is only g0 present and not _GO.... Maybe this changes if C Code generation is changed.
		 * 
		 * TODO: Find a better solution!!! 
		 * */
		else if (expr instanceof ValuedObjectReference) {
			//if (assignment.valuedObject.name == "g0") {
			//	voExpressions.put(expr.valuedObject.name, assignment.valuedObject)
			//} else {
				voExpressions.put(assignment.valuedObject.name, expr.valuedObject)
			//}
		}

	}

	/**
	 * Replaces all variables which have different names but the same meaning with the same variable name.
	 * This is necessary because the ports need to have the same names to create links.
	 */
	def checkForVOassignments(Expression expr) {
		if (expr instanceof ValuedObjectReference) {
			val name = expr.valuedObject.name
			if (voExpressions.containsKey(name)) {
				expr.valuedObject = voExpressions.get(name)

			}
		} else {
			val vos = expr.eAllContents.filter(ValuedObjectReference).toList

			for (vo : vos) {
				val name2 = vo.valuedObject.name
				if (voExpressions.containsKey(name2)) {
					vo.valuedObject = voExpressions.get(name2)
				}
			}
		}
	}
	
	/**
	 * Transforms right sides of assignment nodes.
	 * 
	 */
	def void transformExpressions(Expression expr, Actor logic) {

		// has to be checked due to recursion
		if (expr instanceof OperatorExpression) {

			// check if this actor already exists
			if (!assignmentActor.contains(expr.serialize.toString)) {
				// create actor for expression
				val actor = CircuitFactory::eINSTANCE.createActor
				actor.name = expr.serialize.toString
				logic.innerActors += actor
				assignmentActor.add(actor.name)

				// create output port for actor
				val p = CircuitFactory::eINSTANCE.createPort
				p.type = "Out"
				p.name = expr.serialize.toString
				actor.ports += p

				// specify actor type
				switch (expr.operator) {
					case LOGICAL_AND:
						actor.type = "AND"
					case LOGICAL_OR:
						actor.type = "OR"
					case NOT:
						actor.type = "NOT"
					case PRE: {
						actor.type = "REG"
						addRegisterPorts(actor, "Reset_pre")
					}
					default: {
//				        SCGCircuitPlugin.log("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
					}
				}

				// the created actor needs an input port for each subexpression
				// and the subexpressions are transformed, too.
				for (Expression subExpr : expr.subExpressions) {
					val port = CircuitFactory::eINSTANCE.createPort
					actor.ports += port
					port.type = "In"
					port.name = subExpr.serialize.toString

					if (subExpr instanceof OperatorExpression) {
						transformExpressions(subExpr, logic)
					} else if (subExpr instanceof BoolValue) {
						switch (subExpr.value.toString) {
							case "true": {
								port.name = "const1_" + expr.serialize.toString
								circuitInitialization.createConstantOne(logic, port.name)
							}
							case "false": {
								port.name = "const0_" + expr.serialize.toString
								circuitInitialization.createConstantZero(logic, port.name)
							}
						}
					}
				}
			}
		}
	}

	def addRegisterPorts(Actor actor, String reset) {
		val tickPort = CircuitFactory::eINSTANCE.createPort
		val resetPort = CircuitFactory::eINSTANCE.createPort

		tickPort.type = "In"
		tickPort.name = "Tick"

		resetPort.type = "Sel"
		resetPort.name = reset

		actor.ports.add(tickPort)
		actor.ports.add(resetPort)
	}

}