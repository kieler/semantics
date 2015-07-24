/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.examples;

import de.cau.cs.kieler.sj.SJProgram;
import de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel;
import static de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel.*;

/**
  * The Class SimplePCO.
  * 
  * @kieler.ignore (excluded from review process)
  */
public class SimplePCO extends SJProgram<StateLabel> {

    /**
     * The Enum StateLabel.
     */
    enum StateLabel {
        
        /** The init. */
        INIT, 
 /** The pco. */
 PCO, 
 /** The Producer. */
 Producer, 
 /** The Consumer. */
 Consumer, 
 /** The Parent. */
 Parent, 
 /** The Done. */
 Done, 
 /** The L1. */
 L1, 
 /** The L2. */
 L2
    }

    /** The Constant ARRAY_SIZE. */
    private static final int ARRAY_SIZE = 8;
    
    /** The tmp. */
    private int buf, i, j = 0, tmp;
    
    /** The arr. */
    private int[] arr = new int[ARRAY_SIZE];

    /**
     * Instantiates a new simple pco.
     */
    public SimplePCO() {
        super(PCO, 1);
    }

    /**
     * Tick.
     */
    @Override
    public void tick() {
        while (!isTickDone()) {
            switch (state()) {
            case PCO:
                fork(Producer, 4);
                fork(Consumer, 3);
                forkEB(Parent);
                break;

            case Producer:
                i = 0;
            case L1:
                buf = i;
                i++;
                pauseB(L1);
                break;

            case Consumer:
                for (j = 0; j < arr.length; j++) {
                    arr[j] = 0;
                }
                j = 0;
            case L2:
                tmp = buf;
                arr[j % arr.length] = tmp;
                j++;
                pauseB(L2);
                break;

            case Parent:
                pauseB(Parent);
                break;
            }
        }
    }

    /**
     * Main.
     *
     * @param numberOfTicks the number of ticks
     */
    public static void main(int numberOfTicks) {
    	SimplePCO pco = new SimplePCO();
        for (int tick = 0; tick < numberOfTicks; tick++) {
            pco.doTick();
            if(pco.isTerminated()) {
                break;
            }
        }
    }
    
}
