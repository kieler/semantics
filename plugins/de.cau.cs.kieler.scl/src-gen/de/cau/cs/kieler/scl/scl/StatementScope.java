/**
 */
package de.cau.cs.kieler.scl.scl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.StatementScope#getValuedObjects <em>Valued Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementScope()
 * @model
 * @generated
 */
public interface StatementScope extends Instruction, StatementSequence
{
  /**
   * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valued Objects</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementScope_ValuedObjects()
   * @model containment="true"
   * @generated
   */
  EList<ValuedObject> getValuedObjects();

} // StatementScope
