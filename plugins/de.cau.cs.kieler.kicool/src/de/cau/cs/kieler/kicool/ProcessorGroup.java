/**
 */
package de.cau.cs.kieler.kicool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorGroup#getProcessors <em>Processors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorGroup#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorGroup()
 * @model
 * @generated
 */
public interface ProcessorGroup extends ProcessorEntry {
    /**
     * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.ProcessorEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processors</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorGroup_Processors()
     * @model containment="true"
     * @generated
     */
    EList<ProcessorEntry> getProcessors();

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
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorGroup_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorGroup#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // ProcessorGroup
