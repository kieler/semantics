/**
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ReferenceDeclarationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ReferenceDeclarationImpl#getExtern <em>Extern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceDeclarationImpl extends DeclarationImpl implements ReferenceDeclaration {
    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected EObject reference;

    /**
     * The default value of the '{@link #getExtern() <em>Extern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtern()
     * @generated
     * @ordered
     */
    protected static final String EXTERN_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getExtern() <em>Extern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtern()
     * @generated
     * @ordered
     */
    protected String extern = EXTERN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.REFERENCE_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getReference() {
        if (reference != null && reference.eIsProxy()) {
            InternalEObject oldReference = (InternalEObject)reference;
            reference = eResolveProxy(oldReference);
            if (reference != oldReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE, oldReference, reference));
            }
        }
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReference(EObject newReference) {
        EObject oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExtern() {
        return extern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtern(String newExtern) {
        String oldExtern = extern;
        extern = newExtern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.REFERENCE_DECLARATION__EXTERN, oldExtern, extern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                if (resolve) return getReference();
                return basicGetReference();
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                return getExtern();
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                setReference((EObject)newValue);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                setExtern((String)newValue);
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                setReference((EObject)null);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                setExtern(EXTERN_EDEFAULT);
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                return reference != null;
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                return EXTERN_EDEFAULT == null ? extern != null : !EXTERN_EDEFAULT.equals(extern);
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
        result.append(" (extern: ");
        result.append(extern);
        result.append(')');
        return result.toString();
    }

} //ReferenceDeclarationImpl
