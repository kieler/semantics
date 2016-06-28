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
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator;
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.scg.Guard;
import de.cau.cs.kieler.scg.ScgPackage;
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
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardImpl extends NodeImpl implements Guard {
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
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

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
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
	protected static final AssignOperator OPERATOR_EDEFAULT = AssignOperator.ASSIGN;

				/**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
	protected AssignOperator operator = OPERATOR_EDEFAULT;

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
        if (valuedObject != null && valuedObject.eIsProxy()) {
            InternalEObject oldValuedObject = (InternalEObject)valuedObject;
            valuedObject = (ValuedObject)eResolveProxy(oldValuedObject);
            if (valuedObject != oldValuedObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.GUARD__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__VALUED_OBJECT, oldValuedObject, valuedObject));
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
	public EList<Expression> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentEList<Expression>(Expression.class, this, ScgPackage.GUARD__INDICES);
        }
        return indices;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AssignOperator getOperator() {
        return operator;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOperator(AssignOperator newOperator) {
        AssignOperator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD__OPERATOR, oldOperator, operator));
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.GUARD__EXPRESSION:
                return basicSetExpression(null, msgs);
            case ScgPackage.GUARD__INDICES:
                return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
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
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case ScgPackage.GUARD__EXPRESSION:
                return getExpression();
            case ScgPackage.GUARD__INDICES:
                return getIndices();
            case ScgPackage.GUARD__OPERATOR:
                return getOperator();
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
            case ScgPackage.GUARD__INDICES:
                getIndices().clear();
                getIndices().addAll((Collection<? extends Expression>)newValue);
                return;
            case ScgPackage.GUARD__OPERATOR:
                setOperator((AssignOperator)newValue);
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
            case ScgPackage.GUARD__INDICES:
                getIndices().clear();
                return;
            case ScgPackage.GUARD__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
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
            case ScgPackage.GUARD__INDICES:
                return indices != null && !indices.isEmpty();
            case ScgPackage.GUARD__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
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
        if (baseClass == Effect.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Assignment.class) {
            switch (derivedFeatureID) {
                case ScgPackage.GUARD__VALUED_OBJECT: return KEffectsPackage.ASSIGNMENT__VALUED_OBJECT;
                case ScgPackage.GUARD__EXPRESSION: return KEffectsPackage.ASSIGNMENT__EXPRESSION;
                case ScgPackage.GUARD__INDICES: return KEffectsPackage.ASSIGNMENT__INDICES;
                case ScgPackage.GUARD__OPERATOR: return KEffectsPackage.ASSIGNMENT__OPERATOR;
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
        if (baseClass == Effect.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Assignment.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.ASSIGNMENT__VALUED_OBJECT: return ScgPackage.GUARD__VALUED_OBJECT;
                case KEffectsPackage.ASSIGNMENT__EXPRESSION: return ScgPackage.GUARD__EXPRESSION;
                case KEffectsPackage.ASSIGNMENT__INDICES: return ScgPackage.GUARD__INDICES;
                case KEffectsPackage.ASSIGNMENT__OPERATOR: return ScgPackage.GUARD__OPERATOR;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (operator: ");
        result.append(operator);
        result.append(')');
        return result.toString();
    }

} //GuardImpl
