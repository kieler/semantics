/**
 */
package de.cau.cs.kieler.kivis.kivis;

import de.cau.cs.kieler.prom.kibuild.KibuildPackage;

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
 * @see de.cau.cs.kieler.kivis.kivis.KivisFactory
 * @model kind="package"
 * @generated
 */
public interface KivisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kivis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/kivis/KiVis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kivis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KivisPackage eINSTANCE = de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl <em>Visualization Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getVisualizationConfiguration()
   * @generated
   */
  int VISUALIZATION_CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_CONFIGURATION__IMAGE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_CONFIGURATION__ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_CONFIGURATION__INTERACTIONS = 2;

  /**
   * The number of structural features of the '<em>Visualization Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.ElementImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getElement()
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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.InteractionImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 2;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.EventImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 3;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.ActionImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAction()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OPERATION = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AnimationImpl <em>Animation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.AnimationImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAnimation()
   * @generated
   */
  int ANIMATION = 5;

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
   * The feature id for the '<em><b>Attribute Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION__ATTRIBUTE_MAPPINGS = 2;

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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.AttributeMappingImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAttributeMapping()
   * @generated
   */
  int ATTRIBUTE_MAPPING = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__NAME = KibuildPackage.ATTRIBUTE_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__VALUE = KibuildPackage.ATTRIBUTE_MAPPING__VALUE;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__VALUES = KibuildPackage.ATTRIBUTE_MAPPING__VALUES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__ATTRIBUTES = KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__ATTRIBUTE = KibuildPackage.ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__LITERAL = KibuildPackage.ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__MAPPINGS = KibuildPackage.ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING_FEATURE_COUNT = KibuildPackage.ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.MappingImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 7;

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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.ConditionImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RELATION = CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.DomainImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__RANGE = 1;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.IntervalImpl <em>Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.IntervalImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getInterval()
   * @generated
   */
  int INTERVAL = 11;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.VariableReferenceImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 12;

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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.ModelReferenceImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getModelReference()
   * @generated
   */
  int MODEL_REFERENCE = 13;

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
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.BooleanOperatorImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getBooleanOperator()
   * @generated
   */
  int BOOLEAN_OPERATOR = 14;

  /**
   * The feature id for the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATOR__AND = 0;

  /**
   * The number of structural features of the '<em>Boolean Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.impl.AndExpressionImpl
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OPERATOR = CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.DOMEvent <em>DOM Event</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.DOMEvent
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getDOMEvent()
   * @generated
   */
  int DOM_EVENT = 16;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kivis.kivis.SimulationOperation <em>Simulation Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kivis.kivis.SimulationOperation
   * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getSimulationOperation()
   * @generated
   */
  int SIMULATION_OPERATION = 17;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration <em>Visualization Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visualization Configuration</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration
   * @generated
   */
  EClass getVisualizationConfiguration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getImage()
   * @see #getVisualizationConfiguration()
   * @generated
   */
  EAttribute getVisualizationConfiguration_Image();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getElements()
   * @see #getVisualizationConfiguration()
   * @generated
   */
  EReference getVisualizationConfiguration_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getInteractions <em>Interactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactions</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration#getInteractions()
   * @see #getVisualizationConfiguration()
   * @generated
   */
  EReference getVisualizationConfiguration_Interactions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.Element#getAnimations <em>Animations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Animations</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Element#getAnimations()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Animations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Interaction#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interaction#getEvent()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Event();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.Interaction#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interaction#getActions()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Actions();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Interaction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interaction#getCondition()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Condition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Event#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Event#getEvent()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Event();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Event#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Event#getElement()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Element();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Action#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Action#getVariable()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Variable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Action#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Action#getValue()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Value();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Action#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Action#getOperation()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Operation();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Animation <em>Animation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Animation</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Animation
   * @generated
   */
  EClass getAnimation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Animation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Animation#getType()
   * @see #getAnimation()
   * @generated
   */
  EAttribute getAnimation_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Animation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Animation#getVariable()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.Animation#getAttributeMappings <em>Attribute Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Mappings</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Animation#getAttributeMappings()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_AttributeMappings();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Animation#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Animation#getCondition()
   * @see #getAnimation()
   * @generated
   */
  EReference getAnimation_Condition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.AttributeMapping <em>Attribute Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Mapping</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AttributeMapping
   * @generated
   */
  EClass getAttributeMapping();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.AttributeMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AttributeMapping#getAttribute()
   * @see #getAttributeMapping()
   * @generated
   */
  EAttribute getAttributeMapping_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.AttributeMapping#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AttributeMapping#getLiteral()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kivis.kivis.AttributeMapping#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AttributeMapping#getMappings()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Mappings();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Mapping#getVariableDomain <em>Variable Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Domain</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Mapping#getVariableDomain()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_VariableDomain();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Mapping#getAttributeDomain <em>Attribute Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Domain</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Mapping#getAttributeDomain()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_AttributeDomain();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.Comparison#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Comparison#getRelation()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Domain#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Domain#getValue()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Domain#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Domain#getRange()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Range();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interval
   * @generated
   */
  EClass getInterval();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Interval#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interval#getFrom()
   * @see #getInterval()
   * @generated
   */
  EReference getInterval_From();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.Interval#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.Interval#getTo()
   * @see #getInterval()
   * @generated
   */
  EReference getInterval_To();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.VariableReference#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VariableReference#getModel()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Model();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.VariableReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VariableReference#getName()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.kivis.kivis.VariableReference#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indices</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.VariableReference#getIndices()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Indices();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Reference</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.ModelReference
   * @generated
   */
  EClass getModelReference();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.ModelReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.ModelReference#getName()
   * @see #getModelReference()
   * @generated
   */
  EAttribute getModelReference_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.BooleanOperator <em>Boolean Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Operator</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.BooleanOperator
   * @generated
   */
  EClass getBooleanOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.BooleanOperator#getAND <em>AND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AND</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.BooleanOperator#getAND()
   * @see #getBooleanOperator()
   * @generated
   */
  EAttribute getBooleanOperator_AND();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kivis.kivis.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.AndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AndExpression#getLeft()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kivis.kivis.AndExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AndExpression#getOperator()
   * @see #getAndExpression()
   * @generated
   */
  EAttribute getAndExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kivis.kivis.AndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.AndExpression#getRight()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Right();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kivis.kivis.DOMEvent <em>DOM Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DOM Event</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.DOMEvent
   * @generated
   */
  EEnum getDOMEvent();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kivis.kivis.SimulationOperation <em>Simulation Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Simulation Operation</em>'.
   * @see de.cau.cs.kieler.kivis.kivis.SimulationOperation
   * @generated
   */
  EEnum getSimulationOperation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KivisFactory getKivisFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl <em>Visualization Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.VisualizationConfigurationImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getVisualizationConfiguration()
     * @generated
     */
    EClass VISUALIZATION_CONFIGURATION = eINSTANCE.getVisualizationConfiguration();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISUALIZATION_CONFIGURATION__IMAGE = eINSTANCE.getVisualizationConfiguration_Image();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION_CONFIGURATION__ELEMENTS = eINSTANCE.getVisualizationConfiguration_Elements();

    /**
     * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION_CONFIGURATION__INTERACTIONS = eINSTANCE.getVisualizationConfiguration_Interactions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.ElementImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getElement()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.InteractionImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__EVENT = eINSTANCE.getInteraction_Event();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__ACTIONS = eINSTANCE.getInteraction_Actions();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__CONDITION = eINSTANCE.getInteraction_Condition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.EventImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENT = eINSTANCE.getEvent_Event();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__ELEMENT = eINSTANCE.getEvent_Element();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.ActionImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__VARIABLE = eINSTANCE.getAction_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__VALUE = eINSTANCE.getAction_Value();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__OPERATION = eINSTANCE.getAction_Operation();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AnimationImpl <em>Animation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.AnimationImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAnimation()
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
     * The meta object literal for the '<em><b>Attribute Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANIMATION__ATTRIBUTE_MAPPINGS = eINSTANCE.getAnimation_AttributeMappings();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANIMATION__CONDITION = eINSTANCE.getAnimation_Condition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.AttributeMappingImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAttributeMapping()
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
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__LITERAL = eINSTANCE.getAttributeMapping_Literal();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__MAPPINGS = eINSTANCE.getAttributeMapping_Mappings();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.MappingImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getMapping()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.ConditionImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__RELATION = eINSTANCE.getComparison_Relation();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.DomainImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__VALUE = eINSTANCE.getDomain_Value();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__RANGE = eINSTANCE.getDomain_Range();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.IntervalImpl <em>Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.IntervalImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getInterval()
     * @generated
     */
    EClass INTERVAL = eINSTANCE.getInterval();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL__FROM = eINSTANCE.getInterval_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVAL__TO = eINSTANCE.getInterval_To();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getVariableReference()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.ModelReferenceImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getModelReference()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.BooleanOperatorImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getBooleanOperator()
     * @generated
     */
    EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

    /**
     * The meta object literal for the '<em><b>AND</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_OPERATOR__AND = eINSTANCE.getBooleanOperator_AND();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.impl.AndExpressionImpl
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXPRESSION__OPERATOR = eINSTANCE.getAndExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.DOMEvent <em>DOM Event</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.DOMEvent
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getDOMEvent()
     * @generated
     */
    EEnum DOM_EVENT = eINSTANCE.getDOMEvent();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kivis.kivis.SimulationOperation <em>Simulation Operation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kivis.kivis.SimulationOperation
     * @see de.cau.cs.kieler.kivis.kivis.impl.KivisPackageImpl#getSimulationOperation()
     * @generated
     */
    EEnum SIMULATION_OPERATION = eINSTANCE.getSimulationOperation();

  }

} //KivisPackage
