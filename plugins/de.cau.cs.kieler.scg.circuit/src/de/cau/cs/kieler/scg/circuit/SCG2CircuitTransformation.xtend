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

	def transform(SCGraph scg, KielerCompilerContext context) {
		
		//this map stores SSA variables and their highest version number
		val ssaMap = context.compilationResult.getAuxiliaryData(SSAMapData).head.ssaMap


		/* root object which will have atomic inner actors for each in/output 
		 * and one non atomic actor (newInnerCircuit) containing actors for:
		 *  
		 * - programm's logic (logicRegion)
		 * - preRegisters (preRegisterRegion)
		 * - reset, go and tick logic with input registers (InitializationRegion)

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
		
		val InitializationRegian = CircuitFactory::eINSTANCE.createActor
		InitializationRegian.name = "Circuit Initialization"
		newInnerCircuit.innerActors += InitializationRegian



		// filter all declarations to initialize the circuit
		val declarations = scg.declarations.filter[isInput || isOutput].toList
		// initialize circuit creates all in/outputs and a tick and reset input
		circuitInitialization.initialize(declarations, InitializationRegian, logicRegion, newInnerCircuit, root)

		val inOutPuts = new LinkedList<String>
		for(i: declarations.filter[isInput && isOutput].toList){
			for(vo : i.valuedObjects){
				inOutPuts.add(vo.name)	
				System.out.println(vo.name)
			}
		}
		
		// create actors of the circuit 
		val nodes = scg.eAllContents.filter(Node).toList
		transformNodes2Actors(inOutPuts, newInnerCircuit, nodes, preRegisterRegion, logicRegion, ssaMap)
		
		//cry for bananas if all actors are created
		System.out.println("BANANAAAAAAAAS")
		
		initializePreRegion(preRegisterRegion)
		
//		val ports = logicRegion.ports
//		for(p : ports){
//			System.out.println("PORTTTT: " + p.name + " has type " + p.type)
//		}

		// create links for each region of the circuit
		// this has to be done step by step..... otherwise wrong ports would be connected
		linkCreator.rootRegion(root)
		linkCreator.circuitRegion(newInnerCircuit)
		linkCreator.logicRegion(logicRegion, ssaMap)
		linkCreator.preRegion(preRegisterRegion)
		linkCreator.initRegion(InitializationRegian)
		
		root

	}
	
	def initializePreRegion(Actor pre) {
		val tickPort = CircuitFactory::eINSTANCE.createPort
		val resetPort = CircuitFactory::eINSTANCE.createPort
		
		tickPort.type = "InConnectorPre"
		tickPort.name = "Tick"
		pre.ports.add(tickPort)
		
		resetPort.type = "InConnectorPre"
		resetPort.name = "Reset_pre"
		pre.ports.add(resetPort)		
	}
	

	
	def transformNodes2Actors(LinkedList<String> inOutPuts, Actor newCircuit, List<Node> nodes, Actor pre, Actor logic, HashMap<String, Integer> ssaMap) {

		// nodes in sequential scgs are assignments or conditionals which will be stored in lists
		// all nodes of conditional "then" branches are stored in conditionalBranchNodes list
		val assignments = new LinkedList<Assignment>
		val conditionalBranchNodes = new LinkedList<Node>

		// check whether nodes are affected by a condition
		var condBranch = false
		// if conditional branch is active, this is the place store the endCondition (target of else branch)
		var Node endCondition

		for (n : nodes) {
			if (n == endCondition) {
				condBranch = false
//				System.out.println("Set condition to false")
			}

			if (n instanceof Assignment) {
				if (!condBranch) {
//					System.out.println("Found an Assignment " + n.valuedObject.name)
					assignments.add(n)

				} else {
//					System.out.println("Found a ConditionAssignment " + n.valuedObject.name)
					conditionalBranchNodes.add(n)
				}
			// root.innerActors += transformAssignment(n)
			} else if (n instanceof Conditional) {
//				if(n.condition.serialize.toString == endCondition){
//					condBranch = false
//				}
//				System.out.println("Found a Condition " + n.condition.serialize.toString)
				conditionalBranchNodes.add(n)

				endCondition = n.^else.target
//				switch (endCondition) {
//					Assignment: System.out.println("Endcondition: " + endCondition.valuedObject.name)
//					Conditional: System.out.println("Endcondition: " + endCondition.condition.serialize.toString)
//				}
				condBranch = true

			// root.innerActors += transformConditional(n)
			}
		}

//		for (a : assignments) {
//			System.out.println("ASGNMT: " + a.valuedObject.name)
//		}
//		for (c : conditionalBranchNodes) {
//			switch (c) {
//				Assignment: System.out.println("Condass " + c.valuedObject.name)
//				Conditional: System.out.println("Cond: " + c.condition.serialize.toString)
//			}
//
//		}
		for (a : assignments) {
			transformAssignment(a, logic)
		}

		// assuming nested conditional branches don't exist ////////////////     !!!!!!!!!!      /////////////////
		transformConditionalBranch(inOutPuts, conditionalBranchNodes, pre, newCircuit, logic, ssaMap)

		logic

	}

	def transformConditionalBranch(LinkedList<String> inOutPuts, List<Node> conditionalsOrAssignments, Actor pre, Actor newCircuit, Actor logic,
		HashMap<String, Integer> ssaMap) {

		var Boolean one = false
		var Boolean zero = false

		var String activeConditionName
		for (coa : conditionalsOrAssignments) {

			if (coa instanceof Conditional) {
				activeConditionName = coa.condition.serialize.toString
//				System.out.println("changed active condition to: " + activeConditionName)
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
//				System.out.println("sel node is: " + selectPort.name)
				// outputPort.name = coa.valuedObject.name
				if (selectPort.name == "g0") {
					// if no condition is active, the variable has an initial value, which has 
					// to be set at reset
					selectPort.name = "_GO"
				}

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

	def findPredecessor(LinkedList<String> inOutPuts, String name, Port outputPort, Actor pre, HashMap<String, Integer> ssaMap, Actor logic) {

		if (name.contains("_")) { // => true means maybe we have a SSA 
			val index = name.lastIndexOf("_") // e.g. for O1_3_7 => 4 
			var String version = name.substring(index + 1) //version => 7
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
				//second special case:
				//it is the lowest version of this SSA
				if (intVersion == 1) {
					//if the SSA is originally an input output variable we don't need a pre register
					// to store it's value for the next tick  
					if(!inOutPuts.contains(varName)){
						System.out.println("create pre register for: " + name)
					// creates pre actor which is a register with input O1 and output O1_X if X is highest version of variable O1
					createPreActor(varName, logic, pre)
					return "pre_" + varName //the input variable will be the one coming from the generated pre register
					
					} else{
						//if this is an input output variable and a SSA, 
						//the name of the orignal variable should be used as input port name
						// e.g. O1_3 (see above)
						return varName
						
					}
				} 
				//if we have neither the highest nor the lowest version of the SSA, simply use the version-1 
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
		preActor.name = "pre_" + name // + "_1"
		p_in.type = "In"
		p_in.name = name //+ "_out"
		p_out.type = "Out"
		p_out.name = "pre_" + name
		preActor.ports += p_in
		preActor.ports += p_out

		pre.innerActors += preActor

		val inPort = CircuitFactory::eINSTANCE.createPort
		val outPort = CircuitFactory::eINSTANCE.createPort

		inPort.type = "InConnectorPre"
		inPort.name = name // + "_out"
		outPort.type = "OutConnectorPre"
		outPort.name = "pre_" + name 
		pre.ports.add(inPort)
		pre.ports.add(outPort)
		
		
		val inPortLog = CircuitFactory::eINSTANCE.createPort
		
		inPortLog.type = "InConnectorLogic"
		inPortLog.name = "pre_" + name 
		logic.ports.add(inPortLog)

		
//		val outLink = CircuitFactory::eINSTANCE.createLink
//		outLink.source = outPort
//		outLink.target = p_in
		
//	newCircuit.innerLinks.add(outLink)
		
//		val inLink = CircuitFactory::eINSTANCE.createLink
//		inLink.source = inPort
//		inLink.target = p_out
//		
//		newCircuit.innerLinks.add(inLink)

	}

	def transformAssignment(Assignment assignment, Actor root) {

		val completeAssginmentString = assignment.assignment.serialize.toString

		if ((completeAssginmentString != "true") && (completeAssginmentString != "false")) {
			val actor = CircuitFactory::eINSTANCE.createActor
			val p = CircuitFactory::eINSTANCE.createPort
			// val isAtomicAssignment = !completeAssginmentString.contains("||") || !completeAssginmentString.contains("&&")
			// val List<String> splittedAssignment = completeAssginmentString.split(" ")//("\\(|\\) (?![^(pre\\(])\\)")//("\\(|\\)|(\\&\\&)|(\\|\\|)")
			var guardname = assignment.valuedObject.name

			val a = assignment.assignment

			if (a instanceof OperatorExpression) {

				switch (a.operator) {
					case LOGICAL_AND: {
						// System.out.println("AAAND " + a.getOperator)
						actor.type = "AND"

					}
					case LOGICAL_OR: {
						// System.out.println("OOOR " + a.getOperator)
						actor.type = "OR"
					}
					case NOT: {
						actor.type = "NOT"
					}
					case PRE: {
						actor.type = "REG"

						addRegisterPorts(actor, "Reset")

					}
					default: {
						System.out.println(
							"found " + a.getOperator.getName
						)
					}
				}

				for (Expression e : a.subExpressions) {
					val port = CircuitFactory::eINSTANCE.createPort
					actor.ports += port

					if (a.operator.getName == "NOT") {
						port.type = "Not"
						port.name = a.subExpressions.head.serialize.toString

					// System.out.println("created NOOOOOOT at: " + guardname + " with name " + port.name ) 
					} else {

						port.type = "In"
						port.name = e.serialize.toString

					}
					// System.out.println("created INport " + port.name + " at " + actor.type)
					if ((!(a.operator.getName == "PRE") && !(a.operator.getName == "NOT")) &&
						(e instanceof OperatorExpression)) {
						// System.out.println("call expressionTrans from Assign for : " + e.serialize.toString + " in " + a.serialize.toString )
						transformExpressions(e, root)

					} else {
						// System.out.println("SBDVIUSBDJNVUS0000000000000000B")
					}

				}

			} // draw an actor for g0 = _GO as Go_local
			else if (a instanceof ValuedObjectReference) {
				addRegisterPorts(actor, "Reset")
				val inPort = CircuitFactory::eINSTANCE.createPort

				actor.type = "REG"

				inPort.type = "In"
//				System.out.println("FISNCIJNSDNJS:" + a.valuedObject.name + " F R O M " + assignment.valuedObject.name)
				if (a.valuedObject.name == "_GO") {
					inPort.name = "Reset_local"
					guardname = "_GO"
				} else {
					inPort.name = a.valuedObject.name
//					guardname = "hallo"				
				}
				actor.ports.add(inPort)

			}

			actor.name = guardname
			p.type = "Out"

			p.name = guardname

			actor.ports += p
			// System.out.println("created OUTport " + p.name + " at " + actor.name + " with type: " + actor.type)
			// System.out.println("created Actor: " + actor.name + "with assignment" + completeAssginmentString)
			root.innerActors += actor

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

	def transformExpressions(Expression expression, Actor root) {

		if (expression instanceof OperatorExpression) {
			val actor = CircuitFactory::eINSTANCE.createActor
			val p = CircuitFactory::eINSTANCE.createPort
			switch (expression.operator) {
				case LOGICAL_AND: {
					// System.out.println("AAAND " + expression.getOperator)
					actor.type = "AND"

				}
				case LOGICAL_OR: {
					// System.out.println("OOOR " + expression.getOperator)
					actor.type = "OR"
				}
				case NOT: {
					actor.type = "NOT"
				}
				case PRE: {
					actor.type = "REG"

					addRegisterPorts(actor, "Reset")
				// System.out.println("found " + expression.getOperator + expression.subExpressions.get(0).serialize.toString)
				}
				default: {
					System.out.println("found " + expression.getOperator)
				}
			}

			for (Expression e : expression.subExpressions) {
				val port = CircuitFactory::eINSTANCE.createPort
				actor.ports += port
				if ((e instanceof OperatorExpression)) {
					if (e.operator.getName == "NOT") {
						port.type = "Not"
						port.name = e.subExpressions.head.serialize.toString

					// System.out.println("created NOOOOOOT at: " + expression.serialize.toString + " with name " + port.name)
					}
				} else {

					port.type = "In"

					port.name = e.serialize.toString

				}

				if (e instanceof OperatorExpression) {
					if (!(e.operator.getName == "PRE") && !(e.operator.getName == "NOT")) {
						transformExpressions(e, root)
					// System.out.println("call expressionTrans for : " + e.serialize.toString + " in " + expression.serialize.toString + e.operator.getName)
					} else {
						// System.out.println("SBDVIUSBDJNVUSB")
					}

				}
			}

			p.type = "Out"
			p.name = expression.serialize.toString

			actor.name = expression.serialize.toString
			actor.ports += p
			root.innerActors += actor
		// System.out.println("created OUTport " + p.name + " at " + actor.name + " with type: " + actor.type)
		}

	}

}