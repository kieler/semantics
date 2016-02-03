/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KEXT Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKEXTScope()
 * @model
 * @generated
 */
public interface KEXTScope extends DeclarationScope {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getKEXTScope_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestEntity> getEntities();

} // KEXTScope
