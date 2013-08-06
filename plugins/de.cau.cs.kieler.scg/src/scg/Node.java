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
 *   <li>{@link scg.Node#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
    /**
     * Returns the value of the '<em><b>Previous</b></em>' reference list.
     * The list contents are of type {@link scg.Node}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous</em>' reference list.
     * @see scg.ScgPackage#getNode_Previous()
     * @model
     * @generated
     */
    EList<Node> getPrevious();

} // Node
