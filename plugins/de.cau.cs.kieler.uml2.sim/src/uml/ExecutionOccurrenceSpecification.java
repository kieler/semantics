/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An execution occurrence specification represents moments in time at which actions or behaviors start or finish.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getExecutionOccurrenceSpecification()
 * @model
 * @generated
 */
public interface ExecutionOccurrenceSpecification extends OccurrenceSpecification {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the execution specification describing the execution that is started or finished at this execution event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(ExecutionSpecification)
	 * @see uml.UmlPackage#getExecutionOccurrenceSpecification_Execution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionSpecification getExecution();

	/**
	 * Sets the value of the '{@link uml.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(ExecutionSpecification value);

} // ExecutionOccurrenceSpecification
