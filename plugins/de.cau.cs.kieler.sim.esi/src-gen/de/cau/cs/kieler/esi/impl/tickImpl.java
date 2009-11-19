/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esi.impl;

import de.cau.cs.kieler.esi.EsiPackage;
import de.cau.cs.kieler.esi.signal;
import de.cau.cs.kieler.esi.tick;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esi.impl.tickImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esi.impl.tickImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esi.impl.tickImpl#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class tickImpl extends MinimalEObjectImpl.Container implements tick
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected EList<signal> input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected EList<signal> output;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final String N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected String n = N_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected tickImpl()
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
    return EsiPackage.Literals.TICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<signal> getInput()
  {
    if (input == null)
    {
      input = new EObjectContainmentEList<signal>(signal.class, this, EsiPackage.TICK__INPUT);
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<signal> getOutput()
  {
    if (output == null)
    {
      output = new EObjectContainmentEList<signal>(signal.class, this, EsiPackage.TICK__OUTPUT);
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(String newN)
  {
    String oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsiPackage.TICK__N, oldN, n));
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
      case EsiPackage.TICK__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case EsiPackage.TICK__OUTPUT:
        return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
      case EsiPackage.TICK__INPUT:
        return getInput();
      case EsiPackage.TICK__OUTPUT:
        return getOutput();
      case EsiPackage.TICK__N:
        return getN();
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
      case EsiPackage.TICK__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends signal>)newValue);
        return;
      case EsiPackage.TICK__OUTPUT:
        getOutput().clear();
        getOutput().addAll((Collection<? extends signal>)newValue);
        return;
      case EsiPackage.TICK__N:
        setN((String)newValue);
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
      case EsiPackage.TICK__INPUT:
        getInput().clear();
        return;
      case EsiPackage.TICK__OUTPUT:
        getOutput().clear();
        return;
      case EsiPackage.TICK__N:
        setN(N_EDEFAULT);
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
      case EsiPackage.TICK__INPUT:
        return input != null && !input.isEmpty();
      case EsiPackage.TICK__OUTPUT:
        return output != null && !output.isEmpty();
      case EsiPackage.TICK__N:
        return N_EDEFAULT == null ? n != null : !N_EDEFAULT.equals(n);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //tickImpl
