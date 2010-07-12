/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.ParameterableElement;
import uml.TemplateParameter;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ParameterableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.ParameterableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterableElementImpl extends ElementImpl implements ParameterableElement {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterableElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getParameterableElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
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
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
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
            case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
                return templateParameter != null;
        }
        return super.eIsSet(featureID);
    }

} //ParameterableElementImpl
