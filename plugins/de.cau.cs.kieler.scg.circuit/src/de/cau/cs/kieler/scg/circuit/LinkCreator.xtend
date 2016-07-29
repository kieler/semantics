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

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.circuit.Port
import de.cau.cs.kieler.circuit.properties.ILinkTypeProvider
import de.cau.cs.kieler.circuit.properties.IPortTypeProvider
import java.util.HashMap
import java.util.LinkedList

/**
 * @author fry
 * Creator for links(wires) in each region of the circuit.
 */

class LinkCreator implements IPortTypeProvider, ILinkTypeProvider{
	
	/**
	 * In every region ports with the same name but different types are connected.
	 * different types means e.g. IN and OUT ports with the same name.
	 * @see IPortTypeProvider
	 * 
	 * "InConnector" and "OutConnector" are region ports, 
	 * "Not", "Sel", "In" and "Out" ports are gate ports.
	 * 
	 */
	
	
	// -------------------------------------------------------------------------
	// --                     Initialization Region                           --
	// -------------------------------------------------------------------------
	def initRegion(Actor init) {
		val ports = init.eAllContents.filter(Port).toList
		for (p : ports) {
			if (p.type == IN || p.type == MUX_SELECTION) {
				for (op : ports) {
					if ((op.type == "InConnectorInit" || op.type == OUT) && p.name == op.name && p.eContainer != op.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op
						link.target = p
						init.innerLinks.add(link)
					}
				}
			} else if (p.type == OUT) {
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
	
	
	// -------------------------------------------------------------------------
	// --                           Logic Region                              --
	// -------------------------------------------------------------------------
	def logicRegion(Actor logic, HashMap<String,Integer> inputOutputMap) {
		var LinkedList<Port> portList = new LinkedList<Port>
		
		portList += logic.eAllContents.filter(Port).toList
		
		for (p : portList) {
			if (p.type == OUT) {
				portList.forEach [ ip |
					if ((ip.type.startsWith(IN) || ip.type == MUX_SELECTION || ip.type == NOT || ip.type == "OutConnectorLogic") &&
						p.name == ip.name && p.eContainer != ip.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = ip
						logic.innerLinks += link
					}
				]
				//for input output variables: choose highest version to connect to the output
				for(ioSet : inputOutputMap.entrySet){
					if(p.name == ioSet.key + "_" + ioSet.value){
						portList.forEach[outConn |
							if(outConn.type == "OutConnectorLogic" && outConn.name == ioSet.key){
								val link = CircuitFactory::eINSTANCE.createLink
								link.source = p;
								link.target = outConn
								logic.innerLinks += link
								
							}
						]
					}
				}
			}

			if (p.type.startsWith(IN) || p.type == MUX_SELECTION || p.type == NOT) {
				portList.forEach [ op |
					if ((op.type == "InConnectorLogic") && p.name == op.name && p.eContainer != op.eContainer) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = op;
						link.target = p
						logic.innerLinks += link
					}
				]
			}
			
			//e.g. in ABO A is not changed in the program. but the ports for the logic region have to be connected
			if(p.type == "OutConnectorLogic" && !inputOutputMap.containsKey(p.name)){
				portList.forEach[ inConn |
					if(inConn.type == "InConnectorLogic" && inConn.name == p.name){
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = inConn;
						link.target = p;
						logic.innerLinks += link
					}
				]
			}
		}
	}
	
	// -------------------------------------------------------------------------
	// --              Interconnect Regions and In/outputs                    --
	// -------------------------------------------------------------------------
	def circuitRegion(Actor circuit) {

		var LinkedList<Port> ports = new LinkedList<Port>
		ports += circuit.ports

		for (a : circuit.innerActors) {
			val por = a.ports
			ports += por
		}		

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

			if (p.type == "OutConnectorLogic") {
				ports.forEach [ op |
					if ((op.type == IN) && p.name == op.name) {
						val link = CircuitFactory::eINSTANCE.createLink
						link.source = p;
						link.target = op
						circuit.innerLinks += link
					}
				]
			}
			if(p.type == "InConnectorInit"){
				ports.forEach[op |
					if((op.type == OUT) && p.name == op.name){
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