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
import de.cau.cs.kieler.sj.ValuedSignal;
import de.cau.cs.kieler.sj.examples.Shifter3.StateLabel;
import static de.cau.cs.kieler.sj.examples.Shifter3.StateLabel.*;

/**
 * Example to illustrate the behavior of valued signals and <code>pre</code>.
 * It is based on the SC example <code>Shifter3-sc.c</code>.
 * 
 * 
 * @author mhei
 * 
 */
public class Shifter3 extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        Init, Shift0depth, Shift0, Shift1depth, Shift1, ShiftO, ShiftOdepth
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public ValuedSignal i, o, s0, s1;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers
    
    /**
     * Starts a new instance of the program Shifter3.
     */
    public Shifter3() {
        super(Init, 1);
        // set the history length for the signals
        s0 = new ValuedSignal("s0", 1);
        s1 = new ValuedSignal("s1", 1);
        i = new ValuedSignal("i", 1);
        initSignals();
    }

    @Override
    public void tick() {
        Number reg0;

        while (!isTickDone()) {
            switch (state()) {
            case Init:

                fork(Shift1, 2);
                fork(ShiftO, 3);
                gotoB(Shift0);
                break;

            case Shift0depth:
                // PRESENTPREELSE(I, Shift0);
                if (!i.pre().isPresent()) {
                    gotoB(Shift0);
                    break;
                }
                // VALPREREG(I, reg0);
                reg0 = i.pre().getValue();
                // EMITINT(S0, reg0);
                s0.emit(reg0);

            case Shift0:
                pauseB(Shift0depth);
                break;

            case Shift1depth:
                // PRESENTPREELSE(S0, Shift1);
                if (!s0.pre().isPresent()) {
                    gotoB(Shift1);
                    break;
                }
                // VALPREREG(S0, reg0);
                reg0 = s0.pre().getValue();
                // EMITINT(S1, reg0);
                s1.emit(reg0);
            case Shift1:
                pauseB(Shift1depth);
                break;

            case ShiftOdepth:
                // PRESENTPREELSE(S1, ShiftO);
                if (!s1.pre().isPresent()) {
                    gotoB(ShiftO);
                    break;
                }
                // VALPREREG(S1, reg0);
                reg0 = s1.pre().getValue();
                // EMITINT(O, reg0);
                o.emit(reg0);
            case ShiftO:
                pauseB(ShiftOdepth);
                break;

            }
        }
    }

}
