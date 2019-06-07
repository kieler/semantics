/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.Block;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.esterel.EsterelStatement;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.SequencePart;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.impl.StatementContainerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.BlockImpl#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends StatementContainerImpl implements Block {
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
    protected BlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.BLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSemicolon() {
        return semicolon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSemicolon(boolean newSemicolon) {
        boolean oldSemicolon = semicolon;
        semicolon = newSemicolon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.BLOCK__SEMICOLON, oldSemicolon, semicolon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsterelPackage.BLOCK__SEMICOLON:
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
            case EsterelPackage.BLOCK__SEMICOLON:
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
            case EsterelPackage.BLOCK__SEMICOLON:
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
            case EsterelPackage.BLOCK__SEMICOLON:
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
                case EsterelPackage.BLOCK__SEMICOLON: return SCLPackage.SEQUENCE_PART__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == EsterelStatement.class) {
            switch (derivedFeatureID) {
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
                case SCLPackage.SEQUENCE_PART__SEMICOLON: return EsterelPackage.BLOCK__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == EsterelStatement.class) {
            switch (baseFeatureID) {
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (semicolon: ");
        result.append(semicolon);
        result.append(')');
        return result.toString();
    }

} //BlockImpl
