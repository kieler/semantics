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
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Constraint;
import uml.DirectedRelationship;
import uml.Element;
import uml.Extend;
import uml.ExtensionPoint;
import uml.Relationship;
import uml.UmlPackage;
import uml.UseCase;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ExtendImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link uml.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends NamedElementImpl implements Extend {
    /**
     * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedCase()
     * @generated
     * @ordered
     */
    protected UseCase extendedCase;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Constraint condition;

    /**
     * The cached value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtensionLocation()
     * @generated
     * @ordered
     */
    protected EList<ExtensionPoint> extensionLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getExtend();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getRelatedElement() {
        // TODO: implement this method to return the 'Related Element' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getSource() {
        // TODO: implement this method to return the 'Source' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getTarget() {
        // TODO: implement this method to return the 'Target' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getExtendedCase() {
        if (extendedCase != null && extendedCase.eIsProxy()) {
            InternalEObject oldExtendedCase = (InternalEObject)extendedCase;
            extendedCase = (UseCase)eResolveProxy(oldExtendedCase);
            if (extendedCase != oldExtendedCase) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
            }
        }
        return extendedCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetExtendedCase() {
        return extendedCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtendedCase(UseCase newExtendedCase) {
        UseCase oldExtendedCase = extendedCase;
        extendedCase = newExtendedCase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Constraint newCondition, NotificationChain msgs) {
        Constraint oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(Constraint newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.EXTEND__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.EXTEND__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExtensionPoint> getExtensionLocation() {
        if (extensionLocation == null) {
            extensionLocation = new EObjectResolvingEList<ExtensionPoint>(ExtensionPoint.class, this, UmlPackage.EXTEND__EXTENSION_LOCATION);
        }
        return extensionLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getExtension() {
        if (eContainerFeatureID() != UmlPackage.EXTEND__EXTENSION) return null;
        return (UseCase)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtension(UseCase newExtension, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newExtension, UmlPackage.EXTEND__EXTENSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(UseCase newExtension) {
        if (newExtension != eInternalContainer() || (eContainerFeatureID() != UmlPackage.EXTEND__EXTENSION && newExtension != null)) {
            if (EcoreUtil.isAncestor(this, newExtension))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newExtension != null)
                msgs = ((InternalEObject)newExtension).eInverseAdd(this, UmlPackage.USE_CASE__EXTEND, UseCase.class, msgs);
            msgs = basicSetExtension(newExtension, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXTEND__EXTENSION, newExtension, newExtension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean extension_points(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXTEND__EXTENSION_POINTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "extension_points", EObjectValidator.getObjectLabel(this, context) }),
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
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.EXTEND__EXTENSION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetExtension((UseCase)otherEnd, msgs);
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
            case UmlPackage.EXTEND__CONDITION:
                return basicSetCondition(null, msgs);
            case UmlPackage.EXTEND__EXTENSION:
                return basicSetExtension(null, msgs);
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
            case UmlPackage.EXTEND__EXTENSION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.USE_CASE__EXTEND, UseCase.class, msgs);
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
            case UmlPackage.EXTEND__RELATED_ELEMENT:
                return getRelatedElement();
            case UmlPackage.EXTEND__SOURCE:
                return getSource();
            case UmlPackage.EXTEND__TARGET:
                return getTarget();
            case UmlPackage.EXTEND__EXTENDED_CASE:
                if (resolve) return getExtendedCase();
                return basicGetExtendedCase();
            case UmlPackage.EXTEND__CONDITION:
                return getCondition();
            case UmlPackage.EXTEND__EXTENSION_LOCATION:
                return getExtensionLocation();
            case UmlPackage.EXTEND__EXTENSION:
                return getExtension();
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
            case UmlPackage.EXTEND__EXTENDED_CASE:
                setExtendedCase((UseCase)newValue);
                return;
            case UmlPackage.EXTEND__CONDITION:
                setCondition((Constraint)newValue);
                return;
            case UmlPackage.EXTEND__EXTENSION_LOCATION:
                getExtensionLocation().clear();
                getExtensionLocation().addAll((Collection<? extends ExtensionPoint>)newValue);
                return;
            case UmlPackage.EXTEND__EXTENSION:
                setExtension((UseCase)newValue);
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
            case UmlPackage.EXTEND__EXTENDED_CASE:
                setExtendedCase((UseCase)null);
                return;
            case UmlPackage.EXTEND__CONDITION:
                setCondition((Constraint)null);
                return;
            case UmlPackage.EXTEND__EXTENSION_LOCATION:
                getExtensionLocation().clear();
                return;
            case UmlPackage.EXTEND__EXTENSION:
                setExtension((UseCase)null);
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
            case UmlPackage.EXTEND__RELATED_ELEMENT:
                return !getRelatedElement().isEmpty();
            case UmlPackage.EXTEND__SOURCE:
                return !getSource().isEmpty();
            case UmlPackage.EXTEND__TARGET:
                return !getTarget().isEmpty();
            case UmlPackage.EXTEND__EXTENDED_CASE:
                return extendedCase != null;
            case UmlPackage.EXTEND__CONDITION:
                return condition != null;
            case UmlPackage.EXTEND__EXTENSION_LOCATION:
                return extensionLocation != null && !extensionLocation.isEmpty();
            case UmlPackage.EXTEND__EXTENSION:
                return getExtension() != null;
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
        if (baseClass == Relationship.class) {
            switch (derivedFeatureID) {
                case UmlPackage.EXTEND__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (derivedFeatureID) {
                case UmlPackage.EXTEND__SOURCE: return UmlPackage.DIRECTED_RELATIONSHIP__SOURCE;
                case UmlPackage.EXTEND__TARGET: return UmlPackage.DIRECTED_RELATIONSHIP__TARGET;
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
        if (baseClass == Relationship.class) {
            switch (baseFeatureID) {
                case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.EXTEND__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (baseFeatureID) {
                case UmlPackage.DIRECTED_RELATIONSHIP__SOURCE: return UmlPackage.EXTEND__SOURCE;
                case UmlPackage.DIRECTED_RELATIONSHIP__TARGET: return UmlPackage.EXTEND__TARGET;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ExtendImpl
