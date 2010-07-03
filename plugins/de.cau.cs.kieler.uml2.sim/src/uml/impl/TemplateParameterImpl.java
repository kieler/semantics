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
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends ElementImpl implements TemplateParameter {
    /**
     * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameteredElement()
     * @generated
     * @ordered
     */
    protected ParameterableElement parameteredElement;

    /**
     * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedParameteredElement()
     * @generated
     * @ordered
     */
    protected ParameterableElement ownedParameteredElement;

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected ParameterableElement default_;

    /**
     * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedDefault()
     * @generated
     * @ordered
     */
    protected ParameterableElement ownedDefault;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemplateParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTemplateParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature getSignature() {
        if (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER__SIGNATURE) return null;
        return (TemplateSignature)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSignature, UmlPackage.TEMPLATE_PARAMETER__SIGNATURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignature(TemplateSignature newSignature) {
        if (newSignature != eInternalContainer() || (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null)) {
            if (EcoreUtil.isAncestor(this, newSignature))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSignature != null)
                msgs = ((InternalEObject)newSignature).eInverseAdd(this, UmlPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
            msgs = basicSetSignature(newSignature, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getParameteredElement() {
        if (parameteredElement != null && parameteredElement.eIsProxy()) {
            InternalEObject oldParameteredElement = (InternalEObject)parameteredElement;
            parameteredElement = (ParameterableElement)eResolveProxy(oldParameteredElement);
            if (parameteredElement != oldParameteredElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, parameteredElement));
            }
        }
        return parameteredElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement basicGetParameteredElement() {
        return parameteredElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameteredElement(ParameterableElement newParameteredElement, NotificationChain msgs) {
        ParameterableElement oldParameteredElement = parameteredElement;
        parameteredElement = newParameteredElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, newParameteredElement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameteredElement(ParameterableElement newParameteredElement) {
        if (newParameteredElement != parameteredElement) {
            NotificationChain msgs = null;
            if (parameteredElement != null)
                msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
            if (newParameteredElement != null)
                msgs = ((InternalEObject)newParameteredElement).eInverseAdd(this, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
            msgs = basicSetParameteredElement(newParameteredElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getOwnedParameteredElement() {
        return ownedParameteredElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedParameteredElement(ParameterableElement newOwnedParameteredElement, NotificationChain msgs) {
        ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
        ownedParameteredElement = newOwnedParameteredElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, oldOwnedParameteredElement, newOwnedParameteredElement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedParameteredElement(ParameterableElement newOwnedParameteredElement) {
        if (newOwnedParameteredElement != ownedParameteredElement) {
            NotificationChain msgs = null;
            if (ownedParameteredElement != null)
                msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
            if (newOwnedParameteredElement != null)
                msgs = ((InternalEObject)newOwnedParameteredElement).eInverseAdd(this, UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
            msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getDefault() {
        if (default_ != null && default_.eIsProxy()) {
            InternalEObject oldDefault = (InternalEObject)default_;
            default_ = (ParameterableElement)eResolveProxy(oldDefault);
            if (default_ != oldDefault) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
            }
        }
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement basicGetDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(ParameterableElement newDefault) {
        ParameterableElement oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterableElement getOwnedDefault() {
        return ownedDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedDefault(ParameterableElement newOwnedDefault, NotificationChain msgs) {
        ParameterableElement oldOwnedDefault = ownedDefault;
        ownedDefault = newOwnedDefault;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, oldOwnedDefault, newOwnedDefault);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedDefault(ParameterableElement newOwnedDefault) {
        if (newOwnedDefault != ownedDefault) {
            NotificationChain msgs = null;
            if (ownedDefault != null)
                msgs = ((InternalEObject)ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
            if (newOwnedDefault != null)
                msgs = ((InternalEObject)newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
            msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));
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
                         UmlValidator.TEMPLATE_PARAMETER__MUST_BE_COMPATIBLE,
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSignature((TemplateSignature)otherEnd, msgs);
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                if (parameteredElement != null)
                    msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
                return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                if (ownedParameteredElement != null)
                    msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
                return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                return basicSetSignature(null, msgs);
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                return basicSetParameteredElement(null, msgs);
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                return basicSetOwnedParameteredElement(null, msgs);
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
                return basicSetOwnedDefault(null, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                return getSignature();
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                if (resolve) return getParameteredElement();
                return basicGetParameteredElement();
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                return getOwnedParameteredElement();
            case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
                if (resolve) return getDefault();
                return basicGetDefault();
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
                return getOwnedDefault();
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                setSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                setParameteredElement((ParameterableElement)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                setOwnedParameteredElement((ParameterableElement)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
                setDefault((ParameterableElement)newValue);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
                setOwnedDefault((ParameterableElement)newValue);
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                setSignature((TemplateSignature)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                setParameteredElement((ParameterableElement)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                setOwnedParameteredElement((ParameterableElement)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
                setDefault((ParameterableElement)null);
                return;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
                setOwnedDefault((ParameterableElement)null);
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
            case UmlPackage.TEMPLATE_PARAMETER__SIGNATURE:
                return getSignature() != null;
            case UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
                return parameteredElement != null;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
                return ownedParameteredElement != null;
            case UmlPackage.TEMPLATE_PARAMETER__DEFAULT:
                return default_ != null;
            case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
                return ownedDefault != null;
        }
        return super.eIsSet(featureID);
    }

} //TemplateParameterImpl
