/**
 */
package de.cau.cs.kieler.simpleCircuit.impl;

import de.cau.cs.kieler.simpleCircuit.Circuit;
import de.cau.cs.kieler.simpleCircuit.Link;
import de.cau.cs.kieler.simpleCircuit.Port;
import de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getInnerCircuits <em>Inner Circuits</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getInnerLinks <em>Inner Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.impl.CircuitImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends MinimalEObjectImpl.Container implements Circuit {
	/**
	 * The cached value of the '{@link #getInnerCircuits() <em>Inner Circuits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerCircuits()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> innerCircuits;

	/**
	 * The cached value of the '{@link #getInnerLinks() <em>Inner Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> innerLinks;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
		return SimpleCircuitPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circuit> getInnerCircuits() {
		if (innerCircuits == null) {
			innerCircuits = new EObjectContainmentWithInverseEList<Circuit>(Circuit.class, this, SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS, SimpleCircuitPackage.CIRCUIT__PARENT);
		}
		return innerCircuits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getInnerLinks() {
		if (innerLinks == null) {
			innerLinks = new EObjectContainmentWithInverseEList<Link>(Link.class, this, SimpleCircuitPackage.CIRCUIT__INNER_LINKS, SimpleCircuitPackage.LINK__PARENT);
		}
		return innerLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, SimpleCircuitPackage.CIRCUIT__PORTS, SimpleCircuitPackage.PORT__PARENT);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCircuitPackage.CIRCUIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCircuitPackage.CIRCUIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getParent() {
		if (eContainerFeatureID() != SimpleCircuitPackage.CIRCUIT__PARENT) return null;
		return (Circuit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Circuit newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SimpleCircuitPackage.CIRCUIT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Circuit newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SimpleCircuitPackage.CIRCUIT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS, Circuit.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCircuitPackage.CIRCUIT__PARENT, newParent, newParent));
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerCircuits()).basicAdd(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerLinks()).basicAdd(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Circuit)otherEnd, msgs);
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				return ((InternalEList<?>)getInnerCircuits()).basicRemove(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				return ((InternalEList<?>)getInnerLinks()).basicRemove(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				return basicSetParent(null, msgs);
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
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				return eInternalContainer().eInverseRemove(this, SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS, Circuit.class, msgs);
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				return getInnerCircuits();
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				return getInnerLinks();
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				return getPorts();
			case SimpleCircuitPackage.CIRCUIT__NAME:
				return getName();
			case SimpleCircuitPackage.CIRCUIT__TYPE:
				return getType();
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				return getParent();
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				getInnerCircuits().clear();
				getInnerCircuits().addAll((Collection<? extends Circuit>)newValue);
				return;
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				getInnerLinks().clear();
				getInnerLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case SimpleCircuitPackage.CIRCUIT__NAME:
				setName((String)newValue);
				return;
			case SimpleCircuitPackage.CIRCUIT__TYPE:
				setType((String)newValue);
				return;
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				setParent((Circuit)newValue);
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				getInnerCircuits().clear();
				return;
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				getInnerLinks().clear();
				return;
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				getPorts().clear();
				return;
			case SimpleCircuitPackage.CIRCUIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleCircuitPackage.CIRCUIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				setParent((Circuit)null);
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
			case SimpleCircuitPackage.CIRCUIT__INNER_CIRCUITS:
				return innerCircuits != null && !innerCircuits.isEmpty();
			case SimpleCircuitPackage.CIRCUIT__INNER_LINKS:
				return innerLinks != null && !innerLinks.isEmpty();
			case SimpleCircuitPackage.CIRCUIT__PORTS:
				return ports != null && !ports.isEmpty();
			case SimpleCircuitPackage.CIRCUIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleCircuitPackage.CIRCUIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SimpleCircuitPackage.CIRCUIT__PARENT:
				return getParent() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CircuitImpl
