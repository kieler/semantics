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
package de.cau.cs.kieler.lustre.processors.lustreToScc

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * @author lgr
 *
 */
abstract class AbstractLustreToSCC extends Processor<LustreProgram, SCCharts> {

    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    @Inject extension LustreCreateExtension
    
    protected HashMap<ValuedObject, ValuedObject> lustreToScchartsValuedObjectMap = new HashMap
    
    override process() {
        model = model.transform
    }
    
    def SCCharts transform(LustreProgram p) {
        lustreToScchartsValuedObjectMap.clear
        var scchartsProgram = createSCCharts
        
        val rootState = createState => [
            // TODO: naming or stuff?
        ]
        
        // TODO: Includes and PackList
        p.packBody.processPackBody(rootState)
        
        scchartsProgram.rootStates += rootState
        scchartsProgram
    }
    
    protected def processPackBody(PackBody packBody, State rootState) {
        // Constants
        for(constant : packBody.constants) {
            constant.processConstantDeclaration(rootState)
        }
        
        // Nodes        
        for (node : packBody.nodes) {
            if (node instanceof NodeDeclaration) {
                node.processNodeDeclaration(rootState)
            }
        }
        
        // TODO: TypeDeclarations and ExternalNodeDeclarations
    }    
    
    protected def processConstantDeclaration(VariableDeclaration variableDeclaration, State rootState) {
        val constantVariableDeclaration = variableDeclaration.createConstantDeclarationFromLustre(lustreToScchartsValuedObjectMap)
        rootState.declarations += constantVariableDeclaration
    }
        
    protected def processNodeDeclaration(NodeDeclaration node, State rootState) {
        val nodeState = createState => [
            name = node.valuedObjects.head.name
        ]
        
        // Process inputs
        for (inputDecl : node.input.parameter) {
            nodeState.declarations += inputDecl.createInputDeclarationFromLustre(lustreToScchartsValuedObjectMap)
        }

        // Process outputs
        for (outputDecl : node.output.parameter) {
            nodeState.declarations += outputDecl.createOutputDeclarationFromLustre(lustreToScchartsValuedObjectMap)
        }

        // Process constants
        for (constVariable : node.constants) {
            nodeState.declarations += constVariable.createConstantDeclarationFromLustre(lustreToScchartsValuedObjectMap)
        }

        // Process variables
        for (variable : node.variables) {
            nodeState.declarations += variable.createVariableDeclarationFromLustreClockedVariableDeclaration(lustreToScchartsValuedObjectMap)
        }

        // Transform equations
        for (equation : node.equations) {
            equation.processEquation(nodeState)
        }

        // Transform automatons
        for (automaton : node.automatons) {
            automaton.processAutomaton(nodeState)
        }

        // Transform assertions
        for (assertion : node.assertions) {
            assertion.processAssertion(nodeState)   
        }
        
        
        
        // Add the state representing the NodeDeclaration to the rootScchartsObject
        rootState.regions += createControlflowRegion => [
            states += nodeState
        ]
    }
    
    abstract def void processEquation(Assignment equation, State state);
    abstract def void processAutomaton(Automaton automaton, State state);
    abstract def void processAssertion(Expression assertion, State state);
       
}