/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#isSimple <em>Simple</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#isConst <em>Const</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReferenceContainer <em>Reference Container</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getGenericParameters <em>Generic Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration()
 * @model
 * @generated
 */
public interface ReferenceDeclaration extends IODeclaration {
    /**
     * Returns the value of the '<em><b>Simple</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Simple</em>' attribute.
     * @see #setSimple(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_Simple()
     * @model default="false" required="true"
     * @generated
     */
    boolean isSimple();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#isSimple <em>Simple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple</em>' attribute.
     * @see #isSimple()
     * @generated
     */
    void setSimple(boolean value);

    /**
     * Returns the value of the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Const</em>' attribute.
     * @see #setConst(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_Const()
     * @model required="true"
     * @generated
     */
    boolean isConst();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#isConst <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Const</em>' attribute.
     * @see #isConst()
     * @generated
     */
    void setConst(boolean value);

    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(EObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_Reference()
     * @model
     * @generated
     */
    EObject getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(EObject value);

    /**
     * Returns the value of the '<em><b>Reference Container</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Container</em>' reference.
     * @see #setReferenceContainer(EObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_ReferenceContainer()
     * @model
     * @generated
     */
    EObject getReferenceContainer();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReferenceContainer <em>Reference Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Container</em>' reference.
     * @see #getReferenceContainer()
     * @generated
     */
    void setReferenceContainer(EObject value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

    /**
     * Returns the value of the '<em><b>Extern</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.ExternString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extern</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extern</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_Extern()
     * @model containment="true"
     * @generated
     */
    EList<ExternString> getExtern();

    /**
     * Returns the value of the '<em><b>Generic Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceDeclaration_GenericParameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getGenericParameters();

} // ReferenceDeclaration
