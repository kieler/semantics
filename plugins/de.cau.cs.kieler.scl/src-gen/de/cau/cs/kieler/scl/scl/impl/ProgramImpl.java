/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.core.annotations.Annotation;

import de.cau.cs.kieler.core.kexpressions.TypeGroup;

import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.scl.SclPackage;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ProgramImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ProgramImpl#getTypeGroups <em>Type Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends StatementSequenceImpl implements Program
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

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
   * The cached value of the '{@link #getTypeGroups() <em>Type Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeGroups()
   * @generated
   * @ordered
   */
  protected EList<TypeGroup> typeGroups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return SclPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SclPackage.PROGRAM__ANNOTATIONS);
    }
    return annotations;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeGroup> getTypeGroups()
  {
    if (typeGroups == null)
    {
      typeGroups = new EObjectContainmentEList<TypeGroup>(TypeGroup.class, this, SclPackage.PROGRAM__TYPE_GROUPS);
    }
    return typeGroups;
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
      case SclPackage.PROGRAM__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case SclPackage.PROGRAM__TYPE_GROUPS:
        return ((InternalEList<?>)getTypeGroups()).basicRemove(otherEnd, msgs);
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
      case SclPackage.PROGRAM__ANNOTATIONS:
        return getAnnotations();
      case SclPackage.PROGRAM__NAME:
        return getName();
      case SclPackage.PROGRAM__TYPE_GROUPS:
        return getTypeGroups();
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
      case SclPackage.PROGRAM__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case SclPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case SclPackage.PROGRAM__TYPE_GROUPS:
        getTypeGroups().clear();
        getTypeGroups().addAll((Collection<? extends TypeGroup>)newValue);
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
      case SclPackage.PROGRAM__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case SclPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SclPackage.PROGRAM__TYPE_GROUPS:
        getTypeGroups().clear();
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
      case SclPackage.PROGRAM__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case SclPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SclPackage.PROGRAM__TYPE_GROUPS:
        return typeGroups != null && !typeGroups.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
