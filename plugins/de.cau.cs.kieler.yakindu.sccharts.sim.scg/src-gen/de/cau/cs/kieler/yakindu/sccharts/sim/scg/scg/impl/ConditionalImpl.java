/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends InstructionImpl implements Conditional
{
  /**
   * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected String expression = EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional()
   * @generated
   * @ordered
   */
  protected InstructionSet conditional;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return ScgPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(String newExpression)
  {
    String oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstructionSet getConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional(InstructionSet newConditional, NotificationChain msgs)
  {
    InstructionSet oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__CONDITIONAL, oldConditional, newConditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional(InstructionSet newConditional)
  {
    if (newConditional != conditional)
    {
      NotificationChain msgs = null;
      if (conditional != null)
        msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__CONDITIONAL, null, msgs);
      if (newConditional != null)
        msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.CONDITIONAL__CONDITIONAL, null, msgs);
      msgs = basicSetConditional(newConditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__CONDITIONAL, newConditional, newConditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ScgPackage.CONDITIONAL__DEPENDENCIES);
    }
    return dependencies;
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
      case ScgPackage.CONDITIONAL__CONDITIONAL:
        return basicSetConditional(null, msgs);
      case ScgPackage.CONDITIONAL__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
      case ScgPackage.CONDITIONAL__EXPRESSION:
        return getExpression();
      case ScgPackage.CONDITIONAL__CONDITIONAL:
        return getConditional();
      case ScgPackage.CONDITIONAL__DEPENDENCIES:
        return getDependencies();
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
      case ScgPackage.CONDITIONAL__EXPRESSION:
        setExpression((String)newValue);
        return;
      case ScgPackage.CONDITIONAL__CONDITIONAL:
        setConditional((InstructionSet)newValue);
        return;
      case ScgPackage.CONDITIONAL__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
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
      case ScgPackage.CONDITIONAL__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case ScgPackage.CONDITIONAL__CONDITIONAL:
        setConditional((InstructionSet)null);
        return;
      case ScgPackage.CONDITIONAL__DEPENDENCIES:
        getDependencies().clear();
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
      case ScgPackage.CONDITIONAL__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case ScgPackage.CONDITIONAL__CONDITIONAL:
        return conditional != null;
      case ScgPackage.CONDITIONAL__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional.class)
    {
      switch (derivedFeatureID)
      {
        case ScgPackage.CONDITIONAL__EXPRESSION: return SclPackage.CONDITIONAL__EXPRESSION;
        case ScgPackage.CONDITIONAL__CONDITIONAL: return SclPackage.CONDITIONAL__CONDITIONAL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional.class)
    {
      switch (baseFeatureID)
      {
        case SclPackage.CONDITIONAL__EXPRESSION: return ScgPackage.CONDITIONAL__EXPRESSION;
        case SclPackage.CONDITIONAL__CONDITIONAL: return ScgPackage.CONDITIONAL__CONDITIONAL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //ConditionalImpl
