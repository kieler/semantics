/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualsynccharts.TextualTransition#getTargetStateProxy <em>Target State Proxy</em>}</li>
 *   <li>{@link textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}</li>
 *   <li>{@link textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualsynccharts.TextualsyncchartsPackage#getTextualTransition()
 * @model
 * @generated
 */
public interface TextualTransition extends Transition {
    /**
	 * Returns the value of the '<em><b>Target State Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target State Proxy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State Proxy</em>' attribute.
	 * @see #setTargetStateProxy(String)
	 * @see textualsynccharts.TextualsyncchartsPackage#getTextualTransition_TargetStateProxy()
	 * @model
	 * @generated
	 */
    String getTargetStateProxy();

    /**
	 * Sets the value of the '{@link textualsynccharts.TextualTransition#getTargetStateProxy <em>Target State Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State Proxy</em>' attribute.
	 * @see #getTargetStateProxy()
	 * @generated
	 */
    void setTargetStateProxy(String value);

				/**
	 * Returns the value of the '<em><b>Make Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Final</em>' attribute.
	 * @see #setMakeFinal(boolean)
	 * @see textualsynccharts.TextualsyncchartsPackage#getTextualTransition_MakeFinal()
	 * @model default="false"
	 * @generated
	 */
	boolean isMakeFinal();

				/**
	 * Sets the value of the '{@link textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Final</em>' attribute.
	 * @see #isMakeFinal()
	 * @generated
	 */
	void setMakeFinal(boolean value);

				/**
	 * Returns the value of the '<em><b>Make Conditional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Conditional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Conditional</em>' attribute.
	 * @see #setMakeConditional(boolean)
	 * @see textualsynccharts.TextualsyncchartsPackage#getTextualTransition_MakeConditional()
	 * @model default="false"
	 * @generated
	 */
	boolean isMakeConditional();

				/**
	 * Sets the value of the '{@link textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Conditional</em>' attribute.
	 * @see #isMakeConditional()
	 * @generated
	 */
	void setMakeConditional(boolean value);

} // TextualTransition
