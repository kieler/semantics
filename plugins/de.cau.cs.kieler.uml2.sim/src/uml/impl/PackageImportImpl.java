/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Namespace;
import uml.PackageImport;
import uml.UmlPackage;
import uml.VisibilityKind;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackageImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link uml.impl.PackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportImpl extends DirectedRelationshipImpl implements PackageImport {
    /**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

    /**
     * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportedPackage()
     * @generated
     * @ordered
     */
    protected uml.Package importedPackage;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getPackageImport();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return visibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        VisibilityKind oldVisibility = visibility;
        visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT__VISIBILITY, oldVisibility, visibility));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package getImportedPackage() {
        if (importedPackage != null && importedPackage.eIsProxy()) {
            InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
            importedPackage = (uml.Package)eResolveProxy(oldImportedPackage);
            if (importedPackage != oldImportedPackage) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
            }
        }
        return importedPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package basicGetImportedPackage() {
        return importedPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportedPackage(uml.Package newImportedPackage) {
        uml.Package oldImportedPackage = importedPackage;
        importedPackage = newImportedPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Namespace getImportingNamespace() {
        if (eContainerFeatureID() != UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE) return null;
        return (Namespace)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImportingNamespace(Namespace newImportingNamespace, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newImportingNamespace, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportingNamespace(Namespace newImportingNamespace) {
        if (newImportingNamespace != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE && newImportingNamespace != null)) {
            if (EcoreUtil.isAncestor(this, newImportingNamespace))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newImportingNamespace != null)
                msgs = ((InternalEObject)newImportingNamespace).eInverseAdd(this, UmlPackage.NAMESPACE__PACKAGE_IMPORT, Namespace.class, msgs);
            msgs = basicSetImportingNamespace(newImportingNamespace, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, newImportingNamespace, newImportingNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean public_or_private(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PACKAGE_IMPORT__PUBLIC_OR_PRIVATE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "public_or_private", EObjectValidator.getObjectLabel(this, context) }),
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
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetImportingNamespace((Namespace)otherEnd, msgs);
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
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                return basicSetImportingNamespace(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.NAMESPACE__PACKAGE_IMPORT, Namespace.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
                return getVisibility();
            case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
                if (resolve) return getImportedPackage();
                return basicGetImportedPackage();
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                return getImportingNamespace();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
                setImportedPackage((uml.Package)newValue);
                return;
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                setImportingNamespace((Namespace)newValue);
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
            case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
                setVisibility(VISIBILITY_EDEFAULT);
                return;
            case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
                setImportedPackage((uml.Package)null);
                return;
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                setImportingNamespace((Namespace)null);
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
            case UmlPackage.PACKAGE_IMPORT__VISIBILITY:
                return visibility != VISIBILITY_EDEFAULT;
            case UmlPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
                return importedPackage != null;
            case UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
                return getImportingNamespace() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (visibility: ");
        result.append(visibility);
        result.append(')');
        return result.toString();
    }

} //PackageImportImpl
