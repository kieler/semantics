package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import org.eclipse.emf.common.util.EList

class CircuitInitialization {

	def initialize(List<Declaration> declarations, Actor init, Actor logic, Actor newCircuit, Actor root) {

//		initializeCircuit(logic, newCircuit, root)

		createInAndOutputs(declarations, init, logic, newCircuit, root)

//		createInputRegisters(declarations, newCircuit, logic)

		// createConstantZeroAndOne(newCircuit)
//		createResetAndGoRegister(newCircuit)

	}

	// ////////////////////////////////////////////////////////////////////
	// create nodes for each in- and output and
	// an input tick node and an input reset node
	//
	// for each input: create one register in InitilizationRegion
	// //////////////////////////////////////////////////////////////////// 
	def createInAndOutputs(List<Declaration> list, Actor init, Actor logic, Actor circuit, Actor root) {
		// inserts in- and output Nodes of circuit
		list.forEach [ d |
			d.valuedObjects.forEach [ vo |
				val name = (vo.name)

				if (d.isInput) {
					// creates InputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					val port = CircuitFactory::eINSTANCE.createPort
					actor.type = "Input " + name
					root.innerActors += actor
					
					port.type = "Out"
					port.name = name
					actor.ports.add(port)
					
					drawInputRegister(name, init)
					createInConnectorPorts(name, init, logic, circuit)
				}
				if (d.isOutput) {
					// creates OutputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					val port = CircuitFactory::eINSTANCE.createPort
					
					actor.type = "Output " + name
					root.innerActors += actor
					
					port.type = "In"
					port.name = name
					actor.ports.add(port)
					
					createOutConnectorPorts(name, logic, circuit)

				}
			]
		]
		// now add reset...
		val reset = CircuitFactory::eINSTANCE.createActor
		reset.type = "Reset"
		val resetPort = CircuitFactory::eINSTANCE.createPort
		resetPort.name = "Reset"
		resetPort.type = "Out"
		root.innerActors += reset
		reset.ports += resetPort

		createInConnectorPorts("Reset", init, logic, circuit)

		// ...and tick
		val tick = CircuitFactory::eINSTANCE.createActor
		tick.type = "Tick"
		val tickPort = CircuitFactory::eINSTANCE.createPort
		tickPort.name = "Tick"
		tickPort.type = "Out"
		root.innerActors += tick
		tick.ports += tickPort

		createInConnectorPorts("Tick", init, logic, circuit)

	}

	def createInConnectorPorts(String name, Actor init, Actor logic, Actor circuit) {

		// connection port for circuit
		val circuitPort = CircuitFactory::eINSTANCE.createPort
		circuitPort.name = name
		circuitPort.type = "InConnectorCircuit"
		circuit.ports.add(circuitPort)

		// connection port for logic region
		val logicPort = CircuitFactory::eINSTANCE.createPort
		logicPort.name = name
		logicPort.type = "InConnectorLogic"
		logic.ports.add(logicPort)

		// connection port for init region
		val initPort = CircuitFactory::eINSTANCE.createPort
		initPort.name = name
		initPort.type = "InConnectorInit"
		init.ports.add(initPort)
	}

	def createOutConnectorPorts(String name, Actor logic, Actor circuit) {
		// connection port for circuit
		val circuitPort = CircuitFactory::eINSTANCE.createPort
		circuitPort.name = name
		circuitPort.type = "OutConnectorCircuit"
		circuit.ports.add(circuitPort)

		// connection port for logic region
		val logicPort = CircuitFactory::eINSTANCE.createPort
		logicPort.name = name
		logicPort.type = "OutConnectorLogic"
		logic.ports.add(logicPort)

	}

