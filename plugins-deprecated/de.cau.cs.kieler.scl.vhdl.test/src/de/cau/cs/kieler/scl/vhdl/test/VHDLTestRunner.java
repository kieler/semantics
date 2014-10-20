/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.vhdl.test;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.junit.runners.model.FrameworkMethod;

import de.cau.cs.kieler.semantics.test.common.runners.KielerTestRunner;


/**
 * @author gjo
 *
 */
public class VHDLTestRunner extends KielerTestRunner {

    /**
     * Instantiates a new vhdl test runner.
     * 
     * @param klass
     *            the klass
     * @throws Throwable
     *             the throwable
     */
    public VHDLTestRunner(final Class<?> clazz) throws Throwable {
        super(clazz);
    }

    /**
     * Force initialization of model/ESO files before the static method to
     * provide the test parameters is being called.
     * 
     * @param object
     *            the object
     */
    @Override
    public void initialize(final Object object) {
        if (object instanceof SCLVHDLAutomatedJUnitTest) {
            // Do the actual initialization.
            ((SCLVHDLAutomatedJUnitTest) object).SCLVHDLTestRunnerInitialization();
        }
    }

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

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTestName(final List<Object[]> parameterObjectList, final int parameterIndex,
            FrameworkMethod method) {
        // As there is a runner for every single test, we can use the runner name for the test as
        // well.
        return getRunnerName(parameterObjectList, parameterIndex);
    }
}
