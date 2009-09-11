/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Relation;
import de.cau.cs.kieler.esterel.Signal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImpl#getFirst <em>First</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RelationImpl#getIncomp <em>Incomp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getIncomp() <em>Incomp</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomp()
   * @generated
   * @ordered
   */
  protected EList<Signal> incomp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return EsterelPackage.Literals.RELATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.RELATION__FIRST, oldFirst, first));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RELATION__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RELATION__TYPE, oldType, type));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.RELATION__SECOND, oldSecond, second));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RELATION__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getIncomp()
  {
    if (incomp == null)
    {
      incomp = new EObjectResolvingEList<Signal>(Signal.class, this, EsterelPackage.RELATION__INCOMP);
    }
    return incomp;
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
      case EsterelPackage.RELATION__FIRST:
        if (resolve) return getFirst();
        return basicGetFirst();
      case EsterelPackage.RELATION__TYPE:
        return getType();
      case EsterelPackage.RELATION__SECOND:
        if (resolve) return getSecond();
        return basicGetSecond();
      case EsterelPackage.RELATION__INCOMP:
        return getIncomp();
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
      case EsterelPackage.RELATION__FIRST:
        setFirst((Signal)newValue);
        return;
      case EsterelPackage.RELATION__TYPE:
        setType((String)newValue);
        return;
      case EsterelPackage.RELATION__SECOND:
        setSecond((Signal)newValue);
        return;
      case EsterelPackage.RELATION__INCOMP:
        getIncomp().clear();
        getIncomp().addAll((Collection<? extends Signal>)newValue);
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
      case EsterelPackage.RELATION__FIRST:
        setFirst((Signal)null);
        return;
      case EsterelPackage.RELATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case EsterelPackage.RELATION__SECOND:
        setSecond((Signal)null);
        return;
      case EsterelPackage.RELATION__INCOMP:
        getIncomp().clear();
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
      case EsterelPackage.RELATION__FIRST:
        return first != null;
      case EsterelPackage.RELATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case EsterelPackage.RELATION__SECOND:
        return second != null;
      case EsterelPackage.RELATION__INCOMP:
        return incomp != null && !incomp.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
