/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

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
 * @see de.cau.cs.kieler.esterel.EsterelFactory
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
  String eNS_URI = "http://www.cau.de/cs/kieler/Esterel";

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
  EsterelPackage eINSTANCE = de.cau.cs.kieler.esterel.impl.EsterelPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ProgramImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MODULE = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ModuleImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModule()
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
   * The feature id for the '<em><b>Mod Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MOD_INT = 1;

  /**
   * The feature id for the '<em><b>Mod Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MOD_BODY = 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ModuleBodyImpl <em>Module Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ModuleBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleBody()
   * @generated
   */
  int MODULE_BODY = 2;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BODY__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Module Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl <em>Module Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleInterface()
   * @generated
   */
  int MODULE_INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Int Signal Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_SIGNAL_DECL = 0;

  /**
   * The feature id for the '<em><b>Int Type Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_TYPE_DECL = 1;

  /**
   * The feature id for the '<em><b>Int Sensor Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_SENSOR_DECL = 2;

  /**
   * The feature id for the '<em><b>Int Constant Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_CONSTANT_DECL = 3;

  /**
   * The feature id for the '<em><b>Int Relation Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_RELATION_DECL = 4;

  /**
   * The feature id for the '<em><b>Int Function Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_FUNCTION_DECL = 5;

  /**
   * The feature id for the '<em><b>Int Procedure Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE__INT_PROCEDURE_DECL = 6;

  /**
   * The number of structural features of the '<em>Module Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_INTERFACE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalDeclImpl <em>Signal Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SignalDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalDecl()
   * @generated
   */
  int SIGNAL_DECL = 4;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECL__SIGNAL = 0;

  /**
   * The number of structural features of the '<em>Signal Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SensorDeclImpl <em>Sensor Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SensorDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensorDecl()
   * @generated
   */
  int SENSOR_DECL = 5;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL__SENSOR = 0;

  /**
   * The number of structural features of the '<em>Sensor Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationDeclImpl <em>Relation Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RelationDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationDecl()
   * @generated
   */
  int RELATION_DECL = 6;

  /**
   * The number of structural features of the '<em>Relation Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationTypeImpl <em>Relation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RelationTypeImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationType()
   * @generated
   */
  int RELATION_TYPE = 7;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RelationImplicationImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationImplication()
   * @generated
   */
  int RELATION_IMPLICATION = 8;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
   * @generated
   */
  int RELATION_INCOMPATIBILITY = 9;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TypeDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TypeImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getType()
   * @generated
   */
  int TYPE = 11;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ConstantDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantDecl()
   * @generated
   */
  int CONSTANT_DECL = 12;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECL__CONSTANT = 0;

  /**
   * The number of structural features of the '<em>Constant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.OneTypeConstantDeclImpl <em>One Type Constant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.OneTypeConstantDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOneTypeConstantDecl()
   * @generated
   */
  int ONE_TYPE_CONSTANT_DECL = 13;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECL__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECL__TYPE = 1;

  /**
   * The number of structural features of the '<em>One Type Constant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TYPE_CONSTANT_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ConstantImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.FunctionDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionDecl()
   * @generated
   */
  int FUNCTION_DECL = 15;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__FUNCTION = 0;

  /**
   * The number of structural features of the '<em>Function Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.FunctionImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ID_LIST = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureDeclImpl <em>Procedure Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ProcedureDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureDecl()
   * @generated
   */
  int PROCEDURE_DECL = 17;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL__PROCEDURE = 0;

  /**
   * The number of structural features of the '<em>Procedure Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ProcedureImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ID_LIST = 1;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.StatementImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 19;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.BlockImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 20;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AssignmentImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 21;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortImpl <em>Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AbortImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbort()
   * @generated
   */
  int ABORT = 22;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortBodyImpl <em>Abort Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AbortBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortBody()
   * @generated
   */
  int ABORT_BODY = 23;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_BODY__END = 0;

  /**
   * The number of structural features of the '<em>Abort Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortInstanceImpl <em>Abort Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AbortInstanceImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortInstance()
   * @generated
   */
  int ABORT_INSTANCE = 24;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__END = ABORT_BODY__END;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__DELAY = ABORT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE__STATEMENT = ABORT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abort Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_INSTANCE_FEATURE_COUNT = ABORT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortCaseImpl <em>Abort Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AbortCaseImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortCase()
   * @generated
   */
  int ABORT_CASE = 25;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE__END = ABORT_BODY__END;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE__CASES = ABORT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abort Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_FEATURE_COUNT = ABORT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortCaseSingleImpl <em>Abort Case Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AbortCaseSingleImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortCaseSingle()
   * @generated
   */
  int ABORT_CASE_SINGLE = 26;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE__DELAY = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Abort Case Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_CASE_SINGLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AwaitImpl <em>Await</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AwaitImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwait()
   * @generated
   */
  int AWAIT = 27;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AwaitBodyImpl <em>Await Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AwaitBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitBody()
   * @generated
   */
  int AWAIT_BODY = 28;

  /**
   * The number of structural features of the '<em>Await Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AwaitInstanceImpl <em>Await Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AwaitInstanceImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitInstance()
   * @generated
   */
  int AWAIT_INSTANCE = 29;

  /**
   * The number of structural features of the '<em>Await Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_INSTANCE_FEATURE_COUNT = AWAIT_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AwaitCaseImpl <em>Await Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.AwaitCaseImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitCase()
   * @generated
   */
  int AWAIT_CASE = 30;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE__CASES = AWAIT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE__END = AWAIT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Await Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_CASE_FEATURE_COUNT = AWAIT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DoImpl <em>Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DoImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDo()
   * @generated
   */
  int DO = 31;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__END = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DoUptoImpl <em>Do Upto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DoUptoImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoUpto()
   * @generated
   */
  int DO_UPTO = 32;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DoWatchingImpl <em>Do Watching</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DoWatchingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoWatching()
   * @generated
   */
  int DO_WATCHING = 33;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DoWatchingEndImpl <em>Do Watching End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DoWatchingEndImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoWatchingEnd()
   * @generated
   */
  int DO_WATCHING_END = 34;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_END__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Do Watching End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WATCHING_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EmitImpl <em>Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.EmitImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEmit()
   * @generated
   */
  int EMIT = 35;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.EveryDoImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEveryDo()
   * @generated
   */
  int EVERY_DO = 36;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__DELAY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Every Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ExitImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExit()
   * @generated
   */
  int EXIT = 37;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__TRAP = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__DATA_EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.HaltImpl <em>Halt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.HaltImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getHalt()
   * @generated
   */
  int HALT = 38;

  /**
   * The number of structural features of the '<em>Halt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.IfTestImpl <em>If Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.IfTestImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getIfTest()
   * @generated
   */
  int IF_TEST = 39;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__THEN = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSE_IF = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSE = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>If Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfPartImpl <em>Els If Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ElsIfPartImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIfPart()
   * @generated
   */
  int ELS_IF_PART = 40;

  /**
   * The feature id for the '<em><b>Elsif</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF_PART__ELSIF = 0;

  /**
   * The number of structural features of the '<em>Els If Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ElsIfImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIf()
   * @generated
   */
  int ELS_IF = 41;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__EXPR = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__THEN = 1;

  /**
   * The number of structural features of the '<em>Els If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ThenPartImpl <em>Then Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ThenPartImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getThenPart()
   * @generated
   */
  int THEN_PART = 42;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_PART__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Then Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ElsePartImpl <em>Else Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ElsePartImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsePart()
   * @generated
   */
  int ELSE_PART = 43;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Else Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LoopImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 44;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__BODY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__END = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LoopEachImpl <em>Loop Each</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LoopEachImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopEach()
   * @generated
   */
  int LOOP_EACH = 45;

  /**
   * The number of structural features of the '<em>Loop Each</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_EACH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LoopDelayImpl <em>Loop Delay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LoopDelayImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopDelay()
   * @generated
   */
  int LOOP_DELAY = 46;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LoopBodyImpl <em>Loop Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LoopBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopBody()
   * @generated
   */
  int LOOP_BODY = 47;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_BODY__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Loop Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.NothingImpl <em>Nothing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.NothingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getNothing()
   * @generated
   */
  int NOTHING = 48;

  /**
   * The number of structural features of the '<em>Nothing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTHING_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PauseImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 49;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentImpl <em>Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresent()
   * @generated
   */
  int PRESENT = 50;

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
   * The number of structural features of the '<em>Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentBodyImpl <em>Present Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentBody()
   * @generated
   */
  int PRESENT_BODY = 51;

  /**
   * The number of structural features of the '<em>Present Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentEventBodyImpl <em>Present Event Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentEventBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentEventBody()
   * @generated
   */
  int PRESENT_EVENT_BODY = 52;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseListImpl <em>Present Case List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentCaseListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCaseList()
   * @generated
   */
  int PRESENT_CASE_LIST = 53;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_LIST__CASE = PRESENT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Present Case List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_LIST_FEATURE_COUNT = PRESENT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentCaseImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCase()
   * @generated
   */
  int PRESENT_CASE = 54;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__EVENT = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Present Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentEventImpl <em>Present Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.PresentEventImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentEvent()
   * @generated
   */
  int PRESENT_EVENT = 55;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Present Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RepeatImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRepeat()
   * @generated
   */
  int REPEAT = 56;

  /**
   * The feature id for the '<em><b>Positive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__POSITIVE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__DATA_EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RunImpl <em>Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RunImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRun()
   * @generated
   */
  int RUN = 57;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleRenaming()
   * @generated
   */
  int MODULE_RENAMING = 58;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING__MODULE = 0;

  /**
   * The feature id for the '<em><b>Renamed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING__RENAMED = 1;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING__NEW_NAME = 2;

  /**
   * The number of structural features of the '<em>Module Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_RENAMING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RenamingListImpl <em>Renaming List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RenamingListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenamingList()
   * @generated
   */
  int RENAMING_LIST = 59;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 60;

  /**
   * The feature id for the '<em><b>Renaming</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__RENAMING = 0;

  /**
   * The number of structural features of the '<em>Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TypeRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeRenaming()
   * @generated
   */
  int TYPE_RENAMING = 61;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING__OLD_NAME = 1;

  /**
   * The number of structural features of the '<em>Type Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantRenaming()
   * @generated
   */
  int CONSTANT_RENAMING = 62;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING__VALUE = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Constant Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
   * @generated
   */
  int FUNCTION_RENAMING = 63;

  /**
   * The feature id for the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING__NEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING__OLD_NAME = 1;

  /**
   * The number of structural features of the '<em>Function Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
   * @generated
   */
  int PROCEDURE_RENAMING = 64;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SignalRenamingImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalRenaming()
   * @generated
   */
  int SIGNAL_RENAMING = 65;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclImpl <em>Local Signal Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LocalSignalDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalDecl()
   * @generated
   */
  int LOCAL_SIGNAL_DECL = 66;

  /**
   * The feature id for the '<em><b>Signal List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__SIGNAL_LIST = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Signal Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalListImpl <em>Local Signal List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LocalSignalListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalList()
   * @generated
   */
  int LOCAL_SIGNAL_LIST = 67;

  /**
   * The number of structural features of the '<em>Local Signal List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SuspendImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSuspend()
   * @generated
   */
  int SUSPEND = 68;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__DELAY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Suspend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SustainImpl <em>Sustain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SustainImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSustain()
   * @generated
   */
  int SUSTAIN = 69;

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
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__DATA_EXPR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sustain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapImpl <em>Trap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrap()
   * @generated
   */
  int TRAP = 70;

  /**
   * The feature id for the '<em><b>Trap Decl List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_DECL_LIST = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Trap Handler List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_HANDLER_LIST = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapDeclListImpl <em>Trap Decl List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapDeclListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapDeclList()
   * @generated
   */
  int TRAP_DECL_LIST = 71;

  /**
   * The feature id for the '<em><b>Trap Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_LIST__TRAP_DECL = 0;

  /**
   * The number of structural features of the '<em>Trap Decl List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapDeclImpl <em>Trap Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapDecl()
   * @generated
   */
  int TRAP_DECL = 72;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Channel Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL__CHANNEL_DESC = 1;

  /**
   * The number of structural features of the '<em>Trap Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerListImpl <em>Trap Handler List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapHandlerListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandlerList()
   * @generated
   */
  int TRAP_HANDLER_LIST = 73;

  /**
   * The feature id for the '<em><b>Trap Handler</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER_LIST__TRAP_HANDLER = 0;

  /**
   * The number of structural features of the '<em>Trap Handler List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapHandlerImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandler()
   * @generated
   */
  int TRAP_HANDLER = 74;

  /**
   * The feature id for the '<em><b>Trap Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__TRAP_EXPR = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Trap Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.VariableImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 75;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VAR_DECL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.VariableDeclImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 76;

  /**
   * The feature id for the '<em><b>Var List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VAR_LIST = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__LEFT = 2;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.VariableListImpl <em>Variable List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.VariableListImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariableList()
   * @generated
   */
  int VARIABLE_LIST = 77;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__LEFT = 2;

  /**
   * The number of structural features of the '<em>Variable List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortImpl <em>Weak Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.WeakAbortImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbort()
   * @generated
   */
  int WEAK_ABORT = 78;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Weak Abort Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT__WEAK_ABORT_BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Weak Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortBodyImpl <em>Weak Abort Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.WeakAbortBodyImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortBody()
   * @generated
   */
  int WEAK_ABORT_BODY = 79;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_BODY__END = 0;

  /**
   * The number of structural features of the '<em>Weak Abort Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortInstanceImpl <em>Weak Abort Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.WeakAbortInstanceImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortInstance()
   * @generated
   */
  int WEAK_ABORT_INSTANCE = 80;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__END = WEAK_ABORT_BODY__END;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__DELAY = WEAK_ABORT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE__STATEMENT = WEAK_ABORT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Weak Abort Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_INSTANCE_FEATURE_COUNT = WEAK_ABORT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortCaseImpl <em>Weak Abort Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.WeakAbortCaseImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortCase()
   * @generated
   */
  int WEAK_ABORT_CASE = 81;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE__END = WEAK_ABORT_BODY__END;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE__CASES = WEAK_ABORT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Weak Abort Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAK_ABORT_CASE_FEATURE_COUNT = WEAK_ABORT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataExprImpl <em>Data Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataExprImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataExpr()
   * @generated
   */
  int DATA_EXPR = 82;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXPR__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXPR__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXPR__EXPR = 3;

  /**
   * The number of structural features of the '<em>Data Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXPR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl <em>Data Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataUnaryExpr()
   * @generated
   */
  int DATA_UNARY_EXPR = 83;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNARY_EXPR__LEFT = DATA_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNARY_EXPR__OP = DATA_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNARY_EXPR__RIGHT = DATA_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNARY_EXPR__EXPR = DATA_EXPR__EXPR;

  /**
   * The number of structural features of the '<em>Data Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNARY_EXPR_FEATURE_COUNT = DATA_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataValueIDImpl <em>Data Value ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataValueIDImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueID()
   * @generated
   */
  int DATA_VALUE_ID = 84;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID__VALUE = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Value ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_ID_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataValueFloatImpl <em>Data Value Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataValueFloatImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueFloat()
   * @generated
   */
  int DATA_VALUE_FLOAT = 85;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT__VALUE = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Value Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_FLOAT_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataValueBooleanImpl <em>Data Value Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataValueBooleanImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueBoolean()
   * @generated
   */
  int DATA_VALUE_BOOLEAN = 86;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN__VALUE = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Value Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_BOOLEAN_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataValueIntImpl <em>Data Value Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataValueIntImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueInt()
   * @generated
   */
  int DATA_VALUE_INT = 87;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT__VALUE = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Value Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_INT_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataValueStringImpl <em>Data Value String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataValueStringImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueString()
   * @generated
   */
  int DATA_VALUE_STRING = 88;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING__VALUE = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Value String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VALUE_STRING_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataBlockImpl <em>Data Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataBlockImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataBlock()
   * @generated
   */
  int DATA_BLOCK = 89;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK__DATA_EXPR = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BLOCK_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataCurrentImpl <em>Data Current</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataCurrentImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataCurrent()
   * @generated
   */
  int DATA_CURRENT = 90;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__SIGNAL = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT__TICK = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Current</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CURRENT_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataPreImpl <em>Data Pre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataPreImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataPre()
   * @generated
   */
  int DATA_PRE = 91;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__SIGNAL = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE__TICK = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Pre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRE_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataTrapImpl <em>Data Trap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataTrapImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataTrap()
   * @generated
   */
  int DATA_TRAP = 92;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP__TRAP = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Trap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TRAP_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DataFunctionImpl <em>Data Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DataFunctionImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataFunction()
   * @generated
   */
  int DATA_FUNCTION = 93;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__LEFT = DATA_UNARY_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__OP = DATA_UNARY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__RIGHT = DATA_UNARY_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__EXPR = DATA_UNARY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__FUNCTION = DATA_UNARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION__DATA_EXPR = DATA_UNARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FUNCTION_FEATURE_COUNT = DATA_UNARY_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapExprImpl <em>Trap Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.TrapExprImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapExpr()
   * @generated
   */
  int TRAP_EXPR = 94;

  /**
   * The number of structural features of the '<em>Trap Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SigExprImpl <em>Sig Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SigExprImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExpr()
   * @generated
   */
  int SIG_EXPR = 95;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR__SIGNAL = TRAP_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR__TICK = TRAP_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>And Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR__AND_EXPR = TRAP_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sig Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_FEATURE_COUNT = TRAP_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SigExprANDImpl <em>Sig Expr AND</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SigExprANDImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExprAND()
   * @generated
   */
  int SIG_EXPR_AND = 96;

  /**
   * The feature id for the '<em><b>Una Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_AND__UNA_EXPR = 0;

  /**
   * The number of structural features of the '<em>Sig Expr AND</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_AND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl <em>Sig Expr Unary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExprUnary()
   * @generated
   */
  int SIG_EXPR_UNARY = 97;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_UNARY__EXPR = 0;

  /**
   * The feature id for the '<em><b>Sig Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_UNARY__SIG_EXPR = 1;

  /**
   * The number of structural features of the '<em>Sig Expr Unary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_EXPR_UNARY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DelayExprImpl <em>Delay Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DelayExprImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayExpr()
   * @generated
   */
  int DELAY_EXPR = 98;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__STATEMENT = AWAIT_INSTANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__END = AWAIT_INSTANCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__EVENT = AWAIT_INSTANCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__EXPR = AWAIT_INSTANCE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Delay Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR_FEATURE_COUNT = AWAIT_INSTANCE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DelayEventImpl <em>Delay Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.DelayEventImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayEvent()
   * @generated
   */
  int DELAY_EVENT = 99;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__SIGNAL = 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT__TICK = 1;

  /**
   * The number of structural features of the '<em>Delay Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ChannelDescriptionImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getChannelDescription()
   * @generated
   */
  int CHANNEL_DESCRIPTION = 100;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION__DATA_EXPR = 1;

  /**
   * The number of structural features of the '<em>Channel Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SignalImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 101;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Channel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__CHANNEL = 1;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SensorImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 102;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__TYPE = 1;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.InputImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInput()
   * @generated
   */
  int INPUT = 103;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__SIGNAL = SIGNAL_DECL__SIGNAL;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.OutputImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 104;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__SIGNAL = SIGNAL_DECL__SIGNAL;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.InputOutputImpl <em>Input Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.InputOutputImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputOutput()
   * @generated
   */
  int INPUT_OUTPUT = 105;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OUTPUT__SIGNAL = SIGNAL_DECL__SIGNAL;

  /**
   * The number of structural features of the '<em>Input Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OUTPUT_FEATURE_COUNT = SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ReturnImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 106;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__SIGNAL = SIGNAL_DECL__SIGNAL;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.RelationImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 107;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATION = RELATION_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = RELATION_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.ParallelImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 108;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__LEFT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__RIGHT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.SequenceImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 109;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__LEFT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__RIGHT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalImpl <em>Local Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.impl.LocalSignalImpl
   * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignal()
   * @generated
   */
  int LOCAL_SIGNAL = 110;

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.esterel.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Program#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.Program#getModule()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Module();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Module#getModInt <em>Mod Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod Int</em>'.
   * @see de.cau.cs.kieler.esterel.Module#getModInt()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ModInt();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Module#getModBody <em>Mod Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod Body</em>'.
   * @see de.cau.cs.kieler.esterel.Module#getModBody()
   * @see #getModule()
   * @generated
   */
  EReference getModule_ModBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ModuleBody <em>Module Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Body</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleBody
   * @generated
   */
  EClass getModuleBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleBody#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleBody#getStatement()
   * @see #getModuleBody()
   * @generated
   */
  EReference getModuleBody_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ModuleInterface <em>Module Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Interface</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface
   * @generated
   */
  EClass getModuleInterface();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntSignalDecl <em>Int Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntSignalDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntSignalDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntTypeDecl <em>Int Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Type Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntTypeDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntTypeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntSensorDecl <em>Int Sensor Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Sensor Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntSensorDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntSensorDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntConstantDecl <em>Int Constant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Constant Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntConstantDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntConstantDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntRelationDecl <em>Int Relation Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Relation Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntRelationDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntRelationDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntFunctionDecl <em>Int Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Function Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntFunctionDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntFunctionDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntProcedureDecl <em>Int Procedure Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Procedure Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleInterface#getIntProcedureDecl()
   * @see #getModuleInterface()
   * @generated
   */
  EReference getModuleInterface_IntProcedureDecl();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SignalDecl <em>Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.SignalDecl
   * @generated
   */
  EClass getSignalDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.SignalDecl#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.SignalDecl#getSignal()
   * @see #getSignalDecl()
   * @generated
   */
  EReference getSignalDecl_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SensorDecl <em>Sensor Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor Decl</em>'.
   * @see de.cau.cs.kieler.esterel.SensorDecl
   * @generated
   */
  EClass getSensorDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.SensorDecl#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensor</em>'.
   * @see de.cau.cs.kieler.esterel.SensorDecl#getSensor()
   * @see #getSensorDecl()
   * @generated
   */
  EReference getSensorDecl_Sensor();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationDecl <em>Relation Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Decl</em>'.
   * @see de.cau.cs.kieler.esterel.RelationDecl
   * @generated
   */
  EClass getRelationDecl();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Type</em>'.
   * @see de.cau.cs.kieler.esterel.RelationType
   * @generated
   */
  EClass getRelationType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.RelationType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.RelationType#getType()
   * @see #getRelationType()
   * @generated
   */
  EAttribute getRelationType_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationImplication <em>Relation Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Implication</em>'.
   * @see de.cau.cs.kieler.esterel.RelationImplication
   * @generated
   */
  EClass getRelationImplication();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.RelationImplication#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see de.cau.cs.kieler.esterel.RelationImplication#getFirst()
   * @see #getRelationImplication()
   * @generated
   */
  EReference getRelationImplication_First();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.RelationImplication#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see de.cau.cs.kieler.esterel.RelationImplication#getSecond()
   * @see #getRelationImplication()
   * @generated
   */
  EReference getRelationImplication_Second();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationIncompatibility <em>Relation Incompatibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Incompatibility</em>'.
   * @see de.cau.cs.kieler.esterel.RelationIncompatibility
   * @generated
   */
  EClass getRelationIncompatibility();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.RelationIncompatibility#getIncomp <em>Incomp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incomp</em>'.
   * @see de.cau.cs.kieler.esterel.RelationIncompatibility#getIncomp()
   * @see #getRelationIncompatibility()
   * @generated
   */
  EReference getRelationIncompatibility_Incomp();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see de.cau.cs.kieler.esterel.TypeDecl
   * @generated
   */
  EClass getTypeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.TypeDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.TypeDecl#getType()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ConstantDecl <em>Constant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ConstantDecl
   * @generated
   */
  EClass getConstantDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ConstantDecl#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.ConstantDecl#getConstant()
   * @see #getConstantDecl()
   * @generated
   */
  EReference getConstantDecl_Constant();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.OneTypeConstantDecl <em>One Type Constant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Type Constant Decl</em>'.
   * @see de.cau.cs.kieler.esterel.OneTypeConstantDecl
   * @generated
   */
  EClass getOneTypeConstantDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.OneTypeConstantDecl#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.OneTypeConstantDecl#getConstant()
   * @see #getOneTypeConstantDecl()
   * @generated
   */
  EReference getOneTypeConstantDecl_Constant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.OneTypeConstantDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.OneTypeConstantDecl#getType()
   * @see #getOneTypeConstantDecl()
   * @generated
   */
  EAttribute getOneTypeConstantDecl_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Decl</em>'.
   * @see de.cau.cs.kieler.esterel.FunctionDecl
   * @generated
   */
  EClass getFunctionDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.FunctionDecl#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see de.cau.cs.kieler.esterel.FunctionDecl#getFunction()
   * @see #getFunctionDecl()
   * @generated
   */
  EReference getFunctionDecl_Function();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.cau.cs.kieler.esterel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.esterel.Function#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Id List</em>'.
   * @see de.cau.cs.kieler.esterel.Function#getIdList()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_IdList();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ProcedureDecl <em>Procedure Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Decl</em>'.
   * @see de.cau.cs.kieler.esterel.ProcedureDecl
   * @generated
   */
  EClass getProcedureDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ProcedureDecl#getProcedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedure</em>'.
   * @see de.cau.cs.kieler.esterel.ProcedureDecl#getProcedure()
   * @see #getProcedureDecl()
   * @generated
   */
  EReference getProcedureDecl_Procedure();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see de.cau.cs.kieler.esterel.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.esterel.Procedure#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Id List</em>'.
   * @see de.cau.cs.kieler.esterel.Procedure#getIdList()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_IdList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see de.cau.cs.kieler.esterel.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Block#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Block#getStatement()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.esterel.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see de.cau.cs.kieler.esterel.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Assignment#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.Assignment#getExpr()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort</em>'.
   * @see de.cau.cs.kieler.esterel.Abort
   * @generated
   */
  EClass getAbort();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Abort#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Abort#getStatement()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Abort#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.Abort#getBody()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_Body();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AbortBody <em>Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Body</em>'.
   * @see de.cau.cs.kieler.esterel.AbortBody
   * @generated
   */
  EClass getAbortBody();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.AbortBody#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.AbortBody#getEnd()
   * @see #getAbortBody()
   * @generated
   */
  EAttribute getAbortBody_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AbortInstance <em>Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Instance</em>'.
   * @see de.cau.cs.kieler.esterel.AbortInstance
   * @generated
   */
  EClass getAbortInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.AbortInstance#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.AbortInstance#getDelay()
   * @see #getAbortInstance()
   * @generated
   */
  EReference getAbortInstance_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.AbortInstance#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.AbortInstance#getStatement()
   * @see #getAbortInstance()
   * @generated
   */
  EReference getAbortInstance_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AbortCase <em>Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Case</em>'.
   * @see de.cau.cs.kieler.esterel.AbortCase
   * @generated
   */
  EClass getAbortCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.AbortCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.AbortCase#getCases()
   * @see #getAbortCase()
   * @generated
   */
  EReference getAbortCase_Cases();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AbortCaseSingle <em>Abort Case Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Case Single</em>'.
   * @see de.cau.cs.kieler.esterel.AbortCaseSingle
   * @generated
   */
  EClass getAbortCaseSingle();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.AbortCaseSingle#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.AbortCaseSingle#getDelay()
   * @see #getAbortCaseSingle()
   * @generated
   */
  EReference getAbortCaseSingle_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.AbortCaseSingle#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.AbortCaseSingle#getStatement()
   * @see #getAbortCaseSingle()
   * @generated
   */
  EReference getAbortCaseSingle_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Await <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await</em>'.
   * @see de.cau.cs.kieler.esterel.Await
   * @generated
   */
  EClass getAwait();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Await#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.Await#getBody()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Body();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AwaitBody <em>Await Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Body</em>'.
   * @see de.cau.cs.kieler.esterel.AwaitBody
   * @generated
   */
  EClass getAwaitBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AwaitInstance <em>Await Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Instance</em>'.
   * @see de.cau.cs.kieler.esterel.AwaitInstance
   * @generated
   */
  EClass getAwaitInstance();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.AwaitCase <em>Await Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await Case</em>'.
   * @see de.cau.cs.kieler.esterel.AwaitCase
   * @generated
   */
  EClass getAwaitCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.AwaitCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.AwaitCase#getCases()
   * @see #getAwaitCase()
   * @generated
   */
  EReference getAwaitCase_Cases();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.AwaitCase#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.AwaitCase#getEnd()
   * @see #getAwaitCase()
   * @generated
   */
  EAttribute getAwaitCase_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Do <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do</em>'.
   * @see de.cau.cs.kieler.esterel.Do
   * @generated
   */
  EClass getDo();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Do#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Do#getStatement()
   * @see #getDo()
   * @generated
   */
  EReference getDo_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Do#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.Do#getEnd()
   * @see #getDo()
   * @generated
   */
  EReference getDo_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DoUpto <em>Do Upto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Upto</em>'.
   * @see de.cau.cs.kieler.esterel.DoUpto
   * @generated
   */
  EClass getDoUpto();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DoUpto#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DoUpto#getExpr()
   * @see #getDoUpto()
   * @generated
   */
  EReference getDoUpto_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DoWatching <em>Do Watching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Watching</em>'.
   * @see de.cau.cs.kieler.esterel.DoWatching
   * @generated
   */
  EClass getDoWatching();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DoWatching#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.DoWatching#getDelay()
   * @see #getDoWatching()
   * @generated
   */
  EReference getDoWatching_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DoWatching#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.DoWatching#getEnd()
   * @see #getDoWatching()
   * @generated
   */
  EReference getDoWatching_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DoWatchingEnd <em>Do Watching End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Watching End</em>'.
   * @see de.cau.cs.kieler.esterel.DoWatchingEnd
   * @generated
   */
  EClass getDoWatchingEnd();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DoWatchingEnd#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.DoWatchingEnd#getStatement()
   * @see #getDoWatchingEnd()
   * @generated
   */
  EReference getDoWatchingEnd_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Emit <em>Emit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emit</em>'.
   * @see de.cau.cs.kieler.esterel.Emit
   * @generated
   */
  EClass getEmit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Emit#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.Emit#getSignal()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Emit#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.Emit#getTick()
   * @see #getEmit()
   * @generated
   */
  EAttribute getEmit_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Emit#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.Emit#getExpr()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EveryDo <em>Every Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Every Do</em>'.
   * @see de.cau.cs.kieler.esterel.EveryDo
   * @generated
   */
  EClass getEveryDo();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.EveryDo#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.EveryDo#getDelay()
   * @see #getEveryDo()
   * @generated
   */
  EReference getEveryDo_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.EveryDo#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.EveryDo#getStatement()
   * @see #getEveryDo()
   * @generated
   */
  EReference getEveryDo_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.cau.cs.kieler.esterel.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Exit#getTrap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.Exit#getTrap()
   * @see #getExit()
   * @generated
   */
  EReference getExit_Trap();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Exit#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.Exit#getDataExpr()
   * @see #getExit()
   * @generated
   */
  EReference getExit_DataExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Halt <em>Halt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Halt</em>'.
   * @see de.cau.cs.kieler.esterel.Halt
   * @generated
   */
  EClass getHalt();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.IfTest <em>If Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Test</em>'.
   * @see de.cau.cs.kieler.esterel.IfTest
   * @generated
   */
  EClass getIfTest();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.IfTest#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.IfTest#getExpr()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.IfTest#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see de.cau.cs.kieler.esterel.IfTest#getThen()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Then();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.IfTest#getElseIf <em>Else If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else If</em>'.
   * @see de.cau.cs.kieler.esterel.IfTest#getElseIf()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ElseIf();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.IfTest#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see de.cau.cs.kieler.esterel.IfTest#getElse()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Else();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ElsIfPart <em>Els If Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Els If Part</em>'.
   * @see de.cau.cs.kieler.esterel.ElsIfPart
   * @generated
   */
  EClass getElsIfPart();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ElsIfPart#getElsif <em>Elsif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elsif</em>'.
   * @see de.cau.cs.kieler.esterel.ElsIfPart#getElsif()
   * @see #getElsIfPart()
   * @generated
   */
  EReference getElsIfPart_Elsif();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ElsIf <em>Els If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Els If</em>'.
   * @see de.cau.cs.kieler.esterel.ElsIf
   * @generated
   */
  EClass getElsIf();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ElsIf#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.ElsIf#getExpr()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ElsIf#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see de.cau.cs.kieler.esterel.ElsIf#getThen()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_Then();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.ThenPart
   * @generated
   */
  EClass getThenPart();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ThenPart#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.ThenPart#getStatement()
   * @see #getThenPart()
   * @generated
   */
  EReference getThenPart_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Part</em>'.
   * @see de.cau.cs.kieler.esterel.ElsePart
   * @generated
   */
  EClass getElsePart();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ElsePart#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.ElsePart#getStatement()
   * @see #getElsePart()
   * @generated
   */
  EReference getElsePart_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see de.cau.cs.kieler.esterel.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Loop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.Loop#getBody()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Body();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Loop#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.Loop#getEnd()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LoopEach <em>Loop Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Each</em>'.
   * @see de.cau.cs.kieler.esterel.LoopEach
   * @generated
   */
  EClass getLoopEach();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LoopDelay <em>Loop Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Delay</em>'.
   * @see de.cau.cs.kieler.esterel.LoopDelay
   * @generated
   */
  EClass getLoopDelay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.LoopDelay#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.LoopDelay#getDelay()
   * @see #getLoopDelay()
   * @generated
   */
  EReference getLoopDelay_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LoopBody <em>Loop Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Body</em>'.
   * @see de.cau.cs.kieler.esterel.LoopBody
   * @generated
   */
  EClass getLoopBody();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.LoopBody#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.LoopBody#getStatement()
   * @see #getLoopBody()
   * @generated
   */
  EReference getLoopBody_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Nothing <em>Nothing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nothing</em>'.
   * @see de.cau.cs.kieler.esterel.Nothing
   * @generated
   */
  EClass getNothing();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.esterel.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Present <em>Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present</em>'.
   * @see de.cau.cs.kieler.esterel.Present
   * @generated
   */
  EClass getPresent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Present#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.cau.cs.kieler.esterel.Present#getBody()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Body();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Present#getElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Part</em>'.
   * @see de.cau.cs.kieler.esterel.Present#getElsePart()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ElsePart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentBody <em>Present Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Body</em>'.
   * @see de.cau.cs.kieler.esterel.PresentBody
   * @generated
   */
  EClass getPresentBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentEventBody <em>Present Event Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Event Body</em>'.
   * @see de.cau.cs.kieler.esterel.PresentEventBody
   * @generated
   */
  EClass getPresentEventBody();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentEventBody#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.PresentEventBody#getEvent()
   * @see #getPresentEventBody()
   * @generated
   */
  EReference getPresentEventBody_Event();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentEventBody#getThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Part</em>'.
   * @see de.cau.cs.kieler.esterel.PresentEventBody#getThenPart()
   * @see #getPresentEventBody()
   * @generated
   */
  EReference getPresentEventBody_ThenPart();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentCaseList <em>Present Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Case List</em>'.
   * @see de.cau.cs.kieler.esterel.PresentCaseList
   * @generated
   */
  EClass getPresentCaseList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.PresentCaseList#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case</em>'.
   * @see de.cau.cs.kieler.esterel.PresentCaseList#getCase()
   * @see #getPresentCaseList()
   * @generated
   */
  EReference getPresentCaseList_Case();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentCase <em>Present Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Case</em>'.
   * @see de.cau.cs.kieler.esterel.PresentCase
   * @generated
   */
  EClass getPresentCase();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentCase#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.PresentCase#getEvent()
   * @see #getPresentCase()
   * @generated
   */
  EReference getPresentCase_Event();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentCase#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.PresentCase#getStatement()
   * @see #getPresentCase()
   * @generated
   */
  EReference getPresentCase_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentEvent <em>Present Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present Event</em>'.
   * @see de.cau.cs.kieler.esterel.PresentEvent
   * @generated
   */
  EClass getPresentEvent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentEvent#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.PresentEvent#getExpression()
   * @see #getPresentEvent()
   * @generated
   */
  EReference getPresentEvent_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat</em>'.
   * @see de.cau.cs.kieler.esterel.Repeat
   * @generated
   */
  EClass getRepeat();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Repeat#isPositive <em>Positive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Positive</em>'.
   * @see de.cau.cs.kieler.esterel.Repeat#isPositive()
   * @see #getRepeat()
   * @generated
   */
  EAttribute getRepeat_Positive();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Repeat#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.Repeat#getDataExpr()
   * @see #getRepeat()
   * @generated
   */
  EReference getRepeat_DataExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Repeat#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Repeat#getStatement()
   * @see #getRepeat()
   * @generated
   */
  EReference getRepeat_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run</em>'.
   * @see de.cau.cs.kieler.esterel.Run
   * @generated
   */
  EClass getRun();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Run#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.Run#getModule()
   * @see #getRun()
   * @generated
   */
  EReference getRun_Module();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Run#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.Run#getList()
   * @see #getRun()
   * @generated
   */
  EReference getRun_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ModuleRenaming <em>Module Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleRenaming
   * @generated
   */
  EClass getModuleRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleRenaming#getModule()
   * @see #getModuleRenaming()
   * @generated
   */
  EReference getModuleRenaming_Module();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ModuleRenaming#isRenamed <em>Renamed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Renamed</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleRenaming#isRenamed()
   * @see #getModuleRenaming()
   * @generated
   */
  EAttribute getModuleRenaming_Renamed();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.ModuleRenaming#getNewName()
   * @see #getModuleRenaming()
   * @generated
   */
  EAttribute getModuleRenaming_NewName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RenamingList <em>Renaming List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming List</em>'.
   * @see de.cau.cs.kieler.esterel.RenamingList
   * @generated
   */
  EClass getRenamingList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.RenamingList#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see de.cau.cs.kieler.esterel.RenamingList#getList()
   * @see #getRenamingList()
   * @generated
   */
  EReference getRenamingList_List();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Renaming#getRenaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.Renaming#getRenaming()
   * @see #getRenaming()
   * @generated
   */
  EReference getRenaming_Renaming();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeRenaming <em>Type Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.TypeRenaming
   * @generated
   */
  EClass getTypeRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TypeRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.TypeRenaming#getNewName()
   * @see #getTypeRenaming()
   * @generated
   */
  EReference getTypeRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TypeRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.TypeRenaming#getOldName()
   * @see #getTypeRenaming()
   * @generated
   */
  EReference getTypeRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ConstantRenaming <em>Constant Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.ConstantRenaming
   * @generated
   */
  EClass getConstantRenaming();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.ConstantRenaming#getValue()
   * @see #getConstantRenaming()
   * @generated
   */
  EAttribute getConstantRenaming_Value();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.ConstantRenaming#getNewName()
   * @see #getConstantRenaming()
   * @generated
   */
  EAttribute getConstantRenaming_NewName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.FunctionRenaming <em>Function Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.FunctionRenaming
   * @generated
   */
  EClass getFunctionRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.FunctionRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.FunctionRenaming#getNewName()
   * @see #getFunctionRenaming()
   * @generated
   */
  EReference getFunctionRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.FunctionRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.FunctionRenaming#getOldName()
   * @see #getFunctionRenaming()
   * @generated
   */
  EReference getFunctionRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ProcedureRenaming <em>Procedure Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.ProcedureRenaming
   * @generated
   */
  EClass getProcedureRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName()
   * @see #getProcedureRenaming()
   * @generated
   */
  EReference getProcedureRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName()
   * @see #getProcedureRenaming()
   * @generated
   */
  EReference getProcedureRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SignalRenaming <em>Signal Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.SignalRenaming
   * @generated
   */
  EClass getSignalRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Name</em>'.
   * @see de.cau.cs.kieler.esterel.SignalRenaming#getNewName()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_NewName();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Name</em>'.
   * @see de.cau.cs.kieler.esterel.SignalRenaming#getOldName()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_OldName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LocalSignalDecl <em>Local Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignalDecl
   * @generated
   */
  EClass getLocalSignalDecl();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal List</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignalDecl#getSignalList()
   * @see #getLocalSignalDecl()
   * @generated
   */
  EReference getLocalSignalDecl_SignalList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignalDecl#getStatement()
   * @see #getLocalSignalDecl()
   * @generated
   */
  EReference getLocalSignalDecl_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LocalSignalList <em>Local Signal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal List</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignalList
   * @generated
   */
  EClass getLocalSignalList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Suspend <em>Suspend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend</em>'.
   * @see de.cau.cs.kieler.esterel.Suspend
   * @generated
   */
  EClass getSuspend();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Suspend#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Suspend#getStatement()
   * @see #getSuspend()
   * @generated
   */
  EReference getSuspend_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Suspend#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.Suspend#getDelay()
   * @see #getSuspend()
   * @generated
   */
  EReference getSuspend_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Sustain <em>Sustain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sustain</em>'.
   * @see de.cau.cs.kieler.esterel.Sustain
   * @generated
   */
  EClass getSustain();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Sustain#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.Sustain#getSignal()
   * @see #getSustain()
   * @generated
   */
  EReference getSustain_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Sustain#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.Sustain#getTick()
   * @see #getSustain()
   * @generated
   */
  EAttribute getSustain_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Sustain#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.Sustain#getDataExpr()
   * @see #getSustain()
   * @generated
   */
  EReference getSustain_DataExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Trap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.Trap
   * @generated
   */
  EClass getTrap();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trap Decl List</em>'.
   * @see de.cau.cs.kieler.esterel.Trap#getTrapDeclList()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_TrapDeclList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Trap#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Trap#getStatement()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Trap#getTrapHandlerList <em>Trap Handler List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trap Handler List</em>'.
   * @see de.cau.cs.kieler.esterel.Trap#getTrapHandlerList()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_TrapHandlerList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapDeclList <em>Trap Decl List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Decl List</em>'.
   * @see de.cau.cs.kieler.esterel.TrapDeclList
   * @generated
   */
  EClass getTrapDeclList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.TrapDeclList#getTrapDecl <em>Trap Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trap Decl</em>'.
   * @see de.cau.cs.kieler.esterel.TrapDeclList#getTrapDecl()
   * @see #getTrapDeclList()
   * @generated
   */
  EReference getTrapDeclList_TrapDecl();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapDecl <em>Trap Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Decl</em>'.
   * @see de.cau.cs.kieler.esterel.TrapDecl
   * @generated
   */
  EClass getTrapDecl();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.TrapDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.TrapDecl#getName()
   * @see #getTrapDecl()
   * @generated
   */
  EAttribute getTrapDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.TrapDecl#getChannelDesc <em>Channel Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Channel Desc</em>'.
   * @see de.cau.cs.kieler.esterel.TrapDecl#getChannelDesc()
   * @see #getTrapDecl()
   * @generated
   */
  EReference getTrapDecl_ChannelDesc();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapHandlerList <em>Trap Handler List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Handler List</em>'.
   * @see de.cau.cs.kieler.esterel.TrapHandlerList
   * @generated
   */
  EClass getTrapHandlerList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.TrapHandlerList#getTrapHandler <em>Trap Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trap Handler</em>'.
   * @see de.cau.cs.kieler.esterel.TrapHandlerList#getTrapHandler()
   * @see #getTrapHandlerList()
   * @generated
   */
  EReference getTrapHandlerList_TrapHandler();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapHandler <em>Trap Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Handler</em>'.
   * @see de.cau.cs.kieler.esterel.TrapHandler
   * @generated
   */
  EClass getTrapHandler();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trap Expr</em>'.
   * @see de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr()
   * @see #getTrapHandler()
   * @generated
   */
  EReference getTrapHandler_TrapExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.TrapHandler#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.TrapHandler#getStatement()
   * @see #getTrapHandler()
   * @generated
   */
  EReference getTrapHandler_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.esterel.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Variable#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decl</em>'.
   * @see de.cau.cs.kieler.esterel.Variable#getVarDecl()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_VarDecl();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Variable#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.Variable#getStatement()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see de.cau.cs.kieler.esterel.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.VariableDecl#getVarList <em>Var List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var List</em>'.
   * @see de.cau.cs.kieler.esterel.VariableDecl#getVarList()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_VarList();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.VariableDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.VariableDecl#getType()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.VariableDecl#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.esterel.VariableDecl#getLeft()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Left();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.VariableList <em>Variable List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable List</em>'.
   * @see de.cau.cs.kieler.esterel.VariableList
   * @generated
   */
  EClass getVariableList();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.VariableList#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see de.cau.cs.kieler.esterel.VariableList#getVariable()
   * @see #getVariableList()
   * @generated
   */
  EAttribute getVariableList_Variable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.VariableList#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.VariableList#getExpression()
   * @see #getVariableList()
   * @generated
   */
  EReference getVariableList_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.VariableList#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.esterel.VariableList#getLeft()
   * @see #getVariableList()
   * @generated
   */
  EReference getVariableList_Left();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.WeakAbort <em>Weak Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbort
   * @generated
   */
  EClass getWeakAbort();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.WeakAbort#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbort#getStatement()
   * @see #getWeakAbort()
   * @generated
   */
  EReference getWeakAbort_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.WeakAbort#getWeakAbortBody <em>Weak Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weak Abort Body</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbort#getWeakAbortBody()
   * @see #getWeakAbort()
   * @generated
   */
  EReference getWeakAbort_WeakAbortBody();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.WeakAbortBody <em>Weak Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Body</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortBody
   * @generated
   */
  EClass getWeakAbortBody();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.WeakAbortBody#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortBody#getEnd()
   * @see #getWeakAbortBody()
   * @generated
   */
  EAttribute getWeakAbortBody_End();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.WeakAbortInstance <em>Weak Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Instance</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortInstance
   * @generated
   */
  EClass getWeakAbortInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.WeakAbortInstance#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortInstance#getDelay()
   * @see #getWeakAbortInstance()
   * @generated
   */
  EReference getWeakAbortInstance_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.WeakAbortInstance#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortInstance#getStatement()
   * @see #getWeakAbortInstance()
   * @generated
   */
  EReference getWeakAbortInstance_Statement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.WeakAbortCase <em>Weak Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weak Abort Case</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortCase
   * @generated
   */
  EClass getWeakAbortCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.WeakAbortCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.WeakAbortCase#getCases()
   * @see #getWeakAbortCase()
   * @generated
   */
  EReference getWeakAbortCase_Cases();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DataExpr
   * @generated
   */
  EClass getDataExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DataExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.esterel.DataExpr#getLeft()
   * @see #getDataExpr()
   * @generated
   */
  EReference getDataExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see de.cau.cs.kieler.esterel.DataExpr#getOp()
   * @see #getDataExpr()
   * @generated
   */
  EAttribute getDataExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DataExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.kieler.esterel.DataExpr#getRight()
   * @see #getDataExpr()
   * @generated
   */
  EReference getDataExpr_Right();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DataExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DataExpr#getExpr()
   * @see #getDataExpr()
   * @generated
   */
  EReference getDataExpr_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataUnaryExpr <em>Data Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Unary Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DataUnaryExpr
   * @generated
   */
  EClass getDataUnaryExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataValueID <em>Data Value ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Value ID</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueID
   * @generated
   */
  EClass getDataValueID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataValueID#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueID#getValue()
   * @see #getDataValueID()
   * @generated
   */
  EAttribute getDataValueID_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataValueFloat <em>Data Value Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Value Float</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueFloat
   * @generated
   */
  EClass getDataValueFloat();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataValueFloat#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueFloat#getValue()
   * @see #getDataValueFloat()
   * @generated
   */
  EAttribute getDataValueFloat_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataValueBoolean <em>Data Value Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Value Boolean</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueBoolean
   * @generated
   */
  EClass getDataValueBoolean();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataValueBoolean#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueBoolean#getValue()
   * @see #getDataValueBoolean()
   * @generated
   */
  EAttribute getDataValueBoolean_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataValueInt <em>Data Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Value Int</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueInt
   * @generated
   */
  EClass getDataValueInt();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataValueInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueInt#getValue()
   * @see #getDataValueInt()
   * @generated
   */
  EAttribute getDataValueInt_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataValueString <em>Data Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Value String</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueString
   * @generated
   */
  EClass getDataValueString();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataValueString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.DataValueString#getValue()
   * @see #getDataValueString()
   * @generated
   */
  EAttribute getDataValueString_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataBlock <em>Data Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Block</em>'.
   * @see de.cau.cs.kieler.esterel.DataBlock
   * @generated
   */
  EClass getDataBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DataBlock#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DataBlock#getDataExpr()
   * @see #getDataBlock()
   * @generated
   */
  EReference getDataBlock_DataExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataCurrent <em>Data Current</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Current</em>'.
   * @see de.cau.cs.kieler.esterel.DataCurrent
   * @generated
   */
  EClass getDataCurrent();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.DataCurrent#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.DataCurrent#getSignal()
   * @see #getDataCurrent()
   * @generated
   */
  EReference getDataCurrent_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataCurrent#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.DataCurrent#getTick()
   * @see #getDataCurrent()
   * @generated
   */
  EAttribute getDataCurrent_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataPre <em>Data Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Pre</em>'.
   * @see de.cau.cs.kieler.esterel.DataPre
   * @generated
   */
  EClass getDataPre();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.DataPre#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.DataPre#getSignal()
   * @see #getDataPre()
   * @generated
   */
  EReference getDataPre_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DataPre#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.DataPre#getTick()
   * @see #getDataPre()
   * @generated
   */
  EAttribute getDataPre_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataTrap <em>Data Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Trap</em>'.
   * @see de.cau.cs.kieler.esterel.DataTrap
   * @generated
   */
  EClass getDataTrap();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.DataTrap#getTrap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.DataTrap#getTrap()
   * @see #getDataTrap()
   * @generated
   */
  EReference getDataTrap_Trap();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DataFunction <em>Data Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Function</em>'.
   * @see de.cau.cs.kieler.esterel.DataFunction
   * @generated
   */
  EClass getDataFunction();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.DataFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see de.cau.cs.kieler.esterel.DataFunction#getFunction()
   * @see #getDataFunction()
   * @generated
   */
  EReference getDataFunction_Function();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.DataFunction#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DataFunction#getDataExpr()
   * @see #getDataFunction()
   * @generated
   */
  EReference getDataFunction_DataExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapExpr <em>Trap Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Expr</em>'.
   * @see de.cau.cs.kieler.esterel.TrapExpr
   * @generated
   */
  EClass getTrapExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SigExpr <em>Sig Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Expr</em>'.
   * @see de.cau.cs.kieler.esterel.SigExpr
   * @generated
   */
  EClass getSigExpr();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.SigExpr#getAndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And Expr</em>'.
   * @see de.cau.cs.kieler.esterel.SigExpr#getAndExpr()
   * @see #getSigExpr()
   * @generated
   */
  EReference getSigExpr_AndExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SigExprAND <em>Sig Expr AND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Expr AND</em>'.
   * @see de.cau.cs.kieler.esterel.SigExprAND
   * @generated
   */
  EClass getSigExprAND();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.SigExprAND#getUnaExpr <em>Una Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Una Expr</em>'.
   * @see de.cau.cs.kieler.esterel.SigExprAND#getUnaExpr()
   * @see #getSigExprAND()
   * @generated
   */
  EReference getSigExprAND_UnaExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SigExprUnary <em>Sig Expr Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Expr Unary</em>'.
   * @see de.cau.cs.kieler.esterel.SigExprUnary
   * @generated
   */
  EClass getSigExprUnary();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.SigExprUnary#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.SigExprUnary#getExpr()
   * @see #getSigExprUnary()
   * @generated
   */
  EAttribute getSigExprUnary_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.SigExprUnary#getSigExpr <em>Sig Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sig Expr</em>'.
   * @see de.cau.cs.kieler.esterel.SigExprUnary#getSigExpr()
   * @see #getSigExprUnary()
   * @generated
   */
  EReference getSigExprUnary_SigExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DelayExpr <em>Delay Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DelayExpr
   * @generated
   */
  EClass getDelayExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DelayExpr#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.cau.cs.kieler.esterel.DelayExpr#getStatement()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Statement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DelayExpr#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see de.cau.cs.kieler.esterel.DelayExpr#getEnd()
   * @see #getDelayExpr()
   * @generated
   */
  EAttribute getDelayExpr_End();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DelayExpr#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see de.cau.cs.kieler.esterel.DelayExpr#getEvent()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Event();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DelayExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.DelayExpr#getExpr()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DelayEvent <em>Delay Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Event</em>'.
   * @see de.cau.cs.kieler.esterel.DelayEvent
   * @generated
   */
  EClass getDelayEvent();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.DelayEvent#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.DelayEvent#getSignal()
   * @see #getDelayEvent()
   * @generated
   */
  EReference getDelayEvent_Signal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DelayEvent#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.DelayEvent#getTick()
   * @see #getDelayEvent()
   * @generated
   */
  EAttribute getDelayEvent_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ChannelDescription <em>Channel Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel Description</em>'.
   * @see de.cau.cs.kieler.esterel.ChannelDescription
   * @generated
   */
  EClass getChannelDescription();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ChannelDescription#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.ChannelDescription#getType()
   * @see #getChannelDescription()
   * @generated
   */
  EAttribute getChannelDescription_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ChannelDescription#getDataExpr <em>Data Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Expr</em>'.
   * @see de.cau.cs.kieler.esterel.ChannelDescription#getDataExpr()
   * @see #getChannelDescription()
   * @generated
   */
  EReference getChannelDescription_DataExpr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Signal#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Channel</em>'.
   * @see de.cau.cs.kieler.esterel.Signal#getChannel()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_Channel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see de.cau.cs.kieler.esterel.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Sensor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.Sensor#getName()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Sensor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.Sensor#getType()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see de.cau.cs.kieler.esterel.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see de.cau.cs.kieler.esterel.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.InputOutput <em>Input Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Output</em>'.
   * @see de.cau.cs.kieler.esterel.InputOutput
   * @generated
   */
  EClass getInputOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see de.cau.cs.kieler.esterel.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see de.cau.cs.kieler.esterel.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Relation#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation</em>'.
   * @see de.cau.cs.kieler.esterel.Relation#getRelation()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Relation();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.esterel.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Parallel#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.esterel.Parallel#getLeft()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Parallel#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.kieler.esterel.Parallel#getRight()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see de.cau.cs.kieler.esterel.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Sequence#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.esterel.Sequence#getLeft()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Sequence#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.kieler.esterel.Sequence#getRight()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LocalSignal <em>Local Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignal
   * @generated
   */
  EClass getLocalSignal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.LocalSignal#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.LocalSignal#getSignal()
   * @see #getLocalSignal()
   * @generated
   */
  EReference getLocalSignal_Signal();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProgramImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MODULE = eINSTANCE.getProgram_Module();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ModuleImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModule()
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
     * The meta object literal for the '<em><b>Mod Int</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MOD_INT = eINSTANCE.getModule_ModInt();

    /**
     * The meta object literal for the '<em><b>Mod Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MOD_BODY = eINSTANCE.getModule_ModBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ModuleBodyImpl <em>Module Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ModuleBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleBody()
     * @generated
     */
    EClass MODULE_BODY = eINSTANCE.getModuleBody();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_BODY__STATEMENT = eINSTANCE.getModuleBody_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl <em>Module Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleInterface()
     * @generated
     */
    EClass MODULE_INTERFACE = eINSTANCE.getModuleInterface();

    /**
     * The meta object literal for the '<em><b>Int Signal Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_SIGNAL_DECL = eINSTANCE.getModuleInterface_IntSignalDecl();

    /**
     * The meta object literal for the '<em><b>Int Type Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_TYPE_DECL = eINSTANCE.getModuleInterface_IntTypeDecl();

    /**
     * The meta object literal for the '<em><b>Int Sensor Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_SENSOR_DECL = eINSTANCE.getModuleInterface_IntSensorDecl();

    /**
     * The meta object literal for the '<em><b>Int Constant Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_CONSTANT_DECL = eINSTANCE.getModuleInterface_IntConstantDecl();

    /**
     * The meta object literal for the '<em><b>Int Relation Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_RELATION_DECL = eINSTANCE.getModuleInterface_IntRelationDecl();

    /**
     * The meta object literal for the '<em><b>Int Function Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_FUNCTION_DECL = eINSTANCE.getModuleInterface_IntFunctionDecl();

    /**
     * The meta object literal for the '<em><b>Int Procedure Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_INTERFACE__INT_PROCEDURE_DECL = eINSTANCE.getModuleInterface_IntProcedureDecl();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalDeclImpl <em>Signal Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalDecl()
     * @generated
     */
    EClass SIGNAL_DECL = eINSTANCE.getSignalDecl();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_DECL__SIGNAL = eINSTANCE.getSignalDecl_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SensorDeclImpl <em>Sensor Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SensorDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensorDecl()
     * @generated
     */
    EClass SENSOR_DECL = eINSTANCE.getSensorDecl();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_DECL__SENSOR = eINSTANCE.getSensorDecl_Sensor();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationDeclImpl <em>Relation Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationDecl()
     * @generated
     */
    EClass RELATION_DECL = eINSTANCE.getRelationDecl();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationTypeImpl <em>Relation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationTypeImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationType()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationImplicationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationImplication()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeDeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDecl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getTypeDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__TYPE = eINSTANCE.getTypeDecl_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getType()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantDecl()
     * @generated
     */
    EClass CONSTANT_DECL = eINSTANCE.getConstantDecl();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECL__CONSTANT = eINSTANCE.getConstantDecl_Constant();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.OneTypeConstantDeclImpl <em>One Type Constant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.OneTypeConstantDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOneTypeConstantDecl()
     * @generated
     */
    EClass ONE_TYPE_CONSTANT_DECL = eINSTANCE.getOneTypeConstantDecl();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TYPE_CONSTANT_DECL__CONSTANT = eINSTANCE.getOneTypeConstantDecl_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TYPE_CONSTANT_DECL__TYPE = eINSTANCE.getOneTypeConstantDecl_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionDecl()
     * @generated
     */
    EClass FUNCTION_DECL = eINSTANCE.getFunctionDecl();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__FUNCTION = eINSTANCE.getFunctionDecl_Function();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunction()
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
     * The meta object literal for the '<em><b>Id List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ID_LIST = eINSTANCE.getFunction_IdList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureDeclImpl <em>Procedure Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureDecl()
     * @generated
     */
    EClass PROCEDURE_DECL = eINSTANCE.getProcedureDecl();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECL__PROCEDURE = eINSTANCE.getProcedureDecl_Procedure();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedure()
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
     * The meta object literal for the '<em><b>Id List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__ID_LIST = eINSTANCE.getProcedure_IdList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.StatementImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.BlockImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AssignmentImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXPR = eINSTANCE.getAssignment_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbort()
     * @generated
     */
    EClass ABORT = eINSTANCE.getAbort();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__STATEMENT = eINSTANCE.getAbort_Statement();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__BODY = eINSTANCE.getAbort_Body();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortBodyImpl <em>Abort Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortBody()
     * @generated
     */
    EClass ABORT_BODY = eINSTANCE.getAbortBody();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABORT_BODY__END = eINSTANCE.getAbortBody_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortInstanceImpl <em>Abort Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortInstanceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortInstance()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT_INSTANCE__STATEMENT = eINSTANCE.getAbortInstance_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortCaseImpl <em>Abort Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortCase()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortCaseSingleImpl <em>Abort Case Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortCaseSingleImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbortCaseSingle()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT_CASE_SINGLE__STATEMENT = eINSTANCE.getAbortCaseSingle_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AwaitImpl <em>Await</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AwaitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwait()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AwaitBodyImpl <em>Await Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AwaitBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitBody()
     * @generated
     */
    EClass AWAIT_BODY = eINSTANCE.getAwaitBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AwaitInstanceImpl <em>Await Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AwaitInstanceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitInstance()
     * @generated
     */
    EClass AWAIT_INSTANCE = eINSTANCE.getAwaitInstance();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AwaitCaseImpl <em>Await Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AwaitCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwaitCase()
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
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWAIT_CASE__END = eINSTANCE.getAwaitCase_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DoImpl <em>Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DoImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDo()
     * @generated
     */
    EClass DO = eINSTANCE.getDo();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__STATEMENT = eINSTANCE.getDo_Statement();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__END = eINSTANCE.getDo_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DoUptoImpl <em>Do Upto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DoUptoImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoUpto()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DoWatchingImpl <em>Do Watching</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DoWatchingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoWatching()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DoWatchingEndImpl <em>Do Watching End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DoWatchingEndImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDoWatchingEnd()
     * @generated
     */
    EClass DO_WATCHING_END = eINSTANCE.getDoWatchingEnd();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WATCHING_END__STATEMENT = eINSTANCE.getDoWatchingEnd_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EmitImpl <em>Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EmitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEmit()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EveryDoImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEveryDo()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVERY_DO__STATEMENT = eINSTANCE.getEveryDo_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ExitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExit()
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
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT__DATA_EXPR = eINSTANCE.getExit_DataExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.HaltImpl <em>Halt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.HaltImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getHalt()
     * @generated
     */
    EClass HALT = eINSTANCE.getHalt();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.IfTestImpl <em>If Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.IfTestImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getIfTest()
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
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__THEN = eINSTANCE.getIfTest_Then();

    /**
     * The meta object literal for the '<em><b>Else If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSE_IF = eINSTANCE.getIfTest_ElseIf();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSE = eINSTANCE.getIfTest_Else();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfPartImpl <em>Els If Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ElsIfPartImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIfPart()
     * @generated
     */
    EClass ELS_IF_PART = eINSTANCE.getElsIfPart();

    /**
     * The meta object literal for the '<em><b>Elsif</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF_PART__ELSIF = eINSTANCE.getElsIfPart_Elsif();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ElsIfImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIf()
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
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__THEN = eINSTANCE.getElsIf_Then();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ThenPartImpl <em>Then Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ThenPartImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getThenPart()
     * @generated
     */
    EClass THEN_PART = eINSTANCE.getThenPart();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEN_PART__STATEMENT = eINSTANCE.getThenPart_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ElsePartImpl <em>Else Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ElsePartImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsePart()
     * @generated
     */
    EClass ELSE_PART = eINSTANCE.getElsePart();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_PART__STATEMENT = eINSTANCE.getElsePart_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LoopImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoop()
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
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__END = eINSTANCE.getLoop_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LoopEachImpl <em>Loop Each</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LoopEachImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopEach()
     * @generated
     */
    EClass LOOP_EACH = eINSTANCE.getLoopEach();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LoopDelayImpl <em>Loop Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LoopDelayImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopDelay()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LoopBodyImpl <em>Loop Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LoopBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoopBody()
     * @generated
     */
    EClass LOOP_BODY = eINSTANCE.getLoopBody();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_BODY__STATEMENT = eINSTANCE.getLoopBody_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.NothingImpl <em>Nothing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.NothingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getNothing()
     * @generated
     */
    EClass NOTHING = eINSTANCE.getNothing();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PauseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentImpl <em>Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresent()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentBodyImpl <em>Present Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentBody()
     * @generated
     */
    EClass PRESENT_BODY = eINSTANCE.getPresentBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentEventBodyImpl <em>Present Event Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentEventBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentEventBody()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseListImpl <em>Present Case List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentCaseListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCaseList()
     * @generated
     */
    EClass PRESENT_CASE_LIST = eINSTANCE.getPresentCaseList();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE_LIST__CASE = eINSTANCE.getPresentCaseList_Case();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCase()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE__STATEMENT = eINSTANCE.getPresentCase_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentEventImpl <em>Present Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentEventImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentEvent()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RepeatImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRepeat()
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
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__DATA_EXPR = eINSTANCE.getRepeat_DataExpr();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__STATEMENT = eINSTANCE.getRepeat_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RunImpl <em>Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RunImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRun()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleRenaming()
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
     * The meta object literal for the '<em><b>Renamed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_RENAMING__RENAMED = eINSTANCE.getModuleRenaming_Renamed();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_RENAMING__NEW_NAME = eINSTANCE.getModuleRenaming_NewName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RenamingListImpl <em>Renaming List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RenamingListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenamingList()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenaming()
     * @generated
     */
    EClass RENAMING = eINSTANCE.getRenaming();

    /**
     * The meta object literal for the '<em><b>Renaming</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENAMING__RENAMING = eINSTANCE.getRenaming_Renaming();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeRenaming()
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
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RENAMING__OLD_NAME = eINSTANCE.getTypeRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantRenaming()
     * @generated
     */
    EClass CONSTANT_RENAMING = eINSTANCE.getConstantRenaming();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_RENAMING__VALUE = eINSTANCE.getConstantRenaming_Value();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_RENAMING__NEW_NAME = eINSTANCE.getConstantRenaming_NewName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
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
     * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_RENAMING__OLD_NAME = eINSTANCE.getFunctionRenaming_OldName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalRenaming()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclImpl <em>Local Signal Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LocalSignalDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalDecl()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SIGNAL_DECL__STATEMENT = eINSTANCE.getLocalSignalDecl_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalListImpl <em>Local Signal List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LocalSignalListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalList()
     * @generated
     */
    EClass LOCAL_SIGNAL_LIST = eINSTANCE.getLocalSignalList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SuspendImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSuspend()
     * @generated
     */
    EClass SUSPEND = eINSTANCE.getSuspend();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND__STATEMENT = eINSTANCE.getSuspend_Statement();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND__DELAY = eINSTANCE.getSuspend_Delay();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SustainImpl <em>Sustain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SustainImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSustain()
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
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSTAIN__DATA_EXPR = eINSTANCE.getSustain_DataExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapImpl <em>Trap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrap()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__STATEMENT = eINSTANCE.getTrap_Statement();

    /**
     * The meta object literal for the '<em><b>Trap Handler List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__TRAP_HANDLER_LIST = eINSTANCE.getTrap_TrapHandlerList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapDeclListImpl <em>Trap Decl List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapDeclListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapDeclList()
     * @generated
     */
    EClass TRAP_DECL_LIST = eINSTANCE.getTrapDeclList();

    /**
     * The meta object literal for the '<em><b>Trap Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_DECL_LIST__TRAP_DECL = eINSTANCE.getTrapDeclList_TrapDecl();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapDeclImpl <em>Trap Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapDecl()
     * @generated
     */
    EClass TRAP_DECL = eINSTANCE.getTrapDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAP_DECL__NAME = eINSTANCE.getTrapDecl_Name();

    /**
     * The meta object literal for the '<em><b>Channel Desc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_DECL__CHANNEL_DESC = eINSTANCE.getTrapDecl_ChannelDesc();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerListImpl <em>Trap Handler List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapHandlerListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandlerList()
     * @generated
     */
    EClass TRAP_HANDLER_LIST = eINSTANCE.getTrapHandlerList();

    /**
     * The meta object literal for the '<em><b>Trap Handler</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_HANDLER_LIST__TRAP_HANDLER = eINSTANCE.getTrapHandlerList_TrapHandler();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapHandlerImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandler()
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
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP_HANDLER__STATEMENT = eINSTANCE.getTrapHandler_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.VariableImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VAR_DECL = eINSTANCE.getVariable_VarDecl();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__STATEMENT = eINSTANCE.getVariable_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.VariableDeclImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Var List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__VAR_LIST = eINSTANCE.getVariableDecl_VarList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__LEFT = eINSTANCE.getVariableDecl_Left();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.VariableListImpl <em>Variable List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.VariableListImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariableList()
     * @generated
     */
    EClass VARIABLE_LIST = eINSTANCE.getVariableList();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_LIST__VARIABLE = eINSTANCE.getVariableList_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_LIST__EXPRESSION = eINSTANCE.getVariableList_Expression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_LIST__LEFT = eINSTANCE.getVariableList_Left();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortImpl <em>Weak Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.WeakAbortImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbort()
     * @generated
     */
    EClass WEAK_ABORT = eINSTANCE.getWeakAbort();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT__STATEMENT = eINSTANCE.getWeakAbort_Statement();

    /**
     * The meta object literal for the '<em><b>Weak Abort Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT__WEAK_ABORT_BODY = eINSTANCE.getWeakAbort_WeakAbortBody();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortBodyImpl <em>Weak Abort Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.WeakAbortBodyImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortBody()
     * @generated
     */
    EClass WEAK_ABORT_BODY = eINSTANCE.getWeakAbortBody();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEAK_ABORT_BODY__END = eINSTANCE.getWeakAbortBody_End();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortInstanceImpl <em>Weak Abort Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.WeakAbortInstanceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortInstance()
     * @generated
     */
    EClass WEAK_ABORT_INSTANCE = eINSTANCE.getWeakAbortInstance();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_INSTANCE__DELAY = eINSTANCE.getWeakAbortInstance_Delay();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_INSTANCE__STATEMENT = eINSTANCE.getWeakAbortInstance_Statement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.WeakAbortCaseImpl <em>Weak Abort Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.WeakAbortCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getWeakAbortCase()
     * @generated
     */
    EClass WEAK_ABORT_CASE = eINSTANCE.getWeakAbortCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAK_ABORT_CASE__CASES = eINSTANCE.getWeakAbortCase_Cases();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataExprImpl <em>Data Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataExprImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataExpr()
     * @generated
     */
    EClass DATA_EXPR = eINSTANCE.getDataExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXPR__LEFT = eINSTANCE.getDataExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_EXPR__OP = eINSTANCE.getDataExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXPR__RIGHT = eINSTANCE.getDataExpr_Right();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXPR__EXPR = eINSTANCE.getDataExpr_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl <em>Data Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataUnaryExpr()
     * @generated
     */
    EClass DATA_UNARY_EXPR = eINSTANCE.getDataUnaryExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataValueIDImpl <em>Data Value ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataValueIDImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueID()
     * @generated
     */
    EClass DATA_VALUE_ID = eINSTANCE.getDataValueID();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VALUE_ID__VALUE = eINSTANCE.getDataValueID_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataValueFloatImpl <em>Data Value Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataValueFloatImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueFloat()
     * @generated
     */
    EClass DATA_VALUE_FLOAT = eINSTANCE.getDataValueFloat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VALUE_FLOAT__VALUE = eINSTANCE.getDataValueFloat_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataValueBooleanImpl <em>Data Value Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataValueBooleanImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueBoolean()
     * @generated
     */
    EClass DATA_VALUE_BOOLEAN = eINSTANCE.getDataValueBoolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VALUE_BOOLEAN__VALUE = eINSTANCE.getDataValueBoolean_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataValueIntImpl <em>Data Value Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataValueIntImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueInt()
     * @generated
     */
    EClass DATA_VALUE_INT = eINSTANCE.getDataValueInt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VALUE_INT__VALUE = eINSTANCE.getDataValueInt_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataValueStringImpl <em>Data Value String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataValueStringImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataValueString()
     * @generated
     */
    EClass DATA_VALUE_STRING = eINSTANCE.getDataValueString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VALUE_STRING__VALUE = eINSTANCE.getDataValueString_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataBlockImpl <em>Data Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataBlockImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataBlock()
     * @generated
     */
    EClass DATA_BLOCK = eINSTANCE.getDataBlock();

    /**
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_BLOCK__DATA_EXPR = eINSTANCE.getDataBlock_DataExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataCurrentImpl <em>Data Current</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataCurrentImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataCurrent()
     * @generated
     */
    EClass DATA_CURRENT = eINSTANCE.getDataCurrent();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CURRENT__SIGNAL = eINSTANCE.getDataCurrent_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_CURRENT__TICK = eINSTANCE.getDataCurrent_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataPreImpl <em>Data Pre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataPreImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataPre()
     * @generated
     */
    EClass DATA_PRE = eINSTANCE.getDataPre();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PRE__SIGNAL = eINSTANCE.getDataPre_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_PRE__TICK = eINSTANCE.getDataPre_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataTrapImpl <em>Data Trap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataTrapImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataTrap()
     * @generated
     */
    EClass DATA_TRAP = eINSTANCE.getDataTrap();

    /**
     * The meta object literal for the '<em><b>Trap</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TRAP__TRAP = eINSTANCE.getDataTrap_Trap();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DataFunctionImpl <em>Data Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DataFunctionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDataFunction()
     * @generated
     */
    EClass DATA_FUNCTION = eINSTANCE.getDataFunction();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_FUNCTION__FUNCTION = eINSTANCE.getDataFunction_Function();

    /**
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_FUNCTION__DATA_EXPR = eINSTANCE.getDataFunction_DataExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapExprImpl <em>Trap Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapExprImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapExpr()
     * @generated
     */
    EClass TRAP_EXPR = eINSTANCE.getTrapExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SigExprImpl <em>Sig Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SigExprImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExpr()
     * @generated
     */
    EClass SIG_EXPR = eINSTANCE.getSigExpr();

    /**
     * The meta object literal for the '<em><b>And Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_EXPR__AND_EXPR = eINSTANCE.getSigExpr_AndExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SigExprANDImpl <em>Sig Expr AND</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SigExprANDImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExprAND()
     * @generated
     */
    EClass SIG_EXPR_AND = eINSTANCE.getSigExprAND();

    /**
     * The meta object literal for the '<em><b>Una Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_EXPR_AND__UNA_EXPR = eINSTANCE.getSigExprAND_UnaExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl <em>Sig Expr Unary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSigExprUnary()
     * @generated
     */
    EClass SIG_EXPR_UNARY = eINSTANCE.getSigExprUnary();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_EXPR_UNARY__EXPR = eINSTANCE.getSigExprUnary_Expr();

    /**
     * The meta object literal for the '<em><b>Sig Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_EXPR_UNARY__SIG_EXPR = eINSTANCE.getSigExprUnary_SigExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DelayExprImpl <em>Delay Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DelayExprImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayExpr()
     * @generated
     */
    EClass DELAY_EXPR = eINSTANCE.getDelayExpr();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__STATEMENT = eINSTANCE.getDelayExpr_Statement();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EXPR__END = eINSTANCE.getDelayExpr_End();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__EVENT = eINSTANCE.getDelayExpr_Event();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__EXPR = eINSTANCE.getDelayExpr_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DelayEventImpl <em>Delay Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DelayEventImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayEvent()
     * @generated
     */
    EClass DELAY_EVENT = eINSTANCE.getDelayEvent();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EVENT__SIGNAL = eINSTANCE.getDelayEvent_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EVENT__TICK = eINSTANCE.getDelayEvent_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ChannelDescriptionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getChannelDescription()
     * @generated
     */
    EClass CHANNEL_DESCRIPTION = eINSTANCE.getChannelDescription();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL_DESCRIPTION__TYPE = eINSTANCE.getChannelDescription_Type();

    /**
     * The meta object literal for the '<em><b>Data Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANNEL_DESCRIPTION__DATA_EXPR = eINSTANCE.getChannelDescription_DataExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__CHANNEL = eINSTANCE.getSignal_Channel();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SensorImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.InputImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.OutputImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.InputOutputImpl <em>Input Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.InputOutputImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputOutput()
     * @generated
     */
    EClass INPUT_OUTPUT = eINSTANCE.getInputOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ReturnImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RELATION = eINSTANCE.getRelation_Relation();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ParallelImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__LEFT = eINSTANCE.getParallel_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__RIGHT = eINSTANCE.getParallel_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SequenceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__LEFT = eINSTANCE.getSequence_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__RIGHT = eINSTANCE.getSequence_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalImpl <em>Local Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LocalSignalImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignal()
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

  }

} //EsterelPackage
