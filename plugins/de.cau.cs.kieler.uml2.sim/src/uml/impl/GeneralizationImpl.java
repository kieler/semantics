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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Classifier;
import uml.Generalization;
import uml.GeneralizationSet;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.GeneralizationImpl#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.impl.GeneralizationImpl#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link uml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization {
    /**
     * The default value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSubstitutable()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSubstitutable()
     * @generated
     * @ordered
     */
    protected boolean isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

    /**
     * This is true if the Is Substitutable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSubstitutableESet;

    /**
     * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneral()
     * @generated
     * @ordered
     */
    protected Classifier general;

    /**
     * The cached value of the '{@link #getGeneralizationSet() <em>Generalization Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralizationSet()
     * @generated
     * @ordered
     */
    protected EList<GeneralizationSet> generalizationSet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getGeneralization();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSubstitutable() {
        return isSubstitutable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSubstitutable(boolean newIsSubstitutable) {
        boolean oldIsSubstitutable = isSubstitutable;
        isSubstitutable = newIsSubstitutable;
        boolean oldIsSubstitutableESet = isSubstitutableESet;
        isSubstitutableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable, !oldIsSubstitutableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsSubstitutable() {
        boolean oldIsSubstitutable = isSubstitutable;
        boolean oldIsSubstitutableESet = isSubstitutableESet;
        isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;
        isSubstitutableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, IS_SUBSTITUTABLE_EDEFAULT, oldIsSubstitutableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsSubstitutable() {
        return isSubstitutableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getGeneral() {
        if (general != null && general.eIsProxy()) {
            InternalEObject oldGeneral = (InternalEObject)general;
            general = (Classifier)eResolveProxy(oldGeneral);
            if (general != oldGeneral) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.GENERALIZATION__GENERAL, oldGeneral, general));
            }
        }
        return general;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetGeneral() {
        return general;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneral(Classifier newGeneral) {
        Classifier oldGeneral = general;
        general = newGeneral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__GENERAL, oldGeneral, general));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralizationSet> getGeneralizationSet() {
        if (generalizationSet == null) {
            generalizationSet = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizationSet>(GeneralizationSet.class, this, UmlPackage.GENERALIZATION__GENERALIZATION_SET, UmlPackage.GENERALIZATION_SET__GENERALIZATION);
        }
        return generalizationSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getSpecific() {
        if (eContainerFeatureID() != UmlPackage.GENERALIZATION__SPECIFIC) return null;
        return (Classifier)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecific(Classifier newSpecific, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSpecific, UmlPackage.GENERALIZATION__SPECIFIC, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecific(Classifier newSpecific) {
        if (newSpecific != eInternalContainer() || (eContainerFeatureID() != UmlPackage.GENERALIZATION__SPECIFIC && newSpecific != null)) {
            if (EcoreUtil.isAncestor(this, newSpecific))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSpecific != null)
                msgs = ((InternalEObject)newSpecific).eInverseAdd(this, UmlPackage.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
            msgs = basicSetSpecific(newSpecific, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean generalization_same_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.GENERALIZATION__GENERALIZATION_SAME_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "generalization_same_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizationSet()).basicAdd(otherEnd, msgs);
            case UmlPackage.GENERALIZATION__SPECIFIC:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSpecific((Classifier)otherEnd, msgs);
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
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                return ((InternalEList<?>)getGeneralizationSet()).basicRemove(otherEnd, msgs);
            case UmlPackage.GENERALIZATION__SPECIFIC:
                return basicSetSpecific(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.GENERALIZATION__SPECIFIC:
                return eInternalContainer().eInverseRemove(this, UmlPackage.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
                return isIsSubstitutable();
            case UmlPackage.GENERALIZATION__GENERAL:
                if (resolve) return getGeneral();
                return basicGetGeneral();
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                return getGeneralizationSet();
            case UmlPackage.GENERALIZATION__SPECIFIC:
                return getSpecific();
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
            case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
                setIsSubstitutable((Boolean)newValue);
                return;
            case UmlPackage.GENERALIZATION__GENERAL:
                setGeneral((Classifier)newValue);
                return;
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                getGeneralizationSet().clear();
                getGeneralizationSet().addAll((Collection<? extends GeneralizationSet>)newValue);
                return;
            case UmlPackage.GENERALIZATION__SPECIFIC:
                setSpecific((Classifier)newValue);
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
            case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
                unsetIsSubstitutable();
                return;
            case UmlPackage.GENERALIZATION__GENERAL:
                setGeneral((Classifier)null);
                return;
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                getGeneralizationSet().clear();
                return;
            case UmlPackage.GENERALIZATION__SPECIFIC:
                setSpecific((Classifier)null);
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
            case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
                return isSetIsSubstitutable();
            case UmlPackage.GENERALIZATION__GENERAL:
                return general != null;
            case UmlPackage.GENERALIZATION__GENERALIZATION_SET:
                return generalizationSet != null && !generalizationSet.isEmpty();
            case UmlPackage.GENERALIZATION__SPECIFIC:
                return getSpecific() != null;
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
        result.append(" (isSubstitutable: ");
        if (isSubstitutableESet) result.append(isSubstitutable); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //GeneralizationImpl
