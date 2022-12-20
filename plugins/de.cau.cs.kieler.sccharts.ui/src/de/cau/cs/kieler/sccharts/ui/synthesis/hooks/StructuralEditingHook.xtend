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

import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditMsg
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.DeleteAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddHirachicalNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddSuccessorNodeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameEdgeAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeIOAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddConcurrentRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeDestinationAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeSourceAction
import java.util.List
import java.lang.reflect.Field
import de.cau.cs.kieler.sccharts.Scope

//import java.lang.reflect.Field

@ViewSynthesisShared
class StructuralEditingHook extends SynthesisHook {
    // label mit registrieren (das im contextmenu eingetragen werden)
    // später auch textfelder einbauen die dann gefüllt werden müssen (bsp. für nächsten state)
    
    
    override finish(Scope scope, KNode node){
        val StructuredEditMsg delete = new StructuredEditMsg("Delete Node", DeleteAction.KIND, true, this.getNameArr(DeleteAction.fields))
        val StructuredEditMsg rename = new StructuredEditMsg("Rename Node", RenameNodeAction.KIND, false, this.getNameArr(RenameNodeAction.fields))
        val StructuredEditMsg successor = new StructuredEditMsg("Add Successor Node", AddSuccessorNodeAction.KIND, false, this.getNameArr(AddSuccessorNodeAction.fields))
        val StructuredEditMsg hirachical = new StructuredEditMsg("Add Hirachical Node", AddHirachicalNodeAction.KIND, false, this.getNameArr(AddHirachicalNodeAction.fields))
        
        val StructuredEditMsg[] arr = #[rename, successor, hirachical, delete]
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, arr)
    }
    
    override processState(State state, KNode node){
        val StructuredEditMsg delete = new StructuredEditMsg("Delete Node", DeleteAction.KIND, true, this.getNameArr(DeleteAction.fields))
        val StructuredEditMsg rename = new StructuredEditMsg("Rename Node", RenameNodeAction.KIND, false, this.getNameArr(RenameNodeAction.fields))
        val StructuredEditMsg successor = new StructuredEditMsg("Add Successor Node", AddSuccessorNodeAction.KIND, false, this.getNameArr(AddSuccessorNodeAction.fields))
        val StructuredEditMsg hirachical = new StructuredEditMsg("Add Hirachical Node", AddHirachicalNodeAction.KIND, false, this.getNameArr(AddHirachicalNodeAction.fields))
        
        val StructuredEditMsg[] arr = #[rename, successor, hirachical, delete]
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, arr)
    }
    
    override processTransition(Transition transition, KEdge edge) {
        val StructuredEditMsg delete = new StructuredEditMsg("Delete Edge", DeleteAction.KIND, true, this.getNameArr(DeleteAction.fields))
        val StructuredEditMsg changeDest = new StructuredEditMsg("New Destination", ChangeDestinationAction.KIND, false, this.getNameArr(ChangeDestinationAction.fields))
        val StructuredEditMsg changeSource = new StructuredEditMsg("New Source", ChangeSourceAction.KIND, false, this.getNameArr(ChangeSourceAction.fields))
        val StructuredEditMsg changeIO = new StructuredEditMsg("Change Input/Output", ChangeIOAction.KIND, false, this.getNameArr(ChangeIOAction.fields))
        val StructuredEditMsg rename = new StructuredEditMsg("Rename Edge", RenameEdgeAction.KIND, false, this.getNameArr(RenameEdgeAction.fields))
        
        val StructuredEditMsg[] arr = #[rename, changeDest, changeSource, changeIO, delete]
        edge.setProperty(KlighdProperties.STRUCTURED_EDITING, arr)
    }
    
    override processRegion(Region region, KNode node) {              
        val StructuredEditMsg delete = new StructuredEditMsg("Delete Region", DeleteAction.KIND, true, this.getNameArr(DeleteAction.fields))
        val StructuredEditMsg concurrentRegion = new StructuredEditMsg("Add Concurrent Region", AddConcurrentRegionAction.KIND, false, this.getNameArr(AddConcurrentRegionAction.fields))
        val StructuredEditMsg rename = new StructuredEditMsg("Rename Region", RenameRegionAction.KIND, false, this.getNameArr(RenameRegionAction.fields))
        
        val StructuredEditMsg[] arr = #[rename, concurrentRegion, delete]
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, arr)
    }
    
    def String[] getNameArr(Field[] fields){
        var List<String> list = newArrayList
        for(f: fields){
            if(f.name != "KIND" && f.name != "mergable"){
                list.add(f.name)    
            }
        }
        return list.toArray(newArrayOfSize(list.length))
        
    }
    
}    