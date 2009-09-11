/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Await Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.AwaitCase#getCases <em>Cases</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.AwaitCase#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getAwaitCase()
 * @model
 * @generated
 */
public interface AwaitCase extends AwaitBody
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.AbortCaseSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getAwaitCase_Cases()
   * @model containment="true"
   * @generated
   */
  EList<AbortCaseSingle> getCases();

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getAwaitCase_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.AwaitCase#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // AwaitCase
