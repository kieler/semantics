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

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.InterfaceVariableDecl;
import de.cau.cs.kieler.core.expressions.VariableDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.impl.InterfaceVariableDeclImpl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceVariableDeclImpl extends InterfaceDeclarationImpl implements InterfaceVariableDecl {
    /**
     * The cached value of the '{@link #getVarDecls() <em>Var Decls</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVarDecls()
     * @generated
     * @ordered
     */
    protected EList<VariableDecl> varDecls;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceVariableDeclImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.INTERFACE_VARIABLE_DECL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableDecl> getVarDecls() {
        if (varDecls == null) {
            varDecls = new EObjectContainmentEList<VariableDecl>(VariableDecl.class, this, ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS);
        }
        return varDecls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS:
                return ((InternalEList<?>)getVarDecls()).basicRemove(otherEnd, msgs);
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
            case ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS:
                return getVarDecls();
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
            case ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS:
                getVarDecls().clear();
                getVarDecls().addAll((Collection<? extends VariableDecl>)newValue);
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
            case ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS:
                getVarDecls().clear();
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
            case ExpressionsPackage.INTERFACE_VARIABLE_DECL__VAR_DECLS:
                return varDecls != null && !varDecls.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InterfaceVariableDeclImpl
