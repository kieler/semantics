/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import de.cau.cs.kieler.core.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getIdentifiable()
 * @model
 * @generated
 */
public interface Identifiable extends Annotatable {
    /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#getIdentifiable_Id()
	 * @model
	 * @generated
	 */
    String getId();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.text.kext.Identifiable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
    void setId(String value);

} // Identifiable
