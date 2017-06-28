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

/**
 * Show on-the-fly info about the model being edited.
 * 
 * @author stu121235
 *
 */
class Visualizer {
    
    @Inject extension RailSLExtensions
    
    def void assembleModel(Program program) {
        val pool = new DataPool()
        
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
            default: throw new UnsupportedOperationException("Missing Statement type: " + statement.class)
            
        }
        
    }
    
    def addLightValues(Model model, LightStatement statement) {
        for (index : statement.lights) {
            // TODO correct syntax for lights from SVG
            model.addVariable(new Variable("", index))
        }
    }
    
    def addPointValues(Model model, SetPointStatement statement) {
        val setting = statement.parsePointSetting
        for (index : statement.points) {
            // TODO correct syntax for points from SVG
            model.addVariable(new Variable("", setting))
        }
    }
    
    def addTrackValues(Model model, SetTrackStatement statement) {
        val speed = statement.parseSpeed
        val direction = statement.parseDirection
        for (segment : statement.segments) {
            // TODO correct syntax for tracks from SVG
            // Also for signals.
            model.addVariable(new Variable("", speed))
            model.addVariable(new Variable("", direction))
        }
        
    }

    
    
    
}