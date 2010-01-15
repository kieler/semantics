/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.eclipse.emf.ecore.EObject;

import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RunnableAnimation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Animation#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Animation#getAccessID <em>Access ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Animation#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation()
 * @model abstract="true"
 * @generated
 */
public interface Animation extends EObject {

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation_Input()
     * @model required="true"
     * @generated
     */
    String getInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Animation#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #getInput()
     * @generated
     */
    void setInput(String value);

    /**
     * Returns the value of the '<em><b>Access ID</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access ID</em>' attribute.
     * @see #setAccessID(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation_AccessID()
     * @model default=""
     * @generated
     */
    String getAccessID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Animation#getAccessID <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access ID</em>' attribute.
     * @see #getAccessID()
     * @generated
     */
    void setAccessID(String value);

    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation_Key()
     * @model default=""
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Animation#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    String getActualJSONValue(Object jsonObject, String svgElementID);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void apply(Object jsonObject, String svgElementID);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void initialize();

} // RunnableAnimation
