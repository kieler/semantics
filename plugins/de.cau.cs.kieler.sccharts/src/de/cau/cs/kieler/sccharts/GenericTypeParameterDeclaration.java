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

import de.cau.cs.kieler.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.GenericTypeParameterDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getGenericTypeParameterDeclaration()
 * @model
 * @generated
 */
public interface GenericTypeParameterDeclaration extends Annotatable, GenericTypeParameter {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(GenericTypeParameterReference)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getGenericTypeParameterDeclaration_Type()
     * @model containment="true"
     * @generated
     */
    GenericTypeParameterReference getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.GenericTypeParameterDeclaration#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(GenericTypeParameterReference value);

} // GenericTypeParameterDeclaration
