/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.InstanceSpecification;
import uml.Slot;
import uml.StructuralFeature;
import uml.UmlPackage;
import uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link uml.impl.SlotImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uml.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl extends ElementImpl implements Slot {
    /**
     * The cached value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefiningFeature()
     * @generated
     * @ordered
     */
    protected StructuralFeature definingFeature;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected EList<ValueSpecification> value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SlotImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getSlot();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature getDefiningFeature() {
        if (definingFeature != null && definingFeature.eIsProxy()) {
            InternalEObject oldDefiningFeature = (InternalEObject)definingFeature;
            definingFeature = (StructuralFeature)eResolveProxy(oldDefiningFeature);
            if (definingFeature != oldDefiningFeature) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
            }
        }
        return definingFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature basicGetDefiningFeature() {
        return definingFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefiningFeature(StructuralFeature newDefiningFeature) {
        StructuralFeature oldDefiningFeature = definingFeature;
        definingFeature = newDefiningFeature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueSpecification> getValue() {
        if (value == null) {
            value = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UmlPackage.SLOT__VALUE);
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceSpecification getOwningInstance() {
        if (eContainerFeatureID() != UmlPackage.SLOT__OWNING_INSTANCE) return null;
        return (InstanceSpecification)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningInstance(InstanceSpecification newOwningInstance, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningInstance, UmlPackage.SLOT__OWNING_INSTANCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningInstance(InstanceSpecification newOwningInstance) {
        if (newOwningInstance != eInternalContainer() || (eContainerFeatureID() != UmlPackage.SLOT__OWNING_INSTANCE && newOwningInstance != null)) {
            if (EcoreUtil.isAncestor(this, newOwningInstance))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningInstance != null)
                msgs = ((InternalEObject)newOwningInstance).eInverseAdd(this, UmlPackage.INSTANCE_SPECIFICATION__SLOT, InstanceSpecification.class, msgs);
            msgs = basicSetOwningInstance(newOwningInstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.SLOT__OWNING_INSTANCE, newOwningInstance, newOwningInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.SLOT__OWNING_INSTANCE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningInstance((InstanceSpecification)otherEnd, msgs);
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
            case UmlPackage.SLOT__VALUE:
                return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
            case UmlPackage.SLOT__OWNING_INSTANCE:
                return basicSetOwningInstance(null, msgs);
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
            case UmlPackage.SLOT__OWNING_INSTANCE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INSTANCE_SPECIFICATION__SLOT, InstanceSpecification.class, msgs);
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
            case UmlPackage.SLOT__DEFINING_FEATURE:
                if (resolve) return getDefiningFeature();
                return basicGetDefiningFeature();
            case UmlPackage.SLOT__VALUE:
                return getValue();
            case UmlPackage.SLOT__OWNING_INSTANCE:
                return getOwningInstance();
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
            case UmlPackage.SLOT__DEFINING_FEATURE:
                setDefiningFeature((StructuralFeature)newValue);
                return;
            case UmlPackage.SLOT__VALUE:
                getValue().clear();
                getValue().addAll((Collection<? extends ValueSpecification>)newValue);
                return;
            case UmlPackage.SLOT__OWNING_INSTANCE:
                setOwningInstance((InstanceSpecification)newValue);
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
            case UmlPackage.SLOT__DEFINING_FEATURE:
                setDefiningFeature((StructuralFeature)null);
                return;
            case UmlPackage.SLOT__VALUE:
                getValue().clear();
                return;
            case UmlPackage.SLOT__OWNING_INSTANCE:
                setOwningInstance((InstanceSpecification)null);
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
            case UmlPackage.SLOT__DEFINING_FEATURE:
                return definingFeature != null;
            case UmlPackage.SLOT__VALUE:
                return value != null && !value.isEmpty();
            case UmlPackage.SLOT__OWNING_INSTANCE:
                return getOwningInstance() != null;
        }
        return super.eIsSet(featureID);
    }

} //SlotImpl
