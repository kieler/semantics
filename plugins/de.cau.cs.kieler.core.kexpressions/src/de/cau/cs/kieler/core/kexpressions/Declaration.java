/**
 */
package de.cau.cs.kieler.core.kexpressions;

import de.cau.cs.kieler.core.annotations.Annotatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isConst <em>Const</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#isExtern <em>Extern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Annotatable {
    /**
	 * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Objects</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_ValuedObjects()
	 * @model containment="true"
	 * @generated
	 */
    EList<ValuedObject> getValuedObjects();

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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
    ValueType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#getType <em>Type</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Input()
	 * @model required="true"
	 * @generated
	 */
    boolean isInput();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isInput <em>Input</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Output()
	 * @model required="true"
	 * @generated
	 */
    boolean isOutput();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isOutput <em>Output</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Static()
	 * @model required="true"
	 * @generated
	 */
    boolean isStatic();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isStatic <em>Static</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Signal()
	 * @model required="true"
	 * @generated
	 */
    boolean isSignal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isSignal <em>Signal</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Const()
	 * @model required="true"
	 * @generated
	 */
    boolean isConst();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isConst <em>Const</em>}' attribute.
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
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_Extern()
	 * @model required="true"
	 * @generated
	 */
    boolean isExtern();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.Declaration#isExtern <em>Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern</em>' attribute.
	 * @see #isExtern()
	 * @generated
	 */
    void setExtern(boolean value);

} // Declaration
