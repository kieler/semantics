/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scgprios.Assignment_P;
import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

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
 * An implementation of the model object '<em><b>Assignment P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl#getNext <em>Next</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Assignment_PImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Assignment_PImpl extends Node_PImpl implements Assignment_P {
    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected ControlFlow_P next;

    /**
     * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignment()
     * @generated
     * @ordered
     */
    protected Expression assignment;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Assignment_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.ASSIGNMENT_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow_P getNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNext(ControlFlow_P newNext, NotificationChain msgs) {
        ControlFlow_P oldNext = next;
        next = newNext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ASSIGNMENT_P__NEXT, oldNext, newNext);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNext(ControlFlow_P newNext) {
        if (newNext != next) {
            NotificationChain msgs = null;
            if (next != null)
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ASSIGNMENT_P__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ASSIGNMENT_P__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ASSIGNMENT_P__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getAssignment() {
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssignment(Expression newAssignment, NotificationChain msgs) {
        Expression oldAssignment = assignment;
        assignment = newAssignment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT, oldAssignment, newAssignment);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignment(Expression newAssignment) {
        if (newAssignment != assignment) {
            NotificationChain msgs = null;
            if (assignment != null)
                msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT, null, msgs);
            if (newAssignment != null)
                msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT, null, msgs);
            msgs = basicSetAssignment(newAssignment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT, newAssignment, newAssignment));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT, oldValuedObject, valuedObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentEList<Expression>(Expression.class, this, ScgpriosPackage.ASSIGNMENT_P__INDICES);
        }
        return indices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.ASSIGNMENT_P__NEXT:
                return basicSetNext(null, msgs);
            case ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT:
                return basicSetAssignment(null, msgs);
            case ScgpriosPackage.ASSIGNMENT_P__INDICES:
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
            case ScgpriosPackage.ASSIGNMENT_P__NEXT:
                return getNext();
            case ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT:
                return getAssignment();
            case ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case ScgpriosPackage.ASSIGNMENT_P__INDICES:
                return getIndices();
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
            case ScgpriosPackage.ASSIGNMENT_P__NEXT:
                setNext((ControlFlow_P)newValue);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT:
                setAssignment((Expression)newValue);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT:
                setValuedObject((ValuedObject)newValue);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__INDICES:
                getIndices().clear();
                getIndices().addAll((Collection<? extends Expression>)newValue);
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
            case ScgpriosPackage.ASSIGNMENT_P__NEXT:
                setNext((ControlFlow_P)null);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT:
                setAssignment((Expression)null);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT:
                setValuedObject((ValuedObject)null);
                return;
            case ScgpriosPackage.ASSIGNMENT_P__INDICES:
                getIndices().clear();
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
            case ScgpriosPackage.ASSIGNMENT_P__NEXT:
                return next != null;
            case ScgpriosPackage.ASSIGNMENT_P__ASSIGNMENT:
                return assignment != null;
            case ScgpriosPackage.ASSIGNMENT_P__VALUED_OBJECT:
                return valuedObject != null;
            case ScgpriosPackage.ASSIGNMENT_P__INDICES:
                return indices != null && !indices.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //Assignment_PImpl
