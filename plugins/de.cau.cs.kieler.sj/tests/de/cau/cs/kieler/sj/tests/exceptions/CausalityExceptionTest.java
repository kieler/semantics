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
package de.cau.cs.kieler.sj.tests.exceptions;

import de.cau.cs.kieler.sj.SJProgram;
import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.exceptions.CausalityException;
import junit.framework.TestCase;

/**
 * JUnit test case to test if a {@link sj.exceptions.CausalityException} is
 * thrown if it should.
 * 
 * @author mhei
 * 
 */
public class CausalityExceptionTest extends TestCase {

	/**
	 * The labels used for the different parts of the program.
	 */
	enum StateLabel {
		STATE_0, STATE_1
	}

	/**
	 * The test case to test the behavior and run the test program.
	 */
	public void test() {
		TestProgram program = new TestProgram();
		program.activateCausalityCheck();
		program.doTick();
		assertEquals(program.a.isPresent(), Signal.PRESENT);

		boolean exceptionOccurred = false;
		try {
			program.doTick();
		} catch (CausalityException ce) {
			exceptionOccurred = true;
		}
		assertTrue(exceptionOccurred);
	}

	/**
	 * The inner test class.
	 */
	public class TestProgram extends SJProgram<StateLabel> {

		/**
		 * The signal used by the test program.
		 */
		// SUPPRESS CHECKSTYLE NEXT VisibilityModifierCheck
		public Signal a;

		/**
		 * Starts a new instance of the test program.
		 */
		public TestProgram() {
			super(StateLabel.STATE_0, 1);
			initSignals();
		}

		@Override
		public void tick() {
			while (!isTickDone()) {
				switch (state()) {
				case STATE_0:
					a.emit();
					pauseB(StateLabel.STATE_1);
					break;
				case STATE_1:
					if (!a.isPresent()) {
						a.emit();
					}
					termB();
					break;
				}
			}
		}
	}
}
