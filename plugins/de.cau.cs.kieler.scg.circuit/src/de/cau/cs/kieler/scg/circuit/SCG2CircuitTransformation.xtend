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
		return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
	}

	@Inject
	extension KEffectsSerializeExtensions

	@Inject
	CircuitInitialization circuitInitialization

	@Inject
	TransformToSSA transformToSSA

	def transform(SCGraph scg) {

		// this is the root object which will have atomic inner actors for each in/output and 
		// one non atomic actor containing the logic of the program
		val root = CircuitFactory::eINSTANCE.createActor

		root.name = scg.label
		// this is the non atomic inner actor containing the programm's logic
		val newInnerCircuit = CircuitFactory::eINSTANCE.createActor

		root.innerActors += newInnerCircuit

		// filter all declarations to initialize the circuit
		val declarations = scg.declarations
		// initialize circuit creates all in/outputs and a tick and reset input
		circuitInitialization.initialize(declarations, newInnerCircuit, root)

		// filter all nodes and create SSAs
		val nodes = scg.eAllContents.filter(Node).toList
		// val assignments = nodes.filter(Assignment).toList
		val ssaNodes = transformToSSA.transformAssignments2SSAs(nodes, declarations)

		// create actors of the circuit 
		transformNodes2Actors(ssaNodes, newInnerCircuit)
		System.out.println("BANANAAAAAAAAS")

//		val map = transformToSSA.SSAMap
//		for(Map.Entry<String, Integer> entry : map.entrySet()){
//			System.out.println("Key: " + entry.key + " Value: " + entry.value)
//		}
//		val mapp = transformToSSA.SSApreAndOutputs
//		for(Map.Entry<String, Integer> entry : mapp.entrySet()){
//			System.out.println("Key: " + entry.key + " Value: " + entry.value)
//		}
		// create links of the circuit
		val ports = newInnerCircuit.eAllContents.filter(Port).toList
		createLinks(ports, newInnerCircuit)

		root

	}

