/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package import is a relationship that allows the use of unqualified names to refer to package members from other namespaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackageImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends DirectedRelationship {
    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The default value is <code>"public"</code>.
     * The literals are from the enumeration {@link uml.VisibilityKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the visibility of the imported PackageableElements within the importing Namespace, i.e., whether imported elements will in turn be visible to other packages that use that importingPackage as an importedPackage. If the PackageImport is public, the imported elements will be visible outside the package, while if it is private they will not.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityKind
     * @see #setVisibility(VisibilityKind)
     * @see uml.UmlPackage#getPackageImport_Visibility()
     * @model default="public" required="true" ordered="false"
     * @generated
     */
    VisibilityKind getVisibility();

    /**
     * Sets the value of the '{@link uml.PackageImport#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityKind
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(VisibilityKind value);

    /**
     * Returns the value of the '<em><b>Imported Package</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the Package whose members are imported into a Namespace.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Imported Package</em>' reference.
     * @see #setImportedPackage(uml.Package)
     * @see uml.UmlPackage#getPackageImport_ImportedPackage()
     * @model required="true" ordered="false"
     * @generated
     */
    uml.Package getImportedPackage();

    /**
     * Sets the value of the '{@link uml.PackageImport#getImportedPackage <em>Imported Package</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imported Package</em>' reference.
     * @see #getImportedPackage()
     * @generated
     */
    void setImportedPackage(uml.Package value);

    /**
     * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Namespace#getPackageImport <em>Package Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the Namespace that imports the members from a Package.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Importing Namespace</em>' container reference.
     * @see #setImportingNamespace(Namespace)
     * @see uml.UmlPackage#getPackageImport_ImportingNamespace()
     * @see uml.Namespace#getPackageImport
     * @model opposite="packageImport" required="true" transient="false" ordered="false"
     * @generated
     */
    Namespace getImportingNamespace();

    /**
     * Sets the value of the '{@link uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Importing Namespace</em>' container reference.
     * @see #getImportingNamespace()
     * @generated
     */
    void setImportingNamespace(Namespace value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The visibility of a PackageImport is either public or private.
     * self.visibility = #public or self.visibility = #private
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean public_or_private(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PackageImport
