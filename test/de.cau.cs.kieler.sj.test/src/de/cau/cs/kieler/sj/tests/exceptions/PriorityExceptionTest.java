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
import de.cau.cs.kieler.sj.exceptions.PriorityException;
import junit.framework.TestCase;

/**
 * JUnit test to test if a {@link sj.exceptions.PriorityException} is thrown in
 * situations it should.
 * 
 * @author mhei
 * 
 */
public class PriorityExceptionTest extends TestCase {

	/**
	 * The labels used for the different parts of the program.
	 */
	enum StateLabel {
		INIT, LABEL_0, LABEL_1, LABEL_2, LABEL_3
	}

	/**
	 * The test case to run the test program and control the behavier.
	 */
	public void test() {
		TestProgram sjp = new TestProgram();
		sjp.doTick();

		boolean exceptionOccurred = false;
		try {
			sjp.doTick();
		} catch (PriorityException e) {
			exceptionOccurred = true;
		}
		assertTrue(exceptionOccurred);
	}

	/**
	 * The inner class with the test program.
	 */
	private class TestProgram extends SJProgram<StateLabel> {

		// CHECKSTYLEOFF MagicNumber
		// Priority's are part of the concept and not magic numbers

		/**
		 * Starts a new instance of the test program.
		 */
		public TestProgram() {
			super(StateLabel.INIT, 3);
		}

		@Override
		public void tick() {
			while (!isTickDone()) {
				switch (state()) {
				case INIT:
					prioB(StateLabel.LABEL_0, 2);
					break;
				case LABEL_0:
					pauseB(StateLabel.LABEL_1);
					break;
				case LABEL_1:
					fork(StateLabel.LABEL_2, 1);
					forkEB(StateLabel.LABEL_3);
					break;
				case LABEL_2:
					termB();
					break;
				case LABEL_3:
					prioB(StateLabel.LABEL_2, 1);
					break;
				}
			}
		}
	}
}
