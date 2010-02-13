/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif.impl;

import de.cau.cs.kieler.krep.editors.rif.rif.Data;
import de.cau.cs.kieler.krep.editors.rif.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl#isTrue <em>True</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl#isFalse <em>False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data
{
  /**
   * The default value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected static final int INT_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected int intVal = INT_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected static final boolean TRUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected boolean true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #isFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFalse()
   * @generated
   * @ordered
   */
  protected static final boolean FALSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFalse()
   * @generated
   * @ordered
   */
  protected boolean false_ = FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataImpl()
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
    return RifPackage.Literals.DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntVal()
  {
    return intVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntVal(int newIntVal)
  {
    int oldIntVal = intVal;
    intVal = newIntVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATA__INT_VAL, oldIntVal, intVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(boolean newTrue)
  {
    boolean oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATA__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(boolean newFalse)
  {
    boolean oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATA__FALSE, oldFalse, false_));
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
      case RifPackage.DATA__INT_VAL:
        return getIntVal();
      case RifPackage.DATA__TRUE:
        return isTrue();
      case RifPackage.DATA__FALSE:
        return isFalse();
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
      case RifPackage.DATA__INT_VAL:
        setIntVal((Integer)newValue);
        return;
      case RifPackage.DATA__TRUE:
        setTrue((Boolean)newValue);
        return;
      case RifPackage.DATA__FALSE:
        setFalse((Boolean)newValue);
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
      case RifPackage.DATA__INT_VAL:
        setIntVal(INT_VAL_EDEFAULT);
        return;
      case RifPackage.DATA__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case RifPackage.DATA__FALSE:
        setFalse(FALSE_EDEFAULT);
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
      case RifPackage.DATA__INT_VAL:
        return intVal != INT_VAL_EDEFAULT;
      case RifPackage.DATA__TRUE:
        return true_ != TRUE_EDEFAULT;
      case RifPackage.DATA__FALSE:
        return false_ != FALSE_EDEFAULT;
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
    result.append(" (intVal: ");
    result.append(intVal);
    result.append(", true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(')');
    return result.toString();
  }

} //DataImpl
