/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.annotations.impl;

import de.cau.cs.kieler.annotations.*;

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
public class AnnotationsFactoryImpl extends EFactoryImpl implements AnnotationsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AnnotationsFactory init() {
        try {
            AnnotationsFactory theAnnotationsFactory = (AnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/annotations"); 
            if (theAnnotationsFactory != null) {
                return theAnnotationsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AnnotationsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationsFactoryImpl() {
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
            case AnnotationsPackage.ANNOTATION: return createAnnotation();
            case AnnotationsPackage.STRING_ANNOTATION: return createStringAnnotation();
            case AnnotationsPackage.REFERENCE_ANNOTATION: return createReferenceAnnotation();
            case AnnotationsPackage.BOOLEAN_ANNOTATION: return createBooleanAnnotation();
            case AnnotationsPackage.INT_ANNOTATION: return createIntAnnotation();
            case AnnotationsPackage.FLOAT_ANNOTATION: return createFloatAnnotation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Annotation createAnnotation() {
        AnnotationImpl annotation = new AnnotationImpl();
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringAnnotation createStringAnnotation() {
        StringAnnotationImpl stringAnnotation = new StringAnnotationImpl();
        return stringAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceAnnotation createReferenceAnnotation() {
        ReferenceAnnotationImpl referenceAnnotation = new ReferenceAnnotationImpl();
        return referenceAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanAnnotation createBooleanAnnotation() {
        BooleanAnnotationImpl booleanAnnotation = new BooleanAnnotationImpl();
        return booleanAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntAnnotation createIntAnnotation() {
        IntAnnotationImpl intAnnotation = new IntAnnotationImpl();
        return intAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FloatAnnotation createFloatAnnotation() {
        FloatAnnotationImpl floatAnnotation = new FloatAnnotationImpl();
        return floatAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationsPackage getAnnotationsPackage() {
        return (AnnotationsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AnnotationsPackage getPackage() {
        return AnnotationsPackage.eINSTANCE;
    }

} //AnnotationsFactoryImpl
