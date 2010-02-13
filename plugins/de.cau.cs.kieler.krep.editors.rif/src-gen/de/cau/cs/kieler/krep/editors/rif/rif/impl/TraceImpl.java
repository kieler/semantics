/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif.impl;

import de.cau.cs.kieler.krep.editors.rif.rif.RifPackage;
import de.cau.cs.kieler.krep.editors.rif.rif.Tick;
import de.cau.cs.kieler.krep.editors.rif.rif.Trace;
import de.cau.cs.kieler.krep.editors.rif.rif.decl;

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
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl#getTick <em>Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace
{
  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<decl> inputs;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<decl> outputs;

  /**
   * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocal()
   * @generated
   * @ordered
   */
  protected EList<decl> local;

  /**
   * The cached value of the '{@link #getTick() <em>Tick</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected EList<Tick> tick;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceImpl()
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
    return RifPackage.Literals.TRACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<decl> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<decl>(decl.class, this, RifPackage.TRACE__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<decl> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectContainmentEList<decl>(decl.class, this, RifPackage.TRACE__OUTPUTS);
    }
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<decl> getLocal()
  {
    if (local == null)
    {
      local = new EObjectContainmentEList<decl>(decl.class, this, RifPackage.TRACE__LOCAL);
    }
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tick> getTick()
  {
    if (tick == null)
    {
      tick = new EObjectContainmentEList<Tick>(Tick.class, this, RifPackage.TRACE__TICK);
    }
    return tick;
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
      case RifPackage.TRACE__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case RifPackage.TRACE__OUTPUTS:
        return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
      case RifPackage.TRACE__LOCAL:
        return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
      case RifPackage.TRACE__TICK:
        return ((InternalEList<?>)getTick()).basicRemove(otherEnd, msgs);
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
      case RifPackage.TRACE__INPUTS:
        return getInputs();
      case RifPackage.TRACE__OUTPUTS:
        return getOutputs();
      case RifPackage.TRACE__LOCAL:
        return getLocal();
      case RifPackage.TRACE__TICK:
        return getTick();
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
      case RifPackage.TRACE__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends decl>)newValue);
        return;
      case RifPackage.TRACE__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends decl>)newValue);
        return;
      case RifPackage.TRACE__LOCAL:
        getLocal().clear();
        getLocal().addAll((Collection<? extends decl>)newValue);
        return;
      case RifPackage.TRACE__TICK:
        getTick().clear();
        getTick().addAll((Collection<? extends Tick>)newValue);
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
      case RifPackage.TRACE__INPUTS:
        getInputs().clear();
        return;
      case RifPackage.TRACE__OUTPUTS:
        getOutputs().clear();
        return;
      case RifPackage.TRACE__LOCAL:
        getLocal().clear();
        return;
      case RifPackage.TRACE__TICK:
        getTick().clear();
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
      case RifPackage.TRACE__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case RifPackage.TRACE__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
      case RifPackage.TRACE__LOCAL:
        return local != null && !local.isEmpty();
      case RifPackage.TRACE__TICK:
        return tick != null && !tick.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TraceImpl
