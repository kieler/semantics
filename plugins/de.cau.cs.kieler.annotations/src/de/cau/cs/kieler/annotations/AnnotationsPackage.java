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
package de.cau.cs.kieler.annotations;

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
 * @see de.cau.cs.kieler.annotations.AnnotationsFactory
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
    AnnotationsPackage eINSTANCE = de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.AnnotatableImpl <em>Annotatable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.AnnotatableImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getAnnotatable()
     * @generated
     */
    int ANNOTATABLE = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.NamedObjectImpl <em>Named Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.NamedObjectImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getNamedObject()
     * @generated
     */
    int NAMED_OBJECT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT_FEATURE_COUNT = 1;

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
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.AnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getAnnotation()
     * @generated
     */
    int ANNOTATION = 2;

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
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.StringAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getStringAnnotation()
     * @generated
     */
    int STRING_ANNOTATION = 3;

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
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.ReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.ReferenceAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getReferenceAnnotation()
     * @generated
     */
    int REFERENCE_ANNOTATION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ANNOTATION__OBJECT = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.BooleanAnnotationImpl <em>Boolean Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.BooleanAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getBooleanAnnotation()
     * @generated
     */
    int BOOLEAN_ANNOTATION = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_ANNOTATION__VALUE = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.IntAnnotationImpl <em>Int Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.IntAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getIntAnnotation()
     * @generated
     */
    int INT_ANNOTATION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_ANNOTATION__VALUE = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Int Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.FloatAnnotationImpl <em>Float Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.FloatAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getFloatAnnotation()
     * @generated
     */
    int FLOAT_ANNOTATION = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_ANNOTATION__VALUE = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Float Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.ContainmentAnnotationImpl <em>Containment Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.ContainmentAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getContainmentAnnotation()
     * @generated
     */
    int CONTAINMENT_ANNOTATION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_ANNOTATION__OBJECT = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Containment Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.ImportAnnotationImpl <em>Import Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.ImportAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getImportAnnotation()
     * @generated
     */
    int IMPORT_ANNOTATION = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Import URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_ANNOTATION__IMPORT_URI = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Import Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.TypedStringAnnotationImpl <em>Typed String Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.TypedStringAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getTypedStringAnnotation()
     * @generated
     */
    int TYPED_STRING_ANNOTATION = 10;

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
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.CommentAnnotationImpl <em>Comment Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.CommentAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getCommentAnnotation()
     * @generated
     */
    int COMMENT_ANNOTATION = 11;

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
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.PragmaAnnotationImpl <em>Pragma Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.PragmaAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getPragmaAnnotation()
     * @generated
     */
    int PRAGMA_ANNOTATION = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRAGMA_ANNOTATION__NAME = ANNOTATION__NAME;

    /**
     * The number of structural features of the '<em>Pragma Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRAGMA_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.annotations.impl.PragmaStringAnnotationImpl <em>Pragma String Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.annotations.impl.PragmaStringAnnotationImpl
     * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getPragmaStringAnnotation()
     * @generated
     */
    int PRAGMA_STRING_ANNOTATION = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRAGMA_STRING_ANNOTATION__NAME = STRING_ANNOTATION__NAME;

    /**
     * The feature id for the '<em><b>Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRAGMA_STRING_ANNOTATION__VALUES = STRING_ANNOTATION__VALUES;

    /**
     * The number of structural features of the '<em>Pragma String Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRAGMA_STRING_ANNOTATION_FEATURE_COUNT = STRING_ANNOTATION_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.NamedObject <em>Named Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Object</em>'.
     * @see de.cau.cs.kieler.annotations.NamedObject
     * @generated
     */
    EClass getNamedObject();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.NamedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.annotations.NamedObject#getName()
     * @see #getNamedObject()
     * @generated
     */
    EAttribute getNamedObject_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.Annotatable <em>Annotatable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotatable</em>'.
     * @see de.cau.cs.kieler.annotations.Annotatable
     * @generated
     */
    EClass getAnnotatable();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.annotations.Annotatable#getAnnotations <em>Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotations</em>'.
     * @see de.cau.cs.kieler.annotations.Annotatable#getAnnotations()
     * @see #getAnnotatable()
     * @generated
     */
    EReference getAnnotatable_Annotations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.Annotation
     * @generated
     */
    EClass getAnnotation();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.StringAnnotation <em>String Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.StringAnnotation
     * @generated
     */
    EClass getStringAnnotation();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.annotations.StringAnnotation#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Values</em>'.
     * @see de.cau.cs.kieler.annotations.StringAnnotation#getValues()
     * @see #getStringAnnotation()
     * @generated
     */
    EAttribute getStringAnnotation_Values();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.ReferenceAnnotation <em>Reference Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.ReferenceAnnotation
     * @generated
     */
    EClass getReferenceAnnotation();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.annotations.ReferenceAnnotation#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Object</em>'.
     * @see de.cau.cs.kieler.annotations.ReferenceAnnotation#getObject()
     * @see #getReferenceAnnotation()
     * @generated
     */
    EReference getReferenceAnnotation_Object();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.BooleanAnnotation <em>Boolean Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.BooleanAnnotation
     * @generated
     */
    EClass getBooleanAnnotation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.BooleanAnnotation#isValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.annotations.BooleanAnnotation#isValue()
     * @see #getBooleanAnnotation()
     * @generated
     */
    EAttribute getBooleanAnnotation_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.IntAnnotation <em>Int Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.IntAnnotation
     * @generated
     */
    EClass getIntAnnotation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.IntAnnotation#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.annotations.IntAnnotation#getValue()
     * @see #getIntAnnotation()
     * @generated
     */
    EAttribute getIntAnnotation_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.FloatAnnotation <em>Float Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.FloatAnnotation
     * @generated
     */
    EClass getFloatAnnotation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.FloatAnnotation#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.annotations.FloatAnnotation#getValue()
     * @see #getFloatAnnotation()
     * @generated
     */
    EAttribute getFloatAnnotation_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.ContainmentAnnotation <em>Containment Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Containment Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.ContainmentAnnotation
     * @generated
     */
    EClass getContainmentAnnotation();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.annotations.ContainmentAnnotation#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Object</em>'.
     * @see de.cau.cs.kieler.annotations.ContainmentAnnotation#getObject()
     * @see #getContainmentAnnotation()
     * @generated
     */
    EReference getContainmentAnnotation_Object();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.ImportAnnotation <em>Import Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.ImportAnnotation
     * @generated
     */
    EClass getImportAnnotation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.ImportAnnotation#getImportURI <em>Import URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import URI</em>'.
     * @see de.cau.cs.kieler.annotations.ImportAnnotation#getImportURI()
     * @see #getImportAnnotation()
     * @generated
     */
    EAttribute getImportAnnotation_ImportURI();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.TypedStringAnnotation <em>Typed String Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Typed String Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.TypedStringAnnotation
     * @generated
     */
    EClass getTypedStringAnnotation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.annotations.TypedStringAnnotation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.annotations.TypedStringAnnotation#getType()
     * @see #getTypedStringAnnotation()
     * @generated
     */
    EAttribute getTypedStringAnnotation_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.CommentAnnotation <em>Comment Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.CommentAnnotation
     * @generated
     */
    EClass getCommentAnnotation();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.PragmaAnnotation <em>Pragma Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pragma Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.PragmaAnnotation
     * @generated
     */
    EClass getPragmaAnnotation();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.annotations.PragmaStringAnnotation <em>Pragma String Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pragma String Annotation</em>'.
     * @see de.cau.cs.kieler.annotations.PragmaStringAnnotation
     * @generated
     */
    EClass getPragmaStringAnnotation();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.NamedObjectImpl <em>Named Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.NamedObjectImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getNamedObject()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.AnnotatableImpl <em>Annotatable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.AnnotatableImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getAnnotatable()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.AnnotationImpl <em>Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.AnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getAnnotation()
         * @generated
         */
        EClass ANNOTATION = eINSTANCE.getAnnotation();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.StringAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getStringAnnotation()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.ReferenceAnnotationImpl <em>Reference Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.ReferenceAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getReferenceAnnotation()
         * @generated
         */
        EClass REFERENCE_ANNOTATION = eINSTANCE.getReferenceAnnotation();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_ANNOTATION__OBJECT = eINSTANCE.getReferenceAnnotation_Object();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.BooleanAnnotationImpl <em>Boolean Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.BooleanAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getBooleanAnnotation()
         * @generated
         */
        EClass BOOLEAN_ANNOTATION = eINSTANCE.getBooleanAnnotation();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_ANNOTATION__VALUE = eINSTANCE.getBooleanAnnotation_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.IntAnnotationImpl <em>Int Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.IntAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getIntAnnotation()
         * @generated
         */
        EClass INT_ANNOTATION = eINSTANCE.getIntAnnotation();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INT_ANNOTATION__VALUE = eINSTANCE.getIntAnnotation_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.FloatAnnotationImpl <em>Float Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.FloatAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getFloatAnnotation()
         * @generated
         */
        EClass FLOAT_ANNOTATION = eINSTANCE.getFloatAnnotation();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOAT_ANNOTATION__VALUE = eINSTANCE.getFloatAnnotation_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.ContainmentAnnotationImpl <em>Containment Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.ContainmentAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getContainmentAnnotation()
         * @generated
         */
        EClass CONTAINMENT_ANNOTATION = eINSTANCE.getContainmentAnnotation();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINMENT_ANNOTATION__OBJECT = eINSTANCE.getContainmentAnnotation_Object();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.ImportAnnotationImpl <em>Import Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.ImportAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getImportAnnotation()
         * @generated
         */
        EClass IMPORT_ANNOTATION = eINSTANCE.getImportAnnotation();

        /**
         * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_ANNOTATION__IMPORT_URI = eINSTANCE.getImportAnnotation_ImportURI();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.TypedStringAnnotationImpl <em>Typed String Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.TypedStringAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getTypedStringAnnotation()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.CommentAnnotationImpl <em>Comment Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.CommentAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getCommentAnnotation()
         * @generated
         */
        EClass COMMENT_ANNOTATION = eINSTANCE.getCommentAnnotation();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.PragmaAnnotationImpl <em>Pragma Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.PragmaAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getPragmaAnnotation()
         * @generated
         */
        EClass PRAGMA_ANNOTATION = eINSTANCE.getPragmaAnnotation();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.annotations.impl.PragmaStringAnnotationImpl <em>Pragma String Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.annotations.impl.PragmaStringAnnotationImpl
         * @see de.cau.cs.kieler.annotations.impl.AnnotationsPackageImpl#getPragmaStringAnnotation()
         * @generated
         */
        EClass PRAGMA_STRING_ANNOTATION = eINSTANCE.getPragmaStringAnnotation();

    }

} //AnnotationsPackage
