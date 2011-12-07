/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ModuleInterface#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface()
 * @model
 * @generated
 */
public interface ModuleInterface extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Signal Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Signal Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntSignalDecls()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceSignalDecl> getIntSignalDecls();

  /**
   * Returns the value of the '<em><b>Int Type Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TypeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Type Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Type Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntTypeDecls()
   * @model containment="true"
   * @generated
   */
  EList<TypeDecl> getIntTypeDecls();

  /**
   * Returns the value of the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.SensorDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Sensor Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Sensor Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntSensorDecls()
   * @model containment="true"
   * @generated
   */
  EList<SensorDecl> getIntSensorDecls();

  /**
   * Returns the value of the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.ConstantDecls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Constant Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Constant Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntConstantDecls()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDecls> getIntConstantDecls();

  /**
   * Returns the value of the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.RelationDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Relation Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Relation Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntRelationDecls()
   * @model containment="true"
   * @generated
   */
  EList<RelationDecl> getIntRelationDecls();

  /**
   * Returns the value of the '<em><b>Int Task Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TaskDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Task Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Task Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntTaskDecls()
   * @model containment="true"
   * @generated
   */
  EList<TaskDecl> getIntTaskDecls();

  /**
   * Returns the value of the '<em><b>Int Function Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.FunctionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Function Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Function Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntFunctionDecls()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDecl> getIntFunctionDecls();

  /**
   * Returns the value of the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.ProcedureDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Procedure Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Procedure Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getModuleInterface_IntProcedureDecls()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDecl> getIntProcedureDecls();

} // ModuleInterface
