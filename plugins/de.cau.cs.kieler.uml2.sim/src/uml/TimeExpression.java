/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time expression defines a value specification that represents a time value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TimeExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link uml.TimeExpression#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the time expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ValueSpecification)
	 * @see uml.UmlPackage#getTimeExpression_Expr()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getExpr();

	/**
	 * Sets the value of the '{@link uml.TimeExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link uml.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the time and duration observations that are involved in expr.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see uml.UmlPackage#getTimeExpression_Observation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Observation> getObservation();

} // TimeExpression
