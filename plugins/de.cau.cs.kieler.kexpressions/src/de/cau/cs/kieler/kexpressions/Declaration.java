/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.Annotatable;

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
 *   <li>{@link de.cau.cs.kieler.kexpressions.Declaration#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Declaration#isPrivate <em>Private</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends Annotatable {
    /**
     * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.ValuedObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valued Objects</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getDeclaration_ValuedObjects()
     * @model containment="true"
     * @generated
     */
    EList<ValuedObject> getValuedObjects();

    /**
     * Returns the value of the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Private</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Private</em>' attribute.
     * @see #setPrivate(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getDeclaration_Private()
     * @model required="true"
     * @generated
     */
    boolean isPrivate();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.Declaration#isPrivate <em>Private</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private</em>' attribute.
     * @see #isPrivate()
     * @generated
     */
    void setPrivate(boolean value);

} // Declaration
