/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.kexpressions.ReferenceDeclaration;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.ParameterizedReferenceDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getParameterizedReferenceDeclaration()
 * @model
 * @generated
 */
public interface ParameterizedReferenceDeclaration extends ReferenceDeclaration {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.GenericTypeParameterReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getParameterizedReferenceDeclaration_TypeParameters()
     * @model containment="true"
     * @generated
     */
    EList<GenericTypeParameterReference> getTypeParameters();

} // ParameterizedReferenceDeclaration
