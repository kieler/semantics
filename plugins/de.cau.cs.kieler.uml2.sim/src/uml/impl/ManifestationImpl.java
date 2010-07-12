/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.Manifestation;
import uml.PackageableElement;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ManifestationImpl#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestationImpl extends AbstractionImpl implements Manifestation {
    /**
     * The cached value of the '{@link #getUtilizedElement() <em>Utilized Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtilizedElement()
     * @generated
     * @ordered
     */
    protected PackageableElement utilizedElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManifestationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getManifestation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageableElement getUtilizedElement() {
        if (utilizedElement != null && utilizedElement.eIsProxy()) {
            InternalEObject oldUtilizedElement = (InternalEObject)utilizedElement;
            utilizedElement = (PackageableElement)eResolveProxy(oldUtilizedElement);
            if (utilizedElement != oldUtilizedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement, utilizedElement));
            }
        }
        return utilizedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageableElement basicGetUtilizedElement() {
        return utilizedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUtilizedElement(PackageableElement newUtilizedElement) {
        PackageableElement oldUtilizedElement = utilizedElement;
        utilizedElement = newUtilizedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement, utilizedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
                if (resolve) return getUtilizedElement();
                return basicGetUtilizedElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
                setUtilizedElement((PackageableElement)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
                setUtilizedElement((PackageableElement)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlPackage.MANIFESTATION__UTILIZED_ELEMENT:
                return utilizedElement != null;
        }
        return super.eIsSet(featureID);
    }

} //ManifestationImpl
