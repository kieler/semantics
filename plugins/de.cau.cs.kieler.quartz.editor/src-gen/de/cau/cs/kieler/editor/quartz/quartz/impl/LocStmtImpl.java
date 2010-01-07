/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.InterfaceList;
import de.cau.cs.kieler.editor.quartz.quartz.LocStmt;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.SeqStmt;

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
 * An implementation of the model object '<em><b>Loc Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.LocStmtImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocStmtImpl extends AtomicStmtImpl implements LocStmt
{
  /**
   * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocals()
   * @generated
   * @ordered
   */
  protected EList<InterfaceList> locals;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected SeqStmt stmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocStmtImpl()
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
    return QuartzPackage.Literals.LOC_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceList> getLocals()
  {
    if (locals == null)
    {
      locals = new EObjectContainmentEList<InterfaceList>(InterfaceList.class, this, QuartzPackage.LOC_STMT__LOCALS);
    }
    return locals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStmt getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(SeqStmt newStmt, NotificationChain msgs)
  {
    SeqStmt oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.LOC_STMT__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(SeqStmt newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.LOC_STMT__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.LOC_STMT__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.LOC_STMT__STMT, newStmt, newStmt));
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
      case QuartzPackage.LOC_STMT__LOCALS:
        return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
      case QuartzPackage.LOC_STMT__STMT:
        return basicSetStmt(null, msgs);
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
      case QuartzPackage.LOC_STMT__LOCALS:
        return getLocals();
      case QuartzPackage.LOC_STMT__STMT:
        return getStmt();
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
      case QuartzPackage.LOC_STMT__LOCALS:
        getLocals().clear();
        getLocals().addAll((Collection<? extends InterfaceList>)newValue);
        return;
      case QuartzPackage.LOC_STMT__STMT:
        setStmt((SeqStmt)newValue);
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
      case QuartzPackage.LOC_STMT__LOCALS:
        getLocals().clear();
        return;
      case QuartzPackage.LOC_STMT__STMT:
        setStmt((SeqStmt)null);
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
      case QuartzPackage.LOC_STMT__LOCALS:
        return locals != null && !locals.isEmpty();
      case QuartzPackage.LOC_STMT__STMT:
        return stmt != null;
    }
    return super.eIsSet(featureID);
  }

} //LocStmtImpl
