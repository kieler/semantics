/**
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.s.s.HostCodeInstruction;
import de.cau.cs.kieler.s.s.SPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Code Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.HostCodeInstructionImpl#getHostCode <em>Host Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostCodeInstructionImpl extends InstructionImpl implements HostCodeInstruction
{
  /**
   * The default value of the '{@link #getHostCode() <em>Host Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostCode()
   * @generated
   * @ordered
   */
  protected static final String HOST_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostCode() <em>Host Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostCode()
   * @generated
   * @ordered
   */
  protected String hostCode = HOST_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HostCodeInstructionImpl()
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
    return SPackage.Literals.HOST_CODE_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHostCode()
  {
    return hostCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostCode(String newHostCode)
  {
    String oldHostCode = hostCode;
    hostCode = newHostCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.HOST_CODE_INSTRUCTION__HOST_CODE, oldHostCode, hostCode));
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
      case SPackage.HOST_CODE_INSTRUCTION__HOST_CODE:
        return getHostCode();
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
      case SPackage.HOST_CODE_INSTRUCTION__HOST_CODE:
        setHostCode((String)newValue);
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
      case SPackage.HOST_CODE_INSTRUCTION__HOST_CODE:
        setHostCode(HOST_CODE_EDEFAULT);
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
      case SPackage.HOST_CODE_INSTRUCTION__HOST_CODE:
        return HOST_CODE_EDEFAULT == null ? hostCode != null : !HOST_CODE_EDEFAULT.equals(hostCode);
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
    result.append(" (hostCode: ");
    result.append(hostCode);
    result.append(')');
    return result.toString();
  }

} //HostCodeInstructionImpl
