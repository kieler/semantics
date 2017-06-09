/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;

import de.cau.cs.kieler.kexpressions.Declaration;

import de.cau.cs.kieler.scl.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Est Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule()
 * @model
 * @generated
 */
public interface SCEstModule extends StatementContainer
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Signal Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Signal Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntSignalDecls()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceSignalDecl> getIntSignalDecls();

  /**
   * Returns the value of the '<em><b>Int Type Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.TypeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Type Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Type Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntTypeDecls()
   * @model containment="true"
   * @generated
   */
  EList<TypeDecl> getIntTypeDecls();

  /**
   * Returns the value of the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.SensorDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Sensor Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Sensor Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntSensorDecls()
   * @model containment="true"
   * @generated
   */
  EList<SensorDecl> getIntSensorDecls();

  /**
   * Returns the value of the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ConstantDecls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Constant Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Constant Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntConstantDecls()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDecls> getIntConstantDecls();

  /**
   * Returns the value of the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.RelationDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Relation Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Relation Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntRelationDecls()
   * @model containment="true"
   * @generated
   */
  EList<RelationDecl> getIntRelationDecls();

  /**
   * Returns the value of the '<em><b>Int Task Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.TaskDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Task Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Task Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntTaskDecls()
   * @model containment="true"
   * @generated
   */
  EList<TaskDecl> getIntTaskDecls();

  /**
   * Returns the value of the '<em><b>Int Function Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.FunctionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Function Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Function Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntFunctionDecls()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDecl> getIntFunctionDecls();

  /**
   * Returns the value of the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ProcedureDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Procedure Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Procedure Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_IntProcedureDecls()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDecl> getIntProcedureDecls();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // SCEstModule
