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
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Duration defines a value specification that specifies the temporal distance between two time instants.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Duration#getExpr <em>Expr</em>}</li>
 *   <li>{@link uml.Duration#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends ValueSpecification {
    /**
     * Returns the value of the '<em><b>Expr</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value of the Duration.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Expr</em>' reference.
     * @see #setExpr(ValueSpecification)
     * @see uml.UmlPackage#getDuration_Expr()
     * @model ordered="false"
     * @generated
     */
    ValueSpecification getExpr();

    /**
     * Sets the value of the '{@link uml.Duration#getExpr <em>Expr</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expr</em>' reference.
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
     * @see uml.UmlPackage#getDuration_Observation()
     * @model ordered="false"
     * @generated
     */
    EList<Observation> getObservation();

} // Duration
