/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

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
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEXT__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEXT__EFFECTS = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEXT__EXPRESSIONS = 2;

  /**
   * The number of structural features of the '<em>Kext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEXT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl <em>Annotated Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.AnnotatedExpressionImpl
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getAnnotatedExpression()
   * @generated
   */
  int ANNOTATED_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPRESSION__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Annotated Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPRESSION_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getDeclarations()
   * @see #getKext()
   * @generated
   */
  EReference getKext_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getEffects()
   * @see #getKext()
   * @generated
   */
  EReference getKext_Effects();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getExpressions()
   * @see #getKext()
   * @generated
   */
  EReference getKext_Expressions();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression#getAnnotations()
   * @see #getAnnotatedExpression()
   * @generated
   */
  EReference getAnnotatedExpression_Annotations();

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
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEXT__DECLARATIONS = eINSTANCE.getKext_Declarations();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEXT__EFFECTS = eINSTANCE.getKext_Effects();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEXT__EXPRESSIONS = eINSTANCE.getKext_Expressions();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_EXPRESSION__ANNOTATIONS = eINSTANCE.getAnnotatedExpression_Annotations();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_EXPRESSION__EXPRESSION = eINSTANCE.getAnnotatedExpression_Expression();

  }

} //KextPackage
