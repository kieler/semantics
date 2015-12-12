/**
 */
package de.cau.cs.kieler.circuit.impl;

import de.cau.cs.kieler.circuit.Circuit;
import de.cau.cs.kieler.circuit.CircuitPackage;
import de.cau.cs.kieler.circuit.Link;
import de.cau.cs.kieler.circuit.Node;
import de.cau.cs.kieler.circuit.Port;
import de.cau.cs.kieler.circuit.Relation;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.CircuitImpl#getCircuits <em>Circuits</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.CircuitImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.CircuitImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.CircuitImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.CircuitImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends LinkableImpl implements Circuit {
	/**
	 * The cached value of the '{@link #getCircuits() <em>Circuits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuits()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> circuits;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circuit> getCircuits() {
		if (circuits == null) {
			circuits = new EObjectContainmentEList<Circuit>(Circuit.class, this, CircuitPackage.CIRCUIT__CIRCUITS);
		}
		return circuits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, CircuitPackage.CIRCUIT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, CircuitPackage.CIRCUIT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, CircuitPackage.CIRCUIT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, CircuitPackage.CIRCUIT__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitPackage.CIRCUIT__CIRCUITS:
				return ((InternalEList<?>)getCircuits()).basicRemove(otherEnd, msgs);
			case CircuitPackage.CIRCUIT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CircuitPackage.CIRCUIT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CircuitPackage.CIRCUIT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case CircuitPackage.CIRCUIT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case CircuitPackage.CIRCUIT__CIRCUITS:
				return getCircuits();
			case CircuitPackage.CIRCUIT__LINKS:
				return getLinks();
			case CircuitPackage.CIRCUIT__NODES:
				return getNodes();
			case CircuitPackage.CIRCUIT__PORTS:
				return getPorts();
			case CircuitPackage.CIRCUIT__RELATIONS:
				return getRelations();
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
			case CircuitPackage.CIRCUIT__CIRCUITS:
				getCircuits().clear();
				getCircuits().addAll((Collection<? extends Circuit>)newValue);
				return;
			case CircuitPackage.CIRCUIT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case CircuitPackage.CIRCUIT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case CircuitPackage.CIRCUIT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case CircuitPackage.CIRCUIT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case CircuitPackage.CIRCUIT__CIRCUITS:
				getCircuits().clear();
				return;
			case CircuitPackage.CIRCUIT__LINKS:
				getLinks().clear();
				return;
			case CircuitPackage.CIRCUIT__NODES:
				getNodes().clear();
				return;
			case CircuitPackage.CIRCUIT__PORTS:
				getPorts().clear();
				return;
			case CircuitPackage.CIRCUIT__RELATIONS:
				getRelations().clear();
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
			case CircuitPackage.CIRCUIT__CIRCUITS:
				return circuits != null && !circuits.isEmpty();
			case CircuitPackage.CIRCUIT__LINKS:
				return links != null && !links.isEmpty();
			case CircuitPackage.CIRCUIT__NODES:
				return nodes != null && !nodes.isEmpty();
			case CircuitPackage.CIRCUIT__PORTS:
				return ports != null && !ports.isEmpty();
			case CircuitPackage.CIRCUIT__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CircuitImpl
