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
package de.cau.cs.kieler.railsl

import de.cau.cs.kieler.railSL.Program
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.railSL.Block
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.railSL.Statement
import de.cau.cs.kieler.railSL.SetTrackStatement
import com.google.inject.Inject
import de.cau.cs.kieler.railSL.SetPointStatement
import de.cau.cs.kieler.railSL.LightStatement
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.railsl.extensions.RailSLExtensions
import org.eclipse.ui.PlatformUI

// TODO this import doesn't work as the view is not exported
// import de.cau.cs.kieler.kvis.ui.views.KVisView

/**
 * Show on-the-fly info about the model being edited.
 * 
 * @author stu121235
 *
 */
class Visualizer {
    
    @Inject extension RailSLExtensions
    
    private val pool = new DataPool()
    
    public def Visualizer() {
        // TODO initialize pool in a meaningful way
    }
    
    public def DataPool getDataPool() {
        return pool
    } 
    
    public def void updateView() {
        val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        // val view = page.findView(KVisView.ID);
        
        val view = page.findView("de.cau.cs.kieler.simulation.ui.dataPoolView") //as KVisView
        
        // view.update(pool)
    } 
    
    public def void assembleModel(Program program) {
        
        for (block : program.blocks) {
            pool.addModel(assembleBlock(block))
        }
        
    }
    
    def Model assembleBlock(Block block) {
        val model = new Model()
        for (statement : block.statements) {
            model.addValues(statement)
        }
        return model
    }
    
    def addValues(Model model, Statement statement) {
        switch (statement) {
            
            SetTrackStatement: model.addTrackValues(statement as SetTrackStatement)
            SetPointStatement: model.addPointValues(statement as SetPointStatement)
            LightStatement: model.addLightValues(statement as LightStatement)
            default: return
            
        }
        
    }
    
    def addLightValues(Model model, LightStatement statement) {
        for (index : statement.lights) {
            model.addVariable(new Variable("light_" + index, statement.state))
        }
    }
    
    def addPointValues(Model model, SetPointStatement statement) {
        for (index : statement.points) {
            model.addVariable(new Variable("point_" + index, statement.orientation))
        }
    }
    
    def addTrackValues(Model model, SetTrackStatement statement) {
        val direction = statement.parseDirection
        val speed = statement.parseSpeed
        for (segment : statement.segments) {
            model.addVariable(new Variable(segment, speed))
            model.addVariable(new Variable(segment + "_direction", direction))
            model.addVariable(new Variable("S0_" + segment, "RED"))
        }
        
    }

}