/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.LinkableImpl <em>Linkable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.LinkableImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getLinkable()
     * @generated
     */
    int LINKABLE = 5;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE__OUTGOING_LINKS = 0;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE__INCOMING_LINKS = 1;

    /**
     * The number of structural features of the '<em>Linkable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.LinkImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getLink()
     * @generated
     */
    int LINK = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TARGET = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.DependencyImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__ANNOTATIONS = LINK__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__TARGET = LINK__TARGET;

    /**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.impl.DataDependencyImpl
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDataDependency()
     * @generated
     */
    int DATA_DEPENDENCY = 8;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__TARGET = DEPENDENCY__TARGET;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__TYPE = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__CONCURRENT = DEPENDENCY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Confluent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY__CONFLUENT = DEPENDENCY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.kext.DataDependencyType <em>Data Dependency Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependencyType
     * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDataDependencyType()
     * @generated
     */
    int DATA_DEPENDENCY_TYPE = 9;


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
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.Linkable <em>Linkable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linkable</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Linkable
     * @generated
     */
    EClass getLinkable();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.kext.Linkable#getOutgoingLinks <em>Outgoing Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Links</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Linkable#getOutgoingLinks()
     * @see #getLinkable()
     * @generated
     */
    EReference getLinkable_OutgoingLinks();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.kexpressions.kext.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Links</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Linkable#getIncomingLinks()
     * @see #getLinkable()
     * @generated
     */
    EReference getLinkable_IncomingLinks();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.kext.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Link#getTarget()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Target();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.kext.DataDependency <em>Data Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Dependency</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependency
     * @generated
     */
    EClass getDataDependency();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.kext.DataDependency#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependency#getType()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.kext.DataDependency#isConcurrent <em>Concurrent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependency#isConcurrent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Concurrent();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.kext.DataDependency#isConfluent <em>Confluent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confluent</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependency#isConfluent()
     * @see #getDataDependency()
     * @generated
     */
    EAttribute getDataDependency_Confluent();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.kext.DataDependencyType <em>Data Dependency Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Dependency Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.kext.DataDependencyType
     * @generated
     */
    EEnum getDataDependencyType();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.LinkableImpl <em>Linkable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.LinkableImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getLinkable()
         * @generated
         */
        EClass LINKABLE = eINSTANCE.getLinkable();

        /**
         * The meta object literal for the '<em><b>Outgoing Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE__OUTGOING_LINKS = eINSTANCE.getLinkable_OutgoingLinks();

        /**
         * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE__INCOMING_LINKS = eINSTANCE.getLinkable_IncomingLinks();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.LinkImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getLink()
         * @generated
         */
        EClass LINK = eINSTANCE.getLink();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK__TARGET = eINSTANCE.getLink_Target();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.DependencyImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.impl.DataDependencyImpl <em>Data Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.impl.DataDependencyImpl
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDataDependency()
         * @generated
         */
        EClass DATA_DEPENDENCY = eINSTANCE.getDataDependency();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__TYPE = eINSTANCE.getDataDependency_Type();

        /**
         * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONCURRENT = eINSTANCE.getDataDependency_Concurrent();

        /**
         * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_DEPENDENCY__CONFLUENT = eINSTANCE.getDataDependency_Confluent();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.kext.DataDependencyType <em>Data Dependency Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.kext.DataDependencyType
         * @see de.cau.cs.kieler.kexpressions.kext.impl.KExtPackageImpl#getDataDependencyType()
         * @generated
         */
        EEnum DATA_DEPENDENCY_TYPE = eINSTANCE.getDataDependencyType();

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
