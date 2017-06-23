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

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.AssignOperator;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.ControlFlow;
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
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.AssignmentImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends NodeImpl implements Assignment {
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
     * The cached value of the '{@link #getSubReference() <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubReference()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference subReference;

    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected ControlFlow next;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.ASSIGNMENT;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.ASSIGNMENT__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__EXPRESSION, oldExpression, newExpression);
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
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentEList<Expression>(Expression.class, this, ScgPackage.ASSIGNMENT__INDICES);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__OPERATOR, oldOperator, operator));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__SUB_REFERENCE, oldSubReference, newSubReference);
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
                msgs = ((InternalEObject)subReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__SUB_REFERENCE, null, msgs);
            if (newSubReference != null)
                msgs = ((InternalEObject)newSubReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__SUB_REFERENCE, null, msgs);
            msgs = basicSetSubReference(newSubReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__SUB_REFERENCE, newSubReference, newSubReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow getNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNext(ControlFlow newNext, NotificationChain msgs) {
        ControlFlow oldNext = next;
        next = newNext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__NEXT, oldNext, newNext);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNext(ControlFlow newNext) {
        if (newNext != next) {
            NotificationChain msgs = null;
            if (next != null)
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.ASSIGNMENT__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.ASSIGNMENT__EXPRESSION:
                return basicSetExpression(null, msgs);
            case ScgPackage.ASSIGNMENT__INDICES:
                return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
            case ScgPackage.ASSIGNMENT__SUB_REFERENCE:
                return basicSetSubReference(null, msgs);
            case ScgPackage.ASSIGNMENT__NEXT:
                return basicSetNext(null, msgs);
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
            case ScgPackage.ASSIGNMENT__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case ScgPackage.ASSIGNMENT__EXPRESSION:
                return getExpression();
            case ScgPackage.ASSIGNMENT__INDICES:
                return getIndices();
            case ScgPackage.ASSIGNMENT__OPERATOR:
                return getOperator();
            case ScgPackage.ASSIGNMENT__SUB_REFERENCE:
                return getSubReference();
            case ScgPackage.ASSIGNMENT__NEXT:
                return getNext();
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
            case ScgPackage.ASSIGNMENT__VALUED_OBJECT:
                setValuedObject((ValuedObject)newValue);
                return;
            case ScgPackage.ASSIGNMENT__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case ScgPackage.ASSIGNMENT__INDICES:
                getIndices().clear();
                getIndices().addAll((Collection<? extends Expression>)newValue);
                return;
            case ScgPackage.ASSIGNMENT__OPERATOR:
                setOperator((AssignOperator)newValue);
                return;
            case ScgPackage.ASSIGNMENT__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)newValue);
                return;
            case ScgPackage.ASSIGNMENT__NEXT:
                setNext((ControlFlow)newValue);
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
            case ScgPackage.ASSIGNMENT__VALUED_OBJECT:
                setValuedObject((ValuedObject)null);
                return;
            case ScgPackage.ASSIGNMENT__EXPRESSION:
                setExpression((Expression)null);
                return;
            case ScgPackage.ASSIGNMENT__INDICES:
                getIndices().clear();
                return;
            case ScgPackage.ASSIGNMENT__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
                return;
            case ScgPackage.ASSIGNMENT__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)null);
                return;
            case ScgPackage.ASSIGNMENT__NEXT:
                setNext((ControlFlow)null);
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
            case ScgPackage.ASSIGNMENT__VALUED_OBJECT:
                return valuedObject != null;
            case ScgPackage.ASSIGNMENT__EXPRESSION:
                return expression != null;
            case ScgPackage.ASSIGNMENT__INDICES:
                return indices != null && !indices.isEmpty();
            case ScgPackage.ASSIGNMENT__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
            case ScgPackage.ASSIGNMENT__SUB_REFERENCE:
                return subReference != null;
            case ScgPackage.ASSIGNMENT__NEXT:
                return next != null;
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
        if (baseClass == de.cau.cs.kieler.kexpressions.keffects.Assignment.class) {
            switch (derivedFeatureID) {
                case ScgPackage.ASSIGNMENT__VALUED_OBJECT: return KEffectsPackage.ASSIGNMENT__VALUED_OBJECT;
                case ScgPackage.ASSIGNMENT__EXPRESSION: return KEffectsPackage.ASSIGNMENT__EXPRESSION;
                case ScgPackage.ASSIGNMENT__INDICES: return KEffectsPackage.ASSIGNMENT__INDICES;
                case ScgPackage.ASSIGNMENT__OPERATOR: return KEffectsPackage.ASSIGNMENT__OPERATOR;
                case ScgPackage.ASSIGNMENT__SUB_REFERENCE: return KEffectsPackage.ASSIGNMENT__SUB_REFERENCE;
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
        if (baseClass == de.cau.cs.kieler.kexpressions.keffects.Assignment.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.ASSIGNMENT__VALUED_OBJECT: return ScgPackage.ASSIGNMENT__VALUED_OBJECT;
                case KEffectsPackage.ASSIGNMENT__EXPRESSION: return ScgPackage.ASSIGNMENT__EXPRESSION;
                case KEffectsPackage.ASSIGNMENT__INDICES: return ScgPackage.ASSIGNMENT__INDICES;
                case KEffectsPackage.ASSIGNMENT__OPERATOR: return ScgPackage.ASSIGNMENT__OPERATOR;
                case KEffectsPackage.ASSIGNMENT__SUB_REFERENCE: return ScgPackage.ASSIGNMENT__SUB_REFERENCE;
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

} //AssignmentImpl
