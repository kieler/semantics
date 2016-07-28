/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.NamedObject;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getCardinalities <em>Cardinalities</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject()
 * @model
 * @generated
 */
public interface ValuedObject extends NamedObject, Annotatable, Referenceable {
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
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_InitialValue()
     * @model containment="true"
     * @generated
     */
    Expression getInitialValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Value</em>' containment reference.
     * @see #getInitialValue()
     * @generated
     */
    void setInitialValue(Expression value);

    /**
     * Returns the value of the '<em><b>Cardinalities</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinalities</em>' attribute list.
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Cardinalities()
     * @model
     * @generated
     */
	EList<Integer> getCardinalities();

				/**
     * Returns the value of the '<em><b>Combine Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.kexpressions.CombineOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combine Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
     * @see #setCombineOperator(CombineOperator)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_CombineOperator()
     * @model required="true"
     * @generated
     */
    CombineOperator getCombineOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
     * @see #getCombineOperator()
     * @generated
     */
    void setCombineOperator(CombineOperator value);

} // ValuedObject
