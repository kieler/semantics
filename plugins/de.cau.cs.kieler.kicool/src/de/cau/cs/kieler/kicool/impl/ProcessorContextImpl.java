/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorContext;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorContextImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorContextImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorContextImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorContextImpl extends MinimalEObjectImpl.Container implements ProcessorContext {
    /**
     * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnvironment()
     * @generated
     * @ordered
     */
    protected Map<String, String> environment;

    /**
     * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceModel()
     * @generated
     * @ordered
     */
    protected EObject sourceModel;

    /**
     * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargets()
     * @generated
     * @ordered
     */
    protected EList<ProcessorContext> targets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessorContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KiCoolPackage.Literals.PROCESSOR_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnvironment(Map<String, String> newEnvironment) {
        Map<String, String> oldEnvironment = environment;
        environment = newEnvironment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_CONTEXT__ENVIRONMENT, oldEnvironment, environment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getSourceModel() {
        if (sourceModel != null && sourceModel.eIsProxy()) {
            InternalEObject oldSourceModel = (InternalEObject)sourceModel;
            sourceModel = eResolveProxy(oldSourceModel);
            if (sourceModel != oldSourceModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL, oldSourceModel, sourceModel));
            }
        }
        return sourceModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetSourceModel() {
        return sourceModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceModel(EObject newSourceModel) {
        EObject oldSourceModel = sourceModel;
        sourceModel = newSourceModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL, oldSourceModel, sourceModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProcessorContext> getTargets() {
        if (targets == null) {
            targets = new EObjectContainmentEList<ProcessorContext>(ProcessorContext.class, this, KiCoolPackage.PROCESSOR_CONTEXT__TARGETS);
        }
        return targets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KiCoolPackage.PROCESSOR_CONTEXT__TARGETS:
                return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
            case KiCoolPackage.PROCESSOR_CONTEXT__ENVIRONMENT:
                return getEnvironment();
            case KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL:
                if (resolve) return getSourceModel();
                return basicGetSourceModel();
            case KiCoolPackage.PROCESSOR_CONTEXT__TARGETS:
                return getTargets();
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
            case KiCoolPackage.PROCESSOR_CONTEXT__ENVIRONMENT:
                setEnvironment((Map<String, String>)newValue);
                return;
            case KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL:
                setSourceModel((EObject)newValue);
                return;
            case KiCoolPackage.PROCESSOR_CONTEXT__TARGETS:
                getTargets().clear();
                getTargets().addAll((Collection<? extends ProcessorContext>)newValue);
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
            case KiCoolPackage.PROCESSOR_CONTEXT__ENVIRONMENT:
                setEnvironment((Map<String, String>)null);
                return;
            case KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL:
                setSourceModel((EObject)null);
                return;
            case KiCoolPackage.PROCESSOR_CONTEXT__TARGETS:
                getTargets().clear();
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
            case KiCoolPackage.PROCESSOR_CONTEXT__ENVIRONMENT:
                return environment != null;
            case KiCoolPackage.PROCESSOR_CONTEXT__SOURCE_MODEL:
                return sourceModel != null;
            case KiCoolPackage.PROCESSOR_CONTEXT__TARGETS:
                return targets != null && !targets.isEmpty();
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
        result.append(" (environment: ");
        result.append(environment);
        result.append(')');
        return result.toString();
    }

} //ProcessorContextImpl
