/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;

import de.cau.cs.kieler.core.annotations.Annotatable;

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
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject()
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
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Type()
     * @model required="true"
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #getType()
     * @generated
     */
    void setType(ValueType value);

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Input()
     * @model required="true"
     * @generated
     */
    boolean isInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isInput()
     * @generated
     */
    void setInput(boolean value);

    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #setOutput(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Output()
     * @model required="true"
     * @generated
     */
    boolean isOutput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isOutput()
     * @generated
     */
    void setOutput(boolean value);

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Static()
     * @model required="true"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Returns the value of the '<em><b>Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal</em>' attribute.
     * @see #setSignal(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getValuedObject_Signal()
     * @model required="true"
     * @generated
     */
    boolean isSignal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isSignal <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' attribute.
     * @see #isSignal()
     * @generated
     */
    void setSignal(boolean value);

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
