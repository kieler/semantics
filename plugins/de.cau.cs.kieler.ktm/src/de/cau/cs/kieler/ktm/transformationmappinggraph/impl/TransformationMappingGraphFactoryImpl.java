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
package de.cau.cs.kieler.ktm.transformationmappinggraph.impl;

import de.cau.cs.kieler.ktm.transformationmappinggraph.*;

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
public class TransformationMappingGraphFactoryImpl extends EFactoryImpl implements TransformationMappingGraphFactory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TransformationMappingGraphFactory init() {
        try {
            TransformationMappingGraphFactory theTransformationMappingGraphFactory = (TransformationMappingGraphFactory)EPackage.Registry.INSTANCE.getEFactory(TransformationMappingGraphPackage.eNS_URI);
            if (theTransformationMappingGraphFactory != null) {
                return theTransformationMappingGraphFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TransformationMappingGraphFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformationMappingGraphFactoryImpl() {
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
            case TransformationMappingGraphPackage.MODEL: return createModel();
            case TransformationMappingGraphPackage.ELEMENT: return createElement();
            case TransformationMappingGraphPackage.MODEL_TRANSFORMATION: return createModelTransformation();
            case TransformationMappingGraphPackage.ELEMENT_TRANSFORMATION: return createElementTransformation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
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
    public ElementTransformation createElementTransformation() {
        ElementTransformationImpl elementTransformation = new ElementTransformationImpl();
        return elementTransformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformationMappingGraphPackage getTransformationMappingGraphPackage() {
        return (TransformationMappingGraphPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TransformationMappingGraphPackage getPackage() {
        return TransformationMappingGraphPackage.eINSTANCE;
    }

} //TransformationMappingGraphFactoryImpl
