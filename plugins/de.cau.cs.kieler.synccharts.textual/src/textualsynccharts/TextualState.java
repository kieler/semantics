/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textualsynccharts.TextualState#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link textualsynccharts.TextualState#getOutputSignals <em>Output Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see textualsynccharts.TextualsyncchartsPackage#getTextualState()
 * @model
 * @generated
 */
public interface TextualState extends State {

	/**
	 * Returns the value of the '<em><b>Input Signals</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Signals</em>' containment reference list.
	 * @see textualsynccharts.TextualsyncchartsPackage#getTextualState_InputSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getInputSignals();

	/**
	 * Returns the value of the '<em><b>Output Signals</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Signals</em>' containment reference list.
	 * @see textualsynccharts.TextualsyncchartsPackage#getTextualState_OutputSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getOutputSignals();
} // TextualState
