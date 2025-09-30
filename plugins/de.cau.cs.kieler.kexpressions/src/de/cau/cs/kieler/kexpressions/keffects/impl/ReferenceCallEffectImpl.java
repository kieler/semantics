/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ReferenceCall;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Call Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.ReferenceCallEffectImpl#isSuper <em>Super</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceCallEffectImpl extends AnnotatableImpl implements ReferenceCallEffect {
    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected EList<ScheduleObjectReference> schedule;

    /**
     * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> outgoingLinks;

    /**
     * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> incomingLinks;

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
     * The default value of the '{@link #isSuper() <em>Super</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSuper()
     * @generated
     * @ordered
     */
    protected static final boolean SUPER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSuper() <em>Super</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSuper()
     * @generated
     * @ordered
     */
    protected boolean super_ = SUPER_EDEFAULT;

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
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getOutgoingLinks() {
        if (outgoingLinks == null) {
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS);
        }
        return outgoingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getIncomingLinks() {
        if (incomingLinks == null) {
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    public boolean isSuper() {
        return super_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuper(boolean newSuper) {
        boolean oldSuper = super_;
        super_ = newSuper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER, oldSuper, super_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE:
                return getSchedule();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS:
                return getOutgoingLinks();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                return getIncomingLinks();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                return getIndices();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                return getSubReference();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                return getParameters();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER:
                return isSuper();
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER:
                setSuper((Boolean)newValue);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE:
                getSchedule().clear();
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER:
                setSuper(SUPER_EDEFAULT);
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
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__VALUED_OBJECT:
                return valuedObject != null;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__INDICES:
                return indices != null && !indices.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUB_REFERENCE:
                return subReference != null;
            case KEffectsPackage.REFERENCE_CALL_EFFECT__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER:
                return super_ != SUPER_EDEFAULT;
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
        if (baseClass == Schedulable.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
                default: return -1;
            }
        }
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
                case KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER: return KExpressionsPackage.REFERENCE_CALL__SUPER;
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
        if (baseClass == Schedulable.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return KEffectsPackage.REFERENCE_CALL_EFFECT__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return KEffectsPackage.REFERENCE_CALL_EFFECT__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return KEffectsPackage.REFERENCE_CALL_EFFECT__INCOMING_LINKS;
                default: return -1;
            }
        }
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
                case KExpressionsPackage.REFERENCE_CALL__SUPER: return KEffectsPackage.REFERENCE_CALL_EFFECT__SUPER;
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
        result.append(" (super: ");
        result.append(super_);
        result.append(')');
        return result.toString();
    }

} //ReferenceCallEffectImpl
