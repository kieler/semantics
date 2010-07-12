/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Collaboration;
import uml.ConnectableElement;
import uml.Connector;
import uml.Property;
import uml.StructuredClassifier;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.CollaborationImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.CollaborationImpl#getPart <em>Part</em>}</li>
 *   <li>{@link uml.impl.CollaborationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uml.impl.CollaborationImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link uml.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends BehavioredClassifierImpl implements Collaboration {
    /**
     * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedAttribute()
     * @generated
     * @ordered
     */
    protected EList<Property> ownedAttribute;

    /**
     * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedConnector()
     * @generated
     * @ordered
     */
    protected EList<Connector> ownedConnector;

    /**
     * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollaborationRole()
     * @generated
     * @ordered
     */
    protected EList<ConnectableElement> collaborationRole;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollaborationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getCollaboration();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getOwnedAttribute() {
        if (ownedAttribute == null) {
            ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UmlPackage.COLLABORATION__OWNED_ATTRIBUTE);
        }
        return ownedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getPart() {
        // TODO: implement this method to return the 'Part' reference list
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
    public EList<ConnectableElement> getRole() {
        // TODO: implement this method to return the 'Role' reference list
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
    public EList<Connector> getOwnedConnector() {
        if (ownedConnector == null) {
            ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, UmlPackage.COLLABORATION__OWNED_CONNECTOR);
        }
        return ownedConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConnectableElement> getCollaborationRole() {
        if (collaborationRole == null) {
            collaborationRole = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, UmlPackage.COLLABORATION__COLLABORATION_ROLE);
        }
        return collaborationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean multiplicities(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STRUCTURED_CLASSIFIER__MULTIPLICITIES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "multiplicities", EObjectValidator.getObjectLabel(this, context) }),
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
    public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
                return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
            case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
                return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
                return getOwnedAttribute();
            case UmlPackage.COLLABORATION__PART:
                return getPart();
            case UmlPackage.COLLABORATION__ROLE:
                return getRole();
            case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
                return getOwnedConnector();
            case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
                return getCollaborationRole();
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
            case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
                getOwnedConnector().clear();
                getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
                return;
            case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
                getCollaborationRole().clear();
                getCollaborationRole().addAll((Collection<? extends ConnectableElement>)newValue);
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
            case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                return;
            case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
                getOwnedConnector().clear();
                return;
            case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
                getCollaborationRole().clear();
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
            case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE:
                return ownedAttribute != null && !ownedAttribute.isEmpty();
            case UmlPackage.COLLABORATION__PART:
                return !getPart().isEmpty();
            case UmlPackage.COLLABORATION__ROLE:
                return !getRole().isEmpty();
            case UmlPackage.COLLABORATION__OWNED_CONNECTOR:
                return ownedConnector != null && !ownedConnector.isEmpty();
            case UmlPackage.COLLABORATION__COLLABORATION_ROLE:
                return collaborationRole != null && !collaborationRole.isEmpty();
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
        if (baseClass == StructuredClassifier.class) {
            switch (derivedFeatureID) {
                case UmlPackage.COLLABORATION__OWNED_ATTRIBUTE: return UmlPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
                case UmlPackage.COLLABORATION__PART: return UmlPackage.STRUCTURED_CLASSIFIER__PART;
                case UmlPackage.COLLABORATION__ROLE: return UmlPackage.STRUCTURED_CLASSIFIER__ROLE;
                case UmlPackage.COLLABORATION__OWNED_CONNECTOR: return UmlPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
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
        if (baseClass == StructuredClassifier.class) {
            switch (baseFeatureID) {
                case UmlPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UmlPackage.COLLABORATION__OWNED_ATTRIBUTE;
                case UmlPackage.STRUCTURED_CLASSIFIER__PART: return UmlPackage.COLLABORATION__PART;
                case UmlPackage.STRUCTURED_CLASSIFIER__ROLE: return UmlPackage.COLLABORATION__ROLE;
                case UmlPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UmlPackage.COLLABORATION__OWNED_CONNECTOR;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CollaborationImpl
