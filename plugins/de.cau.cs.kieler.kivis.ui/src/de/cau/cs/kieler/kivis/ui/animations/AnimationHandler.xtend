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

import de.cau.cs.kieler.kivis.animation.IAnimationHandler
import de.cau.cs.kieler.kivis.extensions.KiVisExtensions
import de.cau.cs.kieler.kivis.kivis.Animation
import de.cau.cs.kieler.kivis.kivis.AttributeMapping
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions
import de.cau.cs.kieler.kivis.ui.views.KiVisView
import de.cau.cs.kieler.prom.configurable.AttributeExtensions
import de.cau.cs.kieler.prom.configurable.Configurable
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGDocument

/**
 * Base class for configurable animations of SVG elements.
 * 
 * @author aas
 *
 */
abstract class AnimationHandler extends Configurable implements IAnimationHandler {
    
    protected static extension AttributeExtensions attributeExtensions = new AttributeExtensions 
    protected static extension KiVisExtensions kivisExtensions = new KiVisExtensions
    protected static extension SVGExtensions svgExtensions = new SVGExtensions
    
    /**
     * If this attribute is true, the animation is also applied recursively to all child elements in the SVG document.
     */
    public val recursive = new ConfigurableAttribute("recursive", false)
    
    /**
     * The variable in the data pool that is used in this animation.
     */
    @Accessors(PUBLIC_GETTER)
    protected var Variable variable
    
    /**
     * The value of the variable that is used in this animation.
     */
    protected var Object variableValue
    
    /**
     * The id of the SVG element that should be animated.
     */
    protected var String svgElementId
    
    /**
     * The SVG element that should be animated.
     */
    protected var Element element
    
    /**
     * The configuration of this animation from the kivis grammar. 
     */
    protected var Animation animation
    
    /**
     * The configurable attributes of this instance.
     */
    protected var List<ConfigurableAttribute> attributes = newArrayList
    
    /**
     * Is the animation active for the current pool
     */
    protected var boolean isActive
    
    /**
     * The name of the animation.
     */
    abstract public def String getName()
    
    /**
     * Performs the actual animation of the SVG element to represent the state of the data pool.
     */
    abstract protected def void doApply(DataPool pool, Element element)
    
    /**
     * Constructor
     */
    public new() {
    }
    
    /**
     * Initializes this instance.
     * 
     * @param svgElementId The id of the SVG element that should be animated
     * @param animation The configuration of the animation from the grammar
     */
    public def void initialize(String svgElementId, Animation animation) {
        this.animation = animation
        this.svgElementId = svgElementId
        this.element = findElement(svgElementId)
        if(element == null) {
            throw new IllegalArgumentException("SVG element '"+svgElementId+"' does not exist")
        }
    }
    
    /**
     * Initializes the attributes of this animation handler using Java reflection.
     * 
     * This method has to be called in the constructor of the highest class
     * to ensure that all fields are initialized
     * and because Java reflection includes the fields of superclasses.
     */
    protected def void initializeAttributes() {
        // Collect attributes via reflection
        attributes = this.getConfigurableAttributes()
    }
    
    /**
     * Performs the animation for the given data pool.
     * 
     * @param pool The pool
     */
    public override apply(DataPool pool) {
        // Get the variable and variable value that is relevant for this animation
        variable = getVariable(animation.variable, pool)
        variableValue = getVariableValue(animation.variable, pool, true)
        // Check if this animation should be performed
        isActive = isActive(pool) 
        if(isActive) {
            // Update attribute values
            for(attributeMapping : animation.attributeMappings) {
                val attributeName = attributeMapping.attribute
                val attr = attributes.getAttribute(attributeName)
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

    /**
     * Maps the given value using the attribute mapping to the target value.
     * 
     * @param attributeMapping The mapping
     * @param value The source value for the mapping.
     * @return the mapped value
     */
    protected def Object getMappedValue(AttributeMapping attributeMapping, Object value) {
        val literal = attributeMapping.literal
        if(literal != null) {
            // If all values are mapped to a constant, return this constant value.
            return literal.primitiveValue
        } else {
            // Find a mapping where the input value matches the source domain
            // and return the new value from the target domain.
            for(mapping : attributeMapping.mappings) {
                if(mapping.variableDomain.matches(value)) {
                    return mapping.apply(value)
                }
            }
            return null
        }
    }
    
    /**
     * Checks if the animation is active in the given pool.
     * 
     * @param pool The pool
     * @return true if the animation should be performed for this data pool
     */
    protected def boolean isActive(DataPool pool) {
        // Without condition, the animation is always active,
        // otherwise evaluate the condition using the variables in the pool.
        if(animation.condition == null) {
            return true
        } else {
            return animation.condition.eval(pool)
        }
    }
    
    /**
     * Returns the SVG Document that is currently loaded in the KiVis View.
     * 
     * @return the SVG Document that is currently loaded in the KiVis View.
     */
    private def SVGDocument getSVGDocument() {
         return KiVisView.instance?.SVGDocument
    }
    
    /**
     * Searches the SVG document for an element with the given id.
     * 
     * @param id The id
     * @return the svg element with the matching id or null if there is none
     */
    protected def Element findElement(String id) {
        return SVGDocument.getElementById(id)
    }
}