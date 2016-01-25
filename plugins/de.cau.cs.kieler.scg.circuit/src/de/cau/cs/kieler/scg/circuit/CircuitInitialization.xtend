package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import org.eclipse.emf.common.util.EList

class CircuitInitialization {

	def initialize(EList<Declaration> declarations, Actor newCircuit, Actor root) {

		initializeCircuit(newCircuit, root)

		createInOutputs(declarations, newCircuit, root)

		createInOutRegisters(declarations, newCircuit)

		createConstantZeroAndOne(newCircuit)

		createResetAndGoRegister(newCircuit)

	}

	def createResetAndGoRegister(Actor actor) {
		val localReset = CircuitFactory::eINSTANCE.createActor
//		val localGo = CircuitFactory::eINSTANCE.createActor
		localReset.name = "Reset_local"
		localReset.type = "REG"

//		localGo.name = "Go_local"
//		localGo.type = "REG"
		val localReset_reset = CircuitFactory::eINSTANCE.createPort
		val localReset_tick = CircuitFactory::eINSTANCE.createPort
		val localReset_out = CircuitFactory::eINSTANCE.createPort

		localReset_reset.name = "Reset"
		localReset_reset.type = "In"

		localReset_tick.name = "Tick"
		localReset_tick.type = "In"

		localReset_out.name = localReset.name
		localReset_out.type = "Out"

		localReset.ports.add(localReset_reset)
		localReset.ports.add(localReset_tick)
		localReset.ports.add(localReset_out)

//		val localGo_reset = CircuitFactory::eINSTANCE.createPort
//		val localGo_tick = CircuitFactory::eINSTANCE.createPort
//		val localGo_Go = CircuitFactory::eINSTANCE.createPort
//		val localGo_out = CircuitFactory::eINSTANCE.createPort
//		
//		localGo_reset.name = "Reset_local"
//		localGo_reset.type = "In"
//		
//		localGo_tick.name = "Tick"
//		localGo_tick.type = "In"
//		
//		localGo_Go.name = "Reset"
//		localGo_Go.type = "Sel"
//		
//		localGo_out.name = "_GO"
//		localGo_out.type = "Out"
//		
//		localGo.ports.add(localReset_reset)
//		localGo.ports.add(localReset_tick)
//		localGo.ports.add(localReset_out)
//		actor.innerActors.add(localGo)
		actor.innerActors.add(localReset)

	}

	def createConstantZeroAndOne(Actor actor) {
		val const1 = CircuitFactory::eINSTANCE.createActor
		val const1port = CircuitFactory::eINSTANCE.createPort
		const1.name = "1"
		const1.type = "vcc"
		const1port.type = "Out"
		const1port.name = "const1"
		const1.ports += const1port

		val const0 = CircuitFactory::eINSTANCE.createActor
		val const0port = CircuitFactory::eINSTANCE.createPort
		const0.name = "0"
		const0.type = "gnd"
		const0port.type = "Out"
		const0port.name = "const0"
		const0.ports += const0port

		actor.innerActors.add(const1)
		actor.innerActors.add(const0)

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
		resetCircuitPort.type = "InOut"
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
		tickCircuitPort.type = "InOut"
		circuit.ports += tickCircuitPort

		val tickLink = CircuitFactory::eINSTANCE.createLink
		tickLink.source = tickPort
		tickLink.target = tickCircuitPort
		root.innerLinks += tickLink

	// TODO: create Reset and Tick local to similate _GO as gjo did
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
					actorPort.name = name + "_out"
					actorPort.type = "Out"
					circuitPort.name = name + "_in"
					circuitPort.type = "InOut"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor

					val link = CircuitFactory::eINSTANCE.createLink
					link.source = actorPort
					link.target = circuitPort
					root.innerLinks += link

				}
				if (d.isOutput) {
					// creates OutputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					// port for OutputNode --->|out|
					val actorPort = CircuitFactory::eINSTANCE.createPort
					// port for circuitActor |circuit|--->
					val circuitPort = CircuitFactory::eINSTANCE.createPort

					actor.type = "output " + name
					actorPort.name = name + "_in"
					actorPort.type = "In"
					circuitPort.name = name + "_out"
					circuitPort.type = "OutIn"
					actor.ports += actorPort
					circuit.ports += circuitPort
					root.innerActors += actor

					val link = CircuitFactory::eINSTANCE.createLink
					link.target = actorPort
					link.source = circuitPort

					root.innerLinks.add(link)

					
				}
			]
		]
	}

	def createInOutRegisters(EList<Declaration> list, Actor actor) {
		list.forEach [ d |
			d.valuedObjects.forEach [ vo |
				val name = (vo.name)

				if (d.isInput) {
					val regActor = CircuitFactory::eINSTANCE.createActor
					val regInPortClock = CircuitFactory::eINSTANCE.createPort
					val regInPortReset = CircuitFactory::eINSTANCE.createPort
					val regInPort = CircuitFactory::eINSTANCE.createPort
					val regOutPort = CircuitFactory::eINSTANCE.createPort
					regActor.type = "REG"
					regActor.name = name

					regInPortClock.type = "In"
					regInPortClock.name = "Tick"

					regInPortReset.type = "Sel"
					regInPortReset.name = "Reset"

					regInPort.type = "In"
					regInPort.name = name + "_in"

					regOutPort.type = "Out"
					regOutPort.name = name

					regActor.ports.add(regInPortClock)
					regActor.ports.add(regInPortReset)
					regActor.ports.add(regInPort)
					regActor.ports.add(regOutPort)

					actor.innerActors.add(regActor)

				}

			]

		]

	}

}