/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Sensor;
import de.cau.cs.kieler.esterel.SensorDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SensorDeclarationImpl#getValuedObjects <em>Valued Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDeclarationImpl extends AnnotatableImpl implements SensorDeclaration {
    /**
     * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObjects()
     * @generated
     * @ordered
     */
    protected EList<Sensor> valuedObjects;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SensorDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.SENSOR_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Sensor> getValuedObjects() {
        if (valuedObjects == null) {
            valuedObjects = new EObjectContainmentEList<Sensor>(Sensor.class, this, EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS);
        }
        return valuedObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS:
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
            case EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS:
                return getValuedObjects();
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
            case EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                getValuedObjects().addAll((Collection<? extends Sensor>)newValue);
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
            case EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
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
            case EsterelPackage.SENSOR_DECLARATION__VALUED_OBJECTS:
                return valuedObjects != null && !valuedObjects.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SensorDeclarationImpl
