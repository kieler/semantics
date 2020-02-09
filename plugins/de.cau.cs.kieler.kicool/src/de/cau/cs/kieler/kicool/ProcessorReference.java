/**
 */
package de.cau.cs.kieler.kicool;

import de.cau.cs.kieler.kexpressions.JsonObjectValue;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getPreconfig <em>Preconfig</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getPostconfig <em>Postconfig</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getPreprocesses <em>Preprocesses</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#getPostprocesses <em>Postprocesses</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorReference#isSilent <em>Silent</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference()
 * @model
 * @generated
 */
public interface ProcessorReference extends ProcessorEntry {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorReference#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Preconfig</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preconfig</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preconfig</em>' containment reference.
     * @see #setPreconfig(JsonObjectValue)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Preconfig()
     * @model containment="true"
     * @generated
     */
    JsonObjectValue getPreconfig();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorReference#getPreconfig <em>Preconfig</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preconfig</em>' containment reference.
     * @see #getPreconfig()
     * @generated
     */
    void setPreconfig(JsonObjectValue value);

    /**
     * Returns the value of the '<em><b>Postconfig</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postconfig</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postconfig</em>' containment reference.
     * @see #setPostconfig(JsonObjectValue)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Postconfig()
     * @model containment="true"
     * @generated
     */
    JsonObjectValue getPostconfig();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorReference#getPostconfig <em>Postconfig</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Postconfig</em>' containment reference.
     * @see #getPostconfig()
     * @generated
     */
    void setPostconfig(JsonObjectValue value);

    /**
     * Returns the value of the '<em><b>Metric</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metric</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metric</em>' reference.
     * @see #setMetric(IntermediateReference)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Metric()
     * @model
     * @generated
     */
    IntermediateReference getMetric();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorReference#getMetric <em>Metric</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Metric</em>' reference.
     * @see #getMetric()
     * @generated
     */
    void setMetric(IntermediateReference value);

    /**
     * Returns the value of the '<em><b>Preprocesses</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.ProcessorReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preprocesses</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preprocesses</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Preprocesses()
     * @model containment="true"
     * @generated
     */
    EList<ProcessorReference> getPreprocesses();

    /**
     * Returns the value of the '<em><b>Postprocesses</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.ProcessorReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postprocesses</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postprocesses</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Postprocesses()
     * @model containment="true"
     * @generated
     */
    EList<ProcessorReference> getPostprocesses();

    /**
     * Returns the value of the '<em><b>Silent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Silent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Silent</em>' attribute.
     * @see #setSilent(boolean)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorReference_Silent()
     * @model
     * @generated
     */
    boolean isSilent();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorReference#isSilent <em>Silent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Silent</em>' attribute.
     * @see #isSilent()
     * @generated
     */
    void setSilent(boolean value);

} // ProcessorReference
