/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;

import de.cau.cs.kieler.kexpressions.keffects.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.Loop#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.Loop#getInitializationDeclaration <em>Initialization Declaration</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.Loop#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.Loop#getAfterthought <em>Afterthought</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement, Scope {
    /**
     * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initialization</em>' containment reference.
     * @see #setInitialization(Assignment)
     * @see de.cau.cs.kieler.scl.SCLPackage#getLoop_Initialization()
     * @model containment="true"
     * @generated
     */
    Assignment getInitialization();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Loop#getInitialization <em>Initialization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initialization</em>' containment reference.
     * @see #getInitialization()
     * @generated
     */
    void setInitialization(Assignment value);

    /**
     * Returns the value of the '<em><b>Initialization Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initialization Declaration</em>' containment reference.
     * @see #setInitializationDeclaration(VariableDeclaration)
     * @see de.cau.cs.kieler.scl.SCLPackage#getLoop_InitializationDeclaration()
     * @model containment="true"
     * @generated
     */
    VariableDeclaration getInitializationDeclaration();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Loop#getInitializationDeclaration <em>Initialization Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initialization Declaration</em>' containment reference.
     * @see #getInitializationDeclaration()
     * @generated
     */
    void setInitializationDeclaration(VariableDeclaration value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see de.cau.cs.kieler.scl.SCLPackage#getLoop_Condition()
     * @model containment="true"
     * @generated
     */
    Expression getCondition();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Loop#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Afterthought</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Afterthought</em>' containment reference.
     * @see #setAfterthought(Assignment)
     * @see de.cau.cs.kieler.scl.SCLPackage#getLoop_Afterthought()
     * @model containment="true"
     * @generated
     */
    Assignment getAfterthought();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Loop#getAfterthought <em>Afterthought</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Afterthought</em>' containment reference.
     * @see #getAfterthought()
     * @generated
     */
    void setAfterthought(Assignment value);

} // Loop
