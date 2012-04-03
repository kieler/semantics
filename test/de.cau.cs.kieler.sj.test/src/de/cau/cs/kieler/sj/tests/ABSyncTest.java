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
package de.cau.cs.kieler.sj.tests;

import junit.framework.TestCase;
import de.cau.cs.kieler.sj.examples.ABSync;

/**
 * JUnit test cases for the Program ABRO. This class tests the SJ framework by making sure that ABRO
 * works.
 * 
 * @author mhei, cmot
 * 
 */
public class ABSyncTest extends TestCase {

    private ABSync absync;

    // CHECKSTYLEOFF MagicNumber
    // The 'magic numbers' are the expected outputs for this program.
    // We need them and it does not make any sense to replace them with constants.

    /**
     * Test case one to test the behavior of ABSync.
     */
    public void testOne() {
    	absync = new ABSync();
        /* tick 1 */
    	absync.doTick();
        assertEquals(absync.getTickNr(), 0);
        assertFalse(absync.AB.isPresent());

        /* tick 2 */
        absync.doTick(absync.A);
        assertEquals(absync.getTickNr(), 1);
        assertFalse(absync.AB.isPresent());

        /* tick 3 */
        absync.doTick(absync.B);
        assertEquals(absync.getTickNr(), 2);
        assertTrue(absync.AB.isPresent());
    }

    /**
     * Test case one to test the behavior of ABSync.
     */
    public void testTwo() {
    	absync = new ABSync();
        /* tick 1 */
    	absync.doTick();
        assertEquals(absync.getTickNr(), 0);
        assertFalse(absync.AB.isPresent());

        /* tick 2 */
        absync.doTick(absync.A);
        assertEquals(absync.getTickNr(), 1);
        assertFalse(absync.AB.isPresent());

        /* tick 3 */
        absync.doTick(absync.A);
        assertEquals(absync.getTickNr(), 2);
        assertFalse(absync.AB.isPresent());

        /* tick 4 */
        absync.doTick(absync.A);
        assertEquals(absync.getTickNr(), 3);
        assertFalse(absync.AB.isPresent());

        /* tick 5 */
        absync.doTick(absync.B);
        assertEquals(absync.getTickNr(), 4);
        assertFalse(absync.AB.isPresent());
    }

    
    /**
     * Test case one to test the behavior of ABSync.
     */
    public void testThree() {
    	absync = new ABSync();
        /* tick 1 */
    	absync.doTick();
        assertEquals(absync.getTickNr(), 0);
        assertFalse(absync.AB.isPresent());

        /* tick 2 */
        absync.doTick(absync.A);
        assertEquals(absync.getTickNr(), 1);
        assertFalse(absync.AB.isPresent());

        /* tick 3 */
        absync.doTick(absync.Reset);
        assertEquals(absync.getTickNr(), 2);
        assertFalse(absync.AB.isPresent());

        /* tick 3 */
        absync.doTick(absync.B);
        assertEquals(absync.getTickNr(), 2);
        assertFalse(absync.AB.isPresent());
    }

}
