/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.FunctionCall#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Call {
    /**
     * Returns the value of the '<em><b>Function Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function Name</em>' attribute.
     * @see #setFunctionName(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getFunctionCall_FunctionName()
     * @model
     * @generated
     */
    String getFunctionName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.FunctionCall#getFunctionName <em>Function Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function Name</em>' attribute.
     * @see #getFunctionName()
     * @generated
     */
    void setFunctionName(String value);

} // FunctionCall
