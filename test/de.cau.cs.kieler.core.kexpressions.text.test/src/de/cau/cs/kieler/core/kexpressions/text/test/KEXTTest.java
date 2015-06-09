/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.text.test;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.text.KEXTStandaloneSetup;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath;


/**
 * JUnit Test Case for the KEXT
 * 
 * @author ssm
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(KEXTTestRunner.class)
@BundleId("de.cau.cs.kieler.core.kexpressions.text.test")
@ModelPath("tests/")
@ModelFilter("*.kext")
public class KEXTTest {

    // -------------------------------------------------------------------------
    // -- Injector & Setup
    // -------------------------------------------------------------------------
	
    /**
     * Provides a {@link ResourceSet} in order to load the models properly.
     * 
     * @return the required {@link ResourceSet}
     */
    @ModelCollectionTestRunner.ResourceSet
    public static ResourceSet getResourceSet() {
        return new KEXTStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(
                XtextResourceSet.class);
    }
    
    @Test
    public void serialize(final EObject effect) {
       System.out.println("Test");
    }
    

}
