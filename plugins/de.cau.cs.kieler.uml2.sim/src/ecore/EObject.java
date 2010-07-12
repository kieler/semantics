/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecore;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.EcorePackage#getEObject()
 * @model
 * @generated
 */
public interface EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EClass eClass();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean eIsProxy();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Resource eResource();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    org.eclipse.emf.ecore.EObject eContainer();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EStructuralFeature eContainingFeature();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EReference eContainmentFeature();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model many="false"
     * @generated
     */
    EList<EObject> eContents();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    TreeIterator<EObject> eAllContents();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model many="false"
     * @generated
     */
    EList<EObject> eCrossReferences();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Object eGet(EStructuralFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Object eGet(EStructuralFeature feature, boolean resolve);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void eSet(EStructuralFeature feature, Object newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean eIsSet(EStructuralFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void eUnset(EStructuralFeature feature);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model exceptions="ecore.EInvocationTargetException" argumentsMany="false"
     * @generated
     */
    Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException;

} // EObject
