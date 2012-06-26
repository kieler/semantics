/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
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
import de.cau.cs.kieler.sj.examples.SurfDepth.StateLabel;
import static de.cau.cs.kieler.sj.examples.SurfDepth.StateLabel.*;

/**
 * Program to demonstrate the behavior and functionality of SJ. This program based on SurfDepth-sc.c
 * from the SC examples. For more informations see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * @author mhei
 * 
 */
public class SurfDepth extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        Init, S0depth, S0surf, L0, L1, L2, L3, L4, S1surf, S1depth, S2
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal a0, u0, b0, v0, a1, b1, c1, u1, v1, w1;

    /**
     * Starts a new instance of the program SurfDepth.
     */
    public SurfDepth() {
        super(Init, 1);
        initSignals();
    }

    @Override
    public void tick() {
        while (!isTickDone()) {

            switch (state()) {

            case Init:
                gotoB(S0surf);
                break;

            case S0depth:
                if (a0.isPresent()) {
                    u0.emit();
                    gotoB(S1surf);
                } else {
                    gotoB(S0surf);
                }
                break;

            case S0surf:
                if (b0.isPresent()) {
                    v0.emit();
                    gotoB(S1surf);
                } else {
                    gotoB(L0);
                }
                break;

            case L0:
                pauseB(S0depth);
                break;

            case S1surf:
                if (b1.isPresent()) {
                    gotoB(L2);
                } else {
                    gotoB(L4);
                }
                break;

            case S1depth:
                if (a1.isPresent()) {
                    u1.emit();
                    gotoB(S2);
                } else {
                    gotoB(L1);
                }
                break;

            case L1:
                if (!b1.isPresent()) {
                    gotoB(L3);
                    break;
                }
                // fall through
            case L2:
                v1.emit();
                gotoB(S2);
                break;

            case L3:
                if (c1.isPresent()) {
                    w1.emit();
                    gotoB(S2);

                } else {
                    gotoB(L4);
                }
                break;

            case L4:
                pauseB(S1depth);
                break;

            case S2:
                pauseB(S0surf);
                break;

            }
        }
    }
}
