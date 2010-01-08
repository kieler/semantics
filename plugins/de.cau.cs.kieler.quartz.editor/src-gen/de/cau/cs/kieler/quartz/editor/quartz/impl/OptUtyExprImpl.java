/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.OptUtyExprList;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.UtyExpr;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Uty Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.OptUtyExprImpl#getTk <em>Tk</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.OptUtyExprImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptUtyExprImpl extends OptUtyExprListImpl implements OptUtyExpr
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
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<OptUtyExprList> exprs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptUtyExprImpl()
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
    return QuartzPackage.Literals.OPT_UTY_EXPR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.OPT_UTY_EXPR__TK, oldTk, newTk);
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
        msgs = ((InternalEObject)tk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.OPT_UTY_EXPR__TK, null, msgs);
      if (newTk != null)
        msgs = ((InternalEObject)newTk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.OPT_UTY_EXPR__TK, null, msgs);
      msgs = basicSetTk(newTk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.OPT_UTY_EXPR__TK, newTk, newTk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptUtyExprList> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<OptUtyExprList>(OptUtyExprList.class, this, QuartzPackage.OPT_UTY_EXPR__EXPRS);
    }
    return exprs;
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
      case QuartzPackage.OPT_UTY_EXPR__TK:
        return basicSetTk(null, msgs);
      case QuartzPackage.OPT_UTY_EXPR__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.OPT_UTY_EXPR__TK:
        return getTk();
      case QuartzPackage.OPT_UTY_EXPR__EXPRS:
        return getExprs();
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
      case QuartzPackage.OPT_UTY_EXPR__TK:
        setTk((UtyExpr)newValue);
        return;
      case QuartzPackage.OPT_UTY_EXPR__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends OptUtyExprList>)newValue);
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
      case QuartzPackage.OPT_UTY_EXPR__TK:
        setTk((UtyExpr)null);
        return;
      case QuartzPackage.OPT_UTY_EXPR__EXPRS:
        getExprs().clear();
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
      case QuartzPackage.OPT_UTY_EXPR__TK:
        return tk != null;
      case QuartzPackage.OPT_UTY_EXPR__EXPRS:
        return exprs != null && !exprs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptUtyExprImpl
