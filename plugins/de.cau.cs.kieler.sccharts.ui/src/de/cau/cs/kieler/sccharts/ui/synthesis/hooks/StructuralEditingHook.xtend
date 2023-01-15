/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditMsg
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditOptions
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.DeleteAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddHirachicalNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddSuccessorNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeIOAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddConcurrentRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeDestinationAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeSourceAction
import de.cau.cs.kieler.sccharts.Scope
import java.util.HashMap
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToAbortingEdgeAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToTerminationgEdgeAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToWeakEdgeAction

//import java.lang.reflect.Field

@ViewSynthesisShared
class StructuralEditingHook extends SynthesisHook {
    
    override finish(Scope scope, KNode node){
        val map = new HashMap()
        
        val StructuredEditMsg delete = new StructuredEditMsg("Delete Node", DeleteAction.KIND, true, DeleteAction.getInputs())
        val StructuredEditMsg rename = new StructuredEditMsg("Rename Node", RenameNodeAction.KIND, false, RenameNodeAction.getInputs())
        val StructuredEditMsg successor = new StructuredEditMsg("Add Successor Node", AddSuccessorNodeAction.KIND, false, AddSuccessorNodeAction.getInputs())
        val StructuredEditMsg hirachical = new StructuredEditMsg("Add Hirachical Node", AddHirachicalNodeAction.KIND, false, AddHirachicalNodeAction.getInputs())
        
        map.put("simpleState,hierarchicalState", #[rename, successor, hirachical, delete])
        
        val StructuredEditMsg deleteEdge = new StructuredEditMsg("Delete Edge", DeleteAction.KIND, true, DeleteAction.getInputs())
        val StructuredEditMsg changeDest = new StructuredEditMsg("New Destination", ChangeDestinationAction.KIND, false, ChangeDestinationAction.getInputs())
        val StructuredEditMsg changeSource = new StructuredEditMsg("New Source", ChangeSourceAction.KIND, false, ChangeSourceAction.getInputs())
        val StructuredEditMsg changeIO = new StructuredEditMsg("Change Input/Output", ChangeIOAction.KIND, false, ChangeIOAction.getInputs())
        val StructuredEditMsg changeToAbort = new StructuredEditMsg("Change To Aborting Edge", ChangeToAbortingEdgeAction.KIND, false, ChangeToAbortingEdgeAction.getInputs())       
        val StructuredEditMsg changeToTerminating = new StructuredEditMsg("Change To Terminating Edge", ChangeToTerminationgEdgeAction.KIND, false, ChangeToTerminationgEdgeAction.getInputs())       
        val StructuredEditMsg changeToWeak = new StructuredEditMsg("Change To Weak/Default Edge", ChangeToWeakEdgeAction.KIND, false, ChangeToWeakEdgeAction.getInputs())       
       
        map.put("transition", #[changeDest, changeSource, changeIO, deleteEdge, changeToAbort, changeToTerminating, changeToWeak])
        
                     
        val StructuredEditMsg deleteRegion = new StructuredEditMsg("Delete Region", DeleteAction.KIND, true, DeleteAction.getInputs())
        val StructuredEditMsg concurrentRegion = new StructuredEditMsg("Add Concurrent Region", AddConcurrentRegionAction.KIND, false, AddConcurrentRegionAction.getInputs())
        val StructuredEditMsg renameRegion = new StructuredEditMsg("Rename Region", RenameRegionAction.KIND, false, RenameRegionAction.getInputs())
        
        map.put("controlflowRegion,dataflowRegion", #[deleteRegion, concurrentRegion, renameRegion])
        
        val options = new StructuredEditOptions(map)
        
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, options)
    }
}    