/**
 */
package scg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Link#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link scg.Node#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Node)
     * @see scg.ScgPackage#getLink_Target()
     * @see scg.Node#getIncoming
     * @model opposite="incoming" required="true"
     * @generated
     */
    Node getTarget();

    /**
     * Sets the value of the '{@link scg.Link#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Node value);

} // Link
