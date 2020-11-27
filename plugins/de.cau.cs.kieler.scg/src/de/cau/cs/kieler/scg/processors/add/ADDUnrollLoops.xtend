/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.add

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import info.scce.cfg.ControlFlowGraph

/** 
 * 
 * @author ssm
 * @kieler.design 2020-11-25 proposed 
 * @kieler.rating 2020-11-25 proposed yellow
 */

class ADDUnrollLoops extends ExogenousProcessor<ControlFlowGraph, ControlFlowGraph> implements Traceable {

    public static val IProperty<Boolean> LOOP_UNROLLINGS_ENABLED = 
        new Property<Boolean>("add.loopUnrollings.enabled", false)
    public static val IProperty<Integer> LOOP_UNROLLINGS = 
        new Property<Integer>("add.loopUnrollings", 0)
                
    override getId() {
        "de.cau.cs.kieler.scg.processors.add.unrollLoops"
    }
    
    override getName() {
        "Loop Unrolling"
    }
    
    override process() {
        val cfg = model.copy
//        if (getProperty(LOOP_UNROLLINGS) > 0)
        if (getProperty(LOOP_UNROLLINGS_ENABLED)) 
            cfg.unrollLoops(getProperty(LOOP_UNROLLINGS))
        
        setModel(cfg)
    }
      
}
