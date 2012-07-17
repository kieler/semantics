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
import de.cau.cs.kieler.sj.examples.GRCbal3.StateLabel;
import static de.cau.cs.kieler.sj.examples.GRCbal3.StateLabel.*;

/**
 * This program illustrates the usage of priorities to handle signal dependencies among concurrent
 * threads. It's based on grcbal3-sc.c from the SC examples. For more informations see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * grc := graph code bal := bytecode assembly language
 * 
 * @author mhei
 * 
 */
public class GRCbal3 extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        INIT, T1, L0, L1, L2, L3, T2, T3, TMain
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal a, b, c, d, e, t;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program GRCbal3.
     */
    public GRCbal3() {
        super(INIT, 1);
        initSignals();
    }

    @Override
    public void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case INIT:
                fork(T1, 6);
                fork(T2, 5);
                fork(T3, 3);
                forkEB(TMain);
                break;

            case T1:
                if (a.isPresent()) {
                    b.emit();
                    prioB(L0, 4);
                } else {
                    gotoB(L2);
                }
                break;

            case L0:
                if (c.isPresent()) {
                    d.emit();
                }
                prioB(L1, 2);
                break;

            case L1:
                if (e.isPresent()) {
                    t.emit();
                    termB();
                } else {
                    gotoB(L2);
                }
                break;

            case L2:
                pauseB(L3);
                break;

            case L3:
                b.emit();
                termB();
                break;

            case T2:
                if (b.isPresent()) {
                    c.emit();
                }
                termB();
                break;

            case T3:
                if (d.isPresent()) {
                    e.emit();
                }
                termB();
                break;

            case TMain:
                if (t.isPresent()) {
                    abort();
                    termB();
                    break;
                } else if (joinDoneCB()) {
                    termB();
                    break;
                }
                break;
            }
        }
    }
}
