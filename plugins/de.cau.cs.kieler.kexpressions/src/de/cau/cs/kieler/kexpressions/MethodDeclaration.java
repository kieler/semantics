/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#isOverride <em>Override</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#getReturnHostType <em>Return Host Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends Declaration, Schedulable {
    /**
     * Returns the value of the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Override</em>' attribute.
     * @see #setOverride(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getMethodDeclaration_Override()
     * @model
     * @generated
     */
    boolean isOverride();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#isOverride <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Override</em>' attribute.
     * @see #isOverride()
     * @generated
     */
    void setOverride(boolean value);

    /**
     * Returns the value of the '<em><b>Return Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setReturnType(ValueType)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getMethodDeclaration_ReturnType()
     * @model
     * @generated
     */
    ValueType getReturnType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#getReturnType <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getReturnType()
     * @generated
     */
    void setReturnType(ValueType value);

    /**
     * Returns the value of the '<em><b>Return Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Host Type</em>' attribute.
     * @see #setReturnHostType(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getMethodDeclaration_ReturnHostType()
     * @model
     * @generated
     */
    String getReturnHostType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.MethodDeclaration#getReturnHostType <em>Return Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Host Type</em>' attribute.
     * @see #getReturnHostType()
     * @generated
     */
    void setReturnHostType(String value);

    /**
     * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getMethodDeclaration_ParameterDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getParameterDeclarations();

} // MethodDeclaration
