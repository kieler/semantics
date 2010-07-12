/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Constraint;
import uml.ElementImport;
import uml.NamedElement;
import uml.Namespace;
import uml.PackageImport;
import uml.PackageableElement;
import uml.UmlPackage;
import uml.VisibilityKind;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.NamespaceImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
    /**
     * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementImport()
     * @generated
     * @ordered
     */
    protected EList<ElementImport> elementImport;

    /**
     * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageImport()
     * @generated
     * @ordered
     */
    protected EList<PackageImport> packageImport;

    /**
     * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedRule()
     * @generated
     * @ordered
     */
    protected EList<Constraint> ownedRule;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamespaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getNamespace();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementImport> getElementImport() {
        if (elementImport == null) {
            elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UmlPackage.NAMESPACE__ELEMENT_IMPORT, UmlPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
        }
        return elementImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageImport> getPackageImport() {
        if (packageImport == null) {
            packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UmlPackage.NAMESPACE__PACKAGE_IMPORT, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
        }
        return packageImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getOwnedRule() {
        if (ownedRule == null) {
            ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, UmlPackage.NAMESPACE__OWNED_RULE, UmlPackage.CONSTRAINT__CONTEXT);
        }
        return ownedRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getMember() {
        // TODO: implement this method to return the 'Member' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getImportedMember() {
        // TODO: implement this method to return the 'Imported Member' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getOwnedMember() {
        // TODO: implement this method to return the 'Owned Member' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean members_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "members_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementImport createElementImport(PackageableElement element, VisibilityKind visibility) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageImport createPackageImport(uml.Package package_, VisibilityKind visibility) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getImportedElements() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<uml.Package> getImportedPackages() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getImportedMembers() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getNamesOfMember(NamedElement element) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean membersAreDistinguishable() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
            case UmlPackage.NAMESPACE__OWNED_RULE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
            case UmlPackage.NAMESPACE__OWNED_RULE:
                return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                return getElementImport();
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                return getPackageImport();
            case UmlPackage.NAMESPACE__OWNED_RULE:
                return getOwnedRule();
            case UmlPackage.NAMESPACE__MEMBER:
                return getMember();
            case UmlPackage.NAMESPACE__IMPORTED_MEMBER:
                return getImportedMember();
            case UmlPackage.NAMESPACE__OWNED_MEMBER:
                return getOwnedMember();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                getElementImport().clear();
                getElementImport().addAll((Collection<? extends ElementImport>)newValue);
                return;
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                getPackageImport().clear();
                getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
                return;
            case UmlPackage.NAMESPACE__OWNED_RULE:
                getOwnedRule().clear();
                getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                getElementImport().clear();
                return;
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                getPackageImport().clear();
                return;
            case UmlPackage.NAMESPACE__OWNED_RULE:
                getOwnedRule().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
                return elementImport != null && !elementImport.isEmpty();
            case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
                return packageImport != null && !packageImport.isEmpty();
            case UmlPackage.NAMESPACE__OWNED_RULE:
                return ownedRule != null && !ownedRule.isEmpty();
            case UmlPackage.NAMESPACE__MEMBER:
                return !getMember().isEmpty();
            case UmlPackage.NAMESPACE__IMPORTED_MEMBER:
                return !getImportedMember().isEmpty();
            case UmlPackage.NAMESPACE__OWNED_MEMBER:
                return !getOwnedMember().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //NamespaceImpl
