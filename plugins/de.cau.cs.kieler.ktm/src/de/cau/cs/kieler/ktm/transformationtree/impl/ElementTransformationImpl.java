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
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation;
import de.cau.cs.kieler.ktm.transformationtree.TransformationTreePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl#getModelTransformation <em>Model Transformation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.ktm.transformationtree.impl.ElementTransformationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTransformationImpl extends MinimalEObjectImpl.Container implements ElementTransformation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Element source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Element target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementTransformationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformationTreePackage.Literals.ELEMENT_TRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTransformation getModelTransformation() {
        if (eContainerFeatureID() != TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION) return null;
        return (ModelTransformation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModelTransformation(ModelTransformation newModelTransformation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModelTransformation, TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelTransformation(ModelTransformation newModelTransformation) {
        if (newModelTransformation != eInternalContainer() || (eContainerFeatureID() != TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION && newModelTransformation != null)) {
            if (EcoreUtil.isAncestor(this, newModelTransformation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModelTransformation != null)
                msgs = ((InternalEObject)newModelTransformation).eInverseAdd(this, TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS, ModelTransformation.class, msgs);
            msgs = basicSetModelTransformation(newModelTransformation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION, newModelTransformation, newModelTransformation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Element)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(Element newSource, NotificationChain msgs) {
        Element oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Element newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, TransformationTreePackage.ELEMENT__TRANSFORMED_INTO, Element.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, TransformationTreePackage.ELEMENT__TRANSFORMED_INTO, Element.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (Element)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(Element newTarget, NotificationChain msgs) {
        Element oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(Element newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, TransformationTreePackage.ELEMENT__TRANSFORMED_FROM, Element.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, TransformationTreePackage.ELEMENT__TRANSFORMED_FROM, Element.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModelTransformation((ModelTransformation)otherEnd, msgs);
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, TransformationTreePackage.ELEMENT__TRANSFORMED_INTO, Element.class, msgs);
                return basicSetSource((Element)otherEnd, msgs);
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, TransformationTreePackage.ELEMENT__TRANSFORMED_FROM, Element.class, msgs);
                return basicSetTarget((Element)otherEnd, msgs);
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                return basicSetModelTransformation(null, msgs);
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                return basicSetSource(null, msgs);
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                return basicSetTarget(null, msgs);
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                return eInternalContainer().eInverseRemove(this, TransformationTreePackage.MODEL_TRANSFORMATION__ELEMENT_TRANSFORMATIONS, ModelTransformation.class, msgs);
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                return getModelTransformation();
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                setModelTransformation((ModelTransformation)newValue);
                return;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                setSource((Element)newValue);
                return;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                setTarget((Element)newValue);
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                setModelTransformation((ModelTransformation)null);
                return;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                setSource((Element)null);
                return;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                setTarget((Element)null);
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
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__MODEL_TRANSFORMATION:
                return getModelTransformation() != null;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__SOURCE:
                return source != null;
            case TransformationTreePackage.ELEMENT_TRANSFORMATION__TARGET:
                return target != null;
        }
        return super.eIsSet(featureID);
    }

} //ElementTransformationImpl
