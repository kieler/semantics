/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.ParameterableElement;
import uml.TemplateBinding;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TemplateableElementImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.impl.TemplateableElementImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TemplateableElementImpl extends ElementImpl implements TemplateableElement {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemplateableElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTemplateableElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateBinding> getTemplateBinding() {
        if (templateBinding == null) {
            templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                if (ownedTemplateSignature != null)
                    msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
                return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
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
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                return basicSetOwnedTemplateSignature(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                return getTemplateBinding();
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                return getOwnedTemplateSignature();
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
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
                return;
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)newValue);
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
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                return;
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)null);
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
            case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
                return templateBinding != null && !templateBinding.isEmpty();
            case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
                return ownedTemplateSignature != null;
        }
        return super.eIsSet(featureID);
    }

} //TemplateableElementImpl
