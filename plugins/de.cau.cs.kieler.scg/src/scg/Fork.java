/**
 */
package scg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Fork#getJoin <em>Join</em>}</li>
 *   <li>{@link scg.Fork#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getFork()
 * @model
 * @generated
 */
public interface Fork extends Node {
    /**
     * Returns the value of the '<em><b>Join</b></em>' reference.
     * It is bidirectional and its opposite is '{@link scg.Join#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Join</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Join</em>' reference.
     * @see #setJoin(Join)
     * @see scg.ScgPackage#getFork_Join()
     * @see scg.Join#getFork
     * @model opposite="fork" required="true"
     * @generated
     */
    Join getJoin();

    /**
     * Sets the value of the '{@link scg.Fork#getJoin <em>Join</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Join</em>' reference.
     * @see #getJoin()
     * @generated
     */
    void setJoin(Join value);

    /**
     * Returns the value of the '<em><b>Next</b></em>' reference list.
     * The list contents are of type {@link scg.Node}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' reference list.
     * @see scg.ScgPackage#getFork_Next()
     * @model
     * @generated
     */
    EList<Node> getNext();

} // Fork
