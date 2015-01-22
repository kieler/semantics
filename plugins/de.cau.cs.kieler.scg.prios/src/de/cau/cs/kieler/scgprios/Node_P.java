/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.annotations.Annotatable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Node_P#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Node_P#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Node_P#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Node_P#getNodePriority <em>Node Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getNode_P()
 * @model
 * @generated
 */
public interface Node_P extends Annotatable {
    /**
     * Returns the value of the '<em><b>Incoming</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Link_P}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Link_P#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming</em>' reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getNode_P_Incoming()
     * @see de.cau.cs.kieler.scgprios.Link_P#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<Link_P> getIncoming();

    /**
     * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Initial</em>' attribute.
     * @see #setIsInitial(boolean)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getNode_P_IsInitial()
     * @model
     * @generated
     */
    boolean isIsInitial();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Node_P#isIsInitial <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Initial</em>' attribute.
     * @see #isIsInitial()
     * @generated
     */
    void setIsInitial(boolean value);

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Dependency_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependencies</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getNode_P_Dependencies()
     * @model containment="true"
     * @generated
     */
    EList<Dependency_P> getDependencies();

    /**
     * Returns the value of the '<em><b>Node Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Priority</em>' attribute.
     * @see #setNodePriority(long)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getNode_P_NodePriority()
     * @model
     * @generated
     */
    long getNodePriority();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Node_P#getNodePriority <em>Node Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node Priority</em>' attribute.
     * @see #getNodePriority()
     * @generated
     */
    void setNodePriority(long value);

} // Node_P
