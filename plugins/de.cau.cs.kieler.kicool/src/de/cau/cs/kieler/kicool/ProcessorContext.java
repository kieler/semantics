/**
 */
package de.cau.cs.kieler.kicool;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorContext#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorContext#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.ProcessorContext#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorContext()
 * @model
 * @generated
 */
public interface ProcessorContext extends EObject {
    /**
     * Returns the value of the '<em><b>Environment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Environment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Environment</em>' attribute.
     * @see #setEnvironment(Map)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorContext_Environment()
     * @model transient="true"
     * @generated
     */
    Map<String, String> getEnvironment();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorContext#getEnvironment <em>Environment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Environment</em>' attribute.
     * @see #getEnvironment()
     * @generated
     */
    void setEnvironment(Map<String, String> value);

    /**
     * Returns the value of the '<em><b>Source Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Model</em>' reference.
     * @see #setSourceModel(EObject)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorContext_SourceModel()
     * @model transient="true"
     * @generated
     */
    EObject getSourceModel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.ProcessorContext#getSourceModel <em>Source Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Model</em>' reference.
     * @see #getSourceModel()
     * @generated
     */
    void setSourceModel(EObject value);

    /**
     * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kicool.ProcessorContext}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Targets</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessorContext_Targets()
     * @model containment="true"
     * @generated
     */
    EList<ProcessorContext> getTargets();

} // ProcessorContext
