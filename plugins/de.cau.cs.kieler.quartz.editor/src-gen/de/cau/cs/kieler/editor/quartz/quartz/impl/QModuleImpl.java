/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.InterfaceList;
import de.cau.cs.kieler.editor.quartz.quartz.LocStmt;
import de.cau.cs.kieler.editor.quartz.quartz.Name;
import de.cau.cs.kieler.editor.quartz.quartz.ObservedSpecList;
import de.cau.cs.kieler.editor.quartz.quartz.QModule;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;

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
 * An implementation of the model object '<em><b>QModule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl#getIntf <em>Intf</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QModuleImpl#getObs <em>Obs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QModuleImpl extends MinimalEObjectImpl.Container implements QModule
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The cached value of the '{@link #getIntf() <em>Intf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntf()
   * @generated
   * @ordered
   */
  protected InterfaceList intf;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected LocStmt stmt;

  /**
   * The cached value of the '{@link #getObs() <em>Obs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObs()
   * @generated
   * @ordered
   */
  protected EList<ObservedSpecList> obs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QModuleImpl()
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
    return QuartzPackage.Literals.QMODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceList getIntf()
  {
    return intf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntf(InterfaceList newIntf, NotificationChain msgs)
  {
    InterfaceList oldIntf = intf;
    intf = newIntf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__INTF, oldIntf, newIntf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntf(InterfaceList newIntf)
  {
    if (newIntf != intf)
    {
      NotificationChain msgs = null;
      if (intf != null)
        msgs = ((InternalEObject)intf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__INTF, null, msgs);
      if (newIntf != null)
        msgs = ((InternalEObject)newIntf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__INTF, null, msgs);
      msgs = basicSetIntf(newIntf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__INTF, newIntf, newIntf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocStmt getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(LocStmt newStmt, NotificationChain msgs)
  {
    LocStmt oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(LocStmt newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QMODULE__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QMODULE__STMT, newStmt, newStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObservedSpecList> getObs()
  {
    if (obs == null)
    {
      obs = new EObjectContainmentEList<ObservedSpecList>(ObservedSpecList.class, this, QuartzPackage.QMODULE__OBS);
    }
    return obs;
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
      case QuartzPackage.QMODULE__NAME:
        return basicSetName(null, msgs);
      case QuartzPackage.QMODULE__INTF:
        return basicSetIntf(null, msgs);
      case QuartzPackage.QMODULE__STMT:
        return basicSetStmt(null, msgs);
      case QuartzPackage.QMODULE__OBS:
        return ((InternalEList<?>)getObs()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.QMODULE__NAME:
        return getName();
      case QuartzPackage.QMODULE__INTF:
        return getIntf();
      case QuartzPackage.QMODULE__STMT:
        return getStmt();
      case QuartzPackage.QMODULE__OBS:
        return getObs();
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
      case QuartzPackage.QMODULE__NAME:
        setName((Name)newValue);
        return;
      case QuartzPackage.QMODULE__INTF:
        setIntf((InterfaceList)newValue);
        return;
      case QuartzPackage.QMODULE__STMT:
        setStmt((LocStmt)newValue);
        return;
      case QuartzPackage.QMODULE__OBS:
        getObs().clear();
        getObs().addAll((Collection<? extends ObservedSpecList>)newValue);
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
      case QuartzPackage.QMODULE__NAME:
        setName((Name)null);
        return;
      case QuartzPackage.QMODULE__INTF:
        setIntf((InterfaceList)null);
        return;
      case QuartzPackage.QMODULE__STMT:
        setStmt((LocStmt)null);
        return;
      case QuartzPackage.QMODULE__OBS:
        getObs().clear();
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
      case QuartzPackage.QMODULE__NAME:
        return name != null;
      case QuartzPackage.QMODULE__INTF:
        return intf != null;
      case QuartzPackage.QMODULE__STMT:
        return stmt != null;
      case QuartzPackage.QMODULE__OBS:
        return obs != null && !obs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QModuleImpl
