/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.sim.esi.esi.impl;

import de.cau.cs.kieler.sim.esi.esi.EsiPackage;
import de.cau.cs.kieler.sim.esi.esi.signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sim.esi.esi.impl.signalImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.esi.esi.impl.signalImpl#isValued <em>Valued</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.esi.esi.impl.signalImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class signalImpl extends MinimalEObjectImpl.Container implements signal
{
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
   * The default value of the '{@link #isValued() <em>Valued</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValued()
   * @generated
   * @ordered
   */
  protected static final boolean VALUED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValued() <em>Valued</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValued()
   * @generated
   * @ordered
   */
  protected boolean valued = VALUED_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected signalImpl()
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
    return EsiPackage.Literals.SIGNAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsiPackage.SIGNAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isValued()
  {
    return valued;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValued(boolean newValued)
  {
    boolean oldValued = valued;
    valued = newValued;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsiPackage.SIGNAL__VALUED, oldValued, valued));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsiPackage.SIGNAL__VAL, oldVal, val));
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
      case EsiPackage.SIGNAL__NAME:
        return getName();
      case EsiPackage.SIGNAL__VALUED:
        return isValued();
      case EsiPackage.SIGNAL__VAL:
        return getVal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsiPackage.SIGNAL__NAME:
        setName((String)newValue);
        return;
      case EsiPackage.SIGNAL__VALUED:
        setValued((Boolean)newValue);
        return;
      case EsiPackage.SIGNAL__VAL:
        setVal((String)newValue);
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
      case EsiPackage.SIGNAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EsiPackage.SIGNAL__VALUED:
        setValued(VALUED_EDEFAULT);
        return;
      case EsiPackage.SIGNAL__VAL:
        setVal(VAL_EDEFAULT);
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
      case EsiPackage.SIGNAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EsiPackage.SIGNAL__VALUED:
        return valued != VALUED_EDEFAULT;
      case EsiPackage.SIGNAL__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", valued: ");
    result.append(valued);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //signalImpl
