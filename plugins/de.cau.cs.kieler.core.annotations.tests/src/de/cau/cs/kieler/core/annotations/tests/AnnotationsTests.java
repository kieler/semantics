/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>annotations</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new AnnotationsTests("annotations Tests");
        suite.addTestSuite(AnnotationTest.class);
        suite.addTestSuite(StringAnnotationTest.class);
        suite.addTestSuite(ReferenceAnnotationTest.class);
        suite.addTestSuite(BooleanAnnotationTest.class);
        suite.addTestSuite(IntAnnotationTest.class);
        suite.addTestSuite(FloatAnnotationTest.class);
        suite.addTestSuite(ContainmentAnnotationTest.class);
        suite.addTestSuite(ImportAnnotationTest.class);
        suite.addTestSuite(TypedStringAnnotationTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationsTests(String name) {
        super(name);
    }

} //AnnotationsTests
