/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import ecore.EClass;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Stereotype#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends uml.Class {
    /**
     * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
     * The list contents are of type {@link uml.Image}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Icon</em>' containment reference list.
     * @see uml.UmlPackage#getStereotype_Icon()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Image> getIcon();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stereotype names should not clash with keyword names for the extended model element.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean name_not_clash(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A Stereotype may only generalize or specialize another Stereotype.
     * generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean generalize(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates a(n) (required) extension of the specified metaclass with this stereotype.
     * @param metaclass The metaclass for the new extension.
     * @param isRequired Whether the new extension should be required.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" metaclassRequired="true" metaclassOrdered="false" isRequiredDataType="uml.Boolean" isRequiredRequired="true" isRequiredOrdered="false"
     * @generated
     */
    Extension createExtension(uml.Class metaclass, boolean isRequired);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the profile that owns this stereotype.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    Profile getProfile();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the localized keyword for this stereotype.
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="uml.String" required="true" ordered="false"
     * @generated
     */
    String getKeyword();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the keyword for this stereotype, localized if indicated.
     * @param localize Whether to localize the keyword.
     * <!-- end-model-doc -->
     * @model dataType="uml.String" required="true" ordered="false" localizeDataType="uml.Boolean" localizeRequired="true" localizeOrdered="false"
     * @generated
     */
    String getKeyword(boolean localize);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the metaclasses extended by this stereotype.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<uml.Class> getExtendedMetaclasses();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves all the metaclasses extended by this stereotype, including the metaclasses extended by its superstereotypes.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<uml.Class> getAllExtendedMetaclasses();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the current definition (Ecore representation) of this stereotype.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EClass getDefinition();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates an icon with the specified location for this stereotype.
     * @param location The location for the new icon.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" locationDataType="uml.String" locationRequired="true" locationOrdered="false"
     * @generated
     */
    Image createIcon(String location);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates an icon with the specified format and content for this stereotype.
     * @param format The format for the new icon.
     * @param content The content for the new icon.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" formatDataType="uml.String" formatRequired="true" formatOrdered="false" contentDataType="uml.String" contentRequired="true" contentOrdered="false"
     * @generated
     */
    Image createIcon(String format, String content);

} // Stereotype
