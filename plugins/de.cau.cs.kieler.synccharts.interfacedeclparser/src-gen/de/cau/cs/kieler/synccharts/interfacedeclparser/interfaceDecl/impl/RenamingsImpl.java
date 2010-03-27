/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl;

import de.cau.cs.kieler.synccharts.Renaming;

import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Renamings;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renamings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.RenamingsImpl#getRenamings <em>Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingsImpl extends MinimalEObjectImpl.Container implements Renamings
{
  /**
   * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamings()
   * @generated
   * @ordered
   */
  protected EList<Renaming> renamings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenamingsImpl()
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
    return InterfaceDeclPackage.Literals.RENAMINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Renaming> getRenamings()
  {
    if (renamings == null)
    {
      renamings = new EObjectContainmentEList<Renaming>(Renaming.class, this, InterfaceDeclPackage.RENAMINGS__RENAMINGS);
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
      case InterfaceDeclPackage.RENAMINGS__RENAMINGS:
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
      case InterfaceDeclPackage.RENAMINGS__RENAMINGS:
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
      case InterfaceDeclPackage.RENAMINGS__RENAMINGS:
        getRenamings().clear();
        getRenamings().addAll((Collection<? extends Renaming>)newValue);
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
      case InterfaceDeclPackage.RENAMINGS__RENAMINGS:
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
      case InterfaceDeclPackage.RENAMINGS__RENAMINGS:
        return renamings != null && !renamings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RenamingsImpl
