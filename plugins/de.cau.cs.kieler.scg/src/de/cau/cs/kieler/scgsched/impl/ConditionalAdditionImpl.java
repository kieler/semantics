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
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scgsched.ConditionalAddition;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getBeforeNode <em>Before Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getUntilNode <em>Until Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.ConditionalAdditionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalAdditionImpl extends AlterationImpl implements ConditionalAddition {
	/**
     * The cached value of the '{@link #getBeforeNode() <em>Before Node</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBeforeNode()
     * @generated
     * @ordered
     */
	protected Node beforeNode;

	/**
     * The cached value of the '{@link #getUntilNode() <em>Until Node</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUntilNode()
     * @generated
     * @ordered
     */
	protected Node untilNode;

	/**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
	protected Expression condition;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConditionalAdditionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScgschedPackage.Literals.CONDITIONAL_ADDITION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node getBeforeNode() {
        if (beforeNode != null && beforeNode.eIsProxy()) {
            InternalEObject oldBeforeNode = (InternalEObject)beforeNode;
            beforeNode = (Node)eResolveProxy(oldBeforeNode);
            if (beforeNode != oldBeforeNode) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE, oldBeforeNode, beforeNode));
            }
        }
        return beforeNode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node basicGetBeforeNode() {
        return beforeNode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBeforeNode(Node newBeforeNode) {
        Node oldBeforeNode = beforeNode;
        beforeNode = newBeforeNode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE, oldBeforeNode, beforeNode));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node getUntilNode() {
        if (untilNode != null && untilNode.eIsProxy()) {
            InternalEObject oldUntilNode = (InternalEObject)untilNode;
            untilNode = (Node)eResolveProxy(oldUntilNode);
            if (untilNode != oldUntilNode) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE, oldUntilNode, untilNode));
            }
        }
        return untilNode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node basicGetUntilNode() {
        return untilNode;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUntilNode(Node newUntilNode) {
        Node oldUntilNode = untilNode;
        untilNode = newUntilNode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE, oldUntilNode, untilNode));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getCondition() {
        return condition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
        Expression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCondition(Expression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.CONDITIONAL_ADDITION__CONDITION, newCondition, newCondition));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
                return basicSetCondition(null, msgs);
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
            case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE:
                if (resolve) return getBeforeNode();
                return basicGetBeforeNode();
            case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE:
                if (resolve) return getUntilNode();
                return basicGetUntilNode();
            case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
                return getCondition();
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
            case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE:
                setBeforeNode((Node)newValue);
                return;
            case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE:
                setUntilNode((Node)newValue);
                return;
            case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
                setCondition((Expression)newValue);
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
            case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE:
                setBeforeNode((Node)null);
                return;
            case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE:
                setUntilNode((Node)null);
                return;
            case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
                setCondition((Expression)null);
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
            case ScgschedPackage.CONDITIONAL_ADDITION__BEFORE_NODE:
                return beforeNode != null;
            case ScgschedPackage.CONDITIONAL_ADDITION__UNTIL_NODE:
                return untilNode != null;
            case ScgschedPackage.CONDITIONAL_ADDITION__CONDITION:
                return condition != null;
        }
        return super.eIsSet(featureID);
    }

} //ConditionalAdditionImpl
