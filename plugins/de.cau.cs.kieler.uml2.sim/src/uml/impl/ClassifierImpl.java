/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.AggregationKind;
import uml.Association;
import uml.Classifier;
import uml.CollaborationUse;
import uml.Feature;
import uml.Generalization;
import uml.GeneralizationSet;
import uml.Interface;
import uml.NamedElement;
import uml.Operation;
import uml.PackageableElement;
import uml.ParameterableElement;
import uml.Property;
import uml.RedefinableElement;
import uml.Substitution;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.Type;
import uml.UmlPackage;
import uml.UseCase;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ClassifierImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
    /**
     * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected static final boolean IS_LEAF_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected boolean isLeaf = IS_LEAF_EDEFAULT;

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
     * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

    /**
     * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralization()
     * @generated
     * @ordered
     */
    protected EList<Generalization> generalization;

    /**
     * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowertypeExtent()
     * @generated
     * @ordered
     */
    protected EList<GeneralizationSet> powertypeExtent;

    /**
     * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> redefinedClassifier;

    /**
     * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstitution()
     * @generated
     * @ordered
     */
    protected EList<Substitution> substitution;

    /**
     * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepresentation()
     * @generated
     * @ordered
     */
    protected CollaborationUse representation;

    /**
     * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollaborationUse()
     * @generated
     * @ordered
     */
    protected EList<CollaborationUse> collaborationUse;

    /**
     * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedUseCase()
     * @generated
     * @ordered
     */
    protected EList<UseCase> ownedUseCase;

    /**
     * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseCase()
     * @generated
     * @ordered
     */
    protected EList<UseCase> useCase;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getClassifier();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsLeaf(boolean newIsLeaf) {
        boolean oldIsLeaf = isLeaf;
        isLeaf = newIsLeaf;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RedefinableElement> getRedefinedElement() {
        // TODO: implement this method to return the 'Redefined Element' reference list
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
    public EList<Classifier> getRedefinitionContext() {
        // TODO: implement this method to return the 'Redefinition Context' reference list
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
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package getPackage() {
        uml.Package package_ = basicGetPackage();
        return package_ != null && package_.eIsProxy() ? (uml.Package)eResolveProxy((InternalEObject)package_) : package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package basicGetPackage() {
        // TODO: implement this method to return the 'Package' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(uml.Package newPackage) {
        // TODO: implement this method to set the 'Package' reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateBinding> getTemplateBinding() {
        if (templateBinding == null) {
            templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, UmlPackage.CLASSIFIER__TEMPLATE_BINDING, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAbstract(boolean newIsAbstract) {
        boolean oldIsAbstract = isAbstract;
        isAbstract = newIsAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Generalization> getGeneralization() {
        if (generalization == null) {
            generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, UmlPackage.CLASSIFIER__GENERALIZATION, UmlPackage.GENERALIZATION__SPECIFIC);
        }
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralizationSet> getPowertypeExtent() {
        if (powertypeExtent == null) {
            powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, UmlPackage.CLASSIFIER__POWERTYPE_EXTENT, UmlPackage.GENERALIZATION_SET__POWERTYPE);
        }
        return powertypeExtent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Feature> getFeature() {
        // TODO: implement this method to return the 'Feature' reference list
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
    public EList<NamedElement> getInheritedMember() {
        // TODO: implement this method to return the 'Inherited Member' reference list
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
    public EList<Classifier> getRedefinedClassifier() {
        if (redefinedClassifier == null) {
            redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
        }
        return redefinedClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getGeneral() {
        // TODO: implement this method to return the 'General' reference list
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
    public EList<Substitution> getSubstitution() {
        if (substitution == null) {
            substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, UmlPackage.CLASSIFIER__SUBSTITUTION, UmlPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
        }
        return substitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getAttribute() {
        // TODO: implement this method to return the 'Attribute' reference list
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
    public CollaborationUse getRepresentation() {
        if (representation != null && representation.eIsProxy()) {
            InternalEObject oldRepresentation = (InternalEObject)representation;
            representation = (CollaborationUse)eResolveProxy(oldRepresentation);
            if (representation != oldRepresentation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
            }
        }
        return representation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollaborationUse basicGetRepresentation() {
        return representation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepresentation(CollaborationUse newRepresentation) {
        CollaborationUse oldRepresentation = representation;
        representation = newRepresentation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CollaborationUse> getCollaborationUse() {
        if (collaborationUse == null) {
            collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, UmlPackage.CLASSIFIER__COLLABORATION_USE);
        }
        return collaborationUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UseCase> getOwnedUseCase() {
        if (ownedUseCase == null) {
            ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UmlPackage.CLASSIFIER__OWNED_USE_CASE);
        }
        return ownedUseCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UseCase> getUseCase() {
        if (useCase == null) {
            useCase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, UmlPackage.CLASSIFIER__USE_CASE, UmlPackage.USE_CASE__SUBJECT);
        }
        return useCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean no_cycles_in_generalization(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_cycles_in_generalization", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean generalization_hierarchies(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CLASSIFIER__GENERALIZATION_HIERARCHIES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "generalization_hierarchies", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean specialize_type(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CLASSIFIER__SPECIALIZE_TYPE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialize_type", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean maps_to_generalization_set(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "maps_to_generalization_set", EObjectValidator.getObjectLabel(this, context) }),
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
    public EList<Property> getAllAttributes() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOperations() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getAllOperations() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, boolean ignoreCase) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getUsedInterfaces() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getAllUsedInterfaces() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getGenerals() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getInheritedMembers() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Feature> allFeatures() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> parents() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> inheritableMembers(Classifier c) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean hasVisibilityOf(NamedElement n) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean conformsTo(Classifier other) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> inherit(EList<NamedElement> inhs) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean maySpecializeType(Classifier c) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> allParents() {
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
    public Association createAssociation(boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int end1Lower, int end1Upper, Type end1Type, boolean end2IsNavigable, AggregationKind end2Aggregation, String end2Name, int end2Lower, int end2Upper) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Association> getAssociations() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean conformsTo(Type other) {
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
    public boolean redefinition_context_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinition_context_valid", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean redefinition_consistent(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinition_consistent", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean isConsistentWith(RedefinableElement redefinee) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRedefinitionContextValid(RedefinableElement redefined) {
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
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                if (ownedTemplateSignature != null)
                    msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
                return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__USE_CASE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                return basicSetOwnedTemplateSignature(null, msgs);
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__COLLABORATION_USE:
                return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
                return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASSIFIER__USE_CASE:
                return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
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
            case UmlPackage.CLASSIFIER__IS_LEAF:
                return isIsLeaf();
            case UmlPackage.CLASSIFIER__REDEFINED_ELEMENT:
                return getRedefinedElement();
            case UmlPackage.CLASSIFIER__REDEFINITION_CONTEXT:
                return getRedefinitionContext();
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
            case UmlPackage.CLASSIFIER__PACKAGE:
                if (resolve) return getPackage();
                return basicGetPackage();
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                return getTemplateBinding();
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                return getOwnedTemplateSignature();
            case UmlPackage.CLASSIFIER__IS_ABSTRACT:
                return isIsAbstract();
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                return getGeneralization();
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                return getPowertypeExtent();
            case UmlPackage.CLASSIFIER__FEATURE:
                return getFeature();
            case UmlPackage.CLASSIFIER__INHERITED_MEMBER:
                return getInheritedMember();
            case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
                return getRedefinedClassifier();
            case UmlPackage.CLASSIFIER__GENERAL:
                return getGeneral();
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                return getSubstitution();
            case UmlPackage.CLASSIFIER__ATTRIBUTE:
                return getAttribute();
            case UmlPackage.CLASSIFIER__REPRESENTATION:
                if (resolve) return getRepresentation();
                return basicGetRepresentation();
            case UmlPackage.CLASSIFIER__COLLABORATION_USE:
                return getCollaborationUse();
            case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
                return getOwnedUseCase();
            case UmlPackage.CLASSIFIER__USE_CASE:
                return getUseCase();
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
            case UmlPackage.CLASSIFIER__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.CLASSIFIER__PACKAGE:
                setPackage((uml.Package)newValue);
                return;
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
                return;
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.CLASSIFIER__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                getGeneralization().clear();
                getGeneralization().addAll((Collection<? extends Generalization>)newValue);
                return;
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                getPowertypeExtent().clear();
                getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
                return;
            case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
                getRedefinedClassifier().clear();
                getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.CLASSIFIER__GENERAL:
                getGeneral().clear();
                getGeneral().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                getSubstitution().clear();
                getSubstitution().addAll((Collection<? extends Substitution>)newValue);
                return;
            case UmlPackage.CLASSIFIER__REPRESENTATION:
                setRepresentation((CollaborationUse)newValue);
                return;
            case UmlPackage.CLASSIFIER__COLLABORATION_USE:
                getCollaborationUse().clear();
                getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
                return;
            case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
                getOwnedUseCase().clear();
                getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
                return;
            case UmlPackage.CLASSIFIER__USE_CASE:
                getUseCase().clear();
                getUseCase().addAll((Collection<? extends UseCase>)newValue);
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
            case UmlPackage.CLASSIFIER__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.CLASSIFIER__PACKAGE:
                setPackage((uml.Package)null);
                return;
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                return;
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)null);
                return;
            case UmlPackage.CLASSIFIER__IS_ABSTRACT:
                setIsAbstract(IS_ABSTRACT_EDEFAULT);
                return;
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                getGeneralization().clear();
                return;
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                getPowertypeExtent().clear();
                return;
            case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
                getRedefinedClassifier().clear();
                return;
            case UmlPackage.CLASSIFIER__GENERAL:
                getGeneral().clear();
                return;
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                getSubstitution().clear();
                return;
            case UmlPackage.CLASSIFIER__REPRESENTATION:
                setRepresentation((CollaborationUse)null);
                return;
            case UmlPackage.CLASSIFIER__COLLABORATION_USE:
                getCollaborationUse().clear();
                return;
            case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
                getOwnedUseCase().clear();
                return;
            case UmlPackage.CLASSIFIER__USE_CASE:
                getUseCase().clear();
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
            case UmlPackage.CLASSIFIER__IS_LEAF:
                return isLeaf != IS_LEAF_EDEFAULT;
            case UmlPackage.CLASSIFIER__REDEFINED_ELEMENT:
                return !getRedefinedElement().isEmpty();
            case UmlPackage.CLASSIFIER__REDEFINITION_CONTEXT:
                return !getRedefinitionContext().isEmpty();
            case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER:
                return templateParameter != null;
            case UmlPackage.CLASSIFIER__PACKAGE:
                return basicGetPackage() != null;
            case UmlPackage.CLASSIFIER__TEMPLATE_BINDING:
                return templateBinding != null && !templateBinding.isEmpty();
            case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
                return ownedTemplateSignature != null;
            case UmlPackage.CLASSIFIER__IS_ABSTRACT:
                return isAbstract != IS_ABSTRACT_EDEFAULT;
            case UmlPackage.CLASSIFIER__GENERALIZATION:
                return generalization != null && !generalization.isEmpty();
            case UmlPackage.CLASSIFIER__POWERTYPE_EXTENT:
                return powertypeExtent != null && !powertypeExtent.isEmpty();
            case UmlPackage.CLASSIFIER__FEATURE:
                return !getFeature().isEmpty();
            case UmlPackage.CLASSIFIER__INHERITED_MEMBER:
                return !getInheritedMember().isEmpty();
            case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
                return redefinedClassifier != null && !redefinedClassifier.isEmpty();
            case UmlPackage.CLASSIFIER__GENERAL:
                return !getGeneral().isEmpty();
            case UmlPackage.CLASSIFIER__SUBSTITUTION:
                return substitution != null && !substitution.isEmpty();
            case UmlPackage.CLASSIFIER__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case UmlPackage.CLASSIFIER__REPRESENTATION:
                return representation != null;
            case UmlPackage.CLASSIFIER__COLLABORATION_USE:
                return collaborationUse != null && !collaborationUse.isEmpty();
            case UmlPackage.CLASSIFIER__OWNED_USE_CASE:
                return ownedUseCase != null && !ownedUseCase.isEmpty();
            case UmlPackage.CLASSIFIER__USE_CASE:
                return useCase != null && !useCase.isEmpty();
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
        if (baseClass == RedefinableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.CLASSIFIER__IS_LEAF: return UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF;
                case UmlPackage.CLASSIFIER__REDEFINED_ELEMENT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
                case UmlPackage.CLASSIFIER__REDEFINITION_CONTEXT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == ParameterableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Type.class) {
            switch (derivedFeatureID) {
                case UmlPackage.CLASSIFIER__PACKAGE: return UmlPackage.TYPE__PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.CLASSIFIER__TEMPLATE_BINDING: return UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
                case UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
        if (baseClass == RedefinableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UmlPackage.CLASSIFIER__IS_LEAF;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UmlPackage.CLASSIFIER__REDEFINED_ELEMENT;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UmlPackage.CLASSIFIER__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == ParameterableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UmlPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UmlPackage.CLASSIFIER__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Type.class) {
            switch (baseFeatureID) {
                case UmlPackage.TYPE__PACKAGE: return UmlPackage.CLASSIFIER__PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UmlPackage.CLASSIFIER__TEMPLATE_BINDING;
                case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (isLeaf: ");
        result.append(isLeaf);
        result.append(", isAbstract: ");
        result.append(isAbstract);
        result.append(')');
        return result.toString();
    }

} //ClassifierImpl
