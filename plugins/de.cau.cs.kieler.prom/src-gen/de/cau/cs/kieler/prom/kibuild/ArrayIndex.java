/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.ArrayIndex#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getArrayIndex()
 * @model
 * @generated
 */
public interface ArrayIndex extends EObject
{
  /**
   * Returns the value of the '<em><b>Indices</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' attribute list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getArrayIndex_Indices()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIndices();

} // ArrayIndex
