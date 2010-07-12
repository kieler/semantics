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
import uml.LinkEndDestructionData;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.LinkEndDestructionDataImpl#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 *   <li>{@link uml.impl.LinkEndDestructionDataImpl#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDestructionDataImpl extends LinkEndDataImpl implements LinkEndDestructionData {
    /**
     * The default value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDestroyDuplicates()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DESTROY_DUPLICATES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDestroyDuplicates()
     * @generated
     * @ordered
     */
    protected boolean isDestroyDuplicates = IS_DESTROY_DUPLICATES_EDEFAULT;

    /**
     * The cached value of the '{@link #getDestroyAt() <em>Destroy At</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestroyAt()
     * @generated
     * @ordered
     */
    protected InputPin destroyAt;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinkEndDestructionDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getLinkEndDestructionData();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDestroyDuplicates() {
        return isDestroyDuplicates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDestroyDuplicates(boolean newIsDestroyDuplicates) {
        boolean oldIsDestroyDuplicates = isDestroyDuplicates;
        isDestroyDuplicates = newIsDestroyDuplicates;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES, oldIsDestroyDuplicates, isDestroyDuplicates));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getDestroyAt() {
        if (destroyAt != null && destroyAt.eIsProxy()) {
            InternalEObject oldDestroyAt = (InternalEObject)destroyAt;
            destroyAt = (InputPin)eResolveProxy(oldDestroyAt);
            if (destroyAt != oldDestroyAt) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
            }
        }
        return destroyAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin basicGetDestroyAt() {
        return destroyAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestroyAt(InputPin newDestroyAt) {
        InputPin oldDestroyAt = destroyAt;
        destroyAt = newDestroyAt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean destroy_link_action(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LINK_END_DESTRUCTION_DATA__DESTROY_LINK_ACTION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "destroy_link_action", EObjectValidator.getObjectLabel(this, context) }),
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
                         UmlValidator.LINK_END_DESTRUCTION_DATA__UNLIMITED_NATURAL_AND_MULTIPLICITY,
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
                return isIsDestroyDuplicates();
            case UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
                if (resolve) return getDestroyAt();
                return basicGetDestroyAt();
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
            case UmlPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
                setIsDestroyDuplicates((Boolean)newValue);
                return;
            case UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
                setDestroyAt((InputPin)newValue);
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
            case UmlPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
                setIsDestroyDuplicates(IS_DESTROY_DUPLICATES_EDEFAULT);
                return;
            case UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
                setDestroyAt((InputPin)null);
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
            case UmlPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
                return isDestroyDuplicates != IS_DESTROY_DUPLICATES_EDEFAULT;
            case UmlPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
                return destroyAt != null;
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
        result.append(" (isDestroyDuplicates: ");
        result.append(isDestroyDuplicates);
        result.append(')');
        return result.toString();
    }

} //LinkEndDestructionDataImpl
