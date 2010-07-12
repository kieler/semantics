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

import uml.AddStructuralFeatureValueAction;
import uml.InputPin;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.AddStructuralFeatureValueActionImpl#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml.impl.AddStructuralFeatureValueActionImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddStructuralFeatureValueActionImpl extends WriteStructuralFeatureActionImpl implements AddStructuralFeatureValueAction {
    /**
     * The default value of the '{@link #isIsReplaceAll() <em>Is Replace All</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReplaceAll()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReplaceAll() <em>Is Replace All</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReplaceAll()
     * @generated
     * @ordered
     */
    protected boolean isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

    /**
     * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsertAt()
     * @generated
     * @ordered
     */
    protected InputPin insertAt;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddStructuralFeatureValueActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getAddStructuralFeatureValueAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsReplaceAll() {
        return isReplaceAll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsReplaceAll(boolean newIsReplaceAll) {
        boolean oldIsReplaceAll = isReplaceAll;
        isReplaceAll = newIsReplaceAll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getInsertAt() {
        return insertAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInsertAt(InputPin newInsertAt, NotificationChain msgs) {
        InputPin oldInsertAt = insertAt;
        insertAt = newInsertAt;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, oldInsertAt, newInsertAt);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInsertAt(InputPin newInsertAt) {
        if (newInsertAt != insertAt) {
            NotificationChain msgs = null;
            if (insertAt != null)
                msgs = ((InternalEObject)insertAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
            if (newInsertAt != null)
                msgs = ((InternalEObject)newInsertAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
            msgs = basicSetInsertAt(newInsertAt, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, newInsertAt, newInsertAt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean unlimited_natural_and_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__UNLIMITED_NATURAL_AND_MULTIPLICITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "unlimited_natural_and_multiplicity", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
                return basicSetInsertAt(null, msgs);
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
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
                return isIsReplaceAll();
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
                return getInsertAt();
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
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
                setIsReplaceAll((Boolean)newValue);
                return;
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
                setInsertAt((InputPin)newValue);
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
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
                setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
                return;
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
                setInsertAt((InputPin)null);
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
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
                return isReplaceAll != IS_REPLACE_ALL_EDEFAULT;
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
                return insertAt != null;
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
        result.append(" (isReplaceAll: ");
        result.append(isReplaceAll);
        result.append(')');
        return result.toString();
    }

} //AddStructuralFeatureValueActionImpl
