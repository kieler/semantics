/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISignal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ISignal#getChannelDescr <em>Channel Descr</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getISignal()
 * @model
 * @generated
 */
public interface ISignal extends Signal {
    /**
	 * Returns the value of the '<em><b>Channel Descr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel Descr</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Descr</em>' containment reference.
	 * @see #setChannelDescr(ChannelDescription)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getISignal_ChannelDescr()
	 * @model containment="true"
	 * @generated
	 */
    ChannelDescription getChannelDescr();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ISignal#getChannelDescr <em>Channel Descr</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Descr</em>' containment reference.
	 * @see #getChannelDescr()
	 * @generated
	 */
    void setChannelDescr(ChannelDescription value);

} // ISignal
