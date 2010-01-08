/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTa <em>Ta</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTb <em>Tb</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTc <em>Tc</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQType()
 * @model
 * @generated
 */
public interface QType extends EObject
{
  /**
   * Returns the value of the '<em><b>Ta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ta</em>' containment reference.
   * @see #setTa(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQType_Ta()
   * @model containment="true"
   * @generated
   */
  UtyExpr getTa();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTa <em>Ta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ta</em>' containment reference.
   * @see #getTa()
   * @generated
   */
  void setTa(UtyExpr value);

  /**
   * Returns the value of the '<em><b>Tb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tb</em>' containment reference.
   * @see #setTb(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQType_Tb()
   * @model containment="true"
   * @generated
   */
  UtyExpr getTb();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTb <em>Tb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tb</em>' containment reference.
   * @see #getTb()
   * @generated
   */
  void setTb(UtyExpr value);

  /**
   * Returns the value of the '<em><b>Tc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tc</em>' containment reference.
   * @see #setTc(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQType_Tc()
   * @model containment="true"
   * @generated
   */
  UtyExpr getTc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getTc <em>Tc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tc</em>' containment reference.
   * @see #getTc()
   * @generated
   */
  void setTc(UtyExpr value);

  /**
   * Returns the value of the '<em><b>Dims</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dims</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dims</em>' containment reference.
   * @see #setDims(DimList)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQType_Dims()
   * @model containment="true"
   * @generated
   */
  DimList getDims();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QType#getDims <em>Dims</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dims</em>' containment reference.
   * @see #getDims()
   * @generated
   */
  void setDims(DimList value);

} // QType
