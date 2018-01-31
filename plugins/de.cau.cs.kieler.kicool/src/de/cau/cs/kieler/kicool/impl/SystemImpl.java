/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KVPair;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorEntry;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getIntermediates <em>Intermediates</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getStartsets <em>Startsets</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#isDeveloper <em>Developer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements de.cau.cs.kieler.kicool.System {
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
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final int VERSION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected int version = VERSION_EDEFAULT;

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
     * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessors()
     * @generated
     * @ordered
     */
    protected ProcessorEntry processors;

    /**
     * The cached value of the '{@link #getIntermediates() <em>Intermediates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntermediates()
     * @generated
     * @ordered
     */
    protected EList<IntermediateReference> intermediates;

    /**
     * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputClass()
     * @generated
     * @ordered
     */
    protected static final String INPUT_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputClass()
     * @generated
     * @ordered
     */
    protected String inputClass = INPUT_CLASS_EDEFAULT;

    /**
     * The cached value of the '{@link #getStartsets() <em>Startsets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartsets()
     * @generated
     * @ordered
     */
    protected EList<KVPair> startsets;

    /**
     * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPublic()
     * @generated
     * @ordered
     */
    protected static final boolean PUBLIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPublic()
     * @generated
     * @ordered
     */
    protected boolean public_ = PUBLIC_EDEFAULT;

    /**
     * The default value of the '{@link #isDeveloper() <em>Developer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeveloper()
     * @generated
     * @ordered
     */
    protected static final boolean DEVELOPER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDeveloper() <em>Developer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeveloper()
     * @generated
     * @ordered
     */
    protected boolean developer = DEVELOPER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KiCoolPackage.Literals.SYSTEM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(int newVersion) {
        int oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorEntry getProcessors() {
        return processors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcessors(ProcessorEntry newProcessors, NotificationChain msgs) {
        ProcessorEntry oldProcessors = processors;
        processors = newProcessors;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__PROCESSORS, oldProcessors, newProcessors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessors(ProcessorEntry newProcessors) {
        if (newProcessors != processors) {
            NotificationChain msgs = null;
            if (processors != null)
                msgs = ((InternalEObject)processors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.SYSTEM__PROCESSORS, null, msgs);
            if (newProcessors != null)
                msgs = ((InternalEObject)newProcessors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.SYSTEM__PROCESSORS, null, msgs);
            msgs = basicSetProcessors(newProcessors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__PROCESSORS, newProcessors, newProcessors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IntermediateReference> getIntermediates() {
        if (intermediates == null) {
            intermediates = new EObjectContainmentEList<IntermediateReference>(IntermediateReference.class, this, KiCoolPackage.SYSTEM__INTERMEDIATES);
        }
        return intermediates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInputClass() {
        return inputClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputClass(String newInputClass) {
        String oldInputClass = inputClass;
        inputClass = newInputClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__INPUT_CLASS, oldInputClass, inputClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KVPair> getStartsets() {
        if (startsets == null) {
            startsets = new EObjectContainmentEList<KVPair>(KVPair.class, this, KiCoolPackage.SYSTEM__STARTSETS);
        }
        return startsets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPublic() {
        return public_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublic(boolean newPublic) {
        boolean oldPublic = public_;
        public_ = newPublic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__PUBLIC, oldPublic, public_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDeveloper() {
        return developer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeveloper(boolean newDeveloper) {
        boolean oldDeveloper = developer;
        developer = newDeveloper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__DEVELOPER, oldDeveloper, developer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return basicSetProcessors(null, msgs);
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return ((InternalEList<?>)getIntermediates()).basicRemove(otherEnd, msgs);
            case KiCoolPackage.SYSTEM__STARTSETS:
                return ((InternalEList<?>)getStartsets()).basicRemove(otherEnd, msgs);
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
            case KiCoolPackage.SYSTEM__ID:
                return getId();
            case KiCoolPackage.SYSTEM__VERSION:
                return getVersion();
            case KiCoolPackage.SYSTEM__LABEL:
                return getLabel();
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return getProcessors();
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return getIntermediates();
            case KiCoolPackage.SYSTEM__INPUT_CLASS:
                return getInputClass();
            case KiCoolPackage.SYSTEM__STARTSETS:
                return getStartsets();
            case KiCoolPackage.SYSTEM__PUBLIC:
                return isPublic();
            case KiCoolPackage.SYSTEM__DEVELOPER:
                return isDeveloper();
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
            case KiCoolPackage.SYSTEM__ID:
                setId((String)newValue);
                return;
            case KiCoolPackage.SYSTEM__VERSION:
                setVersion((Integer)newValue);
                return;
            case KiCoolPackage.SYSTEM__LABEL:
                setLabel((String)newValue);
                return;
            case KiCoolPackage.SYSTEM__PROCESSORS:
                setProcessors((ProcessorEntry)newValue);
                return;
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                getIntermediates().clear();
                getIntermediates().addAll((Collection<? extends IntermediateReference>)newValue);
                return;
            case KiCoolPackage.SYSTEM__INPUT_CLASS:
                setInputClass((String)newValue);
                return;
            case KiCoolPackage.SYSTEM__STARTSETS:
                getStartsets().clear();
                getStartsets().addAll((Collection<? extends KVPair>)newValue);
                return;
            case KiCoolPackage.SYSTEM__PUBLIC:
                setPublic((Boolean)newValue);
                return;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                setDeveloper((Boolean)newValue);
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
            case KiCoolPackage.SYSTEM__ID:
                setId(ID_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__PROCESSORS:
                setProcessors((ProcessorEntry)null);
                return;
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                getIntermediates().clear();
                return;
            case KiCoolPackage.SYSTEM__INPUT_CLASS:
                setInputClass(INPUT_CLASS_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__STARTSETS:
                getStartsets().clear();
                return;
            case KiCoolPackage.SYSTEM__PUBLIC:
                setPublic(PUBLIC_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                setDeveloper(DEVELOPER_EDEFAULT);
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
            case KiCoolPackage.SYSTEM__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case KiCoolPackage.SYSTEM__VERSION:
                return version != VERSION_EDEFAULT;
            case KiCoolPackage.SYSTEM__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return processors != null;
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return intermediates != null && !intermediates.isEmpty();
            case KiCoolPackage.SYSTEM__INPUT_CLASS:
                return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
            case KiCoolPackage.SYSTEM__STARTSETS:
                return startsets != null && !startsets.isEmpty();
            case KiCoolPackage.SYSTEM__PUBLIC:
                return public_ != PUBLIC_EDEFAULT;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                return developer != DEVELOPER_EDEFAULT;
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
        result.append(", version: ");
        result.append(version);
        result.append(", label: ");
        result.append(label);
        result.append(", inputClass: ");
        result.append(inputClass);
        result.append(", public: ");
        result.append(public_);
        result.append(", developer: ");
        result.append(developer);
        result.append(')');
        return result.toString();
    }

} //SystemImpl
