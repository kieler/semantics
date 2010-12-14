/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.IVariable;

import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.ExecBody;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ExecBodyImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ExecBodyImpl#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecBodyImpl extends MinimalEObjectImpl.Container implements ExecBody
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<IVariable> vars;

  /**
   * The cached value of the '{@link #getKexpressions() <em>Kexpressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKexpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> kexpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecBodyImpl()
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
    return EsterelPackage.Literals.EXEC_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IVariable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<IVariable>(IVariable.class, this, EsterelPackage.EXEC_BODY__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getKexpressions()
  {
    if (kexpressions == null)
    {
      kexpressions = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.EXEC_BODY__KEXPRESSIONS);
    }
    return kexpressions;
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
      case EsterelPackage.EXEC_BODY__KEXPRESSIONS:
        return ((InternalEList<?>)getKexpressions()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.EXEC_BODY__VARS:
        return getVars();
      case EsterelPackage.EXEC_BODY__KEXPRESSIONS:
        return getKexpressions();
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
      case EsterelPackage.EXEC_BODY__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends IVariable>)newValue);
        return;
      case EsterelPackage.EXEC_BODY__KEXPRESSIONS:
        getKexpressions().clear();
        getKexpressions().addAll((Collection<? extends Expression>)newValue);
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
      case EsterelPackage.EXEC_BODY__VARS:
        getVars().clear();
        return;
      case EsterelPackage.EXEC_BODY__KEXPRESSIONS:
        getKexpressions().clear();
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
      case EsterelPackage.EXEC_BODY__VARS:
        return vars != null && !vars.isEmpty();
      case EsterelPackage.EXEC_BODY__KEXPRESSIONS:
        return kexpressions != null && !kexpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExecBodyImpl
