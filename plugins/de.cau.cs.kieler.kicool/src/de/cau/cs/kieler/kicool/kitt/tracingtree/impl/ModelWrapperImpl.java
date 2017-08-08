/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kicool.kitt.tracingtree.impl;

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

import de.cau.cs.kieler.kicool.kitt.tracingtree.EObjectWrapper;
import de.cau.cs.kieler.kicool.kitt.tracingtree.ModelTransformation;
import de.cau.cs.kieler.kicool.kitt.tracingtree.ModelWrapper;
import de.cau.cs.kieler.kicool.kitt.tracingtree.TracingTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#getModelTypeID <em>Model Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#getModelObjects <em>Model Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#getTargetTransformations <em>Target Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#getSourceTransformation <em>Source Transformation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.kitt.tracingtree.impl.ModelWrapperImpl#getRootObject <em>Root Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelWrapperImpl extends MinimalEObjectImpl.Container implements ModelWrapper {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getModelTypeID() <em>Model Type ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelTypeID()
     * @generated
     * @ordered
     */
    protected static final String MODEL_TYPE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelTypeID() <em>Model Type ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelTypeID()
     * @generated
     * @ordered
     */
    protected String modelTypeID = MODEL_TYPE_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getModelObjects() <em>Model Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelObjects()
     * @generated
     * @ordered
     */
    protected EList<EObjectWrapper> modelObjects;

    /**
     * The cached value of the '{@link #getTargetTransformations() <em>Target Transformations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetTransformations()
     * @generated
     * @ordered
     */
    protected EList<ModelTransformation> targetTransformations;

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
     * The cached value of the '{@link #getRootObject() <em>Root Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootObject()
     * @generated
     * @ordered
     */
    protected EObjectWrapper rootObject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelWrapperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TracingTreePackage.Literals.MODEL_WRAPPER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModelTypeID() {
        return modelTypeID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelTypeID(String newModelTypeID) {
        String oldModelTypeID = modelTypeID;
        modelTypeID = newModelTypeID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_WRAPPER__MODEL_TYPE_ID, oldModelTypeID, modelTypeID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObjectWrapper> getModelObjects() {
        if (modelObjects == null) {
            modelObjects = new EObjectContainmentWithInverseEList<EObjectWrapper>(EObjectWrapper.class, this, TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS, TracingTreePackage.EOBJECT_WRAPPER__MODEL);
        }
        return modelObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelTransformation> getTargetTransformations() {
        if (targetTransformations == null) {
            targetTransformations = new EObjectContainmentWithInverseEList<ModelTransformation>(ModelTransformation.class, this, TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS, TracingTreePackage.MODEL_TRANSFORMATION__SOURCE);
        }
        return targetTransformations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTransformation getSourceTransformation() {
        if (eContainerFeatureID() != TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION) return null;
        return (ModelTransformation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceTransformation(ModelTransformation newSourceTransformation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSourceTransformation, TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceTransformation(ModelTransformation newSourceTransformation) {
        if (newSourceTransformation != eInternalContainer() || (eContainerFeatureID() != TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION && newSourceTransformation != null)) {
            if (EcoreUtil.isAncestor(this, newSourceTransformation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSourceTransformation != null)
                msgs = ((InternalEObject)newSourceTransformation).eInverseAdd(this, TracingTreePackage.MODEL_TRANSFORMATION__TARGET, ModelTransformation.class, msgs);
            msgs = basicSetSourceTransformation(newSourceTransformation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION, newSourceTransformation, newSourceTransformation));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_WRAPPER__TRANSIENT, oldTransient, transient_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObjectWrapper getRootObject() {
        if (rootObject != null && rootObject.eIsProxy()) {
            InternalEObject oldRootObject = (InternalEObject)rootObject;
            rootObject = (EObjectWrapper)eResolveProxy(oldRootObject);
            if (rootObject != oldRootObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT, oldRootObject, rootObject));
            }
        }
        return rootObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObjectWrapper basicGetRootObject() {
        return rootObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootObject(EObjectWrapper newRootObject) {
        EObjectWrapper oldRootObject = rootObject;
        rootObject = newRootObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT, oldRootObject, rootObject));
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelObjects()).basicAdd(otherEnd, msgs);
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetTransformations()).basicAdd(otherEnd, msgs);
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSourceTransformation((ModelTransformation)otherEnd, msgs);
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                return ((InternalEList<?>)getModelObjects()).basicRemove(otherEnd, msgs);
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                return ((InternalEList<?>)getTargetTransformations()).basicRemove(otherEnd, msgs);
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                return basicSetSourceTransformation(null, msgs);
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
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                return eInternalContainer().eInverseRemove(this, TracingTreePackage.MODEL_TRANSFORMATION__TARGET, ModelTransformation.class, msgs);
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_TYPE_ID:
                return getModelTypeID();
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                return getModelObjects();
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                return getTargetTransformations();
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                return getSourceTransformation();
            case TracingTreePackage.MODEL_WRAPPER__TRANSIENT:
                return isTransient();
            case TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT:
                if (resolve) return getRootObject();
                return basicGetRootObject();
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_TYPE_ID:
                setModelTypeID((String)newValue);
                return;
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                getModelObjects().clear();
                getModelObjects().addAll((Collection<? extends EObjectWrapper>)newValue);
                return;
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                getTargetTransformations().clear();
                getTargetTransformations().addAll((Collection<? extends ModelTransformation>)newValue);
                return;
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                setSourceTransformation((ModelTransformation)newValue);
                return;
            case TracingTreePackage.MODEL_WRAPPER__TRANSIENT:
                setTransient((Boolean)newValue);
                return;
            case TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT:
                setRootObject((EObjectWrapper)newValue);
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_TYPE_ID:
                setModelTypeID(MODEL_TYPE_ID_EDEFAULT);
                return;
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                getModelObjects().clear();
                return;
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                getTargetTransformations().clear();
                return;
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                setSourceTransformation((ModelTransformation)null);
                return;
            case TracingTreePackage.MODEL_WRAPPER__TRANSIENT:
                setTransient(TRANSIENT_EDEFAULT);
                return;
            case TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT:
                setRootObject((EObjectWrapper)null);
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
            case TracingTreePackage.MODEL_WRAPPER__MODEL_TYPE_ID:
                return MODEL_TYPE_ID_EDEFAULT == null ? modelTypeID != null : !MODEL_TYPE_ID_EDEFAULT.equals(modelTypeID);
            case TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS:
                return modelObjects != null && !modelObjects.isEmpty();
            case TracingTreePackage.MODEL_WRAPPER__TARGET_TRANSFORMATIONS:
                return targetTransformations != null && !targetTransformations.isEmpty();
            case TracingTreePackage.MODEL_WRAPPER__SOURCE_TRANSFORMATION:
                return getSourceTransformation() != null;
            case TracingTreePackage.MODEL_WRAPPER__TRANSIENT:
                return transient_ != TRANSIENT_EDEFAULT;
            case TracingTreePackage.MODEL_WRAPPER__ROOT_OBJECT:
                return rootObject != null;
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
        result.append(" (modelTypeID: ");
        result.append(modelTypeID);
        result.append(", transient: ");
        result.append(transient_);
        result.append(')');
        return result.toString();
    }

} //ModelWrapperImpl
