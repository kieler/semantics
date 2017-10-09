/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.scl.ElseScope;
import de.cau.cs.kieler.scl.SCLPackage;

import de.cau.cs.kieler.scl.SequencePart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ElseScopeImpl#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseScopeImpl extends ScopeImpl implements ElseScope {
    /**
     * The default value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected static final boolean SEMICOLON_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected boolean semicolon = SEMICOLON_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElseScopeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCLPackage.Literals.ELSE_SCOPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSemicolon() {
        return semicolon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSemicolon(boolean newSemicolon) {
        boolean oldSemicolon = semicolon;
        semicolon = newSemicolon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.ELSE_SCOPE__SEMICOLON, oldSemicolon, semicolon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SCLPackage.ELSE_SCOPE__SEMICOLON:
                return isSemicolon();
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
            case SCLPackage.ELSE_SCOPE__SEMICOLON:
                setSemicolon((Boolean)newValue);
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
            case SCLPackage.ELSE_SCOPE__SEMICOLON:
                setSemicolon(SEMICOLON_EDEFAULT);
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
            case SCLPackage.ELSE_SCOPE__SEMICOLON:
                return semicolon != SEMICOLON_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == SequencePart.class) {
            switch (derivedFeatureID) {
                case SCLPackage.ELSE_SCOPE__SEMICOLON: return SCLPackage.SEQUENCE_PART__SEMICOLON;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == SequencePart.class) {
            switch (baseFeatureID) {
                case SCLPackage.SEQUENCE_PART__SEMICOLON: return SCLPackage.ELSE_SCOPE__SEMICOLON;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (semicolon: ");
        result.append(semicolon);
        result.append(')');
        return result.toString();
    }

} //ElseScopeImpl
