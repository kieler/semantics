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
package de.cau.cs.kieler.sj.examples.alternative;

/**
 * The Class SimplePCO.
 * 
 * @author cmot
 */
public class SimplePCO {

    /** The Constant DEFAULT_NUMBER_OF_LOOPS. */
    public static final int DEFAULT_NUMBER_OF_LOOPS = 5;

    /** The number of loops. */
    private static int numberOfLoops;

    /** The data. */
    private static Data data;

    /** The finished c. */
    private static boolean finishedC = false;

    /** The finished p. */
    private static boolean finishedP = false;

    /**
     * Instantiates a new simple pco.
     * 
     * @param numberOfLoops
     *            the number of loops
     */
    public SimplePCO(final int numberOfLoops) {
        SimplePCO.numberOfLoops = numberOfLoops;
        SimplePCO.data = new Data();
        new Thread(new ConsumerThread()).start();
        new Thread(new ProducerThread()).start();
    }

    /**
     * The Class Data.
     */
    class Data {

        /** The Constant ARRAY_SIZE. */
        private static final int ARRAY_SIZE = 8;

        /** The arr. */
        private int[] arr = new int[ARRAY_SIZE];

        /** The r. */
        private int r = 0;
        /** The w. */
        private int w = 0;

        /**
         * Put data.
         * 
         * @param dataParam
         *            the data
         */
        public synchronized void putData(final int dataParam) {
            while (w - r >= ARRAY_SIZE) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // ignore
                }
            }
            w++;
            arr[w % arr.length] = dataParam;
            notifyAll();
        }

        /**
         * Pop data.
         * 
         * @return the int
         */
        public synchronized int popData() {
            while (w - r <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // ignore
                }
            }
            r++;
            int value = arr[r % arr.length];
            notifyAll();
            return value;
        }
    }

    /**
     * The Class ProducerThread.
     */
    class ProducerThread implements Runnable {

        /**
         * {@inheritDoc}
         */
        public void run() {
            int i = 0;
            for (int c = 0; c < SimplePCO.numberOfLoops; c++) {
                data.putData(i++);
            }
            finishedP = true;
        }
    }

    /**
     * The Class ConsumerThread.
     */
    class ConsumerThread implements Runnable {

        /**
         * {@inheritDoc}
         */
        public void run() {
            for (int c = 0; c < SimplePCO.numberOfLoops; c++) {
                data.popData();
            }
            finishedC = true;
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
        int localNumberOfLoops = DEFAULT_NUMBER_OF_LOOPS;
        try {
            localNumberOfLoops = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // ignore
        }
        main(localNumberOfLoops);
    }

    /**
     * Main.
     * 
     * @param numberOfLoopsParam
     *            the number of loops
     */
    public static void main(final int numberOfLoopsParam) {
        new SimplePCO(numberOfLoopsParam);
        while (!(finishedP && finishedC)) {
            // no statement
        }
        finishedP = false;
        finishedC = false;
    }

}
