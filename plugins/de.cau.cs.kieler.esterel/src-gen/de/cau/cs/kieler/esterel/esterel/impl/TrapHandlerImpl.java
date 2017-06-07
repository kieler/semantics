/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Expression;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;

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
 * An implementation of the model object '<em><b>Trap Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl#getTrapExpr <em>Trap Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrapHandlerImpl extends StatementContainerImpl implements TrapHandler
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getTrapExpr() <em>Trap Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapExpr()
   * @generated
   * @ordered
   */
  protected Expression trapExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrapHandlerImpl()
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
    return EsterelPackage.Literals.TRAP_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.TRAP_HANDLER__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTrapExpr()
  {
    return trapExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrapExpr(Expression newTrapExpr, NotificationChain msgs)
  {
    Expression oldTrapExpr = trapExpr;
    trapExpr = newTrapExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__TRAP_EXPR, oldTrapExpr, newTrapExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrapExpr(Expression newTrapExpr)
  {
    if (newTrapExpr != trapExpr)
    {
      NotificationChain msgs = null;
      if (trapExpr != null)
        msgs = ((InternalEObject)trapExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__TRAP_EXPR, null, msgs);
      if (newTrapExpr != null)
        msgs = ((InternalEObject)newTrapExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__TRAP_EXPR, null, msgs);
      msgs = basicSetTrapExpr(newTrapExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__TRAP_EXPR, newTrapExpr, newTrapExpr));
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
      case EsterelPackage.TRAP_HANDLER__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return basicSetTrapExpr(null, msgs);
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
      case EsterelPackage.TRAP_HANDLER__ANNOTATIONS:
        return getAnnotations();
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return getTrapExpr();
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
      case EsterelPackage.TRAP_HANDLER__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        setTrapExpr((Expression)newValue);
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
      case EsterelPackage.TRAP_HANDLER__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        setTrapExpr((Expression)null);
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
      case EsterelPackage.TRAP_HANDLER__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return trapExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //TrapHandlerImpl
