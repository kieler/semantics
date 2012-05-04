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
import de.cau.cs.kieler.sj.examples.Shifter3;

/**
 * Test case for the SJ example {@link sj.examples.Shifter3}.
 * 
 * @author mhei
 * 
 */
public class Shifter3Test extends TestCase {

	// CHECKSTYLEOFF MagicNumber
	// The 'magic numbers' are the expected outputs for this program.
	// We need them and it does not make any sense to replace them with
	// constants.

	/**
	 * The test case to test the Shifter3 example.
	 */
	public void test() {
		Shifter3 program = new Shifter3();

		// tick 0
		program.doTick();
		assertFalse(program.s0.isPresent());
		assertFalse(program.s1.isPresent());
		assertFalse(program.o.isPresent());

		// tick 1
		// set start value to the number of the next tick
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertFalse(program.s0.isPresent());
		assertFalse(program.s1.isPresent());
		assertFalse(program.o.isPresent());

		// tick 2
		program.doTick();
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 1);
		assertFalse(program.s1.isPresent());
		assertFalse(program.o.isPresent());

		// tick 3
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertFalse(program.s0.isPresent());
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 1);
		assertFalse(program.o.isPresent());

		// tick 4
		program.doTick();
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 3);
		assertFalse(program.s1.isPresent());
		assertTrue(program.o.isPresent());
		assertEquals(program.o.getValue(), 1);

		// tick 5
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertFalse(program.s0.isPresent());
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 3);
		assertFalse(program.o.isPresent());

		// tick 6
		program.doTick();
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 5);
		assertFalse(program.s1.isPresent());
		assertTrue(program.o.isPresent());
		assertEquals(program.o.getValue(), 3);

		// tick 7
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertFalse(program.s0.isPresent());
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 5);
		assertFalse(program.o.isPresent());

		// tick 8
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 7);
		assertFalse(program.s1.isPresent());
		assertTrue(program.o.isPresent());
		assertEquals(program.o.getValue(), 5);

		// tick 9
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 8);
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 7);
		assertFalse(program.o.isPresent());

		// tick 10
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 9);
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 8);
		assertTrue(program.o.isPresent());
		assertEquals(program.o.getValue(), 7);

		// tick 11
		program.i.setStartValue(program.getTickNr() + 1);
		program.doTick(program.i);
		assertTrue(program.s0.isPresent());
		assertEquals(program.s0.getValue(), 10);
		assertTrue(program.s1.isPresent());
		assertEquals(program.s1.getValue(), 9);
		assertTrue(program.o.isPresent());
		assertEquals(program.o.getValue(), 8);

	}

}
