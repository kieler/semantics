/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.textualsynccharts;

import de.cau.cs.kieler.synccharts.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeInitial <em>Make Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsPackage#getTextualTransition()
 * @model
 * @generated
 */
public interface TextualTransition extends Transition {
    /**
     * Returns the value of the '<em><b>Make Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Make Final</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Make Final</em>' attribute.
     * @see #setMakeFinal(boolean)
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsPackage#getTextualTransition_MakeFinal()
     * @model
     * @generated
     */
    boolean isMakeFinal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Make Final</em>' attribute.
     * @see #isMakeFinal()
     * @generated
     */
    void setMakeFinal(boolean value);

    /**
     * Returns the value of the '<em><b>Make Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Make Initial</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Make Initial</em>' attribute.
     * @see #setMakeInitial(boolean)
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsPackage#getTextualTransition_MakeInitial()
     * @model
     * @generated
     */
    boolean isMakeInitial();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeInitial <em>Make Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Make Initial</em>' attribute.
     * @see #isMakeInitial()
     * @generated
     */
    void setMakeInitial(boolean value);

    /**
     * Returns the value of the '<em><b>Make Conditional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Make Conditional</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Make Conditional</em>' attribute.
     * @see #setMakeConditional(boolean)
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsPackage#getTextualTransition_MakeConditional()
     * @model
     * @generated
     */
    boolean isMakeConditional();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Make Conditional</em>' attribute.
     * @see #isMakeConditional()
     * @generated
     */
    void setMakeConditional(boolean value);

} // TextualTransition
