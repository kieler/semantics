/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.transformationtree.impl;

import de.cau.cs.kieler.ktm.transformationtree.Element;
import de.cau.cs.kieler.ktm.transformationtree.Model;
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation;
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getTransformedInto <em>Transformed Into</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getTransformedFrom <em>Transformed From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelImpl#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<Element> elements;

    /**
     * The cached value of the '{@link #getTransformedInto() <em>Transformed Into</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformedInto()
     * @generated
     * @ordered
     */
    protected EList<ModelTransformation> transformedInto;

    /**
     * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransient()
     * @generated
     * @ordered
     */
    protected static final boolean TRANSIENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransient()
     * @generated
     * @ordered
     */
    protected boolean transient_ = TRANSIENT_EDEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EClass type;

    /**
     * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootElement()
     * @generated
     * @ordered
     */
    protected Element rootElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformationTreePackage.Literals.MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, TransformationTreePackage.MODEL__ELEMENTS, TransformationTreePackage.ELEMENT__MODEL);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelTransformation> getTransformedInto() {
        if (transformedInto == null) {
            transformedInto = new EObjectContainmentWithInverseEList<ModelTransformation>(ModelTransformation.class, this, TransformationTreePackage.MODEL__TRANSFORMED_INTO, TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE);
        }
        return transformedInto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTransformation getTransformedFrom() {
        if (eContainerFeatureID() != TransformationTreePackage.MODEL__TRANSFORMED_FROM) return null;
        return (ModelTransformation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformedFrom(ModelTransformation newTransformedFrom, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTransformedFrom, TransformationTreePackage.MODEL__TRANSFORMED_FROM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransformedFrom(ModelTransformation newTransformedFrom) {
        if (newTransformedFrom != eInternalContainer() || (eContainerFeatureID() != TransformationTreePackage.MODEL__TRANSFORMED_FROM && newTransformedFrom != null)) {
            if (EcoreUtil.isAncestor(this, newTransformedFrom))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTransformedFrom != null)
                msgs = ((InternalEObject)newTransformedFrom).eInverseAdd(this, TransformationTreePackage.MODEL_TRANSFORMATION__TARGET, ModelTransformation.class, msgs);
            msgs = basicSetTransformedFrom(newTransformedFrom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL__TRANSFORMED_FROM, newTransformedFrom, newTransformedFrom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTransient() {
        return transient_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransient(boolean newTransient) {
        boolean oldTransient = transient_;
        transient_ = newTransient;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL__TRANSIENT, oldTransient, transient_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (EClass)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationTreePackage.MODEL__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(EClass newType) {
        EClass oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getRootElement() {
        if (rootElement != null && rootElement.eIsProxy()) {
            InternalEObject oldRootElement = (InternalEObject)rootElement;
            rootElement = (Element)eResolveProxy(oldRootElement);
            if (rootElement != oldRootElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationTreePackage.MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
            }
        }
        return rootElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetRootElement() {
        return rootElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootElement(Element newRootElement) {
        Element oldRootElement = rootElement;
        rootElement = newRootElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
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
            case TransformationTreePackage.MODEL__ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformedInto()).basicAdd(otherEnd, msgs);
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTransformedFrom((ModelTransformation)otherEnd, msgs);
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
            case TransformationTreePackage.MODEL__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                return ((InternalEList<?>)getTransformedInto()).basicRemove(otherEnd, msgs);
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                return basicSetTransformedFrom(null, msgs);
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
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                return eInternalContainer().eInverseRemove(this, TransformationTreePackage.MODEL_TRANSFORMATION__TARGET, ModelTransformation.class, msgs);
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
            case TransformationTreePackage.MODEL__NAME:
                return getName();
            case TransformationTreePackage.MODEL__ELEMENTS:
                return getElements();
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                return getTransformedInto();
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                return getTransformedFrom();
            case TransformationTreePackage.MODEL__TRANSIENT:
                return isTransient();
            case TransformationTreePackage.MODEL__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case TransformationTreePackage.MODEL__ROOT_ELEMENT:
                if (resolve) return getRootElement();
                return basicGetRootElement();
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
            case TransformationTreePackage.MODEL__NAME:
                setName((String)newValue);
                return;
            case TransformationTreePackage.MODEL__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Element>)newValue);
                return;
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                getTransformedInto().clear();
                getTransformedInto().addAll((Collection<? extends ModelTransformation>)newValue);
                return;
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                setTransformedFrom((ModelTransformation)newValue);
                return;
            case TransformationTreePackage.MODEL__TRANSIENT:
                setTransient((Boolean)newValue);
                return;
            case TransformationTreePackage.MODEL__TYPE:
                setType((EClass)newValue);
                return;
            case TransformationTreePackage.MODEL__ROOT_ELEMENT:
                setRootElement((Element)newValue);
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
            case TransformationTreePackage.MODEL__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TransformationTreePackage.MODEL__ELEMENTS:
                getElements().clear();
                return;
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                getTransformedInto().clear();
                return;
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                setTransformedFrom((ModelTransformation)null);
                return;
            case TransformationTreePackage.MODEL__TRANSIENT:
                setTransient(TRANSIENT_EDEFAULT);
                return;
            case TransformationTreePackage.MODEL__TYPE:
                setType((EClass)null);
                return;
            case TransformationTreePackage.MODEL__ROOT_ELEMENT:
                setRootElement((Element)null);
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
            case TransformationTreePackage.MODEL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TransformationTreePackage.MODEL__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case TransformationTreePackage.MODEL__TRANSFORMED_INTO:
                return transformedInto != null && !transformedInto.isEmpty();
            case TransformationTreePackage.MODEL__TRANSFORMED_FROM:
                return getTransformedFrom() != null;
            case TransformationTreePackage.MODEL__TRANSIENT:
                return transient_ != TRANSIENT_EDEFAULT;
            case TransformationTreePackage.MODEL__TYPE:
                return type != null;
            case TransformationTreePackage.MODEL__ROOT_ELEMENT:
                return rootElement != null;
        }
        return super.eIsSet(featureID);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", transient: ");
        result.append(transient_);
        result.append(')');
        return result.toString();
    }

} //ModelImpl
