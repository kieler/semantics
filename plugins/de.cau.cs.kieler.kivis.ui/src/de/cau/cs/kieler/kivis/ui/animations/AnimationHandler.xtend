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
package de.cau.cs.kieler.kivis.ui.animations

import de.cau.cs.kieler.kivis.extensions.KiVisExtensions
import de.cau.cs.kieler.kivis.kivis.Animation
import de.cau.cs.kieler.kivis.kivis.AttributeMapping
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions
import de.cau.cs.kieler.kivis.ui.views.KiVisView
import de.cau.cs.kieler.prom.build.AttributeExtensions
import de.cau.cs.kieler.prom.build.Configurable
import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import java.util.List
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGDocument
import de.cau.cs.kieler.kivis.animation.IAnimationHandler
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
abstract class AnimationHandler extends Configurable implements IAnimationHandler {
    
    public val recursive = new ConfigurableAttribute("recursive", false)
    
    @Accessors(PUBLIC_GETTER)
    protected var Variable variable
    protected var Object variableValue
    protected var String svgElementId
    protected var Animation animation
    protected var DataPool lastPool
    
    protected val List<ConfigurableAttribute> attributes = newArrayList
    
    abstract public def String getName()
    abstract protected def void doApply(DataPool pool, Element element)
    
    protected static extension AttributeExtensions attributeExtensions = new AttributeExtensions 
    protected static extension KiVisExtensions kivisExtensions = new KiVisExtensions
    protected static extension SVGExtensions svgExtensions = new SVGExtensions
    
    public new() {
    }
    
    public new(String svgElementId, Animation animation) {
        this()
        this.svgElementId = svgElementId
        this.animation = animation
    }
    
    /**
     * Initializes the attributes of this animation handler using Java reflection.
     * 
     * This method has to be called in the constructor of the highest class
     * to ensure that all fields are initialized
     * and because Java reflection includes the fields of superclasses.
     */
    protected def void initialize() {
        // Collect attributes via reflection
        attributes.clear
        for(f : class.fields) {
            if(f.type == typeof(ConfigurableAttribute)) {
                val attr = f.get(this) as ConfigurableAttribute
                if(attr != null) {
                    attributes.add(attr)
                }
            }
        }
    }
    
    public override apply(DataPool pool) {
        // Update the svg with the new pool
        variable = getVariable(animation.variable, pool)
        variableValue = getVariableValue(pool)
        if(isActive(pool)) {
            // Update attributes
            for(attributeMapping : animation.attributeMappings) {
                val attributeName = attributeMapping.attribute
                val attr = getAttribute(attributeName)
                if(attr != null) {
                    val newValue = getMappedValue(attributeMapping, variableValue)
                    if(newValue != null) {
                        attr.value = newValue    
                    }
                } else {
                    throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                                      + "Handled attributes are:\n"
                                      +  attributes.map[it.name].toList())
                }
            }
            // Check if all mandatory attributes have been set
            for(attr : attributes.filter[it.isMandatory]) {
                if(attr.value == null) {
                    throw new Exception("The attribute '" + attr.name+ "' "
                                      + "of the " + name + " animation must be set.")                                 
                }
            }
            // Apply
            val element = findElement(true)
            if(recursive == null || !recursive.boolValue) {
                // Don't apply this animation recursively
                doApply(pool, element)
            } else {
                // Apply this animation recursively to all child elements
                val elementAndChildren = element.getChildrenElements(true)
                for(elem : elementAndChildren) {
                    doApply(pool, elem)
                }
            }
        }
    }
    
    private def SVGDocument getSVGDocument() {
         return KiVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
    
    protected def Element findElement(String id) {
        return SVGDocument.getElementById(id)
    }
    
    protected def Element findElement() {
        return SVGDocument.getElementById(svgElementId)
    }
    
    protected def Element findElement(boolean mustExist) {
        val elem = findElement
        if(elem != null) {
            return elem
        } else {
            throw new IllegalArgumentException("SVG element '"+svgElementId+"' does not exist")
        }
    }
    
    protected def Object getVariableValue(DataPool pool) {
        return getVariableValue(animation.variable, pool, true)
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
    
    protected def ConfigurableAttribute getAttribute(String name) {
        return attributes.getAttribute(name)
    }
    
    protected def boolean isActive(DataPool pool) {
        if(animation.condition == null) {
            return true
        } else {
            return animation.condition.eval(pool)
        }
    }
}