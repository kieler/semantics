/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.yakindu.base.types.ComplexType;
import org.yakindu.base.types.Feature;
import org.yakindu.base.types.Property;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.TypedElement;
import org.yakindu.base.types.TypesPackage;

import org.yakindu.sct.model.sgraph.impl.VariableImpl;

import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#isExternal <em>External</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends VariableImpl implements VariableDefinition
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected static final boolean READONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected boolean readonly = READONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected boolean external = EXTERNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected Expression initialValue;

  /**
   * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInput()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInput()
   * @generated
   * @ordered
   */
  protected boolean isInput = IS_INPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOutput()
   * @generated
   * @ordered
   */
  protected static final boolean IS_OUTPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOutput()
   * @generated
   * @ordered
   */
  protected boolean isOutput = IS_OUTPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected boolean isStatic = IS_STATIC_EDEFAULT;

  /**
   * The default value of the '{@link #getVarCombineOperator() <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarCombineOperator()
   * @generated
   * @ordered
   */
  protected static final CombineOperator VAR_COMBINE_OPERATOR_EDEFAULT = CombineOperator.NONE;

  /**
   * The cached value of the '{@link #getVarCombineOperator() <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarCombineOperator()
   * @generated
   * @ordered
   */
  protected CombineOperator varCombineOperator = VAR_COMBINE_OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return SynctextPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynctextPackage.VARIABLE_DEFINITION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType getOwningType()
  {
    if (eContainerFeatureID() != SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE) return null;
    return (ComplexType)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningType(ComplexType newOwningType, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningType, SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningType(ComplexType newOwningType)
  {
    if (newOwningType != eInternalContainer() || (eContainerFeatureID() != SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE && newOwningType != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningType))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningType != null)
        msgs = ((InternalEObject)newOwningType).eInverseAdd(this, TypesPackage.COMPLEX_TYPE__FEATURES, ComplexType.class, msgs);
      msgs = basicSetOwningType(newOwningType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE, newOwningType, newOwningType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadonly()
  {
    return readonly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadonly(boolean newReadonly)
  {
    boolean oldReadonly = readonly;
    readonly = newReadonly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__READONLY, oldReadonly, readonly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExternal()
  {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternal(boolean newExternal)
  {
    boolean oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs)
  {
    Expression oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(Expression newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE, newInitialValue, newInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInput()
  {
    return isInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInput(boolean newIsInput)
  {
    boolean oldIsInput = isInput;
    isInput = newIsInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__IS_INPUT, oldIsInput, isInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsOutput()
  {
    return isOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOutput(boolean newIsOutput)
  {
    boolean oldIsOutput = isOutput;
    isOutput = newIsOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__IS_OUTPUT, oldIsOutput, isOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStatic()
  {
    return isStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStatic(boolean newIsStatic)
  {
    boolean oldIsStatic = isStatic;
    isStatic = newIsStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__IS_STATIC, oldIsStatic, isStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombineOperator getVarCombineOperator()
  {
    return varCombineOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarCombineOperator(CombineOperator newVarCombineOperator)
  {
    CombineOperator oldVarCombineOperator = varCombineOperator;
    varCombineOperator = newVarCombineOperator == null ? VAR_COMBINE_OPERATOR_EDEFAULT : newVarCombineOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR, oldVarCombineOperator, varCombineOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningType((ComplexType)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return basicSetOwningType(null, msgs);
      case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return eInternalContainer().eInverseRemove(this, TypesPackage.COMPLEX_TYPE__FEATURES, ComplexType.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case SynctextPackage.VARIABLE_DEFINITION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return getOwningType();
      case SynctextPackage.VARIABLE_DEFINITION__READONLY:
        return isReadonly();
      case SynctextPackage.VARIABLE_DEFINITION__EXTERNAL:
        return isExternal();
      case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return getInitialValue();
      case SynctextPackage.VARIABLE_DEFINITION__IS_INPUT:
        return isIsInput();
      case SynctextPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        return isIsOutput();
      case SynctextPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isIsStatic();
      case SynctextPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
        return getVarCombineOperator();
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
      case SynctextPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        setOwningType((ComplexType)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__READONLY:
        setReadonly((Boolean)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__EXTERNAL:
        setExternal((Boolean)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        setInitialValue((Expression)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_INPUT:
        setIsInput((Boolean)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        setIsOutput((Boolean)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic((Boolean)newValue);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
        setVarCombineOperator((CombineOperator)newValue);
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
      case SynctextPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)null);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        setOwningType((ComplexType)null);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__READONLY:
        setReadonly(READONLY_EDEFAULT);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        setInitialValue((Expression)null);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_INPUT:
        setIsInput(IS_INPUT_EDEFAULT);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        setIsOutput(IS_OUTPUT_EDEFAULT);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case SynctextPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
        setVarCombineOperator(VAR_COMBINE_OPERATOR_EDEFAULT);
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
      case SynctextPackage.VARIABLE_DEFINITION__TYPE:
        return type != null;
      case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return getOwningType() != null;
      case SynctextPackage.VARIABLE_DEFINITION__READONLY:
        return readonly != READONLY_EDEFAULT;
      case SynctextPackage.VARIABLE_DEFINITION__EXTERNAL:
        return external != EXTERNAL_EDEFAULT;
      case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return initialValue != null;
      case SynctextPackage.VARIABLE_DEFINITION__IS_INPUT:
        return isInput != IS_INPUT_EDEFAULT;
      case SynctextPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        return isOutput != IS_OUTPUT_EDEFAULT;
      case SynctextPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case SynctextPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
        return varCombineOperator != VAR_COMBINE_OPERATOR_EDEFAULT;
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
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case SynctextPackage.VARIABLE_DEFINITION__TYPE: return TypesPackage.TYPED_ELEMENT__TYPE;
        default: return -1;
      }
    }
    if (baseClass == Feature.class)
    {
      switch (derivedFeatureID)
      {
        case SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE: return TypesPackage.FEATURE__OWNING_TYPE;
        default: return -1;
      }
    }
    if (baseClass == Property.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == org.yakindu.sct.model.stext.stext.VariableDefinition.class)
    {
      switch (derivedFeatureID)
      {
        case SynctextPackage.VARIABLE_DEFINITION__READONLY: return StextPackage.VARIABLE_DEFINITION__READONLY;
        case SynctextPackage.VARIABLE_DEFINITION__EXTERNAL: return StextPackage.VARIABLE_DEFINITION__EXTERNAL;
        case SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE: return StextPackage.VARIABLE_DEFINITION__INITIAL_VALUE;
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
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case TypesPackage.TYPED_ELEMENT__TYPE: return SynctextPackage.VARIABLE_DEFINITION__TYPE;
        default: return -1;
      }
    }
    if (baseClass == Feature.class)
    {
      switch (baseFeatureID)
      {
        case TypesPackage.FEATURE__OWNING_TYPE: return SynctextPackage.VARIABLE_DEFINITION__OWNING_TYPE;
        default: return -1;
      }
    }
    if (baseClass == Property.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == org.yakindu.sct.model.stext.stext.VariableDefinition.class)
    {
      switch (baseFeatureID)
      {
        case StextPackage.VARIABLE_DEFINITION__READONLY: return SynctextPackage.VARIABLE_DEFINITION__READONLY;
        case StextPackage.VARIABLE_DEFINITION__EXTERNAL: return SynctextPackage.VARIABLE_DEFINITION__EXTERNAL;
        case StextPackage.VARIABLE_DEFINITION__INITIAL_VALUE: return SynctextPackage.VARIABLE_DEFINITION__INITIAL_VALUE;
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
    result.append(" (readonly: ");
    result.append(readonly);
    result.append(", external: ");
    result.append(external);
    result.append(", isInput: ");
    result.append(isInput);
    result.append(", isOutput: ");
    result.append(isOutput);
    result.append(", isStatic: ");
    result.append(isStatic);
    result.append(", varCombineOperator: ");
    result.append(varCombineOperator);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
