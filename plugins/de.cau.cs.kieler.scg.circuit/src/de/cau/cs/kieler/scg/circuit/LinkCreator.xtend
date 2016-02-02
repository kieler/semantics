package de.cau.cs.kieler.scg.circuit

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.Port

import java.util.LinkedList
import de.cau.cs.kieler.circuit.CircuitFactory

class LinkCreator {
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

	def initRegion(Actor init) {
		val ports = init.eAllContents.filter(Port).toList
		for (p : ports) {
			if (p.type == "In" || p.type == "Sel") {
				for (op : ports) {
					if (op.type == "InConnectorInit" && p.name == op.name) {
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
					if ((ip.type == "In" || ip.type == "Sel" || ip.type == "Not" || ip.type == "OutConnectorLogic") && p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						logic.innerLinks += link

					}

				]
			}
			
			if(p.type == "In" ){
				portList.forEach [ op |
					if ((op.type == "InConnectorLogic")&& p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = p
						logic.innerLinks += link

					}

				]
			}
//			if (p.type == "In") {
//				portList.forEach [ op |
//					if (op.type == "Out" && p.name == op.name) {
//						val link = CircuitFactory::eINSTANCE.createLink
//						link.source = p;
//						link.target = op
//						logic.innerLinks += link
//
//					}
//
//				]
//			}
		}
	}

	def circuitRegion(Actor circuit) {

		var LinkedList<Port> portList = new LinkedList<Port>
		portList += circuit.ports

		for (a : circuit.innerActors) {
			val ports = a.ports
			portList += ports
		}

		for (p : portList) {
			if (p.type == "Out") {
				portList.forEach [ ip |
					if (ip.type == "InConnectorLogic" && p.name == ip.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						circuit.innerLinks += link

					}

				]
			}
			if (p.type == "In" || p.type == "Sel") {
				portList.forEach [ op |
					if (op.type == "InConnectorCircuit" && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = op
						circuit.innerLinks += link

					}

				]
			}
			if (p.type == "OutConnectorLogic") {
				portList.forEach [ op |
					if (op.type == "OutConnectorCircuit" && p.name == op.name) {
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