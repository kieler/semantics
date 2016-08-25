/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.kexpressions.Declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.Kext#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.Kext#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getKext()
 * @model
 * @generated
 */
public interface Kext extends EObject {
    /**
     * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getKext_Declarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getDeclarations();

    /**
     * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.kext.TestEntity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entities</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getKext_Entities()
     * @model containment="true"
     * @generated
     */
    EList<TestEntity> getEntities();

} // Kext
