/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EFactory#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement {
    /**
     * Returns the value of the '<em><b>EPackage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPackage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPackage</em>' reference.
     * @see #setEPackage(EPackage)
     * @see ecore.EcorePackage#getEFactory_EPackage()
     * @see ecore.EPackage#getEFactoryInstance
     * @model opposite="eFactoryInstance" resolveProxies="false" required="true" transient="true"
     * @generated
     */
    EPackage getEPackage();

    /**
     * Sets the value of the '{@link ecore.EFactory#getEPackage <em>EPackage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPackage</em>' reference.
     * @see #getEPackage()
     * @generated
     */
    void setEPackage(EPackage value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EObject create(EClass eClass);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Object createFromString(EDataType eDataType, String literalValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    String convertToString(EDataType eDataType, Object instanceValue);

} // EFactory
