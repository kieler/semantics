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
import static  de.cau.cs.kieler.sj.Signal.*;
import  de.cau.cs.kieler.sj.examples.PrimeFactor;

/**
 * JUnit test cases for the Program {@link sj.examples.PrimeFactor}.
 * 
 * @author mhei
 *
 */
public class PrimeFactorTest extends TestCase {

    private PrimeFactor primeFactor;
    
    // CHECKSTYLEOFF MagicNumber
    // The 'magic numbers' are the expected outputs for this program.
    // We need them and it does not make any sense to replace them with constants. 

    /**
     * The first test case.
     */
    public void testCaseOne() {
        primeFactor = new PrimeFactor();
        // tick 0
        primeFactor.doTick();
        assertEquals(primeFactor.v.isPresent(), PRESENT);
        assertEquals(primeFactor.v.getValue(), 2);
        // tick 1
        primeFactor.doTick(primeFactor.b);
        assertEquals(primeFactor.v.isPresent(), PRESENT);
        assertEquals(primeFactor.v.getValue(), 5);

    }

    /**
     * The second test case.
     */
    public void testCaseTwo() {
        primeFactor = new PrimeFactor();
        // tick 0
        primeFactor.doTick();
        assertEquals(primeFactor.v.isPresent(), PRESENT);
        assertEquals(primeFactor.v.getValue(), 2);
        // tick 1
        primeFactor.doTick(primeFactor.a, primeFactor.b, primeFactor.c, primeFactor.d);
        assertEquals(primeFactor.v.isPresent(), PRESENT);
        assertEquals(primeFactor.v.getValue(), 11550);

    }
}
