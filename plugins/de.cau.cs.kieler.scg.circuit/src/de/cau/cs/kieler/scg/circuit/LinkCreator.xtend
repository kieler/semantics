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
import de.cau.cs.kieler.circuit.Port
import java.util.LinkedList
import de.cau.cs.kieler.circuit.CircuitFactory
import java.util.HashMap

/**
 * @author fry
 * Creator for links(wires) in each region of the circuit.
 */
class LinkCreator {

    /**
     * in every region ports with the same name but different types are connected.
     * 
     * "InConnector" and "OutConnector" are ports located at regions, 
     * "Not", "Sel", "In" and "Out" ports are located at gates.
     * 
     */
    // -------------------------------------------------------------------------
    // --                     Initialization Region                           --
    // -------------------------------------------------------------------------
    def initRegion(Actor init) {
        val ports = init.eAllContents.filter(Port).toList
        for (p : ports) {
            if (p.type == "In" || p.type == "Sel") {
                for (op : ports) {
                    if ((op.type == "InConnectorInit" || op.type == "Out") && p.name == op.name &&
                        p.eContainer != op.eContainer) {
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

    // -------------------------------------------------------------------------
    // --                           Logic Region                              --
    // -------------------------------------------------------------------------
    def logicRegion(Actor logic, HashMap<String, Integer> inputOutputMap) {
        var LinkedList<Port> portList = new LinkedList<Port>
        var LinkedList<Actor> regionList = new LinkedList<Actor>
        
        portList.addAll(logic.ports)
        for (actor : logic.innerActors.toList) {
            portList.addAll(actor.ports)
            if (!actor.innerActors.empty) {
                regionList.add(actor)
            }
        }

        for (p : portList) {
            if (p.type == "Out" || p.type == "redOut") {
                portList.forEach [ ip |
                    if ((ip.type.startsWith("redIn") || ip.type.startsWith("In") || ip.type == "Sel" ||
                        ip.type == "Not" || ip.type == "OutConnectorLogic") && p.name == ip.name &&
                        p.eContainer != ip.eContainer) {
                        val link = CircuitFactory::eINSTANCE.createLink
                        link.source = p;
                        link.target = ip
                        logic.innerLinks += link
                    }
                ]
                // for input output variables: choose highest version to connect to the output
                for (ioSet : inputOutputMap.entrySet) {
                    if (p.name == ioSet.key + "_" + ioSet.value) {
                        portList.forEach [ outConn |
                            if (outConn.type == "OutConnectorLogic" && outConn.name == ioSet.key) {
                                val link = CircuitFactory::eINSTANCE.createLink
                                link.source = p;
                                link.target = outConn
                                logic.innerLinks += link

                            }
                        ]
                    }
                }
            }

            if (p.type.startsWith("In") || p.type == "Sel" || p.type == "Not" || p.type == "redIn") {
                portList.forEach [ op |
                    if ((op.type == "InConnectorLogic") && p.name == op.name && p.eContainer != op.eContainer) {
                        val link = CircuitFactory::eINSTANCE.createLink
                        link.source = op;
                        link.target = p
                        logic.innerLinks += link
                    }
                ]
            }

            // e.g. in ABO A is not changed in the program. but the ports for the logic region have to be connected
            if (p.type == "OutConnectorLogic" && !inputOutputMap.containsKey(p.name)) {
                portList.forEach [ inConn |
                    if (inConn.type == "InConnectorLogic" && inConn.name == p.name) {
                        val link = CircuitFactory::eINSTANCE.createLink
                        link.source = inConn;
                        link.target = p;
                        logic.innerLinks += link
                    }
                ]
            }
        }

        // handle link creation for guard regions
        for (region : regionList) {
            var LinkedList<Port> regionPortList = new LinkedList<Port>
            regionPortList.addAll(region.eAllContents.filter(Port).toIterable)
            
            for (port : regionPortList) {
                if (port.type == "In" || port.type == "redOut" || port.type == "Sel") {
                    regionPortList.forEach [ pport |
                        if ((pport.type == "redIn" || pport.type == "Out") && port.name == pport.name) {
                            val link = CircuitFactory::eINSTANCE.createLink
                            link.source = pport;
                            link.target = port;
                            region.innerLinks += link
                            
                        }

                    ]
                }
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
                    if ((ip.type == "InConnectorLogic") && p.name == ip.name) {
                        val link = CircuitFactory::eINSTANCE.createLink
                        link.source = p;
                        link.target = ip
                        circuit.innerLinks += link
                    } else if ((ip.type == "InConnectorLogic") && p.name == "g0" && ip.name == "_GO") {
                        val link = CircuitFactory::eINSTANCE.createLink
                        link.source = p;
                        link.target = ip
                        circuit.innerLinks += link
                    }
                ]
            }

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
            if (p.type == "InConnectorInit") {
                ports.forEach [ op |
                    if ((op.type == "Out") && p.name == op.name) {
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