	def drawInputRegister(String name, Actor init) {
		val regActor = CircuitFactory::eINSTANCE.createActor
		val regInPortTick = CircuitFactory::eINSTANCE.createPort
		val regInPortReset = CircuitFactory::eINSTANCE.createPort
		val regInPort = CircuitFactory::eINSTANCE.createPort
		val regOutPort = CircuitFactory::eINSTANCE.createPort

		regActor.type = "REG"
		regActor.name = name

		regInPortTick.type = "In"
		regInPortTick.name = "Tick"

		regInPortReset.type = "Sel"
		regInPortReset.name = "Reset"

		regInPort.type = "In"
		regInPort.name = name
		regOutPort.type = "Out"
		regOutPort.name = name
		regActor.ports.add(regInPortTick)
		regActor.ports.add(regInPortReset)
		regActor.ports.add(regInPort)
		regActor.ports.add(regOutPort)

		init.innerActors.add(regActor)

		// add ports to initialziatonRegion 
//		val initInPort = CircuitFactory::eINSTANCE.createPort
//		initInPort.name = name
//		initInPort.type = "InConnectorInit"
//
		val initOutPort = CircuitFactory::eINSTANCE.createPort
		initOutPort.name = name
		initOutPort.type = "OutConnectorInit"
//
//		init.ports.add(initInPort)
		init.ports.add(initOutPort)

	}
	
	def createConstantZero(Actor actor) {

		val const0 = CircuitFactory::eINSTANCE.createActor
		val const0port = CircuitFactory::eINSTANCE.createPort
		const0.name = "0"
		const0.type = "gnd"
		const0port.type = "Out"
		const0port.name = "const0"
		const0.ports += const0port

		actor.innerActors.add(const0)

	}

