/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Dependency;
import uml.DirectedRelationship;
import uml.Element;
import uml.NamedElement;
import uml.Relationship;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DependencyImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends PackageableElementImpl implements Dependency {
    /**
     * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupplier()
     * @generated
     * @ordered
     */
    protected EList<NamedElement> supplier;

    /**
     * The cached value of the '{@link #getClient() <em>Client</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClient()
     * @generated
     * @ordered
     */
    protected EList<NamedElement> client;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DependencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getDependency();
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
    public EList<NamedElement> getSupplier() {
        if (supplier == null) {
            supplier = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UmlPackage.DEPENDENCY__SUPPLIER);
        }
        return supplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getClient() {
        if (client == null) {
            client = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement>(NamedElement.class, this, UmlPackage.DEPENDENCY__CLIENT, UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
        }
        return client;
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
            case UmlPackage.DEPENDENCY__CLIENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getClient()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.DEPENDENCY__CLIENT:
                return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.DEPENDENCY__RELATED_ELEMENT:
                return getRelatedElement();
            case UmlPackage.DEPENDENCY__SOURCE:
                return getSource();
            case UmlPackage.DEPENDENCY__TARGET:
                return getTarget();
            case UmlPackage.DEPENDENCY__SUPPLIER:
                return getSupplier();
            case UmlPackage.DEPENDENCY__CLIENT:
                return getClient();
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
            case UmlPackage.DEPENDENCY__SUPPLIER:
                getSupplier().clear();
                getSupplier().addAll((Collection<? extends NamedElement>)newValue);
                return;
            case UmlPackage.DEPENDENCY__CLIENT:
                getClient().clear();
                getClient().addAll((Collection<? extends NamedElement>)newValue);
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
            case UmlPackage.DEPENDENCY__SUPPLIER:
                getSupplier().clear();
                return;
            case UmlPackage.DEPENDENCY__CLIENT:
                getClient().clear();
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
            case UmlPackage.DEPENDENCY__RELATED_ELEMENT:
                return !getRelatedElement().isEmpty();
            case UmlPackage.DEPENDENCY__SOURCE:
                return !getSource().isEmpty();
            case UmlPackage.DEPENDENCY__TARGET:
                return !getTarget().isEmpty();
            case UmlPackage.DEPENDENCY__SUPPLIER:
                return supplier != null && !supplier.isEmpty();
            case UmlPackage.DEPENDENCY__CLIENT:
                return client != null && !client.isEmpty();
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
                case UmlPackage.DEPENDENCY__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (derivedFeatureID) {
                case UmlPackage.DEPENDENCY__SOURCE: return UmlPackage.DIRECTED_RELATIONSHIP__SOURCE;
                case UmlPackage.DEPENDENCY__TARGET: return UmlPackage.DIRECTED_RELATIONSHIP__TARGET;
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
                case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.DEPENDENCY__RELATED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == DirectedRelationship.class) {
            switch (baseFeatureID) {
                case UmlPackage.DIRECTED_RELATIONSHIP__SOURCE: return UmlPackage.DEPENDENCY__SOURCE;
                case UmlPackage.DIRECTED_RELATIONSHIP__TARGET: return UmlPackage.DEPENDENCY__TARGET;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //DependencyImpl
