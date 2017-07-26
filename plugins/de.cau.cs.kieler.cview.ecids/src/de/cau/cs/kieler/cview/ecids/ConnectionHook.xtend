/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.ecids

import de.cau.cs.kieler.cview.hooks.AbstractConnectionHook
import de.cau.cs.kieler.cview.hooks.IConnectionHook
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import java.util.List
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.cview.model.cViewModel.ComponentType
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.ArrayList
import java.util.HashSet

/**
 * @author cmot
 * 
 */
class ConnectionHook extends AbstractConnectionHook implements IConnectionHook {

    @Inject extension CViewModelExtensions

    val HashMap<String, Set<Component>> readers = new HashMap

    def appendReader(String msgId, Component readerComponent) {
        if (!readers.containsKey(msgId)) {
            readers.put(msgId, new HashSet())
        }
        readers.get(msgId).add(readerComponent)
    }

    override createConnections(Component component, CViewModel model) {
        val List<Connection> returnList = newArrayList()
        if (component.isFile) {
            if (component.rawdata != null) {
                val sendings = component.rawdata.split("OAL_MsgSendViaName\\(");
                for (sending : sendings) {
                    val iReceiver = sending.indexOf(",")
                    var String receiver = null
                    var String msgId = null
                    if (iReceiver > -1) {
                        val iMsgId = sending.indexOf(",", iReceiver + 1)
                        if (iMsgId > -1) {
                            msgId = sending.substring(iReceiver + 1, iMsgId).trim
                            receiver = sending.substring(0, iReceiver).trim
                            if (msgId.length < 150) {
                                println("Send '" + msgId + "' to '" + receiver + "'");
                                val recvComponents = readers.get(msgId);
                                if (recvComponents != null) {
                                    for (recvComponent : recvComponents) {
                                        val connection = component.connectTo(recvComponent)
                                        connection.label = msgId
                                        connection.tooltip = "<<< " + msgId + " >>>\n\nfrom " + component.name + " to " + recvComponent.name
                                        returnList.add(connection)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return returnList
    }

    override initialize(CViewModel model) {
        readers.clear
        for (function : model.components.filter[e|e.isFunc && e.name.endsWith("RecvTask")]) {
            var rawData = function.parent.rawdata;
            val i = rawData.indexOf(function.name + "(")
            if (i > 0) {
                rawData = rawData.substring(i)
                val msgs = rawData.split("case OAL_");
                for (msg : msgs) {
                    val j = msg.indexOf(':')
                    if (j > -1) {
                        val msgId = "OAL_" + msg.substring(0, j).trim
                        if (msgId.length < 150) {
                            msgId.appendReader(function)
                        }
                    }
                }
            }
        }
    }

    override wrapup(CViewModel model) {
        // throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

}
