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
package de.cau.cs.kieler.scg.transformations.schedulers

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph

/** 
 * This class is part of the SCG transformation chain. 
 * The transformation chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis
 *   |-- Scheduler                          <== YOU ARE HERE
 *   |-- Sequentialization (new SCG)				
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
abstract class AbstractScheduler extends AbstractProductionTransformation {

    public def transform(SCGraph scg, KielerCompilerContext context) {
        return schedule(scg, context)
    }

    protected abstract def SchedulingConstraints orderSchedulingBlocks(SCGraph scg);
    
    /**
     * Entry point for the caller. Invoke {@code schedule} to create the schedules for the given SCG.
     * All mandatory information will be gathered automatically if necessary and may be completed by
     * scheduler-defined analyses. Subsequent to the building of the schedules, scheduler-defined 
     * optimizations may run.
     * 
     * @param scg
     * 			the SCG (of arbitrary SCG class type)
     * @return Returns a fully (in sense of the transformation chain) updated SCG.
     */
    public abstract def SCGraph schedule(SCGraph scg, KielerCompilerContext context) 
        
}