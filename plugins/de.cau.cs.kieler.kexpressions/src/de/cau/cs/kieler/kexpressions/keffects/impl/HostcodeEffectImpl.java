/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.TextExpression;

import de.cau.cs.kieler.kexpressions.keffects.HostcodeEffect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;
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
 * An implementation of the model object '<em><b>Hostcode Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.impl.HostcodeEffectImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostcodeEffectImpl extends AnnotatableImpl implements HostcodeEffect {
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
     * The default value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected static final String TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected String text = TEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HostcodeEffectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KEffectsPackage.Literals.HOSTCODE_EFFECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE);
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
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS);
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
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText() {
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setText(String newText) {
        String oldText = text;
        text = newText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KEffectsPackage.HOSTCODE_EFFECT__TEXT, oldText, text));
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
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
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
            case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
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
            case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE:
                return getSchedule();
            case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS:
                return getOutgoingLinks();
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
                return getIncomingLinks();
            case KEffectsPackage.HOSTCODE_EFFECT__TEXT:
                return getText();
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
            case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__TEXT:
                setText((String)newValue);
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
            case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE:
                getSchedule().clear();
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case KEffectsPackage.HOSTCODE_EFFECT__TEXT:
                setText(TEXT_EDEFAULT);
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
            case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case KEffectsPackage.HOSTCODE_EFFECT__TEXT:
                return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
                case KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == Expression.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == TextExpression.class) {
            switch (derivedFeatureID) {
                case KEffectsPackage.HOSTCODE_EFFECT__TEXT: return KExpressionsPackage.TEXT_EXPRESSION__TEXT;
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
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return KEffectsPackage.HOSTCODE_EFFECT__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return KEffectsPackage.HOSTCODE_EFFECT__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return KEffectsPackage.HOSTCODE_EFFECT__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == Expression.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == TextExpression.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.TEXT_EXPRESSION__TEXT: return KEffectsPackage.HOSTCODE_EFFECT__TEXT;
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
        result.append(" (text: ");
        result.append(text);
        result.append(')');
        return result.toString();
    }

} //HostcodeEffectImpl
