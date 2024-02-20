/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import org.eclipse.emf.ecore.EAttribute;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DeclarationScopeImpl <em>Declaration Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.DeclarationScopeImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDeclarationScope()
     * @generated
     */
    int DECLARATION_SCOPE = 4;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECLARATION_SCOPE__DECLARATIONS = 0;

    /**
     * The number of structural features of the '<em>Declaration Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECLARATION_SCOPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.KExtScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtScopeImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getKExtScope()
     * @generated
     */
    int KEXT_SCOPE = 1;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE__DECLARATIONS = DECLARATION_SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE__ANNOTATIONS = DECLARATION_SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE__NAME = DECLARATION_SCOPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE__ENTITIES = DECLARATION_SCOPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE__SCOPES = DECLARATION_SCOPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_SCOPE_FEATURE_COUNT = DECLARATION_SCOPE_FEATURE_COUNT + 4;

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
    int KEXT__DECLARATIONS = KEXT_SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__ANNOTATIONS = KEXT_SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__NAME = KEXT_SCOPE__NAME;

    /**
     * The feature id for the '<em><b>Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__ENTITIES = KEXT_SCOPE__ENTITIES;

    /**
     * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT__SCOPES = KEXT_SCOPE__SCOPES;

    /**
     * The number of structural features of the '<em>Kext</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEXT_FEATURE_COUNT = KEXT_SCOPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl <em>Test Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.TestEntityImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getTestEntity()
     * @generated
     */
    int TEST_ENTITY = 2;

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
    int ANNOTATED_EXPRESSION = 3;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getClassDeclaration()
     * @generated
     */
    int CLASS_DECLARATION = 5;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__DECLARATIONS = DECLARATION_SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__ANNOTATIONS = DECLARATION_SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__VALUED_OBJECTS = DECLARATION_SCOPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Access</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__ACCESS = DECLARATION_SCOPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__INPUT = DECLARATION_SCOPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__OUTPUT = DECLARATION_SCOPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__TYPE = DECLARATION_SCOPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__STATIC = DECLARATION_SCOPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__SIGNAL = DECLARATION_SCOPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__CONST = DECLARATION_SCOPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Extern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__EXTERN = DECLARATION_SCOPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__VOLATILE = DECLARATION_SCOPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Global</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__GLOBAL = DECLARATION_SCOPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__HOST_TYPE = DECLARATION_SCOPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__NAME = DECLARATION_SCOPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION__HOST = DECLARATION_SCOPE_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Class Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DECLARATION_FEATURE_COUNT = DECLARATION_SCOPE_FEATURE_COUNT + 15;

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.KExtScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.KExtScope
     * @generated
     */
    EClass getKExtScope();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.KExtScope#getEntities <em>Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entities</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.KExtScope#getEntities()
     * @see #getKExtScope()
     * @generated
     */
    EReference getKExtScope_Entities();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.KExtScope#getScopes <em>Scopes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scopes</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.KExtScope#getScopes()
     * @see #getKExtScope()
     * @generated
     */
    EReference getKExtScope_Scopes();

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.DeclarationScope <em>Declaration Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Declaration Scope</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DeclarationScope
     * @generated
     */
    EClass getDeclarationScope();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.DeclarationScope#getDeclarations <em>Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declarations</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DeclarationScope#getDeclarations()
     * @see #getDeclarationScope()
     * @generated
     */
    EReference getDeclarationScope_Declarations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.ClassDeclaration <em>Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Declaration</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
     * @generated
     */
    EClass getClassDeclaration();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.kext.ClassDeclaration#isHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.ClassDeclaration#isHost()
     * @see #getClassDeclaration()
     * @generated
     */
    EAttribute getClassDeclaration_Host();

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

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DeclarationScopeImpl <em>Declaration Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.DeclarationScopeImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDeclarationScope()
         * @generated
         */
        EClass DECLARATION_SCOPE = eINSTANCE.getDeclarationScope();

        /**
         * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DECLARATION_SCOPE__DECLARATIONS = eINSTANCE.getDeclarationScope_Declarations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getClassDeclaration()
         * @generated
         */
        EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLASS_DECLARATION__HOST = eINSTANCE.getClassDeclaration_Host();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.KExtScopeImpl <em>Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtScopeImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getKExtScope()
         * @generated
         */
        EClass KEXT_SCOPE = eINSTANCE.getKExtScope();

        /**
         * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEXT_SCOPE__ENTITIES = eINSTANCE.getKExtScope_Entities();

        /**
         * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEXT_SCOPE__SCOPES = eINSTANCE.getKExtScope_Scopes();

    }

} //KExtPackage
