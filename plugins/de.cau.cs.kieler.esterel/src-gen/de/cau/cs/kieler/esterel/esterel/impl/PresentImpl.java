/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.ElsePart;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.PresentBody;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getElsePart <em>Else Part</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.PresentImpl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentImpl extends StatementImpl implements Present
{
  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected PresentBody body;

  /**
   * The cached value of the '{@link #getElsePart() <em>Else Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsePart()
   * @generated
   * @ordered
   */
  protected ElsePart elsePart;

  /**
   * The default value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected static final String OPT_END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected String optEnd = OPT_END_EDEFAULT;

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
  public PresentBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(PresentBody newBody, NotificationChain msgs)
  {
    PresentBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(PresentBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsePart getElsePart()
  {
    return elsePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsePart(ElsePart newElsePart, NotificationChain msgs)
  {
    ElsePart oldElsePart = elsePart;
    elsePart = newElsePart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__ELSE_PART, oldElsePart, newElsePart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsePart(ElsePart newElsePart)
  {
    if (newElsePart != elsePart)
    {
      NotificationChain msgs = null;
      if (elsePart != null)
        msgs = ((InternalEObject)elsePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__ELSE_PART, null, msgs);
      if (newElsePart != null)
        msgs = ((InternalEObject)newElsePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__ELSE_PART, null, msgs);
      msgs = basicSetElsePart(newElsePart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__ELSE_PART, newElsePart, newElsePart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptEnd()
  {
    return optEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptEnd(String newOptEnd)
  {
    String oldOptEnd = optEnd;
    optEnd = newOptEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__OPT_END, oldOptEnd, optEnd));
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
      case EsterelPackage.PRESENT__BODY:
        return basicSetBody(null, msgs);
      case EsterelPackage.PRESENT__ELSE_PART:
        return basicSetElsePart(null, msgs);
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
      case EsterelPackage.PRESENT__BODY:
        return getBody();
      case EsterelPackage.PRESENT__ELSE_PART:
        return getElsePart();
      case EsterelPackage.PRESENT__OPT_END:
        return getOptEnd();
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
      case EsterelPackage.PRESENT__BODY:
        setBody((PresentBody)newValue);
        return;
      case EsterelPackage.PRESENT__ELSE_PART:
        setElsePart((ElsePart)newValue);
        return;
      case EsterelPackage.PRESENT__OPT_END:
        setOptEnd((String)newValue);
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
      case EsterelPackage.PRESENT__BODY:
        setBody((PresentBody)null);
        return;
      case EsterelPackage.PRESENT__ELSE_PART:
        setElsePart((ElsePart)null);
        return;
      case EsterelPackage.PRESENT__OPT_END:
        setOptEnd(OPT_END_EDEFAULT);
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
      case EsterelPackage.PRESENT__BODY:
        return body != null;
      case EsterelPackage.PRESENT__ELSE_PART:
        return elsePart != null;
      case EsterelPackage.PRESENT__OPT_END:
        return OPT_END_EDEFAULT == null ? optEnd != null : !OPT_END_EDEFAULT.equals(optEnd);
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
    result.append(" (optEnd: ");
    result.append(optEnd);
    result.append(')');
    return result.toString();
  }

} //PresentImpl
