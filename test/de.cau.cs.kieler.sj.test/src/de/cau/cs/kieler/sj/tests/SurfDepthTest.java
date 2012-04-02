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
import de.cau.cs.kieler.sj.examples.SurfDepth;

/**
 * Test cases to test the program {@link sj.examples.SurfDepth}.
 * 
 * @author mhei
 * 
 */
public class SurfDepthTest extends TestCase {

	private SurfDepth program;

	/**
	 * The first test case.
	 */
	public void testOne() {

		program = new SurfDepth();

		// tick 0
		program.doTick(program.a0, program.a1);
		assertFalse(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 1
		program.doTick(program.a0, program.a1);
		assertFalse(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertTrue(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 2
		program.doTick(program.a0, program.a1);
		assertFalse(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertTrue(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 3
		program.doTick(program.a0, program.a1);
		assertFalse(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 4
		program.doTick(program.a0, program.a1);
		assertFalse(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertTrue(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

	}

	/**
	 * The second test case.
	 */
	public void testTwo() {
		program = new SurfDepth();

		// tick 0
		program.doTick(program.b0, program.b1);
		assertFalse(program.a0.isPresent());
		assertFalse(program.a1.isPresent());
		assertTrue(program.b0.isPresent());
		assertTrue(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertTrue(program.v0.isPresent());
		assertTrue(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 1
		program.doTick(program.b0, program.b1);
		assertFalse(program.a0.isPresent());
		assertFalse(program.a1.isPresent());
		assertTrue(program.b0.isPresent());
		assertTrue(program.b1.isPresent());
		assertFalse(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertTrue(program.v0.isPresent());
		assertTrue(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 2
		program.doTick(program.b0, program.c1);
		assertFalse(program.a0.isPresent());
		assertFalse(program.a1.isPresent());
		assertTrue(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertTrue(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertTrue(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());

		// tick 3
		program.doTick(program.b0, program.c1);
		assertFalse(program.a0.isPresent());
		assertFalse(program.a1.isPresent());
		assertTrue(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertTrue(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertFalse(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertTrue(program.w1.isPresent());

		// tick 4
		program.doTick(program.b0, program.c1);
		assertFalse(program.a0.isPresent());
		assertFalse(program.a1.isPresent());
		assertTrue(program.b0.isPresent());
		assertFalse(program.b1.isPresent());
		assertTrue(program.c1.isPresent());
		assertFalse(program.u0.isPresent());
		assertFalse(program.u1.isPresent());
		assertTrue(program.v0.isPresent());
		assertFalse(program.v1.isPresent());
		assertFalse(program.w1.isPresent());
	}

}
