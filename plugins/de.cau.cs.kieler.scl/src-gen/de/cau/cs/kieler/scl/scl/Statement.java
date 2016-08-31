/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.annotations.Annotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Statement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
    /**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
=======
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
>>>>>>> ssm/scg
     * <p>
     * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatement_Annotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getAnnotations();

} // Statement
