/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scg.Guard;
import de.cau.cs.kieler.scg.ScgPackage;

import de.cau.cs.kieler.scg.SchedulingBlock;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#isSchizophrenic <em>Schizophrenic</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getSchedulingBlockLink <em>Scheduling Block Link</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#isSequentialize <em>Sequentialize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends MinimalEObjectImpl.Container implements Guard {
    /**
	 * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValuedObject()
	 * @generated
	 * @ordered
	 */
    protected ValuedObject valuedObject;

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
	 * The default value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchizophrenic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHIZOPHRENIC_EDEFAULT = false;

				/**
	 * The cached value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchizophrenic()
	 * @generated
	 * @ordered
	 */
	protected boolean schizophrenic = SCHIZOPHRENIC_EDEFAULT;

				/**
	 * The cached value of the '{@link #getSchedulingBlockLink() <em>Scheduling Block Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingBlockLink()
	 * @generated
	 * @ordered
	 */
	protected SchedulingBlock schedulingBlockLink;

				/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedObject> volatile_;

				/**
	 * The default value of the '{@link #isSequentialize() <em>Sequentialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequentialize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQUENTIALIZE_EDEFAULT = true;

				/**
	 * The cached value of the '{@link #isSequentialize() <em>Sequentialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequentialize()
	 * @generated
	 * @ordered
	 */
	protected boolean sequentialize = SEQUENTIALIZE_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GuardImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.GUARD;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuedObject getValuedObject() {
		return valuedObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValuedObject(ValuedObject newValuedObject, NotificationChain msgs) {
		ValuedObject oldValuedObject = valuedObject;
		valuedObject = newValuedObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__VALUED_OBJECT, oldValuedObject, newValuedObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValuedObject(ValuedObject newValuedObject) {
		if (newValuedObject != valuedObject) {
			NotificationChain msgs = null;
			if (valuedObject != null)
				msgs = ((InternalEObject)valuedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.GUARD__VALUED_OBJECT, null, msgs);
			if (newValuedObject != null)
				msgs = ((InternalEObject)newValuedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.GUARD__VALUED_OBJECT, null, msgs);
			msgs = basicSetValuedObject(newValuedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__VALUED_OBJECT, newValuedObject, newValuedObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.GUARD__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.GUARD__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__EXPRESSION, newExpression, newExpression));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSchizophrenic() {
		return schizophrenic;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchizophrenic(boolean newSchizophrenic) {
		boolean oldSchizophrenic = schizophrenic;
		schizophrenic = newSchizophrenic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__SCHIZOPHRENIC, oldSchizophrenic, schizophrenic));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock getSchedulingBlockLink() {
		if (schedulingBlockLink != null && schedulingBlockLink.eIsProxy()) {
			InternalEObject oldSchedulingBlockLink = (InternalEObject)schedulingBlockLink;
			schedulingBlockLink = (SchedulingBlock)eResolveProxy(oldSchedulingBlockLink);
			if (schedulingBlockLink != oldSchedulingBlockLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.GUARD__SCHEDULING_BLOCK_LINK, oldSchedulingBlockLink, schedulingBlockLink));
			}
		}
		return schedulingBlockLink;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingBlock basicGetSchedulingBlockLink() {
		return schedulingBlockLink;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingBlockLink(SchedulingBlock newSchedulingBlockLink) {
		SchedulingBlock oldSchedulingBlockLink = schedulingBlockLink;
		schedulingBlockLink = newSchedulingBlockLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__SCHEDULING_BLOCK_LINK, oldSchedulingBlockLink, schedulingBlockLink));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedObject> getVolatile() {
		if (volatile_ == null) {
			volatile_ = new EObjectResolvingEList<ValuedObject>(ValuedObject.class, this, ScgPackage.GUARD__VOLATILE);
		}
		return volatile_;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSequentialize() {
		return sequentialize;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequentialize(boolean newSequentialize) {
		boolean oldSequentialize = sequentialize;
		sequentialize = newSequentialize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__SEQUENTIALIZE, oldSequentialize, sequentialize));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgPackage.GUARD__VALUED_OBJECT:
				return basicSetValuedObject(null, msgs);
			case ScgPackage.GUARD__EXPRESSION:
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
			case ScgPackage.GUARD__VALUED_OBJECT:
				return getValuedObject();
			case ScgPackage.GUARD__EXPRESSION:
				return getExpression();
			case ScgPackage.GUARD__SCHIZOPHRENIC:
				return isSchizophrenic();
			case ScgPackage.GUARD__SCHEDULING_BLOCK_LINK:
				if (resolve) return getSchedulingBlockLink();
				return basicGetSchedulingBlockLink();
			case ScgPackage.GUARD__VOLATILE:
				return getVolatile();
			case ScgPackage.GUARD__SEQUENTIALIZE:
				return isSequentialize();
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
			case ScgPackage.GUARD__VALUED_OBJECT:
				setValuedObject((ValuedObject)newValue);
				return;
			case ScgPackage.GUARD__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ScgPackage.GUARD__SCHIZOPHRENIC:
				setSchizophrenic((Boolean)newValue);
				return;
			case ScgPackage.GUARD__SCHEDULING_BLOCK_LINK:
				setSchedulingBlockLink((SchedulingBlock)newValue);
				return;
			case ScgPackage.GUARD__VOLATILE:
				getVolatile().clear();
				getVolatile().addAll((Collection<? extends ValuedObject>)newValue);
				return;
			case ScgPackage.GUARD__SEQUENTIALIZE:
				setSequentialize((Boolean)newValue);
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
			case ScgPackage.GUARD__VALUED_OBJECT:
				setValuedObject((ValuedObject)null);
				return;
			case ScgPackage.GUARD__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ScgPackage.GUARD__SCHIZOPHRENIC:
				setSchizophrenic(SCHIZOPHRENIC_EDEFAULT);
				return;
			case ScgPackage.GUARD__SCHEDULING_BLOCK_LINK:
				setSchedulingBlockLink((SchedulingBlock)null);
				return;
			case ScgPackage.GUARD__VOLATILE:
				getVolatile().clear();
				return;
			case ScgPackage.GUARD__SEQUENTIALIZE:
				setSequentialize(SEQUENTIALIZE_EDEFAULT);
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
			case ScgPackage.GUARD__VALUED_OBJECT:
				return valuedObject != null;
			case ScgPackage.GUARD__EXPRESSION:
				return expression != null;
			case ScgPackage.GUARD__SCHIZOPHRENIC:
				return schizophrenic != SCHIZOPHRENIC_EDEFAULT;
			case ScgPackage.GUARD__SCHEDULING_BLOCK_LINK:
				return schedulingBlockLink != null;
			case ScgPackage.GUARD__VOLATILE:
				return volatile_ != null && !volatile_.isEmpty();
			case ScgPackage.GUARD__SEQUENTIALIZE:
				return sequentialize != SEQUENTIALIZE_EDEFAULT;
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
		result.append(" (schizophrenic: ");
		result.append(schizophrenic);
		result.append(", sequentialize: ");
		result.append(sequentialize);
		result.append(')');
		return result.toString();
	}

} //GuardImpl
