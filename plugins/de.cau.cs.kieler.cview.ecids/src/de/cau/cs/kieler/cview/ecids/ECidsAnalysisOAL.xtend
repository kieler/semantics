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
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions

/**
 * @author cmot
 * 
 */
class ECidsAnalysisOAL implements IAnalysisHook {

    @Inject extension CViewModelExtensions

    @Inject extension CViewAnalysisExtensions

    val HashMap<String, Set<Component>> readers = new HashMap

    def appendReader(String msgId, Component readerComponent) {
        if (!readers.containsKey(msgId)) {
            readers.put(msgId, new HashSet())
        }
        readers.get(msgId).add(readerComponent)
    }

    override createConnections(Component component, CViewModel model) {
        val List<Connection> returnList = newArrayList()
        
//        if (component.isFile) {
//            if (component.rawdata != null) {
//                val rawNoComments = component.rawdata.removeCommentsAll
//                   val i = component.rawdata.indexOf("OAL_MsgSendViaName");
//                   
//                   if (i > -1) {
//                       ("i=" + i).printlnConsole
//                   }
//                   
//                   
//                   val sendings = rawNoComments.parseByKey("OAL_MsgSendViaName", ")", null, false)
//                   for (sending : sendings) {
//                       if (sending.startsWith("(") && sending.length < 150) {
//                           
//                           val sending2 = sending.substring(1)
//                           val i1 = sending2.indexOf(",");
//                           val i2 = sending2.indexOf(",", i1+1)
//                           
//                           if (i1 > -1 && i2  > i1) {
//                               val arg1 = sending2.substring(0, i1).trim()
//                               val arg2 = sending2.substring(i1+1, i2).trim()
//
//                               ("RECEIVER:" + arg1 + ", MSG_ID:" + arg2).printlnConsole
//                           } else {
//                              ("i1:" + i1 + ", i2:" + i2).printlnConsole
//                           }
//                           
//                       }
//                   }
//                
//                }
//            
//       }
        
        
// OLD        
        if (component.isFile) {
            if (component.rawdata != null) {
                val sendings = component.rawdata.removeCommentsAll.split("OAL_MsgSendViaName\\(");
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
                                ("# Send '" + msgId + "' to '" + receiver + "'").printlnConsole
                                val recvComponents = readers.get(msgId);
                                if (recvComponents != null) {
                                    for (recvComponent : recvComponents) {
                                        val connection = component.connectTo(recvComponent)
                                        connection.label = msgId
                                        connection.tooltip = "<<< " + msgId + " >>>\n\nfrom " + component.name +
                                            " to " + recvComponent.name
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

// OLD
        readers.clear
        for (function : model.components.filter[e|e.isFunc && e.name.endsWith("RecvTask")]) {
            var rawData = function.parent.rawdata;
            val i = rawData.removeCommentsAll.indexOf(function.name + "(")
            if (i > 0) {
                rawData = rawData.substring(i)
                val msgs = rawData.split("case OAL_");
                for (msg : msgs) {
                    val j = msg.indexOf(':')
                    if (j > -1) {
                        val msgId = "OAL_" + msg.substring(0, j).trim
                        if (msgId.length < 50) {
                            ("# Found MSGID: " + msgId).printlnConsole
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

    override getName() {
        return "eCIDS OAL Messages";
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids.oal";
    }
}
