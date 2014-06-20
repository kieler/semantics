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
package de.cau.cs.kieler.scgsched.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scgsched.AssignmentAddition;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.AssignmentAdditionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.AssignmentAdditionImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.AssignmentAdditionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentAdditionImpl extends AlterationImpl implements AssignmentAddition {
	/**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
	protected Node position;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AssignmentAdditionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScgschedPackage.Literals.ASSIGNMENT_ADDITION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT, oldValuedObject, valuedObject));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION, oldExpression, newExpression);
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
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION, newExpression, newExpression));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node getPosition() {
        if (position != null && position.eIsProxy()) {
            InternalEObject oldPosition = (InternalEObject)position;
            position = (Node)eResolveProxy(oldPosition);
            if (position != oldPosition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.ASSIGNMENT_ADDITION__POSITION, oldPosition, position));
            }
        }
        return position;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node basicGetPosition() {
        return position;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPosition(Node newPosition) {
        Node oldPosition = position;
        position = newPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.ASSIGNMENT_ADDITION__POSITION, oldPosition, position));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION:
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
            case ScgschedPackage.ASSIGNMENT_ADDITION__POSITION:
                if (resolve) return getPosition();
                return basicGetPosition();
            case ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION:
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
            case ScgschedPackage.ASSIGNMENT_ADDITION__POSITION:
                setPosition((Node)newValue);
                return;
            case ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT:
                setValuedObject((ValuedObject)newValue);
                return;
            case ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION:
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
            case ScgschedPackage.ASSIGNMENT_ADDITION__POSITION:
                setPosition((Node)null);
                return;
            case ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT:
                setValuedObject((ValuedObject)null);
                return;
            case ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION:
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
            case ScgschedPackage.ASSIGNMENT_ADDITION__POSITION:
                return position != null;
            case ScgschedPackage.ASSIGNMENT_ADDITION__VALUED_OBJECT:
                return valuedObject != null;
            case ScgschedPackage.ASSIGNMENT_ADDITION__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //AssignmentAdditionImpl
