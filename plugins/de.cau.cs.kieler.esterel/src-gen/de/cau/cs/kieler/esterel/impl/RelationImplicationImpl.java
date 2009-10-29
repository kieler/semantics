/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.RelationImplication;
import de.cau.cs.kieler.esterel.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl#getFirst <em>First</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImplicationImpl extends RelationTypeImpl implements RelationImplication
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected Signal first;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected Signal second;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImplicationImpl()
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
    return EsterelPackage.Literals.RELATION_IMPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getFirst()
  {
    if (first != null && first.eIsProxy())
    {
      InternalEObject oldFirst = (InternalEObject)first;
      first = (Signal)eResolveProxy(oldFirst);
      if (first != oldFirst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.RELATION_IMPLICATION__FIRST, oldFirst, first));
      }
    }
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(Signal newFirst)
  {
    Signal oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RELATION_IMPLICATION__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getSecond()
  {
    if (second != null && second.eIsProxy())
    {
      InternalEObject oldSecond = (InternalEObject)second;
      second = (Signal)eResolveProxy(oldSecond);
      if (second != oldSecond)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.RELATION_IMPLICATION__SECOND, oldSecond, second));
      }
    }
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(Signal newSecond)
  {
    Signal oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RELATION_IMPLICATION__SECOND, oldSecond, second));
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
      case EsterelPackage.RELATION_IMPLICATION__FIRST:
        if (resolve) return getFirst();
        return basicGetFirst();
      case EsterelPackage.RELATION_IMPLICATION__SECOND:
        if (resolve) return getSecond();
        return basicGetSecond();
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
      case EsterelPackage.RELATION_IMPLICATION__FIRST:
        setFirst((Signal)newValue);
        return;
      case EsterelPackage.RELATION_IMPLICATION__SECOND:
        setSecond((Signal)newValue);
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
      case EsterelPackage.RELATION_IMPLICATION__FIRST:
        setFirst((Signal)null);
        return;
      case EsterelPackage.RELATION_IMPLICATION__SECOND:
        setSecond((Signal)null);
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
      case EsterelPackage.RELATION_IMPLICATION__FIRST:
        return first != null;
      case EsterelPackage.RELATION_IMPLICATION__SECOND:
        return second != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationImplicationImpl
