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
import de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel;
import static de.cau.cs.kieler.sj.examples.SimplePCO.StateLabel.*;

/**
 * Simplified Producer-Consumer-Observer Example for SJ only with producer and a consumer. 
 * Based on the file <code>PCO.c</code> from the SC  examples.
 * 
 * @author cmot
 * 
 */
public class SimplePCOCompetition extends SJProgram<StateLabel> {

    enum StateLabel {
        INIT, PCO, Producer, Consumer, Parent, Done, L1, L2
    }

    private static final int ARRAY_SIZE = 8;
    private int buf, i, j = 0, tmp;
    private int[] arr = new int[ARRAY_SIZE];

    public SimplePCOCompetition() {
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

    /**
     * Main for the Producer-Consumer-Observer example.
     * 
     * @param args
     *            not used
     * 
     */
    public static void main(final String[] args) {
    	int numberOfLoops = 5;
    	try {
    		numberOfLoops = Integer.parseInt(args[0]);
    	}
    	catch(Exception e) {}
    	main(numberOfLoops);
    }

    public static void main(int numberOfLoops) {
        SimplePCOCompetition pco = new SimplePCOCompetition();
    	int tick = 0;
        while (!pco.isTerminated() && tick++ < numberOfLoops) {
            pco.doTick();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
    
}
