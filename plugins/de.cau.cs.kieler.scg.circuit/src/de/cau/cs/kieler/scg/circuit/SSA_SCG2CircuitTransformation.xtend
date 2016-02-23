package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.LinkedList
import java.util.List
import de.cau.cs.kieler.kico.KielerCompilerContext
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.ScgFactory

class SSA_SCG2CircuitTransformation extends AbstractProductionTransformation {

	// -------------------------------------------------------------------------
	// --                 K I C O      C O N F I G U R A T I O N              --
	// -------------------------------------------------------------------------
	override getId() {
		return CircuitTransformation::SCG2CIRCUIT_ID
	}

	override getName() {
		return CircuitTransformation::SCG2CIRCUIT_NAME
	}

	override getProducedFeatureId() {
		return CircuitFeatures::CIRCUIT_ID
	}

	override getRequiredFeatureIds() {
		return newHashSet(CircuitFeatures::SCG2SSASCG_ID)
	}

	@Inject
	extension KEffectsSerializeExtensions

	@Inject
	LinkCreator linkCreator

	@Inject
	CircuitInitialization circuitInitialization

	protected var KielerCompilerContext compilerContext

	val LinkedList<String> assignmentActor = new LinkedList<String>
	val voExpressions = new HashMap<String,ValuedObject>

//	var conditionalEndNodes = new HashMap<Conditional,Node>
	def transform(SCGraph scg, KielerCompilerContext context) {

		assignmentActor.clear
		voExpressions.clear
//		conditionalEndNodes.clear
		// this map stores SSA variables and their highest version number
//		conditionalEndNodes = context.compilationResult.getAuxiliaryData(SSAMapData).head.conditionalEndNodes
		

		/** circuit object which will have atomic inner actors for each in/output 
		 * and two non atomic actors:
		 *  
		 * - programm's logic (logicRegion)
		 * - reset, go and tick logic with input registers (InitializationRegion)
		 * 
		 */

		val newCircuit = CircuitFactory::eINSTANCE.createActor
		newCircuit.name = scg.label

		val logicRegion = CircuitFactory::eINSTANCE.createActor
		logicRegion.name = "Program Logic"
		newCircuit.innerActors += logicRegion

//		val preRegisterRegion = CircuitFactory::eINSTANCE.createActor
//		preRegisterRegion.name = "Pre Registers"
//		newInnerCircuit.innerActors += preRegisterRegion

		val initializationRegian = CircuitFactory::eINSTANCE.createActor
		initializationRegian.name = "Circuit Initialization"
		newCircuit.innerActors += initializationRegian

		// filter all declarations to initialize the circuit
		val declarations = scg.declarations.filter[isInput || isOutput].toList
		// initialize circuit creates all in/outputs and a tick and reset input
		circuitInitialization.initialize(declarations, initializationRegian, logicRegion,
			newCircuit)

		// filter every input output variable to avoid the creation of pre registers for those variables
		val inOutPuts = new LinkedList<String>
		for (i : declarations.filter[isInput && isOutput].toList) {
			for (vo : i.valuedObjects) {
				inOutPuts.add(vo.name)
			}
		}

		// create actors of the circuit 
		val entry = scg.eAllContents.filter(Entry).head
		transformNodesToActors(entry.next.target, logicRegion)
//		transformNodes2Actors(inOutPuts, newInnerCircuit, nodes, preRegisterRegion, logicRegion, conditionalEndNodes)
		// cry for bananas if all actors are created
		System.out.println("BANANAAAAAAAAS")

		// create links for each region of the circuit
		// this has to be done step by step..... otherwise wrong ports would be connected
		linkCreator.circuitRegion(newCircuit)
		linkCreator.logicRegion(logicRegion)
//		linkCreator.preRegion(preRegisterRegion)
		linkCreator.initRegion(initializationRegian)

		newCircuit

	}

	def void transformNodesToActors(Node n, Actor logic) {
		if (!(n instanceof Exit)) {

			if (n instanceof Assignment) {
				transformAssignment(n, logic)
				transformNodesToActors(n.next.target, logic)
			} else if (n instanceof Conditional) {				
				transformNodesToActors(transformConditionalNodes(n, n.then.target, n.^else.target, logic), logic)
			}

		}

	}

