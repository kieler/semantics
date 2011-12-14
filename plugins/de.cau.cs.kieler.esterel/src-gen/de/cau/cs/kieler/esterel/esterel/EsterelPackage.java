/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

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
 * @see de.cau.cs.kieler.esterel.esterel.EsterelFactory
 * @model kind="package"
 * @generated
 */
public interface EsterelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "esterel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/esterel/Esterel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "esterel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsterelPackage eINSTANCE = de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MODULES = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INTERFACE = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__BODY = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__END = 3;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleBodyImpl <em>Module Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleBody()
   * @generated
   */
  int MODULE_BODY = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BODY__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Module Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleInterfaceImpl <em>Module Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleInterfaceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleInterface()
   * @generated
   */
  int MODULE_INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_SIGNAL_DECLS = 0;

  /**
   * The feature id for the '<em><b>Int Type Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_TYPE_DECLS = 1;

  /**
   * The feature id for the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_SENSOR_DECLS = 2;

  /**
   * The feature id for the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_CONSTANT_DECLS = 3;

  /**
   * The feature id for the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_RELATION_DECLS = 4;

  /**
   * The feature id for the '<em><b>Int Task Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_TASK_DECLS = 5;

  /**
   * The feature id for the '<em><b>Int Function Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_FUNCTION_DECLS = 6;

  /**
   * The feature id for the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_PROCEDURE_DECLS = 7;

  /**
   * The number of structural features of the '<em>Module Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getChannelDescription()
   * @generated
   */
  int CHANNEL_DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION__TYPE = KExpressionsPackage.CHANNEL_DESCRIPTION__TYPE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION__EXPRESSION = KExpressionsPackage.CHANNEL_DESCRIPTION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Channel Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION_FEATURE_COUNT = KExpressionsPackage.CHANNEL_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeIdentifier()
   * @generated
   */
  int TYPE_IDENTIFIER = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__TYPE = KExpressionsPackage.TYPE_IDENTIFIER__TYPE;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__TYPE_ID = KExpressionsPackage.TYPE_IDENTIFIER__TYPE_ID;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__OPERATOR = KExpressionsPackage.TYPE_IDENTIFIER__OPERATOR;

  /**
   * The number of structural features of the '<em>Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER_FEATURE_COUNT = KExpressionsPackage.TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.StatementContainerImpl <em>Statement Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.StatementContainerImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getStatementContainer()
   * @generated
   */
  int STATEMENT_CONTAINER = 25;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONTAINER__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Statement Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl <em>Local Signal Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignalDecl()
   * @generated
   */
  int LOCAL_SIGNAL_DECL = 6;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Signal List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__SIGNAL_LIST = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Signal Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalListImpl <em>Local Signal List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalListImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignalList()
   * @generated
   */
  int LOCAL_SIGNAL_LIST = 7;

  /**
   * The number of structural features of the '<em>Local Signal List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl <em>Sensor Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorDecl()
   * @generated
   */
  int SENSOR_DECL = 8;

  /**
   * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL__SENSORS = 0;

  /**
   * The number of structural features of the '<em>Sensor Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl <em>Sensor With Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorWithType()
   * @generated
   */
  int SENSOR_WITH_TYPE = 9;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_WITH_TYPE__SENSOR = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_WITH_TYPE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Sensor With Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_WITH_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationDeclImpl <em>Relation Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationDecl()
   * @generated
   */
  int RELATION_DECL = 10;

  /**
   * The number of structural features of the '<em>Relation Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationTypeImpl <em>Relation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationTypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationType()
   * @generated
   */
  int RELATION_TYPE = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Relation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationImplicationImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationImplication()
   * @generated
   */
  int RELATION_IMPLICATION = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_IMPLICATION__TYPE = RELATION_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_IMPLICATION__FIRST = RELATION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_IMPLICATION__SECOND = RELATION_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_IMPLICATION_FEATURE_COUNT = RELATION_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationIncompatibilityImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
   * @generated
   */
  int RELATION_INCOMPATIBILITY = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INCOMPATIBILITY__TYPE = RELATION_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Incomp</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INCOMPATIBILITY__INCOMP = RELATION_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relation Incompatibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INCOMPATIBILITY_FEATURE_COUNT = RELATION_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 14;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantDeclsImpl <em>Constant Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantDeclsImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantDecls()
   * @generated
   */
  int CONSTANT_DECLS = 16;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLS__CONSTANTS = 0;

  /**
   * The number of structural features of the '<em>Constant Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl <em>One Type Constant Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOneTypeConstantDecls()
   * @generated
   */
  int ONE_TYPE_CONSTANT_DECLS = 17;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECLS__CONSTANTS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECLS__TYPE = 1;

  /**
   * The number of structural features of the '<em>One Type Constant Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantWithValueImpl <em>Constant With Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantWithValueImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantWithValue()
   * @generated
   */
  int CONSTANT_WITH_VALUE = 18;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_WITH_VALUE__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_WITH_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Constant With Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_WITH_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionDecl()
   * @generated
   */
  int FUNCTION_DECL = 19;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__FUNCTIONS = 0;

  /**
   * The number of structural features of the '<em>Function Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ID_LIST = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureDeclImpl <em>Procedure Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedureDecl()
   * @generated
   */
  int PROCEDURE_DECL = 21;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL__PROCEDURES = 0;

  /**
   * The number of structural features of the '<em>Procedure Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id List1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ID_LIST1 = 1;

  /**
   * The feature id for the '<em><b>Id List2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ID_LIST2 = 2;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskDeclImpl <em>Task Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TaskDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTaskDecl()
   * @generated
   */
  int TASK_DECL = 23;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECL__TASKS = 0;

  /**
   * The number of structural features of the '<em>Task Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TaskImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTask()
   * @generated
   */
  int TASK = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Id List1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID_LIST1 = 1;

  /**
   * The feature id for the '<em><b>Id List2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID_LIST2 = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.StatementImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 26;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.BlockImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 27;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AssignmentImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 28;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl <em>Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbort()
   * @generated
   */
  int ABORT = 29;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__BODY = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortBodyImpl <em>Abort Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortBody()
   * @generated
   */
  int ABORT_BODY = 30;

  /**
   * The number of structural features of the '<em>Abort Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortInstanceImpl <em>Abort Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortInstanceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortInstance()
   * @generated
   */
  int ABORT_INSTANCE = 31;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__DELAY = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abort Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortCaseImpl <em>Abort Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortCase()
   * @generated
   */
  int ABORT_CASE = 32;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE__CASES = ABORT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE__OPT_END = ABORT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abort Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_FEATURE_COUNT = ABORT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortCaseSingleImpl <em>Abort Case Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortCaseSingleImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortCaseSingle()
   * @generated
   */
  int ABORT_CASE_SINGLE = 33;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE__DELAY = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abort Case Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortBodyImpl <em>Weak Abort Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortBody()
   * @generated
   */
  int WEAK_ABORT_BODY = 34;

  /**
   * The number of structural features of the '<em>Weak Abort Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndImpl <em>Weak Abort End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortEnd()
   * @generated
   */
  int WEAK_ABORT_END = 35;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_END__OPT_END = 0;

  /**
   * The number of structural features of the '<em>Weak Abort End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndAltImpl <em>Weak Abort End Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndAltImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortEndAlt()
   * @generated
   */
  int WEAK_ABORT_END_ALT = 36;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_END_ALT__END = 0;

  /**
   * The feature id for the '<em><b>End A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_END_ALT__END_A = 1;

  /**
   * The number of structural features of the '<em>Weak Abort End Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_END_ALT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl <em>Await</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwait()
   * @generated
   */
  int AWAIT = 37;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__BODY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Await</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitBodyImpl <em>Await Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitBody()
   * @generated
   */
  int AWAIT_BODY = 38;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_BODY__END = 0;

  /**
   * The number of structural features of the '<em>Await Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitInstanceImpl <em>Await Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitInstanceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitInstance()
   * @generated
   */
  int AWAIT_INSTANCE = 39;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_INSTANCE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_INSTANCE__END = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_INSTANCE__DELAY = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Await Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_INSTANCE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitCaseImpl <em>Await Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitCase()
   * @generated
   */
  int AWAIT_CASE = 40;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE__END = AWAIT_BODY__END;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE__CASES = AWAIT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Await Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE_FEATURE_COUNT = AWAIT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl <em>Proc Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcCall()
   * @generated
   */
  int PROC_CALL = 41;

  /**
   * The feature id for the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__PROC = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__VAR_LIST = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__KEXPRESSIONS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Proc Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl <em>Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DoImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDo()
   * @generated
   */
  int DO = 42;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__END = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoUptoImpl <em>Do Upto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DoUptoImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoUpto()
   * @generated
   */
  int DO_UPTO = 43;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_UPTO__EXPR = 0;

  /**
   * The number of structural features of the '<em>Do Upto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_UPTO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoWatchingImpl <em>Do Watching</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DoWatchingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoWatching()
   * @generated
   */
  int DO_WATCHING = 44;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING__DELAY = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING__END = 1;

  /**
   * The number of structural features of the '<em>Do Watching</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoWatchingEndImpl <em>Do Watching End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DoWatchingEndImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoWatchingEnd()
   * @generated
   */
  int DO_WATCHING_END = 45;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_END__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_END__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Do Watching End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_END_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EmitImpl <em>Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EmitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEmit()
   * @generated
   */
  int EMIT = 46;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__SIGNAL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__TICK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__EXPR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Emit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEveryDo()
   * @generated
   */
  int EVERY_DO = 47;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__DELAY = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Every Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExit()
   * @generated
   */
  int EXIT = 48;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__TRAP = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.HaltImpl <em>Halt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.HaltImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getHalt()
   * @generated
   */
  int HALT = 49;

  /**
   * The number of structural features of the '<em>Halt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl <em>If Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIfTest()
   * @generated
   */
  int IF_TEST = 50;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__THEN_PART = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elsif</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSIF = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSE_PART = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__OPT_END = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>If Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getElsIf()
   * @generated
   */
  int ELS_IF = 51;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__EXPR = 0;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__THEN_PART = 1;

  /**
   * The number of structural features of the '<em>Els If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ThenPartImpl <em>Then Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ThenPartImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getThenPart()
   * @generated
   */
  int THEN_PART = 52;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_PART__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The number of structural features of the '<em>Then Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_PART_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ElsePartImpl <em>Else Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ElsePartImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getElsePart()
   * @generated
   */
  int ELSE_PART = 53;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The number of structural features of the '<em>Else Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LoopImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 54;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__BODY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__END1 = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__END = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EndLoopImpl <em>End Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EndLoopImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEndLoop()
   * @generated
   */
  int END_LOOP = 55;

  /**
   * The feature id for the '<em><b>End Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_LOOP__END_OPT = 0;

  /**
   * The number of structural features of the '<em>End Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_LOOP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopEachImpl <em>Loop Each</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LoopEachImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopEach()
   * @generated
   */
  int LOOP_EACH = 56;

  /**
   * The number of structural features of the '<em>Loop Each</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_EACH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopDelayImpl <em>Loop Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LoopDelayImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopDelay()
   * @generated
   */
  int LOOP_DELAY = 57;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_DELAY__DELAY = LOOP_EACH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Loop Delay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_DELAY_FEATURE_COUNT = LOOP_EACH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopBodyImpl <em>Loop Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LoopBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopBody()
   * @generated
   */
  int LOOP_BODY = 58;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_BODY__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The number of structural features of the '<em>Loop Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_BODY_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.NothingImpl <em>Nothing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.NothingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getNothing()
   * @generated
   */
  int NOTHING = 59;

  /**
   * The number of structural features of the '<em>Nothing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTHING_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PauseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 60;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl <em>Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresent()
   * @generated
   */
  int PRESENT = 61;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__BODY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__ELSE_PART = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__OPT_END = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentBodyImpl <em>Present Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentBody()
   * @generated
   */
  int PRESENT_BODY = 62;

  /**
   * The number of structural features of the '<em>Present Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentEventBodyImpl <em>Present Event Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentEventBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentEventBody()
   * @generated
   */
  int PRESENT_EVENT_BODY = 63;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT_BODY__EVENT = PRESENT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT_BODY__THEN_PART = PRESENT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Present Event Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT_BODY_FEATURE_COUNT = PRESENT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentCaseListImpl <em>Present Case List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentCaseListImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentCaseList()
   * @generated
   */
  int PRESENT_CASE_LIST = 64;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_LIST__CASES = PRESENT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Present Case List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_LIST_FEATURE_COUNT = PRESENT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentCase()
   * @generated
   */
  int PRESENT_CASE = 65;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__EVENT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Present Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentEventImpl <em>Present Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentEventImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentEvent()
   * @generated
   */
  int PRESENT_EVENT = 66;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>FB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT__FB = 1;

  /**
   * The feature id for the '<em><b>EB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT__EB = 2;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT__TICK = 3;

  /**
   * The number of structural features of the '<em>Present Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRepeat()
   * @generated
   */
  int REPEAT = 67;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Positive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__POSITIVE = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__EXPRESSION = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RunImpl <em>Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RunImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRun()
   * @generated
   */
  int RUN = 68;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__MODULE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__LIST = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleRenaming()
   * @generated
   */
  int MODULE_RENAMING = 69;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING__MODULE = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Module Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingListImpl <em>Renaming List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingListImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenamingList()
   * @generated
   */
  int RENAMING_LIST = 70;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>Renaming List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 71;

  /**
   * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__RENAMINGS = 0;

  /**
   * The number of structural features of the '<em>Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeRenaming()
   * @generated
   */
  int TYPE_RENAMING = 72;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>New Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING__NEW_TYPE = 1;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING__OLD_NAME = 2;

  /**
   * The number of structural features of the '<em>Type Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantRenaming()
   * @generated
   */
  int CONSTANT_RENAMING = 73;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>New Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING__NEW_VALUE = 1;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING__OLD_NAME = 2;

  /**
   * The number of structural features of the '<em>Constant Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
   * @generated
   */
  int FUNCTION_RENAMING = 74;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>New Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING__NEW_FUNC = 1;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING__OLD_NAME = 2;

  /**
   * The number of structural features of the '<em>Function Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
   * @generated
   */
  int PROCEDURE_RENAMING = 75;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_RENAMING__OLD_NAME = 1;

  /**
   * The number of structural features of the '<em>Procedure Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskRenamingImpl <em>Task Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TaskRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTaskRenaming()
   * @generated
   */
  int TASK_RENAMING = 76;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_RENAMING__OLD_NAME = 1;

  /**
   * The number of structural features of the '<em>Task Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSignalRenaming()
   * @generated
   */
  int SIGNAL_RENAMING = 77;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING__OLD_NAME = 1;

  /**
   * The number of structural features of the '<em>Signal Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSuspend()
   * @generated
   */
  int SUSPEND = 78;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__DELAY = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Suspend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SustainImpl <em>Sustain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SustainImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSustain()
   * @generated
   */
  int SUSTAIN = 79;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__SIGNAL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__TICK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sustain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapImpl <em>Trap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrap()
   * @generated
   */
  int TRAP = 80;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Trap Decl List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_DECL_LIST = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trap Handler</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_HANDLER = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapDeclListImpl <em>Trap Decl List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapDeclListImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapDeclList()
   * @generated
   */
  int TRAP_DECL_LIST = 81;

  /**
   * The feature id for the '<em><b>Trap Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_LIST__TRAP_DECLS = 0;

  /**
   * The number of structural features of the '<em>Trap Decl List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapHandler()
   * @generated
   */
  int TRAP_HANDLER = 82;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Trap Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__TRAP_EXPR = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trap Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 83;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__VAR = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl <em>Delay Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDelayExpr()
   * @generated
   */
  int DELAY_EXPR = 84;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__EXPR = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__EVENT = 1;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__IS_IMMEDIATE = 2;

  /**
   * The number of structural features of the '<em>Delay Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DelayEventImpl <em>Delay Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DelayEventImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDelayEvent()
   * @generated
   */
  int DELAY_EVENT = 85;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__TICK = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__EXPR = 1;

  /**
   * The feature id for the '<em><b>FB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__FB = 2;

  /**
   * The feature id for the '<em><b>EB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__EB = 3;

  /**
   * The number of structural features of the '<em>Delay Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl <em>Exec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExecImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExec()
   * @generated
   */
  int EXEC = 86;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__TASK = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__BODY = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ret Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__RET_SIGNAL = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exec Case List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__EXEC_CASE_LIST = STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__OPT_END = STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Exec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecBodyImpl <em>Exec Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExecBodyImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExecBody()
   * @generated
   */
  int EXEC_BODY = 87;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BODY__VARS = 0;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BODY__KEXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Exec Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl <em>Exec Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExecCase()
   * @generated
   */
  int EXEC_CASE = 88;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__STATEMENT = STATEMENT_CONTAINER__STATEMENT;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__TASK = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__BODY = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ret Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__RET_SIGNAL = STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exec Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeIdentifierImpl <em>Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeIdentifierImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelTypeIdentifier()
   * @generated
   */
  int ESTEREL_TYPE_IDENTIFIER = 89;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_IDENTIFIER__TYPE = KExpressionsPackage.TYPE_IDENTIFIER__TYPE;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_IDENTIFIER__TYPE_ID = KExpressionsPackage.TYPE_IDENTIFIER__TYPE_ID;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_IDENTIFIER__OPERATOR = KExpressionsPackage.TYPE_IDENTIFIER__OPERATOR;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_IDENTIFIER__FUNC = KExpressionsPackage.TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_IDENTIFIER_FEATURE_COUNT = KExpressionsPackage.TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelType()
   * @generated
   */
  int ESTEREL_TYPE = 90;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE__TYPE = TYPE_IDENTIFIER__TYPE;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE__TYPE_ID = TYPE_IDENTIFIER__TYPE_ID;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE__OPERATOR = TYPE_IDENTIFIER__OPERATOR;

  /**
   * The feature id for the '<em><b>Est Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE__EST_TYPE = TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_TYPE_FEATURE_COUNT = TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalImpl <em>Local Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignal()
   * @generated
   */
  int LOCAL_SIGNAL = 91;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL__SIGNAL = LOCAL_SIGNAL_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_FEATURE_COUNT = LOCAL_SIGNAL_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 92;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATIONS = RELATION_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = RELATION_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 93;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TYPE = KExpressionsPackage.VALUED_OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Host Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__HOST_TYPE = KExpressionsPackage.VALUED_OBJECT__HOST_TYPE;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ParallelImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 94;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__LIST = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SequenceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 95;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__LIST = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortImpl <em>Weak Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbort()
   * @generated
   */
  int WEAK_ABORT = 96;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT__STATEMENT = ABORT__STATEMENT;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT__BODY = ABORT__BODY;

  /**
   * The number of structural features of the '<em>Weak Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_FEATURE_COUNT = ABORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortInstanceImpl <em>Weak Abort Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortInstanceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortInstance()
   * @generated
   */
  int WEAK_ABORT_INSTANCE = 97;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__STATEMENT = ABORT_INSTANCE__STATEMENT;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__DELAY = ABORT_INSTANCE__DELAY;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__OPT_END = ABORT_INSTANCE__OPT_END;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__END = ABORT_INSTANCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Weak Abort Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE_FEATURE_COUNT = ABORT_INSTANCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortCaseImpl <em>Weak Abort Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortCase()
   * @generated
   */
  int WEAK_ABORT_CASE = 98;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE__CASES = ABORT_CASE__CASES;

  /**
   * The feature id for the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE__OPT_END = ABORT_CASE__OPT_END;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE__END = ABORT_CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Weak Abort Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE_FEATURE_COUNT = ABORT_CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapDeclImpl <em>Trap Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapDecl()
   * @generated
   */
  int TRAP_DECL = 99;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__ANNOTATIONS = KExpressionsPackage.ISIGNAL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__NAME = KExpressionsPackage.ISIGNAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__TYPE = KExpressionsPackage.ISIGNAL__TYPE;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__INITIAL_VALUE = KExpressionsPackage.ISIGNAL__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Host Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__HOST_TYPE = KExpressionsPackage.ISIGNAL__HOST_TYPE;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__IS_INPUT = KExpressionsPackage.ISIGNAL__IS_INPUT;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__IS_OUTPUT = KExpressionsPackage.ISIGNAL__IS_OUTPUT;

  /**
   * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__COMBINE_OPERATOR = KExpressionsPackage.ISIGNAL__COMBINE_OPERATOR;

  /**
   * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__HOST_COMBINE_OPERATOR = KExpressionsPackage.ISIGNAL__HOST_COMBINE_OPERATOR;

  /**
   * The feature id for the '<em><b>Channel Descr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__CHANNEL_DESCR = KExpressionsPackage.ISIGNAL__CHANNEL_DESCR;

  /**
   * The number of structural features of the '<em>Trap Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_FEATURE_COUNT = KExpressionsPackage.ISIGNAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl <em>Trap Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapExpression()
   * @generated
   */
  int TRAP_EXPRESSION = 100;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_EXPRESSION__TRAP = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trap Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__FUNCTION = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__KEXPRESSIONS = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantExpression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 102;

  /**
   * The feature id for the '<em><b>Constant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__CONSTANT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__VALUE = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl <em>Trap Reference Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapReferenceExpr()
   * @generated
   */
  int TRAP_REFERENCE_EXPR = 103;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_REFERENCE_EXPR__SUB_EXPRESSIONS = KExpressionsPackage.VALUED_OBJECT_REFERENCE__SUB_EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_REFERENCE_EXPR__VALUED_OBJECT = KExpressionsPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

  /**
   * The number of structural features of the '<em>Trap Reference Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_REFERENCE_EXPR_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Program#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Program#getModules()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Modules();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Module#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getInterface()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Interface();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Module#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getBody()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Body();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Module#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getEnd()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ModuleBody <em>Module Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleBody
   * @generated
   */
  EClass getModuleBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleBody#getStatements()
   * @see #getModuleBody()
   * @generated
   */
  EReference getModuleBody_Statements();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface <em>Module Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Interface</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface
   * @generated
   */
  EClass getModuleInterface();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntSignalDecls <em>Int Signal Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Signal Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntSignalDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntSignalDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntTypeDecls <em>Int Type Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Type Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntTypeDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntTypeDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntSensorDecls <em>Int Sensor Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Sensor Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntSensorDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntSensorDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntConstantDecls <em>Int Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Constant Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntConstantDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntConstantDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntRelationDecls <em>Int Relation Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Relation Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntRelationDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntRelationDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntTaskDecls <em>Int Task Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Task Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntTaskDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntTaskDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntFunctionDecls <em>Int Function Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Function Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntFunctionDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntFunctionDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntProcedureDecls <em>Int Procedure Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Procedure Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleInterface#getIntProcedureDecls()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntProcedureDecls();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ChannelDescription <em>Channel Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel Description</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ChannelDescription
   * @generated
   */
  EClass getChannelDescription();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TypeIdentifier <em>Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Identifier</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeIdentifier
   * @generated
   */
  EClass getTypeIdentifier();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalDecl <em>Local Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
   * @generated
   */
  EClass getLocalSignalDecl();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getSignalList()
   * @see #getLocalSignalDecl()
   * @generated
   */
  EReference getLocalSignalDecl_SignalList();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getOptEnd()
   * @see #getLocalSignalDecl()
   * @generated
   */
  EAttribute getLocalSignalDecl_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalList <em>Local Signal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalList
   * @generated
   */
  EClass getLocalSignalList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.SensorDecl <em>Sensor Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorDecl
   * @generated
   */
  EClass getSensorDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.SensorDecl#getSensors <em>Sensors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensors</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorDecl#getSensors()
   * @see #getSensorDecl()
   * @generated
   */
  EReference getSensorDecl_Sensors();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.SensorWithType <em>Sensor With Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor With Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorWithType
   * @generated
   */
  EClass getSensorWithType();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.SensorWithType#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sensor</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorWithType#getSensor()
   * @see #getSensorWithType()
   * @generated
   */
  EReference getSensorWithType_Sensor();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.SensorWithType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorWithType#getType()
   * @see #getSensorWithType()
   * @generated
   */
  EReference getSensorWithType_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.RelationDecl <em>Relation Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationDecl
   * @generated
   */
  EClass getRelationDecl();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.RelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationType
   * @generated
   */
  EClass getRelationType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.RelationType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationType#getType()
   * @see #getRelationType()
   * @generated
   */
  EAttribute getRelationType_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.RelationImplication <em>Relation Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Implication</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationImplication
   * @generated
   */
  EClass getRelationImplication();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationImplication#getFirst()
   * @see #getRelationImplication()
   * @generated
   */
  EReference getRelationImplication_First();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.RelationImplication#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationImplication#getSecond()
   * @see #getRelationImplication()
   * @generated
   */
  EReference getRelationImplication_Second();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.RelationIncompatibility <em>Relation Incompatibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Incompatibility</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationIncompatibility
   * @generated
   */
  EClass getRelationIncompatibility();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.esterel.RelationIncompatibility#getIncomp <em>Incomp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incomp</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RelationIncompatibility#getIncomp()
   * @see #getRelationIncompatibility()
   * @generated
   */
  EReference getRelationIncompatibility_Incomp();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeDecl
   * @generated
   */
  EClass getTypeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.TypeDecl#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeDecl#getTypes()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Types();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ConstantDecls <em>Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantDecls
   * @generated
   */
  EClass getConstantDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ConstantDecls#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantDecls#getConstants()
   * @see #getConstantDecls()
   * @generated
   */
  EReference getConstantDecls_Constants();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls <em>One Type Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Type Constant Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls
   * @generated
   */
  EClass getOneTypeConstantDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getConstants()
   * @see #getOneTypeConstantDecls()
   * @generated
   */
  EReference getOneTypeConstantDecls_Constants();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getType()
   * @see #getOneTypeConstantDecls()
   * @generated
   */
  EReference getOneTypeConstantDecls_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ConstantWithValue <em>Constant With Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant With Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantWithValue
   * @generated
   */
  EClass getConstantWithValue();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.ConstantWithValue#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantWithValue#getConstant()
   * @see #getConstantWithValue()
   * @generated
   */
  EReference getConstantWithValue_Constant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ConstantWithValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantWithValue#getValue()
   * @see #getConstantWithValue()
   * @generated
   */
  EAttribute getConstantWithValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionDecl
   * @generated
   */
  EClass getFunctionDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.FunctionDecl#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionDecl#getFunctions()
   * @see #getFunctionDecl()
   * @generated
   */
  EReference getFunctionDecl_Functions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Function#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Function#getIdList()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_IdList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ProcedureDecl <em>Procedure Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureDecl
   * @generated
   */
  EClass getProcedureDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ProcedureDecl#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureDecl#getProcedures()
   * @see #getProcedureDecl()
   * @generated
   */
  EReference getProcedureDecl_Procedures();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getIdList1 <em>Id List1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id List1</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure#getIdList1()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_IdList1();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getIdList2 <em>Id List2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id List2</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure#getIdList2()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_IdList2();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TaskDecl <em>Task Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskDecl
   * @generated
   */
  EClass getTaskDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.TaskDecl#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskDecl#getTasks()
   * @see #getTaskDecl()
   * @generated
   */
  EReference getTaskDecl_Tasks();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Task#getIdList1 <em>Id List1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id List1</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task#getIdList1()
   * @see #getTask()
   * @generated
   */
  EReference getTask_IdList1();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Task#getIdList2 <em>Id List2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id List2</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task#getIdList2()
   * @see #getTask()
   * @generated
   */
  EReference getTask_IdList2();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.StatementContainer <em>Statement Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Container</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.StatementContainer
   * @generated
   */
  EClass getStatementContainer();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.StatementContainer#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.StatementContainer#getStatement()
   * @see #getStatementContainer()
   * @generated
   */
  EReference getStatementContainer_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Assignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Assignment#getVar()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Var();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Assignment#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Assignment#getExpr()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort
   * @generated
   */
  EClass getAbort();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Abort#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort#getBody()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_Body();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AbortBody <em>Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortBody
   * @generated
   */
  EClass getAbortBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AbortInstance <em>Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Instance</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortInstance
   * @generated
   */
  EClass getAbortInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.AbortInstance#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortInstance#getDelay()
   * @see #getAbortInstance()
   * @generated
   */
  EReference getAbortInstance_Delay();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.AbortInstance#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortInstance#getOptEnd()
   * @see #getAbortInstance()
   * @generated
   */
  EAttribute getAbortInstance_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AbortCase <em>Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortCase
   * @generated
   */
  EClass getAbortCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.AbortCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortCase#getCases()
   * @see #getAbortCase()
   * @generated
   */
  EReference getAbortCase_Cases();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.AbortCase#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortCase#getOptEnd()
   * @see #getAbortCase()
   * @generated
   */
  EAttribute getAbortCase_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AbortCaseSingle <em>Abort Case Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Case Single</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortCaseSingle
   * @generated
   */
  EClass getAbortCaseSingle();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.AbortCaseSingle#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AbortCaseSingle#getDelay()
   * @see #getAbortCaseSingle()
   * @generated
   */
  EReference getAbortCaseSingle_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortBody <em>Weak Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortBody
   * @generated
   */
  EClass getWeakAbortBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortEnd <em>Weak Abort End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortEnd
   * @generated
   */
  EClass getWeakAbortEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortEnd#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortEnd#getOptEnd()
   * @see #getWeakAbortEnd()
   * @generated
   */
  EReference getWeakAbortEnd_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt <em>Weak Abort End Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort End Alt</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt
   * @generated
   */
  EClass getWeakAbortEndAlt();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt#getEnd()
   * @see #getWeakAbortEndAlt()
   * @generated
   */
  EAttribute getWeakAbortEndAlt_End();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt#getEndA <em>End A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End A</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt#getEndA()
   * @see #getWeakAbortEndAlt()
   * @generated
   */
  EAttribute getWeakAbortEndAlt_EndA();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Await <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Await
   * @generated
   */
  EClass getAwait();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Await#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Await#getBody()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Body();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AwaitBody <em>Await Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitBody
   * @generated
   */
  EClass getAwaitBody();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.AwaitBody#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitBody#getEnd()
   * @see #getAwaitBody()
   * @generated
   */
  EAttribute getAwaitBody_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AwaitInstance <em>Await Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Instance</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitInstance
   * @generated
   */
  EClass getAwaitInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.AwaitInstance#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitInstance#getDelay()
   * @see #getAwaitInstance()
   * @generated
   */
  EReference getAwaitInstance_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.AwaitCase <em>Await Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitCase
   * @generated
   */
  EClass getAwaitCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.AwaitCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.AwaitCase#getCases()
   * @see #getAwaitCase()
   * @generated
   */
  EReference getAwaitCase_Cases();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ProcCall <em>Proc Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proc Call</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcCall
   * @generated
   */
  EClass getProcCall();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ProcCall#getProc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Proc</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcCall#getProc()
   * @see #getProcCall()
   * @generated
   */
  EReference getProcCall_Proc();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.esterel.ProcCall#getVarList <em>Var List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Var List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcCall#getVarList()
   * @see #getProcCall()
   * @generated
   */
  EReference getProcCall_VarList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ProcCall#getKexpressions <em>Kexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kexpressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcCall#getKexpressions()
   * @see #getProcCall()
   * @generated
   */
  EReference getProcCall_Kexpressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Do <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do
   * @generated
   */
  EClass getDo();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Do#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do#getEnd()
   * @see #getDo()
   * @generated
   */
  EReference getDo_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.DoUpto <em>Do Upto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Upto</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoUpto
   * @generated
   */
  EClass getDoUpto();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DoUpto#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoUpto#getExpr()
   * @see #getDoUpto()
   * @generated
   */
  EReference getDoUpto_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.DoWatching <em>Do Watching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Watching</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoWatching
   * @generated
   */
  EClass getDoWatching();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DoWatching#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoWatching#getDelay()
   * @see #getDoWatching()
   * @generated
   */
  EReference getDoWatching_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DoWatching#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoWatching#getEnd()
   * @see #getDoWatching()
   * @generated
   */
  EReference getDoWatching_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.DoWatchingEnd <em>Do Watching End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Watching End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoWatchingEnd
   * @generated
   */
  EClass getDoWatchingEnd();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.DoWatchingEnd#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DoWatchingEnd#getOptEnd()
   * @see #getDoWatchingEnd()
   * @generated
   */
  EAttribute getDoWatchingEnd_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Emit <em>Emit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emit</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Emit
   * @generated
   */
  EClass getEmit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Emit#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Emit#getSignal()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Emit#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Emit#getTick()
   * @see #getEmit()
   * @generated
   */
  EAttribute getEmit_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Emit#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Emit#getExpr()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EveryDo <em>Every Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Every Do</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EveryDo
   * @generated
   */
  EClass getEveryDo();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.EveryDo#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EveryDo#getDelay()
   * @see #getEveryDo()
   * @generated
   */
  EReference getEveryDo_Delay();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.EveryDo#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EveryDo#getOptEnd()
   * @see #getEveryDo()
   * @generated
   */
  EAttribute getEveryDo_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Exit#getTrap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exit#getTrap()
   * @see #getExit()
   * @generated
   */
  EReference getExit_Trap();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Exit#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exit#getExpression()
   * @see #getExit()
   * @generated
   */
  EReference getExit_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Halt <em>Halt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Halt</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Halt
   * @generated
   */
  EClass getHalt();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.IfTest <em>If Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Test</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest
   * @generated
   */
  EClass getIfTest();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getExpr()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getThenPart()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ThenPart();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsif <em>Elsif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elsif</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getElsif()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Elsif();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getElsePart()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ElsePart();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getOptEnd()
   * @see #getIfTest()
   * @generated
   */
  EAttribute getIfTest_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ElsIf <em>Els If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Els If</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf
   * @generated
   */
  EClass getElsIf();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf#getExpr()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf#getThenPart()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_ThenPart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ThenPart
   * @generated
   */
  EClass getThenPart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsePart
   * @generated
   */
  EClass getElsePart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Loop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Loop#getBody()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Body();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd1 <em>End1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End1</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Loop#getEnd1()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_End1();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Loop#getEnd()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EndLoop <em>End Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Loop</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EndLoop
   * @generated
   */
  EClass getEndLoop();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.EndLoop#getEndOpt <em>End Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Opt</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EndLoop#getEndOpt()
   * @see #getEndLoop()
   * @generated
   */
  EAttribute getEndLoop_EndOpt();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LoopEach <em>Loop Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Each</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LoopEach
   * @generated
   */
  EClass getLoopEach();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LoopDelay <em>Loop Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LoopDelay
   * @generated
   */
  EClass getLoopDelay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.LoopDelay#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LoopDelay#getDelay()
   * @see #getLoopDelay()
   * @generated
   */
  EReference getLoopDelay_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LoopBody <em>Loop Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LoopBody
   * @generated
   */
  EClass getLoopBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Nothing <em>Nothing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nothing</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Nothing
   * @generated
   */
  EClass getNothing();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Present <em>Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present
   * @generated
   */
  EClass getPresent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Present#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getBody()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Body();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Present#getElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getElsePart()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ElsePart();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Present#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getOptEnd()
   * @see #getPresent()
   * @generated
   */
  EAttribute getPresent_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.PresentBody <em>Present Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentBody
   * @generated
   */
  EClass getPresentBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody <em>Present Event Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Event Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEventBody
   * @generated
   */
  EClass getPresentEventBody();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEventBody#getEvent()
   * @see #getPresentEventBody()
   * @generated
   */
  EReference getPresentEventBody_Event();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEventBody#getThenPart()
   * @see #getPresentEventBody()
   * @generated
   */
  EReference getPresentEventBody_ThenPart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.PresentCaseList <em>Present Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Case List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCaseList
   * @generated
   */
  EClass getPresentCaseList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.PresentCaseList#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCaseList#getCases()
   * @see #getPresentCaseList()
   * @generated
   */
  EReference getPresentCaseList_Cases();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.PresentCase <em>Present Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCase
   * @generated
   */
  EClass getPresentCase();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentCase#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCase#getEvent()
   * @see #getPresentCase()
   * @generated
   */
  EReference getPresentCase_Event();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.PresentEvent <em>Present Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Event</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEvent
   * @generated
   */
  EClass getPresentEvent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentEvent#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEvent#getExpression()
   * @see #getPresentEvent()
   * @generated
   */
  EReference getPresentEvent_Expression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.PresentEvent#getFB <em>FB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FB</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEvent#getFB()
   * @see #getPresentEvent()
   * @generated
   */
  EAttribute getPresentEvent_FB();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.PresentEvent#getEB <em>EB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EB</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEvent#getEB()
   * @see #getPresentEvent()
   * @generated
   */
  EAttribute getPresentEvent_EB();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.PresentEvent#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentEvent#getTick()
   * @see #getPresentEvent()
   * @generated
   */
  EAttribute getPresentEvent_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Repeat
   * @generated
   */
  EClass getRepeat();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Repeat#isPositive <em>Positive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Positive</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Repeat#isPositive()
   * @see #getRepeat()
   * @generated
   */
  EAttribute getRepeat_Positive();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Repeat#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Repeat#getExpression()
   * @see #getRepeat()
   * @generated
   */
  EReference getRepeat_Expression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Repeat#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Repeat#getOptEnd()
   * @see #getRepeat()
   * @generated
   */
  EAttribute getRepeat_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Run
   * @generated
   */
  EClass getRun();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Run#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Run#getModule()
   * @see #getRun()
   * @generated
   */
  EReference getRun_Module();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Run#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Run#getList()
   * @see #getRun()
   * @generated
   */
  EReference getRun_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ModuleRenaming <em>Module Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleRenaming
   * @generated
   */
  EClass getModuleRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ModuleRenaming#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleRenaming#getModule()
   * @see #getModuleRenaming()
   * @generated
   */
  EReference getModuleRenaming_Module();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ModuleRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ModuleRenaming#getNewName()
   * @see #getModuleRenaming()
   * @generated
   */
  EAttribute getModuleRenaming_NewName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.RenamingList <em>Renaming List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RenamingList
   * @generated
   */
  EClass getRenamingList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.RenamingList#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.RenamingList#getList()
   * @see #getRenamingList()
   * @generated
   */
  EReference getRenamingList_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Renaming#getRenamings <em>Renamings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Renamings</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Renaming#getRenamings()
   * @see #getRenaming()
   * @generated
   */
  EReference getRenaming_Renamings();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TypeRenaming <em>Type Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeRenaming
   * @generated
   */
  EClass getTypeRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.TypeRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeRenaming#getNewName()
   * @see #getTypeRenaming()
   * @generated
   */
  EReference getTypeRenaming_NewName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TypeRenaming#getNewType <em>New Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeRenaming#getNewType()
   * @see #getTypeRenaming()
   * @generated
   */
  EAttribute getTypeRenaming_NewType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.TypeRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeRenaming#getOldName()
   * @see #getTypeRenaming()
   * @generated
   */
  EReference getTypeRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming <em>Constant Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantRenaming
   * @generated
   */
  EClass getConstantRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName()
   * @see #getConstantRenaming()
   * @generated
   */
  EReference getConstantRenaming_NewName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewValue()
   * @see #getConstantRenaming()
   * @generated
   */
  EAttribute getConstantRenaming_NewValue();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getOldName()
   * @see #getConstantRenaming()
   * @generated
   */
  EReference getConstantRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.FunctionRenaming <em>Function Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionRenaming
   * @generated
   */
  EClass getFunctionRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getNewName()
   * @see #getFunctionRenaming()
   * @generated
   */
  EReference getFunctionRenaming_NewName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getNewFunc <em>New Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Func</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getNewFunc()
   * @see #getFunctionRenaming()
   * @generated
   */
  EAttribute getFunctionRenaming_NewFunc();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionRenaming#getOldName()
   * @see #getFunctionRenaming()
   * @generated
   */
  EReference getFunctionRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ProcedureRenaming <em>Procedure Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureRenaming
   * @generated
   */
  EClass getProcedureRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ProcedureRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureRenaming#getNewName()
   * @see #getProcedureRenaming()
   * @generated
   */
  EReference getProcedureRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ProcedureRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureRenaming#getOldName()
   * @see #getProcedureRenaming()
   * @generated
   */
  EReference getProcedureRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TaskRenaming <em>Task Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskRenaming
   * @generated
   */
  EClass getTaskRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.TaskRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskRenaming#getNewName()
   * @see #getTaskRenaming()
   * @generated
   */
  EReference getTaskRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.TaskRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskRenaming#getOldName()
   * @see #getTaskRenaming()
   * @generated
   */
  EReference getTaskRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming <em>Signal Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SignalRenaming
   * @generated
   */
  EClass getSignalRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SignalRenaming#getNewName()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SignalRenaming#getOldName()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Suspend <em>Suspend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Suspend
   * @generated
   */
  EClass getSuspend();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Suspend#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Suspend#getDelay()
   * @see #getSuspend()
   * @generated
   */
  EReference getSuspend_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Sustain <em>Sustain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sustain</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sustain
   * @generated
   */
  EClass getSustain();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sustain#getSignal()
   * @see #getSustain()
   * @generated
   */
  EReference getSustain_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sustain#getTick()
   * @see #getSustain()
   * @generated
   */
  EAttribute getSustain_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sustain#getExpression()
   * @see #getSustain()
   * @generated
   */
  EReference getSustain_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Trap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap
   * @generated
   */
  EClass getTrap();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trap Decl List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap#getTrapDeclList()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_TrapDeclList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapHandler <em>Trap Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trap Handler</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap#getTrapHandler()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_TrapHandler();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Trap#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap#getOptEnd()
   * @see #getTrap()
   * @generated
   */
  EAttribute getTrap_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapDeclList <em>Trap Decl List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Decl List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapDeclList
   * @generated
   */
  EClass getTrapDeclList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.TrapDeclList#getTrapDecls <em>Trap Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trap Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapDeclList#getTrapDecls()
   * @see #getTrapDeclList()
   * @generated
   */
  EReference getTrapDeclList_TrapDecls();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapHandler <em>Trap Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Handler</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapHandler
   * @generated
   */
  EClass getTrapHandler();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trap Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapHandler#getTrapExpr()
   * @see #getTrapHandler()
   * @generated
   */
  EReference getTrapHandler_TrapExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.LocalVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalVariable#getVar()
   * @see #getLocalVariable()
   * @generated
   */
  EReference getLocalVariable_Var();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.LocalVariable#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalVariable#getOptEnd()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr <em>Delay Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr
   * @generated
   */
  EClass getDelayExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr#getExpr()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr#getEvent()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Event();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr#isIsImmediate()
   * @see #getDelayExpr()
   * @generated
   */
  EAttribute getDelayExpr_IsImmediate();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent <em>Delay Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Event</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayEvent
   * @generated
   */
  EClass getDelayEvent();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick()
   * @see #getDelayEvent()
   * @generated
   */
  EAttribute getDelayEvent_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayEvent#getExpr()
   * @see #getDelayEvent()
   * @generated
   */
  EReference getDelayEvent_Expr();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getFB <em>FB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FB</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayEvent#getFB()
   * @see #getDelayEvent()
   * @generated
   */
  EAttribute getDelayEvent_FB();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getEB <em>EB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EB</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayEvent#getEB()
   * @see #getDelayEvent()
   * @generated
   */
  EAttribute getDelayEvent_EB();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Exec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec
   * @generated
   */
  EClass getExec();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Exec#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getTask()
   * @see #getExec()
   * @generated
   */
  EReference getExec_Task();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Exec#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getBody()
   * @see #getExec()
   * @generated
   */
  EReference getExec_Body();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.Exec#getRetSignal <em>Ret Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ret Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getRetSignal()
   * @see #getExec()
   * @generated
   */
  EReference getExec_RetSignal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Exec#getExecCaseList <em>Exec Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exec Case List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getExecCaseList()
   * @see #getExec()
   * @generated
   */
  EReference getExec_ExecCaseList();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Exec#getOptEnd <em>Opt End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getOptEnd()
   * @see #getExec()
   * @generated
   */
  EAttribute getExec_OptEnd();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ExecBody <em>Exec Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecBody
   * @generated
   */
  EClass getExecBody();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.esterel.ExecBody#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecBody#getVars()
   * @see #getExecBody()
   * @generated
   */
  EReference getExecBody_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ExecBody#getKexpressions <em>Kexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kexpressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecBody#getKexpressions()
   * @see #getExecBody()
   * @generated
   */
  EReference getExecBody_Kexpressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ExecCase <em>Exec Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase
   * @generated
   */
  EClass getExecCase();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase#getTask()
   * @see #getExecCase()
   * @generated
   */
  EReference getExecCase_Task();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase#getBody()
   * @see #getExecCase()
   * @generated
   */
  EReference getExecCase_Body();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getRetSignal <em>Ret Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ret Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase#getRetSignal()
   * @see #getExecCase()
   * @generated
   */
  EReference getExecCase_RetSignal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier <em>Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Identifier</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier
   * @generated
   */
  EClass getEsterelTypeIdentifier();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Func</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier#getFunc()
   * @see #getEsterelTypeIdentifier()
   * @generated
   */
  EReference getEsterelTypeIdentifier_Func();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EsterelType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelType
   * @generated
   */
  EClass getEsterelType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.EsterelType#getEstType <em>Est Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Est Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelType#getEstType()
   * @see #getEsterelType()
   * @generated
   */
  EReference getEsterelType_EstType();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LocalSignal <em>Local Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignal
   * @generated
   */
  EClass getLocalSignal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.LocalSignal#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignal#getSignal()
   * @see #getLocalSignal()
   * @generated
   */
  EReference getLocalSignal_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Relation#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Relation#getRelations()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Relations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Parallel#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Parallel#getList()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Sequence#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sequence#getList()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbort <em>Weak Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbort
   * @generated
   */
  EClass getWeakAbort();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortInstance <em>Weak Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Instance</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortInstance
   * @generated
   */
  EClass getWeakAbortInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortInstance#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortInstance#getEnd()
   * @see #getWeakAbortInstance()
   * @generated
   */
  EReference getWeakAbortInstance_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortCase <em>Weak Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortCase
   * @generated
   */
  EClass getWeakAbortCase();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.WeakAbortCase#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.WeakAbortCase#getEnd()
   * @see #getWeakAbortCase()
   * @generated
   */
  EReference getWeakAbortCase_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapDecl <em>Trap Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapDecl
   * @generated
   */
  EClass getTrapDecl();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapExpression <em>Trap Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapExpression
   * @generated
   */
  EClass getTrapExpression();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.TrapExpression#getTrap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapExpression#getTrap()
   * @see #getTrapExpression()
   * @generated
   */
  EReference getTrapExpression_Trap();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionExpression
   * @generated
   */
  EClass getFunctionExpression();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.FunctionExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionExpression#getFunction()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.FunctionExpression#getKexpressions <em>Kexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kexpressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionExpression#getKexpressions()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Kexpressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantExpression
   * @generated
   */
  EClass getConstantExpression();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantExpression#getConstant()
   * @see #getConstantExpression()
   * @generated
   */
  EReference getConstantExpression_Constant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantExpression#getValue()
   * @see #getConstantExpression()
   * @generated
   */
  EAttribute getConstantExpression_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr <em>Trap Reference Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Reference Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr
   * @generated
   */
  EClass getTrapReferenceExpr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EsterelFactory getEsterelFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MODULES = eINSTANCE.getProgram_Modules();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INTERFACE = eINSTANCE.getModule_Interface();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__BODY = eINSTANCE.getModule_Body();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__END = eINSTANCE.getModule_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleBodyImpl <em>Module Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleBody()
     * @generated
     */
    EClass MODULE_BODY = eINSTANCE.getModuleBody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_BODY__STATEMENTS = eINSTANCE.getModuleBody_Statements();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleInterfaceImpl <em>Module Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleInterfaceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleInterface()
     * @generated
     */
    EClass MODULE_INTERFACE = eINSTANCE.getModuleInterface();

    /**
     * The meta object literal for the '<em><b>Int Signal Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_SIGNAL_DECLS = eINSTANCE.getModuleInterface_IntSignalDecls();

    /**
     * The meta object literal for the '<em><b>Int Type Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_TYPE_DECLS = eINSTANCE.getModuleInterface_IntTypeDecls();

    /**
     * The meta object literal for the '<em><b>Int Sensor Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_SENSOR_DECLS = eINSTANCE.getModuleInterface_IntSensorDecls();

    /**
     * The meta object literal for the '<em><b>Int Constant Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_CONSTANT_DECLS = eINSTANCE.getModuleInterface_IntConstantDecls();

    /**
     * The meta object literal for the '<em><b>Int Relation Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_RELATION_DECLS = eINSTANCE.getModuleInterface_IntRelationDecls();

    /**
     * The meta object literal for the '<em><b>Int Task Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_TASK_DECLS = eINSTANCE.getModuleInterface_IntTaskDecls();

    /**
     * The meta object literal for the '<em><b>Int Function Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_FUNCTION_DECLS = eINSTANCE.getModuleInterface_IntFunctionDecls();

    /**
     * The meta object literal for the '<em><b>Int Procedure Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_PROCEDURE_DECLS = eINSTANCE.getModuleInterface_IntProcedureDecls();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getChannelDescription()
     * @generated
     */
    EClass CHANNEL_DESCRIPTION = eINSTANCE.getChannelDescription();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeIdentifier()
     * @generated
     */
    EClass TYPE_IDENTIFIER = eINSTANCE.getTypeIdentifier();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl <em>Local Signal Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignalDecl()
     * @generated
     */
    EClass LOCAL_SIGNAL_DECL = eINSTANCE.getLocalSignalDecl();

    /**
     * The meta object literal for the '<em><b>Signal List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SIGNAL_DECL__SIGNAL_LIST = eINSTANCE.getLocalSignalDecl_SignalList();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_SIGNAL_DECL__OPT_END = eINSTANCE.getLocalSignalDecl_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalListImpl <em>Local Signal List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalListImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignalList()
     * @generated
     */
    EClass LOCAL_SIGNAL_LIST = eINSTANCE.getLocalSignalList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl <em>Sensor Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorDecl()
     * @generated
     */
    EClass SENSOR_DECL = eINSTANCE.getSensorDecl();

    /**
     * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_DECL__SENSORS = eINSTANCE.getSensorDecl_Sensors();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl <em>Sensor With Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorWithType()
     * @generated
     */
    EClass SENSOR_WITH_TYPE = eINSTANCE.getSensorWithType();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_WITH_TYPE__SENSOR = eINSTANCE.getSensorWithType_Sensor();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_WITH_TYPE__TYPE = eINSTANCE.getSensorWithType_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationDeclImpl <em>Relation Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RelationDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationDecl()
     * @generated
     */
    EClass RELATION_DECL = eINSTANCE.getRelationDecl();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationTypeImpl <em>Relation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RelationTypeImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationType()
     * @generated
     */
    EClass RELATION_TYPE = eINSTANCE.getRelationType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_TYPE__TYPE = eINSTANCE.getRelationType_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RelationImplicationImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationImplication()
     * @generated
     */
    EClass RELATION_IMPLICATION = eINSTANCE.getRelationImplication();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_IMPLICATION__FIRST = eINSTANCE.getRelationImplication_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_IMPLICATION__SECOND = eINSTANCE.getRelationImplication_Second();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RelationIncompatibilityImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
     * @generated
     */
    EClass RELATION_INCOMPATIBILITY = eINSTANCE.getRelationIncompatibility();

    /**
     * The meta object literal for the '<em><b>Incomp</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_INCOMPATIBILITY__INCOMP = eINSTANCE.getRelationIncompatibility_Incomp();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeDecl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getTypeDecl();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__TYPES = eINSTANCE.getTypeDecl_Types();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TypeImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantDeclsImpl <em>Constant Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantDeclsImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantDecls()
     * @generated
     */
    EClass CONSTANT_DECLS = eINSTANCE.getConstantDecls();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLS__CONSTANTS = eINSTANCE.getConstantDecls_Constants();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl <em>One Type Constant Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOneTypeConstantDecls()
     * @generated
     */
    EClass ONE_TYPE_CONSTANT_DECLS = eINSTANCE.getOneTypeConstantDecls();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TYPE_CONSTANT_DECLS__CONSTANTS = eINSTANCE.getOneTypeConstantDecls_Constants();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TYPE_CONSTANT_DECLS__TYPE = eINSTANCE.getOneTypeConstantDecls_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantWithValueImpl <em>Constant With Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantWithValueImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantWithValue()
     * @generated
     */
    EClass CONSTANT_WITH_VALUE = eINSTANCE.getConstantWithValue();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_WITH_VALUE__CONSTANT = eINSTANCE.getConstantWithValue_Constant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_WITH_VALUE__VALUE = eINSTANCE.getConstantWithValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionDecl()
     * @generated
     */
    EClass FUNCTION_DECL = eINSTANCE.getFunctionDecl();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__FUNCTIONS = eINSTANCE.getFunctionDecl_Functions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Id List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ID_LIST = eINSTANCE.getFunction_IdList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureDeclImpl <em>Procedure Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedureDecl()
     * @generated
     */
    EClass PROCEDURE_DECL = eINSTANCE.getProcedureDecl();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECL__PROCEDURES = eINSTANCE.getProcedureDecl_Procedures();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Id List1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__ID_LIST1 = eINSTANCE.getProcedure_IdList1();

    /**
     * The meta object literal for the '<em><b>Id List2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__ID_LIST2 = eINSTANCE.getProcedure_IdList2();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskDeclImpl <em>Task Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TaskDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTaskDecl()
     * @generated
     */
    EClass TASK_DECL = eINSTANCE.getTaskDecl();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECL__TASKS = eINSTANCE.getTaskDecl_Tasks();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TaskImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Id List1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ID_LIST1 = eINSTANCE.getTask_IdList1();

    /**
     * The meta object literal for the '<em><b>Id List2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ID_LIST2 = eINSTANCE.getTask_IdList2();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.StatementContainerImpl <em>Statement Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.StatementContainerImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getStatementContainer()
     * @generated
     */
    EClass STATEMENT_CONTAINER = eINSTANCE.getStatementContainer();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CONTAINER__STATEMENT = eINSTANCE.getStatementContainer_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.StatementImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.BlockImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AssignmentImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VAR = eINSTANCE.getAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXPR = eINSTANCE.getAssignment_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbort()
     * @generated
     */
    EClass ABORT = eINSTANCE.getAbort();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__BODY = eINSTANCE.getAbort_Body();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortBodyImpl <em>Abort Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortBody()
     * @generated
     */
    EClass ABORT_BODY = eINSTANCE.getAbortBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortInstanceImpl <em>Abort Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortInstanceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortInstance()
     * @generated
     */
    EClass ABORT_INSTANCE = eINSTANCE.getAbortInstance();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT_INSTANCE__DELAY = eINSTANCE.getAbortInstance_Delay();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABORT_INSTANCE__OPT_END = eINSTANCE.getAbortInstance_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortCaseImpl <em>Abort Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortCaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortCase()
     * @generated
     */
    EClass ABORT_CASE = eINSTANCE.getAbortCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT_CASE__CASES = eINSTANCE.getAbortCase_Cases();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABORT_CASE__OPT_END = eINSTANCE.getAbortCase_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortCaseSingleImpl <em>Abort Case Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortCaseSingleImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbortCaseSingle()
     * @generated
     */
    EClass ABORT_CASE_SINGLE = eINSTANCE.getAbortCaseSingle();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT_CASE_SINGLE__DELAY = eINSTANCE.getAbortCaseSingle_Delay();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortBodyImpl <em>Weak Abort Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortBody()
     * @generated
     */
    EClass WEAK_ABORT_BODY = eINSTANCE.getWeakAbortBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndImpl <em>Weak Abort End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortEnd()
     * @generated
     */
    EClass WEAK_ABORT_END = eINSTANCE.getWeakAbortEnd();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_END__OPT_END = eINSTANCE.getWeakAbortEnd_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndAltImpl <em>Weak Abort End Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndAltImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortEndAlt()
     * @generated
     */
    EClass WEAK_ABORT_END_ALT = eINSTANCE.getWeakAbortEndAlt();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEAK_ABORT_END_ALT__END = eINSTANCE.getWeakAbortEndAlt_End();

    /**
     * The meta object literal for the '<em><b>End A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEAK_ABORT_END_ALT__END_A = eINSTANCE.getWeakAbortEndAlt_EndA();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl <em>Await</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwait()
     * @generated
     */
    EClass AWAIT = eINSTANCE.getAwait();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT__BODY = eINSTANCE.getAwait_Body();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitBodyImpl <em>Await Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitBody()
     * @generated
     */
    EClass AWAIT_BODY = eINSTANCE.getAwaitBody();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWAIT_BODY__END = eINSTANCE.getAwaitBody_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitInstanceImpl <em>Await Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitInstanceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitInstance()
     * @generated
     */
    EClass AWAIT_INSTANCE = eINSTANCE.getAwaitInstance();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT_INSTANCE__DELAY = eINSTANCE.getAwaitInstance_Delay();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitCaseImpl <em>Await Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitCaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwaitCase()
     * @generated
     */
    EClass AWAIT_CASE = eINSTANCE.getAwaitCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT_CASE__CASES = eINSTANCE.getAwaitCase_Cases();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl <em>Proc Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcCall()
     * @generated
     */
    EClass PROC_CALL = eINSTANCE.getProcCall();

    /**
     * The meta object literal for the '<em><b>Proc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROC_CALL__PROC = eINSTANCE.getProcCall_Proc();

    /**
     * The meta object literal for the '<em><b>Var List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROC_CALL__VAR_LIST = eINSTANCE.getProcCall_VarList();

    /**
     * The meta object literal for the '<em><b>Kexpressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROC_CALL__KEXPRESSIONS = eINSTANCE.getProcCall_Kexpressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl <em>Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DoImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDo()
     * @generated
     */
    EClass DO = eINSTANCE.getDo();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__END = eINSTANCE.getDo_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoUptoImpl <em>Do Upto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DoUptoImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoUpto()
     * @generated
     */
    EClass DO_UPTO = eINSTANCE.getDoUpto();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_UPTO__EXPR = eINSTANCE.getDoUpto_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoWatchingImpl <em>Do Watching</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DoWatchingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoWatching()
     * @generated
     */
    EClass DO_WATCHING = eINSTANCE.getDoWatching();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WATCHING__DELAY = eINSTANCE.getDoWatching_Delay();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WATCHING__END = eINSTANCE.getDoWatching_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoWatchingEndImpl <em>Do Watching End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DoWatchingEndImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDoWatchingEnd()
     * @generated
     */
    EClass DO_WATCHING_END = eINSTANCE.getDoWatchingEnd();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_WATCHING_END__OPT_END = eINSTANCE.getDoWatchingEnd_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EmitImpl <em>Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EmitImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEmit()
     * @generated
     */
    EClass EMIT = eINSTANCE.getEmit();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__SIGNAL = eINSTANCE.getEmit_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMIT__TICK = eINSTANCE.getEmit_Tick();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__EXPR = eINSTANCE.getEmit_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEveryDo()
     * @generated
     */
    EClass EVERY_DO = eINSTANCE.getEveryDo();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVERY_DO__DELAY = eINSTANCE.getEveryDo_Delay();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVERY_DO__OPT_END = eINSTANCE.getEveryDo_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ExitImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '<em><b>Trap</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT__TRAP = eINSTANCE.getExit_Trap();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT__EXPRESSION = eINSTANCE.getExit_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.HaltImpl <em>Halt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.HaltImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getHalt()
     * @generated
     */
    EClass HALT = eINSTANCE.getHalt();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl <em>If Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIfTest()
     * @generated
     */
    EClass IF_TEST = eINSTANCE.getIfTest();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__EXPR = eINSTANCE.getIfTest_Expr();

    /**
     * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__THEN_PART = eINSTANCE.getIfTest_ThenPart();

    /**
     * The meta object literal for the '<em><b>Elsif</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSIF = eINSTANCE.getIfTest_Elsif();

    /**
     * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSE_PART = eINSTANCE.getIfTest_ElsePart();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_TEST__OPT_END = eINSTANCE.getIfTest_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getElsIf()
     * @generated
     */
    EClass ELS_IF = eINSTANCE.getElsIf();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__EXPR = eINSTANCE.getElsIf_Expr();

    /**
     * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__THEN_PART = eINSTANCE.getElsIf_ThenPart();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ThenPartImpl <em>Then Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ThenPartImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getThenPart()
     * @generated
     */
    EClass THEN_PART = eINSTANCE.getThenPart();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ElsePartImpl <em>Else Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ElsePartImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getElsePart()
     * @generated
     */
    EClass ELSE_PART = eINSTANCE.getElsePart();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LoopImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__BODY = eINSTANCE.getLoop_Body();

    /**
     * The meta object literal for the '<em><b>End1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__END1 = eINSTANCE.getLoop_End1();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__END = eINSTANCE.getLoop_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EndLoopImpl <em>End Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EndLoopImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEndLoop()
     * @generated
     */
    EClass END_LOOP = eINSTANCE.getEndLoop();

    /**
     * The meta object literal for the '<em><b>End Opt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_LOOP__END_OPT = eINSTANCE.getEndLoop_EndOpt();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopEachImpl <em>Loop Each</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LoopEachImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopEach()
     * @generated
     */
    EClass LOOP_EACH = eINSTANCE.getLoopEach();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopDelayImpl <em>Loop Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LoopDelayImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopDelay()
     * @generated
     */
    EClass LOOP_DELAY = eINSTANCE.getLoopDelay();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_DELAY__DELAY = eINSTANCE.getLoopDelay_Delay();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopBodyImpl <em>Loop Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LoopBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoopBody()
     * @generated
     */
    EClass LOOP_BODY = eINSTANCE.getLoopBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.NothingImpl <em>Nothing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.NothingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getNothing()
     * @generated
     */
    EClass NOTHING = eINSTANCE.getNothing();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PauseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl <em>Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresent()
     * @generated
     */
    EClass PRESENT = eINSTANCE.getPresent();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__BODY = eINSTANCE.getPresent_Body();

    /**
     * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__ELSE_PART = eINSTANCE.getPresent_ElsePart();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENT__OPT_END = eINSTANCE.getPresent_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentBodyImpl <em>Present Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentBody()
     * @generated
     */
    EClass PRESENT_BODY = eINSTANCE.getPresentBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentEventBodyImpl <em>Present Event Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentEventBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentEventBody()
     * @generated
     */
    EClass PRESENT_EVENT_BODY = eINSTANCE.getPresentEventBody();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_EVENT_BODY__EVENT = eINSTANCE.getPresentEventBody_Event();

    /**
     * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_EVENT_BODY__THEN_PART = eINSTANCE.getPresentEventBody_ThenPart();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentCaseListImpl <em>Present Case List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentCaseListImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentCaseList()
     * @generated
     */
    EClass PRESENT_CASE_LIST = eINSTANCE.getPresentCaseList();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE_LIST__CASES = eINSTANCE.getPresentCaseList_Cases();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentCase()
     * @generated
     */
    EClass PRESENT_CASE = eINSTANCE.getPresentCase();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE__EVENT = eINSTANCE.getPresentCase_Event();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentEventImpl <em>Present Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentEventImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentEvent()
     * @generated
     */
    EClass PRESENT_EVENT = eINSTANCE.getPresentEvent();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_EVENT__EXPRESSION = eINSTANCE.getPresentEvent_Expression();

    /**
     * The meta object literal for the '<em><b>FB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENT_EVENT__FB = eINSTANCE.getPresentEvent_FB();

    /**
     * The meta object literal for the '<em><b>EB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENT_EVENT__EB = eINSTANCE.getPresentEvent_EB();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENT_EVENT__TICK = eINSTANCE.getPresentEvent_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRepeat()
     * @generated
     */
    EClass REPEAT = eINSTANCE.getRepeat();

    /**
     * The meta object literal for the '<em><b>Positive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT__POSITIVE = eINSTANCE.getRepeat_Positive();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__EXPRESSION = eINSTANCE.getRepeat_Expression();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT__OPT_END = eINSTANCE.getRepeat_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RunImpl <em>Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RunImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRun()
     * @generated
     */
    EClass RUN = eINSTANCE.getRun();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__MODULE = eINSTANCE.getRun_Module();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__LIST = eINSTANCE.getRun_List();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleRenaming()
     * @generated
     */
    EClass MODULE_RENAMING = eINSTANCE.getModuleRenaming();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_RENAMING__MODULE = eINSTANCE.getModuleRenaming_Module();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_RENAMING__NEW_NAME = eINSTANCE.getModuleRenaming_NewName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingListImpl <em>Renaming List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingListImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenamingList()
     * @generated
     */
    EClass RENAMING_LIST = eINSTANCE.getRenamingList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENAMING_LIST__LIST = eINSTANCE.getRenamingList_List();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenaming()
     * @generated
     */
    EClass RENAMING = eINSTANCE.getRenaming();

    /**
     * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENAMING__RENAMINGS = eINSTANCE.getRenaming_Renamings();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeRenaming()
     * @generated
     */
    EClass TYPE_RENAMING = eINSTANCE.getTypeRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RENAMING__NEW_NAME = eINSTANCE.getTypeRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>New Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RENAMING__NEW_TYPE = eINSTANCE.getTypeRenaming_NewType();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RENAMING__OLD_NAME = eINSTANCE.getTypeRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantRenaming()
     * @generated
     */
    EClass CONSTANT_RENAMING = eINSTANCE.getConstantRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_RENAMING__NEW_NAME = eINSTANCE.getConstantRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_RENAMING__NEW_VALUE = eINSTANCE.getConstantRenaming_NewValue();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_RENAMING__OLD_NAME = eINSTANCE.getConstantRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
     * @generated
     */
    EClass FUNCTION_RENAMING = eINSTANCE.getFunctionRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_RENAMING__NEW_NAME = eINSTANCE.getFunctionRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>New Func</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_RENAMING__NEW_FUNC = eINSTANCE.getFunctionRenaming_NewFunc();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_RENAMING__OLD_NAME = eINSTANCE.getFunctionRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
     * @generated
     */
    EClass PROCEDURE_RENAMING = eINSTANCE.getProcedureRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_RENAMING__NEW_NAME = eINSTANCE.getProcedureRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_RENAMING__OLD_NAME = eINSTANCE.getProcedureRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskRenamingImpl <em>Task Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TaskRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTaskRenaming()
     * @generated
     */
    EClass TASK_RENAMING = eINSTANCE.getTaskRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_RENAMING__NEW_NAME = eINSTANCE.getTaskRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_RENAMING__OLD_NAME = eINSTANCE.getTaskRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSignalRenaming()
     * @generated
     */
    EClass SIGNAL_RENAMING = eINSTANCE.getSignalRenaming();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RENAMING__NEW_NAME = eINSTANCE.getSignalRenaming_NewName();

    /**
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RENAMING__OLD_NAME = eINSTANCE.getSignalRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSuspend()
     * @generated
     */
    EClass SUSPEND = eINSTANCE.getSuspend();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND__DELAY = eINSTANCE.getSuspend_Delay();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SustainImpl <em>Sustain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SustainImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSustain()
     * @generated
     */
    EClass SUSTAIN = eINSTANCE.getSustain();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSTAIN__SIGNAL = eINSTANCE.getSustain_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUSTAIN__TICK = eINSTANCE.getSustain_Tick();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSTAIN__EXPRESSION = eINSTANCE.getSustain_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapImpl <em>Trap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrap()
     * @generated
     */
    EClass TRAP = eINSTANCE.getTrap();

    /**
     * The meta object literal for the '<em><b>Trap Decl List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__TRAP_DECL_LIST = eINSTANCE.getTrap_TrapDeclList();

    /**
     * The meta object literal for the '<em><b>Trap Handler</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__TRAP_HANDLER = eINSTANCE.getTrap_TrapHandler();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAP__OPT_END = eINSTANCE.getTrap_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapDeclListImpl <em>Trap Decl List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapDeclListImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapDeclList()
     * @generated
     */
    EClass TRAP_DECL_LIST = eINSTANCE.getTrapDeclList();

    /**
     * The meta object literal for the '<em><b>Trap Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_DECL_LIST__TRAP_DECLS = eINSTANCE.getTrapDeclList_TrapDecls();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapHandler()
     * @generated
     */
    EClass TRAP_HANDLER = eINSTANCE.getTrapHandler();

    /**
     * The meta object literal for the '<em><b>Trap Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_HANDLER__TRAP_EXPR = eINSTANCE.getTrapHandler_TrapExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE__VAR = eINSTANCE.getLocalVariable_Var();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__OPT_END = eINSTANCE.getLocalVariable_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl <em>Delay Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDelayExpr()
     * @generated
     */
    EClass DELAY_EXPR = eINSTANCE.getDelayExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__EXPR = eINSTANCE.getDelayExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__EVENT = eINSTANCE.getDelayExpr_Event();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EXPR__IS_IMMEDIATE = eINSTANCE.getDelayExpr_IsImmediate();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DelayEventImpl <em>Delay Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DelayEventImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDelayEvent()
     * @generated
     */
    EClass DELAY_EVENT = eINSTANCE.getDelayEvent();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EVENT__TICK = eINSTANCE.getDelayEvent_Tick();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EVENT__EXPR = eINSTANCE.getDelayEvent_Expr();

    /**
     * The meta object literal for the '<em><b>FB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EVENT__FB = eINSTANCE.getDelayEvent_FB();

    /**
     * The meta object literal for the '<em><b>EB</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EVENT__EB = eINSTANCE.getDelayEvent_EB();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl <em>Exec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ExecImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExec()
     * @generated
     */
    EClass EXEC = eINSTANCE.getExec();

    /**
     * The meta object literal for the '<em><b>Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__TASK = eINSTANCE.getExec_Task();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__BODY = eINSTANCE.getExec_Body();

    /**
     * The meta object literal for the '<em><b>Ret Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__RET_SIGNAL = eINSTANCE.getExec_RetSignal();

    /**
     * The meta object literal for the '<em><b>Exec Case List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__EXEC_CASE_LIST = eINSTANCE.getExec_ExecCaseList();

    /**
     * The meta object literal for the '<em><b>Opt End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC__OPT_END = eINSTANCE.getExec_OptEnd();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecBodyImpl <em>Exec Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ExecBodyImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExecBody()
     * @generated
     */
    EClass EXEC_BODY = eINSTANCE.getExecBody();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_BODY__VARS = eINSTANCE.getExecBody_Vars();

    /**
     * The meta object literal for the '<em><b>Kexpressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_BODY__KEXPRESSIONS = eINSTANCE.getExecBody_Kexpressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl <em>Exec Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExecCase()
     * @generated
     */
    EClass EXEC_CASE = eINSTANCE.getExecCase();

    /**
     * The meta object literal for the '<em><b>Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__TASK = eINSTANCE.getExecCase_Task();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__BODY = eINSTANCE.getExecCase_Body();

    /**
     * The meta object literal for the '<em><b>Ret Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__RET_SIGNAL = eINSTANCE.getExecCase_RetSignal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeIdentifierImpl <em>Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeIdentifierImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelTypeIdentifier()
     * @generated
     */
    EClass ESTEREL_TYPE_IDENTIFIER = eINSTANCE.getEsterelTypeIdentifier();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTEREL_TYPE_IDENTIFIER__FUNC = eINSTANCE.getEsterelTypeIdentifier_Func();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelType()
     * @generated
     */
    EClass ESTEREL_TYPE = eINSTANCE.getEsterelType();

    /**
     * The meta object literal for the '<em><b>Est Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTEREL_TYPE__EST_TYPE = eINSTANCE.getEsterelType_EstType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalImpl <em>Local Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignal()
     * @generated
     */
    EClass LOCAL_SIGNAL = eINSTANCE.getLocalSignal();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SIGNAL__SIGNAL = eINSTANCE.getLocalSignal_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RelationImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RELATIONS = eINSTANCE.getRelation_Relations();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ParallelImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__LIST = eINSTANCE.getParallel_List();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SequenceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__LIST = eINSTANCE.getSequence_List();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortImpl <em>Weak Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbort()
     * @generated
     */
    EClass WEAK_ABORT = eINSTANCE.getWeakAbort();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortInstanceImpl <em>Weak Abort Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortInstanceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortInstance()
     * @generated
     */
    EClass WEAK_ABORT_INSTANCE = eINSTANCE.getWeakAbortInstance();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_INSTANCE__END = eINSTANCE.getWeakAbortInstance_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortCaseImpl <em>Weak Abort Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.WeakAbortCaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getWeakAbortCase()
     * @generated
     */
    EClass WEAK_ABORT_CASE = eINSTANCE.getWeakAbortCase();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_CASE__END = eINSTANCE.getWeakAbortCase_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapDeclImpl <em>Trap Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapDecl()
     * @generated
     */
    EClass TRAP_DECL = eINSTANCE.getTrapDecl();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl <em>Trap Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapExpression()
     * @generated
     */
    EClass TRAP_EXPRESSION = eINSTANCE.getTrapExpression();

    /**
     * The meta object literal for the '<em><b>Trap</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_EXPRESSION__TRAP = eINSTANCE.getTrapExpression_Trap();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionExpression()
     * @generated
     */
    EClass FUNCTION_EXPRESSION = eINSTANCE.getFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__FUNCTION = eINSTANCE.getFunctionExpression_Function();

    /**
     * The meta object literal for the '<em><b>Kexpressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__KEXPRESSIONS = eINSTANCE.getFunctionExpression_Kexpressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantExpression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION__CONSTANT = eINSTANCE.getConstantExpression_Constant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_EXPRESSION__VALUE = eINSTANCE.getConstantExpression_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl <em>Trap Reference Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapReferenceExpr()
     * @generated
     */
    EClass TRAP_REFERENCE_EXPR = eINSTANCE.getTrapReferenceExpr();

  }

} //EsterelPackage
