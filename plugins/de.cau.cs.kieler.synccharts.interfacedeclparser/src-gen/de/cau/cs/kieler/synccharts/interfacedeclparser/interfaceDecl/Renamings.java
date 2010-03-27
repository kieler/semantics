/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl;

import de.cau.cs.kieler.synccharts.Renaming;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renamings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Renamings#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage#getRenamings()
 * @model
 * @generated
 */
public interface Renamings extends EObject
{
  /**
   * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.Renaming}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Renamings</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage#getRenamings_Renamings()
   * @model containment="true"
   * @generated
   */
  EList<Renaming> getRenamings();

} // Renamings
