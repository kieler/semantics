/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.MethodDeclaration;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.ValueType;

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
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getReturnHostType <em>Return Host Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getReturnReference <em>Return Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getReturnReferenceContainer <em>Return Reference Container</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends DeclarationImpl implements MethodDeclaration {
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
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected boolean static_ = STATIC_EDEFAULT;

    /**
     * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOverride()
     * @generated
     * @ordered
     */
    protected static final boolean OVERRIDE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOverride()
     * @generated
     * @ordered
     */
    protected boolean override = OVERRIDE_EDEFAULT;

    /**
     * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected static final ValueType RETURN_TYPE_EDEFAULT = ValueType.PURE;

    /**
     * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected ValueType returnType = RETURN_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getReturnHostType() <em>Return Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnHostType()
     * @generated
     * @ordered
     */
    protected static final String RETURN_HOST_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReturnHostType() <em>Return Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnHostType()
     * @generated
     * @ordered
     */
    protected String returnHostType = RETURN_HOST_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getReturnReference() <em>Return Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnReference()
     * @generated
     * @ordered
     */
    protected NamedObject returnReference;

    /**
     * The cached value of the '{@link #getReturnReferenceContainer() <em>Return Reference Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnReferenceContainer()
     * @generated
     * @ordered
     */
    protected NamedObject returnReferenceContainer;

    /**
     * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> parameterDeclarations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.METHOD_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KExpressionsPackage.METHOD_DECLARATION__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isStatic() {
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatic(boolean newStatic) {
        boolean oldStatic = static_;
        static_ = newStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__STATIC, oldStatic, static_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isOverride() {
        return override;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverride(boolean newOverride) {
        boolean oldOverride = override;
        override = newOverride;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__OVERRIDE, oldOverride, override));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueType getReturnType() {
        return returnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnType(ValueType newReturnType) {
        ValueType oldReturnType = returnType;
        returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__RETURN_TYPE, oldReturnType, returnType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReturnHostType() {
        return returnHostType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnHostType(String newReturnHostType) {
        String oldReturnHostType = returnHostType;
        returnHostType = newReturnHostType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__RETURN_HOST_TYPE, oldReturnHostType, returnHostType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getReturnReference() {
        if (returnReference != null && returnReference.eIsProxy()) {
            InternalEObject oldReturnReference = (InternalEObject)returnReference;
            returnReference = (NamedObject)eResolveProxy(oldReturnReference);
            if (returnReference != oldReturnReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE, oldReturnReference, returnReference));
            }
        }
        return returnReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetReturnReference() {
        return returnReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnReference(NamedObject newReturnReference) {
        NamedObject oldReturnReference = returnReference;
        returnReference = newReturnReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE, oldReturnReference, returnReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getReturnReferenceContainer() {
        if (returnReferenceContainer != null && returnReferenceContainer.eIsProxy()) {
            InternalEObject oldReturnReferenceContainer = (InternalEObject)returnReferenceContainer;
            returnReferenceContainer = (NamedObject)eResolveProxy(oldReturnReferenceContainer);
            if (returnReferenceContainer != oldReturnReferenceContainer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER, oldReturnReferenceContainer, returnReferenceContainer));
            }
        }
        return returnReferenceContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetReturnReferenceContainer() {
        return returnReferenceContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnReferenceContainer(NamedObject newReturnReferenceContainer) {
        NamedObject oldReturnReferenceContainer = returnReferenceContainer;
        returnReferenceContainer = newReturnReferenceContainer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER, oldReturnReferenceContainer, returnReferenceContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getParameterDeclarations() {
        if (parameterDeclarations == null) {
            parameterDeclarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS);
        }
        return parameterDeclarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS:
                return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
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
            case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE:
                return getSchedule();
            case KExpressionsPackage.METHOD_DECLARATION__STATIC:
                return isStatic();
            case KExpressionsPackage.METHOD_DECLARATION__OVERRIDE:
                return isOverride();
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_TYPE:
                return getReturnType();
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_HOST_TYPE:
                return getReturnHostType();
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE:
                if (resolve) return getReturnReference();
                return basicGetReturnReference();
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER:
                if (resolve) return getReturnReferenceContainer();
                return basicGetReturnReferenceContainer();
            case KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS:
                return getParameterDeclarations();
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
            case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__STATIC:
                setStatic((Boolean)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__OVERRIDE:
                setOverride((Boolean)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_TYPE:
                setReturnType((ValueType)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_HOST_TYPE:
                setReturnHostType((String)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE:
                setReturnReference((NamedObject)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER:
                setReturnReferenceContainer((NamedObject)newValue);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS:
                getParameterDeclarations().clear();
                getParameterDeclarations().addAll((Collection<? extends Declaration>)newValue);
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
            case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE:
                getSchedule().clear();
                return;
            case KExpressionsPackage.METHOD_DECLARATION__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__OVERRIDE:
                setOverride(OVERRIDE_EDEFAULT);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_TYPE:
                setReturnType(RETURN_TYPE_EDEFAULT);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_HOST_TYPE:
                setReturnHostType(RETURN_HOST_TYPE_EDEFAULT);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE:
                setReturnReference((NamedObject)null);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER:
                setReturnReferenceContainer((NamedObject)null);
                return;
            case KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS:
                getParameterDeclarations().clear();
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
            case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KExpressionsPackage.METHOD_DECLARATION__STATIC:
                return static_ != STATIC_EDEFAULT;
            case KExpressionsPackage.METHOD_DECLARATION__OVERRIDE:
                return override != OVERRIDE_EDEFAULT;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_TYPE:
                return returnType != RETURN_TYPE_EDEFAULT;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_HOST_TYPE:
                return RETURN_HOST_TYPE_EDEFAULT == null ? returnHostType != null : !RETURN_HOST_TYPE_EDEFAULT.equals(returnHostType);
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE:
                return returnReference != null;
            case KExpressionsPackage.METHOD_DECLARATION__RETURN_REFERENCE_CONTAINER:
                return returnReferenceContainer != null;
            case KExpressionsPackage.METHOD_DECLARATION__PARAMETER_DECLARATIONS:
                return parameterDeclarations != null && !parameterDeclarations.isEmpty();
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
        if (baseClass == Schedulable.class) {
            switch (derivedFeatureID) {
                case KExpressionsPackage.METHOD_DECLARATION__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
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
        if (baseClass == Schedulable.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return KExpressionsPackage.METHOD_DECLARATION__SCHEDULE;
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
        result.append(" (static: ");
        result.append(static_);
        result.append(", override: ");
        result.append(override);
        result.append(", returnType: ");
        result.append(returnType);
        result.append(", returnHostType: ");
        result.append(returnHostType);
        result.append(')');
        return result.toString();
    }

} //MethodDeclarationImpl
