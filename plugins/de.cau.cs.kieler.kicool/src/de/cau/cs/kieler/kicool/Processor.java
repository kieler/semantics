/**
 */
package de.cau.cs.kieler.kicool;

import de.cau.cs.kieler.annotations.Annotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.Processor#getPreAnnotations <em>Pre Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.Processor#getPostAnnotations <em>Post Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.Processor#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.Processor#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends ProcessorEntry {
    /**
     * Returns the value of the '<em><b>Pre Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessor_PreAnnotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getPreAnnotations();

    /**
     * Returns the value of the '<em><b>Post Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessor_PostAnnotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getPostAnnotations();

    /**
     * Returns the value of the '<em><b>Metric</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metric</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metric</em>' reference.
     * @see #setMetric(Metric)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessor_Metric()
     * @model
     * @generated
     */
    Metric getMetric();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.Processor#getMetric <em>Metric</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Metric</em>' reference.
     * @see #getMetric()
     * @generated
     */
    void setMetric(Metric value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference.
     * @see #setContext(ProcessorContext)
     * @see de.cau.cs.kieler.kicool.KiCoolPackage#getProcessor_Context()
     * @model containment="true"
     * @generated
     */
    ProcessorContext getContext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kicool.Processor#getContext <em>Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' containment reference.
     * @see #getContext()
     * @generated
     */
    void setContext(ProcessorContext value);

} // Processor
