/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.impl.PragmatableImpl;
import de.cau.cs.kieler.kexpressions.JsonObjectValue;
import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorEntry;

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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getIntermediates <em>Intermediates</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#isDeveloper <em>Developer</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.SystemImpl#isSimulation <em>Simulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends PragmatableImpl implements de.cau.cs.kieler.kicool.System {
    /**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList<Annotation> annotations;

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
     * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfig()
     * @generated
     * @ordered
     */
    protected JsonObjectValue config;

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
     * The default value of the '{@link #isSimulation() <em>Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSimulation()
     * @generated
     * @ordered
     */
    protected static final boolean SIMULATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSimulation() <em>Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSimulation()
     * @generated
     * @ordered
     */
    protected boolean simulation = SIMULATION_EDEFAULT;

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
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, KiCoolPackage.SYSTEM__ANNOTATIONS);
        }
        return annotations;
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
    public JsonObjectValue getConfig() {
        return config;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfig(JsonObjectValue newConfig, NotificationChain msgs) {
        JsonObjectValue oldConfig = config;
        config = newConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__CONFIG, oldConfig, newConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfig(JsonObjectValue newConfig) {
        if (newConfig != config) {
            NotificationChain msgs = null;
            if (config != null)
                msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.SYSTEM__CONFIG, null, msgs);
            if (newConfig != null)
                msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KiCoolPackage.SYSTEM__CONFIG, null, msgs);
            msgs = basicSetConfig(newConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__CONFIG, newConfig, newConfig));
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
    public boolean isSimulation() {
        return simulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimulation(boolean newSimulation) {
        boolean oldSimulation = simulation;
        simulation = newSimulation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.SYSTEM__SIMULATION, oldSimulation, simulation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KiCoolPackage.SYSTEM__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return basicSetProcessors(null, msgs);
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return ((InternalEList<?>)getIntermediates()).basicRemove(otherEnd, msgs);
            case KiCoolPackage.SYSTEM__CONFIG:
                return basicSetConfig(null, msgs);
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
            case KiCoolPackage.SYSTEM__ANNOTATIONS:
                return getAnnotations();
            case KiCoolPackage.SYSTEM__ID:
                return getId();
            case KiCoolPackage.SYSTEM__LABEL:
                return getLabel();
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return getProcessors();
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return getIntermediates();
            case KiCoolPackage.SYSTEM__CONFIG:
                return getConfig();
            case KiCoolPackage.SYSTEM__PUBLIC:
                return isPublic();
            case KiCoolPackage.SYSTEM__DEVELOPER:
                return isDeveloper();
            case KiCoolPackage.SYSTEM__SIMULATION:
                return isSimulation();
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
            case KiCoolPackage.SYSTEM__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case KiCoolPackage.SYSTEM__ID:
                setId((String)newValue);
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
            case KiCoolPackage.SYSTEM__CONFIG:
                setConfig((JsonObjectValue)newValue);
                return;
            case KiCoolPackage.SYSTEM__PUBLIC:
                setPublic((Boolean)newValue);
                return;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                setDeveloper((Boolean)newValue);
                return;
            case KiCoolPackage.SYSTEM__SIMULATION:
                setSimulation((Boolean)newValue);
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
            case KiCoolPackage.SYSTEM__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case KiCoolPackage.SYSTEM__ID:
                setId(ID_EDEFAULT);
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
            case KiCoolPackage.SYSTEM__CONFIG:
                setConfig((JsonObjectValue)null);
                return;
            case KiCoolPackage.SYSTEM__PUBLIC:
                setPublic(PUBLIC_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                setDeveloper(DEVELOPER_EDEFAULT);
                return;
            case KiCoolPackage.SYSTEM__SIMULATION:
                setSimulation(SIMULATION_EDEFAULT);
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
            case KiCoolPackage.SYSTEM__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case KiCoolPackage.SYSTEM__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case KiCoolPackage.SYSTEM__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case KiCoolPackage.SYSTEM__PROCESSORS:
                return processors != null;
            case KiCoolPackage.SYSTEM__INTERMEDIATES:
                return intermediates != null && !intermediates.isEmpty();
            case KiCoolPackage.SYSTEM__CONFIG:
                return config != null;
            case KiCoolPackage.SYSTEM__PUBLIC:
                return public_ != PUBLIC_EDEFAULT;
            case KiCoolPackage.SYSTEM__DEVELOPER:
                return developer != DEVELOPER_EDEFAULT;
            case KiCoolPackage.SYSTEM__SIMULATION:
                return simulation != SIMULATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Annotatable.class) {
            switch (derivedFeatureID) {
                case KiCoolPackage.SYSTEM__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Annotatable.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return KiCoolPackage.SYSTEM__ANNOTATIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(", label: ");
        result.append(label);
        result.append(", public: ");
        result.append(public_);
        result.append(", developer: ");
        result.append(developer);
        result.append(", simulation: ");
        result.append(simulation);
        result.append(')');
        return result.toString();
    }

} //SystemImpl
