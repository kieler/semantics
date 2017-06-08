/**
 */
package de.cau.cs.kieler.kvis.impl;

import de.cau.cs.kieler.kvis.KvisPackage;
import de.cau.cs.kieler.kvis.ModelReference;
import de.cau.cs.kieler.kvis.VariableReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.VariableReferenceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.VariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.VariableReferenceImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableReferenceImpl extends MinimalEObjectImpl.Container implements VariableReference
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected ModelReference model;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected VariableReferenceImpl()
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
    return KvisPackage.Literals.VARIABLE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelReference getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(ModelReference newModel, NotificationChain msgs)
  {
    ModelReference oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KvisPackage.VARIABLE_REFERENCE__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(ModelReference newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KvisPackage.VARIABLE_REFERENCE__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KvisPackage.VARIABLE_REFERENCE__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.VARIABLE_REFERENCE__MODEL, newModel, newModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.VARIABLE_REFERENCE__NAME, oldName, name));
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
      indices = new EDataTypeEList<Integer>(Integer.class, this, KvisPackage.VARIABLE_REFERENCE__INDICES);
    }
    return indices;
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
      case KvisPackage.VARIABLE_REFERENCE__MODEL:
        return basicSetModel(null, msgs);
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
      case KvisPackage.VARIABLE_REFERENCE__MODEL:
        return getModel();
      case KvisPackage.VARIABLE_REFERENCE__NAME:
        return getName();
      case KvisPackage.VARIABLE_REFERENCE__INDICES:
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
      case KvisPackage.VARIABLE_REFERENCE__MODEL:
        setModel((ModelReference)newValue);
        return;
      case KvisPackage.VARIABLE_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case KvisPackage.VARIABLE_REFERENCE__INDICES:
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
      case KvisPackage.VARIABLE_REFERENCE__MODEL:
        setModel((ModelReference)null);
        return;
      case KvisPackage.VARIABLE_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KvisPackage.VARIABLE_REFERENCE__INDICES:
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
      case KvisPackage.VARIABLE_REFERENCE__MODEL:
        return model != null;
      case KvisPackage.VARIABLE_REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KvisPackage.VARIABLE_REFERENCE__INDICES:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", indices: ");
    result.append(indices);
    result.append(')');
    return result.toString();
  }

} //VariableReferenceImpl
