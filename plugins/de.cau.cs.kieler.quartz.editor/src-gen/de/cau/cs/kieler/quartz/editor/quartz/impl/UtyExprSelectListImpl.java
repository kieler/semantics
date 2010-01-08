/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.UtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.UtyExprSelectList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uty Expr Select List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.UtyExprSelectListImpl#getTk <em>Tk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UtyExprSelectListImpl extends MinimalEObjectImpl.Container implements UtyExprSelectList
{
  /**
   * The cached value of the '{@link #getTk() <em>Tk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk()
   * @generated
   * @ordered
   */
  protected UtyExpr tk;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtyExprSelectListImpl()
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
    return QuartzPackage.Literals.UTY_EXPR_SELECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getTk()
  {
    return tk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTk(UtyExpr newTk, NotificationChain msgs)
  {
    UtyExpr oldTk = tk;
    tk = newTk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR_SELECT_LIST__TK, oldTk, newTk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTk(UtyExpr newTk)
  {
    if (newTk != tk)
    {
      NotificationChain msgs = null;
      if (tk != null)
        msgs = ((InternalEObject)tk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR_SELECT_LIST__TK, null, msgs);
      if (newTk != null)
        msgs = ((InternalEObject)newTk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR_SELECT_LIST__TK, null, msgs);
      msgs = basicSetTk(newTk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR_SELECT_LIST__TK, newTk, newTk));
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
      case QuartzPackage.UTY_EXPR_SELECT_LIST__TK:
        return basicSetTk(null, msgs);
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
      case QuartzPackage.UTY_EXPR_SELECT_LIST__TK:
        return getTk();
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
      case QuartzPackage.UTY_EXPR_SELECT_LIST__TK:
        setTk((UtyExpr)newValue);
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
      case QuartzPackage.UTY_EXPR_SELECT_LIST__TK:
        setTk((UtyExpr)null);
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
      case QuartzPackage.UTY_EXPR_SELECT_LIST__TK:
        return tk != null;
    }
    return super.eIsSet(featureID);
  }

} //UtyExprSelectListImpl
