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
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.DefineNode#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DefineNode#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DefineNode#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DefineNode#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DefineNode#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode()
 * @model
 * @generated
 */
public interface DefineNode extends Node {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode_Inputs()
	 * @model containment="true"
	 * @generated
	 */
    EList<Declaration> getInputs();

    /**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode_Outputs()
	 * @model containment="true"
	 * @generated
	 */
    EList<Declaration> getOutputs();

    /**
	 * Returns the value of the '<em><b>Valued Objects</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Objects</em>' reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode_ValuedObjects()
	 * @model
	 * @generated
	 */
    EList<ValuedObject> getValuedObjects();

    /**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expressions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode_Expressions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Expression> getExpressions();

    /**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.sccharts.State}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDefineNode_States()
	 * @model containment="true"
	 * @generated
	 */
    EList<State> getStates();

} // DefineNode
