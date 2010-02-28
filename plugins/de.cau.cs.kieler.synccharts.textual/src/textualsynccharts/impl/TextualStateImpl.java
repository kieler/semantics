/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts.impl;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.impl.StateImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import textualsynccharts.TextualState;
import textualsynccharts.TextualsyncchartsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualsynccharts.impl.TextualStateImpl#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link textualsynccharts.impl.TextualStateImpl#getOutputSignals <em>Output Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualStateImpl extends StateImpl implements TextualState {
    /**
	 * The cached value of the '{@link #getInputSignals() <em>Input Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> inputSignals;
	/**
	 * The cached value of the '{@link #getOutputSignals() <em>Output Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> outputSignals;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected TextualStateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TextualsyncchartsPackage.Literals.TEXTUAL_STATE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getInputSignals() {
		if (inputSignals == null) {
			inputSignals = new EObjectContainmentEList<Signal>(Signal.class, this, TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS);
		}
		return inputSignals;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getOutputSignals() {
		if (outputSignals == null) {
			outputSignals = new EObjectContainmentEList<Signal>(Signal.class, this, TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS);
		}
		return outputSignals;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS:
				return ((InternalEList<?>)getInputSignals()).basicRemove(otherEnd, msgs);
			case TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS:
				return ((InternalEList<?>)getOutputSignals()).basicRemove(otherEnd, msgs);
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
			case TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS:
				return getInputSignals();
			case TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS:
				return getOutputSignals();
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
			case TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS:
				getInputSignals().clear();
				getInputSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS:
				getOutputSignals().clear();
				getOutputSignals().addAll((Collection<? extends Signal>)newValue);
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
			case TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS:
				getInputSignals().clear();
				return;
			case TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS:
				getOutputSignals().clear();
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
			case TextualsyncchartsPackage.TEXTUAL_STATE__INPUT_SIGNALS:
				return inputSignals != null && !inputSignals.isEmpty();
			case TextualsyncchartsPackage.TEXTUAL_STATE__OUTPUT_SIGNALS:
				return outputSignals != null && !outputSignals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextualStateImpl
