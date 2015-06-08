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
   * The number of structural features of the '<em>Kext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.StringAnnotationImpl
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getStringAnnotation()
   * @generated
   */
  int STRING_ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ANNOTATION__ANNOTATIONS = AnnotationsPackage.STRING_ANNOTATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ANNOTATION__NAME = AnnotationsPackage.STRING_ANNOTATION__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ANNOTATION__VALUES = AnnotationsPackage.STRING_ANNOTATION__VALUES;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ANNOTATION__VALUE = AnnotationsPackage.STRING_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ANNOTATION_FEATURE_COUNT = AnnotationsPackage.STRING_ANNOTATION_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.text.kext.StringAnnotation <em>String Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Annotation</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.StringAnnotation
   * @generated
   */
  EClass getStringAnnotation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.text.kext.StringAnnotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.StringAnnotation#getValue()
   * @see #getStringAnnotation()
   * @generated
   */
  EAttribute getStringAnnotation_Value();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.StringAnnotationImpl <em>String Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.StringAnnotationImpl
     * @see de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextPackageImpl#getStringAnnotation()
     * @generated
     */
    EClass STRING_ANNOTATION = eINSTANCE.getStringAnnotation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ANNOTATION__VALUE = eINSTANCE.getStringAnnotation_Value();

  }

} //KextPackage
