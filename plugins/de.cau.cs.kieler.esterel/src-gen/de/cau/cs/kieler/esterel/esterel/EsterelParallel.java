/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.scl.scl.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.EsterelParallel#getThreads <em>Threads</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getEsterelParallel()
 * @model
 * @generated
 */
public interface EsterelParallel extends Statement
{
  /**
   * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.EsterelThread}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threads</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getEsterelParallel_Threads()
   * @model containment="true"
   * @generated
   */
  EList<EsterelThread> getThreads();

} // EsterelParallel
