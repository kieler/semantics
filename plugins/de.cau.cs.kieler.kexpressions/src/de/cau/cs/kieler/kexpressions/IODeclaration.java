/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.IODeclaration#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.IODeclaration#isOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getIODeclaration()
 * @model abstract="true"
 * @generated
 */
public interface IODeclaration extends Declaration {
    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getIODeclaration_Input()
     * @model required="true"
     * @generated
     */
    boolean isInput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.IODeclaration#isInput <em>Input</em>}' attribute.
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
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #setOutput(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getIODeclaration_Output()
     * @model required="true"
     * @generated
     */
    boolean isOutput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.IODeclaration#isOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isOutput()
     * @generated
     */
    void setOutput(boolean value);

} // IODeclaration
