/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time constraint is a constraint that refers to a time interval.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TimeConstraint#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint {
    /**
     * Returns the value of the '<em><b>First Event</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value of firstEvent is related to constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within constrainedElement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Event</em>' attribute.
     * @see #setFirstEvent(boolean)
     * @see uml.UmlPackage#getTimeConstraint_FirstEvent()
     * @model default="true" dataType="uml.Boolean" ordered="false"
     * @generated
     */
    boolean isFirstEvent();

    /**
     * Sets the value of the '{@link uml.TimeConstraint#isFirstEvent <em>First Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Event</em>' attribute.
     * @see #isFirstEvent()
     * @generated
     */
    void setFirstEvent(boolean value);

} // TimeConstraint
