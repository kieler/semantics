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
package de.cau.cs.kieler.kitt.tracingtree.impl;

import de.cau.cs.kieler.kitt.tracingtree.*;

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
public class TracingTreeFactoryImpl extends EFactoryImpl implements TracingTreeFactory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TracingTreeFactory init() {
        try {
            TracingTreeFactory theTracingTreeFactory = (TracingTreeFactory)EPackage.Registry.INSTANCE.getEFactory(TracingTreePackage.eNS_URI);
            if (theTracingTreeFactory != null) {
                return theTracingTreeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TracingTreeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TracingTreeFactoryImpl() {
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
            case TracingTreePackage.MODEL_WRAPPER: return createModelWrapper();
            case TracingTreePackage.EOBJECT_WRAPPER: return createEObjectWrapper();
            case TracingTreePackage.MODEL_TRANSFORMATION: return createModelTransformation();
            case TracingTreePackage.EOBJECT_TRANSFORMATION: return createEObjectTransformation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelWrapper createModelWrapper() {
        ModelWrapperImpl modelWrapper = new ModelWrapperImpl();
        return modelWrapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObjectWrapper createEObjectWrapper() {
        EObjectWrapperImpl eObjectWrapper = new EObjectWrapperImpl();
        return eObjectWrapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTransformation createModelTransformation() {
        ModelTransformationImpl modelTransformation = new ModelTransformationImpl();
        return modelTransformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObjectTransformation createEObjectTransformation() {
        EObjectTransformationImpl eObjectTransformation = new EObjectTransformationImpl();
        return eObjectTransformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TracingTreePackage getTracingTreePackage() {
        return (TracingTreePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TracingTreePackage getPackage() {
        return TracingTreePackage.eINSTANCE;
    }

} //TracingTreeFactoryImpl
