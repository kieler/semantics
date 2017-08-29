/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Parameter#isCallByReference <em>Call By Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Parameter#isPureOutput <em>Pure Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Parameter#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Parameter#getExplicitBinding <em>Explicit Binding</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Parameter#getExplicitBindingIndices <em>Explicit Binding Indices</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter()
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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter_CallByReference()
     * @model
     * @generated
     */
    boolean isCallByReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.Parameter#isCallByReference <em>Call By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call By Reference</em>' attribute.
     * @see #isCallByReference()
     * @generated
     */
    void setCallByReference(boolean value);

    /**
     * Returns the value of the '<em><b>Pure Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pure Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pure Output</em>' attribute.
     * @see #setPureOutput(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter_PureOutput()
     * @model
     * @generated
     */
    boolean isPureOutput();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.Parameter#isPureOutput <em>Pure Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pure Output</em>' attribute.
     * @see #isPureOutput()
     * @generated
     */
    void setPureOutput(boolean value);

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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter_Expression()
     * @model containment="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.Parameter#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Explicit Binding</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Explicit Binding</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Explicit Binding</em>' reference.
     * @see #setExplicitBinding(ValuedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter_ExplicitBinding()
     * @model
     * @generated
     */
    ValuedObject getExplicitBinding();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.Parameter#getExplicitBinding <em>Explicit Binding</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Explicit Binding</em>' reference.
     * @see #getExplicitBinding()
     * @generated
     */
    void setExplicitBinding(ValuedObject value);

    /**
     * Returns the value of the '<em><b>Explicit Binding Indices</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Explicit Binding Indices</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Explicit Binding Indices</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameter_ExplicitBindingIndices()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getExplicitBindingIndices();

} // Parameter
