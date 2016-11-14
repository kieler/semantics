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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ChanceMax
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ModelGenerator
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import org.eclipse.core.resources.IProject
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static extension de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ModelGenerator.*

/**
 * @author ssm
 *
 */
class ActionExtension implements ISCTGeneratorExtension {
    
    @Inject extension SCChartsExtension
    @Inject extension SCTGenerator
    @Inject extension ModelGenerator
    
    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_ENTRY_ACTION = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForEntryAction",
            new ChanceMax<Double, Integer>("Chance for Entry Action", 0.0d, 3)
        )    

    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_DURING_ACTION = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForEntryAction",
            new ChanceMax<Double, Integer>("Chance for During Action", 0.0d, 3)
        )    

    public static val IProperty<ChanceMax<Double, Integer>> CHANCE_FOR_EXIT_ACTION = 
        new Property<ChanceMax<Double, Integer>>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForEntryAction",
            new ChanceMax<Double, Integer>("Chance for Exit Action", 0.0d, 3)
        )    

    
    override onDeclarationCreate(Declaration declaration) {
    }
    
    override onStateCreate(State state) {
        if (state.isSuperstate) {
            var actionCount = CHANCE_FOR_ENTRY_ACTION.random
            for(var i = 0; i < actionCount; i++) {
                SCChartsFactory.eINSTANCE.createEntryAction => [
                    trigger = createTriggerExpression(state.getRootState.declarations.filter[input].head, 1)
                    effects += createAssignmentEffect(state.getRootState.declarations.filter[output].head)
                    state.localActions += it
                ]
            }
            actionCount = CHANCE_FOR_DURING_ACTION.random
            for(var i = 0; i < actionCount; i++) {
                SCChartsFactory.eINSTANCE.createDuringAction => [
                    trigger = createTriggerExpression(state.getRootState.declarations.filter[input].head, 1)
                    effects += createAssignmentEffect(state.getRootState.declarations.filter[output].head)
                    state.localActions += it
                ]
            }
            actionCount = CHANCE_FOR_EXIT_ACTION.random
            for(var i = 0; i < actionCount; i++) {
                SCChartsFactory.eINSTANCE.createExitAction => [
                    trigger = createTriggerExpression(state.getRootState.declarations.filter[input].head, 1)
                    effects += createAssignmentEffect(state.getRootState.declarations.filter[output].head)
                    state.localActions += it
                ]
            }
        }
    }
    
    override onRegionCreate(Region region) {
    }
    
    override onTransitionCreate(Transition transition) {
    }
    
    override onExpressionCreate(Expression expression) {
    }
    
    override onModelCreate(State rootState) {
    }
    
    override getCategory() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }
    
    override getProperties() {
        <IProperty<?>> newArrayList(
            CHANCE_FOR_ENTRY_ACTION,
            CHANCE_FOR_DURING_ACTION,
            CHANCE_FOR_EXIT_ACTION
        )
    }
    
    override onSaveModel(State rootState, IProject project) {
        // Do nothing.
    }
    
}