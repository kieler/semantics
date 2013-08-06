/**
 */
package scg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
    /**
     * Returns the value of the '<em><b>Incoming</b></em>' reference list.
     * The list contents are of type {@link scg.Link}.
     * It is bidirectional and its opposite is '{@link scg.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming</em>' reference list.
     * @see scg.ScgPackage#getNode_Incoming()
     * @see scg.Link#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<Link> getIncoming();

} // Node
