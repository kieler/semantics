/**
 */
package de.cau.cs.kieler.core.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Call#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Call
