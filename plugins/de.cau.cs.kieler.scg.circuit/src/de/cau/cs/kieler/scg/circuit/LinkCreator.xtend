package de.cau.cs.kieler.scg.circuit

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Port

import java.util.LinkedList
import de.cau.cs.kieler.circuit.CircuitFactory
import java.util.HashMap

class LinkCreator {
	
	
	//TODO: tick und reset sollen nicht mehr verbunden werden

	/*  Creates links for preRegion */
	def preRegion(Actor pre) {
		
		val ports = pre.eAllContents.filter(Port).toList
		for (p : ports) {
			if (p.type == "In" || p.type == "Sel") {
				for (op : ports) {
					if (op.type == "InConnectorPre" && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op
						link.target = p
						pre.innerLinks.add(link)
					}
				}
			} else if (p.type == "Out") {
				for (ip : ports) {
					if (ip.type == "OutConnectorPre" && p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p
						link.target = ip
						pre.innerLinks.add(link)
					}
				}
			}
		}
	}
	
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
					if (ip.type == "OutConnectorInit" && p.name == ip.name) {
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
	def logicRegion(Actor logic, HashMap<String, Integer> ssaMap) {
		var LinkedList<Port> portList = new LinkedList<Port>
		portList += logic.ports

		for (a : logic.innerActors) {
			val ports = a.ports
			portList += ports
		}

		for (p : portList) {
			if (p.type == "Out") {
				portList.forEach [ ip |
					if ((ip.type == "In" || ip.type == "Sel" || ip.type == "Not" || ip.type == "OutConnectorLogic") &&
						p.name == ip.name && p.eContainer != ip.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						logic.innerLinks += link

					}

				]
			}

			if (p.type == "In" || p.type == "Sel" || p.type == "Not") {
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

		for (oc : portList.filter[type == "OutConnectorLogic"]) {
			if (oc.incomingLinks.length == 0) {
				// search for SSA which is meant to be the output
				portList.forEach [ ic |
					if (ic.type == "Out" && ic.name == oc.name + "_" + ssaMap.get(oc.name)) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = ic;
						link.target = oc;
						logic.innerLinks += link
						System.out.println("connected" + ic.name + " with " + oc.name)
					}

				]
			}
		}
		for (oc : portList.filter[type == "OutConnectorLogic"]) {
			if (oc.incomingLinks.length == 0) {
				// in this case, the variable was not changed by the program. e.g A in ABO
				portList.forEach [ ic |
					if ((ic.type == "InConnectorLogic") && oc.name == ic.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = ic;
						link.target = oc;
						logic.innerLinks += link
						System.out.println("RRRconnected" + ic.name + " with " + oc.name)
					}

				]

			}
		}

	}
	
	/*  Creates links to connect Regions within the circuit */
	def circuitRegion(Actor circuit) {

		var LinkedList<Port> portList = new LinkedList<Port>
		portList += circuit.ports

		for (a : circuit.innerActors) {
			val ports = a.ports
			portList += ports
		}
		
		val ports = portList.filter[name != "Tick" && name != "Reset"]
		

		for (p : ports) {
			if (p.type == "OutConnectorInit" || p.type == "OutConnectorPre") {
				System.out.println(p.name)
				ports.forEach [ ip |
					if ((ip.type == "InConnectorLogic" || ip.type == "InConnectorPre" )&& p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						circuit.innerLinks += link
					}
				]
			}
			if (p.type == "InConnectorCircuit") {
				ports.forEach [ op | 
					if ((op.type == "InConnectorInit" || op.type == "InConnectorPre") && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = op
						circuit.innerLinks += link

					}

				]
			}
			if (p.type == "OutConnectorLogic") {
				ports.forEach [ op |
					if ((op.type == "OutConnectorCircuit" || op.type == "InConnectorPre" ) && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = op
						circuit.innerLinks += link

					}

				]
			}

		}

	}

	def rootRegion(Actor root) {
		var LinkedList<Port> portList = new LinkedList<Port>

		for (a : root.innerActors) {
			val ports = a.ports
			portList += ports

		}

		for (p : portList) {
			if (p.type == "Out") {
				portList.forEach [ ip |
					if (ip.type == "InConnectorCircuit" && p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						root.innerLinks += link

					}

				]
			}
			if (p.type == "In") {
				portList.forEach [ op |
					if (op.type == "OutConnectorCircuit" && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = p;
						root.innerLinks += link

					}

				]
			}

		}
	}

}