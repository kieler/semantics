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
 *   <li>{@link scg.Assignment#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Node {
    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(Link)
     * @see scg.ScgPackage#getAssignment_Next()
     * @model containment="true"
     * @generated
     */
    Link getNext();

    /**
     * Sets the value of the '{@link scg.Assignment#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Link value);

    /**
     * Returns the value of the '<em><b>Assignments</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignments</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' attribute.
     * @see #setAssignments(String)
     * @see scg.ScgPackage#getAssignment_Assignments()
     * @model
     * @generated
     */
    String getAssignments();

    /**
     * Sets the value of the '{@link scg.Assignment#getAssignments <em>Assignments</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assignments</em>' attribute.
     * @see #getAssignments()
     * @generated
     */
    void setAssignments(String value);

} // Assignment
