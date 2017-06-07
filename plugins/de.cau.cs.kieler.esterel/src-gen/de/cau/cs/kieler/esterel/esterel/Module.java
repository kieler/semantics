/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.scl.scl.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Module#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Module#getName <em>Name</em>}' attribute.
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntSignalDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntTypeDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntSensorDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntConstantDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntRelationDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntTaskDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntFunctionDecls()
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_IntProcedureDecls()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDecl> getIntProcedureDecls();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getModule_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Module
