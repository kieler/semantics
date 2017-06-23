/**
 */
package de.cau.cs.kieler.kicool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.cau.cs.kieler.kicool.System#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getProcessors <em>Processors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.System#getInputClass <em>Input Class</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(int)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Version()
     * @model
     * @generated
     */
    int getVersion();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(int value);

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
     * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.Metric}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metrics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metrics</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_Metrics()
     * @model containment="true"
     * @generated
     */
    EList<Metric> getMetrics();

    /**
     * Returns the value of the '<em><b>Input Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Class</em>' attribute.
     * @see #setInputClass(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getSystem_InputClass()
     * @model
     * @generated
     */
    String getInputClass();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.System#getInputClass <em>Input Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Class</em>' attribute.
     * @see #getInputClass()
     * @generated
     */
    void setInputClass(String value);

} // System
