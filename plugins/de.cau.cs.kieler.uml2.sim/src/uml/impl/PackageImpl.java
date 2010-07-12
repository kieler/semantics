/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import ecore.EObject;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Enumeration;
import uml.Interface;
import uml.NamedElement;
import uml.PackageMerge;
import uml.PackageableElement;
import uml.ParameterableElement;
import uml.PrimitiveType;
import uml.Profile;
import uml.ProfileApplication;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getProfileApplication <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements uml.Package {
    /**
     * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateParameter()
     * @generated
     * @ordered
     */
    protected TemplateParameter templateParameter;

    /**
     * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateBinding()
     * @generated
     * @ordered
     */
    protected EList<TemplateBinding> templateBinding;

    /**
     * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedTemplateSignature()
     * @generated
     * @ordered
     */
    protected TemplateSignature ownedTemplateSignature;

    /**
     * The cached value of the '{@link #getPackageMerge() <em>Package Merge</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageMerge()
     * @generated
     * @ordered
     */
    protected EList<PackageMerge> packageMerge;

    /**
     * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedElement()
     * @generated
     * @ordered
     */
    protected EList<PackageableElement> packagedElement;

    /**
     * The cached value of the '{@link #getProfileApplication() <em>Profile Application</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfileApplication()
     * @generated
     * @ordered
     */
    protected EList<ProfileApplication> profileApplication;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
            if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningTemplateParameter != null)
                msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getTemplateParameter() {
        if (templateParameter != null && templateParameter.eIsProxy()) {
            InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
            templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
            if (templateParameter != oldTemplateParameter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
            }
        }
        return templateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter basicGetTemplateParameter() {
        return templateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
        TemplateParameter oldTemplateParameter = templateParameter;
        templateParameter = newTemplateParameter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplateParameter(TemplateParameter newTemplateParameter) {
        if (newTemplateParameter != templateParameter) {
            NotificationChain msgs = null;
            if (templateParameter != null)
                msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            if (newTemplateParameter != null)
                msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateBinding> getTemplateBinding() {
        if (templateBinding == null) {
            templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, UmlPackage.PACKAGE__TEMPLATE_BINDING, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
        }
        return templateBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature getOwnedTemplateSignature() {
        return ownedTemplateSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
        TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
        ownedTemplateSignature = newOwnedTemplateSignature;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
        if (newOwnedTemplateSignature != ownedTemplateSignature) {
            NotificationChain msgs = null;
            if (ownedTemplateSignature != null)
                msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
            if (newOwnedTemplateSignature != null)
                msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
            msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> getOwnedType() {
        // TODO: implement this method to return the 'Owned Type' reference list
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
    public EList<PackageMerge> getPackageMerge() {
        if (packageMerge == null) {
            packageMerge = new EObjectContainmentWithInverseEList<PackageMerge>(PackageMerge.class, this, UmlPackage.PACKAGE__PACKAGE_MERGE, UmlPackage.PACKAGE_MERGE__RECEIVING_PACKAGE);
        }
        return packageMerge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getPackagedElement() {
        if (packagedElement == null) {
            packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, UmlPackage.PACKAGE__PACKAGED_ELEMENT);
        }
        return packagedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<uml.Package> getNestedPackage() {
        // TODO: implement this method to return the 'Nested Package' reference list
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
    public uml.Package getNestingPackage() {
        uml.Package nestingPackage = basicGetNestingPackage();
        return nestingPackage != null && nestingPackage.eIsProxy() ? (uml.Package)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package basicGetNestingPackage() {
        // TODO: implement this method to return the 'Nesting Package' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNestingPackage(uml.Package newNestingPackage) {
        // TODO: implement this method to set the 'Nesting Package' reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProfileApplication> getProfileApplication() {
        if (profileApplication == null) {
            profileApplication = new EObjectContainmentWithInverseEList<ProfileApplication>(ProfileApplication.class, this, UmlPackage.PACKAGE__PROFILE_APPLICATION, UmlPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
        }
        return profileApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean elements_public_or_private(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "elements_public_or_private", EObjectValidator.getObjectLabel(this, context) }),
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
    public uml.Class createOwnedClass(String name, boolean isAbstract) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumeration createOwnedEnumeration(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveType createOwnedPrimitiveType(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createOwnedInterface(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isProfileApplied(Profile profile) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> applyProfile(Profile profile) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> unapplyProfile(Profile profile) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Profile> getAppliedProfiles() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Profile> getAllAppliedProfiles() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Profile getAppliedProfile(String qualifiedName) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Profile getAppliedProfile(String qualifiedName, boolean recurse) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProfileApplication> getAllProfileApplications() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProfileApplication getProfileApplication(Profile profile) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProfileApplication getProfileApplication(Profile profile, boolean recurse) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isModelLibrary() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> visibleMembers() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean makesVisible(NamedElement el) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterableElement> parameterableElements() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTemplate() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCompatibleWith(ParameterableElement p) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTemplateParameter() {
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                if (ownedTemplateSignature != null)
                    msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
                return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageMerge()).basicAdd(otherEnd, msgs);
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfileApplication()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                return basicSetOwnedTemplateSignature(null, msgs);
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
            case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
                return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                return ((InternalEList<?>)getProfileApplication()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                return getTemplateBinding();
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                return getOwnedTemplateSignature();
            case UmlPackage.PACKAGE__OWNED_TYPE:
                return getOwnedType();
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                return getPackageMerge();
            case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
                return getPackagedElement();
            case UmlPackage.PACKAGE__NESTED_PACKAGE:
                return getNestedPackage();
            case UmlPackage.PACKAGE__NESTING_PACKAGE:
                if (resolve) return getNestingPackage();
                return basicGetNestingPackage();
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                return getProfileApplication();
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
                return;
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.PACKAGE__OWNED_TYPE:
                getOwnedType().clear();
                getOwnedType().addAll((Collection<? extends Type>)newValue);
                return;
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                getPackageMerge().clear();
                getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
                return;
            case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
                getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
                return;
            case UmlPackage.PACKAGE__NESTED_PACKAGE:
                getNestedPackage().clear();
                getNestedPackage().addAll((Collection<? extends uml.Package>)newValue);
                return;
            case UmlPackage.PACKAGE__NESTING_PACKAGE:
                setNestingPackage((uml.Package)newValue);
                return;
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                getProfileApplication().clear();
                getProfileApplication().addAll((Collection<? extends ProfileApplication>)newValue);
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                return;
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)null);
                return;
            case UmlPackage.PACKAGE__OWNED_TYPE:
                getOwnedType().clear();
                return;
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                getPackageMerge().clear();
                return;
            case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
                getPackagedElement().clear();
                return;
            case UmlPackage.PACKAGE__NESTED_PACKAGE:
                getNestedPackage().clear();
                return;
            case UmlPackage.PACKAGE__NESTING_PACKAGE:
                setNestingPackage((uml.Package)null);
                return;
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                getProfileApplication().clear();
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
            case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.PACKAGE__TEMPLATE_PARAMETER:
                return templateParameter != null;
            case UmlPackage.PACKAGE__TEMPLATE_BINDING:
                return templateBinding != null && !templateBinding.isEmpty();
            case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
                return ownedTemplateSignature != null;
            case UmlPackage.PACKAGE__OWNED_TYPE:
                return !getOwnedType().isEmpty();
            case UmlPackage.PACKAGE__PACKAGE_MERGE:
                return packageMerge != null && !packageMerge.isEmpty();
            case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
                return packagedElement != null && !packagedElement.isEmpty();
            case UmlPackage.PACKAGE__NESTED_PACKAGE:
                return !getNestedPackage().isEmpty();
            case UmlPackage.PACKAGE__NESTING_PACKAGE:
                return basicGetNestingPackage() != null;
            case UmlPackage.PACKAGE__PROFILE_APPLICATION:
                return profileApplication != null && !profileApplication.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ParameterableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PACKAGE__TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PACKAGE__TEMPLATE_BINDING: return UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
                case UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ParameterableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UmlPackage.PACKAGE__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UmlPackage.PACKAGE__TEMPLATE_BINDING;
                case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PackageImpl
