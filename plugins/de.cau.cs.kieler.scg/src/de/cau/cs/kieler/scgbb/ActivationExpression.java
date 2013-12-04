/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgbb;

import de.cau.cs.kieler.core.kexpressions.Expression;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getBasicBlocks <em>Basic Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression()
 * @model
 * @generated
 */
public interface ActivationExpression extends EObject {
    /**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Expression> getExpressions();

    /**
	 * Returns the value of the '<em><b>Basic Blocks</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.BasicBlock}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Blocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Blocks</em>' reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_BasicBlocks()
	 * @model
	 * @generated
	 */
    EList<BasicBlock> getBasicBlocks();

} // ActivationExpression
