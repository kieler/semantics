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

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Assignment assigns a new value to a {@link Variable}.
 * It carries a reference to a Variable and an {@link Expression} 
 * that represents the new value for that Variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Assignment#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Assignment#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Effect {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Object</em>' reference.
	 * @see #setValuedObject(ValuedObject)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAssignment_ValuedObject()
	 * @model required="true"
	 * @generated
	 */
    ValuedObject getValuedObject();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Assignment#getValuedObject <em>Valued Object</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valued Object</em>' reference.
	 * @see #getValuedObject()
	 * @generated
	 */
    void setValuedObject(ValuedObject value);

    /**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAssignment_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Expression getExpression();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Assignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
    void setExpression(Expression value);

				/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAssignment_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // Assignment
