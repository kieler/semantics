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

import de.cau.cs.kieler.ktm.transformationtree.ElementTransformation;
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
 * An implementation of the model object '<em><b>Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ModelTransformationImpl#getElementTransformations <em>Element Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTransformationImpl extends MinimalEObjectImpl.Container implements ModelTransformation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Model target;

    /**
     * The cached value of the '{@link #getElementTransformations() <em>Element Transformations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementTransformations()
     * @generated
     * @ordered
     */
    protected EList<ElementTransformation> elementTransformations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelTransformationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformationTreePackage.Literals.MODEL_TRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL_TRANSFORMATION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getSource() {
        if (eContainerFeatureID() != TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE) return null;
        return (Model)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(Model newSource, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSource, TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Model newSource) {
        if (newSource != eInternalContainer() || (eContainerFeatureID() != TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE && newSource != null)) {
            if (EcoreUtil.isAncestor(this, newSource))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, TransformationTreePackage.MODEL__TRANSFORMED_INTO, Model.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(Model newTarget, NotificationChain msgs) {
        Model oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL_TRANSFORMATION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(Model newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, TransformationTreePackage.MODEL__TRANSFORMED_FROM, Model.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, TransformationTreePackage.MODEL__TRANSFORMED_FROM, Model.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.MODEL_TRANSFORMATION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementTransformation> getElementTransformations() {
        if (elementTransformations == null) {
            elementTransformations = new EObjectContainmentWithInverseEList<ElementTransformation>(ElementTransformation.class, this, TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS, TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION);
        }
        return elementTransformations;
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSource((Model)otherEnd, msgs);
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationTreePackage.MODEL_TRANSFORMATION__TARGET, null, msgs);
                return basicSetTarget((Model)otherEnd, msgs);
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementTransformations()).basicAdd(otherEnd, msgs);
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return basicSetSource(null, msgs);
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                return basicSetTarget(null, msgs);
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                return ((InternalEList<?>)getElementTransformations()).basicRemove(otherEnd, msgs);
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return eInternalContainer().eInverseRemove(this, TransformationTreePackage.MODEL__TRANSFORMED_INTO, Model.class, msgs);
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__ID:
                return getId();
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return getSource();
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                return getTarget();
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                return getElementTransformations();
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__ID:
                setId((String)newValue);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                setSource((Model)newValue);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                setTarget((Model)newValue);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                getElementTransformations().clear();
                getElementTransformations().addAll((Collection<? extends ElementTransformation>)newValue);
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__ID:
                setId(ID_EDEFAULT);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                setSource((Model)null);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                setTarget((Model)null);
                return;
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                getElementTransformations().clear();
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
            case TransformationTreePackage.MODEL_TRANSFORMATION__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case TransformationTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return getSource() != null;
            case TransformationTreePackage.MODEL_TRANSFORMATION__TARGET:
                return target != null;
            case TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS:
                return elementTransformations != null && !elementTransformations.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //ModelTransformationImpl
