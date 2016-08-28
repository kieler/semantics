/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.circuit

import java.util.List
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author fry
 * 
 * This class creates the initialization region of the circuit containing reset logic and input registers.
 * 
 */
class CircuitInitialization {

	def initialize(List<? extends Declaration> declarations, Actor init, Actor logic, Actor newCircuit) {
		
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
	def createInAndOutputs(List<? extends Declaration> list, Actor init, Actor logic, Actor circuit) {
		// inserts in- and output Nodes of circuit
		list.filter(VariableDeclaration).forEach [ d |
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
		const0.name = outputPortName
		const0.type = "gnd"

		actor.innerActors.add(const0)
		
		createPort(const0, outputPortName, "Out")

	}

	def createConstantOne(Actor actor, String outputPortName) {
		val const1 = CircuitFactory::eINSTANCE.createActor
		const1.name = outputPortName
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







