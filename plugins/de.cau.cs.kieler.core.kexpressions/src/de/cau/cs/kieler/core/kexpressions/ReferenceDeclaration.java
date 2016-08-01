/**
 */
package de.cau.cs.kieler.core.kexpressions;

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
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration#getExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getReferenceDeclaration()
 * @model
 * @generated
 */
public interface ReferenceDeclaration extends Declaration {

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
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getReferenceDeclaration_Reference()
     * @model
     * @generated
     */
    EObject getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(EObject value);

    /**
     * Returns the value of the '<em><b>Extern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extern</em>' attribute.
     * @see #setExtern(String)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getReferenceDeclaration_Extern()
     * @model
     * @generated
     */
    String getExtern();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ReferenceDeclaration#getExtern <em>Extern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extern</em>' attribute.
     * @see #getExtern()
     * @generated
     */
    void setExtern(String value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getReferenceDeclaration_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();
} // ReferenceDeclaration
