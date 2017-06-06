/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base Class for Variables and Signals. A ValuedObject has a name and may carry a value. 
 * Therefore the class has a type attribute which specifies the type of the value. 
 * The type might either be given from a predefined list of internal (primitive) types or by the hostType String that 
 * references some type in the target language, e.g. a Type in C or Java. An initial value can be given in String format.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObject#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObject#getCardinalities <em>Cardinalities</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObject()
 * @model
 * @generated
 */
public interface ValuedObject extends Annotatable {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObject_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Value</em>' containment reference.
     * @see #setInitialValue(Expression)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObject_InitialValue()
     * @model containment="true"
     * @generated
     */
    Expression getInitialValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Value</em>' containment reference.
     * @see #getInitialValue()
     * @generated
     */
    void setInitialValue(Expression value);

    /**
     * Returns the value of the '<em><b>Cardinalities</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinalities</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObject_Cardinalities()
     * @model containment="true"
     * @generated
     */
	EList<Expression> getCardinalities();

				/**
     * Returns the value of the '<em><b>Combine Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.CombineOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combine Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @see #setCombineOperator(CombineOperator)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObject_CombineOperator()
     * @model required="true"
     * @generated
     */
    CombineOperator getCombineOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @see #getCombineOperator()
     * @generated
     */
    void setCombineOperator(CombineOperator value);

} // ValuedObject
