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

import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.PolicyClassDeclaration#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getPolicyClassDeclaration()
 * @model
 * @generated
 */
public interface PolicyClassDeclaration extends ClassDeclaration {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policy</em>' containment reference.
     * @see #setPolicy(PolicyRegion)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getPolicyClassDeclaration_Policy()
     * @model containment="true"
     * @generated
     */
    PolicyRegion getPolicy();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.PolicyClassDeclaration#getPolicy <em>Policy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy</em>' containment reference.
     * @see #getPolicy()
     * @generated
     */
    void setPolicy(PolicyRegion value);

} // PolicyClassDeclaration
