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
import uml.RedefinableTemplateSignature;
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getExtendedSignature <em>Extended Signature</em>}</li>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getInheritedParameter <em>Inherited Parameter</em>}</li>
 *   <li>{@link uml.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature {
    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<TemplateParameter> parameter;

    /**
     * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedParameter()
     * @generated
     * @ordered
     */
    protected EList<TemplateParameter> ownedParameter;

    /**
     * The cached value of the '{@link #getExtendedSignature() <em>Extended Signature</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedSignature()
     * @generated
     * @ordered
     */
    protected EList<RedefinableTemplateSignature> extendedSignature;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RedefinableTemplateSignatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getRedefinableTemplateSignature();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateParameter> getParameter() {
        if (parameter == null) {
            parameter = new EObjectResolvingEList<TemplateParameter>(TemplateParameter.class, this, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER);
        }
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateParameter> getOwnedParameter() {
        if (ownedParameter == null) {
            ownedParameter = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER, UmlPackage.TEMPLATE_PARAMETER__SIGNATURE);
        }
        return ownedParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateableElement getTemplate() {
        if (eContainerFeatureID() != UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE) return null;
        return (TemplateableElement)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTemplate, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(TemplateableElement newTemplate) {
        if (newTemplate != eInternalContainer() || (eContainerFeatureID() != UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
            if (EcoreUtil.isAncestor(this, newTemplate))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTemplate != null)
                msgs = ((InternalEObject)newTemplate).eInverseAdd(this, UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
            msgs = basicSetTemplate(newTemplate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RedefinableTemplateSignature> getExtendedSignature() {
        if (extendedSignature == null) {
            extendedSignature = new EObjectResolvingEList<RedefinableTemplateSignature>(RedefinableTemplateSignature.class, this, UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
        }
        return extendedSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateParameter> getInheritedParameter() {
        // TODO: implement this method to return the 'Inherited Parameter' reference list
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
    public Classifier getClassifier() {
        Classifier classifier = basicGetClassifier();
        return classifier != null && classifier.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)classifier) : classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetClassifier() {
        // TODO: implement this method to return the 'Classifier' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean inherited_parameters(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETERS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inherited_parameters", EObjectValidator.getObjectLabel(this, context) }),
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
    public EList<TemplateParameter> getInheritedParameters() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean own_elements(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TEMPLATE_SIGNATURE__OWN_ELEMENTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "own_elements", EObjectValidator.getObjectLabel(this, context) }),
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTemplate((TemplateableElement)otherEnd, msgs);
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                return basicSetTemplate(null, msgs);
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
                return getParameter();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                return getOwnedParameter();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                return getTemplate();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
                return getExtendedSignature();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
                return getInheritedParameter();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
                if (resolve) return getClassifier();
                return basicGetClassifier();
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
                getParameter().clear();
                getParameter().addAll((Collection<? extends TemplateParameter>)newValue);
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                setTemplate((TemplateableElement)newValue);
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
                getExtendedSignature().clear();
                getExtendedSignature().addAll((Collection<? extends RedefinableTemplateSignature>)newValue);
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
                getParameter().clear();
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                setTemplate((TemplateableElement)null);
                return;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
                getExtendedSignature().clear();
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
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
                return parameter != null && !parameter.isEmpty();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
                return ownedParameter != null && !ownedParameter.isEmpty();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
                return getTemplate() != null;
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
                return extendedSignature != null && !extendedSignature.isEmpty();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
                return !getInheritedParameter().isEmpty();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
                return basicGetClassifier() != null;
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
        if (baseClass == TemplateSignature.class) {
            switch (derivedFeatureID) {
                case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER: return UmlPackage.TEMPLATE_SIGNATURE__PARAMETER;
                case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UmlPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
                case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE: return UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE;
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
        if (baseClass == TemplateSignature.class) {
            switch (baseFeatureID) {
                case UmlPackage.TEMPLATE_SIGNATURE__PARAMETER: return UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
                case UmlPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
                case UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE: return UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //RedefinableTemplateSignatureImpl
