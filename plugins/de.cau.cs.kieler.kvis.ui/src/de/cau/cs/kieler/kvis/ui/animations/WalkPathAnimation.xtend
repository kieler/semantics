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
    var double pathStart
    var double pathEnd
    var double pathLength
    var boolean autoOrientation
    var double anchorX = 0.5
    var double anchorY = 0.5
    var double angleValue = 0
    
    var String initialTransform
    var SVGPoint lastPoint
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        setAttributes("autoOrientation", "anchorX", "anchorY", "start", "end", "length")
        val pathAttr = addAttribute("path")
        pathAttr.mandatory = true
    }
    
    override getName() {
        return "walkPath"
    }
    
    override doApply(DataPool pool) {
        val elem = findElement(true)
        
        val newPathName = getAttribute("path").stringValue
        if(newPathName != null) {
            pathName = newPathName
        }
        val newPathStart = getAttribute("start").floatValue
        if(newPathStart != null) {
            pathStart = newPathStart
        }
        val newPathEnd = getAttribute("end").floatValue
        if(newPathEnd != null) {
            pathEnd = newPathEnd
        }
        val newPathLength = getAttribute("length").floatValue
        if(newPathLength != null) {
            pathLength = newPathLength
        }
        // Define pathEnd using the path length
        if(pathLength > 0 && pathEnd == 0) {
            pathEnd = pathStart + pathLength
        }
        val length = (pathEnd-pathStart)
        if(length <= 0) {
            throw new IllegalArgumentException("The length of the path in the "+name+" animation must be greater than 0.")
        }
        
        val newAutoOrientation = getAttribute("autoOrientation").boolValue
        if(newAutoOrientation != null) {
            autoOrientation = newAutoOrientation
        }
        val newAnchorX = getAttribute("anchorX").floatValue
        if(newAnchorX != null) {
            anchorX = newAnchorX
        }
        val newAnchorY = getAttribute("anchorY").floatValue
        if(newAnchorY != null) {
            anchorY = newAnchorY
        }
        
        // Calculate animation
        var SVGOMPathElement path
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
        // Compute position on path
        val totalPathLength = path.getTotalLength
        val value = variableValue.doubleValue
        // If the value is above the path, bring it back to the range
        var wrappedValue = value
        while(wrappedValue > pathEnd) {
            // it holds length >= 0, because we check it above and throw an exception if not
            wrappedValue = wrappedValue-length
        }
        val scaledValue = scale(wrappedValue, pathStart, pathEnd, 0, totalPathLength)
        var SVGPoint currentPoint = path.getPointAtLength(scaledValue.floatValue)
        // Compute angle
        val delta = 1
        if (autoOrientation && lastPoint != null && scaledValue <= (totalPathLength - delta)) {
            // Calculate slope ("Steigung" bzw. "Ableitung") on path on current position
            val currentPointPlusDelta = path.getPointAtLength(scaledValue.floatValue + delta)
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
        var double deltaX = 0
        var double deltaY = 0
        var double alpha = 0
        
        deltaX = p2.getX() - p1.getX();// Ankathete
        deltaY = p2.getY() - p1.getY();// Gegenkathete
        if(deltaX == 0) {
            return 0;
        }
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