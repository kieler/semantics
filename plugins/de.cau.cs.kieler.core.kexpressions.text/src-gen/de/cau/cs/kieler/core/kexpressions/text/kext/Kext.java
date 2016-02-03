/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import de.cau.cs.kieler.core.kexpressions.Declaration;

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
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.Kext#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext()
 * @model
 * @generated
 */
public interface Kext extends EObject
{
  /**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKext_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KEXTScope> getScopes();

} // Kext
