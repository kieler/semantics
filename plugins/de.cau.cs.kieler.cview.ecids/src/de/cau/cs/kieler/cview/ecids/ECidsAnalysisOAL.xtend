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
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import de.cau.cs.kieler.cview.hooks.IAnalysisHook
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import java.util.List
import java.util.HashMap

/**
 * A very simple and brute-force implementation of analyzing OAL_MsgSendViaName and
 * defined Tasks just serving as a primitive example. 
 * 
 * @author cmot
 * 
 */
class ECidsAnalysisOAL implements IAnalysisHook {

    @Inject extension CViewModelExtensions
    @Inject extension CViewAnalysisExtensions

    override getName() {
        return "eCIDS OAL Analysis";
    }

    override getId() {
        return "de.cau.cs.kieler.cview.ecids.OalAnalysis";
    }
    
    def boolean seemsValid(String parsedValue) {
        return (parsedValue.length < 200 && !parsedValue.contains("\n"))
    }
    
    HashMap<String, Component> taskNames2Component = new HashMap

    override List<Connection> createConnections(Component component, CViewModel model) {
        val List<Connection> returnList = newArrayList()
        if (component.isFile) {
            val rawDataWithoutComments = component.rawdata.removeCommentsAll
            val receiverTaskNames = rawDataWithoutComments.parseByKey("OAL_MsgSendViaName\\(", ",", null, true);
            for (receiverTaskName : receiverTaskNames) {
                if (receiverTaskName.seemsValid) {
                    val receiverComponent = taskNames2Component.get(receiverTaskName)
                    if (receiverComponent != null) {
                        val connection = component.connectTo(receiverComponent)
                        connection.color = "blue"
                        connection.label = receiverComponent.name
                        returnList.add(connection)
                    }
                }
            }
        }
        return returnList
    }

    override initialize(CViewModel model) {
        taskNames2Component.clear
        for (component : model.components) {
            if (component.isFile) {
                val rawDataWithoutComments = component.rawdata.removeCommentsAll
                val taskNames = rawDataWithoutComments.parseByKey("OAL_TaskSpawn\\(", ",", null, true);
                for (taskName : taskNames) {
                    if (taskName.seemsValid) {
                        taskNames2Component.put(taskName, component)
                    }
                }
            }
        }
    }

    override wrapup(CViewModel model) {
    }
}
