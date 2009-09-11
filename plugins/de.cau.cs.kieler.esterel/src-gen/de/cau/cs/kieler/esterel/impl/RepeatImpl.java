/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Repeat;
import de.cau.cs.kieler.esterel.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RepeatImpl#isPositive <em>Positive</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RepeatImpl#getDataExpr <em>Data Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RepeatImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatImpl extends StatementImpl implements Repeat
{
  /**
   * The default value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected static final boolean POSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected boolean positive = POSITIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataExpr() <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataExpr()
   * @generated
   * @ordered
   */
  protected DataExpr dataExpr;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatImpl()
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
    return EsterelPackage.Literals.REPEAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPositive()
  {
    return positive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPositive(boolean newPositive)
  {
    boolean oldPositive = positive;
    positive = newPositive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__POSITIVE, oldPositive, positive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr getDataExpr()
  {
    return dataExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataExpr(DataExpr newDataExpr, NotificationChain msgs)
  {
    DataExpr oldDataExpr = dataExpr;
    dataExpr = newDataExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__DATA_EXPR, oldDataExpr, newDataExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataExpr(DataExpr newDataExpr)
  {
    if (newDataExpr != dataExpr)
    {
      NotificationChain msgs = null;
      if (dataExpr != null)
        msgs = ((InternalEObject)dataExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__DATA_EXPR, null, msgs);
      if (newDataExpr != null)
        msgs = ((InternalEObject)newDataExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__DATA_EXPR, null, msgs);
      msgs = basicSetDataExpr(newDataExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__DATA_EXPR, newDataExpr, newDataExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__STATEMENT, newStatement, newStatement));
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
      case EsterelPackage.REPEAT__DATA_EXPR:
        return basicSetDataExpr(null, msgs);
      case EsterelPackage.REPEAT__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case EsterelPackage.REPEAT__POSITIVE:
        return isPositive();
      case EsterelPackage.REPEAT__DATA_EXPR:
        return getDataExpr();
      case EsterelPackage.REPEAT__STATEMENT:
        return getStatement();
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
      case EsterelPackage.REPEAT__POSITIVE:
        setPositive((Boolean)newValue);
        return;
      case EsterelPackage.REPEAT__DATA_EXPR:
        setDataExpr((DataExpr)newValue);
        return;
      case EsterelPackage.REPEAT__STATEMENT:
        setStatement((Statement)newValue);
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
      case EsterelPackage.REPEAT__POSITIVE:
        setPositive(POSITIVE_EDEFAULT);
        return;
      case EsterelPackage.REPEAT__DATA_EXPR:
        setDataExpr((DataExpr)null);
        return;
      case EsterelPackage.REPEAT__STATEMENT:
        setStatement((Statement)null);
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
      case EsterelPackage.REPEAT__POSITIVE:
        return positive != POSITIVE_EDEFAULT;
      case EsterelPackage.REPEAT__DATA_EXPR:
        return dataExpr != null;
      case EsterelPackage.REPEAT__STATEMENT:
        return statement != null;
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
    result.append(" (positive: ");
    result.append(positive);
    result.append(')');
    return result.toString();
  }

} //RepeatImpl
