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

import de.cau.cs.kieler.sj.CombinationFunction;
import de.cau.cs.kieler.sj.SJProgram;
import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.ValuedSignal;
import de.cau.cs.kieler.sj.examples.PrimeFactor.StateLabel;
import static de.cau.cs.kieler.sj.examples.PrimeFactor.StateLabel.*;


/**
 * This example illustrates the use of valued signals and the proper handling of
 * reincarnation/schizophrenia in SJ. It's based on PrimeFactor-sc.c from the SC examples. For more
 * informations see the <a href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC
 * homepage</a>.
 * 
 * @author mhei
 * 
 */
public class PrimeFactor extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        S0, S1, S1surf, S1depth, S2, S0main, S0depth, S3
    }

    /**
     * Valued signal used by the program. The parameter CombinationFunction.MULTIPLY means that if
     * this signal is emitted multiple in a tick the emitted values will be multiply.
     * 
     * Getter an setter are not used for this variable, because they not part of the signal concept
     * in SJ.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public ValuedSignal v = new ValuedSignal("v", CombinationFunction.MULTIPLY);

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal a, b, c, d;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program PrimeFactor.
     */
    public PrimeFactor() {
        super(S0, 1);
        initSignals();
    }

    @Override
    public void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case S0:
                fork(S1, 2);
                forkEB(S0main);
                break;

            case S1:
                v.emit(2);

            case S1surf:
                if (b.isPresent()) {
                    v.emit(5);
                    gotoB(S2);
                } else {
                    pauseB(S1depth);
                }
                break;

            case S1depth:
                if (a.isPresent()) {
                    v.emit(3);
                }
                gotoB(S1surf);
                break;

            case S2:
                pauseB(S2);
                break;

            case S0main:
                if (d.isPresent()) {
                    v.emit(11);
                    transB(S3);
                } else {
                    pauseB(S0depth);
                }
                break;

            case S0depth:
                if (c.isPresent()) {
                    v.emit(7);
                    transB(S0);
                } else {
                    gotoB(S0main);
                }
                break;

            case S3:
                pauseB(S3);
                break;
            }
        }

    }

}
