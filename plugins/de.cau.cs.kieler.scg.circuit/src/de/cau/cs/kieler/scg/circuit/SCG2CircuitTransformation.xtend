package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.scg.Guard
import java.util.LinkedList
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.scg.Node
import java.util.List
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.features.SCGFeatures
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.circuit.Link
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.Expression
import javax.management.OperationsException
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.core.annotations.Annotation

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
	extension SCGCoreExtensions

	@Inject
	extension SCGDeclarationExtensions

	@Inject
	extension SCGControlFlowExtensions

	@Inject
	extension KExpressionsValuedObjectExtensions

	@Inject
	extension KExpressionsCreateExtensions

	@Inject
	extension AnnotationsExtensions

	@Inject
	extension SynchronizerSelector

	@Inject
	extension KEffectsSerializeExtensions
	
	@Inject
	CircuitInitialization circuitInitialization

	def transform(SCGraph scg) {
		// val root = CircuitFactory::eINSTANCE.createActor 
		val newCircuit = CircuitFactory::eINSTANCE.createActor
//				root.innerActors += newCircuit
//		
		val newInnerCircuit = CircuitFactory::eINSTANCE.createActor
		newCircuit.innerActors += newInnerCircuit
		val declarations = scg.declarations
		
		
		
		
		initializeCircuit(newInnerCircuit, newCircuit)
		circuitInitialization.initialize(declarations, newInnerCircuit, newCircuit)

//		val guards = scg.guards
//		val g = guards.head.valuedObject.name
//		val exp = guards.head.expression.serialize
		val nodes = scg.eAllContents.filter(typeof(Node)).toIterable.toList
		//val ssaNodes = transformToSSAs(nodes)
		transformToSSAs(nodes)
		// create root object which should be the frame of the circuit
		transformNodes2Actors(nodes, newInnerCircuit)
		System.out.println("BANANAAAAAAAAS")
//		newCircuit.eAllContents.filter(typeof(Link)).toIterable.toList.forEach [ l |
//			System.out.println("link")
//
//		]
		val ports = newInnerCircuit.eAllContents.filter(typeof(Port)).toIterable.toList
		createLinks(ports, newInnerCircuit)

		newCircuit

	}
	
	def transformToSSAs(List<Node> nodes) {
		val ssaNodes = new LinkedList<Node>
		val list = new LinkedList<String>
		for(Node n : nodes){
			if(n instanceof Assignment){
				val name = n.valuedObject.name
				if(!list.contains(name) && !name.startsWith("g")){
				list.add(name)
				
				}
				
			} else if(n instanceof Conditional){
				val name = n.condition.serialize.toString
				if(!list.contains(name) && !name.startsWith("g")){
				list.add(name)
				
				}
			}
			
			
		}
		
		for(l : list){
			
			System.out.println(l)
		}
		
		//TODO: 
		
		
		
		
		
		
		//return ssaNodes
	}

	def initializeCircuit(Actor circuit, Actor root) {
		// As we want to create a circuit, we need to add a reset and a tick
		val reset = CircuitFactory::eINSTANCE.createActor
		reset.name = "Reset"
		reset.type = "In"
		val resetPort = CircuitFactory::eINSTANCE.createPort
		resetPort.name = reset.name
		resetPort.type = "Out"

		root.innerActors += reset
		reset.ports += resetPort
		val resetCircuitPort = CircuitFactory::eINSTANCE.createPort
		resetCircuitPort.name = reset.name
		resetCircuitPort.type = "In"
		circuit.ports += resetCircuitPort
		
		val resetLink = CircuitFactory::eINSTANCE.createLink
					resetLink.source = resetPort
					resetLink.target = resetCircuitPort
					root.innerLinks += resetLink

		val tick = CircuitFactory::eINSTANCE.createActor
		tick.name = "Tick"
		tick.type = "In"
		val tickPort = CircuitFactory::eINSTANCE.createPort
		tickPort.name = tick.name
		tickPort.type = "Out"

		root.innerActors += tick
		tick.ports += tickPort
		val tickCircuitPort = CircuitFactory::eINSTANCE.createPort
		tickCircuitPort.name = tick.name
		tickCircuitPort.type = "In"
		circuit.ports += tickCircuitPort
		
		val tickLink = CircuitFactory::eINSTANCE.createLink
					tickLink.source = tickPort
					tickLink.target = tickCircuitPort
					root.innerLinks += tickLink

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

	def createInOutputs(EList<Declaration> list, Actor circuit, Actor root) {

		list.forEach [ d |
			d.valuedObjects.forEach [ vo |
				val name = (vo.name)
				if (d.isInput) {
					// creates InputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					// port for InputNode |in|--->
					val actorPort = CircuitFactory::eINSTANCE.createPort
					// port for circuitActor -->|circuit|
					val circuitPort = CircuitFactory::eINSTANCE.createPort

					actor.type = "Input " + name
					actorPort.name = name // + "_out"
					actorPort.type = "Out"
					circuitPort.name = name // + "_in"
					circuitPort.type = "InOut"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor
					
					val link = CircuitFactory::eINSTANCE.createLink
					link.source = actorPort
					link.target = circuitPort
					root.innerLinks += link

				} else if (d.isOutput) {
					// creates OutputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					// port for OutputNode --->|out|
					val actorPort = CircuitFactory::eINSTANCE.createPort
					// port for circuitActor |circuit|--->
					val circuitPort = CircuitFactory::eINSTANCE.createPort

					actor.type = "output " + name
					actorPort.name = name // + "_in"
					actorPort.type = "In"
					circuitPort.name = name // + "_out"
					circuitPort.type = "OutIn"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor
					
					val link = CircuitFactory::eINSTANCE.createLink
					link.target = actorPort
					link.source = circuitPort
					
					root.innerLinks += link
				}
			]

		]
//		for (Port p : root.ports) {
//			System.out.println("port")
//		}
//		createLinks(root.ports, root)

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
		for(Annotation a : conditional.annotations){
			System.out.println(a.serialize.toString)
		}
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
		System.out.println("created Actor: " + actor.name + "with assignment" + completeAssginmentString)
		root.innerActors += actor
		
		}
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