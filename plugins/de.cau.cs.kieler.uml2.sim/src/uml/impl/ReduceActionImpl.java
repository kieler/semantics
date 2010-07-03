/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Behavior;
import uml.InputPin;
import uml.OutputPin;
import uml.ReduceAction;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ReduceActionImpl#getReducer <em>Reducer</em>}</li>
 *   <li>{@link uml.impl.ReduceActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml.impl.ReduceActionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link uml.impl.ReduceActionImpl#isIsOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReduceActionImpl extends ActionImpl implements ReduceAction {
    /**
     * The cached value of the '{@link #getReducer() <em>Reducer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReducer()
     * @generated
     * @ordered
     */
    protected Behavior reducer;

    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected OutputPin result;

    /**
     * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected InputPin collection;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReduceActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getReduceAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getReducer() {
        if (reducer != null && reducer.eIsProxy()) {
            InternalEObject oldReducer = (InternalEObject)reducer;
            reducer = (Behavior)eResolveProxy(oldReducer);
            if (reducer != oldReducer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.REDUCE_ACTION__REDUCER, oldReducer, reducer));
            }
        }
        return reducer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior basicGetReducer() {
        return reducer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReducer(Behavior newReducer) {
        Behavior oldReducer = reducer;
        reducer = newReducer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__REDUCER, oldReducer, reducer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputPin getResult() {
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
        OutputPin oldResult = result;
        result = newResult;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__RESULT, oldResult, newResult);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResult(OutputPin newResult) {
        if (newResult != result) {
            NotificationChain msgs = null;
            if (result != null)
                msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REDUCE_ACTION__RESULT, null, msgs);
            if (newResult != null)
                msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REDUCE_ACTION__RESULT, null, msgs);
            msgs = basicSetResult(newResult, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__RESULT, newResult, newResult));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getCollection() {
        return collection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollection(InputPin newCollection, NotificationChain msgs) {
        InputPin oldCollection = collection;
        collection = newCollection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__COLLECTION, oldCollection, newCollection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollection(InputPin newCollection) {
        if (newCollection != collection) {
            NotificationChain msgs = null;
            if (collection != null)
                msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REDUCE_ACTION__COLLECTION, null, msgs);
            if (newCollection != null)
                msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REDUCE_ACTION__COLLECTION, null, msgs);
            msgs = basicSetCollection(newCollection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__COLLECTION, newCollection, newCollection));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REDUCE_ACTION__IS_ORDERED, oldIsOrdered, isOrdered));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean input_type_is_collection(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDUCE_ACTION__INPUT_TYPE_IS_COLLECTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "input_type_is_collection", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean output_types_are_compatible(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "output_types_are_compatible", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean reducer_inputs_output(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDUCE_ACTION__REDUCER_INPUTS_OUTPUT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "reducer_inputs_output", EObjectValidator.getObjectLabel(this, context) }),
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.REDUCE_ACTION__RESULT:
                return basicSetResult(null, msgs);
            case UmlPackage.REDUCE_ACTION__COLLECTION:
                return basicSetCollection(null, msgs);
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
            case UmlPackage.REDUCE_ACTION__REDUCER:
                if (resolve) return getReducer();
                return basicGetReducer();
            case UmlPackage.REDUCE_ACTION__RESULT:
                return getResult();
            case UmlPackage.REDUCE_ACTION__COLLECTION:
                return getCollection();
            case UmlPackage.REDUCE_ACTION__IS_ORDERED:
                return isIsOrdered();
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
            case UmlPackage.REDUCE_ACTION__REDUCER:
                setReducer((Behavior)newValue);
                return;
            case UmlPackage.REDUCE_ACTION__RESULT:
                setResult((OutputPin)newValue);
                return;
            case UmlPackage.REDUCE_ACTION__COLLECTION:
                setCollection((InputPin)newValue);
                return;
            case UmlPackage.REDUCE_ACTION__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
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
            case UmlPackage.REDUCE_ACTION__REDUCER:
                setReducer((Behavior)null);
                return;
            case UmlPackage.REDUCE_ACTION__RESULT:
                setResult((OutputPin)null);
                return;
            case UmlPackage.REDUCE_ACTION__COLLECTION:
                setCollection((InputPin)null);
                return;
            case UmlPackage.REDUCE_ACTION__IS_ORDERED:
                setIsOrdered(IS_ORDERED_EDEFAULT);
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
            case UmlPackage.REDUCE_ACTION__REDUCER:
                return reducer != null;
            case UmlPackage.REDUCE_ACTION__RESULT:
                return result != null;
            case UmlPackage.REDUCE_ACTION__COLLECTION:
                return collection != null;
            case UmlPackage.REDUCE_ACTION__IS_ORDERED:
                return isOrdered != IS_ORDERED_EDEFAULT;
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
        result.append(" (isOrdered: ");
        result.append(isOrdered);
        result.append(')');
        return result.toString();
    }

} //ReduceActionImpl
