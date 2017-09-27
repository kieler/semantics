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

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Enumerates different types of variable uses considering the interface definition of a model.
 * 
 * @author aas
 *
 */
class VariableInterfaceType {
    public static val INPUT = new VariableInterfaceType("input")
    public static val OUTPUT = new VariableInterfaceType("output")
    public static val INTERNAL = new VariableInterfaceType("internal")
    public static val OTHER = new VariableInterfaceType("other")
    
    /**
     * The name of this instance
     */
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    /**
     * Constructor
     */
    private new(String name) {
        this.name = name
    }
}