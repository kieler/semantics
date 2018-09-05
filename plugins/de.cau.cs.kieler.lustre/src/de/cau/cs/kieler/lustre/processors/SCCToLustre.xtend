/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.LustreFactory
import de.cau.cs.kieler.lustre.lustre.impl.LustreFactoryImpl
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.lustre.lustre.Node_Declaration
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
class SCCToLustre extends Processor<SCCharts, LustreProgram> {
    
    static extension LustreFactory lustre = new LustreFactoryImpl
    extension ExpressionConverter expConv = new ExpressionConverter
    
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KEffectsExtensions
    
    override getId() {
        "de.cau.cs.kieler.lustre.processors.SCCToLustre"
    }
    
    override getName() {
        "Lustre"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val model = getModel
        expConv.variableMapping.clear
        
        val program = createLustreProgram
        
        for (subModel : model.rootStates.filter[ regions.head instanceof ControlflowRegion ].toList) {
            subModel.processSuperState(model, program)
        }
        
        setModel(program)
    }
    
    def processSuperState(State state, SCCharts scc, LustreProgram program) {
        val cfr = state.regions.filter(ControlflowRegion).head
         
        val node = createNode_Declaration => [
            name = state.name
        ]
        
        for (input : state.variableDeclarations.filter[ input ].map[ valuedObjects ].flatten) {
            val newVar = createVariable_Declaration => [
                name = input.name
                type = createType => [
                    name = "bool"
                ]
            ]
            
            expConv.variableMapping.put(input, newVar)            
            node.parameters += newVar
        }

        for (output : state.variableDeclarations.filter[ output ].map[ valuedObjects ].flatten) {
            val newVar = createVariable_Declaration => [
                name = output.name
                type = createType => [
                    name = "bool"
                ]
            ]
            
            expConv.variableMapping.put(output, newVar)
            node.returned += newVar
        }


        val initial = cfr.states.filter[ initial ].head
        
        if (initial.outgoingTransitions.size == 1) {
            initial.processAssignment(node)
        } else if (initial.outgoingTransitions.size == 2) {
            initial.processConditional(node) 
        }
            
        program.nodes += node
    }
    
    protected def processAssignment(State state, Node_Declaration node) {
        val t = state.outgoingTransitions.head
        val a = t.effects.head as Assignment
        
        node.equations += createEquation => [
            left = a.valuedObject.getVar
            right = a.expression.convertExpression
        ]
    }
    
    protected def processConditional(State state, Node_Declaration node) {
        val tThen = state.outgoingTransitions.head
        val tElse = state.outgoingTransitions.get(1)
        val aThen = tThen.effects.head as Assignment
        val aElse = tElse.effects.head as Assignment
        
        val asgn = aThen.valuedObject
        // TODO: check if asgn is the same for both tansitions
        
        node.equations += createEquation => [
            left = asgn.getVar
            right = createConditional(tThen.trigger, aThen.expression, aElse.expression)
        ]
    }
    
}
