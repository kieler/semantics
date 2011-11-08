/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.core.kexpressions.Variable;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.Substitution;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getBodyReference <em>Body Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getBodyContents <em>Body Contents</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getRenamings <em>Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl#getInterfaceDeclaration <em>Interface Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScopeImpl extends AnnotatableImpl implements Scope {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
    protected EList<Signal> signals;

    /**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
    protected EList<Variable> variables;

    /**
	 * The cached value of the '{@link #getSuspensionTrigger() <em>Suspension Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSuspensionTrigger()
	 * @generated
	 * @ordered
	 */
    protected Action suspensionTrigger;

    /**
	 * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExitActions()
	 * @generated
	 * @ordered
	 */
    protected EList<Action> exitActions;

    /**
	 * The cached value of the '{@link #getInnerActions() <em>Inner Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInnerActions()
	 * @generated
	 * @ordered
	 */
    protected EList<Action> innerActions;

    /**
	 * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEntryActions()
	 * @generated
	 * @ordered
	 */
    protected EList<Action> entryActions;

    /**
	 * The cached value of the '{@link #getBodyReference() <em>Body Reference</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBodyReference()
	 * @generated
	 * @ordered
	 */
    protected EObject bodyReference;

    /**
	 * The cached value of the '{@link #getBodyContents() <em>Body Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBodyContents()
	 * @generated
	 * @ordered
	 */
    protected EObject bodyContents;

    /**
	 * The cached value of the '{@link #getBodyText() <em>Body Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBodyText()
	 * @generated
	 * @ordered
	 */
    protected EList<TextualCode> bodyText;

    /**
	 * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRenamings()
	 * @generated
	 * @ordered
	 */
    protected EList<Substitution> renamings;

    /**
	 * The default value of the '{@link #getInterfaceDeclaration() <em>Interface Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterfaceDeclaration()
	 * @generated
	 * @ordered
	 */
    protected static final String INTERFACE_DECLARATION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getInterfaceDeclaration() <em>Interface Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterfaceDeclaration()
	 * @generated
	 * @ordered
	 */
    protected String interfaceDeclaration = INTERFACE_DECLARATION_EDEFAULT;

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
		return SyncchartsPackage.Literals.SCOPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLabel() {
		return label;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__LABEL, oldLabel, label));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, SyncchartsPackage.SCOPE__SIGNALS);
		}
		return signals;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, SyncchartsPackage.SCOPE__VARIABLES);
		}
		return variables;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Action getSuspensionTrigger() {
		return suspensionTrigger;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSuspensionTrigger(Action newSuspensionTrigger, NotificationChain msgs) {
		Action oldSuspensionTrigger = suspensionTrigger;
		suspensionTrigger = newSuspensionTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER, oldSuspensionTrigger, newSuspensionTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSuspensionTrigger(Action newSuspensionTrigger) {
		if (newSuspensionTrigger != suspensionTrigger) {
			NotificationChain msgs = null;
			if (suspensionTrigger != null)
				msgs = ((InternalEObject)suspensionTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER, null, msgs);
			if (newSuspensionTrigger != null)
				msgs = ((InternalEObject)newSuspensionTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER, null, msgs);
			msgs = basicSetSuspensionTrigger(newSuspensionTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER, newSuspensionTrigger, newSuspensionTrigger));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Action> getExitActions() {
		if (exitActions == null) {
			exitActions = new EObjectContainmentEList<Action>(Action.class, this, SyncchartsPackage.SCOPE__EXIT_ACTIONS);
		}
		return exitActions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Action> getInnerActions() {
		if (innerActions == null) {
			innerActions = new EObjectContainmentEList<Action>(Action.class, this, SyncchartsPackage.SCOPE__INNER_ACTIONS);
		}
		return innerActions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Action> getEntryActions() {
		if (entryActions == null) {
			entryActions = new EObjectContainmentEList<Action>(Action.class, this, SyncchartsPackage.SCOPE__ENTRY_ACTIONS);
		}
		return entryActions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EObject getBodyReference() {
		if (bodyReference != null && bodyReference.eIsProxy()) {
			InternalEObject oldBodyReference = (InternalEObject)bodyReference;
			bodyReference = eResolveProxy(oldBodyReference);
			if (bodyReference != oldBodyReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.SCOPE__BODY_REFERENCE, oldBodyReference, bodyReference));
			}
		}
		return bodyReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EObject basicGetBodyReference() {
		return bodyReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBodyReference(EObject newBodyReference) {
		EObject oldBodyReference = bodyReference;
		bodyReference = newBodyReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__BODY_REFERENCE, oldBodyReference, bodyReference));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EObject getBodyContents() {
		return bodyContents;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBodyContents(EObject newBodyContents, NotificationChain msgs) {
		EObject oldBodyContents = bodyContents;
		bodyContents = newBodyContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__BODY_CONTENTS, oldBodyContents, newBodyContents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBodyContents(EObject newBodyContents) {
		if (newBodyContents != bodyContents) {
			NotificationChain msgs = null;
			if (bodyContents != null)
				msgs = ((InternalEObject)bodyContents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SCOPE__BODY_CONTENTS, null, msgs);
			if (newBodyContents != null)
				msgs = ((InternalEObject)newBodyContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SCOPE__BODY_CONTENTS, null, msgs);
			msgs = basicSetBodyContents(newBodyContents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__BODY_CONTENTS, newBodyContents, newBodyContents));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<TextualCode> getBodyText() {
		if (bodyText == null) {
			bodyText = new EObjectContainmentEList<TextualCode>(TextualCode.class, this, SyncchartsPackage.SCOPE__BODY_TEXT);
		}
		return bodyText;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Substitution> getRenamings() {
		if (renamings == null) {
			renamings = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, SyncchartsPackage.SCOPE__RENAMINGS, SyncchartsPackage.SUBSTITUTION__PARENT_SCOPE);
		}
		return renamings;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getInterfaceDeclaration() {
		return interfaceDeclaration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInterfaceDeclaration(String newInterfaceDeclaration) {
		String oldInterfaceDeclaration = interfaceDeclaration;
		interfaceDeclaration = newInterfaceDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SCOPE__INTERFACE_DECLARATION, oldInterfaceDeclaration, interfaceDeclaration));
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
			case SyncchartsPackage.SCOPE__RENAMINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRenamings()).basicAdd(otherEnd, msgs);
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
			case SyncchartsPackage.SCOPE__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
				return basicSetSuspensionTrigger(null, msgs);
			case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
				return ((InternalEList<?>)getExitActions()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__INNER_ACTIONS:
				return ((InternalEList<?>)getInnerActions()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
				return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__BODY_CONTENTS:
				return basicSetBodyContents(null, msgs);
			case SyncchartsPackage.SCOPE__BODY_TEXT:
				return ((InternalEList<?>)getBodyText()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.SCOPE__RENAMINGS:
				return ((InternalEList<?>)getRenamings()).basicRemove(otherEnd, msgs);
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
			case SyncchartsPackage.SCOPE__ID:
				return getId();
			case SyncchartsPackage.SCOPE__LABEL:
				return getLabel();
			case SyncchartsPackage.SCOPE__SIGNALS:
				return getSignals();
			case SyncchartsPackage.SCOPE__VARIABLES:
				return getVariables();
			case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
				return getSuspensionTrigger();
			case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
				return getExitActions();
			case SyncchartsPackage.SCOPE__INNER_ACTIONS:
				return getInnerActions();
			case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
				return getEntryActions();
			case SyncchartsPackage.SCOPE__BODY_REFERENCE:
				if (resolve) return getBodyReference();
				return basicGetBodyReference();
			case SyncchartsPackage.SCOPE__BODY_CONTENTS:
				return getBodyContents();
			case SyncchartsPackage.SCOPE__BODY_TEXT:
				return getBodyText();
			case SyncchartsPackage.SCOPE__RENAMINGS:
				return getRenamings();
			case SyncchartsPackage.SCOPE__INTERFACE_DECLARATION:
				return getInterfaceDeclaration();
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
			case SyncchartsPackage.SCOPE__ID:
				setId((String)newValue);
				return;
			case SyncchartsPackage.SCOPE__LABEL:
				setLabel((String)newValue);
				return;
			case SyncchartsPackage.SCOPE__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case SyncchartsPackage.SCOPE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
				setSuspensionTrigger((Action)newValue);
				return;
			case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
				getExitActions().clear();
				getExitActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SyncchartsPackage.SCOPE__INNER_ACTIONS:
				getInnerActions().clear();
				getInnerActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
				getEntryActions().clear();
				getEntryActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SyncchartsPackage.SCOPE__BODY_REFERENCE:
				setBodyReference((EObject)newValue);
				return;
			case SyncchartsPackage.SCOPE__BODY_CONTENTS:
				setBodyContents((EObject)newValue);
				return;
			case SyncchartsPackage.SCOPE__BODY_TEXT:
				getBodyText().clear();
				getBodyText().addAll((Collection<? extends TextualCode>)newValue);
				return;
			case SyncchartsPackage.SCOPE__RENAMINGS:
				getRenamings().clear();
				getRenamings().addAll((Collection<? extends Substitution>)newValue);
				return;
			case SyncchartsPackage.SCOPE__INTERFACE_DECLARATION:
				setInterfaceDeclaration((String)newValue);
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
			case SyncchartsPackage.SCOPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SyncchartsPackage.SCOPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SyncchartsPackage.SCOPE__SIGNALS:
				getSignals().clear();
				return;
			case SyncchartsPackage.SCOPE__VARIABLES:
				getVariables().clear();
				return;
			case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
				setSuspensionTrigger((Action)null);
				return;
			case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
				getExitActions().clear();
				return;
			case SyncchartsPackage.SCOPE__INNER_ACTIONS:
				getInnerActions().clear();
				return;
			case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
				getEntryActions().clear();
				return;
			case SyncchartsPackage.SCOPE__BODY_REFERENCE:
				setBodyReference((EObject)null);
				return;
			case SyncchartsPackage.SCOPE__BODY_CONTENTS:
				setBodyContents((EObject)null);
				return;
			case SyncchartsPackage.SCOPE__BODY_TEXT:
				getBodyText().clear();
				return;
			case SyncchartsPackage.SCOPE__RENAMINGS:
				getRenamings().clear();
				return;
			case SyncchartsPackage.SCOPE__INTERFACE_DECLARATION:
				setInterfaceDeclaration(INTERFACE_DECLARATION_EDEFAULT);
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
			case SyncchartsPackage.SCOPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SyncchartsPackage.SCOPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SyncchartsPackage.SCOPE__SIGNALS:
				return signals != null && !signals.isEmpty();
			case SyncchartsPackage.SCOPE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
				return suspensionTrigger != null;
			case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
				return exitActions != null && !exitActions.isEmpty();
			case SyncchartsPackage.SCOPE__INNER_ACTIONS:
				return innerActions != null && !innerActions.isEmpty();
			case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
				return entryActions != null && !entryActions.isEmpty();
			case SyncchartsPackage.SCOPE__BODY_REFERENCE:
				return bodyReference != null;
			case SyncchartsPackage.SCOPE__BODY_CONTENTS:
				return bodyContents != null;
			case SyncchartsPackage.SCOPE__BODY_TEXT:
				return bodyText != null && !bodyText.isEmpty();
			case SyncchartsPackage.SCOPE__RENAMINGS:
				return renamings != null && !renamings.isEmpty();
			case SyncchartsPackage.SCOPE__INTERFACE_DECLARATION:
				return INTERFACE_DECLARATION_EDEFAULT == null ? interfaceDeclaration != null : !INTERFACE_DECLARATION_EDEFAULT.equals(interfaceDeclaration);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(", interfaceDeclaration: ");
		result.append(interfaceDeclaration);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