	def createConstantOne(Actor actor) {
		val const1 = CircuitFactory::eINSTANCE.createActor
		val const1port = CircuitFactory::eINSTANCE.createPort
		const1.name = "1"
		const1.type = "vcc"
		const1port.type = "Out"
		const1port.name = "const1"
		const1.ports += const1port

		actor.innerActors.add(const1)

	}
	

//	def createOutputPorts(List<Declaration> declarations, Actor logic) {
//		// add connecting ports for outputs
//		for (d : declarations) {
//			if (d.isOutput) {
//				d.valuedObjects.forEach [ vo |
//					val outputPort = CircuitFactory::eINSTANCE.createPort
//					outputPort.type = "OutConnectorLogic"
//
//					outputPort.name = vo.name
//					logic.ports.add(outputPort)
//				]
//
//			}
//		}
//	}

//	def createResetAndGoRegister(Actor init) {
//		val localReset = CircuitFactory::eINSTANCE.createActor
//
//		localReset.name = "Reset_local"
//		localReset.type = "FF"
//
//		val localReset_tick = CircuitFactory::eINSTANCE.createPort
//		val localReset_reset = CircuitFactory::eINSTANCE.createPort
//		val localReset_out = CircuitFactory::eINSTANCE.createPort
//
//		localReset_tick.name = "Tick"
//		localReset_tick.type = "In"
//		localReset_reset.name = "Reset" // + "_circuit"
//		localReset_reset.type = "In"
//
//		localReset_out.name = "Reset_local" // "_GO"
//		localReset_out.type = "Out"
//
//		localReset.ports += localReset_tick
//		localReset.ports += localReset_reset
//		localReset.ports += localReset_out
//
//		val localGo = CircuitFactory::eINSTANCE.createActor
//		localGo.name = "Go_local"
//		localGo.type = "REG"
//
//		val localGo_reset = CircuitFactory::eINSTANCE.createPort
//		val localGo_tick = CircuitFactory::eINSTANCE.createPort
//		val localGo_Go = CircuitFactory::eINSTANCE.createPort
//		val localGo_out = CircuitFactory::eINSTANCE.createPort
//
//		localGo_Go.name = "Reset_local"
//		localGo_Go.type = "In"
//
//		localGo_tick.name = "Tick"
//		localGo_tick.type = "In"
//
//		localGo_reset.name = "Reset"
//		localGo_reset.type = "Sel"
//
//		localGo_out.name = "_GO"
//		localGo_out.type = "Out"
//
//		localGo.ports.add(localGo_reset)
//		localGo.ports.add(localGo_tick)
//		localGo.ports.add(localGo_out)
//		localGo.ports.add(localGo_Go)
//
//		val l = CircuitFactory::eINSTANCE.createLink
//		l.source = localReset_out
//		l.target = localGo_Go
//		actor.innerLinks.add(l)
//
//		actor.innerActors.add(localGo)
//		actor.innerActors.add(localReset)
//
//	}
//
	//
//	def initializeCircuit(Actor logic, Actor circuit, Actor root) {
//		// As we want to create a circuit, we need to add a reset and a tick
//		val reset = CircuitFactory::eINSTANCE.createActor
//		reset.name = "Reset"
//		reset.type = "In"
//		val resetPort = CircuitFactory::eINSTANCE.createPort
//		resetPort.name = reset.name
//		resetPort.type = "Out"
//
//		root.innerActors += reset
//		reset.ports += resetPort
//		val resetCircuitPort = CircuitFactory::eINSTANCE.createPort
//		resetCircuitPort.name = reset.name
//		resetCircuitPort.type = "InConnectorCircuit"
//		circuit.ports += resetCircuitPort
//
////		val resetLink = CircuitFactory::eINSTANCE.createLink
////		resetLink.source = resetPort
////		resetLink.target = resetCircuitPort
////		root.innerLinks += resetLink
//		val tick = CircuitFactory::eINSTANCE.createActor
//		tick.name = "Tick"
//		tick.type = "In"
//		val tickPort = CircuitFactory::eINSTANCE.createPort
//		tickPort.name = tick.name
//		tickPort.type = "Out"
//
//		root.innerActors += tick
//		tick.ports += tickPort
//		val tickCircuitPort = CircuitFactory::eINSTANCE.createPort
//		tickCircuitPort.name = tick.name
//		tickCircuitPort.type = "InConnectorCircuit"
//		circuit.ports += tickCircuitPort
//
//		val logicTickPort = CircuitFactory::eINSTANCE.createPort
//		logicTickPort.name = "Tick"
//		logicTickPort.type = "InConnectorLogic"
//
//		logic.ports.add(logicTickPort)
//
//		val tickLink = CircuitFactory::eINSTANCE.createLink
//		tickLink.source = tickCircuitPort
//		tickLink.target = logicTickPort
//		circuit.innerLinks += tickLink
//
////		val tickLink = CircuitFactory::eINSTANCE.createLink
////		tickLink.source = tickPort
////		tickLink.target = tickCircuitPort
////		root.innerLinks += tickLink
//	// TODO: create Reset and Tick local to simulate _GO 
//	}
//
//	def createInputRegisters(List<Declaration> list, Actor actor, Actor logic) {
//		// creates a FlipFlop for each input value to avoid signal changes within a tick
//		list.forEach [ d |
//			d.valuedObjects.forEach [ vo |
//
//				if (d.isInput) {
//					val name = (vo.name)
//					val regActor = CircuitFactory::eINSTANCE.createActor
//					val regInPortClock = CircuitFactory::eINSTANCE.createPort
//					val regInPortReset = CircuitFactory::eINSTANCE.createPort
//					val regInPort = CircuitFactory::eINSTANCE.createPort
//					val regOutPort = CircuitFactory::eINSTANCE.createPort
//					regActor.type = "REG"
//					regActor.name = name
//
//					regInPortClock.type = "In"
//					regInPortClock.name = "Tick"
//
//					regInPortReset.type = "Sel"
//					regInPortReset.name = "Reset"
//
//					regInPort.type = "In"
//					regInPort.name = name // + "_in"
//					regOutPort.type = "Out"
//					regOutPort.name = name // + "_out"
//					regActor.ports.add(regInPortClock)
//					regActor.ports.add(regInPortReset)
//					regActor.ports.add(regInPort)
//					regActor.ports.add(regOutPort)
//
//					actor.innerActors.add(regActor)
//
//					// add port to logic actor
//					val registerPort = CircuitFactory::eINSTANCE.createPort
//					registerPort.name = name // + "_in" //+ "_out"
//					registerPort.type = "InConnectorLogic"
//
//					logic.ports.add(registerPort)
//
//				}
//
//			]
//
//		]
//
//	}

}