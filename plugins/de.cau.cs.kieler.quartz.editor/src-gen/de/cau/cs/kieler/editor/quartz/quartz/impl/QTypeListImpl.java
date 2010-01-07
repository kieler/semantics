/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.QType;
import de.cau.cs.kieler.editor.quartz.quartz.QTypeList;
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
 * An implementation of the model object '<em><b>QType List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeListImpl#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QTypeListImpl extends MinimalEObjectImpl.Container implements QTypeList
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
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected EList<QType> t;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QTypeListImpl()
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
    return QuartzPackage.Literals.QTYPE_LIST;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE_LIST__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE_LIST__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE_LIST__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE_LIST__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QType> getT()
  {
    if (t == null)
    {
      t = new EObjectContainmentEList<QType>(QType.class, this, QuartzPackage.QTYPE_LIST__T);
    }
    return t;
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
      case QuartzPackage.QTYPE_LIST__TYPE:
        return basicSetType(null, msgs);
      case QuartzPackage.QTYPE_LIST__T:
        return ((InternalEList<?>)getT()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.QTYPE_LIST__TYPE:
        return getType();
      case QuartzPackage.QTYPE_LIST__T:
        return getT();
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
      case QuartzPackage.QTYPE_LIST__TYPE:
        setType((QType)newValue);
        return;
      case QuartzPackage.QTYPE_LIST__T:
        getT().clear();
        getT().addAll((Collection<? extends QType>)newValue);
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
      case QuartzPackage.QTYPE_LIST__TYPE:
        setType((QType)null);
        return;
      case QuartzPackage.QTYPE_LIST__T:
        getT().clear();
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
      case QuartzPackage.QTYPE_LIST__TYPE:
        return type != null;
      case QuartzPackage.QTYPE_LIST__T:
        return t != null && !t.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QTypeListImpl
