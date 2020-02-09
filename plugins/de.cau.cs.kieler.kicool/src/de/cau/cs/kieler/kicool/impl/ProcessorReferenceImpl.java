/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kexpressions.JsonObjectValue;
import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorReference;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPreconfig <em>Preconfig</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPostconfig <em>Postconfig</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPreprocesses <em>Preprocesses</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPostprocesses <em>Postprocesses</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#isSilent <em>Silent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorReferenceImpl extends ProcessorEntryImpl implements ProcessorReference {
    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getPreconfig() <em>Preconfig</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreconfig()
     * @generated
     * @ordered
     */
    protected JsonObjectValue preconfig;

    /**
     * The cached value of the '{@link #getPostconfig() <em>Postconfig</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostconfig()
     * @generated
     * @ordered
     */
    protected JsonObjectValue postconfig;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected IntermediateReference metric;

    /**
     * The cached value of the '{@link #getPreprocesses() <em>Preprocesses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreprocesses()
     * @generated
     * @ordered
     */
    protected EList<ProcessorReference> preprocesses;

    /**
     * The cached value of the '{@link #getPostprocesses() <em>Postprocesses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostprocesses()
     * @generated
     * @ordered
     */
    protected EList<ProcessorReference> postprocesses;

    /**
     * The default value of the '{@link #isSilent() <em>Silent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSilent()
     * @generated
     * @ordered
     */
    protected static final boolean SILENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSilent() <em>Silent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSilent()
     * @generated
     * @ordered
     */
    protected boolean silent = SILENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessorReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KiCoolPackage.Literals.PROCESSOR_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonObjectValue getPreconfig() {
        return preconfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPreconfig(JsonObjectValue newPreconfig, NotificationChain msgs) {
        JsonObjectValue oldPreconfig = preconfig;
        preconfig = newPreconfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG, oldPreconfig, newPreconfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPreconfig(JsonObjectValue newPreconfig) {
        if (newPreconfig != preconfig) {
            NotificationChain msgs = null;
            if (preconfig != null)
                msgs = ((InternalEObject)preconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG, null, msgs);
            if (newPreconfig != null)
                msgs = ((InternalEObject)newPreconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG, null, msgs);
            msgs = basicSetPreconfig(newPreconfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG, newPreconfig, newPreconfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonObjectValue getPostconfig() {
        return postconfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPostconfig(JsonObjectValue newPostconfig, NotificationChain msgs) {
        JsonObjectValue oldPostconfig = postconfig;
        postconfig = newPostconfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG, oldPostconfig, newPostconfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPostconfig(JsonObjectValue newPostconfig) {
        if (newPostconfig != postconfig) {
            NotificationChain msgs = null;
            if (postconfig != null)
                msgs = ((InternalEObject)postconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG, null, msgs);
            if (newPostconfig != null)
                msgs = ((InternalEObject)newPostconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG, null, msgs);
            msgs = basicSetPostconfig(newPostconfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG, newPostconfig, newPostconfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntermediateReference getMetric() {
        if (metric != null && metric.eIsProxy()) {
            InternalEObject oldMetric = (InternalEObject)metric;
            metric = (IntermediateReference)eResolveProxy(oldMetric);
            if (metric != oldMetric) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KiCoolPackage.PROCESSOR_REFERENCE__METRIC, oldMetric, metric));
            }
        }
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateReference basicGetMetric() {
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMetric(IntermediateReference newMetric) {
        IntermediateReference oldMetric = metric;
        metric = newMetric;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__METRIC, oldMetric, metric));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ProcessorReference> getPreprocesses() {
        if (preprocesses == null) {
            preprocesses = new EObjectContainmentEList<ProcessorReference>(ProcessorReference.class, this, KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES);
        }
        return preprocesses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ProcessorReference> getPostprocesses() {
        if (postprocesses == null) {
            postprocesses = new EObjectContainmentEList<ProcessorReference>(ProcessorReference.class, this, KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES);
        }
        return postprocesses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSilent() {
        return silent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSilent(boolean newSilent) {
        boolean oldSilent = silent;
        silent = newSilent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__SILENT, oldSilent, silent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG:
                return basicSetPreconfig(null, msgs);
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG:
                return basicSetPostconfig(null, msgs);
            case KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES:
                return ((InternalEList<?>)getPreprocesses()).basicRemove(otherEnd, msgs);
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES:
                return ((InternalEList<?>)getPostprocesses()).basicRemove(otherEnd, msgs);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__LABEL:
                return getLabel();
            case KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG:
                return getPreconfig();
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG:
                return getPostconfig();
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                if (resolve) return getMetric();
                return basicGetMetric();
            case KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES:
                return getPreprocesses();
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES:
                return getPostprocesses();
            case KiCoolPackage.PROCESSOR_REFERENCE__SILENT:
                return isSilent();
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
            case KiCoolPackage.PROCESSOR_REFERENCE__LABEL:
                setLabel((String)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG:
                setPreconfig((JsonObjectValue)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG:
                setPostconfig((JsonObjectValue)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                setMetric((IntermediateReference)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES:
                getPreprocesses().clear();
                getPreprocesses().addAll((Collection<? extends ProcessorReference>)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES:
                getPostprocesses().clear();
                getPostprocesses().addAll((Collection<? extends ProcessorReference>)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__SILENT:
                setSilent((Boolean)newValue);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG:
                setPreconfig((JsonObjectValue)null);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG:
                setPostconfig((JsonObjectValue)null);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                setMetric((IntermediateReference)null);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES:
                getPreprocesses().clear();
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES:
                getPostprocesses().clear();
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__SILENT:
                setSilent(SILENT_EDEFAULT);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case KiCoolPackage.PROCESSOR_REFERENCE__PRECONFIG:
                return preconfig != null;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTCONFIG:
                return postconfig != null;
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                return metric != null;
            case KiCoolPackage.PROCESSOR_REFERENCE__PREPROCESSES:
                return preprocesses != null && !preprocesses.isEmpty();
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTPROCESSES:
                return postprocesses != null && !postprocesses.isEmpty();
            case KiCoolPackage.PROCESSOR_REFERENCE__SILENT:
                return silent != SILENT_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (label: ");
        result.append(label);
        result.append(", silent: ");
        result.append(silent);
        result.append(')');
        return result.toString();
    }

} //ProcessorReferenceImpl
