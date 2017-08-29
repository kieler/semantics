/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.kexpressions.Referenceable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.KExtScope#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.KExtScope#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getKExtScope()
 * @model
 * @generated
 */
public interface KExtScope extends DeclarationScope, Annotatable, Referenceable, NamedObject {
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
     * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getKExtScope_Entities()
     * @model containment="true"
     * @generated
     */
    EList<TestEntity> getEntities();

    /**
     * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.kext.KExtScope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scopes</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getKExtScope_Scopes()
     * @model containment="true"
     * @generated
     */
    EList<KExtScope> getScopes();

} // KExtScope
