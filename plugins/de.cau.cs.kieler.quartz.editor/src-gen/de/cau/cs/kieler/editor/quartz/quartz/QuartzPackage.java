/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

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
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzFactory
 * @model kind="package"
 * @generated
 */
public interface QuartzPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "quartz";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/editor/quartz/Quartz";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "quartz";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuartzPackage eINSTANCE = de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QrzFileImpl <em>Qrz File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QrzFileImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQrzFile()
   * @generated
   */
  int QRZ_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QRZ_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Macros</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QRZ_FILE__MACROS = 1;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QRZ_FILE__MODULE = 2;

  /**
   * The number of structural features of the '<em>Qrz File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QRZ_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.PackagePathImpl <em>Package Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.PackagePathImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getPackagePath()
   * @generated
   */
  int PACKAGE_PATH = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PATH__IMPORTS = QRZ_FILE__IMPORTS;

  /**
   * The feature id for the '<em><b>Macros</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PATH__MACROS = QRZ_FILE__MACROS;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PATH__MODULE = QRZ_FILE__MODULE;

  /**
   * The number of structural features of the '<em>Package Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PATH_FEATURE_COUNT = QRZ_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ImportListImpl <em>Import List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ImportListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getImportList()
   * @generated
   */
  int IMPORT_LIST = 2;

  /**
   * The feature id for the '<em><b>Imp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_LIST__IMP = 0;

  /**
   * The number of structural features of the '<em>Import List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.PointedNameImpl <em>Pointed Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.PointedNameImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getPointedName()
   * @generated
   */
  int POINTED_NAME = 3;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__IMPORTS = PACKAGE_PATH__IMPORTS;

  /**
   * The feature id for the '<em><b>Macros</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__MACROS = PACKAGE_PATH__MACROS;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__MODULE = PACKAGE_PATH__MODULE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__ID = PACKAGE_PATH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__NAME = PACKAGE_PATH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME__ALL = PACKAGE_PATH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pointed Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTED_NAME_FEATURE_COUNT = PACKAGE_PATH_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.MacroDefImpl <em>Macro Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.MacroDefImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getMacroDef()
   * @generated
   */
  int MACRO_DEF = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF__ARGS = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF__EXPR = 2;

  /**
   * The number of structural features of the '<em>Macro Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACRO_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl <em>QModule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQModule()
   * @generated
   */
  int QMODULE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QMODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Intf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QMODULE__INTF = 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QMODULE__STMT = 2;

  /**
   * The feature id for the '<em><b>Obs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QMODULE__OBS = 3;

  /**
   * The number of structural features of the '<em>QModule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QMODULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ObservedSpecListImpl <em>Observed Spec List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ObservedSpecListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getObservedSpecList()
   * @generated
   */
  int OBSERVED_SPEC_LIST = 6;

  /**
   * The number of structural features of the '<em>Observed Spec List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVED_SPEC_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListImpl <em>In Out Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutNameList()
   * @generated
   */
  int IN_OUT_NAME_LIST = 14;

  /**
   * The number of structural features of the '<em>In Out Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_NAME_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameImpl <em>In Out Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutName()
   * @generated
   */
  int IN_OUT_NAME = 13;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_NAME__NAMES = IN_OUT_NAME_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Out Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_NAME_FEATURE_COUNT = IN_OUT_NAME_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl <em>QName</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQName()
   * @generated
   */
  int QNAME = 8;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__NAMES = IN_OUT_NAME__NAMES;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T07 = IN_OUT_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T13 = IN_OUT_NAME_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T14 = IN_OUT_NAME_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__OP = IN_OUT_NAME_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__EXPR = IN_OUT_NAME_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T7 = IN_OUT_NAME_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__NAME = IN_OUT_NAME_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__TYPE = IN_OUT_NAME_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T2 = IN_OUT_NAME_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T4 = IN_OUT_NAME_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T = IN_OUT_NAME_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T23 = IN_OUT_NAME_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T6 = IN_OUT_NAME_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T5 = IN_OUT_NAME_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__EXPRS = IN_OUT_NAME_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__STMT = IN_OUT_NAME_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__TS = IN_OUT_NAME_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>T08</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T08 = IN_OUT_NAME_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T10 = IN_OUT_NAME_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>T24</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__T24 = IN_OUT_NAME_FEATURE_COUNT + 19;

  /**
   * The number of structural features of the '<em>QName</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_FEATURE_COUNT = IN_OUT_NAME_FEATURE_COUNT + 20;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.NameImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getName_()
   * @generated
   */
  int NAME = 7;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAMES = QNAME__NAMES;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T07 = QNAME__T07;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T13 = QNAME__T13;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T14 = QNAME__T14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__OP = QNAME__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPR = QNAME__EXPR;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T7 = QNAME__T7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = QNAME__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__TYPE = QNAME__TYPE;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T2 = QNAME__T2;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T4 = QNAME__T4;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T = QNAME__T;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T23 = QNAME__T23;

  /**
   * The feature id for the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T6 = QNAME__T6;

  /**
   * The feature id for the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T5 = QNAME__T5;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__EXPRS = QNAME__EXPRS;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__STMT = QNAME__STMT;

  /**
   * The feature id for the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__TS = QNAME__TS;

  /**
   * The feature id for the '<em><b>T08</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T08 = QNAME__T08;

  /**
   * The feature id for the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T10 = QNAME__T10;

  /**
   * The feature id for the '<em><b>T24</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__T24 = QNAME__T24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__ID = QNAME_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = QNAME_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ControlListImpl <em>Control List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ControlListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getControlList()
   * @generated
   */
  int CONTROL_LIST = 19;

  /**
   * The number of structural features of the '<em>Control List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameListImpl <em>QName List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QNameListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQNameList()
   * @generated
   */
  int QNAME_LIST = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_LIST__NAME = CONTROL_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_LIST__NAMES = CONTROL_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>QName List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_LIST_FEATURE_COUNT = CONTROL_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl <em>QType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQType()
   * @generated
   */
  int QTYPE = 10;

  /**
   * The feature id for the '<em><b>Ta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE__TA = 0;

  /**
   * The feature id for the '<em><b>Tb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE__TB = 1;

  /**
   * The feature id for the '<em><b>Tc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE__TC = 2;

  /**
   * The feature id for the '<em><b>Dims</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE__DIMS = 3;

  /**
   * The number of structural features of the '<em>QType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl <em>QType List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQTypeList()
   * @generated
   */
  int QTYPE_LIST = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE_LIST__TYPE = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE_LIST__T = 1;

  /**
   * The number of structural features of the '<em>QType List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QTYPE_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.DimListImpl <em>Dim List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.DimListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getDimList()
   * @generated
   */
  int DIM_LIST = 12;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIM_LIST__EXPR = 0;

  /**
   * The number of structural features of the '<em>Dim List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIM_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListCommaImpl <em>In Out Name List Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListCommaImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutNameListComma()
   * @generated
   */
  int IN_OUT_NAME_LIST_COMMA = 15;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_NAME_LIST_COMMA__NAMES = 0;

  /**
   * The number of structural features of the '<em>In Out Name List Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_NAME_LIST_COMMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAMES = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl <em>Interface Comma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterfaceComma()
   * @generated
   */
  int INTERFACE_COMMA = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_COMMA__TYPE = 0;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_COMMA__NAMES = 1;

  /**
   * The number of structural features of the '<em>Interface Comma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_COMMA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceListImpl <em>Interface List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterfaceList()
   * @generated
   */
  int INTERFACE_LIST = 18;

  /**
   * The feature id for the '<em><b>Intf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_LIST__INTF = 0;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_LIST__INTERFACES = 1;

  /**
   * The number of structural features of the '<em>Interface List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.AssumeListImpl <em>Assume List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.AssumeListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getAssumeList()
   * @generated
   */
  int ASSUME_LIST = 20;

  /**
   * The number of structural features of the '<em>Assume List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl <em>Proof Goal List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getProofGoalList()
   * @generated
   */
  int PROOF_GOAL_LIST = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__NAME = OBSERVED_SPEC_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__EXPR = OBSERVED_SPEC_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__GOALS = OBSERVED_SPEC_LIST_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ver</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__VER = OBSERVED_SPEC_LIST_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ctrl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__CTRL = OBSERVED_SPEC_LIST_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ass</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__ASS = OBSERVED_SPEC_LIST_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ctr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST__CTR = OBSERVED_SPEC_LIST_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Proof Goal List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_GOAL_LIST_FEATURE_COUNT = OBSERVED_SPEC_LIST_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.AtomicStmtImpl <em>Atomic Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.AtomicStmtImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getAtomicStmt()
   * @generated
   */
  int ATOMIC_STMT = 35;

  /**
   * The number of structural features of the '<em>Atomic Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyActionImpl <em>Uty Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyActionImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyAction()
   * @generated
   */
  int UTY_ACTION = 27;

  /**
   * The number of structural features of the '<em>Uty Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_ACTION_FEATURE_COUNT = ATOMIC_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl <em>Uty Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyExpr()
   * @generated
   */
  int UTY_EXPR = 26;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T07 = UTY_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T13 = UTY_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T14 = UTY_ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__OP = UTY_ACTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__EXPR = UTY_ACTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T7 = UTY_ACTION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__NAME = UTY_ACTION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__TYPE = UTY_ACTION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T2 = UTY_ACTION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR__T4 = UTY_ACTION_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Uty Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR_FEATURE_COUNT = UTY_ACTION_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.FixpointEqListImpl <em>Fixpoint Eq List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.FixpointEqListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getFixpointEqList()
   * @generated
   */
  int FIXPOINT_EQ_LIST = 22;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T07 = UTY_EXPR__T07;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T13 = UTY_EXPR__T13;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T14 = UTY_EXPR__T14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__OP = UTY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__EXPR = UTY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T7 = UTY_EXPR__T7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__NAME = UTY_EXPR__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__TYPE = UTY_EXPR__TYPE;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T2 = UTY_EXPR__T2;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__T4 = UTY_EXPR__T4;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST__EXPR2 = UTY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fixpoint Eq List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXPOINT_EQ_LIST_FEATURE_COUNT = UTY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprListImpl <em>Opt Uty Expr List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getOptUtyExprList()
   * @generated
   */
  int OPT_UTY_EXPR_LIST = 24;

  /**
   * The number of structural features of the '<em>Opt Uty Expr List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_UTY_EXPR_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprImpl <em>Opt Uty Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getOptUtyExpr()
   * @generated
   */
  int OPT_UTY_EXPR = 23;

  /**
   * The feature id for the '<em><b>Tk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_UTY_EXPR__TK = OPT_UTY_EXPR_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_UTY_EXPR__EXPRS = OPT_UTY_EXPR_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Opt Uty Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_UTY_EXPR_FEATURE_COUNT = OPT_UTY_EXPR_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprSelectListImpl <em>Uty Expr Select List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprSelectListImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyExprSelectList()
   * @generated
   */
  int UTY_EXPR_SELECT_LIST = 25;

  /**
   * The feature id for the '<em><b>Tk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR_SELECT_LIST__TK = 0;

  /**
   * The number of structural features of the '<em>Uty Expr Select List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UTY_EXPR_SELECT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.case_listImpl <em>case list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.case_listImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getcase_list()
   * @generated
   */
  int CASE_LIST = 28;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST__EXP = ATOMIC_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST__STMT = ATOMIC_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T15</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST__T15 = ATOMIC_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>case list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST_FEATURE_COUNT = ATOMIC_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprsImpl <em>dUty Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprsImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getdUtyExprs()
   * @generated
   */
  int DUTY_EXPRS = 30;

  /**
   * The number of structural features of the '<em>dUty Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_EXPRS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl <em>dUty Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getdUtyExpr()
   * @generated
   */
  int DUTY_EXPR = 29;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_EXPR__T07 = DUTY_EXPRS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_EXPR__T13 = DUTY_EXPRS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_EXPR__T14 = DUTY_EXPRS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>dUty Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_EXPR_FEATURE_COUNT = DUTY_EXPRS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.GenericImpl <em>Generic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.GenericImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getGeneric()
   * @generated
   */
  int GENERIC = 31;

  /**
   * The feature id for the '<em><b>T07</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T07 = UTY_EXPR__T07;

  /**
   * The feature id for the '<em><b>T13</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T13 = UTY_EXPR__T13;

  /**
   * The feature id for the '<em><b>T14</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T14 = UTY_EXPR__T14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__OP = UTY_EXPR__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__EXPR = UTY_EXPR__EXPR;

  /**
   * The feature id for the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T7 = UTY_EXPR__T7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__NAME = UTY_EXPR__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__TYPE = UTY_EXPR__TYPE;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T2 = UTY_EXPR__T2;

  /**
   * The feature id for the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T4 = UTY_EXPR__T4;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T = UTY_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T23</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__T23 = UTY_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FEATURE_COUNT = UTY_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl <em>Loc Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getLocStmt()
   * @generated
   */
  int LOC_STMT = 32;

  /**
   * The feature id for the '<em><b>Locals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_STMT__LOCALS = ATOMIC_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_STMT__STMT = ATOMIC_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loc Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_STMT_FEATURE_COUNT = ATOMIC_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.SeqStmtImpl <em>Seq Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.SeqStmtImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getSeqStmt()
   * @generated
   */
  int SEQ_STMT = 33;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_STMT__S = 0;

  /**
   * The number of structural features of the '<em>Seq Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl
   * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getStmt()
   * @generated
   */
  int STMT = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__LEFT = ATOMIC_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__RIGHT = ATOMIC_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__EXPR = ATOMIC_STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>T03</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__T03 = ATOMIC_STMT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>T06</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__T06 = ATOMIC_STMT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>T16</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__T16 = ATOMIC_STMT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = ATOMIC_STMT_FEATURE_COUNT + 6;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QrzFile <em>Qrz File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qrz File</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QrzFile
   * @generated
   */
  EClass getQrzFile();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getImports()
   * @see #getQrzFile()
   * @generated
   */
  EReference getQrzFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getMacros <em>Macros</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Macros</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getMacros()
   * @see #getQrzFile()
   * @generated
   */
  EReference getQrzFile_Macros();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QrzFile#getModule()
   * @see #getQrzFile()
   * @generated
   */
  EReference getQrzFile_Module();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.PackagePath <em>Package Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Path</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PackagePath
   * @generated
   */
  EClass getPackagePath();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.ImportList <em>Import List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ImportList
   * @generated
   */
  EClass getImportList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ImportList#getImp <em>Imp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imp</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ImportList#getImp()
   * @see #getImportList()
   * @generated
   */
  EReference getImportList_Imp();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName <em>Pointed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointed Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PointedName
   * @generated
   */
  EClass getPointedName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PointedName#getId()
   * @see #getPointedName()
   * @generated
   */
  EAttribute getPointedName_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PointedName#getName()
   * @see #getPointedName()
   * @generated
   */
  EReference getPointedName_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PointedName#isAll()
   * @see #getPointedName()
   * @generated
   */
  EAttribute getPointedName_All();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef <em>Macro Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Macro Def</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.MacroDef
   * @generated
   */
  EClass getMacroDef();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getName()
   * @see #getMacroDef()
   * @generated
   */
  EReference getMacroDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getArgs()
   * @see #getMacroDef()
   * @generated
   */
  EReference getMacroDef_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getExpr()
   * @see #getMacroDef()
   * @generated
   */
  EReference getMacroDef_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule <em>QModule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QModule</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule
   * @generated
   */
  EClass getQModule();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule#getName()
   * @see #getQModule()
   * @generated
   */
  EReference getQModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule#getIntf <em>Intf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intf</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule#getIntf()
   * @see #getQModule()
   * @generated
   */
  EReference getQModule_Intf();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule#getStmt()
   * @see #getQModule()
   * @generated
   */
  EReference getQModule_Stmt();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule#getObs <em>Obs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Obs</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule#getObs()
   * @see #getQModule()
   * @generated
   */
  EReference getQModule_Obs();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.ObservedSpecList <em>Observed Spec List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observed Spec List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ObservedSpecList
   * @generated
   */
  EClass getObservedSpecList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.editor.quartz.quartz.Name#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Name#getId()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Id();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QName</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName
   * @generated
   */
  EClass getQName();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getT6 <em>T6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T6</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getT6()
   * @see #getQName()
   * @generated
   */
  EReference getQName_T6();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getT5 <em>T5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T5</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getT5()
   * @see #getQName()
   * @generated
   */
  EReference getQName_T5();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exprs</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getExprs()
   * @see #getQName()
   * @generated
   */
  EReference getQName_Exprs();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getStmt()
   * @see #getQName()
   * @generated
   */
  EReference getQName_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getTs <em>Ts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ts</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getTs()
   * @see #getQName()
   * @generated
   */
  EReference getQName_Ts();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getT08 <em>T08</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T08</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getT08()
   * @see #getQName()
   * @generated
   */
  EReference getQName_T08();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getT10 <em>T10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T10</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getT10()
   * @see #getQName()
   * @generated
   */
  EReference getQName_T10();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QName#getT24 <em>T24</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T24</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName#getT24()
   * @see #getQName()
   * @generated
   */
  EReference getQName_T24();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QNameList <em>QName List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QName List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QNameList
   * @generated
   */
  EClass getQNameList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QNameList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QNameList#getName()
   * @see #getQNameList()
   * @generated
   */
  EReference getQNameList_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.QNameList#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QNameList#getNames()
   * @see #getQNameList()
   * @generated
   */
  EReference getQNameList_Names();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QType <em>QType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QType</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType
   * @generated
   */
  EClass getQType();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QType#getTa <em>Ta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ta</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType#getTa()
   * @see #getQType()
   * @generated
   */
  EReference getQType_Ta();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QType#getTb <em>Tb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tb</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType#getTb()
   * @see #getQType()
   * @generated
   */
  EReference getQType_Tb();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QType#getTc <em>Tc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tc</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType#getTc()
   * @see #getQType()
   * @generated
   */
  EReference getQType_Tc();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QType#getDims <em>Dims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dims</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType#getDims()
   * @see #getQType()
   * @generated
   */
  EReference getQType_Dims();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList <em>QType List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QType List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QTypeList
   * @generated
   */
  EClass getQTypeList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getType()
   * @see #getQTypeList()
   * @generated
   */
  EReference getQTypeList_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QTypeList#getT()
   * @see #getQTypeList()
   * @generated
   */
  EReference getQTypeList_T();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.DimList <em>Dim List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dim List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.DimList
   * @generated
   */
  EClass getDimList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.DimList#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.DimList#getExpr()
   * @see #getDimList()
   * @generated
   */
  EReference getDimList_Expr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutName <em>In Out Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutName
   * @generated
   */
  EClass getInOutName();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutName#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutName#getNames()
   * @see #getInOutName()
   * @generated
   */
  EReference getInOutName_Names();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutNameList <em>In Out Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Name List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutNameList
   * @generated
   */
  EClass getInOutNameList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma <em>In Out Name List Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Name List Comma</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma
   * @generated
   */
  EClass getInOutNameListComma();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma#getNames()
   * @see #getInOutNameListComma()
   * @generated
   */
  EReference getInOutNameListComma_Names();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Interface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Interface#getType()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Interface#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Names</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Interface#getNames()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Names();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma <em>Interface Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Comma</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma
   * @generated
   */
  EClass getInterfaceComma();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma#getType()
   * @see #getInterfaceComma()
   * @generated
   */
  EReference getInterfaceComma_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Names</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma#getNames()
   * @see #getInterfaceComma()
   * @generated
   */
  EReference getInterfaceComma_Names();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceList
   * @generated
   */
  EClass getInterfaceList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getIntf <em>Intf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intf</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getIntf()
   * @see #getInterfaceList()
   * @generated
   */
  EReference getInterfaceList_Intf();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceList#getInterfaces()
   * @see #getInterfaceList()
   * @generated
   */
  EReference getInterfaceList_Interfaces();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.ControlList <em>Control List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ControlList
   * @generated
   */
  EClass getControlList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.AssumeList <em>Assume List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assume List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.AssumeList
   * @generated
   */
  EClass getAssumeList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList <em>Proof Goal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proof Goal List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList
   * @generated
   */
  EClass getProofGoalList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getName()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getExpr()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getGoals()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Goals();

  /**
   * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getVer <em>Ver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ver</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getVer()
   * @see #getProofGoalList()
   * @generated
   */
  EAttribute getProofGoalList_Ver();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtrl <em>Ctrl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ctrl</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtrl()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Ctrl();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getAss <em>Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ass</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getAss()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Ass();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtr <em>Ctr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ctr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtr()
   * @see #getProofGoalList()
   * @generated
   */
  EReference getProofGoalList_Ctr();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList <em>Fixpoint Eq List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixpoint Eq List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList
   * @generated
   */
  EClass getFixpointEqList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr2</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList#getExpr2()
   * @see #getFixpointEqList()
   * @generated
   */
  EReference getFixpointEqList_Expr2();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr <em>Opt Uty Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opt Uty Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr
   * @generated
   */
  EClass getOptUtyExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr#getTk <em>Tk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tk</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr#getTk()
   * @see #getOptUtyExpr()
   * @generated
   */
  EReference getOptUtyExpr_Tk();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr#getExprs()
   * @see #getOptUtyExpr()
   * @generated
   */
  EReference getOptUtyExpr_Exprs();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExprList <em>Opt Uty Expr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opt Uty Expr List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExprList
   * @generated
   */
  EClass getOptUtyExprList();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList <em>Uty Expr Select List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uty Expr Select List</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList
   * @generated
   */
  EClass getUtyExprSelectList();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList#getTk <em>Tk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tk</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList#getTk()
   * @see #getUtyExprSelectList()
   * @generated
   */
  EReference getUtyExprSelectList_Tk();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr <em>Uty Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uty Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr
   * @generated
   */
  EClass getUtyExpr();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getOp()
   * @see #getUtyExpr()
   * @generated
   */
  EAttribute getUtyExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getExpr()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT7 <em>T7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T7</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT7()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_T7();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getName()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getType()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT2()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_T2();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT4 <em>T4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T4</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr#getT4()
   * @see #getUtyExpr()
   * @generated
   */
  EReference getUtyExpr_T4();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyAction <em>Uty Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uty Action</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyAction
   * @generated
   */
  EClass getUtyAction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.case_list <em>case list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case list</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.case_list
   * @generated
   */
  EClass getcase_list();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.case_list#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.case_list#getExp()
   * @see #getcase_list()
   * @generated
   */
  EReference getcase_list_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.case_list#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.case_list#getStmt()
   * @see #getcase_list()
   * @generated
   */
  EReference getcase_list_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.case_list#getT15 <em>T15</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T15</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.case_list#getT15()
   * @see #getcase_list()
   * @generated
   */
  EReference getcase_list_T15();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr <em>dUty Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dUty Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr
   * @generated
   */
  EClass getdUtyExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT07 <em>T07</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T07</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT07()
   * @see #getdUtyExpr()
   * @generated
   */
  EReference getdUtyExpr_T07();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT13 <em>T13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T13</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT13()
   * @see #getdUtyExpr()
   * @generated
   */
  EReference getdUtyExpr_T13();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT14 <em>T14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T14</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr#getT14()
   * @see #getdUtyExpr()
   * @generated
   */
  EReference getdUtyExpr_T14();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs <em>dUty Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dUty Exprs</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs
   * @generated
   */
  EClass getdUtyExprs();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.Generic <em>Generic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Generic
   * @generated
   */
  EClass getGeneric();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Generic#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Generic#getT()
   * @see #getGeneric()
   * @generated
   */
  EReference getGeneric_T();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Generic#getT23 <em>T23</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T23</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Generic#getT23()
   * @see #getGeneric()
   * @generated
   */
  EReference getGeneric_T23();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt <em>Loc Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.LocStmt
   * @generated
   */
  EClass getLocStmt();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locals</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getLocals()
   * @see #getLocStmt()
   * @generated
   */
  EReference getLocStmt_Locals();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getStmt()
   * @see #getLocStmt()
   * @generated
   */
  EReference getLocStmt_Stmt();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.SeqStmt <em>Seq Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.SeqStmt
   * @generated
   */
  EClass getSeqStmt();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.SeqStmt#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.SeqStmt#getS()
   * @see #getSeqStmt()
   * @generated
   */
  EReference getSeqStmt_S();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getLeft()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Left();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getRight()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Right();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getExpr()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT03 <em>T03</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T03</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT03()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_T03();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT06 <em>T06</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T06</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT06()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_T06();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT16 <em>T16</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T16</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt#getT16()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_T16();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt <em>Atomic Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Stmt</em>'.
   * @see de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt
   * @generated
   */
  EClass getAtomicStmt();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QuartzFactory getQuartzFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QrzFileImpl <em>Qrz File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QrzFileImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQrzFile()
     * @generated
     */
    EClass QRZ_FILE = eINSTANCE.getQrzFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QRZ_FILE__IMPORTS = eINSTANCE.getQrzFile_Imports();

    /**
     * The meta object literal for the '<em><b>Macros</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QRZ_FILE__MACROS = eINSTANCE.getQrzFile_Macros();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QRZ_FILE__MODULE = eINSTANCE.getQrzFile_Module();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.PackagePathImpl <em>Package Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.PackagePathImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getPackagePath()
     * @generated
     */
    EClass PACKAGE_PATH = eINSTANCE.getPackagePath();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ImportListImpl <em>Import List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ImportListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getImportList()
     * @generated
     */
    EClass IMPORT_LIST = eINSTANCE.getImportList();

    /**
     * The meta object literal for the '<em><b>Imp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_LIST__IMP = eINSTANCE.getImportList_Imp();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.PointedNameImpl <em>Pointed Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.PointedNameImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getPointedName()
     * @generated
     */
    EClass POINTED_NAME = eINSTANCE.getPointedName();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTED_NAME__ID = eINSTANCE.getPointedName_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTED_NAME__NAME = eINSTANCE.getPointedName_Name();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTED_NAME__ALL = eINSTANCE.getPointedName_All();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.MacroDefImpl <em>Macro Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.MacroDefImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getMacroDef()
     * @generated
     */
    EClass MACRO_DEF = eINSTANCE.getMacroDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACRO_DEF__NAME = eINSTANCE.getMacroDef_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACRO_DEF__ARGS = eINSTANCE.getMacroDef_Args();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACRO_DEF__EXPR = eINSTANCE.getMacroDef_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl <em>QModule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQModule()
     * @generated
     */
    EClass QMODULE = eINSTANCE.getQModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QMODULE__NAME = eINSTANCE.getQModule_Name();

    /**
     * The meta object literal for the '<em><b>Intf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QMODULE__INTF = eINSTANCE.getQModule_Intf();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QMODULE__STMT = eINSTANCE.getQModule_Stmt();

    /**
     * The meta object literal for the '<em><b>Obs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QMODULE__OBS = eINSTANCE.getQModule_Obs();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ObservedSpecListImpl <em>Observed Spec List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ObservedSpecListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getObservedSpecList()
     * @generated
     */
    EClass OBSERVED_SPEC_LIST = eINSTANCE.getObservedSpecList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.NameImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__ID = eINSTANCE.getName_Id();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl <em>QName</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQName()
     * @generated
     */
    EClass QNAME = eINSTANCE.getQName();

    /**
     * The meta object literal for the '<em><b>T6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__T6 = eINSTANCE.getQName_T6();

    /**
     * The meta object literal for the '<em><b>T5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__T5 = eINSTANCE.getQName_T5();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__EXPRS = eINSTANCE.getQName_Exprs();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__STMT = eINSTANCE.getQName_Stmt();

    /**
     * The meta object literal for the '<em><b>Ts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__TS = eINSTANCE.getQName_Ts();

    /**
     * The meta object literal for the '<em><b>T08</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__T08 = eINSTANCE.getQName_T08();

    /**
     * The meta object literal for the '<em><b>T10</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__T10 = eINSTANCE.getQName_T10();

    /**
     * The meta object literal for the '<em><b>T24</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__T24 = eINSTANCE.getQName_T24();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameListImpl <em>QName List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QNameListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQNameList()
     * @generated
     */
    EClass QNAME_LIST = eINSTANCE.getQNameList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME_LIST__NAME = eINSTANCE.getQNameList_Name();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME_LIST__NAMES = eINSTANCE.getQNameList_Names();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl <em>QType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQType()
     * @generated
     */
    EClass QTYPE = eINSTANCE.getQType();

    /**
     * The meta object literal for the '<em><b>Ta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE__TA = eINSTANCE.getQType_Ta();

    /**
     * The meta object literal for the '<em><b>Tb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE__TB = eINSTANCE.getQType_Tb();

    /**
     * The meta object literal for the '<em><b>Tc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE__TC = eINSTANCE.getQType_Tc();

    /**
     * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE__DIMS = eINSTANCE.getQType_Dims();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl <em>QType List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getQTypeList()
     * @generated
     */
    EClass QTYPE_LIST = eINSTANCE.getQTypeList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE_LIST__TYPE = eINSTANCE.getQTypeList_Type();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QTYPE_LIST__T = eINSTANCE.getQTypeList_T();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.DimListImpl <em>Dim List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.DimListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getDimList()
     * @generated
     */
    EClass DIM_LIST = eINSTANCE.getDimList();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIM_LIST__EXPR = eINSTANCE.getDimList_Expr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameImpl <em>In Out Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutName()
     * @generated
     */
    EClass IN_OUT_NAME = eINSTANCE.getInOutName();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT_NAME__NAMES = eINSTANCE.getInOutName_Names();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListImpl <em>In Out Name List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutNameList()
     * @generated
     */
    EClass IN_OUT_NAME_LIST = eINSTANCE.getInOutNameList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListCommaImpl <em>In Out Name List Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameListCommaImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInOutNameListComma()
     * @generated
     */
    EClass IN_OUT_NAME_LIST_COMMA = eINSTANCE.getInOutNameListComma();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT_NAME_LIST_COMMA__NAMES = eINSTANCE.getInOutNameListComma_Names();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__TYPE = eINSTANCE.getInterface_Type();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__NAMES = eINSTANCE.getInterface_Names();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl <em>Interface Comma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterfaceComma()
     * @generated
     */
    EClass INTERFACE_COMMA = eINSTANCE.getInterfaceComma();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_COMMA__TYPE = eINSTANCE.getInterfaceComma_Type();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_COMMA__NAMES = eINSTANCE.getInterfaceComma_Names();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceListImpl <em>Interface List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getInterfaceList()
     * @generated
     */
    EClass INTERFACE_LIST = eINSTANCE.getInterfaceList();

    /**
     * The meta object literal for the '<em><b>Intf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_LIST__INTF = eINSTANCE.getInterfaceList_Intf();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_LIST__INTERFACES = eINSTANCE.getInterfaceList_Interfaces();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ControlListImpl <em>Control List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ControlListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getControlList()
     * @generated
     */
    EClass CONTROL_LIST = eINSTANCE.getControlList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.AssumeListImpl <em>Assume List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.AssumeListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getAssumeList()
     * @generated
     */
    EClass ASSUME_LIST = eINSTANCE.getAssumeList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl <em>Proof Goal List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getProofGoalList()
     * @generated
     */
    EClass PROOF_GOAL_LIST = eINSTANCE.getProofGoalList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__NAME = eINSTANCE.getProofGoalList_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__EXPR = eINSTANCE.getProofGoalList_Expr();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__GOALS = eINSTANCE.getProofGoalList_Goals();

    /**
     * The meta object literal for the '<em><b>Ver</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROOF_GOAL_LIST__VER = eINSTANCE.getProofGoalList_Ver();

    /**
     * The meta object literal for the '<em><b>Ctrl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__CTRL = eINSTANCE.getProofGoalList_Ctrl();

    /**
     * The meta object literal for the '<em><b>Ass</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__ASS = eINSTANCE.getProofGoalList_Ass();

    /**
     * The meta object literal for the '<em><b>Ctr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_GOAL_LIST__CTR = eINSTANCE.getProofGoalList_Ctr();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.FixpointEqListImpl <em>Fixpoint Eq List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.FixpointEqListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getFixpointEqList()
     * @generated
     */
    EClass FIXPOINT_EQ_LIST = eINSTANCE.getFixpointEqList();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIXPOINT_EQ_LIST__EXPR2 = eINSTANCE.getFixpointEqList_Expr2();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprImpl <em>Opt Uty Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getOptUtyExpr()
     * @generated
     */
    EClass OPT_UTY_EXPR = eINSTANCE.getOptUtyExpr();

    /**
     * The meta object literal for the '<em><b>Tk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPT_UTY_EXPR__TK = eINSTANCE.getOptUtyExpr_Tk();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPT_UTY_EXPR__EXPRS = eINSTANCE.getOptUtyExpr_Exprs();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprListImpl <em>Opt Uty Expr List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.OptUtyExprListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getOptUtyExprList()
     * @generated
     */
    EClass OPT_UTY_EXPR_LIST = eINSTANCE.getOptUtyExprList();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprSelectListImpl <em>Uty Expr Select List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprSelectListImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyExprSelectList()
     * @generated
     */
    EClass UTY_EXPR_SELECT_LIST = eINSTANCE.getUtyExprSelectList();

    /**
     * The meta object literal for the '<em><b>Tk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR_SELECT_LIST__TK = eINSTANCE.getUtyExprSelectList_Tk();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl <em>Uty Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyExpr()
     * @generated
     */
    EClass UTY_EXPR = eINSTANCE.getUtyExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UTY_EXPR__OP = eINSTANCE.getUtyExpr_Op();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__EXPR = eINSTANCE.getUtyExpr_Expr();

    /**
     * The meta object literal for the '<em><b>T7</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__T7 = eINSTANCE.getUtyExpr_T7();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__NAME = eINSTANCE.getUtyExpr_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__TYPE = eINSTANCE.getUtyExpr_Type();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__T2 = eINSTANCE.getUtyExpr_T2();

    /**
     * The meta object literal for the '<em><b>T4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UTY_EXPR__T4 = eINSTANCE.getUtyExpr_T4();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyActionImpl <em>Uty Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.UtyActionImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getUtyAction()
     * @generated
     */
    EClass UTY_ACTION = eINSTANCE.getUtyAction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.case_listImpl <em>case list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.case_listImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getcase_list()
     * @generated
     */
    EClass CASE_LIST = eINSTANCE.getcase_list();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIST__EXP = eINSTANCE.getcase_list_Exp();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIST__STMT = eINSTANCE.getcase_list_Stmt();

    /**
     * The meta object literal for the '<em><b>T15</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIST__T15 = eINSTANCE.getcase_list_T15();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl <em>dUty Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getdUtyExpr()
     * @generated
     */
    EClass DUTY_EXPR = eINSTANCE.getdUtyExpr();

    /**
     * The meta object literal for the '<em><b>T07</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUTY_EXPR__T07 = eINSTANCE.getdUtyExpr_T07();

    /**
     * The meta object literal for the '<em><b>T13</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUTY_EXPR__T13 = eINSTANCE.getdUtyExpr_T13();

    /**
     * The meta object literal for the '<em><b>T14</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUTY_EXPR__T14 = eINSTANCE.getdUtyExpr_T14();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprsImpl <em>dUty Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprsImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getdUtyExprs()
     * @generated
     */
    EClass DUTY_EXPRS = eINSTANCE.getdUtyExprs();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.GenericImpl <em>Generic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.GenericImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getGeneric()
     * @generated
     */
    EClass GENERIC = eINSTANCE.getGeneric();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC__T = eINSTANCE.getGeneric_T();

    /**
     * The meta object literal for the '<em><b>T23</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC__T23 = eINSTANCE.getGeneric_T23();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl <em>Loc Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getLocStmt()
     * @generated
     */
    EClass LOC_STMT = eINSTANCE.getLocStmt();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_STMT__LOCALS = eINSTANCE.getLocStmt_Locals();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_STMT__STMT = eINSTANCE.getLocStmt_Stmt();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.SeqStmtImpl <em>Seq Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.SeqStmtImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getSeqStmt()
     * @generated
     */
    EClass SEQ_STMT = eINSTANCE.getSeqStmt();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_STMT__S = eINSTANCE.getSeqStmt_S();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__LEFT = eINSTANCE.getStmt_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__RIGHT = eINSTANCE.getStmt_Right();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__EXPR = eINSTANCE.getStmt_Expr();

    /**
     * The meta object literal for the '<em><b>T03</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__T03 = eINSTANCE.getStmt_T03();

    /**
     * The meta object literal for the '<em><b>T06</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__T06 = eINSTANCE.getStmt_T06();

    /**
     * The meta object literal for the '<em><b>T16</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__T16 = eINSTANCE.getStmt_T16();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.editor.quartz.quartz.impl.AtomicStmtImpl <em>Atomic Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.AtomicStmtImpl
     * @see de.cau.cs.kieler.editor.quartz.quartz.impl.QuartzPackageImpl#getAtomicStmt()
     * @generated
     */
    EClass ATOMIC_STMT = eINSTANCE.getAtomicStmt();

  }

} //QuartzPackage
