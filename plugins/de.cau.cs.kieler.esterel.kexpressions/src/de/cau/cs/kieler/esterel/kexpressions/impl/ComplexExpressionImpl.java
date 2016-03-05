/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression;
import de.cau.cs.kieler.esterel.kexpressions.Expression;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;

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
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.impl.ComplexExpressionImpl#getSubExpressions <em>Sub Expressions</em>}</li>
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
        return KExpressionsPackage.Literals.COMPLEX_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getSubExpressions() {
        if (subExpressions == null) {
            subExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS);
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
            case KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
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
            case KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
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
            case KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
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
            case KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
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
            case KExpressionsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
                return subExpressions != null && !subExpressions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComplexExpressionImpl
