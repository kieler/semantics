/**
 */
package de.cau.cs.kieler.core.kexpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Parameter#isCallByReference <em>Call By Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Parameter#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
	 * Returns the value of the '<em><b>Call By Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call By Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Call By Reference</em>' attribute.
	 * @see #setCallByReference(boolean)
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getParameter_CallByReference()
	 * @model
	 * @generated
	 */
    boolean isCallByReference();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Parameter#isCallByReference <em>Call By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call By Reference</em>' attribute.
	 * @see #isCallByReference()
	 * @generated
	 */
    void setCallByReference(boolean value);

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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getParameter_Expression()
	 * @model containment="true"
	 * @generated
	 */
    Expression getExpression();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Parameter#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
    void setExpression(Expression value);

} // Parameter
