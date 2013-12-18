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

import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.SCGraphBB;
import de.cau.cs.kieler.scgbb.ScgbbPackage;

import de.cau.cs.kieler.scgdep.impl.SCGraphDepImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Graph BB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl#getBasicBlocks <em>Basic Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCGraphBBImpl extends SCGraphDepImpl implements SCGraphBB {
    /**
     * The cached value of the '{@link #getBasicBlocks() <em>Basic Blocks</em>}' containment reference list.
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
    protected SCGraphBBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgbbPackage.Literals.SC_GRAPH_BB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BasicBlock> getBasicBlocks() {
        if (basicBlocks == null) {
            basicBlocks = new EObjectContainmentEList<BasicBlock>(BasicBlock.class, this, ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS);
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
            case ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS:
                return ((InternalEList<?>)getBasicBlocks()).basicRemove(otherEnd, msgs);
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
            case ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS:
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
            case ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS:
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
            case ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS:
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
            case ScgbbPackage.SC_GRAPH_BB__BASIC_BLOCKS:
                return basicBlocks != null && !basicBlocks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SCGraphBBImpl
