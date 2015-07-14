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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.For;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getValuedObject <em>Valued Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForImpl extends EObjectImpl implements For {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
    protected ValuedObject loopVariable;

    /**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
    protected static final int FROM_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
    protected int from = FROM_EDEFAULT;

    /**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
    protected static final int TO_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
    protected int to = TO_EDEFAULT;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ForImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SCChartsPackage.Literals.FOR;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuedObject getLoopVariable() {
		if (loopVariable != null && loopVariable.eIsProxy()) {
			InternalEObject oldLoopVariable = (InternalEObject)loopVariable;
			loopVariable = (ValuedObject)eResolveProxy(oldLoopVariable);
			if (loopVariable != oldLoopVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__LOOP_VARIABLE, oldLoopVariable, loopVariable));
			}
		}
		return loopVariable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuedObject basicGetLoopVariable() {
		return loopVariable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLoopVariable(ValuedObject newLoopVariable) {
		ValuedObject oldLoopVariable = loopVariable;
		loopVariable = newLoopVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__LOOP_VARIABLE, oldLoopVariable, loopVariable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getFrom() {
		return from;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFrom(int newFrom) {
		int oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__FROM, oldFrom, from));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTo() {
		return to;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTo(int newTo) {
		int oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__TO, oldTo, to));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__VALUED_OBJECT, oldValuedObject, newValuedObject);
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
				msgs = ((InternalEObject)valuedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.FOR__VALUED_OBJECT, null, msgs);
			if (newValuedObject != null)
				msgs = ((InternalEObject)newValuedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.FOR__VALUED_OBJECT, null, msgs);
			msgs = basicSetValuedObject(newValuedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__VALUED_OBJECT, newValuedObject, newValuedObject));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCChartsPackage.FOR__VALUED_OBJECT:
				return basicSetValuedObject(null, msgs);
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
			case SCChartsPackage.FOR__LOOP_VARIABLE:
				if (resolve) return getLoopVariable();
				return basicGetLoopVariable();
			case SCChartsPackage.FOR__FROM:
				return getFrom();
			case SCChartsPackage.FOR__TO:
				return getTo();
			case SCChartsPackage.FOR__VALUED_OBJECT:
				return getValuedObject();
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
			case SCChartsPackage.FOR__LOOP_VARIABLE:
				setLoopVariable((ValuedObject)newValue);
				return;
			case SCChartsPackage.FOR__FROM:
				setFrom((Integer)newValue);
				return;
			case SCChartsPackage.FOR__TO:
				setTo((Integer)newValue);
				return;
			case SCChartsPackage.FOR__VALUED_OBJECT:
				setValuedObject((ValuedObject)newValue);
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
			case SCChartsPackage.FOR__LOOP_VARIABLE:
				setLoopVariable((ValuedObject)null);
				return;
			case SCChartsPackage.FOR__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case SCChartsPackage.FOR__TO:
				setTo(TO_EDEFAULT);
				return;
			case SCChartsPackage.FOR__VALUED_OBJECT:
				setValuedObject((ValuedObject)null);
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
			case SCChartsPackage.FOR__LOOP_VARIABLE:
				return loopVariable != null;
			case SCChartsPackage.FOR__FROM:
				return from != FROM_EDEFAULT;
			case SCChartsPackage.FOR__TO:
				return to != TO_EDEFAULT;
			case SCChartsPackage.FOR__VALUED_OBJECT:
				return valuedObject != null;
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //ForImpl
