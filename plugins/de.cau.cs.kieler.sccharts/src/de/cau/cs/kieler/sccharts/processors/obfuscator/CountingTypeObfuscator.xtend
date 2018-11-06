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
    
    var valuedObjectCounter = 1
    int valuedObjectsNumSize = 0
    String valuedObjectPrefix = "V"
    var stateCounter = 1
    int statesNumSize = 0
    String statePrefix = "S"
    var regionCounter = 1
    int regionsNumSize = 0
    String regionPrefix = "R"
    
    new(int maxValuedObjects, int maxStates, int maxRegions) {
        this.valuedObjectsNumSize = calcMinimumLengthOfNum(maxValuedObjects)
        this.statesNumSize = calcMinimumLengthOfNum(maxStates)
        this.regionsNumSize = calcMinimumLengthOfNum(maxRegions)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, String valuedObjectPrefix, String statePrefix, String regionPrefix) {
        this(maxValuedObjects, maxStates, maxRegions)
        this.valuedObjectPrefix = valuedObjectPrefix
        this.statePrefix = statePrefix
        this.regionPrefix = regionPrefix
    }
    
    override getValuedObjectName(ValuedObject valuedO) {
        val str = valuedObjectPrefix + numberToFixedLengthString(valuedObjectCounter, valuedObjectsNumSize)
        valuedObjectCounter++
        return str
    }
    
    override getStateName(State state) {
        val str = statePrefix + numberToFixedLengthString(stateCounter, statesNumSize)
        stateCounter++
        return str
    }
    
    override getCommentText() {
        return ""
    }
    
    override getRegionName(Region region) {
        val str = regionPrefix + numberToFixedLengthString(regionCounter, regionsNumSize)
        regionCounter++
        return str
    }
}