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
package de.cau.cs.kieler.kvis.animations

import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class AnimationHandler {
    abstract public def String getName()
    abstract public def void apply(DataPool pool)
    
    @Accessors
    private var String svgElementId
    @Accessors
    private var Animation animation
    
    public new(String svgElementId, Animation animation) {
        this.svgElementId = svgElementId
        this.animation = animation
    }
    
    protected def Object getVariableValue(DataPool pool) {
        val variableReference = animation.variable
        val modelName = variableReference.model?.name
        val variableName = variableReference?.name
        if(variableName != null) {
            val variable = pool.getVariable(modelName, variableName);
            if(variable.value instanceof NDimensionalArray) {
                val array = variable.value as NDimensionalArray
                return array.get(variableReference.indices)
            } else {
                return variable.value
            }
        }
        return null
    }
}