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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Classifier;
import uml.Component;
import uml.ComponentRealization;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ComponentRealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link uml.impl.ComponentRealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentRealizationImpl extends RealizationImpl implements ComponentRealization {
    /**
     * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealizingClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> realizingClassifier;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentRealizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getComponentRealization();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getAbstraction() {
        if (eContainerFeatureID() != UmlPackage.COMPONENT_REALIZATION__ABSTRACTION) return null;
        return (Component)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbstraction(Component newAbstraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAbstraction, UmlPackage.COMPONENT_REALIZATION__ABSTRACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstraction(Component newAbstraction) {
        if (newAbstraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.COMPONENT_REALIZATION__ABSTRACTION && newAbstraction != null)) {
            if (EcoreUtil.isAncestor(this, newAbstraction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAbstraction != null)
                msgs = ((InternalEObject)newAbstraction).eInverseAdd(this, UmlPackage.COMPONENT__REALIZATION, Component.class, msgs);
            msgs = basicSetAbstraction(newAbstraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMPONENT_REALIZATION__ABSTRACTION, newAbstraction, newAbstraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getRealizingClassifier() {
        if (realizingClassifier == null) {
            realizingClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER);
        }
        return realizingClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAbstraction((Component)otherEnd, msgs);
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                return basicSetAbstraction(null, msgs);
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.COMPONENT__REALIZATION, Component.class, msgs);
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                return getAbstraction();
            case UmlPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
                return getRealizingClassifier();
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                setAbstraction((Component)newValue);
                return;
            case UmlPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
                getRealizingClassifier().clear();
                getRealizingClassifier().addAll((Collection<? extends Classifier>)newValue);
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                setAbstraction((Component)null);
                return;
            case UmlPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
                getRealizingClassifier().clear();
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
            case UmlPackage.COMPONENT_REALIZATION__ABSTRACTION:
                return getAbstraction() != null;
            case UmlPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
                return realizingClassifier != null && !realizingClassifier.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComponentRealizationImpl
