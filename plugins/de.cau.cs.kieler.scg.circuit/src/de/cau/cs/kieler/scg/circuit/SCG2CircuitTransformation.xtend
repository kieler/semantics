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

	def transform(SCGraph scg) {
		// val root = CircuitFactory::eINSTANCE.createActor 
		val newCircuit = CircuitFactory::eINSTANCE.createActor
//				root.innerActors += newCircuit
//		
		val newInnerCircuit = CircuitFactory::eINSTANCE.createActor
		newCircuit.innerActors += newInnerCircuit
		val declarations = scg.declarations


		initializeCircuit(newInnerCircuit, newCircuit)
		createInOutputs(declarations, newInnerCircuit, newCircuit)

//		val guards = scg.guards
//		val g = guards.head.valuedObject.name
//		val exp = guards.head.expression.serialize
		val nodes = scg.eAllContents.filter(typeof(Node)).toIterable.toList

		// create root object which should be the frame of the circuit
		transformNodes2Actors(nodes, newInnerCircuit)
		System.out.println("BANANAAAAAAAAS")
		newCircuit.eAllContents.filter(typeof(Link)).toIterable.toList.forEach [ l |
			System.out.println("link")

		]

		val ports = newCircuit.eAllContents.filter(typeof(Port)).toIterable.toList
		createLinks(ports, newCircuit)

		newCircuit

	}
	
	def initializeCircuit(Actor circuit, Actor root) {
		// because we want to have a circuit, we need to add a reset and a tick input
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
		
		}

	def createLinks(List<Port> ports, Actor actor) {
		// TODO: Create all links from port to port. here should be a naming converntion. 
		// names should be comparable. so links will link ports with same names
		// maybe iterate over inputports or so...
		// for each output port and each input port with the same name we want so create a link
		ports.forEach [ op |
			if (op.type == "Out") {
				ports.forEach [ ip |
					if (((ip.type == "Sel") || (ip.type == "In")) && (op.name == ip.name)) {

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
					circuitPort.type = "In"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor

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
					circuitPort.type = "Out"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor
				}
			]

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
				root.innerActors += transformAssignment(n)
			} else if (n instanceof Conditional) {
				root.innerActors += transformConditional(n)
			}

		]
		// root.innerActors += actor
		root

	}

	def Actor transformConditional(Conditional conditional) {

		val guardname = conditional.condition.serialize.toString
		val actor = CircuitFactory::eINSTANCE.createActor

		actor.name = "cond_" + guardname;

		actor
	}

	def Actor transformAssignment(Assignment assignment) {
		var completeAssginmentString = assignment.assignment.serialize.toString

		val guardname = assignment.valuedObject.name
		// split Assignment into Strings at spaces
		// e.g. g10 = g2 || g9 => ["g2", "||", "g9"]
		val String[] splittedAssignmentAt = completeAssginmentString.split("(")
		
		//val String[] ssplit = splittedAssignmentAt.forEach[split(")"]
		//val String[] split = for  (splittedAssignmentAt.split(")")
		
		

		val actor = CircuitFactory::eINSTANCE.createActor

		actor.type = completeAssginmentString
		actor.name = guardname

		actor
	}

}