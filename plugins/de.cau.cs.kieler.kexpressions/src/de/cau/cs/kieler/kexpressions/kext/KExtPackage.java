/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

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
 * @see de.cau.cs.kieler.kexpressions.kext.KExtFactory
 * @model kind="package"
 * @generated
 */
public interface KExtPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "kext";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/kext/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "kext";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KExtPackage eINSTANCE = de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.KextImpl <em>Kext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KextImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getKext()
     * @generated
     */
    int KEXT = 0;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__DECLARATIONS = 0;

    /**
     * The feature id for the '<em><b>Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__ENTITIES = 1;

    /**
     * The number of structural features of the '<em>Kext</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl <em>Test Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getTestEntity()
     * @generated
     */
    int TEST_ENTITY = 1;

    /**
     * The feature id for the '<em><b>Effect</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_ENTITY__EFFECT = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_ENTITY__EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Test Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_ENTITY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.AnnotatedExpressionImpl <em>Annotated Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.AnnotatedExpressionImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getAnnotatedExpression()
     * @generated
     */
    int ANNOTATED_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED_EXPRESSION__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED_EXPRESSION__EXPRESSION = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Annotated Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED_EXPRESSION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.Kext <em>Kext</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Kext</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Kext
     * @generated
     */
    EClass getKext();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.Kext#getDeclarations <em>Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declarations</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Kext#getDeclarations()
     * @see #getKext()
     * @generated
     */
    EReference getKext_Declarations();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.Kext#getEntities <em>Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entities</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Kext#getEntities()
     * @see #getKext()
     * @generated
     */
    EReference getKext_Entities();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.TestEntity <em>Test Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Test Entity</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.TestEntity
     * @generated
     */
    EClass getTestEntity();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getEffect <em>Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Effect</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.TestEntity#getEffect()
     * @see #getTestEntity()
     * @generated
     */
    EReference getTestEntity_Effect();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.TestEntity#getExpression()
     * @see #getTestEntity()
     * @generated
     */
    EReference getTestEntity_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.AnnotatedExpression <em>Annotated Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotated Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.AnnotatedExpression
     * @generated
     */
    EClass getAnnotatedExpression();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.kext.AnnotatedExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.AnnotatedExpression#getExpression()
     * @see #getAnnotatedExpression()
     * @generated
     */
    EReference getAnnotatedExpression_Expression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KExtFactory getKExtFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.KextImpl <em>Kext</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KextImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getKext()
         * @generated
         */
        EClass KEXT = eINSTANCE.getKext();

        /**
         * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEXT__DECLARATIONS = eINSTANCE.getKext_Declarations();

        /**
         * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEXT__ENTITIES = eINSTANCE.getKext_Entities();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl <em>Test Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getTestEntity()
         * @generated
         */
        EClass TEST_ENTITY = eINSTANCE.getTestEntity();

        /**
         * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_ENTITY__EFFECT = eINSTANCE.getTestEntity_Effect();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_ENTITY__EXPRESSION = eINSTANCE.getTestEntity_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.AnnotatedExpressionImpl <em>Annotated Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.AnnotatedExpressionImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getAnnotatedExpression()
         * @generated
         */
        EClass ANNOTATED_EXPRESSION = eINSTANCE.getAnnotatedExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANNOTATED_EXPRESSION__EXPRESSION = eINSTANCE.getAnnotatedExpression_Expression();

    }

} //KExtPackage
