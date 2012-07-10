/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.EndLoop#getEndOpt <em>End Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getEndLoop()
 * @model
 * @generated
 */
public interface EndLoop extends EObject
{
  /**
   * Returns the value of the '<em><b>End Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Opt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Opt</em>' attribute.
   * @see #setEndOpt(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getEndLoop_EndOpt()
   * @model
   * @generated
   */
  String getEndOpt();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.EndLoop#getEndOpt <em>End Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Opt</em>' attribute.
   * @see #getEndOpt()
   * @generated
   */
  void setEndOpt(String value);

} // EndLoop
