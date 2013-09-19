/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Renaming;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.RenamingImpl#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingImpl extends MinimalEObjectImpl.Container implements Renaming
{
  /**
   * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamings()
   * @generated
   * @ordered
   */
  protected EList<EObject> renamings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenamingImpl()
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
    return EsterelPackage.Literals.RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getRenamings()
  {
    if (renamings == null)
    {
      renamings = new EObjectContainmentEList<EObject>(EObject.class, this, EsterelPackage.RENAMING__RENAMINGS);
    }
    return renamings;
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
      case EsterelPackage.RENAMING__RENAMINGS:
        return ((InternalEList<?>)getRenamings()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.RENAMING__RENAMINGS:
        return getRenamings();
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
      case EsterelPackage.RENAMING__RENAMINGS:
        getRenamings().clear();
        getRenamings().addAll((Collection<? extends EObject>)newValue);
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
      case EsterelPackage.RENAMING__RENAMINGS:
        getRenamings().clear();
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
      case EsterelPackage.RENAMING__RENAMINGS:
        return renamings != null && !renamings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RenamingImpl
