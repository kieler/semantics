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

import static de.cau.cs.kieler.sj.Signal.*;
import de.cau.cs.kieler.sj.examples.GRCbal3;
import junit.framework.TestCase;

/**
 * JUnit test cases to test the right behavior of the example GRCbal3. The test
 * case is also used to test if SJ is working correct for this program.
 * 
 * @author mhei
 * 
 */
public class GRCbal3Test extends TestCase {

	private GRCbal3 grcbal3;

	/**
	 * The first test case.
	 */
	public void testCaseOne() {
		grcbal3 = new GRCbal3();

		// first tick
		grcbal3.doTick(grcbal3.a);
		assertEquals(grcbal3.a.isPresent(), PRESENT);
		assertEquals(grcbal3.b.isPresent(), PRESENT);
		assertEquals(grcbal3.c.isPresent(), PRESENT);
		assertEquals(grcbal3.d.isPresent(), PRESENT);
		assertEquals(grcbal3.e.isPresent(), PRESENT);
		assertEquals(grcbal3.t.isPresent(), PRESENT);

		// second tick not necessary because the program terminates after the
		// first
		// tick
		/*
		 * grcbal3.doTick(); assertEquals(grcbal3.A.isPresent(), ABSENT);
		 * assertEquals(grcbal3.B.isPresent(), ABSENT);
		 * assertEquals(grcbal3.C.isPresent(), ABSENT);
		 * assertEquals(grcbal3.D.isPresent(), ABSENT);
		 * assertEquals(grcbal3.E.isPresent(), ABSENT);
		 * assertEquals(grcbal3.T.isPresent(), ABSENT);
		 */

	}

	/**
	 * The second test case.
	 */
	public void testCaseTwo() {
		grcbal3 = new GRCbal3();

		// first tick
		grcbal3.doTick();
		assertEquals(grcbal3.a.isPresent(), ABSENT);
		assertEquals(grcbal3.b.isPresent(), ABSENT);
		assertEquals(grcbal3.c.isPresent(), ABSENT);
		assertEquals(grcbal3.d.isPresent(), ABSENT);
		assertEquals(grcbal3.e.isPresent(), ABSENT);
		assertEquals(grcbal3.t.isPresent(), ABSENT);

		// second tick
		grcbal3.doTick();
		assertEquals(grcbal3.a.isPresent(), ABSENT);
		assertEquals(grcbal3.b.isPresent(), PRESENT);
		assertEquals(grcbal3.c.isPresent(), ABSENT);
		assertEquals(grcbal3.d.isPresent(), ABSENT);
		assertEquals(grcbal3.e.isPresent(), ABSENT);
		assertEquals(grcbal3.t.isPresent(), ABSENT);
	}

}
