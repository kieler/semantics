/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.InputPin;
import uml.LinkEndCreationData;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.LinkEndCreationDataImpl#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataImpl extends LinkEndDataImpl implements LinkEndCreationData {
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
     * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' reference.
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
    protected LinkEndCreationDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getLinkEndCreationData();
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getInsertAt() {
        if (insertAt != null && insertAt.eIsProxy()) {
            InternalEObject oldInsertAt = (InternalEObject)insertAt;
            insertAt = (InputPin)eResolveProxy(oldInsertAt);
            if (insertAt != oldInsertAt) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
            }
        }
        return insertAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin basicGetInsertAt() {
        return insertAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInsertAt(InputPin newInsertAt) {
        InputPin oldInsertAt = insertAt;
        insertAt = newInsertAt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean create_link_action(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LINK_END_CREATION_DATA__CREATE_LINK_ACTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "create_link_action", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean single_input_pin(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LINK_END_CREATION_DATA__SINGLE_INPUT_PIN,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "single_input_pin", EObjectValidator.getObjectLabel(this, context) }),
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
                return isIsReplaceAll();
            case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
                if (resolve) return getInsertAt();
                return basicGetInsertAt();
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
            case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
                setIsReplaceAll((Boolean)newValue);
                return;
            case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
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
            case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
                setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
                return;
            case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
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
            case UmlPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
                return isReplaceAll != IS_REPLACE_ALL_EDEFAULT;
            case UmlPackage.LINK_END_CREATION_DATA__INSERT_AT:
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

} //LinkEndCreationDataImpl
