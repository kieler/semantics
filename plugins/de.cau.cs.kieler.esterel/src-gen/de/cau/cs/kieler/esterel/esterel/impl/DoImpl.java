/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import de.cau.cs.kieler.scl.scl.Statement;

import de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl;

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
 * An implementation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getEndingAnnotations <em>Ending Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getWatchingStatements <em>Watching Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoImpl extends StatementContainerImpl implements Do
{
  /**
   * The cached value of the '{@link #getEndingAnnotations() <em>Ending Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndingAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> endingAnnotations;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected DelayExpr expression;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected DelayExpr delay;

  /**
   * The cached value of the '{@link #getWatchingStatements() <em>Watching Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWatchingStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> watchingStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoImpl()
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
    return EsterelPackage.Literals.DO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getEndingAnnotations()
  {
    if (endingAnnotations == null)
    {
      endingAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.DO__ENDING_ANNOTATIONS);
    }
    return endingAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayExpr getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(DelayExpr newExpression, NotificationChain msgs)
  {
    DelayExpr oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(DelayExpr newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayExpr getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelay(DelayExpr newDelay, NotificationChain msgs)
  {
    DelayExpr oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__DELAY, oldDelay, newDelay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(DelayExpr newDelay)
  {
    if (newDelay != delay)
    {
      NotificationChain msgs = null;
      if (delay != null)
        msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__DELAY, null, msgs);
      if (newDelay != null)
        msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__DELAY, null, msgs);
      msgs = basicSetDelay(newDelay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__DELAY, newDelay, newDelay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getWatchingStatements()
  {
    if (watchingStatements == null)
    {
      watchingStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.DO__WATCHING_STATEMENTS);
    }
    return watchingStatements;
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
      case EsterelPackage.DO__ENDING_ANNOTATIONS:
        return ((InternalEList<?>)getEndingAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.DO__EXPRESSION:
        return basicSetExpression(null, msgs);
      case EsterelPackage.DO__DELAY:
        return basicSetDelay(null, msgs);
      case EsterelPackage.DO__WATCHING_STATEMENTS:
        return ((InternalEList<?>)getWatchingStatements()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.DO__ENDING_ANNOTATIONS:
        return getEndingAnnotations();
      case EsterelPackage.DO__EXPRESSION:
        return getExpression();
      case EsterelPackage.DO__DELAY:
        return getDelay();
      case EsterelPackage.DO__WATCHING_STATEMENTS:
        return getWatchingStatements();
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
      case EsterelPackage.DO__ENDING_ANNOTATIONS:
        getEndingAnnotations().clear();
        getEndingAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.DO__EXPRESSION:
        setExpression((DelayExpr)newValue);
        return;
      case EsterelPackage.DO__DELAY:
        setDelay((DelayExpr)newValue);
        return;
      case EsterelPackage.DO__WATCHING_STATEMENTS:
        getWatchingStatements().clear();
        getWatchingStatements().addAll((Collection<? extends Statement>)newValue);
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
      case EsterelPackage.DO__ENDING_ANNOTATIONS:
        getEndingAnnotations().clear();
        return;
      case EsterelPackage.DO__EXPRESSION:
        setExpression((DelayExpr)null);
        return;
      case EsterelPackage.DO__DELAY:
        setDelay((DelayExpr)null);
        return;
      case EsterelPackage.DO__WATCHING_STATEMENTS:
        getWatchingStatements().clear();
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
      case EsterelPackage.DO__ENDING_ANNOTATIONS:
        return endingAnnotations != null && !endingAnnotations.isEmpty();
      case EsterelPackage.DO__EXPRESSION:
        return expression != null;
      case EsterelPackage.DO__DELAY:
        return delay != null;
      case EsterelPackage.DO__WATCHING_STATEMENTS:
        return watchingStatements != null && !watchingStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DoImpl
