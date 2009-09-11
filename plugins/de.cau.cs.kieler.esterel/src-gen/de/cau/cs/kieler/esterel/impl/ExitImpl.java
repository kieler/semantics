/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Exit;
import de.cau.cs.kieler.esterel.Trap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExitImpl#getTrap <em>Trap</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExitImpl#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitImpl extends StatementImpl implements Exit
{
  /**
   * The cached value of the '{@link #getTrap() <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrap()
   * @generated
   * @ordered
   */
  protected Trap trap;

  /**
   * The cached value of the '{@link #getDataExpr() <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataExpr()
   * @generated
   * @ordered
   */
  protected DataExpr dataExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExitImpl()
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
    return EsterelPackage.Literals.EXIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trap getTrap()
  {
    if (trap != null && trap.eIsProxy())
    {
      InternalEObject oldTrap = (InternalEObject)trap;
      trap = (Trap)eResolveProxy(oldTrap);
      if (trap != oldTrap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXIT__TRAP, oldTrap, trap));
      }
    }
    return trap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trap basicGetTrap()
  {
    return trap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrap(Trap newTrap)
  {
    Trap oldTrap = trap;
    trap = newTrap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXIT__TRAP, oldTrap, trap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr getDataExpr()
  {
    return dataExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataExpr(DataExpr newDataExpr, NotificationChain msgs)
  {
    DataExpr oldDataExpr = dataExpr;
    dataExpr = newDataExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.EXIT__DATA_EXPR, oldDataExpr, newDataExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataExpr(DataExpr newDataExpr)
  {
    if (newDataExpr != dataExpr)
    {
      NotificationChain msgs = null;
      if (dataExpr != null)
        msgs = ((InternalEObject)dataExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXIT__DATA_EXPR, null, msgs);
      if (newDataExpr != null)
        msgs = ((InternalEObject)newDataExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXIT__DATA_EXPR, null, msgs);
      msgs = basicSetDataExpr(newDataExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXIT__DATA_EXPR, newDataExpr, newDataExpr));
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
      case EsterelPackage.EXIT__DATA_EXPR:
        return basicSetDataExpr(null, msgs);
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
      case EsterelPackage.EXIT__TRAP:
        if (resolve) return getTrap();
        return basicGetTrap();
      case EsterelPackage.EXIT__DATA_EXPR:
        return getDataExpr();
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
      case EsterelPackage.EXIT__TRAP:
        setTrap((Trap)newValue);
        return;
      case EsterelPackage.EXIT__DATA_EXPR:
        setDataExpr((DataExpr)newValue);
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
      case EsterelPackage.EXIT__TRAP:
        setTrap((Trap)null);
        return;
      case EsterelPackage.EXIT__DATA_EXPR:
        setDataExpr((DataExpr)null);
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
      case EsterelPackage.EXIT__TRAP:
        return trap != null;
      case EsterelPackage.EXIT__DATA_EXPR:
        return dataExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExitImpl
