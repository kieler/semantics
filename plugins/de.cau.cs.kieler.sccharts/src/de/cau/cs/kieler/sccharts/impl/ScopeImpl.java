/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.sccharts.LocalAction;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.ScopeCall;

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
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getGenericParameterDeclarations <em>Generic Parameter Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScopeImpl extends AnnotatableImpl implements Scope {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> declarations;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

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
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActions()
     * @generated
     * @ordered
     */
    protected EList<LocalAction> actions;

    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected ScopeCall reference;

    /**
     * The cached value of the '{@link #getGenericParameterDeclarations() <em>Generic Parameter Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericParameterDeclarations()
     * @generated
     * @ordered
     */
    protected EList<GenericParameterDeclaration> genericParameterDeclarations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScopeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.SCOPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.SCOPE__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, SCChartsPackage.SCOPE__SCHEDULE);
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
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, SCChartsPackage.SCOPE__OUTGOING_LINKS);
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
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, SCChartsPackage.SCOPE__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * edited by ssm to provide label/id service
     */
    @Override
    public String getLabel() {
        if (label != null) {
            return label;
        } else {
            return name;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<LocalAction> getActions() {
        if (actions == null) {
            actions = new EObjectContainmentEList<LocalAction>(LocalAction.class, this, SCChartsPackage.SCOPE__ACTIONS);
        }
        return actions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScopeCall getReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReference(ScopeCall newReference, NotificationChain msgs) {
        ScopeCall oldReference = reference;
        reference = newReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__REFERENCE, oldReference, newReference);
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
    public void setReference(ScopeCall newReference) {
        if (newReference != reference) {
            NotificationChain msgs = null;
            if (reference != null)
                msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__REFERENCE, null, msgs);
            if (newReference != null)
                msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__REFERENCE, null, msgs);
            msgs = basicSetReference(newReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__REFERENCE, newReference, newReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GenericParameterDeclaration> getGenericParameterDeclarations() {
        if (genericParameterDeclarations == null) {
            genericParameterDeclarations = new EObjectContainmentEList<GenericParameterDeclaration>(GenericParameterDeclaration.class, this, SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS);
        }
        return genericParameterDeclarations;
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
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
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
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__ACTIONS:
                return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__REFERENCE:
                return basicSetReference(null, msgs);
            case SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS:
                return ((InternalEList<?>)getGenericParameterDeclarations()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return getDeclarations();
            case SCChartsPackage.SCOPE__NAME:
                return getName();
            case SCChartsPackage.SCOPE__SCHEDULE:
                return getSchedule();
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
                return getOutgoingLinks();
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
                return getIncomingLinks();
            case SCChartsPackage.SCOPE__LABEL:
                return getLabel();
            case SCChartsPackage.SCOPE__ACTIONS:
                return getActions();
            case SCChartsPackage.SCOPE__REFERENCE:
                return getReference();
            case SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS:
                return getGenericParameterDeclarations();
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
            case SCChartsPackage.SCOPE__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCChartsPackage.SCOPE__NAME:
                setName((String)newValue);
                return;
            case SCChartsPackage.SCOPE__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.SCOPE__LABEL:
                setLabel((String)newValue);
                return;
            case SCChartsPackage.SCOPE__ACTIONS:
                getActions().clear();
                getActions().addAll((Collection<? extends LocalAction>)newValue);
                return;
            case SCChartsPackage.SCOPE__REFERENCE:
                setReference((ScopeCall)newValue);
                return;
            case SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS:
                getGenericParameterDeclarations().clear();
                getGenericParameterDeclarations().addAll((Collection<? extends GenericParameterDeclaration>)newValue);
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
            case SCChartsPackage.SCOPE__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SCChartsPackage.SCOPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SCChartsPackage.SCOPE__SCHEDULE:
                getSchedule().clear();
                return;
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case SCChartsPackage.SCOPE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case SCChartsPackage.SCOPE__ACTIONS:
                getActions().clear();
                return;
            case SCChartsPackage.SCOPE__REFERENCE:
                setReference((ScopeCall)null);
                return;
            case SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS:
                getGenericParameterDeclarations().clear();
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
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SCChartsPackage.SCOPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SCChartsPackage.SCOPE__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case SCChartsPackage.SCOPE__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case SCChartsPackage.SCOPE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case SCChartsPackage.SCOPE__ACTIONS:
                return actions != null && !actions.isEmpty();
            case SCChartsPackage.SCOPE__REFERENCE:
                return reference != null;
            case SCChartsPackage.SCOPE__GENERIC_PARAMETER_DECLARATIONS:
                return genericParameterDeclarations != null && !genericParameterDeclarations.isEmpty();
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
        if (baseClass == DeclarationScope.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.SCOPE__DECLARATIONS: return KExtPackage.DECLARATION_SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == Nameable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.SCOPE__NAME: return AnnotationsPackage.NAMED_OBJECT__NAME;
                default: return -1;
            }
        }
        if (baseClass == Schedulable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.SCOPE__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.SCOPE__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case SCChartsPackage.SCOPE__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
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
        if (baseClass == DeclarationScope.class) {
            switch (baseFeatureID) {
                case KExtPackage.DECLARATION_SCOPE__DECLARATIONS: return SCChartsPackage.SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == Nameable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.NAMED_OBJECT__NAME: return SCChartsPackage.SCOPE__NAME;
                default: return -1;
            }
        }
        if (baseClass == Schedulable.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return SCChartsPackage.SCOPE__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return SCChartsPackage.SCOPE__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return SCChartsPackage.SCOPE__INCOMING_LINKS;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //ScopeImpl
