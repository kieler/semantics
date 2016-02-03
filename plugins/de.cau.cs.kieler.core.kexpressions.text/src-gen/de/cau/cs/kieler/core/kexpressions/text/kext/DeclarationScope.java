/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getDeclarationScope()
 * @model
 * @generated
 */
public interface DeclarationScope extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getDeclarationScope_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

} // DeclarationScope
