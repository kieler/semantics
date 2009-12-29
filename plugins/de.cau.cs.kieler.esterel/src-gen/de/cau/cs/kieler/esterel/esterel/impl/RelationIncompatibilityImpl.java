/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.RelationIncompatibility;
import de.cau.cs.kieler.esterel.esterel.Signal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Incompatibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.RelationIncompatibilityImpl#getIncomp <em>Incomp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationIncompatibilityImpl extends RelationTypeImpl implements RelationIncompatibility
{
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
  protected RelationIncompatibilityImpl()
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
    return EsterelPackage.Literals.RELATION_INCOMPATIBILITY;
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
      incomp = new EObjectResolvingEList<Signal>(Signal.class, this, EsterelPackage.RELATION_INCOMPATIBILITY__INCOMP);
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
      case EsterelPackage.RELATION_INCOMPATIBILITY__INCOMP:
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
      case EsterelPackage.RELATION_INCOMPATIBILITY__INCOMP:
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
      case EsterelPackage.RELATION_INCOMPATIBILITY__INCOMP:
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
      case EsterelPackage.RELATION_INCOMPATIBILITY__INCOMP:
        return incomp != null && !incomp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationIncompatibilityImpl
