package de.cau.cs.kieler.scg.circuit

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Port

import java.util.LinkedList
import de.cau.cs.kieler.circuit.CircuitFactory
import java.util.HashMap

class LinkCreator {
	
	
	
	/*  Creates links for InitializationRegion */
	def initRegion(Actor init) {
		val ports = init.eAllContents.filter(Port).toList
		for (p : ports) {
			if (p.type == "In" || p.type == "Sel") {
				for (op : ports) {
					if ((op.type == "InConnectorInit" || op.type == "Out") && p.name == op.name && p.eContainer != op.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op
						link.target = p
						init.innerLinks.add(link)

					}
				}
			} else if (p.type == "Out") {
				for (ip : ports) {
					if (ip.type == "OutConnectorInit" && p.name == ip.name && p.eContainer != ip.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p
						link.target = ip
						init.innerLinks.add(link)
					}
				}
			}

		}

	}
	
	
	/*  Creates links for LogicRegion */
	def logicRegion(Actor logic) {
		var LinkedList<Port> portList = new LinkedList<Port>
		portList += logic.ports

		for (a : logic.innerActors) {
			val ports = a.ports
			portList += ports
		}

		for (p : portList) {
			if (p.type == "Out") {
				portList.forEach [ ip |
					if ((ip.type.startsWith("In") || ip.type == "Sel" || ip.type == "Not" || ip.type == "OutConnectorLogic") &&
						p.name == ip.name && p.eContainer != ip.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						logic.innerLinks += link

					}

				]
			}

			if (p.type.startsWith("In") || p.type == "Sel" || p.type == "Not") {
				portList.forEach [ op |
					if ((op.type == "InConnectorLogic") && p.name == op.name && p.eContainer != op.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = p
						logic.innerLinks += link
					}
				]
			}
		}
	}
	
	/*  Create links to connect Regions within the circuit */
	def circuitRegion(Actor circuit) {

		var LinkedList<Port> ports = new LinkedList<Port>
		ports += circuit.ports

		for (a : circuit.innerActors) {
			val por = a.ports
			ports += por
		}
		
//		val ports = portList//.filter[name != "Tick" && name != "Reset"]
		

		for (p : ports) {
			if (p.type == "OutConnectorInit") {
				ports.forEach [ ip |
					if ((ip.type == "InConnectorLogic")&& p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						circuit.innerLinks += link
					}
				]
			}
//			if (p.type == "InConnectorCircuit") {
//				ports.forEach [ op | 
//					if ((op.type == "InConnectorInit") && p.name == op.name) {
//						val link = CircuitFactory::eINSTANCE.createLink
//						link.source = p;
//						link.target = op
//						circuit.innerLinks += link
//
//					}
//
//				]
//			}
			if (p.type == "OutConnectorLogic") {
				ports.forEach [ op |
					if ((op.type == "In") && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = op
						circuit.innerLinks += link

					}

				]
			}
			if(p.type == "InConnectorInit"){
				ports.forEach[op |
					if((op.type == "Out") && p.name == op.name){
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = p
						circuit.innerLinks += link
					}
				]
			}

		}

	}

	

}