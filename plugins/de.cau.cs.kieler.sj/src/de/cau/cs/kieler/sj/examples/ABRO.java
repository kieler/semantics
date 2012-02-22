/*
 * SJ - Synchronous Java.
 *
 * http://www.informatik.uni-kiel.de/rtsys/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.examples;

import de.cau.cs.kieler.sj.SJProgram;
import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.examples.ABRO.StateLabel;
import static de.cau.cs.kieler.sj.examples.ABRO.StateLabel.*;

/**
 * 
 * The program ABRO. ABRO is the "hello world" of synchronous languages. This implementation based
 * on the SC version of ABRO. For informations about SC see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * @author mhei
 * 
 */
public class ABRO extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        ABO, AB, WaitA, WaitB, ABMain, ABOMain
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal a, b, r, o;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program ABRO.
     */
    public ABRO() {
        // start ABRO at label ABO with the priority 4
        super(ABO, 4);
        initSignals();

    }

    @Override
    public final void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case ABO:
                fork(AB, 1);
                forkEB(ABOMain);
                break;

            case AB:
                fork(WaitA, 2);
                fork(WaitB, 3);
                forkEB(ABMain);
                break;

            case WaitA:
                if (awaitCB(a)) {
                    termB();
                }
                break;

            case WaitB:
                if (awaitCB(b)) {
                    termB();
                }
                break;

            case ABMain:
                if (joinDoneCB()) {
                    o.emit();
                    termB();
                }
                break;

            case ABOMain:
                if (awaitCB(r)) {
                    transB(ABO);
                }
                break;
            }
        }
    }
}
