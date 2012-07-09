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
import de.cau.cs.kieler.sj.examples.ABWSO.StateLabel;
import static de.cau.cs.kieler.sj.examples.ABWSO.StateLabel.*;

/**
 * 
 * The program ABRO. ABRO is the "hello world" of synchronous languages. This implementation based
 * on the SC version of ABRO. For informations about SC see the <a
 * href="http://www.informatik.uni-kiel.de/rtsys/sc" target="_parent">SC homepage</a>.
 * 
 * @author mhei
 * 
 */
public class ABWSO extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        ABO, AB, wA, wB, ABMain, ABOMain, ABOMainStrong, ABOMainWeak
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal A, B, W, S, O;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program ABRO.
     */
    public ABWSO() {
        // start ABRO at label ABO with the priority 5
        super(ABO, 5);
        initSignals();

    }

    @Override
public final void tick() {
  while (!isTickDone()) {
    switch (state()) {
      case ABO:
        fork(AB, 2);
        forkEB(ABOMainStrong);
        break;
      case AB:
        fork(wA, 4);
        fork(wB, 3);
        forkEB(ABMain);
        break;
      case wA:
        if (awaitCB(A)) {
          B.emit(); termB();
        } break;
      case wB:
        if (awaitCB(B)) {
          termB();
        } break;
      case ABMain:
        if (joinDoneCB()) {
          O.emit(); termB();
        } break;
      case ABOMainStrong:
        if (S.isPresent()) {
          abort(); prioB(ABO, 5);
        } prioB(ABOMainWeak, 1);
      case ABOMainWeak:
        if (W.isPresent()) {
          abort(); prioB(ABO, 5);
        } prioB(ABOMainStrong,5);
        break;
    }
  }
}
}
