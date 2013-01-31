/**
 */
package de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph;

import org.yakindu.sct.model.sgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncTransition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncgraphPackage#getSyncTransition()
 * @model
 * @generated
 */
public interface SyncTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.TransitionType
	 * @see #setType(TransitionType)
	 * @see de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncgraphPackage#getSyncTransition_Type()
	 * @model default="0"
	 * @generated
	 */
	TransitionType getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncTransition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.TransitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransitionType value);

} // SyncTransition
