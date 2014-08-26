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
package de.cau.cs.kieler.kitt.tracingtree.impl;

import de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation;
import de.cau.cs.kieler.kitt.tracingtree.ModelTransformation;
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper;
import de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage;

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
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.ModelTransformationImpl#getTransformationID <em>Transformation ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.ModelTransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.ModelTransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.ModelTransformationImpl#getObjectTransformations <em>Object Transformations</em>}</li>
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
     * The default value of the '{@link #getTransformationID() <em>Transformation ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformationID()
     * @generated
     * @ordered
     */
    protected static final String TRANSFORMATION_ID_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getTransformationID() <em>Transformation ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformationID()
     * @generated
     * @ordered
     */
    protected String transformationID = TRANSFORMATION_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected ModelWrapper target;

    /**
     * The cached value of the '{@link #getObjectTransformations() <em>Object Transformations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectTransformations()
     * @generated
     * @ordered
     */
    protected EList<EObjectTransformation> objectTransformations;

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
        return TracingTreePackage.Literals.MODEL_TRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTransformationID() {
        return transformationID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransformationID(String newTransformationID) {
        String oldTransformationID = transformationID;
        transformationID = newTransformationID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_TRANSFORMATION__TRANSFORMATION_ID, oldTransformationID, transformationID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelWrapper getSource() {
        if (eContainerFeatureID() != TracingTreePackage.MODEL_TRANSFORMATION__SOURCE) return null;
        return (ModelWrapper)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(ModelWrapper newSource, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSource, TracingTreePackage.MODEL_TRANSFORMATION__SOURCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(ModelWrapper newSource) {
        if (newSource != eInternalContainer() || (eContainerFeatureID() != TracingTreePackage.MODEL_TRANSFORMATION__SOURCE && newSource != null)) {
            if (EcoreUtil.isAncestor(this, newSource))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS, ModelWrapper.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_TRANSFORMATION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelWrapper getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(ModelWrapper newTarget, NotificationChain msgs) {
        ModelWrapper oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_TRANSFORMATION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(ModelWrapper newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION, ModelWrapper.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION, ModelWrapper.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_TRANSFORMATION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObjectTransformation> getObjectTransformations() {
        if (objectTransformations == null) {
            objectTransformations = new EObjectContainmentWithInverseEList<EObjectTransformation>(EObjectTransformation.class, this, TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS, TracingTreePackage.EOBJECT_TRANSFORMATION__MODEL_TRANSFORMATION);
        }
        return objectTransformations;
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
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSource((ModelWrapper)otherEnd, msgs);
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracingTreePackage.MODEL_TRANSFORMATION__TARGET, null, msgs);
                return basicSetTarget((ModelWrapper)otherEnd, msgs);
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectTransformations()).basicAdd(otherEnd, msgs);
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
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return basicSetSource(null, msgs);
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                return basicSetTarget(null, msgs);
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                return ((InternalEList<?>)getObjectTransformations()).basicRemove(otherEnd, msgs);
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
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return eInternalContainer().eInverseRemove(this, TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS, ModelWrapper.class, msgs);
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
            case TracingTreePackage.MODEL_TRANSFORMATION__TRANSFORMATION_ID:
                return getTransformationID();
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return getSource();
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                return getTarget();
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                return getObjectTransformations();
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
            case TracingTreePackage.MODEL_TRANSFORMATION__TRANSFORMATION_ID:
                setTransformationID((String)newValue);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                setSource((ModelWrapper)newValue);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                setTarget((ModelWrapper)newValue);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                getObjectTransformations().clear();
                getObjectTransformations().addAll((Collection<? extends EObjectTransformation>)newValue);
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
            case TracingTreePackage.MODEL_TRANSFORMATION__TRANSFORMATION_ID:
                setTransformationID(TRANSFORMATION_ID_EDEFAULT);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                setSource((ModelWrapper)null);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                setTarget((ModelWrapper)null);
                return;
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                getObjectTransformations().clear();
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
            case TracingTreePackage.MODEL_TRANSFORMATION__TRANSFORMATION_ID:
                return TRANSFORMATION_ID_EDEFAULT == null ? transformationID != null : !TRANSFORMATION_ID_EDEFAULT.equals(transformationID);
            case TracingTreePackage.MODEL_TRANSFORMATION__SOURCE:
                return getSource() != null;
            case TracingTreePackage.MODEL_TRANSFORMATION__TARGET:
                return target != null;
            case TracingTreePackage.MODEL_TRANSFORMATION__OBJECT_TRANSFORMATIONS:
                return objectTransformations != null && !objectTransformations.isEmpty();
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
        result.append(" (transformationID: ");
        result.append(transformationID);
        result.append(')');
        return result.toString();
    }

} //ModelTransformationImpl
