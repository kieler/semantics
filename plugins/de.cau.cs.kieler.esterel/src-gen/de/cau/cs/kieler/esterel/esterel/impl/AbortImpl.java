/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.Case;
import de.cau.cs.kieler.esterel.esterel.DelayExpr;
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
 * An implementation of the model object '<em><b>Abort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl#isWeak <em>Weak</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl#getDoStatements <em>Do Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.AbortImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbortImpl extends StatementContainerImpl implements Abort
{
  /**
   * The default value of the '{@link #isWeak() <em>Weak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeak()
   * @generated
   * @ordered
   */
  protected static final boolean WEAK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWeak() <em>Weak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeak()
   * @generated
   * @ordered
   */
  protected boolean weak = WEAK_EDEFAULT;

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
   * The cached value of the '{@link #getDoStatements() <em>Do Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> doStatements;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<Case> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbortImpl()
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
    return EsterelPackage.Literals.ABORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWeak()
  {
    return weak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeak(boolean newWeak)
  {
    boolean oldWeak = weak;
    weak = newWeak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ABORT__WEAK, oldWeak, weak));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.ABORT__DELAY, oldDelay, newDelay);
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
        msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ABORT__DELAY, null, msgs);
      if (newDelay != null)
        msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ABORT__DELAY, null, msgs);
      msgs = basicSetDelay(newDelay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ABORT__DELAY, newDelay, newDelay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getDoStatements()
  {
    if (doStatements == null)
    {
      doStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.ABORT__DO_STATEMENTS);
    }
    return doStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Case> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<Case>(Case.class, this, EsterelPackage.ABORT__CASES);
    }
    return cases;
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
      case EsterelPackage.ABORT__DELAY:
        return basicSetDelay(null, msgs);
      case EsterelPackage.ABORT__DO_STATEMENTS:
        return ((InternalEList<?>)getDoStatements()).basicRemove(otherEnd, msgs);
      case EsterelPackage.ABORT__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.ABORT__WEAK:
        return isWeak();
      case EsterelPackage.ABORT__DELAY:
        return getDelay();
      case EsterelPackage.ABORT__DO_STATEMENTS:
        return getDoStatements();
      case EsterelPackage.ABORT__CASES:
        return getCases();
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
      case EsterelPackage.ABORT__WEAK:
        setWeak((Boolean)newValue);
        return;
      case EsterelPackage.ABORT__DELAY:
        setDelay((DelayExpr)newValue);
        return;
      case EsterelPackage.ABORT__DO_STATEMENTS:
        getDoStatements().clear();
        getDoStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case EsterelPackage.ABORT__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends Case>)newValue);
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
      case EsterelPackage.ABORT__WEAK:
        setWeak(WEAK_EDEFAULT);
        return;
      case EsterelPackage.ABORT__DELAY:
        setDelay((DelayExpr)null);
        return;
      case EsterelPackage.ABORT__DO_STATEMENTS:
        getDoStatements().clear();
        return;
      case EsterelPackage.ABORT__CASES:
        getCases().clear();
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
      case EsterelPackage.ABORT__WEAK:
        return weak != WEAK_EDEFAULT;
      case EsterelPackage.ABORT__DELAY:
        return delay != null;
      case EsterelPackage.ABORT__DO_STATEMENTS:
        return doStatements != null && !doStatements.isEmpty();
      case EsterelPackage.ABORT__CASES:
        return cases != null && !cases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (weak: ");
    result.append(weak);
    result.append(')');
    return result.toString();
  }

} //AbortImpl
