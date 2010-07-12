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
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.TemplateBinding;
import uml.TemplateParameterSubstitution;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link uml.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends DirectedRelationshipImpl implements TemplateBinding {
    /**
     * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignature()
     * @generated
     * @ordered
     */
    protected TemplateSignature signature;

    /**
     * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterSubstitution()
     * @generated
     * @ordered
     */
    protected EList<TemplateParameterSubstitution> parameterSubstitution;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemplateBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTemplateBinding();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature getSignature() {
        if (signature != null && signature.eIsProxy()) {
            InternalEObject oldSignature = (InternalEObject)signature;
            signature = (TemplateSignature)eResolveProxy(oldSignature);
            if (signature != oldSignature) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
            }
        }
        return signature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature basicGetSignature() {
        return signature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignature(TemplateSignature newSignature) {
        TemplateSignature oldSignature = signature;
        signature = newSignature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        if (parameterSubstitution == null) {
            parameterSubstitution = new EObjectContainmentWithInverseEList<TemplateParameterSubstitution>(TemplateParameterSubstitution.class, this, UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
        }
        return parameterSubstitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateableElement getBoundElement() {
        if (eContainerFeatureID() != UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT) return null;
        return (TemplateableElement)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBoundElement(TemplateableElement newBoundElement, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBoundElement, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBoundElement(TemplateableElement newBoundElement) {
        if (newBoundElement != eInternalContainer() || (eContainerFeatureID() != UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null)) {
            if (EcoreUtil.isAncestor(this, newBoundElement))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBoundElement != null)
                msgs = ((InternalEObject)newBoundElement).eInverseAdd(this, UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
            msgs = basicSetBoundElement(newBoundElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement, newBoundElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean parameter_substitution_formal(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION_FORMAL,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "parameter_substitution_formal", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean one_parameter_substitution(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TEMPLATE_BINDING__ONE_PARAMETER_SUBSTITUTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "one_parameter_substitution", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSubstitution()).basicAdd(otherEnd, msgs);
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBoundElement((TemplateableElement)otherEnd, msgs);
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
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                return basicSetBoundElement(null, msgs);
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
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
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
            case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
                if (resolve) return getSignature();
                return basicGetSignature();
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                return getParameterSubstitution();
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                return getBoundElement();
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
            case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
                setSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                getParameterSubstitution().clear();
                getParameterSubstitution().addAll((Collection<? extends TemplateParameterSubstitution>)newValue);
                return;
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                setBoundElement((TemplateableElement)newValue);
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
            case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
                setSignature((TemplateSignature)null);
                return;
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                getParameterSubstitution().clear();
                return;
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                setBoundElement((TemplateableElement)null);
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
            case UmlPackage.TEMPLATE_BINDING__SIGNATURE:
                return signature != null;
            case UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
                return parameterSubstitution != null && !parameterSubstitution.isEmpty();
            case UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
                return getBoundElement() != null;
        }
        return super.eIsSet(featureID);
    }

} //TemplateBindingImpl
