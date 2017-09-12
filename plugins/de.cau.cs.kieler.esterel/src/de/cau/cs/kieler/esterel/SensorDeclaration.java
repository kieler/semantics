/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.SensorDeclaration#getValuedObjects <em>Valued Objects</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSensorDeclaration()
 * @model
 * @generated
 */
public interface SensorDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Sensor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valued Objects</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSensorDeclaration_ValuedObjects()
     * @model containment="true"
     * @generated
     */
    EList<Sensor> getValuedObjects();

} // SensorDeclaration
