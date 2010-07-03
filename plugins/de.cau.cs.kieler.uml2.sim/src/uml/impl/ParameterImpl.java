/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.MultiplicityElement;
import uml.Operation;
import uml.Parameter;
import uml.ParameterDirectionKind;
import uml.ParameterEffectKind;
import uml.ParameterSet;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
    /**
     * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ORDERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected boolean isOrdered = IS_ORDERED_EDEFAULT;

    /**
     * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNIQUE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected boolean isUnique = IS_UNIQUE_EDEFAULT;

    /**
     * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected static final int UPPER_EDEFAULT = 1;

    /**
     * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected static final int LOWER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperValue()
     * @generated
     * @ordered
     */
    protected ValueSpecification upperValue;

    /**
     * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerValue()
     * @generated
     * @ordered
     */
    protected ValueSpecification lowerValue;

    /**
     * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterSet()
     * @generated
     * @ordered
     */
    protected EList<ParameterSet> parameterSet;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

    /**
     * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected ValueSpecification defaultValue;

    /**
     * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsException()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXCEPTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsException()
     * @generated
     * @ordered
     */
    protected boolean isException = IS_EXCEPTION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStream()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STREAM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStream()
     * @generated
     * @ordered
     */
    protected boolean isStream = IS_STREAM_EDEFAULT;

    /**
     * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.CREATE;

    /**
     * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected ParameterEffectKind effect = EFFECT_EDEFAULT;

    /**
     * This is true if the Effect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean effectESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOrdered() {
        return isOrdered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOrdered(boolean newIsOrdered) {
        boolean oldIsOrdered = isOrdered;
        isOrdered = newIsOrdered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnique() {
        return isUnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnique(boolean newIsUnique) {
        boolean oldIsUnique = isUnique;
        isUnique = newIsUnique;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUpper() {
        // TODO: implement this method to return the 'Upper' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpper(int newUpper) {
        // TODO: implement this method to set the 'Upper' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLower() {
        // TODO: implement this method to return the 'Lower' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLower(int newLower) {
        // TODO: implement this method to set the 'Lower' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getUpperValue() {
        return upperValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
        ValueSpecification oldUpperValue = upperValue;
        upperValue = newUpperValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__UPPER_VALUE, oldUpperValue, newUpperValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperValue(ValueSpecification newUpperValue) {
        if (newUpperValue != upperValue) {
            NotificationChain msgs = null;
            if (upperValue != null)
                msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__UPPER_VALUE, null, msgs);
            if (newUpperValue != null)
                msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__UPPER_VALUE, null, msgs);
            msgs = basicSetUpperValue(newUpperValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getLowerValue() {
        return lowerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
        ValueSpecification oldLowerValue = lowerValue;
        lowerValue = newLowerValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__LOWER_VALUE, oldLowerValue, newLowerValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerValue(ValueSpecification newLowerValue) {
        if (newLowerValue != lowerValue) {
            NotificationChain msgs = null;
            if (lowerValue != null)
                msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__LOWER_VALUE, null, msgs);
            if (newLowerValue != null)
                msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__LOWER_VALUE, null, msgs);
            msgs = basicSetLowerValue(newLowerValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterSet> getParameterSet() {
        if (parameterSet == null) {
            parameterSet = new EObjectWithInverseResolvingEList.ManyInverse<ParameterSet>(ParameterSet.class, this, UmlPackage.PARAMETER__PARAMETER_SET, UmlPackage.PARAMETER_SET__PARAMETER);
        }
        return parameterSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        Operation operation = basicGetOperation();
        return operation != null && operation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)operation) : operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperation() {
        // TODO: implement this method to return the 'Operation' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterDirectionKind getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(ParameterDirectionKind newDirection) {
        ParameterDirectionKind oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DIRECTION, oldDirection, direction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefault() {
        // TODO: implement this method to return the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(String newDefault) {
        // TODO: implement this method to set the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDefault() {
        // TODO: implement this method to unset the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDefault() {
        // TODO: implement this method to return whether the 'Default' attribute is set
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
        ValueSpecification oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(ValueSpecification newDefaultValue) {
        if (newDefaultValue != defaultValue) {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsException() {
        return isException;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsException(boolean newIsException) {
        boolean oldIsException = isException;
        isException = newIsException;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStream() {
        return isStream;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStream(boolean newIsStream) {
        boolean oldIsStream = isStream;
        isStream = newIsStream;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterEffectKind getEffect() {
        return effect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEffect(ParameterEffectKind newEffect) {
        ParameterEffectKind oldEffect = effect;
        effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
        boolean oldEffectESet = effectESet;
        effectESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__EFFECT, oldEffect, effect, !oldEffectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEffect() {
        ParameterEffectKind oldEffect = effect;
        boolean oldEffectESet = effectESet;
        effect = EFFECT_EDEFAULT;
        effectESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.PARAMETER__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEffect() {
        return effectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean connector_end(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.PARAMETER__CONNECTOR_END,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "connector_end", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean stream_and_exception(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.PARAMETER__STREAM_AND_EXCEPTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "stream_and_exception", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean not_exception(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.PARAMETER__NOT_EXCEPTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "not_exception", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean reentrant_behaviors(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.PARAMETER__REENTRANT_BEHAVIORS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "reentrant_behaviors", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean in_and_out(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.PARAMETER__IN_AND_OUT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "in_and_out", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooleanDefaultValue(boolean value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntegerDefaultValue(int value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStringDefaultValue(String value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnlimitedNaturalDefaultValue(int value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNullDefaultValue() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean upper_gt_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.MULTIPLICITY_ELEMENT__UPPER_GT_0,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "upper_gt_0", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean lower_ge_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.MULTIPLICITY_ELEMENT__LOWER_GE_0,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "lower_ge_0", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean upper_ge_lower(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "upper_ge_lower", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean value_specification_no_side_effects(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "value_specification_no_side_effects", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean value_specification_constant(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "value_specification_constant", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMultivalued() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean includesCardinality(int C) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean includesMultiplicity(MultiplicityElement M) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int lowerBound() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int upperBound() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean compatibleWith(MultiplicityElement other) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean is(int lowerbound, int upperbound) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case UmlPackage.PARAMETER__PARAMETER_SET:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSet()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.PARAMETER__UPPER_VALUE:
                return basicSetUpperValue(null, msgs);
            case UmlPackage.PARAMETER__LOWER_VALUE:
                return basicSetLowerValue(null, msgs);
            case UmlPackage.PARAMETER__PARAMETER_SET:
                return ((InternalEList<?>)getParameterSet()).basicRemove(otherEnd, msgs);
            case UmlPackage.PARAMETER__DEFAULT_VALUE:
                return basicSetDefaultValue(null, msgs);
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
            case UmlPackage.PARAMETER__IS_ORDERED:
                return isIsOrdered();
            case UmlPackage.PARAMETER__IS_UNIQUE:
                return isIsUnique();
            case UmlPackage.PARAMETER__UPPER:
                return getUpper();
            case UmlPackage.PARAMETER__LOWER:
                return getLower();
            case UmlPackage.PARAMETER__UPPER_VALUE:
                return getUpperValue();
            case UmlPackage.PARAMETER__LOWER_VALUE:
                return getLowerValue();
            case UmlPackage.PARAMETER__PARAMETER_SET:
                return getParameterSet();
            case UmlPackage.PARAMETER__OPERATION:
                if (resolve) return getOperation();
                return basicGetOperation();
            case UmlPackage.PARAMETER__DIRECTION:
                return getDirection();
            case UmlPackage.PARAMETER__DEFAULT:
                return getDefault();
            case UmlPackage.PARAMETER__DEFAULT_VALUE:
                return getDefaultValue();
            case UmlPackage.PARAMETER__IS_EXCEPTION:
                return isIsException();
            case UmlPackage.PARAMETER__IS_STREAM:
                return isIsStream();
            case UmlPackage.PARAMETER__EFFECT:
                return getEffect();
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
            case UmlPackage.PARAMETER__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
                return;
            case UmlPackage.PARAMETER__IS_UNIQUE:
                setIsUnique((Boolean)newValue);
                return;
            case UmlPackage.PARAMETER__UPPER:
                setUpper((Integer)newValue);
                return;
            case UmlPackage.PARAMETER__LOWER:
                setLower((Integer)newValue);
                return;
            case UmlPackage.PARAMETER__UPPER_VALUE:
                setUpperValue((ValueSpecification)newValue);
                return;
            case UmlPackage.PARAMETER__LOWER_VALUE:
                setLowerValue((ValueSpecification)newValue);
                return;
            case UmlPackage.PARAMETER__PARAMETER_SET:
                getParameterSet().clear();
                getParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
                return;
            case UmlPackage.PARAMETER__DIRECTION:
                setDirection((ParameterDirectionKind)newValue);
                return;
            case UmlPackage.PARAMETER__DEFAULT:
                setDefault((String)newValue);
                return;
            case UmlPackage.PARAMETER__DEFAULT_VALUE:
                setDefaultValue((ValueSpecification)newValue);
                return;
            case UmlPackage.PARAMETER__IS_EXCEPTION:
                setIsException((Boolean)newValue);
                return;
            case UmlPackage.PARAMETER__IS_STREAM:
                setIsStream((Boolean)newValue);
                return;
            case UmlPackage.PARAMETER__EFFECT:
                setEffect((ParameterEffectKind)newValue);
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
            case UmlPackage.PARAMETER__IS_ORDERED:
                setIsOrdered(IS_ORDERED_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__IS_UNIQUE:
                setIsUnique(IS_UNIQUE_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__UPPER:
                setUpper(UPPER_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__UPPER_VALUE:
                setUpperValue((ValueSpecification)null);
                return;
            case UmlPackage.PARAMETER__LOWER_VALUE:
                setLowerValue((ValueSpecification)null);
                return;
            case UmlPackage.PARAMETER__PARAMETER_SET:
                getParameterSet().clear();
                return;
            case UmlPackage.PARAMETER__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__DEFAULT:
                unsetDefault();
                return;
            case UmlPackage.PARAMETER__DEFAULT_VALUE:
                setDefaultValue((ValueSpecification)null);
                return;
            case UmlPackage.PARAMETER__IS_EXCEPTION:
                setIsException(IS_EXCEPTION_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__IS_STREAM:
                setIsStream(IS_STREAM_EDEFAULT);
                return;
            case UmlPackage.PARAMETER__EFFECT:
                unsetEffect();
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
            case UmlPackage.PARAMETER__IS_ORDERED:
                return isOrdered != IS_ORDERED_EDEFAULT;
            case UmlPackage.PARAMETER__IS_UNIQUE:
                return isUnique != IS_UNIQUE_EDEFAULT;
            case UmlPackage.PARAMETER__UPPER:
                return getUpper() != UPPER_EDEFAULT;
            case UmlPackage.PARAMETER__LOWER:
                return getLower() != LOWER_EDEFAULT;
            case UmlPackage.PARAMETER__UPPER_VALUE:
                return upperValue != null;
            case UmlPackage.PARAMETER__LOWER_VALUE:
                return lowerValue != null;
            case UmlPackage.PARAMETER__PARAMETER_SET:
                return parameterSet != null && !parameterSet.isEmpty();
            case UmlPackage.PARAMETER__OPERATION:
                return basicGetOperation() != null;
            case UmlPackage.PARAMETER__DIRECTION:
                return direction != DIRECTION_EDEFAULT;
            case UmlPackage.PARAMETER__DEFAULT:
                return isSetDefault();
            case UmlPackage.PARAMETER__DEFAULT_VALUE:
                return defaultValue != null;
            case UmlPackage.PARAMETER__IS_EXCEPTION:
                return isException != IS_EXCEPTION_EDEFAULT;
            case UmlPackage.PARAMETER__IS_STREAM:
                return isStream != IS_STREAM_EDEFAULT;
            case UmlPackage.PARAMETER__EFFECT:
                return isSetEffect();
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
        if (baseClass == MultiplicityElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.PARAMETER__IS_ORDERED: return UmlPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
                case UmlPackage.PARAMETER__IS_UNIQUE: return UmlPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
                case UmlPackage.PARAMETER__UPPER: return UmlPackage.MULTIPLICITY_ELEMENT__UPPER;
                case UmlPackage.PARAMETER__LOWER: return UmlPackage.MULTIPLICITY_ELEMENT__LOWER;
                case UmlPackage.PARAMETER__UPPER_VALUE: return UmlPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
                case UmlPackage.PARAMETER__LOWER_VALUE: return UmlPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
        if (baseClass == MultiplicityElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return UmlPackage.PARAMETER__IS_ORDERED;
                case UmlPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UmlPackage.PARAMETER__IS_UNIQUE;
                case UmlPackage.MULTIPLICITY_ELEMENT__UPPER: return UmlPackage.PARAMETER__UPPER;
                case UmlPackage.MULTIPLICITY_ELEMENT__LOWER: return UmlPackage.PARAMETER__LOWER;
                case UmlPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UmlPackage.PARAMETER__UPPER_VALUE;
                case UmlPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UmlPackage.PARAMETER__LOWER_VALUE;
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
        result.append(" (isOrdered: ");
        result.append(isOrdered);
        result.append(", isUnique: ");
        result.append(isUnique);
        result.append(", direction: ");
        result.append(direction);
        result.append(", isException: ");
        result.append(isException);
        result.append(", isStream: ");
        result.append(isStream);
        result.append(", effect: ");
        if (effectESet) result.append(effect); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ParameterImpl
