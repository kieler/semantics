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
package de.cau.cs.kieler.scgbb.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.scgbb.ActivationExpression;
import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.ScgbbPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl#getBasicBlocks <em>Basic Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationExpressionImpl extends MinimalEObjectImpl.Container implements ActivationExpression {
    /**
     * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressions()
     * @generated
     * @ordered
     */
    protected EList<Expression> expressions;

    /**
     * The cached value of the '{@link #getBasicBlocks() <em>Basic Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicBlocks()
     * @generated
     * @ordered
     */
    protected EList<BasicBlock> basicBlocks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivationExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgbbPackage.Literals.ACTIVATION_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new EObjectContainmentEList<Expression>(Expression.class, this, ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS);
        }
        return expressions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BasicBlock> getBasicBlocks() {
        if (basicBlocks == null) {
            basicBlocks = new EObjectResolvingEList<BasicBlock>(BasicBlock.class, this, ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS);
        }
        return basicBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS:
                return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
            case ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS:
                return getExpressions();
            case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
                return getBasicBlocks();
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
            case ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS:
                getExpressions().clear();
                getExpressions().addAll((Collection<? extends Expression>)newValue);
                return;
            case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
                getBasicBlocks().clear();
                getBasicBlocks().addAll((Collection<? extends BasicBlock>)newValue);
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
            case ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS:
                getExpressions().clear();
                return;
            case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
                getBasicBlocks().clear();
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
            case ScgbbPackage.ACTIVATION_EXPRESSION__EXPRESSIONS:
                return expressions != null && !expressions.isEmpty();
            case ScgbbPackage.ACTIVATION_EXPRESSION__BASIC_BLOCKS:
                return basicBlocks != null && !basicBlocks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActivationExpressionImpl
