/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getVal <em>Val</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getTrue <em>True</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getFalse <em>False</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(String)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_True()
   * @model
   * @generated
   */
  String getTrue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #getTrue()
   * @generated
   */
  void setTrue(String value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(String)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_False()
   * @model
   * @generated
   */
  String getFalse();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #getFalse()
   * @generated
   */
  void setFalse(String value);

} // Data
