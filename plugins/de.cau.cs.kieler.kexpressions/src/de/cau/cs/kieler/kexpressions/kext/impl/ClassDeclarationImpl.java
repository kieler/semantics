/**
 */
package de.cau.cs.kieler.kexpressions.kext.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;

import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

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
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isConst <em>Const</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isGlobal <em>Global</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getHostType <em>Host Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.ClassDeclarationImpl#isHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDeclarationImpl extends DeclarationScopeImpl implements ClassDeclaration {
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
     * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObjects()
     * @generated
     * @ordered
     */
    protected EList<ValuedObject> valuedObjects;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final AccessModifier ACCESS_EDEFAULT = AccessModifier.PUBLIC;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected AccessModifier access = ACCESS_EDEFAULT;

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
     * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected static final boolean INPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInput()
     * @generated
     * @ordered
     */
    protected boolean input = INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutput()
     * @generated
     * @ordered
     */
    protected static final boolean OUTPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutput()
     * @generated
     * @ordered
     */
    protected boolean output = OUTPUT_EDEFAULT;

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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHost()
     * @generated
     * @ordered
     */
    protected static final boolean HOST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHost()
     * @generated
     * @ordered
     */
    protected boolean host = HOST_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExtPackage.Literals.CLASS_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, KExtPackage.CLASS_DECLARATION__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ValuedObject> getValuedObjects() {
        if (valuedObjects == null) {
            valuedObjects = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS);
        }
        return valuedObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessModifier getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccess(AccessModifier newAccess) {
        AccessModifier oldAccess = access;
        access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__ACCESS, oldAccess, access));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInput(boolean newInput) {
        boolean oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__INPUT, oldInput, input));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isOutput() {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutput(boolean newOutput) {
        boolean oldOutput = output;
        output = newOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__OUTPUT, oldOutput, output));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__STATIC, oldStatic, static_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__SIGNAL, oldSignal, signal));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__CONST, oldConst, const_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__EXTERN, oldExtern, extern));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__VOLATILE, oldVolatile, volatile_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__GLOBAL, oldGlobal, global));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__HOST_TYPE, oldHostType, hostType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHost(boolean newHost) {
        boolean oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExtPackage.CLASS_DECLARATION__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExtPackage.CLASS_DECLARATION__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS:
                return ((InternalEList<?>)getValuedObjects()).basicRemove(otherEnd, msgs);
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
            case KExtPackage.CLASS_DECLARATION__ANNOTATIONS:
                return getAnnotations();
            case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS:
                return getValuedObjects();
            case KExtPackage.CLASS_DECLARATION__ACCESS:
                return getAccess();
            case KExtPackage.CLASS_DECLARATION__TYPE:
                return getType();
            case KExtPackage.CLASS_DECLARATION__INPUT:
                return isInput();
            case KExtPackage.CLASS_DECLARATION__OUTPUT:
                return isOutput();
            case KExtPackage.CLASS_DECLARATION__STATIC:
                return isStatic();
            case KExtPackage.CLASS_DECLARATION__SIGNAL:
                return isSignal();
            case KExtPackage.CLASS_DECLARATION__CONST:
                return isConst();
            case KExtPackage.CLASS_DECLARATION__EXTERN:
                return isExtern();
            case KExtPackage.CLASS_DECLARATION__VOLATILE:
                return isVolatile();
            case KExtPackage.CLASS_DECLARATION__GLOBAL:
                return isGlobal();
            case KExtPackage.CLASS_DECLARATION__HOST_TYPE:
                return getHostType();
            case KExtPackage.CLASS_DECLARATION__NAME:
                return getName();
            case KExtPackage.CLASS_DECLARATION__HOST:
                return isHost();
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
            case KExtPackage.CLASS_DECLARATION__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                getValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__ACCESS:
                setAccess((AccessModifier)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__TYPE:
                setType((ValueType)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__INPUT:
                setInput((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__OUTPUT:
                setOutput((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__STATIC:
                setStatic((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__SIGNAL:
                setSignal((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__CONST:
                setConst((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__EXTERN:
                setExtern((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__VOLATILE:
                setVolatile((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__GLOBAL:
                setGlobal((Boolean)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__HOST_TYPE:
                setHostType((String)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__NAME:
                setName((String)newValue);
                return;
            case KExtPackage.CLASS_DECLARATION__HOST:
                setHost((Boolean)newValue);
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
            case KExtPackage.CLASS_DECLARATION__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                return;
            case KExtPackage.CLASS_DECLARATION__ACCESS:
                setAccess(ACCESS_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__OUTPUT:
                setOutput(OUTPUT_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__SIGNAL:
                setSignal(SIGNAL_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__CONST:
                setConst(CONST_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__EXTERN:
                setExtern(EXTERN_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__VOLATILE:
                setVolatile(VOLATILE_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__GLOBAL:
                setGlobal(GLOBAL_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__HOST_TYPE:
                setHostType(HOST_TYPE_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case KExtPackage.CLASS_DECLARATION__HOST:
                setHost(HOST_EDEFAULT);
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
            case KExtPackage.CLASS_DECLARATION__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS:
                return valuedObjects != null && !valuedObjects.isEmpty();
            case KExtPackage.CLASS_DECLARATION__ACCESS:
                return access != ACCESS_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__TYPE:
                return type != TYPE_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__INPUT:
                return input != INPUT_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__OUTPUT:
                return output != OUTPUT_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__STATIC:
                return static_ != STATIC_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__SIGNAL:
                return signal != SIGNAL_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__CONST:
                return const_ != CONST_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__EXTERN:
                return extern != EXTERN_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__VOLATILE:
                return volatile_ != VOLATILE_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__GLOBAL:
                return global != GLOBAL_EDEFAULT;
            case KExtPackage.CLASS_DECLARATION__HOST_TYPE:
                return HOST_TYPE_EDEFAULT == null ? hostType != null : !HOST_TYPE_EDEFAULT.equals(hostType);
            case KExtPackage.CLASS_DECLARATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case KExtPackage.CLASS_DECLARATION__HOST:
                return host != HOST_EDEFAULT;
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
                case KExtPackage.CLASS_DECLARATION__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Declaration.class) {
            switch (derivedFeatureID) {
                case KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS: return KExpressionsPackage.DECLARATION__VALUED_OBJECTS;
                case KExtPackage.CLASS_DECLARATION__ACCESS: return KExpressionsPackage.DECLARATION__ACCESS;
                default: return -1;
            }
        }
        if (baseClass == VariableDeclaration.class) {
            switch (derivedFeatureID) {
                case KExtPackage.CLASS_DECLARATION__TYPE: return KExpressionsPackage.VARIABLE_DECLARATION__TYPE;
                case KExtPackage.CLASS_DECLARATION__INPUT: return KExpressionsPackage.VARIABLE_DECLARATION__INPUT;
                case KExtPackage.CLASS_DECLARATION__OUTPUT: return KExpressionsPackage.VARIABLE_DECLARATION__OUTPUT;
                case KExtPackage.CLASS_DECLARATION__STATIC: return KExpressionsPackage.VARIABLE_DECLARATION__STATIC;
                case KExtPackage.CLASS_DECLARATION__SIGNAL: return KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL;
                case KExtPackage.CLASS_DECLARATION__CONST: return KExpressionsPackage.VARIABLE_DECLARATION__CONST;
                case KExtPackage.CLASS_DECLARATION__EXTERN: return KExpressionsPackage.VARIABLE_DECLARATION__EXTERN;
                case KExtPackage.CLASS_DECLARATION__VOLATILE: return KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE;
                case KExtPackage.CLASS_DECLARATION__GLOBAL: return KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL;
                case KExtPackage.CLASS_DECLARATION__HOST_TYPE: return KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE;
                default: return -1;
            }
        }
        if (baseClass == Nameable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case KExtPackage.CLASS_DECLARATION__NAME: return AnnotationsPackage.NAMED_OBJECT__NAME;
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
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return KExtPackage.CLASS_DECLARATION__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Declaration.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.DECLARATION__VALUED_OBJECTS: return KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS;
                case KExpressionsPackage.DECLARATION__ACCESS: return KExtPackage.CLASS_DECLARATION__ACCESS;
                default: return -1;
            }
        }
        if (baseClass == VariableDeclaration.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.VARIABLE_DECLARATION__TYPE: return KExtPackage.CLASS_DECLARATION__TYPE;
                case KExpressionsPackage.VARIABLE_DECLARATION__INPUT: return KExtPackage.CLASS_DECLARATION__INPUT;
                case KExpressionsPackage.VARIABLE_DECLARATION__OUTPUT: return KExtPackage.CLASS_DECLARATION__OUTPUT;
                case KExpressionsPackage.VARIABLE_DECLARATION__STATIC: return KExtPackage.CLASS_DECLARATION__STATIC;
                case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL: return KExtPackage.CLASS_DECLARATION__SIGNAL;
                case KExpressionsPackage.VARIABLE_DECLARATION__CONST: return KExtPackage.CLASS_DECLARATION__CONST;
                case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN: return KExtPackage.CLASS_DECLARATION__EXTERN;
                case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE: return KExtPackage.CLASS_DECLARATION__VOLATILE;
                case KExpressionsPackage.VARIABLE_DECLARATION__GLOBAL: return KExtPackage.CLASS_DECLARATION__GLOBAL;
                case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE: return KExtPackage.CLASS_DECLARATION__HOST_TYPE;
                default: return -1;
            }
        }
        if (baseClass == Nameable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.NAMED_OBJECT__NAME: return KExtPackage.CLASS_DECLARATION__NAME;
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
        result.append(" (access: ");
        result.append(access);
        result.append(", type: ");
        result.append(type);
        result.append(", input: ");
        result.append(input);
        result.append(", output: ");
        result.append(output);
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
        result.append(", name: ");
        result.append(name);
        result.append(", host: ");
        result.append(host);
        result.append(')');
        return result.toString();
    }

} //ClassDeclarationImpl
