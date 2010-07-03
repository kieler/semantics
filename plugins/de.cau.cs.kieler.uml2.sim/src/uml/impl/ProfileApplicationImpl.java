/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.NamedElement;
import uml.Profile;
import uml.ProfileApplication;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ProfileApplicationImpl#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link uml.impl.ProfileApplicationImpl#isIsStrict <em>Is Strict</em>}</li>
 *   <li>{@link uml.impl.ProfileApplicationImpl#getApplyingPackage <em>Applying Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl extends DirectedRelationshipImpl implements ProfileApplication {
    /**
     * The cached value of the '{@link #getAppliedProfile() <em>Applied Profile</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliedProfile()
     * @generated
     * @ordered
     */
    protected Profile appliedProfile;

    /**
     * The default value of the '{@link #isIsStrict() <em>Is Strict</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStrict()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STRICT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStrict() <em>Is Strict</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStrict()
     * @generated
     * @ordered
     */
    protected boolean isStrict = IS_STRICT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProfileApplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getProfileApplication();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Profile getAppliedProfile() {
        if (appliedProfile != null && appliedProfile.eIsProxy()) {
            InternalEObject oldAppliedProfile = (InternalEObject)appliedProfile;
            appliedProfile = (Profile)eResolveProxy(oldAppliedProfile);
            if (appliedProfile != oldAppliedProfile) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE, oldAppliedProfile, appliedProfile));
            }
        }
        return appliedProfile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Profile basicGetAppliedProfile() {
        return appliedProfile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAppliedProfile(Profile newAppliedProfile) {
        Profile oldAppliedProfile = appliedProfile;
        appliedProfile = newAppliedProfile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE, oldAppliedProfile, appliedProfile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStrict() {
        return isStrict;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStrict(boolean newIsStrict) {
        boolean oldIsStrict = isStrict;
        isStrict = newIsStrict;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE_APPLICATION__IS_STRICT, oldIsStrict, isStrict));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package getApplyingPackage() {
        if (eContainerFeatureID() != UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE) return null;
        return (uml.Package)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplyingPackage(uml.Package newApplyingPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newApplyingPackage, UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplyingPackage(uml.Package newApplyingPackage) {
        if (newApplyingPackage != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE && newApplyingPackage != null)) {
            if (EcoreUtil.isAncestor(this, newApplyingPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newApplyingPackage != null)
                msgs = ((InternalEObject)newApplyingPackage).eInverseAdd(this, UmlPackage.PACKAGE__PROFILE_APPLICATION, uml.Package.class, msgs);
            msgs = basicSetApplyingPackage(newApplyingPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE, newApplyingPackage, newApplyingPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPackage getAppliedDefinition() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENamedElement getAppliedDefinition(NamedElement namedElement) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetApplyingPackage((uml.Package)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                return basicSetApplyingPackage(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.PACKAGE__PROFILE_APPLICATION, uml.Package.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE:
                if (resolve) return getAppliedProfile();
                return basicGetAppliedProfile();
            case UmlPackage.PROFILE_APPLICATION__IS_STRICT:
                return isIsStrict();
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                return getApplyingPackage();
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
            case UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE:
                setAppliedProfile((Profile)newValue);
                return;
            case UmlPackage.PROFILE_APPLICATION__IS_STRICT:
                setIsStrict((Boolean)newValue);
                return;
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                setApplyingPackage((uml.Package)newValue);
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
            case UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE:
                setAppliedProfile((Profile)null);
                return;
            case UmlPackage.PROFILE_APPLICATION__IS_STRICT:
                setIsStrict(IS_STRICT_EDEFAULT);
                return;
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                setApplyingPackage((uml.Package)null);
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
            case UmlPackage.PROFILE_APPLICATION__APPLIED_PROFILE:
                return appliedProfile != null;
            case UmlPackage.PROFILE_APPLICATION__IS_STRICT:
                return isStrict != IS_STRICT_EDEFAULT;
            case UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE:
                return getApplyingPackage() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isStrict: ");
        result.append(isStrict);
        result.append(')');
        return result.toString();
    }

} //ProfileApplicationImpl
