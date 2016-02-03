/**
 */
package de.cau.cs.kieler.core.kexpressions;

import de.cau.cs.kieler.core.annotations.Annotatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.Declaration#getValuedObjects <em>Valued Objects</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Annotatable {
    /**
	 * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Objects</em>' containment reference list.
	 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getDeclaration_ValuedObjects()
	 * @model containment="true"
	 * @generated
	 */
    EList<ValuedObject> getValuedObjects();

} // Declaration
