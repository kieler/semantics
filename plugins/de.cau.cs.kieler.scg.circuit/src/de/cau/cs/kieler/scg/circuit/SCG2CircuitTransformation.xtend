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

class SCG2CircuitTransformation extends AbstractProductionTransformation {

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

	def transform(SCGraph scg, KielerCompilerContext context) {
		
		assignmentActor.clear

		// this map stores SSA variables and their highest version number
		val ssaMap = context.compilationResult.getAuxiliaryData(SSAMapData).head.ssaMap

		/** root object which will have atomic inner actors for each in/output 
		 * and one non atomic actor (newInnerCircuit) containing actors for:
		 *  
		 * - programm's logic (logicRegion)
		 * - preRegisters (preRegisterRegion)
		 * - reset, go and tick logic with input registers (InitializationRegion)
		 * 
		 */
		val root = CircuitFactory::eINSTANCE.createActor
		root.name = scg.label

		val newInnerCircuit = CircuitFactory::eINSTANCE.createActor
		root.innerActors += newInnerCircuit

		val logicRegion = CircuitFactory::eINSTANCE.createActor
		logicRegion.name = "Program Logic"
		newInnerCircuit.innerActors += logicRegion

		val preRegisterRegion = CircuitFactory::eINSTANCE.createActor
		preRegisterRegion.name = "Pre Registers"
		newInnerCircuit.innerActors += preRegisterRegion

		val initializationRegian = CircuitFactory::eINSTANCE.createActor
		initializationRegian.name = "Circuit Initialization"
		newInnerCircuit.innerActors += initializationRegian

		// filter all declarations to initialize the circuit
		val declarations = scg.declarations.filter[isInput || isOutput].toList
		// initialize circuit creates all in/outputs and a tick and reset input
		circuitInitialization.initialize(declarations, preRegisterRegion, initializationRegian, logicRegion,
			newInnerCircuit, root)

		// filter every input output variable to avoid the creation of pre registers for those variables
		val inOutPuts = new LinkedList<String>
		for (i : declarations.filter[isInput && isOutput].toList) {
			for (vo : i.valuedObjects) {
				inOutPuts.add(vo.name)
			}
		}

		// create actors of the circuit 
		val nodes = scg.eAllContents.filter(Node).toList
		transformNodes2Actors(inOutPuts, newInnerCircuit, nodes, preRegisterRegion, logicRegion, ssaMap)

		// cry for bananas if all actors are created
		System.out.println("BANANAAAAAAAAS")

		// create links for each region of the circuit
		// this has to be done step by step..... otherwise wrong ports would be connected
		linkCreator.rootRegion(root)
		linkCreator.circuitRegion(newInnerCircuit)
		linkCreator.logicRegion(logicRegion, ssaMap)
		linkCreator.preRegion(preRegisterRegion)
		linkCreator.initRegion(initializationRegian)

		root

	}

	def transformNodes2Actors(LinkedList<String> inOutPuts, Actor newCircuit, List<Node> nodes, Actor pre, Actor logic,
		HashMap<String, Integer> ssaMap) {

		// nodes in sequential scgs are assignments or conditionals which will be stored in lists
		// all nodes of conditional "then" branches are stored in conditionalBranchNodes list
		val assignments = new LinkedList<Assignment>
		val conditionalBranchNodes = new LinkedList<Node>

		// check whether nodes are affected by a condition
		var condBranch = false
		// if conditional "then" branch is active, this is the place to store the endCondition (target of else branch)
		var Node endCondition

		// for each node: check if it should be stored in assignments or conditionalBranchNodes
		for (n : nodes) {
			if (n == endCondition) {
				// the scg reached the target of "else" branch after a conditional node occurred 
				condBranch = false
			}
			switch (n) {
				Assignment: {
					if (!condBranch) {
						assignments.add(n)
					} else {
						conditionalBranchNodes.add(n)
					}
				}
				Conditional: {
					conditionalBranchNodes.add(n)
					endCondition = n.^else.target
					condBranch = true
				}
			}
		}

		for (a : assignments) {
			transformAssignment(a, logic)
		}

		// assuming nested conditional branches don't exist ////////////////     !!!!!!!!!!      /////////////////
		transformConditionalBranch(inOutPuts, conditionalBranchNodes, pre, newCircuit, logic, ssaMap)

		logic

	}

	def transformConditionalBranch(LinkedList<String> inOutPuts, List<Node> conditionalsOrAssignments, Actor pre,
		Actor newCircuit, Actor logic, HashMap<String, Integer> ssaMap) {

		var Boolean one = false
		var Boolean zero = false

		var String activeConditionName
		for (coa : conditionalsOrAssignments) {

			if (coa instanceof Conditional) {
				activeConditionName = coa.condition.serialize.toString
			} else if (coa instanceof Assignment) {
				val actor = CircuitFactory::eINSTANCE.createActor

				actor.type = "MUX"
				actor.name = coa.valuedObject.name

				val truePort = CircuitFactory::eINSTANCE.createPort
				val falsePort = CircuitFactory::eINSTANCE.createPort
				val selectPort = CircuitFactory::eINSTANCE.createPort
				val outputPort = CircuitFactory::eINSTANCE.createPort

				actor.ports.add(truePort)
				actor.ports.add(falsePort)
				actor.ports.add(selectPort)
				actor.ports.add(outputPort)

				truePort.type = "In"
				falsePort.type = "In"
				selectPort.type = "Sel"
				outputPort.type = "Out"

				selectPort.name = activeConditionName
				if (coa.assignment.serialize.toString == "true") {
					truePort.name = "const1"
					one = true
				} else if (coa.assignment.serialize.toString == "false") {
					truePort.name = "const0"
					zero = true
				} else {
					System.out.println("no boolean assignment at :" + coa.valuedObject.name + "assignment is: " +
						coa.assignment.serialize.toString)

				}

				val String pred = findPredecessor(inOutPuts, coa.valuedObject.name, outputPort, pre, ssaMap, logic)
				System.out.println("found predecessor: " + pred + " for " + coa.valuedObject.name)
				falsePort.name = pred
				logic.innerActors += actor

			}

		}
		if (one) {
			circuitInitialization.createConstantOne(logic)
		}
		if (zero) {
			circuitInitialization.createConstantZero(logic)
		}

	}

