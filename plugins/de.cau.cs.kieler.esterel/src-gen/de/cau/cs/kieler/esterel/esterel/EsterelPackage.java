/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.scl.scl.SclPackage;

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
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_SIGNAL_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Int Type Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_TYPE_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_SENSOR_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_CONSTANT_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_RELATION_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Int Task Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_TASK_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Int Function Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_FUNCTION_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INT_PROCEDURE_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeIdentifierImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeIdentifier()
   * @generated
   */
  int TYPE_IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__TYPE_ID = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER__OPERATOR = 2;

  /**
   * The number of structural features of the '<em>Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_IDENTIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TYPES = 1;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

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
  int CONSTANT_DECLS = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLS__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLS__CONSTANTS = 1;

  /**
   * The number of structural features of the '<em>Constant Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl <em>One Type Constant Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.OneTypeConstantDeclsImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOneTypeConstantDecls()
   * @generated
   */
  int ONE_TYPE_CONSTANT_DECLS = 6;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValuedObject()
   * @generated
   */
  int VALUED_OBJECT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__NAME = 0;

  /**
   * The number of structural features of the '<em>Valued Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionDecl()
   * @generated
   */
  int FUNCTION_DECL = 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__FUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>Function Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 9;

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
  int PROCEDURE_DECL = 10;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL__PROCEDURES = 1;

  /**
   * The number of structural features of the '<em>Procedure Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcedureImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__EXPRESSIONS = 2;

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
  int TASK_DECL = 12;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECL__TASKS = 1;

  /**
   * The number of structural features of the '<em>Task Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TaskImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTask()
   * @generated
   */
  int TASK = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__EXPRESSIONS = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InterfaceSignalDeclImpl <em>Interface Signal Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.InterfaceSignalDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInterfaceSignalDecl()
   * @generated
   */
  int INTERFACE_SIGNAL_DECL = 14;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SIGNAL_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SIGNAL_DECL__SIGNALS = 1;

  /**
   * The number of structural features of the '<em>Interface Signal Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SIGNAL_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl <em>ISignal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getISignal()
   * @generated
   */
  int ISIGNAL = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__TYPE_ID = 2;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__FUNC = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__OPERATOR = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL__EXPRESSION = 5;

  /**
   * The number of structural features of the '<em>ISignal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISIGNAL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl <em>Sensor Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SensorDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorDecl()
   * @generated
   */
  int SENSOR_DECL = 16;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL__SENSORS = 1;

  /**
   * The number of structural features of the '<em>Sensor Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl <em>Sensor With Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SensorWithTypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSensorWithType()
   * @generated
   */
  int SENSOR_WITH_TYPE = 17;

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
  int RELATION_DECL = 18;

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
  int RELATION_TYPE = 19;

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
  int RELATION_IMPLICATION = 20;

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
  int RELATION_INCOMPATIBILITY = 21;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelParallelImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelParallel()
   * @generated
   */
  int ESTEREL_PARALLEL = 22;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_PARALLEL__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Threads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_PARALLEL__THREADS = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_PARALLEL_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelThreadImpl <em>Thread</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelThreadImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelThread()
   * @generated
   */
  int ESTEREL_THREAD = 23;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_THREAD__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_THREAD__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The number of structural features of the '<em>Thread</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_THREAD_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.NothingImpl <em>Nothing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.NothingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getNothing()
   * @generated
   */
  int NOTHING = 24;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTHING__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Nothing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTHING_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.HaltImpl <em>Halt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.HaltImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getHalt()
   * @generated
   */
  int HALT = 25;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Halt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.BlockImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 26;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EmitImpl <em>Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EmitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEmit()
   * @generated
   */
  int EMIT = 27;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__SIGNAL = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__TICK = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__EXPR = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Emit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SustainImpl <em>Sustain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SustainImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSustain()
   * @generated
   */
  int SUSTAIN = 28;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__SIGNAL = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__TICK = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN__EXPRESSION = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sustain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSTAIN_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelAssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelAssignmentImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelAssignment()
   * @generated
   */
  int ESTEREL_ASSIGNMENT = 29;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_ASSIGNMENT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_ASSIGNMENT__VAR = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_ASSIGNMENT__EXPR = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_ASSIGNMENT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl <em>Proc Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getProcCall()
   * @generated
   */
  int PROC_CALL = 30;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__PROC = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__VAR_LIST = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL__KEXPRESSIONS = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Proc Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_CALL_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl <em>Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresent()
   * @generated
   */
  int PRESENT = 31;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__EXPRESSION = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__TICK = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__THEN_ANNOTATIONS = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Then Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__THEN_STATEMENTS = SclPackage.STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__CASES = SclPackage.STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Else Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__ELSE_ANNOTATIONS = SclPackage.STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__ELSE_STATEMENTS = SclPackage.STATEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.PresentCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresentCase()
   * @generated
   */
  int PRESENT_CASE = 32;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__EXPRESSION = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE__TICK = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Present Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_CASE_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl <em>If Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIfTest()
   * @generated
   */
  int IF_TEST = 33;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__EXPR = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__THEN_ANNOTATIONS = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__THEN_STATEMENTS = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSEIF = SclPackage.STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Else Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSE_ANNOTATIONS = SclPackage.STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST__ELSE_STATEMENTS = SclPackage.STATEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>If Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_TEST_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ElsIfImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getElsIf()
   * @generated
   */
  int ELS_IF = 34;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__EXPR = 1;

  /**
   * The feature id for the '<em><b>Then Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__THEN_ANNOTATIONS = 2;

  /**
   * The feature id for the '<em><b>Then Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF__THEN_STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Els If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELS_IF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LoopImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 35;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRepeat()
   * @generated
   */
  int REPEAT = 36;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Positive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__POSITIVE = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__EXPRESSION = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl <em>Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AbortImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbort()
   * @generated
   */
  int ABORT = 37;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Weak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__WEAK = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Do Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__DO_STATEMENTS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__CASES = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.CaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getCase()
   * @generated
   */
  int CASE = 38;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl <em>Await</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.AwaitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAwait()
   * @generated
   */
  int AWAIT = 39;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__CASES = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Await</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EveryDoImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEveryDo()
   * @generated
   */
  int EVERY_DO = 40;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Every Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVERY_DO_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSuspend()
   * @generated
   */
  int SUSPEND = 41;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Weak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__WEAK = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Suspend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapImpl <em>Trap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrap()
   * @generated
   */
  int TRAP = 42;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Trap Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_SIGNALS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trap Handler</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP__TRAP_HANDLER = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapHandler()
   * @generated
   */
  int TRAP_HANDLER = 43;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Trap Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER__TRAP_EXPR = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trap Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_HANDLER_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExitImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExit()
   * @generated
   */
  int EXIT = 44;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__TRAP = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__EXPRESSION = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl <em>Exec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExecImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExec()
   * @generated
   */
  int EXEC = 45;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__TASK = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__VARS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__KEXPRESSIONS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ret Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__RET_SIGNAL = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exec Case List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__EXEC_CASE_LIST = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Exec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl <em>Exec Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExecCase()
   * @generated
   */
  int EXEC_CASE = 46;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__TASK = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__VARS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__KEXPRESSIONS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ret Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE__RET_SIGNAL = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Exec Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_CASE_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl <em>Local Signal Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalSignalDecl()
   * @generated
   */
  int LOCAL_SIGNAL_DECL = 47;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL__SIGNALS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Signal Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SIGNAL_DECL_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.LocalVariableImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 48;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Var Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__VAR_DECLS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.VariableDeclImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 49;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__TYPE = 1;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IVariableImpl <em>IVariable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.IVariableImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIVariable()
   * @generated
   */
  int IVARIABLE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>IVariable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RunImpl <em>Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RunImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRun()
   * @generated
   */
  int RUN = 51;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__MODULE = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__LIST = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ModuleRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getModuleRenaming()
   * @generated
   */
  int MODULE_RENAMING = 52;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 53;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__RENAMINGS = 1;

  /**
   * The number of structural features of the '<em>Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TypeRenamingImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTypeRenaming()
   * @generated
   */
  int TYPE_RENAMING = 54;

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
  int CONSTANT_RENAMING = 55;

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
  int FUNCTION_RENAMING = 56;

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
  int PROCEDURE_RENAMING = 57;

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
  int TASK_RENAMING = 58;

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
  int SIGNAL_RENAMING = 59;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl <em>Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DoImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDo()
   * @generated
   */
  int DO = 60;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__ANNOTATIONS = SclPackage.STATEMENT_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__STATEMENTS = SclPackage.STATEMENT_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Ending Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__ENDING_ANNOTATIONS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__EXPR = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__DELAY = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Watching Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO__WATCHING_STATEMENTS = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_FEATURE_COUNT = SclPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 61;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectReferenceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValuedObjectReference()
   * @generated
   */
  int VALUED_OBJECT_REFERENCE = 62;

  /**
   * The feature id for the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_REFERENCE__VALUED_OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Valued Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl <em>Delay Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDelayExpr()
   * @generated
   */
  int DELAY_EXPR = 63;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__EXPR = 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__TICK = 1;

  /**
   * The feature id for the '<em><b>Signal Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__SIGNAL_EXPR = 2;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR__IS_IMMEDIATE = 3;

  /**
   * The number of structural features of the '<em>Delay Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_EXPR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TextExpressionImpl <em>Text Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TextExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTextExpression()
   * @generated
   */
  int TEXT_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXPRESSION__TEXT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXPRESSION__CODE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Text Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.IntValueImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 65;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FloatValueImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 66;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.BooleanValueImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 67;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelTypeImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelType()
   * @generated
   */
  int ESTEREL_TYPE = 68;

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
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.InputImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInput()
   * @generated
   */
  int INPUT = 70;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ANNOTATIONS = INTERFACE_SIGNAL_DECL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.OutputImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 71;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__ANNOTATIONS = INTERFACE_SIGNAL_DECL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InputOutputImpl <em>Input Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.InputOutputImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInputOutput()
   * @generated
   */
  int INPUT_OUTPUT = 72;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OUTPUT__ANNOTATIONS = INTERFACE_SIGNAL_DECL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OUTPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

  /**
   * The number of structural features of the '<em>Input Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OUTPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ReturnImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 73;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__ANNOTATIONS = INTERFACE_SIGNAL_DECL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.RelationImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 74;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ANNOTATIONS = RELATION_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATIONS = RELATION_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = RELATION_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapSignalImpl <em>Trap Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapSignalImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapSignal()
   * @generated
   */
  int TRAP_SIGNAL = 75;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__NAME = ISIGNAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__TYPE = ISIGNAL__TYPE;

  /**
   * The feature id for the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__TYPE_ID = ISIGNAL__TYPE_ID;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__FUNC = ISIGNAL__FUNC;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__OPERATOR = ISIGNAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL__EXPRESSION = ISIGNAL__EXPRESSION;

  /**
   * The number of structural features of the '<em>Trap Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_SIGNAL_FEATURE_COUNT = ISIGNAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl <em>Trap Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapExpression()
   * @generated
   */
  int TRAP_EXPRESSION = 76;

  /**
   * The feature id for the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_EXPRESSION__TRAP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trap Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 77;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kexpressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__KEXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstantExpression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 78;

  /**
   * The feature id for the '<em><b>Constant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__CONSTANT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.OperatorExpressionImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOperatorExpression()
   * @generated
   */
  int OPERATOR_EXPRESSION = 79;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl <em>Trap Reference Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapReferenceExpr()
   * @generated
   */
  int TRAP_REFERENCE_EXPR = 80;

  /**
   * The feature id for the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_REFERENCE_EXPR__VALUED_OBJECT = VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

  /**
   * The number of structural features of the '<em>Trap Reference Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAP_REFERENCE_EXPR_FEATURE_COUNT = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.impl.Esterel_ValuedObjectReferenceImpl <em>Esterel Valued Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.impl.Esterel_ValuedObjectReferenceImpl
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterel_ValuedObjectReference()
   * @generated
   */
  int ESTEREL_VALUED_OBJECT_REFERENCE = 81;

  /**
   * The feature id for the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_VALUED_OBJECT_REFERENCE__VALUED_OBJECT = VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

  /**
   * The number of structural features of the '<em>Esterel Valued Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTEREL_VALUED_OBJECT_REFERENCE_FEATURE_COUNT = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.OperatorType <em>Operator Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.OperatorType
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOperatorType()
   * @generated
   */
  int OPERATOR_TYPE = 82;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.ValueType <em>Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.ValueType
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 83;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.esterel.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.esterel.CombineOperator
   * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 84;


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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntSignalDecls <em>Int Signal Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Signal Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntSignalDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntSignalDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntTypeDecls <em>Int Type Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Type Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntTypeDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntTypeDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntSensorDecls <em>Int Sensor Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Sensor Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntSensorDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntSensorDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntConstantDecls <em>Int Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Constant Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntConstantDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntConstantDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntRelationDecls <em>Int Relation Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Relation Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntRelationDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntRelationDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntTaskDecls <em>Int Task Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Task Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntTaskDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntTaskDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntFunctionDecls <em>Int Function Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Function Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntFunctionDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntFunctionDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Module#getIntProcedureDecls <em>Int Procedure Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Procedure Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Module#getIntProcedureDecls()
   * @see #getModule()
   * @generated
   */
  EReference getModule_IntProcedureDecls();

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
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getType()
   * @see #getTypeIdentifier()
   * @generated
   */
  EAttribute getTypeIdentifier_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getTypeID <em>Type ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type ID</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getTypeID()
   * @see #getTypeIdentifier()
   * @generated
   */
  EAttribute getTypeIdentifier_TypeID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeIdentifier#getOperator()
   * @see #getTypeIdentifier()
   * @generated
   */
  EAttribute getTypeIdentifier_Operator();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.TypeDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TypeDecl#getAnnotations()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Annotations();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ConstantDecls#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ConstantDecls#getAnnotations()
   * @see #getConstantDecls()
   * @generated
   */
  EReference getConstantDecls_Annotations();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valued Object</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ValuedObject
   * @generated
   */
  EClass getValuedObject();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ValuedObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ValuedObject#getName()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Name();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.FunctionDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FunctionDecl#getAnnotations()
   * @see #getFunctionDecl()
   * @generated
   */
  EReference getFunctionDecl_Annotations();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ProcedureDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ProcedureDecl#getAnnotations()
   * @see #getProcedureDecl()
   * @generated
   */
  EReference getProcedureDecl_Annotations();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure#getVariables()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Procedure#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Procedure#getExpressions()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Expressions();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.TaskDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TaskDecl#getAnnotations()
   * @see #getTaskDecl()
   * @generated
   */
  EReference getTaskDecl_Annotations();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Task#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task#getVariables()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Task#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Task#getExpressions()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Expressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl <em>Interface Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl
   * @generated
   */
  EClass getInterfaceSignalDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getAnnotations()
   * @see #getInterfaceSignalDecl()
   * @generated
   */
  EReference getInterfaceSignalDecl_Annotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getSignals()
   * @see #getInterfaceSignalDecl()
   * @generated
   */
  EReference getInterfaceSignalDecl_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ISignal <em>ISignal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISignal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal
   * @generated
   */
  EClass getISignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getName()
   * @see #getISignal()
   * @generated
   */
  EAttribute getISignal_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getType()
   * @see #getISignal()
   * @generated
   */
  EAttribute getISignal_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getTypeID <em>Type ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type ID</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getTypeID()
   * @see #getISignal()
   * @generated
   */
  EAttribute getISignal_TypeID();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Func</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getFunc()
   * @see #getISignal()
   * @generated
   */
  EReference getISignal_Func();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getOperator()
   * @see #getISignal()
   * @generated
   */
  EAttribute getISignal_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ISignal#getExpression()
   * @see #getISignal()
   * @generated
   */
  EReference getISignal_Expression();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.SensorDecl#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.SensorDecl#getAnnotations()
   * @see #getSensorDecl()
   * @generated
   */
  EReference getSensorDecl_Annotations();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EsterelParallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelParallel
   * @generated
   */
  EClass getEsterelParallel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.EsterelParallel#getThreads <em>Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Threads</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelParallel#getThreads()
   * @see #getEsterelParallel()
   * @generated
   */
  EReference getEsterelParallel_Threads();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EsterelThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thread</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelThread
   * @generated
   */
  EClass getEsterelThread();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Halt <em>Halt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Halt</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Halt
   * @generated
   */
  EClass getHalt();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Emit#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Emit#getTick()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Tick();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Sustain#getTick()
   * @see #getSustain()
   * @generated
   */
  EReference getSustain_Tick();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.EsterelAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelAssignment
   * @generated
   */
  EClass getEsterelAssignment();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.EsterelAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelAssignment#getVar()
   * @see #getEsterelAssignment()
   * @generated
   */
  EReference getEsterelAssignment_Var();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.EsterelAssignment#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelAssignment#getExpr()
   * @see #getEsterelAssignment()
   * @generated
   */
  EReference getEsterelAssignment_Expr();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Present <em>Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present
   * @generated
   */
  EClass getPresent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Present#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getExpression()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Present#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getTick()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Tick();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Present#getThenAnnotations <em>Then Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getThenAnnotations()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ThenAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Present#getThenStatements <em>Then Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getThenStatements()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ThenStatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Present#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getCases()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Cases();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Present#getElseAnnotations <em>Else Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getElseAnnotations()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ElseAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Present#getElseStatements <em>Else Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Present#getElseStatements()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_ElseStatements();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCase#getExpression()
   * @see #getPresentCase()
   * @generated
   */
  EReference getPresentCase_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.PresentCase#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.PresentCase#getTick()
   * @see #getPresentCase()
   * @generated
   */
  EReference getPresentCase_Tick();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenAnnotations <em>Then Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getThenAnnotations()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ThenAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenStatements <em>Then Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getThenStatements()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ThenStatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseif <em>Elseif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseif</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getElseif()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_Elseif();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseAnnotations <em>Else Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getElseAnnotations()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ElseAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseStatements <em>Else Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IfTest#getElseStatements()
   * @see #getIfTest()
   * @generated
   */
  EReference getIfTest_ElseStatements();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf#getAnnotations()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_Annotations();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getThenAnnotations <em>Then Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf#getThenAnnotations()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_ThenAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getThenStatements <em>Then Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ElsIf#getThenStatements()
   * @see #getElsIf()
   * @generated
   */
  EReference getElsIf_ThenStatements();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Loop#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Loop#getDelay()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Delay();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort
   * @generated
   */
  EClass getAbort();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Abort#isWeak <em>Weak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weak</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort#isWeak()
   * @see #getAbort()
   * @generated
   */
  EAttribute getAbort_Weak();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Abort#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort#getDelay()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_Delay();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Abort#getDoStatements <em>Do Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Do Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort#getDoStatements()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_DoStatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Abort#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Abort#getCases()
   * @see #getAbort()
   * @generated
   */
  EReference getAbort_Cases();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Case#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Case#getDelay()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Delay();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Await#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Await#getDelay()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Delay();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Await#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Await#getCases()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Cases();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Suspend <em>Suspend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Suspend
   * @generated
   */
  EClass getSuspend();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Suspend#isWeak <em>Weak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weak</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Suspend#isWeak()
   * @see #getSuspend()
   * @generated
   */
  EAttribute getSuspend_Weak();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Trap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap
   * @generated
   */
  EClass getTrap();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapSignals <em>Trap Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trap Signals</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Trap#getTrapSignals()
   * @see #getTrap()
   * @generated
   */
  EReference getTrap_TrapSignals();

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
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.esterel.Exec#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getVars()
   * @see #getExec()
   * @generated
   */
  EReference getExec_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Exec#getKexpressions <em>Kexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kexpressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Exec#getKexpressions()
   * @see #getExec()
   * @generated
   */
  EReference getExec_Kexpressions();

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
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase#getVars()
   * @see #getExecCase()
   * @generated
   */
  EReference getExecCase_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getKexpressions <em>Kexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kexpressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ExecCase#getKexpressions()
   * @see #getExecCase()
   * @generated
   */
  EReference getExecCase_Kexpressions();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalDecl <em>Local Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Signal Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
   * @generated
   */
  EClass getLocalSignalDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalSignalDecl#getSignals()
   * @see #getLocalSignalDecl()
   * @generated
   */
  EReference getLocalSignalDecl_Signals();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.LocalVariable#getVarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Decls</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.LocalVariable#getVarDecls()
   * @see #getLocalVariable()
   * @generated
   */
  EReference getLocalVariable_VarDecls();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.VariableDecl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.VariableDecl#getVariables()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.VariableDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.VariableDecl#getType()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.IVariable <em>IVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVariable</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IVariable
   * @generated
   */
  EClass getIVariable();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.IVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IVariable#getName()
   * @see #getIVariable()
   * @generated
   */
  EAttribute getIVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.IVariable#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IVariable#getExpression()
   * @see #getIVariable()
   * @generated
   */
  EReference getIVariable_Expression();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Run#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Renaming#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Renaming#getAnnotations()
   * @see #getRenaming()
   * @generated
   */
  EReference getRenaming_Annotations();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Do <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do
   * @generated
   */
  EClass getDo();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Do#getEndingAnnotations <em>Ending Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ending Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do#getEndingAnnotations()
   * @see #getDo()
   * @generated
   */
  EReference getDo_EndingAnnotations();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Do#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do#getExpr()
   * @see #getDo()
   * @generated
   */
  EReference getDo_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.Do#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do#getDelay()
   * @see #getDo()
   * @generated
   */
  EReference getDo_Delay();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Do#getWatchingStatements <em>Watching Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Watching Statements</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Do#getWatchingStatements()
   * @see #getDo()
   * @generated
   */
  EReference getDo_WatchingStatements();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.ValuedObjectReference <em>Valued Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valued Object Reference</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ValuedObjectReference
   * @generated
   */
  EClass getValuedObjectReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.esterel.ValuedObjectReference#getValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Valued Object</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ValuedObjectReference#getValuedObject()
   * @see #getValuedObjectReference()
   * @generated
   */
  EReference getValuedObjectReference_ValuedObject();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr#getTick()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.esterel.DelayExpr#getSignalExpr <em>Signal Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal Expr</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.DelayExpr#getSignalExpr()
   * @see #getDelayExpr()
   * @generated
   */
  EReference getDelayExpr_SignalExpr();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TextExpression <em>Text Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TextExpression
   * @generated
   */
  EClass getTextExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TextExpression#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TextExpression#getCode()
   * @see #getTextExpression()
   * @generated
   */
  EAttribute getTextExpression_Code();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.TextExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TextExpression#getType()
   * @see #getTextExpression()
   * @generated
   */
  EAttribute getTextExpression_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.InputOutput <em>Input Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Output</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.InputOutput
   * @generated
   */
  EClass getInputOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Return
   * @generated
   */
  EClass getReturn();

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
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.Relation#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Relation#getAnnotations()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Annotations();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.TrapSignal <em>Trap Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trap Signal</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.TrapSignal
   * @generated
   */
  EClass getTrapSignal();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression <em>Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Expression</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorExpression
   * @generated
   */
  EClass getOperatorExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression#getSubExpressions <em>Sub Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorExpression#getSubExpressions()
   * @see #getOperatorExpression()
   * @generated
   */
  EReference getOperatorExpression_SubExpressions();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorExpression#getOperator()
   * @see #getOperatorExpression()
   * @generated
   */
  EAttribute getOperatorExpression_Operator();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.esterel.Esterel_ValuedObjectReference <em>Esterel Valued Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Esterel Valued Object Reference</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.Esterel_ValuedObjectReference
   * @generated
   */
  EClass getEsterel_ValuedObjectReference();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.esterel.esterel.OperatorType <em>Operator Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorType
   * @generated
   */
  EEnum getOperatorType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.esterel.esterel.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Type</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.ValueType
   * @generated
   */
  EEnum getValueType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.esterel.esterel.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.esterel.esterel.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

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
     * The meta object literal for the '<em><b>Int Signal Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_SIGNAL_DECLS = eINSTANCE.getModule_IntSignalDecls();

    /**
     * The meta object literal for the '<em><b>Int Type Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_TYPE_DECLS = eINSTANCE.getModule_IntTypeDecls();

    /**
     * The meta object literal for the '<em><b>Int Sensor Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_SENSOR_DECLS = eINSTANCE.getModule_IntSensorDecls();

    /**
     * The meta object literal for the '<em><b>Int Constant Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_CONSTANT_DECLS = eINSTANCE.getModule_IntConstantDecls();

    /**
     * The meta object literal for the '<em><b>Int Relation Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_RELATION_DECLS = eINSTANCE.getModule_IntRelationDecls();

    /**
     * The meta object literal for the '<em><b>Int Task Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_TASK_DECLS = eINSTANCE.getModule_IntTaskDecls();

    /**
     * The meta object literal for the '<em><b>Int Function Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_FUNCTION_DECLS = eINSTANCE.getModule_IntFunctionDecls();

    /**
     * The meta object literal for the '<em><b>Int Procedure Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INT_PROCEDURE_DECLS = eINSTANCE.getModule_IntProcedureDecls();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_IDENTIFIER__TYPE = eINSTANCE.getTypeIdentifier_Type();

    /**
     * The meta object literal for the '<em><b>Type ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_IDENTIFIER__TYPE_ID = eINSTANCE.getTypeIdentifier_TypeID();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_IDENTIFIER__OPERATOR = eINSTANCE.getTypeIdentifier_Operator();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__ANNOTATIONS = eINSTANCE.getTypeDecl_Annotations();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLS__ANNOTATIONS = eINSTANCE.getConstantDecls_Annotations();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValuedObject()
     * @generated
     */
    EClass VALUED_OBJECT = eINSTANCE.getValuedObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__NAME = eINSTANCE.getValuedObject_Name();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__ANNOTATIONS = eINSTANCE.getFunctionDecl_Annotations();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECL__ANNOTATIONS = eINSTANCE.getProcedureDecl_Annotations();

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
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__VARIABLES = eINSTANCE.getProcedure_Variables();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__EXPRESSIONS = eINSTANCE.getProcedure_Expressions();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECL__ANNOTATIONS = eINSTANCE.getTaskDecl_Annotations();

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
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__VARIABLES = eINSTANCE.getTask_Variables();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__EXPRESSIONS = eINSTANCE.getTask_Expressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InterfaceSignalDeclImpl <em>Interface Signal Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.InterfaceSignalDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInterfaceSignalDecl()
     * @generated
     */
    EClass INTERFACE_SIGNAL_DECL = eINSTANCE.getInterfaceSignalDecl();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_SIGNAL_DECL__ANNOTATIONS = eINSTANCE.getInterfaceSignalDecl_Annotations();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_SIGNAL_DECL__SIGNALS = eINSTANCE.getInterfaceSignalDecl_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl <em>ISignal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getISignal()
     * @generated
     */
    EClass ISIGNAL = eINSTANCE.getISignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISIGNAL__NAME = eINSTANCE.getISignal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISIGNAL__TYPE = eINSTANCE.getISignal_Type();

    /**
     * The meta object literal for the '<em><b>Type ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISIGNAL__TYPE_ID = eINSTANCE.getISignal_TypeID();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ISIGNAL__FUNC = eINSTANCE.getISignal_Func();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISIGNAL__OPERATOR = eINSTANCE.getISignal_Operator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ISIGNAL__EXPRESSION = eINSTANCE.getISignal_Expression();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_DECL__ANNOTATIONS = eINSTANCE.getSensorDecl_Annotations();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelParallelImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelParallel()
     * @generated
     */
    EClass ESTEREL_PARALLEL = eINSTANCE.getEsterelParallel();

    /**
     * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTEREL_PARALLEL__THREADS = eINSTANCE.getEsterelParallel_Threads();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelThreadImpl <em>Thread</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelThreadImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelThread()
     * @generated
     */
    EClass ESTEREL_THREAD = eINSTANCE.getEsterelThread();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.HaltImpl <em>Halt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.HaltImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getHalt()
     * @generated
     */
    EClass HALT = eINSTANCE.getHalt();

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
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__TICK = eINSTANCE.getEmit_Tick();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__EXPR = eINSTANCE.getEmit_Expr();

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
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSTAIN__TICK = eINSTANCE.getSustain_Tick();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSTAIN__EXPRESSION = eINSTANCE.getSustain_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.EsterelAssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelAssignmentImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterelAssignment()
     * @generated
     */
    EClass ESTEREL_ASSIGNMENT = eINSTANCE.getEsterelAssignment();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTEREL_ASSIGNMENT__VAR = eINSTANCE.getEsterelAssignment_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTEREL_ASSIGNMENT__EXPR = eINSTANCE.getEsterelAssignment_Expr();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl <em>Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.PresentImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getPresent()
     * @generated
     */
    EClass PRESENT = eINSTANCE.getPresent();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__EXPRESSION = eINSTANCE.getPresent_Expression();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__TICK = eINSTANCE.getPresent_Tick();

    /**
     * The meta object literal for the '<em><b>Then Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__THEN_ANNOTATIONS = eINSTANCE.getPresent_ThenAnnotations();

    /**
     * The meta object literal for the '<em><b>Then Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__THEN_STATEMENTS = eINSTANCE.getPresent_ThenStatements();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__CASES = eINSTANCE.getPresent_Cases();

    /**
     * The meta object literal for the '<em><b>Else Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__ELSE_ANNOTATIONS = eINSTANCE.getPresent_ElseAnnotations();

    /**
     * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__ELSE_STATEMENTS = eINSTANCE.getPresent_ElseStatements();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE__EXPRESSION = eINSTANCE.getPresentCase_Expression();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT_CASE__TICK = eINSTANCE.getPresentCase_Tick();

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
     * The meta object literal for the '<em><b>Then Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__THEN_ANNOTATIONS = eINSTANCE.getIfTest_ThenAnnotations();

    /**
     * The meta object literal for the '<em><b>Then Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__THEN_STATEMENTS = eINSTANCE.getIfTest_ThenStatements();

    /**
     * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSEIF = eINSTANCE.getIfTest_Elseif();

    /**
     * The meta object literal for the '<em><b>Else Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSE_ANNOTATIONS = eINSTANCE.getIfTest_ElseAnnotations();

    /**
     * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_TEST__ELSE_STATEMENTS = eINSTANCE.getIfTest_ElseStatements();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__ANNOTATIONS = eINSTANCE.getElsIf_Annotations();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__EXPR = eINSTANCE.getElsIf_Expr();

    /**
     * The meta object literal for the '<em><b>Then Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__THEN_ANNOTATIONS = eINSTANCE.getElsIf_ThenAnnotations();

    /**
     * The meta object literal for the '<em><b>Then Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELS_IF__THEN_STATEMENTS = eINSTANCE.getElsIf_ThenStatements();

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
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__DELAY = eINSTANCE.getLoop_Delay();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.AbortImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getAbort()
     * @generated
     */
    EClass ABORT = eINSTANCE.getAbort();

    /**
     * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABORT__WEAK = eINSTANCE.getAbort_Weak();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__DELAY = eINSTANCE.getAbort_Delay();

    /**
     * The meta object literal for the '<em><b>Do Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__DO_STATEMENTS = eINSTANCE.getAbort_DoStatements();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABORT__CASES = eINSTANCE.getAbort_Cases();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.CaseImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__DELAY = eINSTANCE.getCase_Delay();

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
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT__DELAY = eINSTANCE.getAwait_Delay();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT__CASES = eINSTANCE.getAwait_Cases();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.SuspendImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getSuspend()
     * @generated
     */
    EClass SUSPEND = eINSTANCE.getSuspend();

    /**
     * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUSPEND__WEAK = eINSTANCE.getSuspend_Weak();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND__DELAY = eINSTANCE.getSuspend_Delay();

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
     * The meta object literal for the '<em><b>Trap Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__TRAP_SIGNALS = eINSTANCE.getTrap_TrapSignals();

    /**
     * The meta object literal for the '<em><b>Trap Handler</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAP__TRAP_HANDLER = eINSTANCE.getTrap_TrapHandler();

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
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__VARS = eINSTANCE.getExec_Vars();

    /**
     * The meta object literal for the '<em><b>Kexpressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__KEXPRESSIONS = eINSTANCE.getExec_Kexpressions();

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
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__VARS = eINSTANCE.getExecCase_Vars();

    /**
     * The meta object literal for the '<em><b>Kexpressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__KEXPRESSIONS = eINSTANCE.getExecCase_Kexpressions();

    /**
     * The meta object literal for the '<em><b>Ret Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_CASE__RET_SIGNAL = eINSTANCE.getExecCase_RetSignal();

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
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SIGNAL_DECL__SIGNALS = eINSTANCE.getLocalSignalDecl_Signals();

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
     * The meta object literal for the '<em><b>Var Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE__VAR_DECLS = eINSTANCE.getLocalVariable_VarDecls();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.VariableDeclImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__VARIABLES = eINSTANCE.getVariableDecl_Variables();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IVariableImpl <em>IVariable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.IVariableImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIVariable()
     * @generated
     */
    EClass IVARIABLE = eINSTANCE.getIVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IVARIABLE__NAME = eINSTANCE.getIVariable_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IVARIABLE__EXPRESSION = eINSTANCE.getIVariable_Expression();

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
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getRenaming()
     * @generated
     */
    EClass RENAMING = eINSTANCE.getRenaming();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENAMING__ANNOTATIONS = eINSTANCE.getRenaming_Annotations();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl <em>Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.DoImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getDo()
     * @generated
     */
    EClass DO = eINSTANCE.getDo();

    /**
     * The meta object literal for the '<em><b>Ending Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__ENDING_ANNOTATIONS = eINSTANCE.getDo_EndingAnnotations();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__EXPR = eINSTANCE.getDo_Expr();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__DELAY = eINSTANCE.getDo_Delay();

    /**
     * The meta object literal for the '<em><b>Watching Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO__WATCHING_STATEMENTS = eINSTANCE.getDo_WatchingStatements();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectReferenceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValuedObjectReference()
     * @generated
     */
    EClass VALUED_OBJECT_REFERENCE = eINSTANCE.getValuedObjectReference();

    /**
     * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUED_OBJECT_REFERENCE__VALUED_OBJECT = eINSTANCE.getValuedObjectReference_ValuedObject();

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
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__TICK = eINSTANCE.getDelayExpr_Tick();

    /**
     * The meta object literal for the '<em><b>Signal Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELAY_EXPR__SIGNAL_EXPR = eINSTANCE.getDelayExpr_SignalExpr();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_EXPR__IS_IMMEDIATE = eINSTANCE.getDelayExpr_IsImmediate();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TextExpressionImpl <em>Text Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TextExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTextExpression()
     * @generated
     */
    EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_EXPRESSION__CODE = eINSTANCE.getTextExpression_Code();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_EXPRESSION__TYPE = eINSTANCE.getTextExpression_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.IntValueImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getIntValue()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.FloatValueImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getBooleanValue()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ConstantImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.InputImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.OutputImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.InputOutputImpl <em>Input Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.InputOutputImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getInputOutput()
     * @generated
     */
    EClass INPUT_OUTPUT = eINSTANCE.getInputOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.ReturnImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__ANNOTATIONS = eINSTANCE.getRelation_Annotations();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RELATIONS = eINSTANCE.getRelation_Relations();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapSignalImpl <em>Trap Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapSignalImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapSignal()
     * @generated
     */
    EClass TRAP_SIGNAL = eINSTANCE.getTrapSignal();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.OperatorExpressionImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOperatorExpression()
     * @generated
     */
    EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getOperatorExpression_SubExpressions();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getOperatorExpression_Operator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl <em>Trap Reference Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.TrapReferenceExprImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getTrapReferenceExpr()
     * @generated
     */
    EClass TRAP_REFERENCE_EXPR = eINSTANCE.getTrapReferenceExpr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.impl.Esterel_ValuedObjectReferenceImpl <em>Esterel Valued Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.impl.Esterel_ValuedObjectReferenceImpl
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getEsterel_ValuedObjectReference()
     * @generated
     */
    EClass ESTEREL_VALUED_OBJECT_REFERENCE = eINSTANCE.getEsterel_ValuedObjectReference();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.OperatorType
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getOperatorType()
     * @generated
     */
    EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.ValueType
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getValueType()
     * @generated
     */
    EEnum VALUE_TYPE = eINSTANCE.getValueType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.esterel.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.esterel.CombineOperator
     * @see de.cau.cs.kieler.esterel.esterel.impl.EsterelPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

  }

} //EsterelPackage
