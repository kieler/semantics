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
import static de.cau.cs.kieler.sj.examples.FilteredSR.*;
import static de.cau.cs.kieler.sj.examples.FilteredSR.StateLabel.*;

/**
 * Example to illustrate the <code>pre</code> command and signals in SJ. This program based on
 * FilteredSR-sc.c from the SC examples. For more informations see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * @author mhei
 * 
 */
public class FilteredSR extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        OFF, OFF_1, ON, ON_1
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal s, r, on, off;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program FilteredSR.
     */
    public FilteredSR() {
        super(OFF, 1);
        // For S and R we need a history because the use of pre
        s = new Signal("S", 1);
        r = new Signal("R", 1);
        initSignals();
    }

    @Override
    public void tick() {
        while (!isTickDone()) {
            switch (state()) {
            case OFF:
                off.emit();
                pauseB(OFF_1);
                break;
            case OFF_1:

                if (!s.isPresent()) {
                    gotoB(OFF);
                    break;
                }
                if (!s.pre().isPresent()) {
                    gotoB(OFF);
                    break;
                }
            case ON:
                on.emit();
                pauseB(ON_1);
                break;
            case ON_1:
                if (!r.isPresent()) {
                    gotoB(ON);
                    break;
                }
                if (!r.pre().isPresent()) {
                    gotoB(ON);
                    break;
                }
                gotoB(OFF);
                break;
            }
        }
    }
}
