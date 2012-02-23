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
import de.cau.cs.kieler.sj.examples.ABSync.StateLabel;
import static de.cau.cs.kieler.sj.examples.ABSync.StateLabel.*;

/**
 * 
 * The program ABSync program from Charles Andres Paper
 * 
 * @author cmot
 * 
 */
public class ABSync extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
    	DetectionThreadMain, DetectionThreadMain1, DetectionThreadMain2, dA, dB, done, idle, cnt1, cnt2, WaitAandB, Timer, WaitThreadMain,
        DetectionThread, TimerThread, WaitThread, wAThread, wBThread, 
    }

    /**
     * The signals used by the Program.
     * 
     * Because the class SJProgram is in a different package than this program, all signals must be
     * public.
     */
    // SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
    public Signal A, B, Reset, arm, disarm, AB;

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of the program ABRO.
     */
    public ABSync() {
        // start ABRO at label ABO with the priority 4
        super(DetectionThread, 1);
        initSignals();

    }

    @Override
    public final void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case DetectionThread:
                fork(TimerThread, 3);
                fork(WaitThread, 4);
                forkEB(DetectionThreadMain);
                break;

            case WaitThread:
                fork(wAThread, 5);
                fork(wBThread, 6);
                forkEB(WaitThreadMain);
                break;

            case wAThread:
                if (awaitCB(A)) {
                	arm.emit();
                    termB();
                }
                break;

            case wBThread:
                if (awaitCB(B)) {
                	arm.emit();
                    termB();
                }
                break;

            case WaitThreadMain:
                if (joinDoneCB()) {
                    AB.emit();
                    termB();
                }
                break;

            case TimerThread:
            	if (awaitCB(arm)) {
            		pauseB(cnt1);
            	}
            	break;

            case cnt1:
            	pauseB(cnt2);
            	break;
            	
            case cnt2:
            	disarm.emit();
            	termB();
            	break;

            case DetectionThreadMain:
        		if (Reset.isPresent()) {
        			abort();
        			transB(DetectionThread);
        			break;
        		}
        		else if (disarm.isPresent()) {
                    transB(DetectionThread);
                }
        		else {
        			prioB(DetectionThread, 2);
        		}
        		break;
        }
        }
    }
}
