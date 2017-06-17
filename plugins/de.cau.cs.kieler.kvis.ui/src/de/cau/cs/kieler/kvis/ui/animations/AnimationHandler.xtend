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
package de.cau.cs.kieler.kvis.ui.animations

import de.cau.cs.kieler.kvis.extensions.KVisExtensions
import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.kvis.kvis.AttributeMapping
import de.cau.cs.kieler.kvis.ui.svg.SVGExtensions
import de.cau.cs.kieler.kvis.ui.views.KVisView
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGDocument

/**
 * @author aas
 *
 */
abstract class AnimationHandler {
    protected var String svgElementId
    protected var Animation animation
    protected var Object variableValue
    
    abstract public def String getName()
    abstract protected def void doApply(DataPool pool)
    
    @Extension
    protected KVisExtensions kvisExtensions
    
    @Extension
    protected SVGExtensions svgExtensions
    
    public new(String svgElementId, Animation animation) {
        this.svgElementId = svgElementId
        this.animation = animation
        // Initialize extension methods
        kvisExtensions = new KVisExtensions
        svgExtensions = new SVGExtensions
    }
    
    public def void apply(DataPool pool) {
        variableValue = getVariableValue(pool)
        if(isActive(pool)) {
            doApply(pool)
        }
    }
    
    private def SVGDocument getSVGDocument() {
         return KVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
    
    protected def Element findElement(String id) {
        return SVGDocument.getElementById(id)
    }
    
    protected def Element findElement() {
        return SVGDocument.getElementById(svgElementId)
    }
    
    protected def Object getVariableValue(DataPool pool) {
        return getVariableValue(animation.variable, pool)
    }
    
    protected def Object getMappedValue(AttributeMapping attributeMapping, Object value) {
        if(attributeMapping == null) {
            return null
        }
        
        val literal = attributeMapping.literal
        if(literal != null) {
            return literal.primitiveValue
        } else {
            for(mapping : attributeMapping.mappings) {
                if(mapping.variableDomain.matches(value)) {
                    return mapping.apply(value)
//                } else {
//                    if(mapping.variableDomain.range != null) {
//                        System.err.println(value + " does not match with "
//                            + mapping.variableDomain.range.from.primitiveValue 
//                            + "-"
//                            + mapping.variableDomain.range.to.primitiveValue)
//                    } else {
//                        System.err.println(value + " does not match with "+ mapping.variableDomain.value.primitiveValue)
//                    } 
                }
            }
            return null
        }
    }
    
    protected def boolean isActive(DataPool pool) {
        if(animation.condition == null) {
            return true
        } else {
            return animation.condition.eval(pool)
        }
    }
}