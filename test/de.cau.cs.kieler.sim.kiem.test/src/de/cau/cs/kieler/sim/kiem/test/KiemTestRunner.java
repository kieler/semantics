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


/**
 * @author cmot
 * 
 */
public class KiemTestRunner extends KielerTestRunner {

    /**
     * Instantiates a new kiem test runner.
     *
     * @param klass the klass
     * @throws Throwable the throwable
     */
    public KiemTestRunner(final Class<?> klass) throws Throwable {
        super(klass);
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Force initialization of model/ESO files (and also of KIEM).
     *
     * @param object the object
     */
    @Override
    public void initialize(final Object object) {
        if (object instanceof KiemAutomatedJUnitTest) {
            // Do the actual initialization.
            ((KiemAutomatedJUnitTest) object).kiemAutomatedJUnitTestInitialization();
        }
    }

    //-------------------------------------------------------------------------
    
}
