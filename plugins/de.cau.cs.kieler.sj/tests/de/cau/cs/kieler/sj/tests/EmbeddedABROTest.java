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
import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.examples.EmbeddedABRO;

/**
 * JUnit test cases for the Program EmbeddedABRO. This class tests the SJ
 * framework by making sure that EmbeddedABRO works.
 * 
 * @author mhei
 * 
 */
public class EmbeddedABROTest extends TestCase {

	private EmbeddedABRO abro;

	// CHECKSTYLEOFF MagicNumber
	// The 'magic numbers' are the expected outputs for this program.
	// We need them and it does not make any sense to replace them with
	// constants.

	/**
	 * Test case one to test the behavior of ABRO.
	 */
	public void testOne() {
		abro = new EmbeddedABRO();
		/* First tick */
		abro.doTick();
		assertEquals(abro.getTickNr(), 0);
		assertFalse(abro.o.isPresent());

		/* Second tick */
		abro.doTick(abro.a);
		assertEquals(abro.getTickNr(), 1);
		assertFalse(abro.o.isPresent());

		/* Third tick */
		abro.doTick(abro.b);
		assertEquals(abro.getTickNr(), 2);
		assertTrue(abro.o.isPresent());

		/* Fourth tick */
		abro.doTick(abro.r);
		assertEquals(abro.getTickNr(), 3);
		assertFalse(abro.o.isPresent());

		/* Fifth tick */
		abro.doTick();
		assertEquals(abro.getTickNr(), 4);
		assertFalse(abro.o.isPresent());

	}

	/**
	 * Test case two to test the behavior of ABRO.
	 */
	public void testTwo() {
		abro = new EmbeddedABRO();
		/* First tick */
		abro.doTick(abro.a, abro.b);
		assertEquals(abro.getTickNr(), 0);
		assertEquals(abro.o.isPresent(), Signal.ABSENT);

		/* Second tick */
		abro.doTick(abro.a, abro.b);
		assertEquals(abro.getTickNr(), 1);
		assertEquals(abro.o.isPresent(), Signal.PRESENT);

		/* Third tick */
		abro.doTick();
		assertEquals(abro.getTickNr(), 2);
		assertEquals(abro.o.isPresent(), Signal.ABSENT);

		/* Fourth tick */
		abro.doTick(abro.r);
		assertEquals(abro.getTickNr(), 3);
		assertEquals(abro.o.isPresent(), Signal.ABSENT);

		/* Fifth tick */
		abro.doTick(abro.a, abro.b, abro.r);
		assertEquals(abro.getTickNr(), 4);
		assertEquals(abro.o.isPresent(), Signal.ABSENT);
	}
}
