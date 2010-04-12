/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl;

import de.cau.cs.kieler.synccharts.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Variables#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage#getVariables_Vars()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVars();

} // Variables
