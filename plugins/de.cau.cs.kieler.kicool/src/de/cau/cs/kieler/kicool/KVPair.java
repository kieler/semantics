/**
 */
package de.cau.cs.kieler.kicool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KV Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.KVPair#getKey <em>Key</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.KVPair#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.KVPair#isIsKeyValue <em>Is Key Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getKVPair()
 * @model
 * @generated
 */
public interface KVPair extends EObject {
    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getKVPair_Key()
     * @model
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.KVPair#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getKVPair_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.KVPair#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Is Key Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Key Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Key Value</em>' attribute.
     * @see #setIsKeyValue(boolean)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getKVPair_IsKeyValue()
     * @model
     * @generated
     */
    boolean isIsKeyValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.KVPair#isIsKeyValue <em>Is Key Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Key Value</em>' attribute.
     * @see #isIsKeyValue()
     * @generated
     */
    void setIsKeyValue(boolean value);

} // KVPair
