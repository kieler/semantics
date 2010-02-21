/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl;

import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InOutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.OutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Signals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend;

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
 * An implementation of the model object '<em><b>State Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.StateExtendImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.StateExtendImpl#getInOutputSignals <em>In Output Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.StateExtendImpl#getOutputSignals <em>Output Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.StateExtendImpl#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.StateExtendImpl#getSignals <em>Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateExtendImpl extends MinimalEObjectImpl.Container implements StateExtend
{
  /**
   * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegions()
   * @generated
   * @ordered
   */
  protected EList<RegionSignalDec> regions;

  /**
   * The cached value of the '{@link #getInOutputSignals() <em>In Output Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInOutputSignals()
   * @generated
   * @ordered
   */
  protected EList<InOutputSignals> inOutputSignals;

  /**
   * The cached value of the '{@link #getOutputSignals() <em>Output Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputSignals()
   * @generated
   * @ordered
   */
  protected EList<OutputSignals> outputSignals;

  /**
   * The cached value of the '{@link #getInputSignals() <em>Input Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputSignals()
   * @generated
   * @ordered
   */
  protected EList<InputSignals> inputSignals;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signals> signals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateExtendImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InterfaceDeclPackage.Literals.STATE_EXTEND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RegionSignalDec> getRegions()
  {
    if (regions == null)
    {
      regions = new EObjectContainmentEList<RegionSignalDec>(RegionSignalDec.class, this, InterfaceDeclPackage.STATE_EXTEND__REGIONS);
    }
    return regions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InOutputSignals> getInOutputSignals()
  {
    if (inOutputSignals == null)
    {
      inOutputSignals = new EObjectContainmentEList<InOutputSignals>(InOutputSignals.class, this, InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS);
    }
    return inOutputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputSignals> getOutputSignals()
  {
    if (outputSignals == null)
    {
      outputSignals = new EObjectContainmentEList<OutputSignals>(OutputSignals.class, this, InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS);
    }
    return outputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputSignals> getInputSignals()
  {
    if (inputSignals == null)
    {
      inputSignals = new EObjectContainmentEList<InputSignals>(InputSignals.class, this, InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS);
    }
    return inputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signals> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<Signals>(Signals.class, this, InterfaceDeclPackage.STATE_EXTEND__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InterfaceDeclPackage.STATE_EXTEND__REGIONS:
        return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
      case InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS:
        return ((InternalEList<?>)getInOutputSignals()).basicRemove(otherEnd, msgs);
      case InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS:
        return ((InternalEList<?>)getOutputSignals()).basicRemove(otherEnd, msgs);
      case InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS:
        return ((InternalEList<?>)getInputSignals()).basicRemove(otherEnd, msgs);
      case InterfaceDeclPackage.STATE_EXTEND__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InterfaceDeclPackage.STATE_EXTEND__REGIONS:
        return getRegions();
      case InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS:
        return getInOutputSignals();
      case InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS:
        return getOutputSignals();
      case InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS:
        return getInputSignals();
      case InterfaceDeclPackage.STATE_EXTEND__SIGNALS:
        return getSignals();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InterfaceDeclPackage.STATE_EXTEND__REGIONS:
        getRegions().clear();
        getRegions().addAll((Collection<? extends RegionSignalDec>)newValue);
        return;
      case InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS:
        getInOutputSignals().clear();
        getInOutputSignals().addAll((Collection<? extends InOutputSignals>)newValue);
        return;
      case InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS:
        getOutputSignals().clear();
        getOutputSignals().addAll((Collection<? extends OutputSignals>)newValue);
        return;
      case InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS:
        getInputSignals().clear();
        getInputSignals().addAll((Collection<? extends InputSignals>)newValue);
        return;
      case InterfaceDeclPackage.STATE_EXTEND__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signals>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InterfaceDeclPackage.STATE_EXTEND__REGIONS:
        getRegions().clear();
        return;
      case InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS:
        getInOutputSignals().clear();
        return;
      case InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS:
        getOutputSignals().clear();
        return;
      case InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS:
        getInputSignals().clear();
        return;
      case InterfaceDeclPackage.STATE_EXTEND__SIGNALS:
        getSignals().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InterfaceDeclPackage.STATE_EXTEND__REGIONS:
        return regions != null && !regions.isEmpty();
      case InterfaceDeclPackage.STATE_EXTEND__IN_OUTPUT_SIGNALS:
        return inOutputSignals != null && !inOutputSignals.isEmpty();
      case InterfaceDeclPackage.STATE_EXTEND__OUTPUT_SIGNALS:
        return outputSignals != null && !outputSignals.isEmpty();
      case InterfaceDeclPackage.STATE_EXTEND__INPUT_SIGNALS:
        return inputSignals != null && !inputSignals.isEmpty();
      case InterfaceDeclPackage.STATE_EXTEND__SIGNALS:
        return signals != null && !signals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateExtendImpl
