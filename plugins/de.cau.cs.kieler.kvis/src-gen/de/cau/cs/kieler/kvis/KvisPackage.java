/**
 */
package de.cau.cs.kieler.kvis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.cau.cs.kieler.kvis.KvisFactory
 * @model kind="package"
 * @generated
 */
public interface KvisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kvis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/kvis/KVis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kvis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KvisPackage eINSTANCE = de.cau.cs.kieler.kvis.impl.KvisPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.VisualizationImpl <em>Visualization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.VisualizationImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVisualization()
   * @generated
   */
  int VISUALIZATION = 0;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__IMAGE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Visualization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.ElementImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Animations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANIMATIONS = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.AnimationImpl <em>Animation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.AnimationImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAnimation()
   * @generated
   */
  int ANIMATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION__MAPPINGS = 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION__CONDITION = 3;

  /**
   * The number of structural features of the '<em>Animation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.AttributeMappingImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAttributeMapping()
   * @generated
   */
  int ATTRIBUTE_MAPPING = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__LITERAL = 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__MAPPINGS = 2;

  /**
   * The number of structural features of the '<em>Attribute Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.MappingImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 4;

  /**
   * The feature id for the '<em><b>Variable Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__VARIABLE_DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Attribute Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ATTRIBUTE_DOMAIN = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.AttributeDomainImpl <em>Attribute Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.AttributeDomainImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAttributeDomain()
   * @generated
   */
  int ATTRIBUTE_DOMAIN = 7;

  /**
   * The number of structural features of the '<em>Attribute Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DOMAIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.VariableDomainImpl <em>Variable Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.VariableDomainImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVariableDomain()
   * @generated
   */
  int VARIABLE_DOMAIN = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DOMAIN__VALUE = ATTRIBUTE_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DOMAIN__RANGE = ATTRIBUTE_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DOMAIN_FEATURE_COUNT = ATTRIBUTE_DOMAIN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.IntervalImpl <em>Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.IntervalImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getInterval()
   * @generated
   */
  int INTERVAL = 6;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__TO = 1;

  /**
   * The number of structural features of the '<em>Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.ConditionImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.VariableReferenceImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Indices</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__INDICES = 2;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.ModelReferenceImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getModelReference()
   * @generated
   */
  int MODEL_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.BooleanExpressionImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.ExpressionImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT_SIDE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RELATION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT_SIDE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.impl.OperandImpl
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__LITERAL = 1;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.OperatorType <em>Operator Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.OperatorType
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getOperatorType()
   * @generated
   */
  int OPERATOR_TYPE = 14;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.AnimationType <em>Animation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.AnimationType
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAnimationType()
   * @generated
   */
  int ANIMATION_TYPE = 15;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kvis.BooleanOperatorType <em>Boolean Operator Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kvis.BooleanOperatorType
   * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getBooleanOperatorType()
   * @generated
   */
  int BOOLEAN_OPERATOR_TYPE = 16;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Visualization <em>Visualization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visualization</em>'.
   * @see de.cau.cs.kieler.kvis.Visualization
   * @generated
   */
  EClass getVisualization();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Visualization#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see de.cau.cs.kieler.kvis.Visualization#getImage()
   * @see #getVisualization()
   * @generated
   */
  EAttribute getVisualization_Image();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kvis.Visualization#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cau.cs.kieler.kvis.Visualization#getElements()
   * @see #getVisualization()
   * @generated
   */
  EReference getVisualization_Elements();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.cau.cs.kieler.kvis.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kvis.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kvis.Element#getAnimations <em>Animations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Animations</em>'.
   * @see de.cau.cs.kieler.kvis.Element#getAnimations()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Animations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Animation <em>Animation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Animation</em>'.
   * @see de.cau.cs.kieler.kvis.Animation
   * @generated
   */
  EClass getAnimation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Animation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kvis.Animation#getType()
   * @see #getAnimation()
   * @generated
   */
  EAttribute getAnimation_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Animation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.kvis.Animation#getVariable()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kvis.Animation#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see de.cau.cs.kieler.kvis.Animation#getMappings()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_Mappings();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Animation#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.cau.cs.kieler.kvis.Animation#getCondition()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_Condition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.AttributeMapping <em>Attribute Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Mapping</em>'.
   * @see de.cau.cs.kieler.kvis.AttributeMapping
   * @generated
   */
  EClass getAttributeMapping();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.AttributeMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see de.cau.cs.kieler.kvis.AttributeMapping#getAttribute()
   * @see #getAttributeMapping()
   * @generated
   */
  EAttribute getAttributeMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.AttributeMapping#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.cau.cs.kieler.kvis.AttributeMapping#getLiteral()
   * @see #getAttributeMapping()
   * @generated
   */
  EAttribute getAttributeMapping_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kvis.AttributeMapping#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see de.cau.cs.kieler.kvis.AttributeMapping#getMappings()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Mappings();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see de.cau.cs.kieler.kvis.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Mapping#getVariableDomain <em>Variable Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Domain</em>'.
   * @see de.cau.cs.kieler.kvis.Mapping#getVariableDomain()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_VariableDomain();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Mapping#getAttributeDomain <em>Attribute Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Domain</em>'.
   * @see de.cau.cs.kieler.kvis.Mapping#getAttributeDomain()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_AttributeDomain();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.VariableDomain <em>Variable Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Domain</em>'.
   * @see de.cau.cs.kieler.kvis.VariableDomain
   * @generated
   */
  EClass getVariableDomain();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.VariableDomain#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.kvis.VariableDomain#getValue()
   * @see #getVariableDomain()
   * @generated
   */
  EAttribute getVariableDomain_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.VariableDomain#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see de.cau.cs.kieler.kvis.VariableDomain#getRange()
   * @see #getVariableDomain()
   * @generated
   */
  EReference getVariableDomain_Range();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval</em>'.
   * @see de.cau.cs.kieler.kvis.Interval
   * @generated
   */
  EClass getInterval();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Interval#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see de.cau.cs.kieler.kvis.Interval#getFrom()
   * @see #getInterval()
   * @generated
   */
  EAttribute getInterval_From();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Interval#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see de.cau.cs.kieler.kvis.Interval#getTo()
   * @see #getInterval()
   * @generated
   */
  EAttribute getInterval_To();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.AttributeDomain <em>Attribute Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Domain</em>'.
   * @see de.cau.cs.kieler.kvis.AttributeDomain
   * @generated
   */
  EClass getAttributeDomain();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see de.cau.cs.kieler.kvis.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Condition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.kvis.Condition#getExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see de.cau.cs.kieler.kvis.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.VariableReference#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see de.cau.cs.kieler.kvis.VariableReference#getModel()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Model();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.VariableReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kvis.VariableReference#getName()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.kvis.VariableReference#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indices</em>'.
   * @see de.cau.cs.kieler.kvis.VariableReference#getIndices()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Indices();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Reference</em>'.
   * @see de.cau.cs.kieler.kvis.ModelReference
   * @generated
   */
  EClass getModelReference();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.ModelReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kvis.ModelReference#getName()
   * @see #getModelReference()
   * @generated
   */
  EAttribute getModelReference_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see de.cau.cs.kieler.kvis.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.cau.cs.kieler.kvis.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Expression#getLeftSide <em>Left Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Side</em>'.
   * @see de.cau.cs.kieler.kvis.Expression#getLeftSide()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_LeftSide();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Expression#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.cau.cs.kieler.kvis.Expression#getRelation()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Expression#getRightSide <em>Right Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Side</em>'.
   * @see de.cau.cs.kieler.kvis.Expression#getRightSide()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_RightSide();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kvis.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see de.cau.cs.kieler.kvis.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kvis.Operand#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.kvis.Operand#getVariable()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Variable();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kvis.Operand#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.cau.cs.kieler.kvis.Operand#getLiteral()
   * @see #getOperand()
   * @generated
   */
  EAttribute getOperand_Literal();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kvis.OperatorType <em>Operator Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Type</em>'.
   * @see de.cau.cs.kieler.kvis.OperatorType
   * @generated
   */
  EEnum getOperatorType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kvis.AnimationType <em>Animation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Animation Type</em>'.
   * @see de.cau.cs.kieler.kvis.AnimationType
   * @generated
   */
  EEnum getAnimationType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kvis.BooleanOperatorType <em>Boolean Operator Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Operator Type</em>'.
   * @see de.cau.cs.kieler.kvis.BooleanOperatorType
   * @generated
   */
  EEnum getBooleanOperatorType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KvisFactory getKvisFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.VisualizationImpl <em>Visualization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.VisualizationImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVisualization()
     * @generated
     */
    EClass VISUALIZATION = eINSTANCE.getVisualization();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUALIZATION__IMAGE = eINSTANCE.getVisualization_Image();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION__ELEMENTS = eINSTANCE.getVisualization_Elements();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.ElementImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Animations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANIMATIONS = eINSTANCE.getElement_Animations();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.AnimationImpl <em>Animation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.AnimationImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAnimation()
     * @generated
     */
    EClass ANIMATION = eINSTANCE.getAnimation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANIMATION__TYPE = eINSTANCE.getAnimation_Type();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANIMATION__VARIABLE = eINSTANCE.getAnimation_Variable();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANIMATION__MAPPINGS = eINSTANCE.getAnimation_Mappings();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANIMATION__CONDITION = eINSTANCE.getAnimation_Condition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.AttributeMappingImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAttributeMapping()
     * @generated
     */
    EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_MAPPING__ATTRIBUTE = eINSTANCE.getAttributeMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_MAPPING__LITERAL = eINSTANCE.getAttributeMapping_Literal();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__MAPPINGS = eINSTANCE.getAttributeMapping_Mappings();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.MappingImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Variable Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__VARIABLE_DOMAIN = eINSTANCE.getMapping_VariableDomain();

    /**
     * The meta object literal for the '<em><b>Attribute Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__ATTRIBUTE_DOMAIN = eINSTANCE.getMapping_AttributeDomain();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.VariableDomainImpl <em>Variable Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.VariableDomainImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVariableDomain()
     * @generated
     */
    EClass VARIABLE_DOMAIN = eINSTANCE.getVariableDomain();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DOMAIN__VALUE = eINSTANCE.getVariableDomain_Value();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DOMAIN__RANGE = eINSTANCE.getVariableDomain_Range();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.IntervalImpl <em>Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.IntervalImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getInterval()
     * @generated
     */
    EClass INTERVAL = eINSTANCE.getInterval();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL__FROM = eINSTANCE.getInterval_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL__TO = eINSTANCE.getInterval_To();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.AttributeDomainImpl <em>Attribute Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.AttributeDomainImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAttributeDomain()
     * @generated
     */
    EClass ATTRIBUTE_DOMAIN = eINSTANCE.getAttributeDomain();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.ConditionImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__MODEL = eINSTANCE.getVariableReference_Model();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCE__NAME = eINSTANCE.getVariableReference_Name();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCE__INDICES = eINSTANCE.getVariableReference_Indices();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.ModelReferenceImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getModelReference()
     * @generated
     */
    EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_REFERENCE__NAME = eINSTANCE.getModelReference_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.BooleanExpressionImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.ExpressionImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left Side</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT_SIDE = eINSTANCE.getExpression_LeftSide();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__RELATION = eINSTANCE.getExpression_Relation();

    /**
     * The meta object literal for the '<em><b>Right Side</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT_SIDE = eINSTANCE.getExpression_RightSide();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.impl.OperandImpl
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__VARIABLE = eINSTANCE.getOperand_Variable();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERAND__LITERAL = eINSTANCE.getOperand_Literal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.OperatorType
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getOperatorType()
     * @generated
     */
    EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.AnimationType <em>Animation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.AnimationType
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getAnimationType()
     * @generated
     */
    EEnum ANIMATION_TYPE = eINSTANCE.getAnimationType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kvis.BooleanOperatorType <em>Boolean Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kvis.BooleanOperatorType
     * @see de.cau.cs.kieler.kvis.impl.KvisPackageImpl#getBooleanOperatorType()
     * @generated
     */
    EEnum BOOLEAN_OPERATOR_TYPE = eINSTANCE.getBooleanOperatorType();

  }

} //KvisPackage
