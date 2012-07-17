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
import de.cau.cs.kieler.sj.examples.ProducerConsumer.StateLabel;
import static de.cau.cs.kieler.sj.examples.ProducerConsumer.StateLabel.*;

/**
 * Producer-Consumer-Observer Example for SJ. Based on the file <code>PCO.c</code> from the SC
 * examples.
 * 
 * @author mhei
 * 
 */
public class ProducerConsumer extends SJProgram<StateLabel> {

    /**
     * The labels used for the different parts of the program.
     */
    enum StateLabel {
        INIT, PCO, Producer, Consumer, Observer, Parent, Done, L1, L2
    }

    private static final int ARRAY_SIZE = 8;
    private int buf, fd, i, j, k = 0, tmp;
    private int[] arr = new int[ARRAY_SIZE];

    // CHECKSTYLEOFF MagicNumber
    // Priority's are part of the concept and not magic numbers

    /**
     * Starts a new instance of a Producer-Consumer-Observer SJ-program.
     */
    public ProducerConsumer() {
        super(INIT, 1);
    }

    @Override
    public void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case PCO:
                fork(Producer, 4);
                fork(Consumer, 3);
                fork(Observer, 2);
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

            case Observer:
                fd = buf;
                System.out.println("buf = " + buf + ", arr[" + ((j - 1) % arr.length) + "] = "
                        + arr[(j - 1) % arr.length] + ", fd = " + fd + ", k = " + k);
                k++;
                pauseB(Observer);
                break;

            case Parent:
                if (k == 20) {
                    transB(Done);
                    break;
                }
                if (buf == 10) {
                    transB(PCO);
                    break;
                }
                pauseB(Parent);
                break;

            case Done:
                termB();
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
        ProducerConsumer pco = new ProducerConsumer();
        while (!pco.isTerminated()) {
            pco.doTick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
