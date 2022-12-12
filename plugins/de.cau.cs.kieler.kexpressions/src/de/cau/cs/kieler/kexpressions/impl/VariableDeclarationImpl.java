/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isConst <em>Const</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#isGlobal <em>Global</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends IODeclarationImpl implements VariableDeclaration {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ValueType TYPE_EDEFAULT = ValueType.PURE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ValueType type = TYPE_EDEFAULT;

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
     * The default value of the '{@link #isSignal() <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSignal()
     * @generated
     * @ordered
     */
    protected static final boolean SIGNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSignal() <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSignal()
     * @generated
     * @ordered
     */
    protected boolean signal = SIGNAL_EDEFAULT;

    /**
     * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected static final boolean CONST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected boolean const_ = CONST_EDEFAULT;

    /**
     * The default value of the '{@link #isExtern() <em>Extern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExtern()
     * @generated
     * @ordered
     */
    protected static final boolean EXTERN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExtern() <em>Extern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExtern()
     * @generated
     * @ordered
     */
    protected boolean extern = EXTERN_EDEFAULT;

    /**
     * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVolatile()
     * @generated
     * @ordered
     */
    protected static final boolean VOLATILE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVolatile()
     * @generated
     * @ordered
     */
    protected boolean volatile_ = VOLATILE_EDEFAULT;

    /**
     * The default value of the '{@link #isGlobal() <em>Global</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGlobal()
     * @generated
     * @ordered
     */
    protected static final boolean GLOBAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isGlobal() <em>Global</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGlobal()
     * @generated
     * @ordered
     */
    protected boolean global = GLOBAL_EDEFAULT;

    /**
     * The default value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostType()
     * @generated
     * @ordered
     */
    protected static final String HOST_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostType()
     * @generated
     * @ordered
     */
    protected String hostType = HOST_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.VARIABLE_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(ValueType newType) {
        ValueType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__STATIC, oldStatic, static_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSignal() {
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSignal(boolean newSignal) {
        boolean oldSignal = signal;
        signal = newSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL, oldSignal, signal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isConst() {
        return const_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConst(boolean newConst) {
        boolean oldConst = const_;
        const_ = newConst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__CONST, oldConst, const_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExtern() {
        return extern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtern(boolean newExtern) {
        boolean oldExtern = extern;
        extern = newExtern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__EXTERN, oldExtern, extern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isVolatile() {
        return volatile_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVolatile(boolean newVolatile) {
        boolean oldVolatile = volatile_;
        volatile_ = newVolatile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE, oldVolatile, volatile_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isGlobal() {
        return global;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGlobal(boolean newGlobal) {
        boolean oldGlobal = global;
        global = newGlobal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL, oldGlobal, global));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHostType() {
        return hostType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHostType(String newHostType) {
        String oldHostType = hostType;
        hostType = newHostType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE, oldHostType, hostType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.VARIABLE_DECLARATION__TYPE:
                return getType();
            case KExpressionsPackage.VARIABLE_DECLARATION__STATIC:
                return isStatic();
            case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL:
                return isSignal();
            case KExpressionsPackage.VARIABLE_DECLARATION__CONST:
                return isConst();
            case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN:
                return isExtern();
            case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE:
                return isVolatile();
            case KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL:
                return isGlobal();
            case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE:
                return getHostType();
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
            case KExpressionsPackage.VARIABLE_DECLARATION__TYPE:
                setType((ValueType)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__STATIC:
                setStatic((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL:
                setSignal((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__CONST:
                setConst((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN:
                setExtern((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE:
                setVolatile((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL:
                setGlobal((Boolean)newValue);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE:
                setHostType((String)newValue);
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
            case KExpressionsPackage.VARIABLE_DECLARATION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL:
                setSignal(SIGNAL_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__CONST:
                setConst(CONST_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN:
                setExtern(EXTERN_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE:
                setVolatile(VOLATILE_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL:
                setGlobal(GLOBAL_EDEFAULT);
                return;
            case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE:
                setHostType(HOST_TYPE_EDEFAULT);
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
            case KExpressionsPackage.VARIABLE_DECLARATION__TYPE:
                return type != TYPE_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__STATIC:
                return static_ != STATIC_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL:
                return signal != SIGNAL_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__CONST:
                return const_ != CONST_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN:
                return extern != EXTERN_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE:
                return volatile_ != VOLATILE_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL:
                return global != GLOBAL_EDEFAULT;
            case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE:
                return HOST_TYPE_EDEFAULT == null ? hostType != null : !HOST_TYPE_EDEFAULT.equals(hostType);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", static: ");
        result.append(static_);
        result.append(", signal: ");
        result.append(signal);
        result.append(", const: ");
        result.append(const_);
        result.append(", extern: ");
        result.append(extern);
        result.append(", volatile: ");
        result.append(volatile_);
        result.append(", global: ");
        result.append(global);
        result.append(", hostType: ");
        result.append(hostType);
        result.append(')');
        return result.toString();
    }

} //VariableDeclarationImpl
