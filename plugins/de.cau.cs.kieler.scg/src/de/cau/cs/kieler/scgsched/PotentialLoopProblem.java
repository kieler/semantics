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
package de.cau.cs.kieler.scgsched;

import de.cau.cs.kieler.scg.ControlFlow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Loop Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.PotentialLoopProblem#getControlFlows <em>Control Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getPotentialLoopProblem()
 * @model
 * @generated
 */
public interface PotentialLoopProblem extends Problem {
	/**
	 * Returns the value of the '<em><b>Control Flows</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scg.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flows</em>' reference list.
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getPotentialLoopProblem_ControlFlows()
	 * @model
	 * @generated
	 */
	EList<ControlFlow> getControlFlows();

} // PotentialLoopProblem
