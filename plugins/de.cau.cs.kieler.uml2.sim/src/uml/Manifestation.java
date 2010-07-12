/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifestation is the concrete physical rendering of one or more model elements by an artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation extends Abstraction {
    /**
     * Returns the value of the '<em><b>Utilized Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The model element that is utilized in the manifestation in an Artifact.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Utilized Element</em>' reference.
     * @see #setUtilizedElement(PackageableElement)
     * @see uml.UmlPackage#getManifestation_UtilizedElement()
     * @model required="true" ordered="false"
     * @generated
     */
    PackageableElement getUtilizedElement();

    /**
     * Sets the value of the '{@link uml.Manifestation#getUtilizedElement <em>Utilized Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Utilized Element</em>' reference.
     * @see #getUtilizedElement()
     * @generated
     */
    void setUtilizedElement(PackageableElement value);

} // Manifestation
