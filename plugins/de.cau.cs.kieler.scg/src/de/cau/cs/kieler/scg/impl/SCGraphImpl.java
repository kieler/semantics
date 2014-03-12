/**
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.TypeGroup;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getTypeGroups <em>Type Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCGraphImpl extends MinimalEObjectImpl.Container implements SCGraph {
    /**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
    protected EList<Node> nodes;

    /**
	 * The cached value of the '{@link #getTypeGroups() <em>Type Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGroup> typeGroups;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SCGraphImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.SC_GRAPH;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ScgPackage.SC_GRAPH__NODES);
		}
		return nodes;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroup> getTypeGroups() {
		if (typeGroups == null) {
			typeGroups = new EObjectContainmentEList<TypeGroup>(TypeGroup.class, this, ScgPackage.SC_GRAPH__TYPE_GROUPS);
		}
		return typeGroups;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgPackage.SC_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ScgPackage.SC_GRAPH__TYPE_GROUPS:
				return ((InternalEList<?>)getTypeGroups()).basicRemove(otherEnd, msgs);
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
			case ScgPackage.SC_GRAPH__NODES:
				return getNodes();
			case ScgPackage.SC_GRAPH__TYPE_GROUPS:
				return getTypeGroups();
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
			case ScgPackage.SC_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ScgPackage.SC_GRAPH__TYPE_GROUPS:
				getTypeGroups().clear();
				getTypeGroups().addAll((Collection<? extends TypeGroup>)newValue);
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
			case ScgPackage.SC_GRAPH__NODES:
				getNodes().clear();
				return;
			case ScgPackage.SC_GRAPH__TYPE_GROUPS:
				getTypeGroups().clear();
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
			case ScgPackage.SC_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case ScgPackage.SC_GRAPH__TYPE_GROUPS:
				return typeGroups != null && !typeGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SCGraphImpl
