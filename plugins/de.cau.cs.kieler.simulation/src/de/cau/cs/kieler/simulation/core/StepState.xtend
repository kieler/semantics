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
package de.cau.cs.kieler.simulation.core

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Combination of<br>
 *   1. a data pool<br>
 *   2. index of the step action to be executed next (like a program counter).
 * 
 * @author aas
 *
 */
class StepState {
    /** 
     * The data pool 
     */
    @Accessors
    private var DataPool pool
    /**
     * Index of the step action to be executed next.
     * This is similar to a program counter.
     * The index is always increasing. Use modulo to calculate the actual action to be executed.
     */
    @Accessors
    private var int actionIndex
    
    /** 
     * Constructor
     */
    new(DataPool pool, int actionIndex) {
        this.pool = pool
        this.actionIndex = actionIndex
    }
}