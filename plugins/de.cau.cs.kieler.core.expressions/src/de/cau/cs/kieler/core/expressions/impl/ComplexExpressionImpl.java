/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions.impl;

import de.cau.cs.kieler.core.expressions.ComplexExpression;
import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.ExpressionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.impl.ComplexExpressionImpl#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexExpressionImpl extends ExpressionImpl implements ComplexExpression {
    /**
     * The cached value of the '{@link #getSubExpressions() <em>Sub Expressions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubExpressions()
     * @generated
     * @ordered
     */
    protected EList<Expression> subExpressions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.COMPLEX_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getSubExpressions() {
        if (subExpressions == null) {
            subExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS);
        }
        return subExpressions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                return ((InternalEList<?>)getSubExpressions()).basicRemove(otherEnd, msgs);
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
            case ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                return getSubExpressions();
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
            case ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                getSubExpressions().clear();
                getSubExpressions().addAll((Collection<? extends Expression>)newValue);
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
            case ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                getSubExpressions().clear();
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
            case ExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                return subExpressions != null && !subExpressions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComplexExpressionImpl
