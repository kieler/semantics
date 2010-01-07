/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proof Goal List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getGoals <em>Goals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getVer <em>Ver</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtrl <em>Ctrl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getAss <em>Ass</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList#getCtr <em>Ctr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList()
 * @model
 * @generated
 */
public interface ProofGoalList extends ObservedSpecList
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.QName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Name()
   * @model containment="true"
   * @generated
   */
  EList<QName> getName();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Expr()
   * @model containment="true"
   * @generated
   */
  EList<UtyExpr> getExpr();

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Goals()
   * @model containment="true"
   * @generated
   */
  EList<ProofGoalList> getGoals();

  /**
   * Returns the value of the '<em><b>Ver</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ver</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ver</em>' attribute list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Ver()
   * @model unique="false"
   * @generated
   */
  EList<String> getVer();

  /**
   * Returns the value of the '<em><b>Ctrl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.ControlList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ctrl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctrl</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Ctrl()
   * @model containment="true"
   * @generated
   */
  EList<ControlList> getCtrl();

  /**
   * Returns the value of the '<em><b>Ass</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.AssumeList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ass</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ass</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Ass()
   * @model containment="true"
   * @generated
   */
  EList<AssumeList> getAss();

  /**
   * Returns the value of the '<em><b>Ctr</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.ControlList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ctr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctr</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getProofGoalList_Ctr()
   * @model containment="true"
   * @generated
   */
  EList<ControlList> getCtr();

} // ProofGoalList
