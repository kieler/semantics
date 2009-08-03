/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected String entryAction = ENTRY_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getExit() <em>Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected static final String EXIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected String exit = EXIT_EDEFAULT;

  /**
   * The default value of the '{@link #getInner() <em>Inner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInner()
   * @generated
   * @ordered
   */
  protected static final String INNER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInner() <em>Inner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInner()
   * @generated
   * @ordered
   */
  protected String inner = INNER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return RetypingSyncchartsPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryAction()
  {
    return entryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryAction(String newEntryAction)
  {
    String oldEntryAction = entryAction;
    entryAction = newEntryAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__ENTRY_ACTION, oldEntryAction, entryAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExit(String newExit)
  {
    String oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__EXIT, oldExit, exit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInner()
  {
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInner(String newInner)
  {
    String oldInner = inner;
    inner = newInner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__INNER, oldInner, inner));
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        return getEntryAction();
      case RetypingSyncchartsPackage.ACTION__EXIT:
        return getExit();
      case RetypingSyncchartsPackage.ACTION__INNER:
        return getInner();
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        setEntryAction((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__EXIT:
        setExit((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__INNER:
        setInner((String)newValue);
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        setEntryAction(ENTRY_ACTION_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__EXIT:
        setExit(EXIT_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__INNER:
        setInner(INNER_EDEFAULT);
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        return ENTRY_ACTION_EDEFAULT == null ? entryAction != null : !ENTRY_ACTION_EDEFAULT.equals(entryAction);
      case RetypingSyncchartsPackage.ACTION__EXIT:
        return EXIT_EDEFAULT == null ? exit != null : !EXIT_EDEFAULT.equals(exit);
      case RetypingSyncchartsPackage.ACTION__INNER:
        return INNER_EDEFAULT == null ? inner != null : !INNER_EDEFAULT.equals(inner);
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
    result.append(" (entryAction: ");
    result.append(entryAction);
    result.append(", exit: ");
    result.append(exit);
    result.append(", inner: ");
    result.append(inner);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
