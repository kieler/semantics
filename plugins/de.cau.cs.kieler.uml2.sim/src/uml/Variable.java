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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variables are elements for passing data between actions indirectly. A local variable stores values shared by the actions within a structured activity group but not accessible outside it. The output of an action may be written to a variable and read for the input to a subsequent action, which is effectively an indirect data flow path. Because there is no predefined relationship between actions that read and write variables, these actions must be sequenced by control flows to prevent race conditions that may occur between actions that read or write the same variable.
 * A variable is considered a connectable element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Variable#getScope <em>Scope</em>}</li>
 *   <li>{@link uml.Variable#getActivityScope <em>Activity Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ConnectableElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.StructuredActivityNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured activity node that owns the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(StructuredActivityNode)
	 * @see uml.UmlPackage#getVariable_Scope()
	 * @see uml.StructuredActivityNode#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getScope();

	/**
	 * Sets the value of the '{@link uml.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Activity Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Activity#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity that owns the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Scope</em>' container reference.
	 * @see #setActivityScope(Activity)
	 * @see uml.UmlPackage#getVariable_ActivityScope()
	 * @see uml.Activity#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivityScope();

	/**
	 * Sets the value of the '{@link uml.Variable#getActivityScope <em>Activity Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Scope</em>' container reference.
	 * @see #getActivityScope()
	 * @generated
	 */
	void setActivityScope(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable is owned by a StructuredNode or Activity, but not both.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean owned(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The isAccessibleBy() operation is not defined in standard UML. Implementations should define it to specify which actions can access a variable.
	 * 
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="uml.Boolean" required="true" ordered="false" aRequired="true" aOrdered="false"
	 * @generated
	 */
	boolean isAccessibleBy(Action a);

} // Variable
