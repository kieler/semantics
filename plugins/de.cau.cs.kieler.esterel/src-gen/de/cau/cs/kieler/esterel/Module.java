/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Module#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends de.cau.cs.kieler.scl.Module
{
  /**
   * Returns the value of the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.InterfaceSignalDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Signal Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Signal Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntSignalDecls()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceSignalDecl> getIntSignalDecls();

  /**
   * Returns the value of the '<em><b>Int Type Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Type Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Type Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntTypeDecls()
   * @model containment="true"
   * @generated
   */
  EList<TypeDecl> getIntTypeDecls();

  /**
   * Returns the value of the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.SensorDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Sensor Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Sensor Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntSensorDecls()
   * @model containment="true"
   * @generated
   */
  EList<SensorDecl> getIntSensorDecls();

  /**
   * Returns the value of the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.ConstantDecls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Constant Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Constant Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntConstantDecls()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDecls> getIntConstantDecls();

  /**
   * Returns the value of the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.RelationDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Relation Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Relation Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntRelationDecls()
   * @model containment="true"
   * @generated
   */
  EList<RelationDecl> getIntRelationDecls();

  /**
   * Returns the value of the '<em><b>Int Task Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.TaskDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Task Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Task Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntTaskDecls()
   * @model containment="true"
   * @generated
   */
  EList<TaskDecl> getIntTaskDecls();

  /**
   * Returns the value of the '<em><b>Int Function Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.FunctionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Function Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Function Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntFunctionDecls()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDecl> getIntFunctionDecls();

  /**
   * Returns the value of the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.ProcedureDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Procedure Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Procedure Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModule_IntProcedureDecls()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDecl> getIntProcedureDecls();

} // Module
