/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Expression;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.PresentCase;
import de.cau.cs.kieler.esterel.esterel.ValuedObject;

import de.cau.cs.kieler.scl.scl.Statement;

import de.cau.cs.kieler.scl.scl.impl.StatementImpl;

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
 * An implementation of the model object '<em><b>Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getThenAnnotations <em>Then Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getElseAnnotations <em>Else Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentImpl extends StatementImpl implements Present
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getTick() <em>Tick</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected ValuedObject tick;

  /**
   * The cached value of the '{@link #getThenAnnotations() <em>Then Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> thenAnnotations;

  /**
   * The cached value of the '{@link #getThenStatements() <em>Then Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> thenStatements;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<PresentCase> cases;

  /**
   * The cached value of the '{@link #getElseAnnotations() <em>Else Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> elseAnnotations;

  /**
   * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresentImpl()
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
    return EsterelPackage.Literals.PRESENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getTick()
  {
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTick(ValuedObject newTick, NotificationChain msgs)
  {
    ValuedObject oldTick = tick;
    tick = newTick;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__TICK, oldTick, newTick);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTick(ValuedObject newTick)
  {
    if (newTick != tick)
    {
      NotificationChain msgs = null;
      if (tick != null)
        msgs = ((InternalEObject)tick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__TICK, null, msgs);
      if (newTick != null)
        msgs = ((InternalEObject)newTick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__TICK, null, msgs);
      msgs = basicSetTick(newTick, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__TICK, newTick, newTick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getThenAnnotations()
  {
    if (thenAnnotations == null)
    {
      thenAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.PRESENT__THEN_ANNOTATIONS);
    }
    return thenAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getThenStatements()
  {
    if (thenStatements == null)
    {
      thenStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.PRESENT__THEN_STATEMENTS);
    }
    return thenStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PresentCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<PresentCase>(PresentCase.class, this, EsterelPackage.PRESENT__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getElseAnnotations()
  {
    if (elseAnnotations == null)
    {
      elseAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.PRESENT__ELSE_ANNOTATIONS);
    }
    return elseAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseStatements()
  {
    if (elseStatements == null)
    {
      elseStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.PRESENT__ELSE_STATEMENTS);
    }
    return elseStatements;
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
      case EsterelPackage.PRESENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case EsterelPackage.PRESENT__TICK:
        return basicSetTick(null, msgs);
      case EsterelPackage.PRESENT__THEN_ANNOTATIONS:
        return ((InternalEList<?>)getThenAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.PRESENT__THEN_STATEMENTS:
        return ((InternalEList<?>)getThenStatements()).basicRemove(otherEnd, msgs);
      case EsterelPackage.PRESENT__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case EsterelPackage.PRESENT__ELSE_ANNOTATIONS:
        return ((InternalEList<?>)getElseAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.PRESENT__ELSE_STATEMENTS:
        return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.PRESENT__EXPRESSION:
        return getExpression();
      case EsterelPackage.PRESENT__TICK:
        return getTick();
      case EsterelPackage.PRESENT__THEN_ANNOTATIONS:
        return getThenAnnotations();
      case EsterelPackage.PRESENT__THEN_STATEMENTS:
        return getThenStatements();
      case EsterelPackage.PRESENT__CASES:
        return getCases();
      case EsterelPackage.PRESENT__ELSE_ANNOTATIONS:
        return getElseAnnotations();
      case EsterelPackage.PRESENT__ELSE_STATEMENTS:
        return getElseStatements();
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
      case EsterelPackage.PRESENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case EsterelPackage.PRESENT__TICK:
        setTick((ValuedObject)newValue);
        return;
      case EsterelPackage.PRESENT__THEN_ANNOTATIONS:
        getThenAnnotations().clear();
        getThenAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.PRESENT__THEN_STATEMENTS:
        getThenStatements().clear();
        getThenStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case EsterelPackage.PRESENT__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends PresentCase>)newValue);
        return;
      case EsterelPackage.PRESENT__ELSE_ANNOTATIONS:
        getElseAnnotations().clear();
        getElseAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.PRESENT__ELSE_STATEMENTS:
        getElseStatements().clear();
        getElseStatements().addAll((Collection<? extends Statement>)newValue);
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
      case EsterelPackage.PRESENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case EsterelPackage.PRESENT__TICK:
        setTick((ValuedObject)null);
        return;
      case EsterelPackage.PRESENT__THEN_ANNOTATIONS:
        getThenAnnotations().clear();
        return;
      case EsterelPackage.PRESENT__THEN_STATEMENTS:
        getThenStatements().clear();
        return;
      case EsterelPackage.PRESENT__CASES:
        getCases().clear();
        return;
      case EsterelPackage.PRESENT__ELSE_ANNOTATIONS:
        getElseAnnotations().clear();
        return;
      case EsterelPackage.PRESENT__ELSE_STATEMENTS:
        getElseStatements().clear();
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
      case EsterelPackage.PRESENT__EXPRESSION:
        return expression != null;
      case EsterelPackage.PRESENT__TICK:
        return tick != null;
      case EsterelPackage.PRESENT__THEN_ANNOTATIONS:
        return thenAnnotations != null && !thenAnnotations.isEmpty();
      case EsterelPackage.PRESENT__THEN_STATEMENTS:
        return thenStatements != null && !thenStatements.isEmpty();
      case EsterelPackage.PRESENT__CASES:
        return cases != null && !cases.isEmpty();
      case EsterelPackage.PRESENT__ELSE_ANNOTATIONS:
        return elseAnnotations != null && !elseAnnotations.isEmpty();
      case EsterelPackage.PRESENT__ELSE_STATEMENTS:
        return elseStatements != null && !elseStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PresentImpl
