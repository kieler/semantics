/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ValuedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.DeclarationImpl#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.DeclarationImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeclarationImpl extends AnnotatableImpl implements Declaration {
    /**
     * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObjects()
     * @generated
     * @ordered
     */
    protected EList<ValuedObject> valuedObjects;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final AccessModifier ACCESS_EDEFAULT = AccessModifier.UNDEF;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected AccessModifier access = ACCESS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ValuedObject> getValuedObjects() {
        if (valuedObjects == null) {
            valuedObjects = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, KExpressionsPackage.DECLARATION__VALUED_OBJECTS);
        }
        return valuedObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessModifier getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccess(AccessModifier newAccess) {
        AccessModifier oldAccess = access;
        access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.DECLARATION__ACCESS, oldAccess, access));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.DECLARATION__VALUED_OBJECTS:
                return ((InternalEList<?>)getValuedObjects()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.DECLARATION__VALUED_OBJECTS:
                return getValuedObjects();
            case KExpressionsPackage.DECLARATION__ACCESS:
                return getAccess();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case KExpressionsPackage.DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                getValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
                return;
            case KExpressionsPackage.DECLARATION__ACCESS:
                setAccess((AccessModifier)newValue);
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
            case KExpressionsPackage.DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                return;
            case KExpressionsPackage.DECLARATION__ACCESS:
                setAccess(ACCESS_EDEFAULT);
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
            case KExpressionsPackage.DECLARATION__VALUED_OBJECTS:
                return valuedObjects != null && !valuedObjects.isEmpty();
            case KExpressionsPackage.DECLARATION__ACCESS:
                return access != ACCESS_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (access: ");
        result.append(access);
        result.append(')');
        return result.toString();
    }

} //DeclarationImpl
