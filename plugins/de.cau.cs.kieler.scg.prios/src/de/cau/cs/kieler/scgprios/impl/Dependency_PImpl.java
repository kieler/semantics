/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.Dependency_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Dependency_PImpl#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Dependency_PImpl#isConfluent <em>Confluent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dependency_PImpl extends Link_PImpl implements Dependency_P {
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
    protected Dependency_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.DEPENDENCY_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConcurrent() {
        return concurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrent(boolean newConcurrent) {
        boolean oldConcurrent = concurrent;
        concurrent = newConcurrent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPENDENCY_P__CONCURRENT, oldConcurrent, concurrent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConfluent() {
        return confluent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfluent(boolean newConfluent) {
        boolean oldConfluent = confluent;
        confluent = newConfluent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPENDENCY_P__CONFLUENT, oldConfluent, confluent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgpriosPackage.DEPENDENCY_P__CONCURRENT:
                return isConcurrent();
            case ScgpriosPackage.DEPENDENCY_P__CONFLUENT:
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
            case ScgpriosPackage.DEPENDENCY_P__CONCURRENT:
                setConcurrent((Boolean)newValue);
                return;
            case ScgpriosPackage.DEPENDENCY_P__CONFLUENT:
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
            case ScgpriosPackage.DEPENDENCY_P__CONCURRENT:
                setConcurrent(CONCURRENT_EDEFAULT);
                return;
            case ScgpriosPackage.DEPENDENCY_P__CONFLUENT:
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
            case ScgpriosPackage.DEPENDENCY_P__CONCURRENT:
                return concurrent != CONCURRENT_EDEFAULT;
            case ScgpriosPackage.DEPENDENCY_P__CONFLUENT:
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (concurrent: ");
        result.append(concurrent);
        result.append(", confluent: ");
        result.append(confluent);
        result.append(')');
        return result.toString();
    }

} //Dependency_PImpl
