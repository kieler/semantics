/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Dependency_P#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Dependency_P#isConfluent <em>Confluent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDependency_P()
 * @model
 * @generated
 */
public interface Dependency_P extends Link_P {
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDependency_P_Concurrent()
     * @model default="false"
     * @generated
     */
    boolean isConcurrent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Dependency_P#isConcurrent <em>Concurrent</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDependency_P_Confluent()
     * @model default="false"
     * @generated
     */
    boolean isConfluent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Dependency_P#isConfluent <em>Confluent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confluent</em>' attribute.
     * @see #isConfluent()
     * @generated
     */
    void setConfluent(boolean value);

} // Dependency_P
