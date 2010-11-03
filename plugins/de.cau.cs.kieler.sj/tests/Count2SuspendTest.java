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
package sj.tests;

import sj.examples.Count2Suspend;
import static sj.Signal.*;
import junit.framework.TestCase;

/**
 * JUnit test class for the Count2Suspend example.
 * 
 * @author mhei
 *
 */
public class Count2SuspendTest extends TestCase {

    /**
     * The test case for Count2Suspend.
     */
    public void test() {
        Count2Suspend c2s = new Count2Suspend();

        // first tick
        c2s.doTick(c2s.t);
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // second tick
        c2s.doTick();
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // third tick
        c2s.doTick(c2s.t);
        assertEquals(c2s.b0.isPresent(), PRESENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // fourth tick
        c2s.doTick(c2s.t, c2s.inhib);
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // fifth tick
        c2s.doTick();
        assertEquals(c2s.b0.isPresent(), PRESENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // sixth tick
        c2s.doTick(c2s.t, c2s.reset);
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // seventh tick
        c2s.doTick();
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // eighth tick
        c2s.doTick(c2s.t);
        assertEquals(c2s.b0.isPresent(), PRESENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // ninth tick
        c2s.doTick(c2s.t, c2s.inhib);
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), ABSENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), ABSENT);
        // tenth tick
        c2s.doTick(c2s.t);
        assertEquals(c2s.b0.isPresent(), ABSENT);
        assertEquals(c2s.b1.isPresent(), PRESENT);
        assertEquals(c2s.c.isPresent(), ABSENT);
        assertEquals(c2s.c0.isPresent(), PRESENT);
    }
}
