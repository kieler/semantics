/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.RelationDeclaration#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelationDeclaration()
 * @model
 * @generated
 */
public interface RelationDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Relation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getRelationDeclaration_Relations()
     * @model containment="true"
     * @generated
     */
    EList<Relation> getRelations();

} // RelationDeclaration
