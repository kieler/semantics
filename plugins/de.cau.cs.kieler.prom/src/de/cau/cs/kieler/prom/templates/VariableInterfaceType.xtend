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
package de.cau.cs.kieler.prom.templates

import java.util.HashSet
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Enumerates different types of variable uses considering the interface definition of a model.
 * 
 * @author aas
 *
 */
class VariableInterfaceType {
    public static val INPUT = new VariableInterfaceType("input", 4)
    public static val OUTPUT = new VariableInterfaceType("output", 2)
    public static val INTERNAL = new VariableInterfaceType("internal", 1)
    public static val ALL_INTERFACE_TYPES = #[INPUT, OUTPUT, INTERNAL]
    
    /**
     * The name
     */
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    /**
     * The bitmask
     */
    @Accessors(PUBLIC_GETTER)
    private var int bitmask
    
    public static def HashSet<VariableInterfaceType> getInterfaceTypes(boolean isInput, boolean isOutput, boolean isInternal) {
        val list = <VariableInterfaceType>  newHashSet
        if(isInput) {
            list.add(INPUT)
        }
        if(isOutput) {
            list.add(OUTPUT)
        }
        if(isInternal) {
            list.add(INTERNAL)
        }
        return list
    }
    
    /**
     * Returns the interface types that match the given bitmask.
     */
    public static def HashSet<VariableInterfaceType> getInterfaceTypes(int bitmask) {
        val list = newHashSet
        for(interfaceType : ALL_INTERFACE_TYPES) {
            if(interfaceType.matches(bitmask)) {
                list.add(interfaceType)
            }
        }
        return list
    }
    
    /**
     * Returns the bitmask that matches the given interface types.
     */
    public static def int getBitmask(Set<VariableInterfaceType> interfaceTypes) {
        var bitmask = 0
        for(interfaceType : interfaceTypes) {
            bitmask = bitmask.bitwiseOr(interfaceType.bitmask)
        }
        return bitmask
    }
    
    /**
     * Returns true if the given bitmask contains the bitmask of this instance.
     */
    private def boolean matches(int bitmask) {
        return this.bitmask.bitwiseAnd(bitmask) != 0
    }
    
    /**
     * Constructor
     */
    private new(String name, int bitmask) {
        this.name = name
        this.bitmask = bitmask
    }
}