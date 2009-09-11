/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.ChannelDescription;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.TrapDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TrapDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TrapDeclImpl#getChannelDesc <em>Channel Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrapDeclImpl extends MinimalEObjectImpl.Container implements TrapDecl
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
   * The cached value of the '{@link #getChannelDesc() <em>Channel Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannelDesc()
   * @generated
   * @ordered
   */
  protected ChannelDescription channelDesc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrapDeclImpl()
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
    return EsterelPackage.Literals.TRAP_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDescription getChannelDesc()
  {
    return channelDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChannelDesc(ChannelDescription newChannelDesc, NotificationChain msgs)
  {
    ChannelDescription oldChannelDesc = channelDesc;
    channelDesc = newChannelDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_DECL__CHANNEL_DESC, oldChannelDesc, newChannelDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannelDesc(ChannelDescription newChannelDesc)
  {
    if (newChannelDesc != channelDesc)
    {
      NotificationChain msgs = null;
      if (channelDesc != null)
        msgs = ((InternalEObject)channelDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_DECL__CHANNEL_DESC, null, msgs);
      if (newChannelDesc != null)
        msgs = ((InternalEObject)newChannelDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_DECL__CHANNEL_DESC, null, msgs);
      msgs = basicSetChannelDesc(newChannelDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_DECL__CHANNEL_DESC, newChannelDesc, newChannelDesc));
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
      case EsterelPackage.TRAP_DECL__CHANNEL_DESC:
        return basicSetChannelDesc(null, msgs);
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
      case EsterelPackage.TRAP_DECL__NAME:
        return getName();
      case EsterelPackage.TRAP_DECL__CHANNEL_DESC:
        return getChannelDesc();
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
      case EsterelPackage.TRAP_DECL__NAME:
        setName((String)newValue);
        return;
      case EsterelPackage.TRAP_DECL__CHANNEL_DESC:
        setChannelDesc((ChannelDescription)newValue);
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
      case EsterelPackage.TRAP_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EsterelPackage.TRAP_DECL__CHANNEL_DESC:
        setChannelDesc((ChannelDescription)null);
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
      case EsterelPackage.TRAP_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EsterelPackage.TRAP_DECL__CHANNEL_DESC:
        return channelDesc != null;
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
    result.append(')');
    return result.toString();
  }

} //TrapDeclImpl
