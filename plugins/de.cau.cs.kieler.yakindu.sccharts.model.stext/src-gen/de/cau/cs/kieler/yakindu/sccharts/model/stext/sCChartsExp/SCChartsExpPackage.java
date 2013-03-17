/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp;

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
 * @model kind="package"
 * @generated
 */
public interface SCChartsExpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sCChartsExp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/yakindu/sccharts/stext/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sCChartsExp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SCChartsExpPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = SynctextPackage.VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = SynctextPackage.VARIABLE_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__OWNING_TYPE = SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__READONLY = SynctextPackage.VARIABLE_DEFINITION__READONLY;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__EXTERNAL = SynctextPackage.VARIABLE_DEFINITION__EXTERNAL;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__INITIAL_VALUE = SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_INPUT = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_OUTPUT = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsInput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsOutput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SCChartsExpFactory getSCChartsExpFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_INPUT = eINSTANCE.getVariableDefinition_IsInput();

    /**
     * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_OUTPUT = eINSTANCE.getVariableDefinition_IsOutput();

    /**
     * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_STATIC = eINSTANCE.getVariableDefinition_IsStatic();

    /**
     * The meta object literal for the '<em><b>Var Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = eINSTANCE.getVariableDefinition_VarCombineOperator();

  }

} //SCChartsExpPackage
