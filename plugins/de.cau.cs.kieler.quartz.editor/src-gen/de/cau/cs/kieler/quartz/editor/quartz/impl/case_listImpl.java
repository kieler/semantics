/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.Stmt;
import de.cau.cs.kieler.quartz.editor.quartz.case_list;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExpr;

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
 * An implementation of the model object '<em><b>case list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.case_listImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.case_listImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.case_listImpl#getT15 <em>T15</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class case_listImpl extends AtomicStmtImpl implements case_list
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<dUtyExpr> exp;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected EList<Stmt> stmt;

  /**
   * The cached value of the '{@link #getT15() <em>T15</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT15()
   * @generated
   * @ordered
   */
  protected AtomicStmt t15;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected case_listImpl()
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
    return QuartzPackage.Literals.CASE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<dUtyExpr> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<dUtyExpr>(dUtyExpr.class, this, QuartzPackage.CASE_LIST__EXP);
    }
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stmt> getStmt()
  {
    if (stmt == null)
    {
      stmt = new EObjectContainmentEList<Stmt>(Stmt.class, this, QuartzPackage.CASE_LIST__STMT);
    }
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt getT15()
  {
    return t15;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT15(AtomicStmt newT15, NotificationChain msgs)
  {
    AtomicStmt oldT15 = t15;
    t15 = newT15;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.CASE_LIST__T15, oldT15, newT15);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT15(AtomicStmt newT15)
  {
    if (newT15 != t15)
    {
      NotificationChain msgs = null;
      if (t15 != null)
        msgs = ((InternalEObject)t15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.CASE_LIST__T15, null, msgs);
      if (newT15 != null)
        msgs = ((InternalEObject)newT15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.CASE_LIST__T15, null, msgs);
      msgs = basicSetT15(newT15, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CASE_LIST__T15, newT15, newT15));
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
      case QuartzPackage.CASE_LIST__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
      case QuartzPackage.CASE_LIST__STMT:
        return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
      case QuartzPackage.CASE_LIST__T15:
        return basicSetT15(null, msgs);
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
      case QuartzPackage.CASE_LIST__EXP:
        return getExp();
      case QuartzPackage.CASE_LIST__STMT:
        return getStmt();
      case QuartzPackage.CASE_LIST__T15:
        return getT15();
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
      case QuartzPackage.CASE_LIST__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends dUtyExpr>)newValue);
        return;
      case QuartzPackage.CASE_LIST__STMT:
        getStmt().clear();
        getStmt().addAll((Collection<? extends Stmt>)newValue);
        return;
      case QuartzPackage.CASE_LIST__T15:
        setT15((AtomicStmt)newValue);
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
      case QuartzPackage.CASE_LIST__EXP:
        getExp().clear();
        return;
      case QuartzPackage.CASE_LIST__STMT:
        getStmt().clear();
        return;
      case QuartzPackage.CASE_LIST__T15:
        setT15((AtomicStmt)null);
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
      case QuartzPackage.CASE_LIST__EXP:
        return exp != null && !exp.isEmpty();
      case QuartzPackage.CASE_LIST__STMT:
        return stmt != null && !stmt.isEmpty();
      case QuartzPackage.CASE_LIST__T15:
        return t15 != null;
    }
    return super.eIsSet(featureID);
  }

} //case_listImpl
