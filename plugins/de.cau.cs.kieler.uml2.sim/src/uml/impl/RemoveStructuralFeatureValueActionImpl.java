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

import uml.InputPin;
import uml.RemoveStructuralFeatureValueAction;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.RemoveStructuralFeatureValueActionImpl#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link uml.impl.RemoveStructuralFeatureValueActionImpl#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveStructuralFeatureValueActionImpl extends WriteStructuralFeatureActionImpl implements RemoveStructuralFeatureValueAction {
    /**
     * The default value of the '{@link #isIsRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRemoveDuplicates()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REMOVE_DUPLICATES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRemoveDuplicates()
     * @generated
     * @ordered
     */
    protected boolean isRemoveDuplicates = IS_REMOVE_DUPLICATES_EDEFAULT;

    /**
     * The cached value of the '{@link #getRemoveAt() <em>Remove At</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoveAt()
     * @generated
     * @ordered
     */
    protected InputPin removeAt;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoveStructuralFeatureValueActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getRemoveStructuralFeatureValueAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRemoveDuplicates() {
        return isRemoveDuplicates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsRemoveDuplicates(boolean newIsRemoveDuplicates) {
        boolean oldIsRemoveDuplicates = isRemoveDuplicates;
        isRemoveDuplicates = newIsRemoveDuplicates;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES, oldIsRemoveDuplicates, isRemoveDuplicates));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getRemoveAt() {
        return removeAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoveAt(InputPin newRemoveAt, NotificationChain msgs) {
        InputPin oldRemoveAt = removeAt;
        removeAt = newRemoveAt;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT, oldRemoveAt, newRemoveAt);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemoveAt(InputPin newRemoveAt) {
        if (newRemoveAt != removeAt) {
            NotificationChain msgs = null;
            if (removeAt != null)
                msgs = ((InternalEObject)removeAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT, null, msgs);
            if (newRemoveAt != null)
                msgs = ((InternalEObject)newRemoveAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT, null, msgs);
            msgs = basicSetRemoveAt(newRemoveAt, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT, newRemoveAt, newRemoveAt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean non_unique_removal(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NON_UNIQUE_REMOVAL,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "non_unique_removal", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
                return basicSetRemoveAt(null, msgs);
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
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
                return isIsRemoveDuplicates();
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
                return getRemoveAt();
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
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
                setIsRemoveDuplicates((Boolean)newValue);
                return;
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
                setRemoveAt((InputPin)newValue);
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
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
                setIsRemoveDuplicates(IS_REMOVE_DUPLICATES_EDEFAULT);
                return;
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
                setRemoveAt((InputPin)null);
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
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
                return isRemoveDuplicates != IS_REMOVE_DUPLICATES_EDEFAULT;
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT:
                return removeAt != null;
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
        result.append(" (isRemoveDuplicates: ");
        result.append(isRemoveDuplicates);
        result.append(')');
        return result.toString();
    }

} //RemoveStructuralFeatureValueActionImpl
