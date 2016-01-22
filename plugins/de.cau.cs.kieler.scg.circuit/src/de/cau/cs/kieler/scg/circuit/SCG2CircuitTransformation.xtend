package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures
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
		
		//this is the root object which will have atomic inner actors for each in/output and 
		//one non atomic actor containing the logic of the program
		val root = CircuitFactory::eINSTANCE.createActor
		
		//this is the non atomic inner actor containing the programm's logic
		val newInnerCircuit = CircuitFactory::eINSTANCE.createActor
		
		root.innerActors += newInnerCircuit
		
		//filter all declarations to initialize the circuit
		val declarations = scg.declarations
		//initialize circuit creates all in/outputs and a tick and reset input
		circuitInitialization.initialize(declarations, newInnerCircuit, root)

		//filter all nodes and create SSAs
		val nodes = scg.eAllContents.filter(Node).toList
		val assignments = nodes.filter(Assignment).toList
		
		
		//val ssaNodes = 
		val ass = transformToSSA.transformAssignments2SSAs(assignments)
		
		//create actors of the circuit TODO: ssaNodes instead of nodes
		transformNodes2Actors(nodes, newInnerCircuit)
		System.out.println("BANANAAAAAAAAS")
//		root.eAllContents.filter(typeof(Link)).toIterable.toList.forEach [ l |
//			System.out.println("link")
//
//		]
		val ports = newInnerCircuit.eAllContents.filter(typeof(Port)).toIterable.toList
		createLinks(ports, newInnerCircuit)

		root

	}
	
	

	
	def createLinks(List<Port> ports, Actor actor) {
		// TODO: Create all links from port to port. here should be a naming converntion. 
		// names should be comparable. so links will link ports with same names
		// maybe iterate over inputports or so...
		// for each output port and each input port with the same name we want so create a link
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

	

//	def createInOutputs(Declaration d, Actor root) {
//		val actor = CircuitFactory::eINSTANCE.createActor 
//		val port = CircuitFactory::eINSTANCE.createPort
//		
//		d.valuedObjects.forEach[vo |
//			val name = (vo.name)
//			if(d.isInput){
//			actor.type = "Input " + name
//			port.name = "Out_" + name 
//			port.type = "Out"
//			actor.ports += port
//		} else {
//			actor.type = "Output " + name
//			port.name = "In_" + name 
//			port.type = "In"
//			actor.ports += port
//		}
//		]
//		
//		
//		root.innerActors += actor
//		
//		
//		
//	}
	def transformNodes2Actors(List<Node> nodes, Actor root) {
		
		
		
		// val actor = CircuitFactory::eINSTANCE.createActor
		nodes.forEach [ n |

			if (n instanceof Assignment) {
				
				transformAssignment(n, root)
			// root.innerActors += transformAssignment(n)
			} else if (n instanceof Conditional) {
				root.innerActors += transformConditional(n)
			} // else if(n instanceof Expression){
//				root.innerActors += transformExpression(n)
//			}
		]
		// root.innerActors += actor
		root

	}
	
	

	def Actor transformConditional(Conditional conditional) {

		val guardname = conditional.condition.serialize.toString
		val actor = CircuitFactory::eINSTANCE.createActor

		actor.name = "cond_" + guardname;
		
	//	conditional.then.target.get
		//actor.type = conditional.then.target.getA
		System.out.println("Conditional: " + guardname)

		actor
	}

	def transformAssignment(Assignment assignment, Actor root) {

		val completeAssginmentString = assignment.assignment.serialize.toString
		
		if((completeAssginmentString != "true") && (completeAssginmentString != "false")){
		val actor = CircuitFactory::eINSTANCE.createActor
		val p = CircuitFactory::eINSTANCE.createPort
		// val isAtomicAssignment = !completeAssginmentString.contains("||") || !completeAssginmentString.contains("&&")
		// val List<String> splittedAssignment = completeAssginmentString.split(" ")//("\\(|\\) (?![^(pre\\(])\\)")//("\\(|\\)|(\\&\\&)|(\\|\\|)")
		val guardname = assignment.valuedObject.name

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
				case NOT:{
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

		}

		actor.name = guardname
		p.type = "Out"

		p.name = guardname
		actor.ports += p
		// System.out.println("created OUTport " + p.name + " at " + actor.name + " with type: " + actor.type)
		//System.out.println("created Actor: " + actor.name + "with assignment" + completeAssginmentString)
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
				case NOT:{
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

						//System.out.println("created NOOOOOOT at: " + expression.serialize.toString + " with name " + port.name)

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
			//System.out.println("created OUTport " + p.name + " at " + actor.name + " with type: " + actor.type)

		}

	}

}