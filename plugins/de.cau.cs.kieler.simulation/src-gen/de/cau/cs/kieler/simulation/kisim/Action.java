/**
 */
package de.cau.cs.kieler.simulation.kisim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.Action#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.Action#getHandler <em>Handler</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.Action#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.simulation.kisim.ActionOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see de.cau.cs.kieler.simulation.kisim.ActionOperation
   * @see #setOperation(ActionOperation)
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getAction_Operation()
   * @model
   * @generated
   */
  ActionOperation getOperation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.simulation.kisim.Action#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see de.cau.cs.kieler.simulation.kisim.ActionOperation
   * @see #getOperation()
   * @generated
   */
  void setOperation(ActionOperation value);

  /**
   * Returns the value of the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler</em>' attribute.
   * @see #setHandler(String)
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getAction_Handler()
   * @model
   * @generated
   */
  String getHandler();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.simulation.kisim.Action#getHandler <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler</em>' attribute.
   * @see #getHandler()
   * @generated
   */
  void setHandler(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getAction_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.simulation.kisim.Action#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Action
