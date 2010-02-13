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
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isTrue <em>True</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isFalse <em>False</em>}</li>
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
   * Returns the value of the '<em><b>Int Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Val</em>' attribute.
   * @see #setIntVal(int)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_IntVal()
   * @model
   * @generated
   */
  int getIntVal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getIntVal <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Val</em>' attribute.
   * @see #getIntVal()
   * @generated
   */
  void setIntVal(int value);

  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(boolean)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_True()
   * @model
   * @generated
   */
  boolean isTrue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #isTrue()
   * @generated
   */
  void setTrue(boolean value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(boolean)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getData_False()
   * @model
   * @generated
   */
  boolean isFalse();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #isFalse()
   * @generated
   */
  void setFalse(boolean value);

} // Data
