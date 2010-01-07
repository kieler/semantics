/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointed Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#isAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getPointedName()
 * @model
 * @generated
 */
public interface PointedName extends PackagePath
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getPointedName_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.PointedName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getPointedName_Name()
   * @model containment="true"
   * @generated
   */
  EList<PointedName> getName();

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getPointedName_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

} // PointedName
