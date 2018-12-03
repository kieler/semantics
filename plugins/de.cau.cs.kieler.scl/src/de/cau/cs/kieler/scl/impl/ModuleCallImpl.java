/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;

import de.cau.cs.kieler.scl.Module;
import de.cau.cs.kieler.scl.ModuleCall;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.SequencePart;
import de.cau.cs.kieler.scl.Statement;

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
 * An implementation of the model object '<em><b>Module Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl#isSemicolon <em>Semicolon</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleCallImpl extends MinimalEObjectImpl.Container implements ModuleCall {
    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected EList<ScheduleObjectReference> schedule;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameters;

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
     * The default value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected static final boolean SEMICOLON_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected boolean semicolon = SEMICOLON_EDEFAULT;

    /**
     * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
    protected de.cau.cs.kieler.scl.Module module;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCLPackage.Literals.MODULE_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, SCLPackage.MODULE_CALL__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, SCLPackage.MODULE_CALL__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SCLPackage.MODULE_CALL__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSemicolon() {
        return semicolon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSemicolon(boolean newSemicolon) {
        boolean oldSemicolon = semicolon;
        semicolon = newSemicolon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.MODULE_CALL__SEMICOLON, oldSemicolon, semicolon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.scl.Module getModule() {
        if (module != null && module.eIsProxy()) {
            InternalEObject oldModule = (InternalEObject)module;
            module = (de.cau.cs.kieler.scl.Module)eResolveProxy(oldModule);
            if (module != oldModule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCLPackage.MODULE_CALL__MODULE, oldModule, module));
            }
        }
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.scl.Module basicGetModule() {
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModule(de.cau.cs.kieler.scl.Module newModule) {
        de.cau.cs.kieler.scl.Module oldModule = module;
        module = newModule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.MODULE_CALL__MODULE, oldModule, module));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCLPackage.MODULE_CALL__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case SCLPackage.MODULE_CALL__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
            case SCLPackage.MODULE_CALL__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
            case SCLPackage.MODULE_CALL__SCHEDULE:
                return getSchedule();
            case SCLPackage.MODULE_CALL__PARAMETERS:
                return getParameters();
            case SCLPackage.MODULE_CALL__ANNOTATIONS:
                return getAnnotations();
            case SCLPackage.MODULE_CALL__SEMICOLON:
                return isSemicolon();
            case SCLPackage.MODULE_CALL__MODULE:
                if (resolve) return getModule();
                return basicGetModule();
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
            case SCLPackage.MODULE_CALL__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case SCLPackage.MODULE_CALL__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Parameter>)newValue);
                return;
            case SCLPackage.MODULE_CALL__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case SCLPackage.MODULE_CALL__SEMICOLON:
                setSemicolon((Boolean)newValue);
                return;
            case SCLPackage.MODULE_CALL__MODULE:
                setModule((de.cau.cs.kieler.scl.Module)newValue);
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
            case SCLPackage.MODULE_CALL__SCHEDULE:
                getSchedule().clear();
                return;
            case SCLPackage.MODULE_CALL__PARAMETERS:
                getParameters().clear();
                return;
            case SCLPackage.MODULE_CALL__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case SCLPackage.MODULE_CALL__SEMICOLON:
                setSemicolon(SEMICOLON_EDEFAULT);
                return;
            case SCLPackage.MODULE_CALL__MODULE:
                setModule((de.cau.cs.kieler.scl.Module)null);
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
            case SCLPackage.MODULE_CALL__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case SCLPackage.MODULE_CALL__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case SCLPackage.MODULE_CALL__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case SCLPackage.MODULE_CALL__SEMICOLON:
                return semicolon != SEMICOLON_EDEFAULT;
            case SCLPackage.MODULE_CALL__MODULE:
                return module != null;
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
                case SCLPackage.MODULE_CALL__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == SequencePart.class) {
            switch (derivedFeatureID) {
                case SCLPackage.MODULE_CALL__SEMICOLON: return SCLPackage.SEQUENCE_PART__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (derivedFeatureID) {
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
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return SCLPackage.MODULE_CALL__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == SequencePart.class) {
            switch (baseFeatureID) {
                case SCLPackage.SEQUENCE_PART__SEMICOLON: return SCLPackage.MODULE_CALL__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (baseFeatureID) {
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (semicolon: ");
        result.append(semicolon);
        result.append(')');
        return result.toString();
    }

} //ModuleCallImpl
