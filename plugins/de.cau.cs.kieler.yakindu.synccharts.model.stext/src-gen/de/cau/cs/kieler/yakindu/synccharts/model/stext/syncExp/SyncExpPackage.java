/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;

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
 * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SyncExpFactory
 * @model kind="package"
 * @generated
 */
public interface SyncExpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "syncExp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/yakindu/synccharts/stext/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "syncExp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SyncExpPackage eINSTANCE = de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getSignalDefinition()
   * @generated
   */
  int SIGNAL_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION__NAME = SCChartsExpPackage.SIGNAL_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Signal Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_FEATURE_COUNT = SCChartsExpPackage.SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = SCChartsExpPackage.VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = SCChartsExpPackage.VARIABLE_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__OWNING_TYPE = SCChartsExpPackage.VARIABLE_DEFINITION__OWNING_TYPE;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__READONLY = SCChartsExpPackage.VARIABLE_DEFINITION__READONLY;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__EXTERNAL = SCChartsExpPackage.VARIABLE_DEFINITION__EXTERNAL;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__INITIAL_VALUE = SCChartsExpPackage.VARIABLE_DEFINITION__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_INPUT = SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_OUTPUT = SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_INITIAL_VALUE = SCChartsExpPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SCChartsExpPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getEventDefinition()
   * @generated
   */
  int EVENT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__NAME = SIGNAL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__IS_INPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__IS_OUTPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__TYPE = SIGNAL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__VAR_INITIAL_VALUE = SIGNAL_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__VAR_COMBINE_OPERATOR = SIGNAL_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Event Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION_FEATURE_COUNT = SIGNAL_DEFINITION_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.VariableDefinition#getVarInitialValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarInitialValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#isIsInput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#isIsOutput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsOutput();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getType()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getVarInitialValue()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition#getVarCombineOperator()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_VarCombineOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SyncExpFactory getSyncExpFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Var Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__VAR_INITIAL_VALUE = eINSTANCE.getVariableDefinition_VarInitialValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl.SyncExpPackageImpl#getEventDefinition()
     * @generated
     */
    EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

    /**
     * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__IS_INPUT = eINSTANCE.getEventDefinition_IsInput();

    /**
     * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__IS_OUTPUT = eINSTANCE.getEventDefinition_IsOutput();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DEFINITION__TYPE = eINSTANCE.getEventDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Var Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DEFINITION__VAR_INITIAL_VALUE = eINSTANCE.getEventDefinition_VarInitialValue();

    /**
     * The meta object literal for the '<em><b>Var Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__VAR_COMBINE_OPERATOR = eINSTANCE.getEventDefinition_VarCombineOperator();

  }

} //SyncExpPackage
