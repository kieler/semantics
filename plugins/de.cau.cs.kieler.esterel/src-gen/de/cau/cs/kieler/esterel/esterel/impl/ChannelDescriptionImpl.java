/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.ChannelDescription;
import de.cau.cs.kieler.esterel.esterel.ChannelType;
import de.cau.cs.kieler.esterel.esterel.DataExpr;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ChannelDescriptionImpl#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelDescriptionImpl extends MinimalEObjectImpl.Container implements ChannelDescription
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ChannelType type;

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
  protected ChannelDescriptionImpl()
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
    return EsterelPackage.Literals.CHANNEL_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ChannelType newType, NotificationChain msgs)
  {
    ChannelType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.CHANNEL_DESCRIPTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ChannelType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CHANNEL_DESCRIPTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CHANNEL_DESCRIPTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CHANNEL_DESCRIPTION__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR, oldDataExpr, newDataExpr);
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
        msgs = ((InternalEObject)dataExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR, null, msgs);
      if (newDataExpr != null)
        msgs = ((InternalEObject)newDataExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR, null, msgs);
      msgs = basicSetDataExpr(newDataExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR, newDataExpr, newDataExpr));
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
      case EsterelPackage.CHANNEL_DESCRIPTION__TYPE:
        return basicSetType(null, msgs);
      case EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR:
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
      case EsterelPackage.CHANNEL_DESCRIPTION__TYPE:
        return getType();
      case EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR:
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
      case EsterelPackage.CHANNEL_DESCRIPTION__TYPE:
        setType((ChannelType)newValue);
        return;
      case EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR:
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
      case EsterelPackage.CHANNEL_DESCRIPTION__TYPE:
        setType((ChannelType)null);
        return;
      case EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR:
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
      case EsterelPackage.CHANNEL_DESCRIPTION__TYPE:
        return type != null;
      case EsterelPackage.CHANNEL_DESCRIPTION__DATA_EXPR:
        return dataExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ChannelDescriptionImpl
