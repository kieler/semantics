/**
 */
package de.cau.cs.kieler.simulation.kisim.impl;

import de.cau.cs.kieler.simulation.kisim.Action;
import de.cau.cs.kieler.simulation.kisim.ActionOperation;
import de.cau.cs.kieler.simulation.kisim.KisimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.ActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.ActionImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.ActionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final ActionOperation OPERATION_EDEFAULT = ActionOperation.WRITE;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected ActionOperation operation = OPERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected static final String HANDLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected String handler = HANDLER_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return KisimPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(ActionOperation newOperation)
  {
    ActionOperation oldOperation = operation;
    operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KisimPackage.ACTION__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(String newHandler)
  {
    String oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KisimPackage.ACTION__HANDLER, oldHandler, handler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KisimPackage.ACTION__ID, oldId, id));
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
      case KisimPackage.ACTION__OPERATION:
        return getOperation();
      case KisimPackage.ACTION__HANDLER:
        return getHandler();
      case KisimPackage.ACTION__ID:
        return getId();
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
      case KisimPackage.ACTION__OPERATION:
        setOperation((ActionOperation)newValue);
        return;
      case KisimPackage.ACTION__HANDLER:
        setHandler((String)newValue);
        return;
      case KisimPackage.ACTION__ID:
        setId((String)newValue);
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
      case KisimPackage.ACTION__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case KisimPackage.ACTION__HANDLER:
        setHandler(HANDLER_EDEFAULT);
        return;
      case KisimPackage.ACTION__ID:
        setId(ID_EDEFAULT);
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
      case KisimPackage.ACTION__OPERATION:
        return operation != OPERATION_EDEFAULT;
      case KisimPackage.ACTION__HANDLER:
        return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
      case KisimPackage.ACTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (operation: ");
    result.append(operation);
    result.append(", handler: ");
    result.append(handler);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
