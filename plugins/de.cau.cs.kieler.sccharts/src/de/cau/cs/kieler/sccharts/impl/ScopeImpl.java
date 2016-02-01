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

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.sccharts.Binding;
import de.cau.cs.kieler.sccharts.LocalAction;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

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
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getLocalActions <em>Local Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getReferencedScope <em>Referenced Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getExpression <em>Expression</em>}</li>
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
	 * The cached value of the '{@link #getLocalActions() <em>Local Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLocalActions()
	 * @generated
	 * @ordered
	 */
    protected EList<LocalAction> localActions;

    /**
	 * The cached value of the '{@link #getReferencedScope() <em>Referenced Scope</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferencedScope()
	 * @generated
	 * @ordered
	 */
    protected Scope referencedScope;

    /**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
    protected EList<Binding> bindings;

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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

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
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__LABEL, oldLabel, label));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LocalAction> getLocalActions() {
		if (localActions == null) {
			localActions = new EObjectContainmentEList<LocalAction>(LocalAction.class, this, SCChartsPackage.SCOPE__LOCAL_ACTIONS);
		}
		return localActions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Scope getReferencedScope() {
		if (referencedScope != null && referencedScope.eIsProxy()) {
			InternalEObject oldReferencedScope = (InternalEObject)referencedScope;
			referencedScope = (Scope)eResolveProxy(oldReferencedScope);
			if (referencedScope != oldReferencedScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.SCOPE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
			}
		}
		return referencedScope;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Scope basicGetReferencedScope() {
		return referencedScope;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReferencedScope(Scope newReferencedScope) {
		Scope oldReferencedScope = referencedScope;
		referencedScope = newReferencedScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, SCChartsPackage.SCOPE__BINDINGS);
		}
		return bindings;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Expression getExpression() {
		return expression;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__EXPRESSION, newExpression, newExpression));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
				return ((InternalEList<?>)getLocalActions()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.SCOPE__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.SCOPE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.SCOPE__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case SCChartsPackage.SCOPE__ID:
				return getId();
			case SCChartsPackage.SCOPE__LABEL:
				return getLabel();
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
				return getLocalActions();
			case SCChartsPackage.SCOPE__REFERENCED_SCOPE:
				if (resolve) return getReferencedScope();
				return basicGetReferencedScope();
			case SCChartsPackage.SCOPE__BINDINGS:
				return getBindings();
			case SCChartsPackage.SCOPE__DECLARATIONS:
				return getDeclarations();
			case SCChartsPackage.SCOPE__EXPRESSION:
				return getExpression();
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
			case SCChartsPackage.SCOPE__ID:
				setId((String)newValue);
				return;
			case SCChartsPackage.SCOPE__LABEL:
				setLabel((String)newValue);
				return;
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
				getLocalActions().clear();
				getLocalActions().addAll((Collection<? extends LocalAction>)newValue);
				return;
			case SCChartsPackage.SCOPE__REFERENCED_SCOPE:
				setReferencedScope((Scope)newValue);
				return;
			case SCChartsPackage.SCOPE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case SCChartsPackage.SCOPE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case SCChartsPackage.SCOPE__EXPRESSION:
				setExpression((Expression)newValue);
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
			case SCChartsPackage.SCOPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SCChartsPackage.SCOPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
				getLocalActions().clear();
				return;
			case SCChartsPackage.SCOPE__REFERENCED_SCOPE:
				setReferencedScope((Scope)null);
				return;
			case SCChartsPackage.SCOPE__BINDINGS:
				getBindings().clear();
				return;
			case SCChartsPackage.SCOPE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case SCChartsPackage.SCOPE__EXPRESSION:
				setExpression((Expression)null);
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
			case SCChartsPackage.SCOPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SCChartsPackage.SCOPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
				return localActions != null && !localActions.isEmpty();
			case SCChartsPackage.SCOPE__REFERENCED_SCOPE:
				return referencedScope != null;
			case SCChartsPackage.SCOPE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case SCChartsPackage.SCOPE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case SCChartsPackage.SCOPE__EXPRESSION:
				return expression != null;
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
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
