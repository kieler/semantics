/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.DimList;
import de.cau.cs.kieler.editor.quartz.quartz.QType;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.UtyExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QTypeImpl#getDims <em>Dims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QTypeImpl extends MinimalEObjectImpl.Container implements QType
{
  /**
   * The cached value of the '{@link #getTa() <em>Ta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTa()
   * @generated
   * @ordered
   */
  protected UtyExpr ta;

  /**
   * The cached value of the '{@link #getTb() <em>Tb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTb()
   * @generated
   * @ordered
   */
  protected UtyExpr tb;

  /**
   * The cached value of the '{@link #getTc() <em>Tc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTc()
   * @generated
   * @ordered
   */
  protected UtyExpr tc;

  /**
   * The cached value of the '{@link #getDims() <em>Dims</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDims()
   * @generated
   * @ordered
   */
  protected DimList dims;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QTypeImpl()
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
    return QuartzPackage.Literals.QTYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getTa()
  {
    return ta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTa(UtyExpr newTa, NotificationChain msgs)
  {
    UtyExpr oldTa = ta;
    ta = newTa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TA, oldTa, newTa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTa(UtyExpr newTa)
  {
    if (newTa != ta)
    {
      NotificationChain msgs = null;
      if (ta != null)
        msgs = ((InternalEObject)ta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TA, null, msgs);
      if (newTa != null)
        msgs = ((InternalEObject)newTa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TA, null, msgs);
      msgs = basicSetTa(newTa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TA, newTa, newTa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getTb()
  {
    return tb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTb(UtyExpr newTb, NotificationChain msgs)
  {
    UtyExpr oldTb = tb;
    tb = newTb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TB, oldTb, newTb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTb(UtyExpr newTb)
  {
    if (newTb != tb)
    {
      NotificationChain msgs = null;
      if (tb != null)
        msgs = ((InternalEObject)tb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TB, null, msgs);
      if (newTb != null)
        msgs = ((InternalEObject)newTb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TB, null, msgs);
      msgs = basicSetTb(newTb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TB, newTb, newTb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getTc()
  {
    return tc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTc(UtyExpr newTc, NotificationChain msgs)
  {
    UtyExpr oldTc = tc;
    tc = newTc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TC, oldTc, newTc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTc(UtyExpr newTc)
  {
    if (newTc != tc)
    {
      NotificationChain msgs = null;
      if (tc != null)
        msgs = ((InternalEObject)tc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TC, null, msgs);
      if (newTc != null)
        msgs = ((InternalEObject)newTc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__TC, null, msgs);
      msgs = basicSetTc(newTc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__TC, newTc, newTc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimList getDims()
  {
    return dims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDims(DimList newDims, NotificationChain msgs)
  {
    DimList oldDims = dims;
    dims = newDims;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__DIMS, oldDims, newDims);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDims(DimList newDims)
  {
    if (newDims != dims)
    {
      NotificationChain msgs = null;
      if (dims != null)
        msgs = ((InternalEObject)dims).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__DIMS, null, msgs);
      if (newDims != null)
        msgs = ((InternalEObject)newDims).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QTYPE__DIMS, null, msgs);
      msgs = basicSetDims(newDims, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QTYPE__DIMS, newDims, newDims));
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
      case QuartzPackage.QTYPE__TA:
        return basicSetTa(null, msgs);
      case QuartzPackage.QTYPE__TB:
        return basicSetTb(null, msgs);
      case QuartzPackage.QTYPE__TC:
        return basicSetTc(null, msgs);
      case QuartzPackage.QTYPE__DIMS:
        return basicSetDims(null, msgs);
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
      case QuartzPackage.QTYPE__TA:
        return getTa();
      case QuartzPackage.QTYPE__TB:
        return getTb();
      case QuartzPackage.QTYPE__TC:
        return getTc();
      case QuartzPackage.QTYPE__DIMS:
        return getDims();
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
      case QuartzPackage.QTYPE__TA:
        setTa((UtyExpr)newValue);
        return;
      case QuartzPackage.QTYPE__TB:
        setTb((UtyExpr)newValue);
        return;
      case QuartzPackage.QTYPE__TC:
        setTc((UtyExpr)newValue);
        return;
      case QuartzPackage.QTYPE__DIMS:
        setDims((DimList)newValue);
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
      case QuartzPackage.QTYPE__TA:
        setTa((UtyExpr)null);
        return;
      case QuartzPackage.QTYPE__TB:
        setTb((UtyExpr)null);
        return;
      case QuartzPackage.QTYPE__TC:
        setTc((UtyExpr)null);
        return;
      case QuartzPackage.QTYPE__DIMS:
        setDims((DimList)null);
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
      case QuartzPackage.QTYPE__TA:
        return ta != null;
      case QuartzPackage.QTYPE__TB:
        return tb != null;
      case QuartzPackage.QTYPE__TC:
        return tc != null;
      case QuartzPackage.QTYPE__DIMS:
        return dims != null;
    }
    return super.eIsSet(featureID);
  }

} //QTypeImpl
