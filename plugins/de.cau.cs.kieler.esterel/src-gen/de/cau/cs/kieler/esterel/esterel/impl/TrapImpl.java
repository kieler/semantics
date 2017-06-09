/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.Trap;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;

import de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapImpl#getTrapSignals <em>Trap Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapImpl#getTrapHandler <em>Trap Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrapImpl extends StatementContainerImpl implements Trap
{
  /**
   * The cached value of the '{@link #getTrapSignals() <em>Trap Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapSignals()
   * @generated
   * @ordered
   */
  protected EList<ISignal> trapSignals;

  /**
   * The cached value of the '{@link #getTrapHandler() <em>Trap Handler</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapHandler()
   * @generated
   * @ordered
   */
  protected EList<TrapHandler> trapHandler;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrapImpl()
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
    return EsterelPackage.Literals.TRAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ISignal> getTrapSignals()
  {
    if (trapSignals == null)
    {
      trapSignals = new EObjectContainmentEList<ISignal>(ISignal.class, this, EsterelPackage.TRAP__TRAP_SIGNALS);
    }
    return trapSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrapHandler> getTrapHandler()
  {
    if (trapHandler == null)
    {
      trapHandler = new EObjectContainmentEList<TrapHandler>(TrapHandler.class, this, EsterelPackage.TRAP__TRAP_HANDLER);
    }
    return trapHandler;
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
      case EsterelPackage.TRAP__TRAP_SIGNALS:
        return ((InternalEList<?>)getTrapSignals()).basicRemove(otherEnd, msgs);
      case EsterelPackage.TRAP__TRAP_HANDLER:
        return ((InternalEList<?>)getTrapHandler()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.TRAP__TRAP_SIGNALS:
        return getTrapSignals();
      case EsterelPackage.TRAP__TRAP_HANDLER:
        return getTrapHandler();
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
      case EsterelPackage.TRAP__TRAP_SIGNALS:
        getTrapSignals().clear();
        getTrapSignals().addAll((Collection<? extends ISignal>)newValue);
        return;
      case EsterelPackage.TRAP__TRAP_HANDLER:
        getTrapHandler().clear();
        getTrapHandler().addAll((Collection<? extends TrapHandler>)newValue);
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
      case EsterelPackage.TRAP__TRAP_SIGNALS:
        getTrapSignals().clear();
        return;
      case EsterelPackage.TRAP__TRAP_HANDLER:
        getTrapHandler().clear();
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
      case EsterelPackage.TRAP__TRAP_SIGNALS:
        return trapSignals != null && !trapSignals.isEmpty();
      case EsterelPackage.TRAP__TRAP_HANDLER:
        return trapHandler != null && !trapHandler.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrapImpl
