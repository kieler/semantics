/**
 */
package scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Join#getFork <em>Fork</em>}</li>
 *   <li>{@link scg.Join#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Node {
    /**
     * Returns the value of the '<em><b>Fork</b></em>' reference.
     * It is bidirectional and its opposite is '{@link scg.Fork#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fork</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fork</em>' reference.
     * @see #setFork(Fork)
     * @see scg.ScgPackage#getJoin_Fork()
     * @see scg.Fork#getJoin
     * @model opposite="join" required="true"
     * @generated
     */
    Fork getFork();

    /**
     * Sets the value of the '{@link scg.Join#getFork <em>Fork</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fork</em>' reference.
     * @see #getFork()
     * @generated
     */
    void setFork(Fork value);

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
     * @see scg.ScgPackage#getJoin_Next()
     * @model
     * @generated
     */
    Node getNext();

    /**
     * Sets the value of the '{@link scg.Join#getNext <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Node value);

} // Join
