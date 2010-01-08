/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.Interface;
import de.cau.cs.kieler.quartz.editor.quartz.InterfaceList;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;

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
 * An implementation of the model object '<em><b>Interface List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.InterfaceListImpl#getIntf <em>Intf</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.InterfaceListImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceListImpl extends MinimalEObjectImpl.Container implements InterfaceList
{
  /**
   * The cached value of the '{@link #getIntf() <em>Intf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntf()
   * @generated
   * @ordered
   */
  protected Interface intf;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceListImpl()
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
    return QuartzPackage.Literals.INTERFACE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getIntf()
  {
    return intf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntf(Interface newIntf, NotificationChain msgs)
  {
    Interface oldIntf = intf;
    intf = newIntf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_LIST__INTF, oldIntf, newIntf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntf(Interface newIntf)
  {
    if (newIntf != intf)
    {
      NotificationChain msgs = null;
      if (intf != null)
        msgs = ((InternalEObject)intf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_LIST__INTF, null, msgs);
      if (newIntf != null)
        msgs = ((InternalEObject)newIntf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_LIST__INTF, null, msgs);
      msgs = basicSetIntf(newIntf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_LIST__INTF, newIntf, newIntf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, QuartzPackage.INTERFACE_LIST__INTERFACES);
    }
    return interfaces;
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
      case QuartzPackage.INTERFACE_LIST__INTF:
        return basicSetIntf(null, msgs);
      case QuartzPackage.INTERFACE_LIST__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.INTERFACE_LIST__INTF:
        return getIntf();
      case QuartzPackage.INTERFACE_LIST__INTERFACES:
        return getInterfaces();
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
      case QuartzPackage.INTERFACE_LIST__INTF:
        setIntf((Interface)newValue);
        return;
      case QuartzPackage.INTERFACE_LIST__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
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
      case QuartzPackage.INTERFACE_LIST__INTF:
        setIntf((Interface)null);
        return;
      case QuartzPackage.INTERFACE_LIST__INTERFACES:
        getInterfaces().clear();
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
      case QuartzPackage.INTERFACE_LIST__INTF:
        return intf != null;
      case QuartzPackage.INTERFACE_LIST__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceListImpl
