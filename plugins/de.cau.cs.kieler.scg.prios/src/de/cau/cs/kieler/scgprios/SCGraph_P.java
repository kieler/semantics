/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Graph P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.SCGraph_P#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P()
 * @model
 * @generated
 */
public interface SCGraph_P extends Annotatable {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Node_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_Nodes()
     * @model containment="true"
     * @generated
     */
    EList<Node_P> getNodes();

    /**
     * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_Declarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getDeclarations();

    /**
     * Returns the value of the '<em><b>Basic Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.BasicBlock_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_BasicBlocks()
     * @model containment="true"
     * @generated
     */
    EList<BasicBlock_P> getBasicBlocks();

    /**
     * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Schedule_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schedules</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_Schedules()
     * @model containment="true"
     * @generated
     */
    EList<Schedule_P> getSchedules();

    /**
     * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Guard_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guards</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_Guards()
     * @model containment="true"
     * @generated
     */
    EList<Guard_P> getGuards();

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSCGraph_P_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.SCGraph_P#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // SCGraph_P
