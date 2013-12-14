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
import de.cau.cs.kieler.ktm.transformationtree.ElementTransformation;
import de.cau.cs.kieler.ktm.transformationtree.Model;
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl#getTransformedInto <em>Transformed Into</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl#getTransformedFrom <em>Transformed From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementImpl#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
     * The cached value of the '{@link #getTransformedInto() <em>Transformed Into</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformedInto()
     * @generated
     * @ordered
     */
    protected EList<ElementTransformation> transformedInto;

    /**
     * The cached value of the '{@link #getTransformedFrom() <em>Transformed From</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformedFrom()
     * @generated
     * @ordered
     */
    protected EList<ElementTransformation> transformedFrom;

    /**
     * The cached value of the '{@link #getReferencedObject() <em>Referenced Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedObject()
     * @generated
     * @ordered
     */
    protected EObject referencedObject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformationTreePackage.Literals.ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getModel() {
        if (eContainerFeatureID() != TransformationTreePackage.ELEMENT__MODEL) return null;
        return (Model)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TransformationTreePackage.ELEMENT__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(Model newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TransformationTreePackage.ELEMENT__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, TransformationTreePackage.MODEL__ELEMENTS, Model.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT__MODEL, newModel, newModel));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementTransformation> getTransformedInto() {
        if (transformedInto == null) {
            transformedInto = new EObjectWithInverseResolvingEList<ElementTransformation>(ElementTransformation.class, this, TransformationTreePackage.ELEMENT__TRANSFORMED_INTO, TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE);
        }
        return transformedInto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementTransformation> getTransformedFrom() {
        if (transformedFrom == null) {
            transformedFrom = new EObjectWithInverseResolvingEList<ElementTransformation>(ElementTransformation.class, this, TransformationTreePackage.ELEMENT__TRANSFORMED_FROM, TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET);
        }
        return transformedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getReferencedObject() {
        if (referencedObject != null && referencedObject.eIsProxy()) {
            InternalEObject oldReferencedObject = (InternalEObject)referencedObject;
            referencedObject = eResolveProxy(oldReferencedObject);
            if (referencedObject != oldReferencedObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationTreePackage.ELEMENT__REFERENCED_OBJECT, oldReferencedObject, referencedObject));
            }
        }
        return referencedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetReferencedObject() {
        return referencedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedObject(EObject newReferencedObject) {
        EObject oldReferencedObject = referencedObject;
        referencedObject = newReferencedObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT__REFERENCED_OBJECT, oldReferencedObject, referencedObject));
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
            case TransformationTreePackage.ELEMENT__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((Model)otherEnd, msgs);
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformedInto()).basicAdd(otherEnd, msgs);
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformedFrom()).basicAdd(otherEnd, msgs);
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
            case TransformationTreePackage.ELEMENT__MODEL:
                return basicSetModel(null, msgs);
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                return ((InternalEList<?>)getTransformedInto()).basicRemove(otherEnd, msgs);
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                return ((InternalEList<?>)getTransformedFrom()).basicRemove(otherEnd, msgs);
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
            case TransformationTreePackage.ELEMENT__MODEL:
                return eInternalContainer().eInverseRemove(this, TransformationTreePackage.MODEL__ELEMENTS, Model.class, msgs);
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
            case TransformationTreePackage.ELEMENT__MODEL:
                return getModel();
            case TransformationTreePackage.ELEMENT__NAME:
                return getName();
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                return getTransformedInto();
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                return getTransformedFrom();
            case TransformationTreePackage.ELEMENT__REFERENCED_OBJECT:
                if (resolve) return getReferencedObject();
                return basicGetReferencedObject();
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
            case TransformationTreePackage.ELEMENT__MODEL:
                setModel((Model)newValue);
                return;
            case TransformationTreePackage.ELEMENT__NAME:
                setName((String)newValue);
                return;
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                getTransformedInto().clear();
                getTransformedInto().addAll((Collection<? extends ElementTransformation>)newValue);
                return;
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                getTransformedFrom().clear();
                getTransformedFrom().addAll((Collection<? extends ElementTransformation>)newValue);
                return;
            case TransformationTreePackage.ELEMENT__REFERENCED_OBJECT:
                setReferencedObject((EObject)newValue);
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
            case TransformationTreePackage.ELEMENT__MODEL:
                setModel((Model)null);
                return;
            case TransformationTreePackage.ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                getTransformedInto().clear();
                return;
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                getTransformedFrom().clear();
                return;
            case TransformationTreePackage.ELEMENT__REFERENCED_OBJECT:
                setReferencedObject((EObject)null);
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
            case TransformationTreePackage.ELEMENT__MODEL:
                return getModel() != null;
            case TransformationTreePackage.ELEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TransformationTreePackage.ELEMENT__TRANSFORMED_INTO:
                return transformedInto != null && !transformedInto.isEmpty();
            case TransformationTreePackage.ELEMENT__TRANSFORMED_FROM:
                return transformedFrom != null && !transformedFrom.isEmpty();
            case TransformationTreePackage.ELEMENT__REFERENCED_OBJECT:
                return referencedObject != null;
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
        result.append(')');
        return result.toString();
    }

} //ElementImpl
