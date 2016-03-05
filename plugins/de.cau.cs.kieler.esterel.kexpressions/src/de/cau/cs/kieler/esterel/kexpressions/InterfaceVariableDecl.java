/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.InterfaceVariableDecl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getInterfaceVariableDecl()
 * @model
 * @generated
 */
public interface InterfaceVariableDecl extends InterfaceDeclaration {
    /**
     * Returns the value of the '<em><b>Var Decls</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.kexpressions.VariableDecl}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Var Decls</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Decls</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getInterfaceVariableDecl_VarDecls()
     * @model containment="true"
     * @generated
     */
    EList<VariableDecl> getVarDecls();

} // InterfaceVariableDecl
