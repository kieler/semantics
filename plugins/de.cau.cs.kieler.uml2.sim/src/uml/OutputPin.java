/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An output pin is a pin that holds output values produced by an action.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getOutputPin()
 * @model
 * @generated
 */
public interface OutputPin extends Pin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output pins may have incoming edges only when they are on actions that are structured nodes, and these edges may not target a node contained by the structured node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean incoming_edges_structured_only(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OutputPin
