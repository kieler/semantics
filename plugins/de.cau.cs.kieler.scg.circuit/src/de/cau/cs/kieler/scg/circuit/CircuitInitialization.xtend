package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory

class CircuitInitialization {

	def initialize(List<Declaration> declarations, Actor init, Actor logic, Actor newCircuit) {
		
		createLocalResetAndGo(init, logic)
		
		createInAndOutputs(declarations, init, logic, newCircuit)

	}

	
	def createLocalResetAndGo(Actor init, Actor logic) {
		
		// -------------------------------------------------------
		// --              Create Reset_local Register          --
		// -------------------------------------------------------
		val regActor = CircuitFactory::eINSTANCE.createActor

		regActor.type = "FF"
		regActor.name = "Reset_local"


		createPort(regActor, "Reset", "In")
		createPort(regActor, "Tick", "In")
		createPort(regActor, "Reset_local", "Out")

		init.innerActors.add(regActor)


		// -------------------------------------------------------
		// --              Create _GO Register                  --
		// -------------------------------------------------------
		init.innerActors += createRegister("_GO", "Reset" , "Reset_local")
		
		createPort(logic, "g0", "InConnectorLogic")
		createPort(init, "g0", "OutConnectorInit")

		// -------------------------------------------------------
		// --Create Reset_pre for pre Registers in logic region --
		// -------------------------------------------------------
		val orGate = CircuitFactory::eINSTANCE.createActor
		orGate.type = "OR"
		orGate.name = "Reset_pre" //this gate will reset all pre registers in case of reset and first tick 
		init.innerActors += orGate
		
		createPort(orGate, "Reset", "In")
		createPort(orGate, "Reset_local", "In")
		createPort(orGate, "Reset_pre", "Out")
		
		createPort(init, "Reset_pre", "OutConnectorInit")
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

					actor.type = "Input " + name
					actor.name = name
					circuit.innerActors += actor
					
					createPort(actor, name, "Out")
					
					createPort(init,name,"InConnectorInit")
					createPort(init,name,"OutConnectorInit")
					createPort(logic,name,"InConnectorLogic")
					
					init.innerActors += createRegister(name, "Reset", name)
					
				}
				if (d.isOutput) {
					// creates OutputNode
					val actor = CircuitFactory::eINSTANCE.createActor
					
					actor.type = "Output " + name
					actor.name = name
					circuit.innerActors += actor
					
					createPort(actor, name, "In")

					createPort(logic,name,"OutConnectorLogic")

				}
			]
		]
		createPort(init, "Reset", "InConnectorInit")
		
		createPort(init, "Tick", "InConnectorInit")
		createPort(logic, "Tick", "InConnectorLogic")
		
		createPort(logic, "Reset_pre", "InConnectorLogic")

	}


	def drawInputRegister(String name, Actor init) {
		
		init.innerActors += createRegister(name, "Reset", name)
		
		createPort(init, name , "InConnectorInit")
		createPort(init, name , "OutConnectorInit")

	}
	
	def createConstantZero(Actor actor, String outputPortName) {

		val const0 = CircuitFactory::eINSTANCE.createActor
		const0.name = "0"
		const0.type = "gnd"

		actor.innerActors.add(const0)
		
		createPort(const0, outputPortName, "Out")

	}

	def createConstantOne(Actor actor, String outputPortName) {
		val const1 = CircuitFactory::eINSTANCE.createActor
		const1.name = "1"
		const1.type = "vcc"
		
		actor.innerActors.add(const1)
		createPort(const1, outputPortName, "Out")

	}
	
	
	def Actor createRegister(String name, String selPortName, String inPortName){
		val register = CircuitFactory::eINSTANCE.createActor
		
		register.name = name
		register.type = "REG"
		
		createPort(register, "Tick", "In")
		createPort(register, inPortName, "In")
		createPort(register, selPortName, "Sel")
		if(name == "_GO"){
			createPort(register, "g0", "Out" )
		}
		else{
			createPort(register, name, "Out" )
		}
		return register
	}
	
	def createPort(Actor frame, String name, String type){
		val port = CircuitFactory::eINSTANCE.createPort
		port.name = name
		port.type = type
		frame.ports += port
	}
}







