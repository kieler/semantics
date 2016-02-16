/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
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
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextFactory
 * @model kind="package"
 * @generated
 */
public interface KextPackage extends EPackage
{
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
  String eNS_URI = "http://kieler.cs.cau.de/kext/kext";

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
  KextPackage eINSTANCE = de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl.init();

  /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextImpl <em>Kext</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getKext()
	 * @generated
	 */
  int KEXT = 0;

  /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl <em>Test Entity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getTestEntity()
	 * @generated
	 */
  int TEST_ENTITY = 1;

  /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl <em>Annotated Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getAnnotatedExpression()
	 * @generated
	 */
  int ANNOTATED_EXPRESSION = 2;

  /**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.IdentifiableImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getIdentifiable()
	 * @generated
	 */
    int IDENTIFIABLE = 3;

/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIABLE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIABLE__ID = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIABLE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;


/**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.DeclarationScopeImpl <em>Declaration Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.DeclarationScopeImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getDeclarationScope()
	 * @generated
	 */
	int DECLARATION_SCOPE = 4;

/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_SCOPE__ANNOTATIONS = IDENTIFIABLE__ANNOTATIONS;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_SCOPE__ID = IDENTIFIABLE__ID;

/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_SCOPE__DECLARATIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

/**
	 * The number of structural features of the '<em>Declaration Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_SCOPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;


/**
	 * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.KEXTScopeImpl <em>KEXT Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KEXTScopeImpl
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getKEXTScope()
	 * @generated
	 */
	int KEXT_SCOPE = 5;

/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE__ANNOTATIONS = DECLARATION_SCOPE__ANNOTATIONS;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE__ID = DECLARATION_SCOPE__ID;

/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE__DECLARATIONS = DECLARATION_SCOPE__DECLARATIONS;

/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE__ENTITIES = DECLARATION_SCOPE_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE__SCOPES = DECLARATION_SCOPE_FEATURE_COUNT + 1;

/**
	 * The number of structural features of the '<em>KEXT Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT_SCOPE_FEATURE_COUNT = DECLARATION_SCOPE_FEATURE_COUNT + 2;

/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT__ANNOTATIONS = KEXT_SCOPE__ANNOTATIONS;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT__ID = KEXT_SCOPE__ID;

/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEXT__DECLARATIONS = KEXT_SCOPE__DECLARATIONS;

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext <em>Kext</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kext</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.Kext
	 * @generated
	 */
  EClass getKext();

  /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity <em>Test Entity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Entity</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity
	 * @generated
	 */
  EClass getTestEntity();

  /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity#getEffect()
	 * @see #getTestEntity()
	 * @generated
	 */
  EReference getTestEntity_Effect();

  /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity#getExpression()
	 * @see #getTestEntity()
	 * @generated
	 */
  EReference getTestEntity_Expression();

  /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression <em>Annotated Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Expression</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression
	 * @generated
	 */
  EClass getAnnotatedExpression();

  /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression#getExpression()
	 * @see #getAnnotatedExpression()
	 * @generated
	 */
  EReference getAnnotatedExpression_Expression();

  /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable
	 * @generated
	 */
    EClass getIdentifiable();

/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
    EAttribute getIdentifiable_Id();

/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope <em>Declaration Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Scope</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope
	 * @generated
	 */
	EClass getDeclarationScope();

/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope#getDeclarations()
	 * @see #getDeclarationScope()
	 * @generated
	 */
	EReference getDeclarationScope_Declarations();

/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope <em>KEXT Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEXT Scope</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope
	 * @generated
	 */
	EClass getKEXTScope();

/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope#getEntities()
	 * @see #getKEXTScope()
	 * @generated
	 */
	EReference getKEXTScope_Entities();

/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope#getScopes()
	 * @see #getKEXTScope()
	 * @generated
	 */
	EReference getKEXTScope_Scopes();

/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  KextFactory getKextFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextImpl <em>Kext</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getKext()
		 * @generated
		 */
    EClass KEXT = eINSTANCE.getKext();

    /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl <em>Test Entity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getTestEntity()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl <em>Annotated Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getAnnotatedExpression()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.IdentifiableImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getIdentifiable()
		 * @generated
		 */
        EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

				/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.DeclarationScopeImpl <em>Declaration Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.DeclarationScopeImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getDeclarationScope()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.KEXTScopeImpl <em>KEXT Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KEXTScopeImpl
		 * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getKEXTScope()
		 * @generated
		 */
		EClass KEXT_SCOPE = eINSTANCE.getKEXTScope();

				/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEXT_SCOPE__ENTITIES = eINSTANCE.getKEXTScope_Entities();

				/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEXT_SCOPE__SCOPES = eINSTANCE.getKEXTScope_Scopes();

  }

} //KextPackage
