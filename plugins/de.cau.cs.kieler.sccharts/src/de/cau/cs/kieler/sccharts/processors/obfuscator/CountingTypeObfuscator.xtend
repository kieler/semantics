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

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State

/**
 * @author stu114663
 *
 */
class CountingTypeObfuscator extends Obfuscator {
    
    var CountingObfuscator valOObf
    var CountingObfuscator stateObf
    var CountingObfuscator regionObf
    
    static final String DEFAULT_VALO_PREFIX = "Var"
    static final String DEFAULT_REGION_PREFIX = "Region"
    static final String DEFAULT_STATE_PREFIX = "State"
    static final boolean DEFAULT_LEADING_ZEROES = false
    
    new(ItemCounter ic) {
        this(ic, DEFAULT_LEADING_ZEROES)
    }
    
    new(ItemCounter ic, boolean leadingZeroes) {
        this(ic, DEFAULT_VALO_PREFIX, DEFAULT_STATE_PREFIX, DEFAULT_REGION_PREFIX, leadingZeroes)
    }
    
    new(ItemCounter ic, String valuedObjectPrefix, String statePrefix, String regionPrefix) {
        this(ic, valuedObjectPrefix, statePrefix, regionPrefix, DEFAULT_LEADING_ZEROES)
    }
    
    new(ItemCounter ic, String valuedObjectPrefix, String statePrefix, String regionPrefix, boolean leadingZeroes) {
        if (!ic.counted) {
        	ic.count
        }
        this.valOObf = new CountingObfuscator(ic.valOCount, valuedObjectPrefix, leadingZeroes)
        this.stateObf = new CountingObfuscator(ic.stateCount, statePrefix, leadingZeroes)
        this.regionObf = new CountingObfuscator(ic.regionCount, regionPrefix, leadingZeroes)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions) {
        this(maxValuedObjects, maxStates, maxRegions, DEFAULT_LEADING_ZEROES)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, boolean leadingZeroes) {
        this(maxValuedObjects, maxStates, maxRegions, DEFAULT_VALO_PREFIX, DEFAULT_STATE_PREFIX, DEFAULT_REGION_PREFIX, leadingZeroes)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, String valuedObjectPrefix, String statePrefix, String regionPrefix) {
        this(maxValuedObjects, maxStates, maxRegions, valuedObjectPrefix, statePrefix, regionPrefix, DEFAULT_LEADING_ZEROES)
    }
    
    new(int maxValuedObjects, int maxStates, int maxRegions, String valuedObjectPrefix, String statePrefix, String regionPrefix, boolean leadingZeroes) {
        this.valOObf = new CountingObfuscator(maxValuedObjects, valuedObjectPrefix, leadingZeroes)
        this.stateObf = new CountingObfuscator(maxStates, statePrefix, leadingZeroes)
        this.regionObf = new CountingObfuscator(maxRegions, regionPrefix, leadingZeroes)
    }
    
    override getValuedObjectName(ValuedObject valO) {
        return valOObf.getValuedObjectName(valO)
    }
    
    override getStateName(State state) {
        return stateObf.getStateName(state)
    }
    
    override getCommentText(String comment) {
        return ""
    }
    
    override getRegionName(Region region) {
        return regionObf.getRegionName(region)
    }
}