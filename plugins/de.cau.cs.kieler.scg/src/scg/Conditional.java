/**
 */
package scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Conditional#getThen <em>Then</em>}</li>
 *   <li>{@link scg.Conditional#getElse <em>Else</em>}</li>
 *   <li>{@link scg.Conditional#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Node {
    /**
     * Returns the value of the '<em><b>Then</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Then</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then</em>' reference.
     * @see #setThen(Node)
     * @see scg.ScgPackage#getConditional_Then()
     * @model
     * @generated
     */
    Node getThen();

    /**
     * Sets the value of the '{@link scg.Conditional#getThen <em>Then</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then</em>' reference.
     * @see #getThen()
     * @generated
     */
    void setThen(Node value);

    /**
     * Returns the value of the '<em><b>Else</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Else</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else</em>' reference.
     * @see #setElse(Node)
     * @see scg.ScgPackage#getConditional_Else()
     * @model
     * @generated
     */
    Node getElse();

    /**
     * Sets the value of the '{@link scg.Conditional#getElse <em>Else</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else</em>' reference.
     * @see #getElse()
     * @generated
     */
    void setElse(Node value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' attribute.
     * @see #setCondition(String)
     * @see scg.ScgPackage#getConditional_Condition()
     * @model
     * @generated
     */
    String getCondition();

    /**
     * Sets the value of the '{@link scg.Conditional#getCondition <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' attribute.
     * @see #getCondition()
     * @generated
     */
    void setCondition(String value);

} // Conditional
