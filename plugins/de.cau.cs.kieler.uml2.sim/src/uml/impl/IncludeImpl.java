/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.DirectedRelationship;
import uml.Element;
import uml.Include;
import uml.Relationship;
import uml.UmlPackage;
import uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.IncludeImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.IncludeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.impl.IncludeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link uml.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends NamedElementImpl implements Include {
    /**
     * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddition()
     * @generated
     * @ordered
     */
    protected UseCase addition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncludeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInclude();
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
    public UseCase getAddition() {
        if (addition != null && addition.eIsProxy()) {
            InternalEObject oldAddition = (InternalEObject)addition;
            addition = (UseCase)eResolveProxy(oldAddition);
            if (addition != oldAddition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INCLUDE__ADDITION, oldAddition, addition));
            }
        }
        return addition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetAddition() {
        return addition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddition(UseCase newAddition) {
        UseCase oldAddition = addition;
        addition = newAddition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INCLUDE__ADDITION, oldAddition, addition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getIncludingCase() {
        if (eContainerFeatureID() != UmlPackage.INCLUDE__INCLUDING_CASE) return null;
        return (UseCase)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncludingCase(UseCase newIncludingCase, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newIncludingCase, UmlPackage.INCLUDE__INCLUDING_CASE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludingCase(UseCase newIncludingCase) {
        if (newIncludingCase != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INCLUDE__INCLUDING_CASE && newIncludingCase != null)) {
            if (EcoreUtil.isAncestor(this, newIncludingCase))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newIncludingCase != null)
                msgs = ((InternalEObject)newIncludingCase).eInverseAdd(this, UmlPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
            msgs = basicSetIncludingCase(newIncludingCase, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INCLUDE__INCLUDING_CASE, newIncludingCase, newIncludingCase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetIncludingCase((UseCase)otherEnd, msgs);
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
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                return basicSetIncludingCase(null, msgs);
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
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
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
            case UmlPackage.INCLUDE__RELATED_ELEMENT:
                return getRelatedElement();
            case UmlPackage.INCLUDE__SOURCE:
                return getSource();
            case UmlPackage.INCLUDE__TARGET:
                return getTarget();
            case UmlPackage.INCLUDE__ADDITION:
                if (resolve) return getAddition();
                return basicGetAddition();
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                return getIncludingCase();
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
            case UmlPackage.INCLUDE__ADDITION:
                setAddition((UseCase)newValue);
                return;
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                setIncludingCase((UseCase)newValue);
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
            case UmlPackage.INCLUDE__ADDITION:
                setAddition((UseCase)null);
                return;
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                setIncludingCase((UseCase)null);
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
            case UmlPackage.INCLUDE__RELATED_ELEMENT:
                return !getRelatedElement().isEmpty();
            case UmlPackage.INCLUDE__SOURCE:
                return !getSource().isEmpty();
            case UmlPackage.INCLUDE__TARGET:
                return !getTarget().isEmpty();
            case UmlPackage.INCLUDE__ADDITION:
                return addition != null;
            case UmlPackage.INCLUDE__INCLUDING_CASE:
                return getIncludingCase() != null;
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
                case UmlPackage.INCLUDE__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (derivedFeatureID) {
                case UmlPackage.INCLUDE__SOURCE: return UmlPackage.DIRECTED_RELATIONSHIP__SOURCE;
                case UmlPackage.INCLUDE__TARGET: return UmlPackage.DIRECTED_RELATIONSHIP__TARGET;
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
                case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.INCLUDE__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (baseFeatureID) {
                case UmlPackage.DIRECTED_RELATIONSHIP__SOURCE: return UmlPackage.INCLUDE__SOURCE;
                case UmlPackage.DIRECTED_RELATIONSHIP__TARGET: return UmlPackage.INCLUDE__TARGET;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //IncludeImpl
