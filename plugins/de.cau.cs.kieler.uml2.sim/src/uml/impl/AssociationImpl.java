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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Association;
import uml.Element;
import uml.Property;
import uml.Relationship;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.AssociationImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association {
    /**
     * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedEnd()
     * @generated
     * @ordered
     */
    protected EList<Property> ownedEnd;

    /**
     * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemberEnd()
     * @generated
     * @ordered
     */
    protected EList<Property> memberEnd;

    /**
     * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DERIVED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected boolean isDerived = IS_DERIVED_EDEFAULT;

    /**
     * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNavigableOwnedEnd()
     * @generated
     * @ordered
     */
    protected EList<Property> navigableOwnedEnd;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getAssociation();
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
    public EList<Property> getOwnedEnd() {
        if (ownedEnd == null) {
            ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UmlPackage.ASSOCIATION__OWNED_END, UmlPackage.PROPERTY__OWNING_ASSOCIATION);
        }
        return ownedEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getMemberEnd() {
        if (memberEnd == null) {
            memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, UmlPackage.ASSOCIATION__MEMBER_END, UmlPackage.PROPERTY__ASSOCIATION);
        }
        return memberEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDerived() {
        return isDerived;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDerived(boolean newIsDerived) {
        boolean oldIsDerived = isDerived;
        isDerived = newIsDerived;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> getEndType() {
        // TODO: implement this method to return the 'End Type' reference list
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
    public EList<Property> getNavigableOwnedEnd() {
        if (navigableOwnedEnd == null) {
            navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
        }
        return navigableOwnedEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean specialized_end_number(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ASSOCIATION__SPECIALIZED_END_NUMBER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialized_end_number", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean specialized_end_types(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ASSOCIATION__SPECIALIZED_END_TYPES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialized_end_types", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean binary_associations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ASSOCIATION__BINARY_ASSOCIATIONS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "binary_associations", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean association_ends(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ASSOCIATION__ASSOCIATION_ENDS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "association_ends", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean isBinary() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> getEndTypes() {
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
            case UmlPackage.ASSOCIATION__OWNED_END:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
            case UmlPackage.ASSOCIATION__MEMBER_END:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.ASSOCIATION__OWNED_END:
                return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
            case UmlPackage.ASSOCIATION__MEMBER_END:
                return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.ASSOCIATION__RELATED_ELEMENT:
                return getRelatedElement();
            case UmlPackage.ASSOCIATION__OWNED_END:
                return getOwnedEnd();
            case UmlPackage.ASSOCIATION__MEMBER_END:
                return getMemberEnd();
            case UmlPackage.ASSOCIATION__IS_DERIVED:
                return isIsDerived();
            case UmlPackage.ASSOCIATION__END_TYPE:
                return getEndType();
            case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
                return getNavigableOwnedEnd();
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
            case UmlPackage.ASSOCIATION__OWNED_END:
                getOwnedEnd().clear();
                getOwnedEnd().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.ASSOCIATION__MEMBER_END:
                getMemberEnd().clear();
                getMemberEnd().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.ASSOCIATION__IS_DERIVED:
                setIsDerived((Boolean)newValue);
                return;
            case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
                getNavigableOwnedEnd().clear();
                getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
            case UmlPackage.ASSOCIATION__OWNED_END:
                getOwnedEnd().clear();
                return;
            case UmlPackage.ASSOCIATION__MEMBER_END:
                getMemberEnd().clear();
                return;
            case UmlPackage.ASSOCIATION__IS_DERIVED:
                setIsDerived(IS_DERIVED_EDEFAULT);
                return;
            case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
                getNavigableOwnedEnd().clear();
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
            case UmlPackage.ASSOCIATION__RELATED_ELEMENT:
                return !getRelatedElement().isEmpty();
            case UmlPackage.ASSOCIATION__OWNED_END:
                return ownedEnd != null && !ownedEnd.isEmpty();
            case UmlPackage.ASSOCIATION__MEMBER_END:
                return memberEnd != null && !memberEnd.isEmpty();
            case UmlPackage.ASSOCIATION__IS_DERIVED:
                return isDerived != IS_DERIVED_EDEFAULT;
            case UmlPackage.ASSOCIATION__END_TYPE:
                return !getEndType().isEmpty();
            case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
                return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
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
                case UmlPackage.ASSOCIATION__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
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
                case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.ASSOCIATION__RELATED_ELEMENT;
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
        result.append(" (isDerived: ");
        result.append(isDerived);
        result.append(')');
        return result.toString();
    }

} //AssociationImpl
