/**
 */
package de.cau.cs.kieler.circuit.impl;

import de.cau.cs.kieler.circuit.CircuitPackage;
import de.cau.cs.kieler.circuit.Node;
import de.cau.cs.kieler.circuit.Port;

import de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.NodeImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.NodeImpl#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends NamedObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> outputPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectResolvingEList<Port>(Port.class, this, CircuitPackage.NODE__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectResolvingEList<Port>(Port.class, this, CircuitPackage.NODE__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuitPackage.NODE__INPUT_PORTS:
				return getInputPorts();
			case CircuitPackage.NODE__OUTPUT_PORTS:
				return getOutputPorts();
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
			case CircuitPackage.NODE__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case CircuitPackage.NODE__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends Port>)newValue);
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
			case CircuitPackage.NODE__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case CircuitPackage.NODE__OUTPUT_PORTS:
				getOutputPorts().clear();
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
			case CircuitPackage.NODE__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case CircuitPackage.NODE__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
