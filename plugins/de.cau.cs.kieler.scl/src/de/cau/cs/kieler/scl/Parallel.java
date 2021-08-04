/**
 */
package de.cau.cs.kieler.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.Parallel#getThreads <em>Threads</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.Parallel#isJoinAny <em>Join Any</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.Parallel#getForkType <em>Fork Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Statement {
    /**
     * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.Thread}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threads</em>' containment reference list.
     * @see de.cau.cs.kieler.scl.SCLPackage#getParallel_Threads()
     * @model containment="true"
     * @generated
     */
    EList<de.cau.cs.kieler.scl.Thread> getThreads();

    /**
     * Returns the value of the '<em><b>Join Any</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Join Any</em>' attribute.
     * @see #setJoinAny(boolean)
     * @see de.cau.cs.kieler.scl.SCLPackage#getParallel_JoinAny()
     * @model
     * @generated
     */
    boolean isJoinAny();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Parallel#isJoinAny <em>Join Any</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Join Any</em>' attribute.
     * @see #isJoinAny()
     * @generated
     */
    void setJoinAny(boolean value);

    /**
     * Returns the value of the '<em><b>Fork Type</b></em>' attribute.
     * The default value is <code>"PARALLEL"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.scl.ForkType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fork Type</em>' attribute.
     * @see de.cau.cs.kieler.scl.ForkType
     * @see #setForkType(ForkType)
     * @see de.cau.cs.kieler.scl.SCLPackage#getParallel_ForkType()
     * @model default="PARALLEL" required="true"
     * @generated
     */
    ForkType getForkType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Parallel#getForkType <em>Fork Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fork Type</em>' attribute.
     * @see de.cau.cs.kieler.scl.ForkType
     * @see #getForkType()
     * @generated
     */
    void setForkType(ForkType value);

} // Parallel
