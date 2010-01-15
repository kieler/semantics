/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt;
import de.cau.cs.kieler.quartz.editor.quartz.Generic;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.GenericImpl#getT23 <em>T23</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.GenericImpl#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericImpl extends UtyExprImpl implements Generic
{
  /**
   * The cached value of the '{@link #getT23() <em>T23</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT23()
   * @generated
   * @ordered
   */
  protected AtomicStmt t23;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected AtomicStmt t;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericImpl()
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
    return QuartzPackage.Literals.GENERIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt getT23()
  {
    return t23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT23(AtomicStmt newT23, NotificationChain msgs)
  {
    AtomicStmt oldT23 = t23;
    t23 = newT23;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.GENERIC__T23, oldT23, newT23);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT23(AtomicStmt newT23)
  {
    if (newT23 != t23)
    {
      NotificationChain msgs = null;
      if (t23 != null)
        msgs = ((InternalEObject)t23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.GENERIC__T23, null, msgs);
      if (newT23 != null)
        msgs = ((InternalEObject)newT23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.GENERIC__T23, null, msgs);
      msgs = basicSetT23(newT23, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.GENERIC__T23, newT23, newT23));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(AtomicStmt newT, NotificationChain msgs)
  {
    AtomicStmt oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.GENERIC__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(AtomicStmt newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.GENERIC__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.GENERIC__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.GENERIC__T, newT, newT));
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
      case QuartzPackage.GENERIC__T23:
        return basicSetT23(null, msgs);
      case QuartzPackage.GENERIC__T:
        return basicSetT(null, msgs);
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
      case QuartzPackage.GENERIC__T23:
        return getT23();
      case QuartzPackage.GENERIC__T:
        return getT();
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
      case QuartzPackage.GENERIC__T23:
        setT23((AtomicStmt)newValue);
        return;
      case QuartzPackage.GENERIC__T:
        setT((AtomicStmt)newValue);
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
      case QuartzPackage.GENERIC__T23:
        setT23((AtomicStmt)null);
        return;
      case QuartzPackage.GENERIC__T:
        setT((AtomicStmt)null);
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
      case QuartzPackage.GENERIC__T23:
        return t23 != null;
      case QuartzPackage.GENERIC__T:
        return t != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericImpl
