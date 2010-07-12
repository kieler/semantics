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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Classifier;
import uml.InputPin;
import uml.ReclassifyObjectAction;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ReclassifyObjectActionImpl#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml.impl.ReclassifyObjectActionImpl#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link uml.impl.ReclassifyObjectActionImpl#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link uml.impl.ReclassifyObjectActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReclassifyObjectActionImpl extends ActionImpl implements ReclassifyObjectAction {
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
     * The cached value of the '{@link #getOldClassifier() <em>Old Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> oldClassifier;

    /**
     * The cached value of the '{@link #getNewClassifier() <em>New Classifier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> newClassifier;

    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObject()
     * @generated
     * @ordered
     */
    protected InputPin object;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReclassifyObjectActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getReclassifyObjectAction();
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getOldClassifier() {
        if (oldClassifier == null) {
            oldClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
        }
        return oldClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getNewClassifier() {
        if (newClassifier == null) {
            newClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
        }
        return newClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin getObject() {
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
        InputPin oldObject = object;
        object = newObject;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, oldObject, newObject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(InputPin newObject) {
        if (newObject != object) {
            NotificationChain msgs = null;
            if (object != null)
                msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, null, msgs);
            if (newObject != null)
                msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, null, msgs);
            msgs = basicSetObject(newObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, newObject, newObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean classifier_not_abstract(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.RECLASSIFY_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "classifier_not_abstract", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.RECLASSIFY_OBJECT_ACTION__MULTIPLICITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "multiplicity", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean input_pin(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.RECLASSIFY_OBJECT_ACTION__INPUT_PIN,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "input_pin", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
                return basicSetObject(null, msgs);
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
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
                return isIsReplaceAll();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
                return getOldClassifier();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
                return getNewClassifier();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
                return getObject();
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
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
                setIsReplaceAll((Boolean)newValue);
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
                getOldClassifier().clear();
                getOldClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
                getNewClassifier().clear();
                getNewClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
                setObject((InputPin)newValue);
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
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
                setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
                getOldClassifier().clear();
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
                getNewClassifier().clear();
                return;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
                setObject((InputPin)null);
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
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
                return isReplaceAll != IS_REPLACE_ALL_EDEFAULT;
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
                return oldClassifier != null && !oldClassifier.isEmpty();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
                return newClassifier != null && !newClassifier.isEmpty();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
                return object != null;
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

} //ReclassifyObjectActionImpl
