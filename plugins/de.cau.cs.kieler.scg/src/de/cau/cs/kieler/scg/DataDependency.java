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
package de.cau.cs.kieler.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.DataDependency#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.DataDependency#isConfluent <em>Confluent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.DataDependency#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getDataDependency()
 * @model
 * @generated
 */
public interface DataDependency extends Dependency {
    /**
     * Returns the value of the '<em><b>Concurrent</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent</em>' attribute.
     * @see #setConcurrent(boolean)
     * @see de.cau.cs.kieler.scg.ScgPackage#getDataDependency_Concurrent()
     * @model default="false"
     * @generated
     */
    boolean isConcurrent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.DataDependency#isConcurrent <em>Concurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent</em>' attribute.
     * @see #isConcurrent()
     * @generated
     */
    void setConcurrent(boolean value);

    /**
     * Returns the value of the '<em><b>Confluent</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confluent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Confluent</em>' attribute.
     * @see #setConfluent(boolean)
     * @see de.cau.cs.kieler.scg.ScgPackage#getDataDependency_Confluent()
     * @model default="false"
     * @generated
     */
    boolean isConfluent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.DataDependency#isConfluent <em>Confluent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confluent</em>' attribute.
     * @see #isConfluent()
     * @generated
     */
    void setConfluent(boolean value);

				/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.scg.DataDependencyType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.DataDependencyType
     * @see #setType(DataDependencyType)
     * @see de.cau.cs.kieler.scg.ScgPackage#getDataDependency_Type()
     * @model
     * @generated
     */
	DataDependencyType getType();

				/**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.DataDependency#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.DataDependencyType
     * @see #getType()
     * @generated
     */
	void setType(DataDependencyType value);

} // DataDependency
