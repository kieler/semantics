/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

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
 * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelFactory
 * @model kind="package"
 * @generated
 */
public interface TransitionlabelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "transitionlabel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/synccharts/actionlabel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "transitionlabel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransitionlabelPackage eINSTANCE = de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Parent Action</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__PARENT_ACTION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__PARENT_EMISSON = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__PARENT_ASSIGNMENT = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__PARENT_EXPRESSION = VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Parent Action</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__PARENT_ACTION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__PARENT_EMISSON = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__PARENT_ASSIGNMENT = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__PARENT_EXPRESSION = VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 2;

  /**
   * The feature id for the '<em><b>Parent Action</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__PARENT_ACTION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__PARENT_EMISSON = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__PARENT_ASSIGNMENT = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__PARENT_EXPRESSION = VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 4;

  /**
   * The feature id for the '<em><b>Parent Action</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARENT_ACTION = SyncchartsPackage.EXPRESSION__PARENT_ACTION;

  /**
   * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARENT_EMISSON = SyncchartsPackage.EXPRESSION__PARENT_EMISSON;

  /**
   * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARENT_ASSIGNMENT = SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARENT_EXPRESSION = SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SUB_EXPRESSIONS = SyncchartsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OPERATOR = SyncchartsPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SUB_EXPRESSION = SyncchartsPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = SyncchartsPackage.EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpressions <em>Sub Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpressions()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SubExpressions();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation#getOperator()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpression()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SubExpression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TransitionlabelFactory getTransitionlabelFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SUB_EXPRESSIONS = eINSTANCE.getOperation_SubExpressions();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OPERATOR = eINSTANCE.getOperation_Operator();

    /**
     * The meta object literal for the '<em><b>Sub Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SUB_EXPRESSION = eINSTANCE.getOperation_SubExpression();

  }

} //TransitionlabelPackage
