/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ReferenceCall;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect;

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
 * An implementation of the model object '<em><b>Reference Call Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceCallEffectImpl extends EffectImpl implements ReferenceCallEffect {
    /**
     * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObject()
     * @generated
     * @ordered
     */
    protected ValuedObject valuedObject;

    /**
     * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndices()
     * @generated
     * @ordered
     */
    protected EList<Expression> indices;

    /**
     * The cached value of the '{@link #getSubReference() <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubReference()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference subReference;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceCallEffectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KEffectsPackage.Literals.REFERENCE_CALL_EFFECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getValuedObject() {
        if (valuedObject != null && valuedObject.eIsProxy()) {
            InternalEObject oldValuedObject = (InternalEObject)valuedObject;
            valuedObject = (ValuedObject)eResolveProxy(oldValuedObject);
            if (valuedObject != oldValuedObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT, oldValuedObject, valuedObject));
            }
        }
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetValuedObject() {
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValuedObject(ValuedObject newValuedObject) {
        ValuedObject oldValuedObject = valuedObject;
        valuedObject = newValuedObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT, oldValuedObject, valuedObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentEList<Expression>(Expression.class, this, KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES);
        }
        return indices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectReference getSubReference() {
        return subReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubReference(ValuedObjectReference newSubReference, NotificationChain msgs) {
        ValuedObjectReference oldSubReference = subReference;
        subReference = newSubReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE, oldSubReference, newSubReference);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubReference(ValuedObjectReference newSubReference) {
        if (newSubReference != subReference) {
            NotificationChain msgs = null;
            if (subReference != null)
                msgs = ((InternalEObject)subReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE, null, msgs);
            if (newSubReference != null)
                msgs = ((InternalEObject)newSubReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE, null, msgs);
            msgs = basicSetSubReference(newSubReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE, newSubReference, newSubReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                return basicSetSubReference(null, msgs);
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                return getIndices();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                return getSubReference();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                return getParameters();
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                setValuedObject((ValuedObject)newValue);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                getIndices().clear();
                getIndices().addAll((Collection<? extends Expression>)newValue);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)newValue);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Parameter>)newValue);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                setValuedObject((ValuedObject)null);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                getIndices().clear();
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)null);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                getParameters().clear();
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                return valuedObject != null;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                return indices != null && !indices.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                return subReference != null;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
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
        if (baseClass == Expression.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == ValuedObjectReference.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT: return KExpressionsPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT;
                case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES: return KExpressionsPackage.VALUED_OBJECT_REFERENCE__INDICES;
                case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE: return KExpressionsPackage.VALUED_OBJECT_REFERENCE__SUB_REFERENCE;
                default: return -1;
            }
        }
        if (baseClass == Call.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS: return KExpressionsPackage.CALL__PARAMETERS;
                default: return -1;
            }
        }
        if (baseClass == ReferenceCall.class) {
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
        if (baseClass == Expression.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == ValuedObjectReference.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT: return KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT;
                case KExpressionsPackage.VALUED_OBJECT_REFERENCE__INDICES: return KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES;
                case KExpressionsPackage.VALUED_OBJECT_REFERENCE__SUB_REFERENCE: return KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE;
                default: return -1;
            }
        }
        if (baseClass == Call.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.CALL__PARAMETERS: return KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS;
                default: return -1;
            }
        }
        if (baseClass == ReferenceCall.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ReferenceCallEffectImpl
