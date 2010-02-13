/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif.impl;

import de.cau.cs.kieler.krep.editors.rif.rif.Data;
import de.cau.cs.kieler.krep.editors.rif.rif.RifPackage;
import de.cau.cs.kieler.krep.editors.rif.rif.Tick;

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
 * An implementation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl#getLocal <em>Local</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TickImpl extends MinimalEObjectImpl.Container implements Tick
{
  /**
   * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNr()
   * @generated
   * @ordered
   */
  protected static final int NR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNr()
   * @generated
   * @ordered
   */
  protected int nr = NR_EDEFAULT;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected EList<Data> input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected EList<Data> output;

  /**
   * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocal()
   * @generated
   * @ordered
   */
  protected EList<Data> local;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TickImpl()
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
    return RifPackage.Literals.TICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNr()
  {
    return nr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNr(int newNr)
  {
    int oldNr = nr;
    nr = newNr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.TICK__NR, oldNr, nr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data> getInput()
  {
    if (input == null)
    {
      input = new EObjectContainmentEList<Data>(Data.class, this, RifPackage.TICK__INPUT);
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data> getOutput()
  {
    if (output == null)
    {
      output = new EObjectContainmentEList<Data>(Data.class, this, RifPackage.TICK__OUTPUT);
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data> getLocal()
  {
    if (local == null)
    {
      local = new EObjectContainmentEList<Data>(Data.class, this, RifPackage.TICK__LOCAL);
    }
    return local;
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
      case RifPackage.TICK__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case RifPackage.TICK__OUTPUT:
        return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
      case RifPackage.TICK__LOCAL:
        return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
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
      case RifPackage.TICK__NR:
        return getNr();
      case RifPackage.TICK__INPUT:
        return getInput();
      case RifPackage.TICK__OUTPUT:
        return getOutput();
      case RifPackage.TICK__LOCAL:
        return getLocal();
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
      case RifPackage.TICK__NR:
        setNr((Integer)newValue);
        return;
      case RifPackage.TICK__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends Data>)newValue);
        return;
      case RifPackage.TICK__OUTPUT:
        getOutput().clear();
        getOutput().addAll((Collection<? extends Data>)newValue);
        return;
      case RifPackage.TICK__LOCAL:
        getLocal().clear();
        getLocal().addAll((Collection<? extends Data>)newValue);
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
      case RifPackage.TICK__NR:
        setNr(NR_EDEFAULT);
        return;
      case RifPackage.TICK__INPUT:
        getInput().clear();
        return;
      case RifPackage.TICK__OUTPUT:
        getOutput().clear();
        return;
      case RifPackage.TICK__LOCAL:
        getLocal().clear();
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
      case RifPackage.TICK__NR:
        return nr != NR_EDEFAULT;
      case RifPackage.TICK__INPUT:
        return input != null && !input.isEmpty();
      case RifPackage.TICK__OUTPUT:
        return output != null && !output.isEmpty();
      case RifPackage.TICK__LOCAL:
        return local != null && !local.isEmpty();
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
    result.append(" (nr: ");
    result.append(nr);
    result.append(')');
    return result.toString();
  }

} //TickImpl
