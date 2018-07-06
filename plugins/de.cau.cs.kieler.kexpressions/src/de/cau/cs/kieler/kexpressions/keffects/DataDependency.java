/**
 */
package de.cau.cs.kieler.kexpressions.keffects;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConfluent <em>Confluent</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getDataDependency()
 * @model
 * @generated
 */
public interface DataDependency extends Dependency {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.keffects.DataDependencyType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
     * @see #setType(DataDependencyType)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getDataDependency_Type()
     * @model
     * @generated
     */
    DataDependencyType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.keffects.DataDependencyType
     * @see #getType()
     * @generated
     */
    void setType(DataDependencyType value);

    /**
     * Returns the value of the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent</em>' attribute.
     * @see #setConcurrent(boolean)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getDataDependency_Concurrent()
     * @model
     * @generated
     */
    boolean isConcurrent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConcurrent <em>Concurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent</em>' attribute.
     * @see #isConcurrent()
     * @generated
     */
    void setConcurrent(boolean value);

    /**
     * Returns the value of the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confluent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Confluent</em>' attribute.
     * @see #setConfluent(boolean)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getDataDependency_Confluent()
     * @model
     * @generated
     */
    boolean isConfluent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.DataDependency#isConfluent <em>Confluent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confluent</em>' attribute.
     * @see #isConfluent()
     * @generated
     */
    void setConfluent(boolean value);

} // DataDependency
