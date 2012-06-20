/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.test;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.junit.runners.model.FrameworkMethod;

import de.cau.cs.kieler.core.test.runners.KielerTestRunner;

/**
 * This test runner is used by the KiemAutomatedJUnitTest. In the initialize() method it calls the 
 * kiemAutomatedJUnitTestInitialization() explicitly that will load KIEM and the execution schedule.
 * 
 * It further provides names for the tests derived from their corresponding ESO file's path names.
 * 
 * @author cmot
 * 
 */
public class KiemTestRunner extends KielerTestRunner {

    /**
     * Instantiates a new kiem test runner.
     * 
     * @param klass
     *            the klass
     * @throws Throwable
     *             the throwable
     */
    public KiemTestRunner(final Class<?> klass) throws Throwable {
        super(klass);
    }

    // -------------------------------------------------------------------------

    /**
     * Force initialization of model/ESO files (and also of KIEM) before the static method to
     * provide the test parameters is being called.
     * 
     * @param object
     *            the object
     */
    @Override
    public void initialize(final Object object) {
        if (object instanceof KiemAutomatedJUnitTest) {
            // Do the actual initialization.
            ((KiemAutomatedJUnitTest) object).kiemAutomatedJUnitTestInitialization();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRunnerName(final List<Object[]> parameterObjectList, final int parameterIndex) {
        Object[] objectArray = parameterObjectList.get(parameterIndex);
        IPath iPath = (IPath) objectArray[0];
        String name = iPath.toString();
        return name;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTestName(final List<Object[]> parameterObjectList, final int parameterIndex,
            final FrameworkMethod method) {
        return getRunnerName(parameterObjectList, parameterIndex);
    }

    // -------------------------------------------------------------------------

}
