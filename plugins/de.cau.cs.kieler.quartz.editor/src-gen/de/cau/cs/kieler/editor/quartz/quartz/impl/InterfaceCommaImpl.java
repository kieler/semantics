/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma;
import de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma;
import de.cau.cs.kieler.editor.quartz.quartz.QType;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Comma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InterfaceCommaImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceCommaImpl extends MinimalEObjectImpl.Container implements InterfaceComma
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QType type;

  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected InOutNameListComma names;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceCommaImpl()
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
    return QuartzPackage.Literals.INTERFACE_COMMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(QType newType, NotificationChain msgs)
  {
    QType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_COMMA__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_COMMA__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_COMMA__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_COMMA__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutNameListComma getNames()
  {
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNames(InOutNameListComma newNames, NotificationChain msgs)
  {
    InOutNameListComma oldNames = names;
    names = newNames;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_COMMA__NAMES, oldNames, newNames);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNames(InOutNameListComma newNames)
  {
    if (newNames != names)
    {
      NotificationChain msgs = null;
      if (names != null)
        msgs = ((InternalEObject)names).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_COMMA__NAMES, null, msgs);
      if (newNames != null)
        msgs = ((InternalEObject)newNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.INTERFACE_COMMA__NAMES, null, msgs);
      msgs = basicSetNames(newNames, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.INTERFACE_COMMA__NAMES, newNames, newNames));
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
      case QuartzPackage.INTERFACE_COMMA__TYPE:
        return basicSetType(null, msgs);
      case QuartzPackage.INTERFACE_COMMA__NAMES:
        return basicSetNames(null, msgs);
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
      case QuartzPackage.INTERFACE_COMMA__TYPE:
        return getType();
      case QuartzPackage.INTERFACE_COMMA__NAMES:
        return getNames();
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
      case QuartzPackage.INTERFACE_COMMA__TYPE:
        setType((QType)newValue);
        return;
      case QuartzPackage.INTERFACE_COMMA__NAMES:
        setNames((InOutNameListComma)newValue);
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
      case QuartzPackage.INTERFACE_COMMA__TYPE:
        setType((QType)null);
        return;
      case QuartzPackage.INTERFACE_COMMA__NAMES:
        setNames((InOutNameListComma)null);
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
      case QuartzPackage.INTERFACE_COMMA__TYPE:
        return type != null;
      case QuartzPackage.INTERFACE_COMMA__NAMES:
        return names != null;
    }
    return super.eIsSet(featureID);
  }

} //InterfaceCommaImpl
