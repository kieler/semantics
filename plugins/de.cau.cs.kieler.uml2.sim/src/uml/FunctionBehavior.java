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
 * A representation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function behavior is an opaque behavior that does not access or modify any objects or other external data.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getFunctionBehavior()
 * @model
 * @generated
 */
public interface FunctionBehavior extends OpaqueBehavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function behavior has at least one output parameter.
	 * self.ownedParameters->
	 *   select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size() >= 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean one_output_parameter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of parameters are all data types, which may not nest anything but other datatypes.
	 * def: hasAllDataTypeAttributes(d : DataType) : Boolean =
	 *   d.ownedAttribute->forAll(a |
	 *     a.type.oclIsTypeOf(DataType) and
	 *       hasAllDataTypeAttributes(a.type))
	 * self.ownedParameters->forAll(p | p.type.notEmpty() and
	 *   p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean types_of_parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FunctionBehavior
