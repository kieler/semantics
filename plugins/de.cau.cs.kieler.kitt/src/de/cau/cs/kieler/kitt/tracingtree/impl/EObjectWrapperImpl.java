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
import de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper;
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper;
import de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage;

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
 * An implementation of the model object '<em><b>EObject Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.EObjectWrapperImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.EObjectWrapperImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.EObjectWrapperImpl#getTargetTransformations <em>Target Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.EObjectWrapperImpl#getSourceTransformations <em>Source Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.impl.EObjectWrapperImpl#getEObject <em>EObject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectWrapperImpl extends MinimalEObjectImpl.Container implements EObjectWrapper {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisplayName()
     * @generated
     * @ordered
     */
    protected static final String DISPLAY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisplayName()
     * @generated
     * @ordered
     */
    protected String displayName = DISPLAY_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getTargetTransformations() <em>Target Transformations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetTransformations()
     * @generated
     * @ordered
     */
    protected EList<EObjectTransformation> targetTransformations;

    /**
     * The cached value of the '{@link #getSourceTransformations() <em>Source Transformations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceTransformations()
     * @generated
     * @ordered
     */
    protected EList<EObjectTransformation> sourceTransformations;

    /**
     * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEObject()
     * @generated
     * @ordered
     */
    protected EObject eObject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EObjectWrapperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TracingTreePackage.Literals.EOBJECT_WRAPPER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelWrapper getModel() {
        if (eContainerFeatureID() != TracingTreePackage.EOBJECT_WRAPPER__MODEL) return null;
        return (ModelWrapper)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ModelWrapper newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TracingTreePackage.EOBJECT_WRAPPER__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ModelWrapper newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TracingTreePackage.EOBJECT_WRAPPER__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS, ModelWrapper.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.EOBJECT_WRAPPER__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisplayName(String newDisplayName) {
        String oldDisplayName = displayName;
        displayName = newDisplayName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.EOBJECT_WRAPPER__DISPLAY_NAME, oldDisplayName, displayName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObjectTransformation> getTargetTransformations() {
        if (targetTransformations == null) {
            targetTransformations = new EObjectWithInverseResolvingEList<EObjectTransformation>(EObjectTransformation.class, this, TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS, TracingTreePackage.EOBJECT_TRANSFORMATION__SOURCE);
        }
        return targetTransformations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObjectTransformation> getSourceTransformations() {
        if (sourceTransformations == null) {
            sourceTransformations = new EObjectWithInverseResolvingEList<EObjectTransformation>(EObjectTransformation.class, this, TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS, TracingTreePackage.EOBJECT_TRANSFORMATION__TARGET);
        }
        return sourceTransformations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getEObject() {
        if (eObject != null && eObject.eIsProxy()) {
            InternalEObject oldEObject = (InternalEObject)eObject;
            eObject = eResolveProxy(oldEObject);
            if (eObject != oldEObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracingTreePackage.EOBJECT_WRAPPER__EOBJECT, oldEObject, eObject));
            }
        }
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetEObject() {
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEObject(EObject newEObject) {
        EObject oldEObject = eObject;
        eObject = newEObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TracingTreePackage.EOBJECT_WRAPPER__EOBJECT, oldEObject, eObject));
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((ModelWrapper)otherEnd, msgs);
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetTransformations()).basicAdd(otherEnd, msgs);
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceTransformations()).basicAdd(otherEnd, msgs);
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                return basicSetModel(null, msgs);
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                return ((InternalEList<?>)getTargetTransformations()).basicRemove(otherEnd, msgs);
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                return ((InternalEList<?>)getSourceTransformations()).basicRemove(otherEnd, msgs);
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                return eInternalContainer().eInverseRemove(this, TracingTreePackage.MODEL_WRAPPER__MODEL_OBJECTS, ModelWrapper.class, msgs);
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                return getModel();
            case TracingTreePackage.EOBJECT_WRAPPER__DISPLAY_NAME:
                return getDisplayName();
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                return getTargetTransformations();
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                return getSourceTransformations();
            case TracingTreePackage.EOBJECT_WRAPPER__EOBJECT:
                if (resolve) return getEObject();
                return basicGetEObject();
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                setModel((ModelWrapper)newValue);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__DISPLAY_NAME:
                setDisplayName((String)newValue);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                getTargetTransformations().clear();
                getTargetTransformations().addAll((Collection<? extends EObjectTransformation>)newValue);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                getSourceTransformations().clear();
                getSourceTransformations().addAll((Collection<? extends EObjectTransformation>)newValue);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__EOBJECT:
                setEObject((EObject)newValue);
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                setModel((ModelWrapper)null);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__DISPLAY_NAME:
                setDisplayName(DISPLAY_NAME_EDEFAULT);
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                getTargetTransformations().clear();
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                getSourceTransformations().clear();
                return;
            case TracingTreePackage.EOBJECT_WRAPPER__EOBJECT:
                setEObject((EObject)null);
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
            case TracingTreePackage.EOBJECT_WRAPPER__MODEL:
                return getModel() != null;
            case TracingTreePackage.EOBJECT_WRAPPER__DISPLAY_NAME:
                return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
            case TracingTreePackage.EOBJECT_WRAPPER__TARGET_TRANSFORMATIONS:
                return targetTransformations != null && !targetTransformations.isEmpty();
            case TracingTreePackage.EOBJECT_WRAPPER__SOURCE_TRANSFORMATIONS:
                return sourceTransformations != null && !sourceTransformations.isEmpty();
            case TracingTreePackage.EOBJECT_WRAPPER__EOBJECT:
                return eObject != null;
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
        result.append(" (displayName: ");
        result.append(displayName);
        result.append(')');
        return result.toString();
    }

} //EObjectWrapperImpl
