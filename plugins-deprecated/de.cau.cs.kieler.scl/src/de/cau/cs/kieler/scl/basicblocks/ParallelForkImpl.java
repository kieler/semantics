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
package de.cau.cs.kieler.scl.basicblocks;

import de.cau.cs.kieler.scl.scl.Parallel;
import de.cau.cs.kieler.scl.scl.impl.ParallelImpl;

/**
 * @author ssm
 *
 */
public class ParallelForkImpl extends ParallelImpl implements ParallelFork {

   public Parallel ParallelReference;
    
    public ParallelForkImpl(Parallel SCLParallel) {
        super();
        ParallelReference = SCLParallel;
    }

}
