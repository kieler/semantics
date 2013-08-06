/**
 */
package scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Assignment#getNext <em>Next</em>}</li>
 *   <li>{@link scg.Assignment#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Node {
    /**
     * Returns the value of the '<em><b>Next</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' reference.
     * @see #setNext(Node)
     * @see scg.ScgPackage#getAssignment_Next()
     * @model
     * @generated
     */
    Node getNext();

    /**
     * Sets the value of the '{@link scg.Assignment#getNext <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Node value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' attribute.
     * @see #setAssignment(String)
     * @see scg.ScgPackage#getAssignment_Assignment()
     * @model
     * @generated
     */
    String getAssignment();

    /**
     * Sets the value of the '{@link scg.Assignment#getAssignment <em>Assignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assignment</em>' attribute.
     * @see #getAssignment()
     * @generated
     */
    void setAssignment(String value);

} // Assignment
