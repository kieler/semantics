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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.AggregationKind;
import uml.Association;
import uml.ConnectableElement;
import uml.ConnectorEnd;
import uml.DataType;
import uml.Deployment;
import uml.DeploymentTarget;
import uml.PackageableElement;
import uml.ParameterableElement;
import uml.Property;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.Type;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getEnd <em>End</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
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
     * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeployment()
     * @generated
     * @ordered
     */
    protected EList<Deployment> deployment;

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
     * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DERIVED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected boolean isDerived = IS_DERIVED_EDEFAULT;

    /**
     * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerivedUnion()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerivedUnion()
     * @generated
     * @ordered
     */
    protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

    /**
     * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.NONE;

    /**
     * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsComposite()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMPOSITE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #getRedefinedProperty() <em>Redefined Property</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> redefinedProperty;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected ValueSpecification defaultValue;

    /**
     * The cached value of the '{@link #getSubsettedProperty() <em>Subsetted Property</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubsettedProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> subsettedProperty;

    /**
     * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected Association association;

    /**
     * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQualifier()
     * @generated
     * @ordered
     */
    protected EList<Property> qualifier;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getProperty();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConnectorEnd> getEnd() {
        // TODO: implement this method to return the 'End' reference list
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
    public EList<Deployment> getDeployment() {
        if (deployment == null) {
            deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, UmlPackage.PROPERTY__DEPLOYMENT, UmlPackage.DEPLOYMENT__LOCATION);
        }
        return deployment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getDeployedElement() {
        // TODO: implement this method to return the 'Deployed Element' reference list
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
    public EList<TemplateBinding> getTemplateBinding() {
        if (templateBinding == null) {
            templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, UmlPackage.PROPERTY__TEMPLATE_BINDING, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Class getClass_() {
        uml.Class class_ = basicGetClass();
        return class_ != null && class_.eIsProxy() ? (uml.Class)eResolveProxy((InternalEObject)class_) : class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Class basicGetClass() {
        // TODO: implement this method to return the 'Class' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDatatype() {
        if (eContainerFeatureID() != UmlPackage.PROPERTY__DATATYPE) return null;
        return (DataType)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDatatype, UmlPackage.PROPERTY__DATATYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatatype(DataType newDatatype) {
        if (newDatatype != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROPERTY__DATATYPE && newDatatype != null)) {
            if (EcoreUtil.isAncestor(this, newDatatype))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatatype != null)
                msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
            msgs = basicSetDatatype(newDatatype, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__DATATYPE, newDatatype, newDatatype));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDerived() {
        return isDerived;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDerived(boolean newIsDerived) {
        boolean oldIsDerived = isDerived;
        isDerived = newIsDerived;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDerivedUnion() {
        return isDerivedUnion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDerivedUnion(boolean newIsDerivedUnion) {
        boolean oldIsDerivedUnion = isDerivedUnion;
        isDerivedUnion = newIsDerivedUnion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefault() {
        // TODO: implement this method to return the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(String newDefault) {
        // TODO: implement this method to set the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDefault() {
        // TODO: implement this method to unset the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDefault() {
        // TODO: implement this method to return whether the 'Default' attribute is set
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationKind getAggregation() {
        return aggregation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAggregation(AggregationKind newAggregation) {
        AggregationKind oldAggregation = aggregation;
        aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__AGGREGATION, oldAggregation, aggregation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComposite() {
        // TODO: implement this method to return the 'Is Composite' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsComposite(boolean newIsComposite) {
        // TODO: implement this method to set the 'Is Composite' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getRedefinedProperty() {
        if (redefinedProperty == null) {
            redefinedProperty = new EObjectResolvingEList<Property>(Property.class, this, UmlPackage.PROPERTY__REDEFINED_PROPERTY);
        }
        return redefinedProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association getOwningAssociation() {
        if (eContainerFeatureID() != UmlPackage.PROPERTY__OWNING_ASSOCIATION) return null;
        return (Association)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningAssociation, UmlPackage.PROPERTY__OWNING_ASSOCIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningAssociation(Association newOwningAssociation) {
        if (newOwningAssociation != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROPERTY__OWNING_ASSOCIATION && newOwningAssociation != null)) {
            if (EcoreUtil.isAncestor(this, newOwningAssociation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningAssociation != null)
                msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, UmlPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
            msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
        ValueSpecification oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(ValueSpecification newDefaultValue) {
        if (newDefaultValue != defaultValue) {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PROPERTY__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PROPERTY__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getOpposite() {
        Property opposite = basicGetOpposite();
        return opposite != null && opposite.eIsProxy() ? (Property)eResolveProxy((InternalEObject)opposite) : opposite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property basicGetOpposite() {
        // TODO: implement this method to return the 'Opposite' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpposite(Property newOpposite) {
        // TODO: implement this method to set the 'Opposite' reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getSubsettedProperty() {
        if (subsettedProperty == null) {
            subsettedProperty = new EObjectResolvingEList<Property>(Property.class, this, UmlPackage.PROPERTY__SUBSETTED_PROPERTY);
        }
        return subsettedProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association getAssociation() {
        if (association != null && association.eIsProxy()) {
            InternalEObject oldAssociation = (InternalEObject)association;
            association = (Association)eResolveProxy(oldAssociation);
            if (association != oldAssociation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROPERTY__ASSOCIATION, oldAssociation, association));
            }
        }
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association basicGetAssociation() {
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
        Association oldAssociation = association;
        association = newAssociation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociation(Association newAssociation) {
        if (newAssociation != association) {
            NotificationChain msgs = null;
            if (association != null)
                msgs = ((InternalEObject)association).eInverseRemove(this, UmlPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
            if (newAssociation != null)
                msgs = ((InternalEObject)newAssociation).eInverseAdd(this, UmlPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
            msgs = basicSetAssociation(newAssociation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__ASSOCIATION, newAssociation, newAssociation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getQualifier() {
        if (qualifier == null) {
            qualifier = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UmlPackage.PROPERTY__QUALIFIER, UmlPackage.PROPERTY__ASSOCIATION_END);
        }
        return qualifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getAssociationEnd() {
        if (eContainerFeatureID() != UmlPackage.PROPERTY__ASSOCIATION_END) return null;
        return (Property)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssociationEnd(Property newAssociationEnd, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, UmlPackage.PROPERTY__ASSOCIATION_END, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociationEnd(Property newAssociationEnd) {
        if (newAssociationEnd != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROPERTY__ASSOCIATION_END && newAssociationEnd != null)) {
            if (EcoreUtil.isAncestor(this, newAssociationEnd))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAssociationEnd != null)
                msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, UmlPackage.PROPERTY__QUALIFIER, Property.class, msgs);
            msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean multiplicity_of_composite(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__MULTIPLICITY_OF_COMPOSITE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "multiplicity_of_composite", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean subsetting_context_conforms(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__SUBSETTING_CONTEXT_CONFORMS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetting_context_conforms", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean redefined_property_inherited(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__REDEFINED_PROPERTY_INHERITED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefined_property_inherited", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean subsetting_rules(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__SUBSETTING_RULES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetting_rules", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean navigable_readonly(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__NAVIGABLE_READONLY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "navigable_readonly", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean derived_union_is_derived(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__DERIVED_UNION_IS_DERIVED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "derived_union_is_derived", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean derived_union_is_read_only(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__DERIVED_UNION_IS_READ_ONLY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "derived_union_is_read_only", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean subsetted_property_names(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__SUBSETTED_PROPERTY_NAMES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subsetted_property_names", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean deployment_target(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__DEPLOYMENT_TARGET,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployment_target", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean binding_to_attribute(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROPERTY__BINDING_TO_ATTRIBUTE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "binding_to_attribute", EObjectValidator.getObjectLabel(this, context) }),
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
    public void setIsNavigable(boolean isNavigable) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getOtherEnd() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooleanDefaultValue(boolean value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntegerDefaultValue(int value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStringDefaultValue(String value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnlimitedNaturalDefaultValue(int value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNullDefaultValue() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAttribute(Property p) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isComposite() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> subsettingContext() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNavigable() {
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
    public EList<PackageableElement> getDeployedElements() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConnectorEnd> getEnds() {
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.PROPERTY__DEPLOYMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                if (ownedTemplateSignature != null)
                    msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
                return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
            case UmlPackage.PROPERTY__DATATYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDatatype((DataType)otherEnd, msgs);
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningAssociation((Association)otherEnd, msgs);
            case UmlPackage.PROPERTY__ASSOCIATION:
                if (association != null)
                    msgs = ((InternalEObject)association).eInverseRemove(this, UmlPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
                return basicSetAssociation((Association)otherEnd, msgs);
            case UmlPackage.PROPERTY__QUALIFIER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualifier()).basicAdd(otherEnd, msgs);
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAssociationEnd((Property)otherEnd, msgs);
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
            case UmlPackage.PROPERTY__DEPLOYMENT:
                return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                return basicSetOwnedTemplateSignature(null, msgs);
            case UmlPackage.PROPERTY__DATATYPE:
                return basicSetDatatype(null, msgs);
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                return basicSetOwningAssociation(null, msgs);
            case UmlPackage.PROPERTY__DEFAULT_VALUE:
                return basicSetDefaultValue(null, msgs);
            case UmlPackage.PROPERTY__ASSOCIATION:
                return basicSetAssociation(null, msgs);
            case UmlPackage.PROPERTY__QUALIFIER:
                return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                return basicSetAssociationEnd(null, msgs);
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            case UmlPackage.PROPERTY__DATATYPE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                return eInternalContainer().eInverseRemove(this, UmlPackage.PROPERTY__QUALIFIER, Property.class, msgs);
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
            case UmlPackage.PROPERTY__END:
                return getEnd();
            case UmlPackage.PROPERTY__DEPLOYMENT:
                return getDeployment();
            case UmlPackage.PROPERTY__DEPLOYED_ELEMENT:
                return getDeployedElement();
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                return getTemplateBinding();
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                return getOwnedTemplateSignature();
            case UmlPackage.PROPERTY__CLASS:
                if (resolve) return getClass_();
                return basicGetClass();
            case UmlPackage.PROPERTY__DATATYPE:
                return getDatatype();
            case UmlPackage.PROPERTY__IS_DERIVED:
                return isIsDerived();
            case UmlPackage.PROPERTY__IS_DERIVED_UNION:
                return isIsDerivedUnion();
            case UmlPackage.PROPERTY__DEFAULT:
                return getDefault();
            case UmlPackage.PROPERTY__AGGREGATION:
                return getAggregation();
            case UmlPackage.PROPERTY__IS_COMPOSITE:
                return isIsComposite();
            case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
                return getRedefinedProperty();
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                return getOwningAssociation();
            case UmlPackage.PROPERTY__DEFAULT_VALUE:
                return getDefaultValue();
            case UmlPackage.PROPERTY__OPPOSITE:
                if (resolve) return getOpposite();
                return basicGetOpposite();
            case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
                return getSubsettedProperty();
            case UmlPackage.PROPERTY__ASSOCIATION:
                if (resolve) return getAssociation();
                return basicGetAssociation();
            case UmlPackage.PROPERTY__QUALIFIER:
                return getQualifier();
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                return getAssociationEnd();
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.PROPERTY__END:
                getEnd().clear();
                getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
                return;
            case UmlPackage.PROPERTY__DEPLOYMENT:
                getDeployment().clear();
                getDeployment().addAll((Collection<? extends Deployment>)newValue);
                return;
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
                return;
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.PROPERTY__DATATYPE:
                setDatatype((DataType)newValue);
                return;
            case UmlPackage.PROPERTY__IS_DERIVED:
                setIsDerived((Boolean)newValue);
                return;
            case UmlPackage.PROPERTY__IS_DERIVED_UNION:
                setIsDerivedUnion((Boolean)newValue);
                return;
            case UmlPackage.PROPERTY__DEFAULT:
                setDefault((String)newValue);
                return;
            case UmlPackage.PROPERTY__AGGREGATION:
                setAggregation((AggregationKind)newValue);
                return;
            case UmlPackage.PROPERTY__IS_COMPOSITE:
                setIsComposite((Boolean)newValue);
                return;
            case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
                getRedefinedProperty().clear();
                getRedefinedProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                setOwningAssociation((Association)newValue);
                return;
            case UmlPackage.PROPERTY__DEFAULT_VALUE:
                setDefaultValue((ValueSpecification)newValue);
                return;
            case UmlPackage.PROPERTY__OPPOSITE:
                setOpposite((Property)newValue);
                return;
            case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
                getSubsettedProperty().clear();
                getSubsettedProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.PROPERTY__ASSOCIATION:
                setAssociation((Association)newValue);
                return;
            case UmlPackage.PROPERTY__QUALIFIER:
                getQualifier().clear();
                getQualifier().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                setAssociationEnd((Property)newValue);
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.PROPERTY__END:
                getEnd().clear();
                return;
            case UmlPackage.PROPERTY__DEPLOYMENT:
                getDeployment().clear();
                return;
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                return;
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)null);
                return;
            case UmlPackage.PROPERTY__DATATYPE:
                setDatatype((DataType)null);
                return;
            case UmlPackage.PROPERTY__IS_DERIVED:
                setIsDerived(IS_DERIVED_EDEFAULT);
                return;
            case UmlPackage.PROPERTY__IS_DERIVED_UNION:
                setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
                return;
            case UmlPackage.PROPERTY__DEFAULT:
                unsetDefault();
                return;
            case UmlPackage.PROPERTY__AGGREGATION:
                setAggregation(AGGREGATION_EDEFAULT);
                return;
            case UmlPackage.PROPERTY__IS_COMPOSITE:
                setIsComposite(IS_COMPOSITE_EDEFAULT);
                return;
            case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
                getRedefinedProperty().clear();
                return;
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                setOwningAssociation((Association)null);
                return;
            case UmlPackage.PROPERTY__DEFAULT_VALUE:
                setDefaultValue((ValueSpecification)null);
                return;
            case UmlPackage.PROPERTY__OPPOSITE:
                setOpposite((Property)null);
                return;
            case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
                getSubsettedProperty().clear();
                return;
            case UmlPackage.PROPERTY__ASSOCIATION:
                setAssociation((Association)null);
                return;
            case UmlPackage.PROPERTY__QUALIFIER:
                getQualifier().clear();
                return;
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                setAssociationEnd((Property)null);
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
            case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.PROPERTY__TEMPLATE_PARAMETER:
                return templateParameter != null;
            case UmlPackage.PROPERTY__END:
                return !getEnd().isEmpty();
            case UmlPackage.PROPERTY__DEPLOYMENT:
                return deployment != null && !deployment.isEmpty();
            case UmlPackage.PROPERTY__DEPLOYED_ELEMENT:
                return !getDeployedElement().isEmpty();
            case UmlPackage.PROPERTY__TEMPLATE_BINDING:
                return templateBinding != null && !templateBinding.isEmpty();
            case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE:
                return ownedTemplateSignature != null;
            case UmlPackage.PROPERTY__CLASS:
                return basicGetClass() != null;
            case UmlPackage.PROPERTY__DATATYPE:
                return getDatatype() != null;
            case UmlPackage.PROPERTY__IS_DERIVED:
                return isDerived != IS_DERIVED_EDEFAULT;
            case UmlPackage.PROPERTY__IS_DERIVED_UNION:
                return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
            case UmlPackage.PROPERTY__DEFAULT:
                return isSetDefault();
            case UmlPackage.PROPERTY__AGGREGATION:
                return aggregation != AGGREGATION_EDEFAULT;
            case UmlPackage.PROPERTY__IS_COMPOSITE:
                return isIsComposite() != IS_COMPOSITE_EDEFAULT;
            case UmlPackage.PROPERTY__REDEFINED_PROPERTY:
                return redefinedProperty != null && !redefinedProperty.isEmpty();
            case UmlPackage.PROPERTY__OWNING_ASSOCIATION:
                return getOwningAssociation() != null;
            case UmlPackage.PROPERTY__DEFAULT_VALUE:
                return defaultValue != null;
            case UmlPackage.PROPERTY__OPPOSITE:
                return basicGetOpposite() != null;
            case UmlPackage.PROPERTY__SUBSETTED_PROPERTY:
                return subsettedProperty != null && !subsettedProperty.isEmpty();
            case UmlPackage.PROPERTY__ASSOCIATION:
                return association != null;
            case UmlPackage.PROPERTY__QUALIFIER:
                return qualifier != null && !qualifier.isEmpty();
            case UmlPackage.PROPERTY__ASSOCIATION_END:
                return getAssociationEnd() != null;
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
                case UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PROPERTY__TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == ConnectableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PROPERTY__END: return UmlPackage.CONNECTABLE_ELEMENT__END;
                default: return -1;
            }
        }
        if (baseClass == DeploymentTarget.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PROPERTY__DEPLOYMENT: return UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
                case UmlPackage.PROPERTY__DEPLOYED_ELEMENT: return UmlPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PROPERTY__TEMPLATE_BINDING: return UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
                case UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
                case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UmlPackage.PROPERTY__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == ConnectableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.CONNECTABLE_ELEMENT__END: return UmlPackage.PROPERTY__END;
                default: return -1;
            }
        }
        if (baseClass == DeploymentTarget.class) {
            switch (baseFeatureID) {
                case UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return UmlPackage.PROPERTY__DEPLOYMENT;
                case UmlPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UmlPackage.PROPERTY__DEPLOYED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UmlPackage.PROPERTY__TEMPLATE_BINDING;
                case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.PROPERTY__OWNED_TEMPLATE_SIGNATURE;
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
        result.append(" (isDerived: ");
        result.append(isDerived);
        result.append(", isDerivedUnion: ");
        result.append(isDerivedUnion);
        result.append(", aggregation: ");
        result.append(aggregation);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
