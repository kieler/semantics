/**
 */
package de.cau.cs.kieler.kicool;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.kexpressions.JsonObjectValue;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getProcessors <em>Processors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getIntermediates <em>Intermediates</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getConfig <em>Config</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#isPublic <em>Public</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#isDeveloper <em>Developer</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#isSimulation <em>Simulation</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Pragmatable, Annotatable {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Processors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processors</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processors</em>' containment reference.
     * @see #setProcessors(ProcessorEntry)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Processors()
     * @model containment="true"
     * @generated
     */
    ProcessorEntry getProcessors();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getProcessors <em>Processors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processors</em>' containment reference.
     * @see #getProcessors()
     * @generated
     */
    void setProcessors(ProcessorEntry value);

    /**
     * Returns the value of the '<em><b>Intermediates</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.IntermediateReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intermediates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intermediates</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Intermediates()
     * @model containment="true"
     * @generated
     */
    EList<IntermediateReference> getIntermediates();

    /**
     * Returns the value of the '<em><b>Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config</em>' containment reference.
     * @see #setConfig(JsonObjectValue)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Config()
     * @model containment="true"
     * @generated
     */
    JsonObjectValue getConfig();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getConfig <em>Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config</em>' containment reference.
     * @see #getConfig()
     * @generated
     */
    void setConfig(JsonObjectValue value);

    /**
     * Returns the value of the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Public</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Public</em>' attribute.
     * @see #setPublic(boolean)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Public()
     * @model
     * @generated
     */
    boolean isPublic();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#isPublic <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Public</em>' attribute.
     * @see #isPublic()
     * @generated
     */
    void setPublic(boolean value);

    /**
     * Returns the value of the '<em><b>Developer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Developer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Developer</em>' attribute.
     * @see #setDeveloper(boolean)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Developer()
     * @model
     * @generated
     */
    boolean isDeveloper();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#isDeveloper <em>Developer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Developer</em>' attribute.
     * @see #isDeveloper()
     * @generated
     */
    void setDeveloper(boolean value);

    /**
     * Returns the value of the '<em><b>Simulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Simulation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Simulation</em>' attribute.
     * @see #setSimulation(boolean)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Simulation()
     * @model
     * @generated
     */
    boolean isSimulation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#isSimulation <em>Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simulation</em>' attribute.
     * @see #isSimulation()
     * @generated
     */
    void setSimulation(boolean value);

} // System
