/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.AssumeList;
import de.cau.cs.kieler.editor.quartz.quartz.ControlList;
import de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList;
import de.cau.cs.kieler.editor.quartz.quartz.QName;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.UtyExpr;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proof Goal List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getVer <em>Ver</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getCtrl <em>Ctrl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getAss <em>Ass</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.ProofGoalListImpl#getCtr <em>Ctr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProofGoalListImpl extends ObservedSpecListImpl implements ProofGoalList
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<QName> name;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<UtyExpr> expr;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<ProofGoalList> goals;

  /**
   * The cached value of the '{@link #getVer() <em>Ver</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVer()
   * @generated
   * @ordered
   */
  protected EList<String> ver;

  /**
   * The cached value of the '{@link #getCtrl() <em>Ctrl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtrl()
   * @generated
   * @ordered
   */
  protected EList<ControlList> ctrl;

  /**
   * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss()
   * @generated
   * @ordered
   */
  protected EList<AssumeList> ass;

  /**
   * The cached value of the '{@link #getCtr() <em>Ctr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtr()
   * @generated
   * @ordered
   */
  protected EList<ControlList> ctr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProofGoalListImpl()
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
    return QuartzPackage.Literals.PROOF_GOAL_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QName> getName()
  {
    if (name == null)
    {
      name = new EObjectContainmentEList<QName>(QName.class, this, QuartzPackage.PROOF_GOAL_LIST__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UtyExpr> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<UtyExpr>(UtyExpr.class, this, QuartzPackage.PROOF_GOAL_LIST__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProofGoalList> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<ProofGoalList>(ProofGoalList.class, this, QuartzPackage.PROOF_GOAL_LIST__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVer()
  {
    if (ver == null)
    {
      ver = new EDataTypeEList<String>(String.class, this, QuartzPackage.PROOF_GOAL_LIST__VER);
    }
    return ver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControlList> getCtrl()
  {
    if (ctrl == null)
    {
      ctrl = new EObjectContainmentEList<ControlList>(ControlList.class, this, QuartzPackage.PROOF_GOAL_LIST__CTRL);
    }
    return ctrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssumeList> getAss()
  {
    if (ass == null)
    {
      ass = new EObjectContainmentEList<AssumeList>(AssumeList.class, this, QuartzPackage.PROOF_GOAL_LIST__ASS);
    }
    return ass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControlList> getCtr()
  {
    if (ctr == null)
    {
      ctr = new EObjectContainmentEList<ControlList>(ControlList.class, this, QuartzPackage.PROOF_GOAL_LIST__CTR);
    }
    return ctr;
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
      case QuartzPackage.PROOF_GOAL_LIST__NAME:
        return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
      case QuartzPackage.PROOF_GOAL_LIST__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
      case QuartzPackage.PROOF_GOAL_LIST__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case QuartzPackage.PROOF_GOAL_LIST__CTRL:
        return ((InternalEList<?>)getCtrl()).basicRemove(otherEnd, msgs);
      case QuartzPackage.PROOF_GOAL_LIST__ASS:
        return ((InternalEList<?>)getAss()).basicRemove(otherEnd, msgs);
      case QuartzPackage.PROOF_GOAL_LIST__CTR:
        return ((InternalEList<?>)getCtr()).basicRemove(otherEnd, msgs);
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
      case QuartzPackage.PROOF_GOAL_LIST__NAME:
        return getName();
      case QuartzPackage.PROOF_GOAL_LIST__EXPR:
        return getExpr();
      case QuartzPackage.PROOF_GOAL_LIST__GOALS:
        return getGoals();
      case QuartzPackage.PROOF_GOAL_LIST__VER:
        return getVer();
      case QuartzPackage.PROOF_GOAL_LIST__CTRL:
        return getCtrl();
      case QuartzPackage.PROOF_GOAL_LIST__ASS:
        return getAss();
      case QuartzPackage.PROOF_GOAL_LIST__CTR:
        return getCtr();
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
      case QuartzPackage.PROOF_GOAL_LIST__NAME:
        getName().clear();
        getName().addAll((Collection<? extends QName>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends UtyExpr>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends ProofGoalList>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__VER:
        getVer().clear();
        getVer().addAll((Collection<? extends String>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__CTRL:
        getCtrl().clear();
        getCtrl().addAll((Collection<? extends ControlList>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__ASS:
        getAss().clear();
        getAss().addAll((Collection<? extends AssumeList>)newValue);
        return;
      case QuartzPackage.PROOF_GOAL_LIST__CTR:
        getCtr().clear();
        getCtr().addAll((Collection<? extends ControlList>)newValue);
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
      case QuartzPackage.PROOF_GOAL_LIST__NAME:
        getName().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__EXPR:
        getExpr().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__GOALS:
        getGoals().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__VER:
        getVer().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__CTRL:
        getCtrl().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__ASS:
        getAss().clear();
        return;
      case QuartzPackage.PROOF_GOAL_LIST__CTR:
        getCtr().clear();
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
      case QuartzPackage.PROOF_GOAL_LIST__NAME:
        return name != null && !name.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__EXPR:
        return expr != null && !expr.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__GOALS:
        return goals != null && !goals.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__VER:
        return ver != null && !ver.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__CTRL:
        return ctrl != null && !ctrl.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__ASS:
        return ass != null && !ass.isEmpty();
      case QuartzPackage.PROOF_GOAL_LIST__CTR:
        return ctr != null && !ctr.isEmpty();
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
    result.append(" (ver: ");
    result.append(ver);
    result.append(')');
    return result.toString();
  }

} //ProofGoalListImpl
