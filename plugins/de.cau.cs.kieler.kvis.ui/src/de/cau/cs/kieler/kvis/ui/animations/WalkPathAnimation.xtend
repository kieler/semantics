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
import org.apache.batik.dom.svg.SVGOMPoint
import org.w3c.dom.Element
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
    var double angleOffset
    
    var double anchorX = 0.5
    var double anchorY = 0.5
    var double angleValue = 0
    var boolean appendTransform = false
    
    var String initialTransform
    var SVGPoint lastPoint
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        addAttributes("autoOrientation", "angleOffset", "forwardX", "forwardY", "anchorX",
                      "anchorY", "start", "end", "length", "appendTransform")
        val pathAttr = addAttribute("path")
        pathAttr.mandatory = true
    }
    
    override getName() {
        return "walkPath"
    }
    
    override doApply(DataPool pool, Element elem) {
        // Path and length
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
        // Orientation
        val newAutoOrientation = getAttribute("autoOrientation").boolValue
        if(newAutoOrientation != null) {
            autoOrientation = newAutoOrientation
        }
        val newAngleOffset = getAttribute("angleOffset").floatValue
        if(newAngleOffset != null) {
            angleOffset = newAngleOffset
        }
        // Anchor
        val newAnchorX = getAttribute("anchorX").floatValue
        if(newAnchorX != null) {
            anchorX = newAnchorX
        }
        val newAnchorY = getAttribute("anchorY").floatValue
        if(newAnchorY != null) {
            anchorY = newAnchorY
        }
        // Append
        val newAppendTransform = getAttribute("appendTransform").boolValue
        if(newAppendTransform != null) {
            appendTransform = newAppendTransform
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
        var wrappedValue = value
        // If value is below the path, bring it back to the range
        while(wrappedValue < pathStart) {
            // it holds length >= 0, because we check it above and throw an exception if not
            wrappedValue += length
        }
        // If the value is above the path, bring it back to the range
        while(wrappedValue > pathEnd) {
            // it holds length >= 0, because we check it above and throw an exception if not
            wrappedValue -= length
        }
        val scaledValue = scale(wrappedValue, pathStart, pathEnd, 0, totalPathLength)
        var pointOnPath = path.getPointAtLength(scaledValue.floatValue)
        val pathPos = path.getAbsoluteTranslation
        val currentPoint = new SVGOMPoint(pointOnPath.x + pathPos.x, pointOnPath.y + pathPos.y)
        if(currentPoint == null) {
            throw new IllegalArgumentException(name+" animation could not determine position on path "+path)
        }
        // Compute angle
        val delta = 1
        if (autoOrientation && scaledValue <= (totalPathLength - delta)) {
            // Calculate slope ("Steigung" bzw. "Ableitung") on path on current position
            val pointOnPathPlusDelta = path.getPointAtLength(scaledValue.floatValue + delta)
            angleValue = computeAngle(pointOnPath, pointOnPathPlusDelta);
            if(angleOffset != 0) {
                angleValue += angleOffset
            }
        } else if(autoOrientation && lastPoint != null){
            // Calculate rotation based on last position
            angleValue = computeAngle(currentPoint, lastPoint);
            if(angleOffset != 0) {
                angleValue += angleOffset
            }
        }
        lastPoint = currentPoint;
        
        if(elem instanceof SVGLocatable) {
            if(appendTransform) {
                if(initialTransform == null) {
                    initialTransform = elem.getAttribute("transform")
                }
            } else {
                initialTransform = ""    
            }
            // Position and size of the element
            val locatable = elem as SVGLocatable
            val box = locatable.BBox
            val parentTranslation = elem.parentNode.getAbsoluteTranslation
            val pos = new SVGOMPoint(box.x + parentTranslation.x, box.y + parentTranslation.y)
            val width = box.width
            val height = box.height
            // Anchor position in pixels
            var double pivotX = anchorX * width
            var double pivotY = anchorY * height
            
            val xValue = currentPoint.x - pos.x - pivotX
            val yValue = currentPoint.y - pos.y - pivotY
            var translate = "translate(" + xValue + "," + yValue + ")"
            if (autoOrientation) {
                translate += "rotate(" + angleValue + "," + (pos.x + pivotX) + "," + (pos.y + pivotY) + ")";
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
        // Edge cases
        if(deltaX == 0 && deltaY > 0) {
            // 90 degrees up
            return 90;
        } else if(deltaX == 0 && deltaY < 0) {
            // 90 degrees down
            return 270;
        } if(deltaX == 0 && deltaY == 0) {
             throw new IllegalArgumentException("Delta of points cannot be 0. Can't compute angle in "+name+" animation.")
        }
        alpha = Math.atan(deltaY / deltaX) * RADTODEG;

        if (deltaX > 0 && deltaY >= 0) {
            // values from 0..90 nothing to do change here
        } else if (deltaX < 0 && deltaY >= 0) {
            // mapping from -90..0 to 90..180
            alpha += 180
        } else if (deltaX < 0 && deltaY <= 0) {
            // mapping from 0..90 to 180..270
            alpha += 180
        } else if (deltaX > 0 && deltaY <= 0) {
            // mapping from -90..0 to 270..360
            alpha += 360
        }
        return alpha;
    }
    
    private def void print(Element elem, String attr) {
        println(attr+"="+elem.getAttribute(attr))
        if(elem.parentNode != null && elem.parentNode instanceof Element) {
            print(elem.parentNode as Element, attr)
        }
    }
}