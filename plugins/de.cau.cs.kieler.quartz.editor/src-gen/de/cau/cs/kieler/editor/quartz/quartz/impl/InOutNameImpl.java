/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.InOutName;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Out Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.InOutNameImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InOutNameImpl extends InOutNameListImpl implements InOutName
{
  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<InOutName> names;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InOutNameImpl()
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
    return QuartzPackage.Literals.IN_OUT_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InOutName> getNames()
  {
    if (names == null)
    {
      names = new EObjectContainmentEList<InOutName>(InOutName.class, this, QuartzPackage.IN_OUT_NAME__NAMES);
    }
    return names;
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
      case QuartzPackage.IN_OUT_NAME__NAMES:
        return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.IN_OUT_NAME__NAMES:
        return getNames();
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
      case QuartzPackage.IN_OUT_NAME__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends InOutName>)newValue);
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
      case QuartzPackage.IN_OUT_NAME__NAMES:
        getNames().clear();
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
      case QuartzPackage.IN_OUT_NAME__NAMES:
        return names != null && !names.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InOutNameImpl
