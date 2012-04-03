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
import de.cau.cs.kieler.sj.SJProgram;
import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.exceptions.NoPreSignalException;
import static de.cau.cs.kieler.sj.tests.PreTest.StateLabel.*;

/**
 * Program and test case to test the SJ method <code>pre</code>.
 * 
 * @author mhei
 * 
 */
public class PreTest extends TestCase {

	/**
	 * The different labels used for the different states of the program.
	 * 
	 */
	enum StateLabel {
		L_0, L_1, L_2, L_3
	}

	/**
	 * The test case. Executes the test.
	 */
	public void test() {
		TestProgram program = new TestProgram();
		program.doTick();
		program.doTick();
		program.doTick();

	}

	/**
	 * The inner class with the test program and tests.
	 */
	private class TestProgram extends SJProgram<StateLabel> {

		/**
		 * The signal used in the test program.
		 */
		private Signal a;

		/**
		 * Starts a new test program.
		 */
		public TestProgram() {
			super(L_0, 1);
			a = new Signal("a", 2);
			addSignals(a);
		}

		/**
		 * The program to test <code>pre</code> and the assertions.
		 */
		@Override
		public final void tick() {
			while (!isTickDone()) {
				switch (state()) {
				case L_0:
					a.emit();
					boolean exceptionOccurred = false;
					try {
						a.pre();
					} catch (NoPreSignalException e) {
						exceptionOccurred = true;
					}
					assertTrue(exceptionOccurred);
					pauseB(L_1);
					break;
				case L_1:
					assertTrue(a.pre().isPresent());
					pauseB(L_2);
					break;
				case L_2:
					a.emit();
					assertTrue(a.isPresent());
					assertFalse(a.pre().isPresent());
					assertTrue(a.pre().pre().isPresent());
					termB();
					break;
				}
			}
		}
	}
}
