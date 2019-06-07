/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.kexpressions.keffects.DataDependency;
import de.cau.cs.kieler.kexpressions.keffects.DataDependencyType;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.DataDependencyImpl#isConfluent <em>Confluent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDependencyImpl extends DependencyImpl implements DataDependency {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final DataDependencyType TYPE_EDEFAULT = DataDependencyType.IGNORE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DataDependencyType type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConcurrent()
     * @generated
     * @ordered
     */
    protected static final boolean CONCURRENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConcurrent()
     * @generated
     * @ordered
     */
    protected boolean concurrent = CONCURRENT_EDEFAULT;

    /**
     * The default value of the '{@link #isConfluent() <em>Confluent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfluent()
     * @generated
     * @ordered
     */
    protected static final boolean CONFLUENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConfluent() <em>Confluent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfluent()
     * @generated
     * @ordered
     */
    protected boolean confluent = CONFLUENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataDependencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KEffectsPackage.Literals.DATA_DEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataDependencyType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(DataDependencyType newType) {
        DataDependencyType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.DATA_DEPENDENCY__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isConcurrent() {
        return concurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConcurrent(boolean newConcurrent) {
        boolean oldConcurrent = concurrent;
        concurrent = newConcurrent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.DATA_DEPENDENCY__CONCURRENT, oldConcurrent, concurrent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isConfluent() {
        return confluent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfluent(boolean newConfluent) {
        boolean oldConfluent = confluent;
        confluent = newConfluent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.DATA_DEPENDENCY__CONFLUENT, oldConfluent, confluent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KEffectsPackage.DATA_DEPENDENCY__TYPE:
                return getType();
            case KEffectsPackage.DATA_DEPENDENCY__CONCURRENT:
                return isConcurrent();
            case KEffectsPackage.DATA_DEPENDENCY__CONFLUENT:
                return isConfluent();
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
            case KEffectsPackage.DATA_DEPENDENCY__TYPE:
                setType((DataDependencyType)newValue);
                return;
            case KEffectsPackage.DATA_DEPENDENCY__CONCURRENT:
                setConcurrent((Boolean)newValue);
                return;
            case KEffectsPackage.DATA_DEPENDENCY__CONFLUENT:
                setConfluent((Boolean)newValue);
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
            case KEffectsPackage.DATA_DEPENDENCY__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case KEffectsPackage.DATA_DEPENDENCY__CONCURRENT:
                setConcurrent(CONCURRENT_EDEFAULT);
                return;
            case KEffectsPackage.DATA_DEPENDENCY__CONFLUENT:
                setConfluent(CONFLUENT_EDEFAULT);
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
            case KEffectsPackage.DATA_DEPENDENCY__TYPE:
                return type != TYPE_EDEFAULT;
            case KEffectsPackage.DATA_DEPENDENCY__CONCURRENT:
                return concurrent != CONCURRENT_EDEFAULT;
            case KEffectsPackage.DATA_DEPENDENCY__CONFLUENT:
                return confluent != CONFLUENT_EDEFAULT;
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
        result.append(" (type: ");
        result.append(type);
        result.append(", concurrent: ");
        result.append(concurrent);
        result.append(", confluent: ");
        result.append(confluent);
        result.append(')');
        return result.toString();
    }

} //DataDependencyImpl
