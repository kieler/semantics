/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link ecore.EClassifier#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link ecore.EClassifier#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link ecore.EClassifier#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecore.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedInstanceTypeName UniqueTypeParameterNames'"
 * @generated
 */
public interface EClassifier extends ENamedElement {
    /**
     * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance Class Name</em>' attribute.
     * @see #setInstanceClassName(String)
     * @see ecore.EcorePackage#getEClassifier_InstanceClassName()
     * @model unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
     * @generated
     */
    String getInstanceClassName();

    /**
     * Sets the value of the '{@link ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance Class Name</em>' attribute.
     * @see #getInstanceClassName()
     * @generated
     */
    void setInstanceClassName(String value);

    /**
     * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance Class</em>' attribute.
     * @see ecore.EcorePackage#getEClassifier_InstanceClass()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    Class<?> getInstanceClass();

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see ecore.EcorePackage#getEClassifier_DefaultValue()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    Object getDefaultValue();

    /**
     * Returns the value of the '<em><b>Instance Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Type Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance Type Name</em>' attribute.
     * @see #setInstanceTypeName(String)
     * @see ecore.EcorePackage#getEClassifier_InstanceTypeName()
     * @model unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
     * @generated
     */
    String getInstanceTypeName();

    /**
     * Sets the value of the '{@link ecore.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance Type Name</em>' attribute.
     * @see #getInstanceTypeName()
     * @generated
     */
    void setInstanceTypeName(String value);

    /**
     * Returns the value of the '<em><b>EPackage</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ecore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPackage</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPackage</em>' container reference.
     * @see ecore.EcorePackage#getEClassifier_EPackage()
     * @see ecore.EPackage#getEClassifiers
     * @model opposite="eClassifiers" changeable="false"
     * @generated
     */
    EPackage getEPackage();

    /**
     * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
     * The list contents are of type {@link ecore.ETypeParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EType Parameters</em>' containment reference list.
     * @see ecore.EcorePackage#getEClassifier_ETypeParameters()
     * @model containment="true"
     * @generated
     */
    EList<ETypeParameter> getETypeParameters();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean isInstance(Object object);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    int getClassifierID();

} // EClassifier
