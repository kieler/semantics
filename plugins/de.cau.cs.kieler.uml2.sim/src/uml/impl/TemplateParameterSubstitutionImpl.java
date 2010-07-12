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

import uml.ParameterableElement;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution {
    /**
     * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormal()
     * @generated
     * @ordered
     */
    protected TemplateParameter formal;

    /**
     * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActual()
     * @generated
     * @ordered
     */
    protected ParameterableElement actual;

    /**
     * The cached value of the '{@link #getOwnedActual() <em>Owned Actual</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedActual()
     * @generated
     * @ordered
     */
    protected ParameterableElement ownedActual;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemplateParameterSubstitutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTemplateParameterSubstitution();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getFormal() {
        if (formal != null && formal.eIsProxy()) {
            InternalEObject oldFormal = (InternalEObject)formal;
            formal = (TemplateParameter)eResolveProxy(oldFormal);
            if (formal != oldFormal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
            }
        }
        return formal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter basicGetFormal() {
        return formal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormal(TemplateParameter newFormal) {
        TemplateParameter oldFormal = formal;
        formal = newFormal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getActual() {
        if (actual != null && actual.eIsProxy()) {
            InternalEObject oldActual = (InternalEObject)actual;
            actual = (ParameterableElement)eResolveProxy(oldActual);
            if (actual != oldActual) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
            }
        }
        return actual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement basicGetActual() {
        return actual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActual(ParameterableElement newActual) {
        ParameterableElement oldActual = actual;
        actual = newActual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getOwnedActual() {
        return ownedActual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedActual(ParameterableElement newOwnedActual, NotificationChain msgs) {
        ParameterableElement oldOwnedActual = ownedActual;
        ownedActual = newOwnedActual;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, oldOwnedActual, newOwnedActual);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedActual(ParameterableElement newOwnedActual) {
        if (newOwnedActual != ownedActual) {
            NotificationChain msgs = null;
            if (ownedActual != null)
                msgs = ((InternalEObject)ownedActual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, null, msgs);
            if (newOwnedActual != null)
                msgs = ((InternalEObject)newOwnedActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, null, msgs);
            msgs = basicSetOwnedActual(newOwnedActual, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, newOwnedActual, newOwnedActual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateBinding getTemplateBinding() {
        if (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
        return (TemplateBinding)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplateBinding(TemplateBinding newTemplateBinding) {
        if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null)) {
            if (EcoreUtil.isAncestor(this, newTemplateBinding))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTemplateBinding != null)
                msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
            msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean must_be_compatible(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TEMPLATE_PARAMETER_SUBSTITUTION__MUST_BE_COMPATIBLE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "must_be_compatible", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTemplateBinding((TemplateBinding)otherEnd, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
                return basicSetOwnedActual(null, msgs);
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                return basicSetTemplateBinding(null, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
                if (resolve) return getFormal();
                return basicGetFormal();
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
                if (resolve) return getActual();
                return basicGetActual();
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
                return getOwnedActual();
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                return getTemplateBinding();
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
                setFormal((TemplateParameter)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
                setActual((ParameterableElement)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
                setOwnedActual((ParameterableElement)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                setTemplateBinding((TemplateBinding)newValue);
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
                setFormal((TemplateParameter)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
                setActual((ParameterableElement)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
                setOwnedActual((ParameterableElement)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                setTemplateBinding((TemplateBinding)null);
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
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
                return formal != null;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
                return actual != null;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
                return ownedActual != null;
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
                return getTemplateBinding() != null;
        }
        return super.eIsSet(featureID);
    }

} //TemplateParameterSubstitutionImpl
