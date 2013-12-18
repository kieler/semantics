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

import de.cau.cs.kieler.scgbb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgbbFactoryImpl extends EFactoryImpl implements ScgbbFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScgbbFactory init() {
        try {
            ScgbbFactory theScgbbFactory = (ScgbbFactory)EPackage.Registry.INSTANCE.getEFactory(ScgbbPackage.eNS_URI);
            if (theScgbbFactory != null) {
                return theScgbbFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScgbbFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgbbFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ScgbbPackage.SC_GRAPH_BB: return createSCGraphBB();
            case ScgbbPackage.BASIC_BLOCK: return createBasicBlock();
            case ScgbbPackage.SCHEDULING_BLOCK: return createSchedulingBlock();
            case ScgbbPackage.ACTIVATION_EXPRESSION: return createActivationExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCGraphBB createSCGraphBB() {
        SCGraphBBImpl scGraphBB = new SCGraphBBImpl();
        return scGraphBB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicBlock createBasicBlock() {
        BasicBlockImpl basicBlock = new BasicBlockImpl();
        return basicBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingBlock createSchedulingBlock() {
        SchedulingBlockImpl schedulingBlock = new SchedulingBlockImpl();
        return schedulingBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivationExpression createActivationExpression() {
        ActivationExpressionImpl activationExpression = new ActivationExpressionImpl();
        return activationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgbbPackage getScgbbPackage() {
        return (ScgbbPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScgbbPackage getPackage() {
        return ScgbbPackage.eINSTANCE;
    }

} //ScgbbFactoryImpl
