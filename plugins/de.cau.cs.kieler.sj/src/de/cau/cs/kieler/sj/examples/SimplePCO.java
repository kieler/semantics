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
import de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel;
import static de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel.*;

public class SimplePCO extends SJProgram<StateLabel> {

    enum StateLabel {
        INIT, PCO, Producer, Consumer, Parent, Done, L1, L2
    }

    private static final int ARRAY_SIZE = 8;
    private int buf, i, j = 0, tmp;
    private int[] arr = new int[ARRAY_SIZE];

    public SimplePCO() {
        super(PCO, 1);
    }

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
