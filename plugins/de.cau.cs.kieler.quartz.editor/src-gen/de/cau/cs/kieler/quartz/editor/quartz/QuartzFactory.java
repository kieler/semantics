/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage
 * @generated
 */
public interface QuartzFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuartzFactory eINSTANCE = de.cau.cs.kieler.quartz.editor.quartz.impl.QuartzFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Qrz File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qrz File</em>'.
   * @generated
   */
  QrzFile createQrzFile();

  /**
   * Returns a new object of class '<em>Package Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Path</em>'.
   * @generated
   */
  PackagePath createPackagePath();

  /**
   * Returns a new object of class '<em>Import List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import List</em>'.
   * @generated
   */
  ImportList createImportList();

  /**
   * Returns a new object of class '<em>Pointed Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointed Name</em>'.
   * @generated
   */
  PointedName createPointedName();

  /**
   * Returns a new object of class '<em>Macro Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Macro Def</em>'.
   * @generated
   */
  MacroDef createMacroDef();

  /**
   * Returns a new object of class '<em>QModule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QModule</em>'.
   * @generated
   */
  QModule createQModule();

  /**
   * Returns a new object of class '<em>Observed Spec List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observed Spec List</em>'.
   * @generated
   */
  ObservedSpecList createObservedSpecList();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QName</em>'.
   * @generated
   */
  QName createQName();

  /**
   * Returns a new object of class '<em>QName List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QName List</em>'.
   * @generated
   */
  QNameList createQNameList();

  /**
   * Returns a new object of class '<em>QType</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QType</em>'.
   * @generated
   */
  QType createQType();

  /**
   * Returns a new object of class '<em>QType List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QType List</em>'.
   * @generated
   */
  QTypeList createQTypeList();

  /**
   * Returns a new object of class '<em>Dim List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dim List</em>'.
   * @generated
   */
  DimList createDimList();

  /**
   * Returns a new object of class '<em>In Out Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Name</em>'.
   * @generated
   */
  InOutName createInOutName();

  /**
   * Returns a new object of class '<em>In Out Name List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Name List</em>'.
   * @generated
   */
  InOutNameList createInOutNameList();

  /**
   * Returns a new object of class '<em>In Out Name List Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Name List Comma</em>'.
   * @generated
   */
  InOutNameListComma createInOutNameListComma();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Interface Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Comma</em>'.
   * @generated
   */
  InterfaceComma createInterfaceComma();

  /**
   * Returns a new object of class '<em>Interface List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface List</em>'.
   * @generated
   */
  InterfaceList createInterfaceList();

  /**
   * Returns a new object of class '<em>Control List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control List</em>'.
   * @generated
   */
  ControlList createControlList();

  /**
   * Returns a new object of class '<em>Assume List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assume List</em>'.
   * @generated
   */
  AssumeList createAssumeList();

  /**
   * Returns a new object of class '<em>Proof Goal List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proof Goal List</em>'.
   * @generated
   */
  ProofGoalList createProofGoalList();

  /**
   * Returns a new object of class '<em>Fixpoint Eq List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixpoint Eq List</em>'.
   * @generated
   */
  FixpointEqList createFixpointEqList();

  /**
   * Returns a new object of class '<em>Opt Uty Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opt Uty Expr</em>'.
   * @generated
   */
  OptUtyExpr createOptUtyExpr();

  /**
   * Returns a new object of class '<em>Opt Uty Expr List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opt Uty Expr List</em>'.
   * @generated
   */
  OptUtyExprList createOptUtyExprList();

  /**
   * Returns a new object of class '<em>Uty Expr Select List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uty Expr Select List</em>'.
   * @generated
   */
  UtyExprSelectList createUtyExprSelectList();

  /**
   * Returns a new object of class '<em>Uty Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uty Expr</em>'.
   * @generated
   */
  UtyExpr createUtyExpr();

  /**
   * Returns a new object of class '<em>Uty Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uty Action</em>'.
   * @generated
   */
  UtyAction createUtyAction();

  /**
   * Returns a new object of class '<em>case list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>case list</em>'.
   * @generated
   */
  case_list createcase_list();

  /**
   * Returns a new object of class '<em>dUty Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>dUty Expr</em>'.
   * @generated
   */
  dUtyExpr createdUtyExpr();

  /**
   * Returns a new object of class '<em>dUty Exprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>dUty Exprs</em>'.
   * @generated
   */
  dUtyExprs createdUtyExprs();

  /**
   * Returns a new object of class '<em>Generic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic</em>'.
   * @generated
   */
  Generic createGeneric();

  /**
   * Returns a new object of class '<em>Loc Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Stmt</em>'.
   * @generated
   */
  LocStmt createLocStmt();

  /**
   * Returns a new object of class '<em>Seq Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Stmt</em>'.
   * @generated
   */
  SeqStmt createSeqStmt();

  /**
   * Returns a new object of class '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt</em>'.
   * @generated
   */
  Stmt createStmt();

  /**
   * Returns a new object of class '<em>Atomic Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Stmt</em>'.
   * @generated
   */
  AtomicStmt createAtomicStmt();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QuartzPackage getQuartzPackage();

} //QuartzFactory
