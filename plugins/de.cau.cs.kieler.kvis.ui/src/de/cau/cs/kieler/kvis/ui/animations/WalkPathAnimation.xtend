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

import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.simulation.core.DataPool
import org.apache.batik.dom.svg.SVGOMPathElement
import org.w3c.dom.svg.SVGLocatable
import org.w3c.dom.svg.SVGPoint

/**
 * @author aas
 *
 */
class WalkPathAnimation extends AnimationHandler {
    var String pathName
    var boolean autoOrientation
    var double anchorX
    var double anchorY
    var double pathStart
    var double pathEnd
    var double pathLength
    
    var String initialTransform
    var SVGPoint lastPoint
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize()
    }
    
    private def void initialize() {
        // Read attribute values
        for(attributeMapping : animation.attributeMappings) {
            val literal = attributeMapping.literal
            val attributeName = attributeMapping.attribute
            switch(attributeName) {
                case "path" : pathName = literal.primitiveValue.toString
                case "autoOrientation" : autoOrientation = literal.primitiveValue as Boolean
                case "anchorX" : anchorX = literal.primitiveValue.doubleValue
                case "anchorY" : anchorY = literal.primitiveValue.doubleValue
                case "start" : pathStart = literal.primitiveValue.doubleValue
                case "end" : pathEnd = literal.primitiveValue.doubleValue
                case "length" : pathLength = literal.primitiveValue.doubleValue
                default: throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                    + "Handled attributes are:\n"
                    + "path, autoOrientation, anchorX, anchorY, start, end, length"
                )
            }
        }
        // Define pathEnd using the path length
        if(pathLength > 0 && pathEnd == 0) {
            pathEnd += pathStart + pathLength
        }
    }
    
    override getName() {
        return "walkPath"
    }
    
    override doApply(DataPool pool) {
        val elem = findElement()
        val value = variableValue as Double

        // Calculate animation
        var SVGOMPathElement path
        if(pathName.isNullOrEmpty){
            throw new Exception("Path animation must have a path id set.")
        } else {
            val pathElement = findElement(pathName)
            if(pathElement == null) {
                throw new Exception("Path with id '" + pathName + "' was not found in the svg.")
            } else {
                try {
                    path = pathElement as SVGOMPathElement
                } catch (Exception e) {
                    throw new Exception("Element with id '" + pathName + "' is not a valid path in the svg.")
                }
            }
        }
        // Compute position on path
        val totalPathLength = path.getTotalLength
        val scaledValue = scale(value, pathStart, pathEnd, 0, totalPathLength)
        var SVGPoint currentPoint = path.getPointAtLength(scaledValue.floatValue())
        // Compute angle
        var Double angleValue = 0d
        if (lastPoint != null) {
            // Calculate slope ("Steigung" bzw. "Ableitung") on path on current position
            val currentPointPlusDelta = path.getPointAtLength(scaledValue.floatValue()+1)
            angleValue = computeAngle(currentPoint, currentPointPlusDelta);
        }
        lastPoint = currentPoint;
        
        if(elem instanceof SVGLocatable) {
            if(initialTransform == null) {
                initialTransform = elem.getAttribute("transform");
            }
            // Position and size of the element
            val SVGLocatable locatable = elem as SVGLocatable
            val box = locatable.getBBox()
            val posX = box.x
            val posY = box.y
            val width = box.width
            val height = box.height
            // Anchor position in pixels
            var double pivotX = anchorX * width
            var double pivotY = anchorY * height
            val xValue = currentPoint.x - posX - pivotX
            val yValue = currentPoint.y - posY - pivotY

            var translate = "translate(" + xValue + "," + yValue + ")"
            if (angleValue != 0) {
                if (autoOrientation) {
                    translate += "rotate(" + angleValue + "," + (posX + pivotX) + "," + (posY + pivotY) + ")";
                } 
            }
            val newTransform = initialTransform + translate
            elem.setAttribute("transform", newTransform)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
    
    private def double computeAngle(SVGPoint p1, SVGPoint p2) {
        val double RADTODEG = 180.0 / Math.PI;
        var double deltaX
        var double deltaY
        var double alpha

        deltaX = p2.getX() - p1.getX();// Ankathete
        deltaY = p2.getY() - p1.getY();// Gegenkathete

        alpha = Math.atan(deltaY / deltaX) * RADTODEG;

        if (deltaX > 0 && deltaY <= 0) {
            // values from 0 - -90 nothing to do change here
        } else if (deltaX <= 0 && deltaY <= 0) {
            // mapping from 90 - 0 to -90 - -180
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX <= 0 && deltaY > 0) {
            // mapping from 0 - 90 to -180 - -270
            alpha = 180 - alpha;
            alpha *= -1;
        } else if (deltaX > 0 && deltaY > 0) {
            // mapping from 90 - 0 to -90 - -180
            alpha = 360 - alpha;
            alpha *= -1;
        }
        return alpha;
    }
}