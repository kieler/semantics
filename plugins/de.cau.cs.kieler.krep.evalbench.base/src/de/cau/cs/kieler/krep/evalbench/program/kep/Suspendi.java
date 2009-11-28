/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.program.kep;

/** @generated */public class Suspendi extends AddrSigWatchInstruction {

    public Suspendi(KepSignal sig, Label addr, Watcher watch, SCLine sc) {
        super(Constants.SUSPENDI.getOpcode(), Constants.SUSPENDI.getInfo(),
                sig, addr, watch, sc);

    }
}
