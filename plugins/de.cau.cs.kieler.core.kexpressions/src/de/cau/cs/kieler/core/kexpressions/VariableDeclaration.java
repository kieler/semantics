/**
 */
package de.cau.cs.kieler.core.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isConst <em>Const</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Declaration {
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
    ValueType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#getType <em>Type</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Input()
	 * @model required="true"
	 * @generated
	 */
    boolean isInput();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isInput <em>Input</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Output()
	 * @model required="true"
	 * @generated
	 */
    boolean isOutput();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isOutput <em>Output</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Static()
	 * @model required="true"
	 * @generated
	 */
    boolean isStatic();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isStatic <em>Static</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Signal()
	 * @model required="true"
	 * @generated
	 */
    boolean isSignal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #isSignal()
	 * @generated
	 */
    void setSignal(boolean value);

    /**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Const</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(boolean)
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Const()
	 * @model required="true"
	 * @generated
	 */
    boolean isConst();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #isConst()
	 * @generated
	 */
    void setConst(boolean value);

    /**
	 * Returns the value of the '<em><b>Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extern</em>' attribute.
	 * @see #setExtern(boolean)
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Extern()
	 * @model required="true"
	 * @generated
	 */
    boolean isExtern();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isExtern <em>Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern</em>' attribute.
	 * @see #isExtern()
	 * @generated
	 */
    void setExtern(boolean value);

    /**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_Volatile()
	 * @model required="true"
	 * @generated
	 */
    boolean isVolatile();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
    void setVolatile(boolean value);

    /**
	 * Returns the value of the '<em><b>Host Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Type</em>' attribute.
	 * @see #setHostType(String)
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getVariableDeclaration_HostType()
	 * @model
	 * @generated
	 */
    String getHostType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration#getHostType <em>Host Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Type</em>' attribute.
	 * @see #getHostType()
	 * @generated
	 */
    void setHostType(String value);

} // VariableDeclaration
