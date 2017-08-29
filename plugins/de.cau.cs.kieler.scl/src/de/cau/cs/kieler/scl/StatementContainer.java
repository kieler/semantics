/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.annotations.Annotatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.StatementContainer#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getStatementContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementContainer extends Annotatable {
    /**
     * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.Statement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statements</em>' containment reference list.
     * @see de.cau.cs.kieler.scl.SCLPackage#getStatementContainer_Statements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getStatements();

} // StatementContainer
