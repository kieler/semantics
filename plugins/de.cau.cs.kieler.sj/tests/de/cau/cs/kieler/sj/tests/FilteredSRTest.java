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

import de.cau.cs.kieler.sj.examples.FilteredSR;
import static de.cau.cs.kieler.sj.Signal.*;
import junit.framework.TestCase;

/**
 * JUnit test for the SJ example FilteredSR.
 * 
 * @author mhei
 * 
 */
public class FilteredSRTest extends TestCase {

	/**
	 * Test case for FilteredSR.
	 */
	public void test() {
		FilteredSR sjp = new FilteredSR();
		// 1.
		sjp.doTick(sjp.s);
		assertEquals(sjp.off.isPresent(), PRESENT);
		// 2.
		sjp.doTick(sjp.s);
		assertEquals(sjp.on.isPresent(), PRESENT);
		// 3.
		sjp.doTick(sjp.s);
		assertEquals(sjp.on.isPresent(), PRESENT);
		// 4.
		sjp.doTick(sjp.s);
		assertEquals(sjp.on.isPresent(), PRESENT);
		// 5.
		sjp.doTick();
		assertEquals(sjp.on.isPresent(), PRESENT);
		// 6.
		sjp.doTick(sjp.r);
		assertEquals(sjp.on.isPresent(), PRESENT);
		// 7.
		sjp.doTick(sjp.r);
		assertEquals(sjp.off.isPresent(), PRESENT);
		// 8.
		sjp.doTick(sjp.r);
		assertEquals(sjp.off.isPresent(), PRESENT);
		// 9.
		sjp.doTick();
		assertEquals(sjp.off.isPresent(), PRESENT);

	}
}
