/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.core.resources.IProject

/**
 * SCT Generator interface for generator extensions
 * When creating new models, each event of creation 
 * (Declaration, State, Region, Transition, Expression, 
 * including the model itself at the end of the generation process)
 * can be hooked to add own features in customized extensions.  
 * 
 * @author ssm
 * @kieler.rating 2016-06-10 yellow KI-125 als
 */
interface ISCTGeneratorExtension extends ISCTGeneratorPropertyHolder {
    /**
     * {@code onDeclarationCreate} is called when a new declaration is created.
     * 
     * @param declaration is the newly created declaration.
     * @returns void
     */
    def void onDeclarationCreate(Declaration declaration)
    
    
    /**
     * {@code onStateCreate} is called when a new state is created.
     * 
     * @param state is the newly created state.
     * @returns void
     */
    def void onStateCreate(State state)
    
    /**
     * {@code onRegionCreate} is called when a new region is created.
     * 
     * @param region is the newly created region.
     * @returns void
     */
    def void onRegionCreate(Region region)
    
    /**
     * {@code onTransitionCreate} is called when a new transition is created.
     * 
     * @param transition is the newly created transition.
     * @returns void
     */
    def void onTransitionCreate(Transition transition)
    
    /**
     * {@code onExpressionCreate} is called when a new expression is created.
     * 
     * @param expression is the newly created expression.
     * @returns void
     */
    def void onExpressionCreate(Expression expression)
    
    /**
     * {@code onModelCreate} is called when a new model was created and before it will be saved.
     * Here, you can hook in functions that perform actions on the whole model.
     * 
     * @param rootState is the root state of the newly created model..
     * @returns void
     */
    def void onModelCreate(State rootState)
    
    def void onSaveModel(State rootState, IProject project)
}