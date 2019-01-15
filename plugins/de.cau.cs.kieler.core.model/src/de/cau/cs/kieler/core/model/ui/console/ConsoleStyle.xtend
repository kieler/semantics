/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.model.ui.console

import java.util.Objects
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class ConsoleStyle {
    
    public static val INFO = new ConsoleStyle(0, 0, 0)
    public static val WARNING = new ConsoleStyle(127, 127, 0)
    public static val ERROR = new ConsoleStyle(127, 0, 0)
    public static val SIMULATION = new ConsoleStyle(128, 0, 163)
    
    @Accessors(PUBLIC_GETTER)
    private int r
    @Accessors(PUBLIC_GETTER)
    private int g
    @Accessors(PUBLIC_GETTER)
    private int b
    
    /**
     * Constructor
     */
    new(int r, int g, int b) {
        this.r = r
        this.g = g
        this.b = b
    }
    
    /**
     * {@inheritDoc}
     */
    override equals(Object other){
        if (other === null) return false
        if (other === this) return true
        if (!(other instanceof ConsoleStyle)) return false
        val otherMyClass = other as ConsoleStyle
        return otherMyClass.r == r
            && otherMyClass.g == g
            && otherMyClass.b == b
    }
    
    /**
     * {@inheritDoc}
     */
    override hashCode() {
        return Objects.hash(r, g, b)
    }
}