	def Node transformConditionalNodes(Conditional source, Node thenNode, Node elseNode, Actor logic) {
		checkForVOassignments(source.condition)

		if (elseNode instanceof Assignment) {
			if (thenNode instanceof Conditional) {

				transformConditionalNodes(source,
					transformConditionalNodes(thenNode, thenNode.then.target, thenNode.^else.target, logic),
					elseNode.next.target, logic)
			} else if (thenNode instanceof Assignment) {

				val newMUX = CircuitFactory::eINSTANCE.createActor
				newMUX.type = "MUX"
				newMUX.name = thenNode.valuedObject.name

				val truePort = CircuitFactory::eINSTANCE.createPort
				val falsePort = CircuitFactory::eINSTANCE.createPort
				val selectPort = CircuitFactory::eINSTANCE.createPort
				val outputPort = CircuitFactory::eINSTANCE.createPort

				newMUX.ports.add(truePort)
				newMUX.ports.add(falsePort)
				newMUX.ports.add(selectPort)
				newMUX.ports.add(outputPort)

				truePort.type = "In_1"
				falsePort.type = "In_0"
				selectPort.type = "Sel"
				outputPort.type = "Out"

				outputPort.name = thenNode.valuedObject.name
				selectPort.name = source.condition.serialize.toString
				if (thenNode.assignment.serialize.toString == "true") {
					truePort.name = "const1_" + newMUX.name
					circuitInitialization.createConstantOne(logic, truePort.name)
//					one = true
				} else if (thenNode.assignment.serialize.toString == "false") {
					truePort.name = "const0_" + newMUX.name
					circuitInitialization.createConstantZero(logic, truePort.name)
//					zero = true
				} else {
					val exp = thenNode.assignment
					if(exp instanceof ValuedObjectReference) {
						voExpressions.put(thenNode.valuedObject.name, exp.valuedObject)
						
					} else {
					checkForVOassignments(thenNode.assignment)
					truePort.name = thenNode.assignment.serialize.toString
					transformExpressions(thenNode.assignment, logic)
					
					}

				}
				logic.innerActors += newMUX

				falsePort.name = elseNode.assignment.serialize.toString
				
				//e.g. O_1 = pre(O)
				if(!(elseNode.assignment instanceof ValuedObjectReference)){
					transformExpressions(elseNode.assignment, logic)
				}

				if (!(thenNode.next.target == elseNode.next.target)) {
					transformConditionalNodes(source, thenNode.next.target, elseNode.next.target, logic)
				} else {
					return thenNode.next.target
				}

			}
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
		val expr = assignment.assignment
		
		

		// specify which type of logical gate the actor should be
		if (expr instanceof OperatorExpression) {
			
			// Create actor for guard gX
		var guardname = assignment.valuedObject.name
		val actor = CircuitFactory::eINSTANCE.createActor
		actor.name = guardname
		logic.innerActors += actor

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
					System.out.println("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
				}
			}

			// the created actor gate gX needs an input port for each subExpression
			for (Expression subexpr : expr.subExpressions) {
				val port = CircuitFactory::eINSTANCE.createPort
				actor.ports += port
				port.type = "In"
				

				if (!(expr.operator.getName == "PRE")){//) && (subexpr instanceof OperatorExpression)) { // && !(a.operator.getName == "NOT"))
					
					checkForVOassignments(subexpr)
					transformExpressions(subexpr, logic)
					
					

				}
				port.name = subexpr.serialize.toString

			}

		} 		
		
		
		/** 
		 * Searches for Assignments with ValuedObjectReferences as Expressions
		 * e.g. g0 = _GO 
		 * 
		 * should solve copy propagation problems like gXb = gX
		 * */

		else if (expr instanceof ValuedObjectReference) {
			if(assignment.valuedObject.name == "g0"){
			voExpressions.put(expr.valuedObject.name, assignment.valuedObject)	
//			System.out.println("put " + expr.valuedObject.name + " with value " + assignment.valuedObject)
			
			
			} else {
			voExpressions.put(assignment.valuedObject.name, expr.valuedObject)
//			System.out.println("put " + assignment.valuedObject.name + " with value " + expr.valuedObject.name)
		}	
		}

	}
	
	def checkForVOassignments(Expression expr) {
		if(expr instanceof ValuedObjectReference){
//			System.out.println("CHECKING " + expr.valuedObject.name)

			val name = expr.valuedObject.name
			if(voExpressions.containsKey(name)){
			expr.valuedObject = voExpressions.get(name)
			
			}
		} else {
		val vos = expr.eAllContents.filter(ValuedObjectReference).toList

		for(vo : vos){
//			System.out.println("checkig " + vo.valuedObject.name)
			val name2 = vo.valuedObject.name
			if(voExpressions.containsKey(name2)){
			vo.valuedObject = voExpressions.get(name2)
//			System.out.println("changed " + name2 + " to " + vo.valuedObject.name)
				
//				vo.valuedObject = voExpressions.get(vo)
//				System.out.println(vo.valuedObject.name + "RRRR")
			}
			
			
			
			}
		}
	}

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
						System.out.println("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
					}
				}

				// the created actor needs an input port for each subexpression
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