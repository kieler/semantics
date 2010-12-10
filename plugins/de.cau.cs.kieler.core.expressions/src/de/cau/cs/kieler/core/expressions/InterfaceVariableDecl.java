/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.InterfaceVariableDecl#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getInterfaceVariableDecl()
 * @model
 * @generated
 */
public interface InterfaceVariableDecl extends InterfaceDeclaration {
    /**
     * Returns the value of the '<em><b>Var Decls</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.expressions.VariableDecl}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Var Decls</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Decls</em>' containment reference list.
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getInterfaceVariableDecl_VarDecls()
     * @model containment="true"
     * @generated
     */
    EList<VariableDecl> getVarDecls();

} // InterfaceVariableDecl
