/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext;

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

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
 * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextFactory
 * @model kind="package"
 * @generated
 */
public interface SyncChartstextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "syncChartstext";

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
  String eNS_PREFIX = "syncChartstext";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SyncChartstextPackage eINSTANCE = de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getSignalDefinition()
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
  int SIGNAL_DEFINITION__NAME = SynctextPackage.SIGNAL_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Signal Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_FEATURE_COUNT = SynctextPackage.SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getVariableDefinition()
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
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_INITIAL_VALUE = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SynctextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getEventDefinition()
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
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#getVarInitialValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarInitialValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#isIsInput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#isIsOutput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsOutput();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getType()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getVarInitialValue()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.EventDefinition#getVarCombineOperator()
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
  SyncChartstextFactory getSyncChartstextFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_STATIC = eINSTANCE.getVariableDefinition_IsStatic();

    /**
     * The meta object literal for the '<em><b>Var Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__VAR_INITIAL_VALUE = eINSTANCE.getVariableDefinition_VarInitialValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextPackageImpl#getEventDefinition()
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

} //SyncChartstextPackage
