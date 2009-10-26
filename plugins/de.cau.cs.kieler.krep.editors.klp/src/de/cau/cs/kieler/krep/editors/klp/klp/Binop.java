/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getVal <em>Val</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop()
 * @model
 * @generated
 */
public interface Binop extends Instruction {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.krep.editors.klp.klp.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Operator
	 * @see #setOp(Operator)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop_Op()
	 * @model
	 * @generated
	 */
	Operator getOp();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Operator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operator value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Reg)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop_To()
	 * @model
	 * @generated
	 */
	Reg getTo();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Reg value);

	/**
	 * Returns the value of the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg1</em>' containment reference.
	 * @see #setArg1(Read)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop_Arg1()
	 * @model containment="true"
	 * @generated
	 */
	Read getArg1();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg1 <em>Arg1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg1</em>' containment reference.
	 * @see #getArg1()
	 * @generated
	 */
	void setArg1(Read value);

	/**
	 * Returns the value of the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg2</em>' containment reference.
	 * @see #setArg2(Read)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop_Arg2()
	 * @model containment="true"
	 * @generated
	 */
	Read getArg2();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg2 <em>Arg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg2</em>' containment reference.
	 * @see #getArg2()
	 * @generated
	 */
	void setArg2(Read value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getBinop_Val()
	 * @model
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // Binop
