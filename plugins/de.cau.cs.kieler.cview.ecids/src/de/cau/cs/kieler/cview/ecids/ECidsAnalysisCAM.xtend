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

import com.google.inject.Inject
import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.hooks.AbstractAnalysisHook
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.util.HashMap
import java.util.List
import java.util.HashSet
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions

/**
 * @author cmot
 * 
 */
class ECidsAnalysisCAM extends AbstractAnalysisHook implements IAnalysisHook {

    @Inject extension CViewModelExtensions

    @Inject extension CViewAnalysisExtensions

    HashMap<String, Component> definedCAMStructs = new HashMap

    HashSet<Component> CAMHeaderFiles = new HashSet

    override createConnections(Component component, CViewModel model) {
        val List<Connection> returnList = newArrayList()
        if (component.isFile) {
            if (component.rawdata != null) {
                for (struct : definedCAMStructs.keySet) {
                    if (component.rawdata.removeCommentsAll.contains(struct)) {
                        val otherComponent = definedCAMStructs.get(struct)
                        if (component != otherComponent) {
                            val connection = otherComponent.connectTo(component)
                            connection.label = struct
                            returnList.add(connection)

                            if (component.name.endsWith(".h")) {
                                CAMHeaderFiles.add(component)
                            }
                        }
                    }
                }
            }
        }
        return returnList
    }

    override initialize(CViewModel model) {
        CViewPlugin.clearConosle
//        val camFiles = model.components.filter[e|e.parent != null && e.parent.name.equals("CAM")].toList
//        for (camFile : camFiles) {
//            CViewPlugin.printlnConsole(camFile.name);
//            val camStructs = camFile.rawdata.removeCommentsAll.parseByKey("typedef struct", "{", #["\\n"], true)
//            for (camStruct : camStructs) {
//                definedCAMStructs.put(camStruct, camFile)
//                CViewPlugin.printlnConsole("  - " + camStruct);
//            }
//        }
        definedCAMStructs.clear

        val camFiles = model.components.filter[e|e.parent != null && e.parent.name.equals("CAM")].toList
        for (camFile : camFiles) {
            CViewPlugin.printlnConsole(camFile.name);
            val camStructs = camFile.rawdata.removeCommentsAll.parseByKey("typedef struct", "{", #["\\n"], true)
            for (camStruct : camStructs) {
                definedCAMStructs.put(camStruct, camFile)
                CViewPlugin.printlnConsole("  - " + camStruct);
            }
        }


    }

    override wrapup(CViewModel model) {
//        for (component : model.components) {
//            if (!component.hasParent("Include")) {
//                if (component.rawdata != null) {
//                    val includes = component.rawdata.parseByKey("#include", ".h", null, false);
//                    if (!includes.nullOrEmpty) {
//                        for (camHeaderFile : CAMHeaderFiles) {
//                            val name = camHeaderFile.name.replace(".h", "").trim
//                            var found = false
//                            for (include : includes) {
//                                if (!found && include.endsWith(name)) {
//                                    found = true
//                                    val connection = camHeaderFile.connectTo(component)
//                                    connection.color = "Blue"
//                                    model.connections.add(connection)
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
    }

    override getName() {
        return "eCIDS CAM Usage";
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids.cam";
    }
}




//
//
//
//
//
//                    // ".*#include\\s*(\\<|\\\")bla\\.c(\\>|\\\").*"
////                            if (component.rawdata.matches(regExp)) {
//                        if (component.rawdata.contains(name)) {
//                            val regExp = ".*#include\\s*(\\<|\\\")" + name.replace(".", "\\.") + "(\\>|\\\").*";
//                            if (component.rawdata.matches(regExp)) {
//                            }
//                            //println(component.name + " MATCHES " + regExp);
//                        }
////                        }
//                    }
//                }

//
//
//
//
//
//       val name = "huhu.c"
////       val regExp = ".*#include\\s*(\\<|\\\")" + name.replace(".", "\\.") + "(\\>|\\\")";
//       val regExp = ".*#include\\s*(\\<|\\\")" + name.replace(".", "\\.") + "(\\>|\\\").*";
//
//       if ("huhu#include <huhu.c>blabla".matches(regExp)) {
//           println("MATCHES " + regExp);
//       } else {
//           println("NOT MATCHES " + regExp);
//       }
