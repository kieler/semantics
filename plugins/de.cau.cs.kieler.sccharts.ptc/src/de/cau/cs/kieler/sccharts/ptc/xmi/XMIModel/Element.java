/**
 */
package de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getChildren <em>Children</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage#getElement_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage#getElement_Children()
     * @model containment="true"
     * @generated
     */
    EList<Element> getChildren();

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage#getElement_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Content</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Content</em>' attribute.
     * @see #setContent(String)
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage#getElement_Content()
     * @model
     * @generated
     */
    String getContent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getContent <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content</em>' attribute.
     * @see #getContent()
     * @generated
     */
    void setContent(String value);

} // Element
