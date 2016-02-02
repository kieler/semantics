/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "annotations";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://kieler.cs.cau.de/annotations";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "ann";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    AnnotationsPackage eINSTANCE = de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl.init();

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl <em>Annotatable</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getAnnotatable()
	 * @generated
	 */
    int ANNOTATABLE = 1;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANNOTATABLE__ANNOTATIONS = 0;

    /**
	 * The number of structural features of the '<em>Annotatable</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANNOTATABLE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl <em>Named Object</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getNamedObject()
	 * @generated
	 */
    int NAMED_OBJECT = 0;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED_OBJECT__ANNOTATIONS = ANNOTATABLE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED_OBJECT__NAME = ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Named Object</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAMED_OBJECT_FEATURE_COUNT = ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getAnnotation()
	 * @generated
	 */
    int ANNOTATION = 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANNOTATION__ANNOTATIONS = NAMED_OBJECT__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANNOTATION__NAME = NAMED_OBJECT__NAME;

    /**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANNOTATION_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.StringAnnotationImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getStringAnnotation()
	 * @generated
	 */
    int STRING_ANNOTATION = 3;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_ANNOTATION__ANNOTATIONS = ANNOTATION__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_ANNOTATION__VALUES = ANNOTATION_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>String Annotation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.TypedStringAnnotationImpl <em>Typed String Annotation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.TypedStringAnnotationImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getTypedStringAnnotation()
	 * @generated
	 */
    int TYPED_STRING_ANNOTATION = 4;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_STRING_ANNOTATION__ANNOTATIONS = STRING_ANNOTATION__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_STRING_ANNOTATION__NAME = STRING_ANNOTATION__NAME;

    /**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_STRING_ANNOTATION__VALUES = STRING_ANNOTATION__VALUES;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_STRING_ANNOTATION__TYPE = STRING_ANNOTATION_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Typed String Annotation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TYPED_STRING_ANNOTATION_FEATURE_COUNT = STRING_ANNOTATION_FEATURE_COUNT + 1;


    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.annotations.impl.CommentAnnotationImpl <em>Comment Annotation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.annotations.impl.CommentAnnotationImpl
	 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getCommentAnnotation()
	 * @generated
	 */
    int COMMENT_ANNOTATION = 5;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMENT_ANNOTATION__ANNOTATIONS = STRING_ANNOTATION__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMENT_ANNOTATION__NAME = STRING_ANNOTATION__NAME;

    /**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMENT_ANNOTATION__VALUES = STRING_ANNOTATION__VALUES;

    /**
	 * The number of structural features of the '<em>Comment Annotation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMMENT_ANNOTATION_FEATURE_COUNT = STRING_ANNOTATION_FEATURE_COUNT + 0;


    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.NamedObject <em>Named Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Object</em>'.
	 * @see de.cau.cs.kieler.core.annotations.NamedObject
	 * @generated
	 */
    EClass getNamedObject();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.annotations.NamedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cau.cs.kieler.core.annotations.NamedObject#getName()
	 * @see #getNamedObject()
	 * @generated
	 */
    EAttribute getNamedObject_Name();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.Annotatable <em>Annotatable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotatable</em>'.
	 * @see de.cau.cs.kieler.core.annotations.Annotatable
	 * @generated
	 */
    EClass getAnnotatable();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.annotations.Annotatable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see de.cau.cs.kieler.core.annotations.Annotatable#getAnnotations()
	 * @see #getAnnotatable()
	 * @generated
	 */
    EReference getAnnotatable_Annotations();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see de.cau.cs.kieler.core.annotations.Annotation
	 * @generated
	 */
    EClass getAnnotation();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.StringAnnotation <em>String Annotation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Annotation</em>'.
	 * @see de.cau.cs.kieler.core.annotations.StringAnnotation
	 * @generated
	 */
    EClass getStringAnnotation();

    /**
	 * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.core.annotations.StringAnnotation#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see de.cau.cs.kieler.core.annotations.StringAnnotation#getValues()
	 * @see #getStringAnnotation()
	 * @generated
	 */
    EAttribute getStringAnnotation_Values();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.TypedStringAnnotation <em>Typed String Annotation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed String Annotation</em>'.
	 * @see de.cau.cs.kieler.core.annotations.TypedStringAnnotation
	 * @generated
	 */
    EClass getTypedStringAnnotation();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.annotations.TypedStringAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.core.annotations.TypedStringAnnotation#getType()
	 * @see #getTypedStringAnnotation()
	 * @generated
	 */
    EAttribute getTypedStringAnnotation_Type();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.annotations.CommentAnnotation <em>Comment Annotation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Annotation</em>'.
	 * @see de.cau.cs.kieler.core.annotations.CommentAnnotation
	 * @generated
	 */
    EClass getCommentAnnotation();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    AnnotationsFactory getAnnotationsFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl <em>Named Object</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getNamedObject()
		 * @generated
		 */
        EClass NAMED_OBJECT = eINSTANCE.getNamedObject();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NAMED_OBJECT__NAME = eINSTANCE.getNamedObject_Name();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl <em>Annotatable</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getAnnotatable()
		 * @generated
		 */
        EClass ANNOTATABLE = eINSTANCE.getAnnotatable();

        /**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ANNOTATABLE__ANNOTATIONS = eINSTANCE.getAnnotatable_Annotations();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getAnnotation()
		 * @generated
		 */
        EClass ANNOTATION = eINSTANCE.getAnnotation();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.StringAnnotationImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getStringAnnotation()
		 * @generated
		 */
        EClass STRING_ANNOTATION = eINSTANCE.getStringAnnotation();

        /**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_ANNOTATION__VALUES = eINSTANCE.getStringAnnotation_Values();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.TypedStringAnnotationImpl <em>Typed String Annotation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.TypedStringAnnotationImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getTypedStringAnnotation()
		 * @generated
		 */
        EClass TYPED_STRING_ANNOTATION = eINSTANCE.getTypedStringAnnotation();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TYPED_STRING_ANNOTATION__TYPE = eINSTANCE.getTypedStringAnnotation_Type();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.annotations.impl.CommentAnnotationImpl <em>Comment Annotation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.annotations.impl.CommentAnnotationImpl
		 * @see de.cau.cs.kieler.core.annotations.impl.AnnotationsPackageImpl#getCommentAnnotation()
		 * @generated
		 */
        EClass COMMENT_ANNOTATION = eINSTANCE.getCommentAnnotation();

    }

} //AnnotationsPackage
