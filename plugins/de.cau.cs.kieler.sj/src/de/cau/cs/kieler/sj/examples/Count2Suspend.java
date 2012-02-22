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
import de.cau.cs.kieler.sj.examples.Count2Suspend.StateLabel;
import static de.cau.cs.kieler.sj.examples.Count2Suspend.StateLabel.*;

/**
 * Program to demonstrate the behavior of suspend and how this works in SJ. This program based on
 * CountToSuspend-sc.c from the SC examples. For more informations see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * @author mhei
 * 
 */
public class Count2Suspend extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        Cnt2, Off0, On0, On0_L1, Off1, On1, On1_L1, Cnt2Main, Cnt2Main_L1, L5
    }
    
    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal t, inhib, reset, b0, b1, c, c0;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers
    
    /**
     * Starts a new instance of the program Count2Suspend.
     */
    public Count2Suspend() {
        super(Cnt2, 3);
        initSignals();
    }

    @Override
    public void tick() {
        while (!isTickDone()) {
            switch (state()) {

            case Cnt2:
                fork(Off1, 1);
                fork(Off0, 2);
                forkEB(Cnt2Main);
                break;

            case Off0:
                if (awaitCB(t)) {
                    gotoB(On0);
                }
                break;
            case On0:
                b0.emit();
                pauseB(On0_L1);
                break;

            case On0_L1:
                if (!t.isPresent()) {
                    gotoB(On0);
                    break;
                }
                c0.emit();
                gotoB(Off0);
                break;

            case Off1:
                if (awaitCB(c0)) {
                    gotoB(On1);
                }
                break;

            case On1:
                b1.emit();
                pauseB(On1_L1);
                break;

            case On1_L1:
                if (!c0.isPresent()) {
                    gotoB(On1);
                    break;
                }
                c.emit();
                gotoB(Off1);
                break;

            case Cnt2Main:
                pauseB(Cnt2Main_L1);
                break;

            case Cnt2Main_L1:
                if (!reset.isPresent()) {
                    gotoB(L5);
                    break;
                }
                transB(Cnt2);
                break;

            case L5:
                if (!inhib.isPresent()) {
                    gotoB(Cnt2Main);
                    break;
                }
                suspend();
                pauseB(L5);
                break;
            }
        }
    }

}
