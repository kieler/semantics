/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.CombineOperator;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.kieler.scc.model.scctext.sccexp.VarDirection;
import de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.yakindu.base.types.Feature;
import org.yakindu.base.types.Property;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.TypedElement;
import org.yakindu.base.types.TypesPackage;

import org.yakindu.sct.model.sgraph.Variable;

import org.yakindu.sct.model.sgraph.impl.DeclarationImpl;

import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#isExternal <em>External</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getVarType <em>Var Type</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getVarInitialValue <em>Var Initial Value</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends DeclarationImpl implements VariableDefinition
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
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final VarDirection DIRECTION_EDEFAULT = VarDirection.INOUT;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected VarDirection direction = DIRECTION_EDEFAULT;

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
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarType() <em>Var Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarType()
   * @generated
   * @ordered
   */
  protected Type varType;

  /**
   * The cached value of the '{@link #getVarInitialValue() <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarInitialValue()
   * @generated
   * @ordered
   */
  protected Expression varInitialValue;

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
    return SccexpPackage.Literals.VARIABLE_DEFINITION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SccexpPackage.VARIABLE_DEFINITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getOwningType()
  {
    if (eContainerFeatureID() != SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE) return null;
    return (Type)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningType(Type newOwningType, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningType, SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningType(Type newOwningType)
  {
    if (newOwningType != eInternalContainer() || (eContainerFeatureID() != SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE && newOwningType != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningType))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningType != null)
        msgs = ((InternalEObject)newOwningType).eInverseAdd(this, TypesPackage.TYPE__FEATURES, Type.class, msgs);
      msgs = basicSetOwningType(newOwningType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE, newOwningType, newOwningType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__READONLY, oldReadonly, readonly));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__EXTERNAL, oldExternal, external));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE, newInitialValue, newInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(VarDirection newDirection)
  {
    VarDirection oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__DIRECTION, oldDirection, direction));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__IS_STATIC, oldIsStatic, isStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getVarType()
  {
    if (varType != null && varType.eIsProxy())
    {
      InternalEObject oldVarType = (InternalEObject)varType;
      varType = (Type)eResolveProxy(oldVarType);
      if (varType != oldVarType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE, oldVarType, varType));
      }
    }
    return varType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetVarType()
  {
    return varType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarType(Type newVarType)
  {
    Type oldVarType = varType;
    varType = newVarType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE, oldVarType, varType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVarInitialValue()
  {
    return varInitialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarInitialValue(Expression newVarInitialValue, NotificationChain msgs)
  {
    Expression oldVarInitialValue = varInitialValue;
    varInitialValue = newVarInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, oldVarInitialValue, newVarInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarInitialValue(Expression newVarInitialValue)
  {
    if (newVarInitialValue != varInitialValue)
    {
      NotificationChain msgs = null;
      if (varInitialValue != null)
        msgs = ((InternalEObject)varInitialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      if (newVarInitialValue != null)
        msgs = ((InternalEObject)newVarInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      msgs = basicSetVarInitialValue(newVarInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, newVarInitialValue, newVarInitialValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SccexpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR, oldVarCombineOperator, varCombineOperator));
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
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningType((Type)otherEnd, msgs);
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
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return basicSetOwningType(null, msgs);
      case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
      case SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return basicSetVarInitialValue(null, msgs);
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
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return eInternalContainer().eInverseRemove(this, TypesPackage.TYPE__FEATURES, Type.class, msgs);
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
      case SccexpPackage.VARIABLE_DEFINITION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return getOwningType();
      case SccexpPackage.VARIABLE_DEFINITION__READONLY:
        return isReadonly();
      case SccexpPackage.VARIABLE_DEFINITION__EXTERNAL:
        return isExternal();
      case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return getInitialValue();
      case SccexpPackage.VARIABLE_DEFINITION__DIRECTION:
        return getDirection();
      case SccexpPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isIsStatic();
      case SccexpPackage.VARIABLE_DEFINITION__VAR_NAME:
        return getVarName();
      case SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE:
        if (resolve) return getVarType();
        return basicGetVarType();
      case SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return getVarInitialValue();
      case SccexpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SccexpPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        setOwningType((Type)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__READONLY:
        setReadonly((Boolean)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__EXTERNAL:
        setExternal((Boolean)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        setInitialValue((Expression)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__DIRECTION:
        setDirection((VarDirection)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic((Boolean)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_NAME:
        setVarName((String)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE:
        setVarType((Type)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)newValue);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SccexpPackage.VARIABLE_DEFINITION__TYPE:
        setType((Type)null);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        setOwningType((Type)null);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__READONLY:
        setReadonly(READONLY_EDEFAULT);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        setInitialValue((Expression)null);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE:
        setVarType((Type)null);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)null);
        return;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SccexpPackage.VARIABLE_DEFINITION__TYPE:
        return type != null;
      case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE:
        return getOwningType() != null;
      case SccexpPackage.VARIABLE_DEFINITION__READONLY:
        return readonly != READONLY_EDEFAULT;
      case SccexpPackage.VARIABLE_DEFINITION__EXTERNAL:
        return external != EXTERNAL_EDEFAULT;
      case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE:
        return initialValue != null;
      case SccexpPackage.VARIABLE_DEFINITION__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case SccexpPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case SccexpPackage.VARIABLE_DEFINITION__VAR_TYPE:
        return varType != null;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return varInitialValue != null;
      case SccexpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
    if (baseClass == Variable.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case SccexpPackage.VARIABLE_DEFINITION__TYPE: return TypesPackage.TYPED_ELEMENT__TYPE;
        default: return -1;
      }
    }
    if (baseClass == Feature.class)
    {
      switch (derivedFeatureID)
      {
        case SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE: return TypesPackage.FEATURE__OWNING_TYPE;
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
        case SccexpPackage.VARIABLE_DEFINITION__READONLY: return StextPackage.VARIABLE_DEFINITION__READONLY;
        case SccexpPackage.VARIABLE_DEFINITION__EXTERNAL: return StextPackage.VARIABLE_DEFINITION__EXTERNAL;
        case SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE: return StextPackage.VARIABLE_DEFINITION__INITIAL_VALUE;
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
    if (baseClass == Variable.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case TypesPackage.TYPED_ELEMENT__TYPE: return SccexpPackage.VARIABLE_DEFINITION__TYPE;
        default: return -1;
      }
    }
    if (baseClass == Feature.class)
    {
      switch (baseFeatureID)
      {
        case TypesPackage.FEATURE__OWNING_TYPE: return SccexpPackage.VARIABLE_DEFINITION__OWNING_TYPE;
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
        case StextPackage.VARIABLE_DEFINITION__READONLY: return SccexpPackage.VARIABLE_DEFINITION__READONLY;
        case StextPackage.VARIABLE_DEFINITION__EXTERNAL: return SccexpPackage.VARIABLE_DEFINITION__EXTERNAL;
        case StextPackage.VARIABLE_DEFINITION__INITIAL_VALUE: return SccexpPackage.VARIABLE_DEFINITION__INITIAL_VALUE;
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
    result.append(", direction: ");
    result.append(direction);
    result.append(", isStatic: ");
    result.append(isStatic);
    result.append(", varName: ");
    result.append(varName);
    result.append(", varCombineOperator: ");
    result.append(varCombineOperator);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
