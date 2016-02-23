package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import org.eclipse.emf.common.util.EList

class CircuitInitialization {

	def initialize(List<Declaration> declarations, Actor init, Actor logic, Actor newCircuit) {
		
		createLocalResetAndGo(init, logic)
		
		createInAndOutputs(declarations, init, logic, newCircuit)
		
//		initializePreRegion(pre)

	}
//	def initializePreRegion(Actor pre) {
//		val tickPort = CircuitFactory::eINSTANCE.createPort
//		val resetPort = CircuitFactory::eINSTANCE.createPort
//
//		tickPort.type = "InConnectorPre"
//		tickPort.name = "Tick"
//		pre.ports.add(tickPort)
//
//		resetPort.type = "InConnectorPre"
//		resetPort.name = "Reset_pre"
//		pre.ports.add(resetPort)
//	}
	
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
		logic.innerActors += createRegister("g0", "Reset" , "Reset_local")

		
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
	// one input tick node and one input reset node
	//
	// for each input: create one register in InitilizationRegion
	// //////////////////////////////////////////////////////////////////// 
	def createInAndOutputs(List<Declaration> list, Actor init, Actor logic, Actor circuit) {
		// inserts in- and output Nodes of circuit
		list.forEach [ d |
			d.valuedObjects.forEach [ vo |
				val name = (vo.name)
				if (d.isInput) {
					// creates InputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					val port = CircuitFactory::eINSTANCE.createPort
					actor.type = "Input " + name
					actor.name = name
					circuit.innerActors += actor
					
					port.type = "Out"
					port.name = name
					actor.ports.add(port)
					
					init.innerActors += createRegister(name, "Reset", name)
					createConnectorPorts(init,name,"InConnectorInit")
					createConnectorPorts(init,name,"OutConnectorInit")
					createConnectorPorts(logic,name,"InConnectorLogic")
					
				}
				if (d.isOutput) {
					// creates OutputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					val port = CircuitFactory::eINSTANCE.createPort
					
					actor.type = "Output " + name
					actor.name = name
					circuit.innerActors += actor
					
					port.type = "In"
					port.name = name
					actor.ports.add(port)
					
					createConnectorPorts(logic,name,"OutConnectorLogic")

				}
			]
		]
		createConnectorPorts(init, "Reset", "InConnectorInit")
		createConnectorPorts(logic, "Reset", "InConnectorLogic")
		
		createConnectorPorts(init, "Tick", "InConnectorInit")
		createConnectorPorts(logic, "Tick", "InConnectorLogic")
		
		createConnectorPorts(logic, "Reset_pre", "InConnectorLogic")

	}


	def drawInputRegister(String name, Actor init) {
		
		init.innerActors += createRegister(name, "Reset", name)
		
		createConnectorPorts(init, name , "InConnectorInit")
		createConnectorPorts(init, name , "OutConnectorInit")

	}
	
	def createConstantZero(Actor actor, String outputPortName) {

		val const0 = CircuitFactory::eINSTANCE.createActor
		val const0port = CircuitFactory::eINSTANCE.createPort
		const0.name = "0"
		const0.type = "gnd"
		const0port.type = "Out"
		const0port.name = outputPortName
		const0.ports += const0port

		actor.innerActors.add(const0)

	}

	def createConstantOne(Actor actor, String outputPortName) {
		val const1 = CircuitFactory::eINSTANCE.createActor
		val const1port = CircuitFactory::eINSTANCE.createPort
		const1.name = "1"
		const1.type = "vcc"
		const1port.type = "Out"
		const1port.name = outputPortName
		const1.ports += const1port

		actor.innerActors.add(const1)

	}
	
	
	def Actor createRegister(String name, String selPortName, String inPortName){
		val register = CircuitFactory::eINSTANCE.createActor
		
		register.name = name
		register.type = "REG"
		
		val regInPortTick = CircuitFactory::eINSTANCE.createPort
		val regInPortReset = CircuitFactory::eINSTANCE.createPort
		val regInPort = CircuitFactory::eINSTANCE.createPort
		val regOutPort = CircuitFactory::eINSTANCE.createPort

		regInPortTick.type = "In"
		regInPortTick.name = "Tick"

		regInPortReset.type = "Sel"
		regInPortReset.name = selPortName

		regInPort.type = "In"
		regInPort.name = inPortName
		regOutPort.type = "Out"
		regOutPort.name = name
		
		register.ports.add(regInPortTick)
		register.ports.add(regInPortReset)
		register.ports.add(regInPort)
		register.ports.add(regOutPort)
		
		
		
		return register
	}
	
	def createConnectorPorts(Actor frame, String name, String type){
		val port = CircuitFactory::eINSTANCE.createPort
		port.name = name
		port.type = type
		
		frame.ports += port
	}
}







