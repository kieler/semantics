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
package de.cau.cs.kieler.sccharts.processors.obfuscator

import de.cau.cs.kieler.sccharts.processors.obfuscator.Obfuscator
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region

/**
 * @author stu114663
 *
 */
class CountingTypeObfuscator extends Obfuscator {
    
    var valOCounter = 1
    int minValONumSize = 0
    String valOPrefix = "Var"
    var stateCounter = 1
    int minStateNumSize = 0
    String statePrefix = "State"
    var regionCounter = 1
    int minRegionNumSize = 0
    String regionPrefix = "Region"
    
    boolean leadingZeroes = true
    
    new(int maxValuedObjects, int maxStates, int maxRegions) {
        this.minValONumSize = calcMinimumLengthOfNum(maxValuedObjects)
        this.minStateNumSize = calcMinimumLengthOfNum(maxStates)
        this.minRegionNumSize = calcMinimumLengthOfNum(maxRegions)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, boolean leadingZeroes) {
        this(maxValuedObjects, maxStates, maxRegions)
        this.leadingZeroes = leadingZeroes
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, String valuedObjectPrefix, String statePrefix, String regionPrefix) {
        this(maxValuedObjects, maxStates, maxRegions)
        this.valOPrefix = valuedObjectPrefix
        this.statePrefix = statePrefix
        this.regionPrefix = regionPrefix
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, String valuedObjectPrefix, String statePrefix, String regionPrefix, boolean leadingZeroes) {
        this(maxValuedObjects, maxStates, maxRegions)
        this.valOPrefix = valuedObjectPrefix
        this.statePrefix = statePrefix
        this.regionPrefix = regionPrefix
        this.leadingZeroes = leadingZeroes
    }
    
    override getValuedObjectName(ValuedObject valuedO) {
        var str = valOPrefix
        if (leadingZeroes) {
            str += numberToFixedLengthString(valOCounter, minValONumSize)
        } else {
            str += valOCounter.toString
        }
        valOCounter++
        return str
    }
    
    override getStateName(State state) {
        var str = statePrefix
        if (leadingZeroes) {
            str += numberToFixedLengthString(stateCounter, minStateNumSize)
        } else {
            str += stateCounter.toString
        }
        stateCounter++
        return str
    }
    
    override getCommentText(String comment) {
        return ""
    }
    
    override getRegionName(Region region) {
        var str = regionPrefix
        if (leadingZeroes) {
            str += numberToFixedLengthString(regionCounter, minRegionNumSize)
        } else {
            str += regionCounter.toString
        }
        regionCounter++
        return str
    }
}