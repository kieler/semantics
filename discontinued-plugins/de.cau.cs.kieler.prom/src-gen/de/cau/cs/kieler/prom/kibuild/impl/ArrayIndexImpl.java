/**
 * generated by Xtext
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.ArrayIndex;
import de.cau.cs.kieler.prom.kibuild.KibuildPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.ArrayIndexImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayIndexImpl extends MinimalEObjectImpl.Container implements ArrayIndex
{
  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<Integer> indices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayIndexImpl()
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
    return KibuildPackage.Literals.ARRAY_INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIndices()
  {
    if (indices == null)
    {
      indices = new EDataTypeEList<Integer>(Integer.class, this, KibuildPackage.ARRAY_INDEX__INDICES);
    }
    return indices;
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
      case KibuildPackage.ARRAY_INDEX__INDICES:
        return getIndices();
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
      case KibuildPackage.ARRAY_INDEX__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends Integer>)newValue);
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
      case KibuildPackage.ARRAY_INDEX__INDICES:
        getIndices().clear();
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
      case KibuildPackage.ARRAY_INDEX__INDICES:
        return indices != null && !indices.isEmpty();
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
    result.append(" (indices: ");
    result.append(indices);
    result.append(')');
    return result.toString();
  }

} //ArrayIndexImpl
