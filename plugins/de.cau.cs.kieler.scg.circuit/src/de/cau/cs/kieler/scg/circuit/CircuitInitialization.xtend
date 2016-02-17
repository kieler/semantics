package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import org.eclipse.emf.common.util.EList

class CircuitInitialization {

	def initialize(List<Declaration> declarations, Actor pre, Actor init, Actor logic, Actor newCircuit, Actor root) {
		
		createLocalResetAndGo(init, logic)
		
		createInAndOutputs(declarations, init, logic, newCircuit, root)
		
		initializePreRegion(pre)

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
	
	def createLocalResetAndGo(Actor init, Actor logic) {
//		drawInputRegister("Reset_local", init)

		val regActor = CircuitFactory::eINSTANCE.createActor
		val regInPortTick = CircuitFactory::eINSTANCE.createPort
		val regInPort = CircuitFactory::eINSTANCE.createPort
		val regOutPort = CircuitFactory::eINSTANCE.createPort

		regActor.type = "FF"
		regActor.name = "Reset_local"

		regInPortTick.type = "In"
		regInPortTick.name = "Tick"

		regInPort.type = "In"
		regInPort.name = "Reset"
		regOutPort.type = "Out"
		regOutPort.name = "Reset_local"
		regActor.ports.add(regInPortTick)
		regActor.ports.add(regInPort)
		regActor.ports.add(regOutPort)

		init.innerActors.add(regActor)

		// add ports to initialziatonRegion 
//		val initInPort = CircuitFactory::eINSTANCE.createPort
//		initInPort.name = name
//		initInPort.type = "InConnectorInit"
//
		val initOutPort = CircuitFactory::eINSTANCE.createPort
		initOutPort.name = "Reset_local"
		initOutPort.type = "OutConnectorInit"
//
//		init.ports.add(initInPort)
		init.ports.add(initOutPort)
		
		
		//_Go local Signal 
		val goRegister = CircuitFactory::eINSTANCE.createActor
		val goRegInTick = CircuitFactory::eINSTANCE.createPort
		val goRegInResetLocal = CircuitFactory::eINSTANCE.createPort
		val goRegSelReset = CircuitFactory::eINSTANCE.createPort
		val goRegOut = CircuitFactory::eINSTANCE.createPort
		
		goRegister.type = "REG"
		goRegister.name = "_GO"
		logic.innerActors += goRegister
		
		goRegInTick.type = "In"
		goRegInTick.name = "Tick"
		goRegister.ports += goRegInTick
		
		goRegInResetLocal.type = "In"
		goRegInResetLocal.name = "Reset_local"
		goRegister.ports += goRegInResetLocal
		
		goRegSelReset.type = "Sel"
		goRegSelReset.name = "Reset"
		goRegister.ports += goRegSelReset
		
		goRegOut.type = "Out"
		goRegOut.name = "_GO"
		goRegister.ports += goRegOut
		
		
		
		
		
		
		
		val LocalResetLogicPort = CircuitFactory::eINSTANCE.createPort
		LocalResetLogicPort.name = "Reset_local"
		LocalResetLogicPort.type = "InConnectorLogic"
		
		logic.ports += LocalResetLogicPort
		
		val orGate = CircuitFactory::eINSTANCE.createActor
		orGate.type = "OR"
		orGate.name = "Reset_pre" //this gate will reset all pre registers in case of reset and first tick 
		init.innerActors += orGate
		
		val orInReset = CircuitFactory::eINSTANCE.createPort
		orInReset.name = "Reset"
		orInReset.type = "In"
		orGate.ports += orInReset
		
		val orInLocalReset = CircuitFactory::eINSTANCE.createPort
		orInLocalReset.name = "Reset_local"
		orInLocalReset.type = "In"
		orGate.ports += orInLocalReset
		
		val orOutPort = CircuitFactory::eINSTANCE.createPort
		orOutPort.name = "Reset_pre"
		orOutPort.type = "Out"
		orGate.ports += orOutPort
		
		val orConnectorPort = CircuitFactory::eINSTANCE.createPort
		orConnectorPort.name = "Reset_pre"
		orConnectorPort.type = "OutConnectorInit"
		init.ports += orConnectorPort

		
		
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
}