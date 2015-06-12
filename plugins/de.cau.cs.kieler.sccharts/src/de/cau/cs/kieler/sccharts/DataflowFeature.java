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

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataflow Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.DataflowFeature#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DataflowFeature#getNode <em>Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.DataflowFeature#getValuedObject <em>Valued Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDataflowFeature()
 * @model
 * @generated
 */
public interface DataflowFeature extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDataflowFeature_Expression()
     * @model containment="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.DataflowFeature#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' reference.
     * @see #setNode(Node)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDataflowFeature_Node()
     * @model
     * @generated
     */
    Node getNode();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.DataflowFeature#getNode <em>Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' reference.
     * @see #getNode()
     * @generated
     */
    void setNode(Node value);

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
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getDataflowFeature_ValuedObject()
     * @model
     * @generated
     */
    ValuedObject getValuedObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.DataflowFeature#getValuedObject <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valued Object</em>' reference.
     * @see #getValuedObject()
     * @generated
     */
    void setValuedObject(ValuedObject value);

} // DataflowFeature