//	def createProperPortNames(List<Actor> muxList, List<Actor> regList, List<Declaration> outputs, Actor actor) {
//		
//		for(o : outputs){
//			o.valuedObjects.forEach[vo |
//				
//				System.out.println(vo.name)
//				
//			]
//				
//			}			
//	}
	def createLinks(List<Port> ports, Actor actor) {

		// for each output port and each input port with the same name create a link
		ports.forEach [ op |
			if ((op.type == "Out") || (op.type == "InOut")) {
				ports.forEach [ ip |
					if (((ip.type == "Sel") || (ip.type == "In") || (ip.type == "OutIn") || ip.type == "Not") &&
						(op.name == ip.name)) {

						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = ip
						actor.innerLinks += link
					}
				]
			}
		]
	}

	def transformNodes2Actors(List<Node> nodes, Actor root) {

		val assignments = new LinkedList<Assignment>
		val conditionalBranchNodes = new LinkedList<Node>

		// check whether nodes are affected by a condition
		var condBranch = false
		var Node endCondition

		for (n : nodes) {
			if (n == endCondition) {
				condBranch = false
				System.out.println("Set condition to false")
			}

			if (n instanceof Assignment) {
				if (!condBranch) {
					System.out.println("Found an Assignment " + n.valuedObject.name)
					assignments.add(n)

				} else {
					System.out.println("Found a ConditionAssignment " + n.valuedObject.name)
					conditionalBranchNodes.add(n)
				}
			// root.innerActors += transformAssignment(n)
			} else if (n instanceof Conditional) {
//				if(n.condition.serialize.toString == endCondition){
//					condBranch = false
//				}
				System.out.println("Found a Condition " + n.condition.serialize.toString)
				conditionalBranchNodes.add(n)

				endCondition = n.^else.target
				switch (endCondition) {
					Assignment: System.out.println("Endcondition: " + endCondition.valuedObject.name)
					Conditional: System.out.println("Endcondition: " + endCondition.condition.serialize.toString)
				}
				condBranch = true

			// root.innerActors += transformConditional(n)
			}
		}

		for (a : assignments) {
			System.out.println("ASS: " + a.valuedObject.name)
		}
		for (c : conditionalBranchNodes) {
			switch (c) {
				Assignment: System.out.println("Condass " + c.valuedObject.name)
				Conditional: System.out.println("Cond: " + c.condition.serialize.toString)
			}

		}

		for (a : assignments) {
			transformAssignment(a, root)
		}

		// assuming nested conditional branches don't exist ////////////////     !!!!!!!!!!      /////////////////
		transformConditionalBranch(conditionalBranchNodes, root)

		root

	}

	def transformConditionalBranch(List<Node> conditionalsOrAssignments, Actor root) {
		var String activeConditionName
		

		for (coa : conditionalsOrAssignments) {

			if (coa instanceof Conditional) {
				activeConditionName = coa.condition.serialize.toString
				System.out.println("changed active condition to: " + activeConditionName)

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
				System.out.println("sel node is: " + selectPort.name)
				//outputPort.name = coa.valuedObject.name
				if(selectPort.name == "g0"){
					//if no condition is active, the variable has had an initial value, which has 
					// to set at reset
					selectPort.name = "_GO"
				}

				if (coa.assignment.serialize.toString == "true") {
					truePort.name = "const1"
				} else if (coa.assignment.serialize.toString == "false") {
					truePort.name = "const0"
				}
				val String pred = findPredecessor(coa.valuedObject.name, outputPort, root)
				System.out.println("found predecessor: " + pred + " for " + coa.valuedObject.name)
				falsePort.name = pred
				root.innerActors += actor

			}

		}

	}

	def findPredecessor(String string, Port outputPort, Actor root) {
		val mapp = transformToSSA.SSApreAndOutputs
		if (string.contains("_")) {
			val index = string.lastIndexOf("_")
			var String version = string.substring(index + 1)
			var String varName = string.substring(0, index)
			var int intVersion = Integer.parseInt(version.replaceAll("[\\D]", "")) // für später.. wegen vllt O1_4SSA
			
			if(mapp.containsKey(varName) && (intVersion == mapp.get(varName))){
			
				outputPort.name = varName + "_out"
			}else {
				outputPort.name = string
			}
			
			if (intVersion == 1) {
				//creates pre Actor which is a Register with input O1 and output O1_X if X is highest version of variable O1
				createPreActor(varName , root)
				return varName
			} else {
				var int predVersion = intVersion - 1

				return ( varName + "_" + predVersion)
			}

		}  
	}
	
	def createPreActor(String name, Actor root) {
		val preActor = CircuitFactory::eINSTANCE.createActor
		val p_in = CircuitFactory::eINSTANCE.createPort
		val p_out = CircuitFactory::eINSTANCE.createPort
		
		addRegisterPorts(preActor)
		
		preActor.type = "REG"
		preActor.name = "pre_" + name //+ "_1"
		
		p_in.type = "In"
		p_in.name = name + "_out"
		System.out.println(p_in.name)
		p_out.type = "Out"
		p_out.name = name
		
		preActor.ports += p_in
		preActor.ports += p_out
		
		root.innerActors += preActor
		
		
		
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

						addRegisterPorts(actor)

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
				addRegisterPorts(actor)
				val inPort = CircuitFactory::eINSTANCE.createPort

				actor.type = "REG"

				inPort.type = "In"
				System.out.println("FISNCIJNSDNJS:" + a.valuedObject.name + " F R O M " + assignment.valuedObject.name)
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

	def addRegisterPorts(Actor actor) {
		val tickPort = CircuitFactory::eINSTANCE.createPort
		val resetPort = CircuitFactory::eINSTANCE.createPort

		tickPort.type = "In"
		tickPort.name = "Tick"

		resetPort.type = "Sel"
		resetPort.name = "Reset"

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

					addRegisterPorts(actor)
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