/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getInterfaceSignalDecl()
 * @model
 * @generated
 */
public interface InterfaceSignalDecl extends EObject
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getInterfaceSignalDecl_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ISignal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getInterfaceSignalDecl_Signals()
   * @model containment="true"
   * @generated
   */
  EList<ISignal> getSignals();

} // InterfaceSignalDecl
