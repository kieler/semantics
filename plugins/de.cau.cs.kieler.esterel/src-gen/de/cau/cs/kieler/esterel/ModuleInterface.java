/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

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
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntSignalDecl <em>Int Signal Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntTypeDecl <em>Int Type Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntSensorDecl <em>Int Sensor Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntConstantDecl <em>Int Constant Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntRelationDecl <em>Int Relation Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleInterface#getIntFunctionDecl <em>Int Function Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface()
 * @model
 * @generated
 */
public interface ModuleInterface extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Signal Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.SignalDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Signal Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Signal Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntSignalDecl()
   * @model containment="true"
   * @generated
   */
  EList<SignalDecl> getIntSignalDecl();

  /**
   * Returns the value of the '<em><b>Int Type Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Type Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Type Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntTypeDecl()
   * @model containment="true"
   * @generated
   */
  EList<TypeDecl> getIntTypeDecl();

  /**
   * Returns the value of the '<em><b>Int Sensor Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.SensorDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Sensor Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Sensor Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntSensorDecl()
   * @model containment="true"
   * @generated
   */
  EList<SensorDecl> getIntSensorDecl();

  /**
   * Returns the value of the '<em><b>Int Constant Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.ConstantDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Constant Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Constant Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntConstantDecl()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDecl> getIntConstantDecl();

  /**
   * Returns the value of the '<em><b>Int Relation Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.RelationDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Relation Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Relation Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntRelationDecl()
   * @model containment="true"
   * @generated
   */
  EList<RelationDecl> getIntRelationDecl();

  /**
   * Returns the value of the '<em><b>Int Function Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.FunctionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Function Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Function Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleInterface_IntFunctionDecl()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDecl> getIntFunctionDecl();

} // ModuleInterface
