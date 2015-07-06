/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.test;

import com.google.inject.Injector;
import de.cau.cs.kieler.core.model.test.AbstractModelComparator;
import de.cau.cs.kieler.core.model.test.AbstractModelTransformationComparator;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

/**
 * Derived transformation comparator class to configure the comparison methods for the SCG model test.
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 */
public class SCGModelTransformationComparator extends
		AbstractModelTransformationComparator {

    /** Create injector */
    private static Injector injector = new SctStandaloneSetup()
    	.createInjectorAndDoEMFRegistration();
    
    /** The model comparator */
    private AbstractModelComparator modelComparator;
	
    /** 
     * The constructor creates an instance for the comparator. 
     */
    SCGModelTransformationComparator() {
	modelComparator = new SCGModelComparator();
    }
	
    /**
     * {@inheritDoc}
     */
    @Override
    protected AbstractModelComparator getModelComparator() {
	return modelComparator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector getResourceInjector() {
        return injector;
    }

}
