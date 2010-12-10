/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Signal is the first-class data object in synchronous languages used for communication.
 * Signals extend ValuedObject and therefore have a name and may carry a value. A Signal can
 * be part of a module's interface and therefore be an input, an output (or even both). If a Signal
 * is neither input nor output, it is considered to be a local signal with a limited scope not visible
 * to the outside.
 * <p>
 * As the value of a Signal is unique in one tick, the interpreter needs to know how to handle 
 * multiple emissions of the same Signal in a tick. Therefore a combineOperator can be set. Such 
 * operator needs to be commutative. It can be chosen from a pre-defined enumeration or by
 * a String referencing a function in the target language (e.g. a C or Java function name that 
 * has exactly two parameters and produces one combined result of the corresponding data type).
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Signal#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Signal#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Signal#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Signal#getHostCombineOperator <em>Host Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends ValuedObject {
    /**
     * Returns the value of the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Input</em>' attribute.
     * @see #setIsInput(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getSignal_IsInput()
     * @model required="true"
     * @generated
     */
    boolean isIsInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Signal#isIsInput <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Input</em>' attribute.
     * @see #isIsInput()
     * @generated
     */
    void setIsInput(boolean value);

    /**
     * Returns the value of the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Output</em>' attribute.
     * @see #setIsOutput(boolean)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getSignal_IsOutput()
     * @model required="true"
     * @generated
     */
    boolean isIsOutput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Signal#isIsOutput <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Output</em>' attribute.
     * @see #isIsOutput()
     * @generated
     */
    void setIsOutput(boolean value);

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
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getSignal_CombineOperator()
     * @model required="true"
     * @generated
     */
    CombineOperator getCombineOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Signal#getCombineOperator <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
     * @see #getCombineOperator()
     * @generated
     */
    void setCombineOperator(CombineOperator value);

    /**
     * Returns the value of the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Combine Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host Combine Operator</em>' attribute.
     * @see #setHostCombineOperator(String)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getSignal_HostCombineOperator()
     * @model
     * @generated
     */
    String getHostCombineOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Signal#getHostCombineOperator <em>Host Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host Combine Operator</em>' attribute.
     * @see #getHostCombineOperator()
     * @generated
     */
    void setHostCombineOperator(String value);

} // Signal