	def findPredecessor(LinkedList<String> inOutPuts, String name, Port outputPort, Actor pre,
		HashMap<String, Integer> ssaMap, Actor logic) {

		if (name.contains("_")) { // => true means maybe we have a SSA 
			val index = name.lastIndexOf("_") // e.g. for O1_3_7 => 4 
			var String version = name.substring(index + 1) // version => 7
			var String varName = name.substring(0, index) // varName => O1_3
			var int intVersion = Integer.parseInt(version.replaceAll("[\\D]", "")) // maybe not needed but was not sure if variables could get some more suffix
			if (ssaMap.containsKey(varName)) { // make sure the Assignment is a SSA
//				//first special case:
//				//if this SSA has the highest version number, it's MUX output will be the output of the circuit
//				// in this case the output port shall be named like the original variable e.g. O1_3 (see above)
//				if (intVersion == ssaMap.get(varName)) {
//					outputPort.name = name //+ "_out"
//				//otherwise, there are higher versions of this variable which will need the full SSA name as input
//				} else {
//					outputPort.name = name
//				}
				outputPort.name = name
				// second special case:
				// it is the lowest version of this SSA
				if (intVersion == 1) {
					// if the SSA is originally an input output variable we don't need a pre register
					// to store it's value for the next tick  
					if (!inOutPuts.contains(varName)) {
						System.out.println("create pre register for: " + name)
						// creates pre actor which is a register with input O1 and output O1_X if X is highest version of variable O1
						createPreActor(varName, logic, pre)
						return "pre_" + varName // the input variable will be the one coming from the generated pre register
					} else {
						// if this is an input output variable and a SSA, 
						// the name of the orignal variable should be used as input port name
						// e.g. O1_3 (see above)
						return varName

					}
				} // if we have neither the highest nor the lowest version of the SSA, simply use version-1 
				else {
					var int predVersion = intVersion - 1
					return ( varName + "_" + predVersion)
				}

			}

		} else { // if this is no SSA, do nothing
			return name
		}
	}

	def createPreActor(String name, Actor logic, Actor pre) {
		val preActor = CircuitFactory::eINSTANCE.createActor
		val p_in = CircuitFactory::eINSTANCE.createPort
		val p_out = CircuitFactory::eINSTANCE.createPort

		addRegisterPorts(preActor, "Reset_pre")

		preActor.type = "REG"
		preActor.name = "pre_" + name
		p_in.type = "In"
		p_in.name = name
		p_out.type = "Out"
		p_out.name = "pre_" + name
		preActor.ports += p_in
		preActor.ports += p_out

		pre.innerActors += preActor

		val inPort = CircuitFactory::eINSTANCE.createPort
		val outPort = CircuitFactory::eINSTANCE.createPort

		inPort.type = "InConnectorPre"
		inPort.name = name
		outPort.type = "OutConnectorPre"
		outPort.name = "pre_" + name
		pre.ports.add(inPort)
		pre.ports.add(outPort)

		val inPortLog = CircuitFactory::eINSTANCE.createPort

		inPortLog.type = "InConnectorLogic"
		inPortLog.name = "pre_" + name
		logic.ports.add(inPortLog)
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

		// Get the right side of assignment. 
		val expr = assignment.assignment

		// specify which type of logical gate the actor should be
		if (expr instanceof OperatorExpression) {
			switch (expr.operator) {
				case LOGICAL_AND:
					actor.type = "AND"
				case LOGICAL_OR:
					actor.type = "OR"
				case NOT:{
					actor.type = "NOT"
					System.out.println("Not at assignment: " + actor.name + " = " + expr.serialize.toString)
						}
				case PRE: {
					actor.type = "REG"
					addRegisterPorts(actor, "Reset")
				}
				default: {
					System.out.println("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
				}
			}

			// the created actor gate gX needs an input port for each subExpression
			for (Expression subexpr : expr.subExpressions) {
//				System.out.println("subexpression ===>" + subexpr.serialize.toString + " at " + expr.serialize.toString)
				val port = CircuitFactory::eINSTANCE.createPort
				actor.ports += port
				port.type = "In"
				port.name = subexpr.serialize.toString

				if (!(expr.operator.getName == "PRE") && (subexpr instanceof OperatorExpression)) { // && !(a.operator.getName == "NOT"))
					transformExpressions(subexpr, logic)

				}

			}

		} // draw an actor for cases like g0 = _GO
		else if (expr instanceof ValuedObjectReference) {
			addRegisterPorts(actor, "Reset")
			val inPort = CircuitFactory::eINSTANCE.createPort
			actor.type = "REG"
			inPort.type = "In"
			inPort.name = expr.valuedObject.name
			actor.ports.add(inPort)
		}

	}

	def void transformExpressions(Expression expr, Actor logic) {

		// has to be checked due to recursion
		if (expr instanceof OperatorExpression) {
			
			//check if this actor already exists
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
					case NOT:{
						actor.type = "NOT"
						System.out.println("Not at expression: " + actor.name )
						}
					case PRE: {
						actor.type = "REG"
						addRegisterPorts(actor, "Reset")
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