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

import uml.Classifier;
import uml.DeployedArtifact;
import uml.InstanceSpecification;
import uml.PackageableElement;
import uml.ParameterableElement;
import uml.Slot;
import uml.TemplateParameter;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InstanceSpecificationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.InstanceSpecificationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.impl.InstanceSpecificationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.impl.InstanceSpecificationImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link uml.impl.InstanceSpecificationImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificationImpl extends DeploymentTargetImpl implements InstanceSpecification {
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
     * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> classifier;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected EList<Slot> slot;

    /**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected ValueSpecification specification;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInstanceSpecification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getClassifier() {
        if (classifier == null) {
            classifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER);
        }
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Slot> getSlot() {
        if (slot == null) {
            slot = new EObjectContainmentWithInverseEList<Slot>(Slot.class, this, UmlPackage.INSTANCE_SPECIFICATION__SLOT, UmlPackage.SLOT__OWNING_INSTANCE);
        }
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getSpecification() {
        return specification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecification(ValueSpecification newSpecification, NotificationChain msgs) {
        ValueSpecification oldSpecification = specification;
        specification = newSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION, oldSpecification, newSpecification);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecification(ValueSpecification newSpecification) {
        if (newSpecification != specification) {
            NotificationChain msgs = null;
            if (specification != null)
                msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION, null, msgs);
            if (newSpecification != null)
                msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION, null, msgs);
            msgs = basicSetSpecification(newSpecification, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION, newSpecification, newSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean defining_feature(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INSTANCE_SPECIFICATION__DEFINING_FEATURE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "defining_feature", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean structural_feature(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INSTANCE_SPECIFICATION__STRUCTURAL_FEATURE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "structural_feature", EObjectValidator.getObjectLabel(this, context) }),
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
                         UmlValidator.INSTANCE_SPECIFICATION__DEPLOYMENT_TARGET,
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
    public boolean deployment_artifact(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INSTANCE_SPECIFICATION__DEPLOYMENT_ARTIFACT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployment_artifact", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlot()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
            case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
                return basicSetSpecification(null, msgs);
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
            case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
                return getClassifier();
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                return getSlot();
            case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
                return getSpecification();
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
                getClassifier().clear();
                getClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                getSlot().clear();
                getSlot().addAll((Collection<? extends Slot>)newValue);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
                setSpecification((ValueSpecification)newValue);
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
                getClassifier().clear();
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                getSlot().clear();
                return;
            case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
                setSpecification((ValueSpecification)null);
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
            case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER:
                return templateParameter != null;
            case UmlPackage.INSTANCE_SPECIFICATION__CLASSIFIER:
                return classifier != null && !classifier.isEmpty();
            case UmlPackage.INSTANCE_SPECIFICATION__SLOT:
                return slot != null && !slot.isEmpty();
            case UmlPackage.INSTANCE_SPECIFICATION__SPECIFICATION:
                return specification != null;
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
                case UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == DeployedArtifact.class) {
            switch (derivedFeatureID) {
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
                case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UmlPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UmlPackage.INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == PackageableElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == DeployedArtifact.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InstanceSpecificationImpl
