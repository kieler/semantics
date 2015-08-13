package de.cau.cs.kieler.sjl.example;

import de.cau.cs.kieler.sjl.example.Abro;
import de.cau.cs.kieler.sjl.SJLProgramWithSignals;

import de.cau.cs.kieler.sjl.example.Abro.State;
import static de.cau.cs.kieler.sjl.example.Abro.State.*;

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

/**
 * This implements the classical ABRO synchronous program, an example taken originally from
 * Charles Andrè: http://www-sop.inria.fr/members/Charles.Andre/SyncCharts/RR200324.pdf
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed * 
 */
public class Abro extends SJLProgramWithSignals<State> {

    enum State {
        ABOEntry, ABO, AB, WaitA, WaitB, ABMain, ABOMain 
    }

    public boolean a = false;
    public boolean b = false;
    public boolean r = false;
    public boolean o = false;

    public Abro() {
        super(ABOEntry, 4, 4);
    }

    @Override
    public final void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case ABOEntry:
                pauseB(ABO);
                break;
                
            case ABO:
                fork(AB, 1);
                gotoB(ABOMain);
                break;

            case AB:
                fork(WaitA, 2);
                fork(WaitB, 3);
                gotoB(ABMain);
                break;

            case WaitA:
                if (a) {
                    termB();
                } else {
                    pauseB(WaitA);
                }
                break;

            case WaitB:
                if (b) {
                    termB();
                } else {
                    pauseB(WaitB);
                }
                break;

            case ABMain:
                if (!join()) {
                    pauseB(ABMain);
                }
                else {
                    o = true;
                    termB();
                }
                break;

            case ABOMain:
                if (r) {
                    transB(ABOEntry);
                } else {
                    pauseB(ABOMain);
                }
                break;
            }
        }
    } 
    
    // ------------------------------------------------------------------------
    
    public static void main(final String[] args) {
        Abro program = new Abro();
        SJLProgramWithSignals.main(args, program);
    }

    // ------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void resetInputSignals() {
       a = false;
       b = false;
       r = false;
    }

    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void resetOutputSignals() {
        o = false;
    }

    // ------------------------------------------------------------------------
}
