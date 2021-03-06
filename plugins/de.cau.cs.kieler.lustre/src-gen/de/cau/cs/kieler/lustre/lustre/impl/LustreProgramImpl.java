/**
 * generated by Xtext
 */
package de.cau.cs.kieler.lustre.lustre.impl;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;

import de.cau.cs.kieler.lustre.lustre.LustrePackage;
import de.cau.cs.kieler.lustre.lustre.LustreProgram;
import de.cau.cs.kieler.lustre.lustre.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl#getExternals <em>Externals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LustreProgramImpl extends MinimalEObjectImpl.Container implements LustreProgram
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<String> includes;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> constants;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeDeclaration> types;

  /**
   * The cached value of the '{@link #getExternals() <em>Externals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternals()
   * @generated
   * @ordered
   */
  protected EList<Declaration> externals;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Declaration> nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LustreProgramImpl()
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
    return LustrePackage.Literals.LUSTRE_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getIncludes()
  {
    if (includes == null)
    {
      includes = new EDataTypeEList<String>(String.class, this, LustrePackage.LUSTRE_PROGRAM__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableDeclaration> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, LustrePackage.LUSTRE_PROGRAM__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TypeDeclaration> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<TypeDeclaration>(TypeDeclaration.class, this, LustrePackage.LUSTRE_PROGRAM__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Declaration> getExternals()
  {
    if (externals == null)
    {
      externals = new EObjectContainmentEList<Declaration>(Declaration.class, this, LustrePackage.LUSTRE_PROGRAM__EXTERNALS);
    }
    return externals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Declaration> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Declaration>(Declaration.class, this, LustrePackage.LUSTRE_PROGRAM__NODES);
    }
    return nodes;
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
      case LustrePackage.LUSTRE_PROGRAM__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case LustrePackage.LUSTRE_PROGRAM__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case LustrePackage.LUSTRE_PROGRAM__EXTERNALS:
        return ((InternalEList<?>)getExternals()).basicRemove(otherEnd, msgs);
      case LustrePackage.LUSTRE_PROGRAM__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
      case LustrePackage.LUSTRE_PROGRAM__INCLUDES:
        return getIncludes();
      case LustrePackage.LUSTRE_PROGRAM__CONSTANTS:
        return getConstants();
      case LustrePackage.LUSTRE_PROGRAM__TYPES:
        return getTypes();
      case LustrePackage.LUSTRE_PROGRAM__EXTERNALS:
        return getExternals();
      case LustrePackage.LUSTRE_PROGRAM__NODES:
        return getNodes();
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
      case LustrePackage.LUSTRE_PROGRAM__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends String>)newValue);
        return;
      case LustrePackage.LUSTRE_PROGRAM__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case LustrePackage.LUSTRE_PROGRAM__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeDeclaration>)newValue);
        return;
      case LustrePackage.LUSTRE_PROGRAM__EXTERNALS:
        getExternals().clear();
        getExternals().addAll((Collection<? extends Declaration>)newValue);
        return;
      case LustrePackage.LUSTRE_PROGRAM__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Declaration>)newValue);
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
      case LustrePackage.LUSTRE_PROGRAM__INCLUDES:
        getIncludes().clear();
        return;
      case LustrePackage.LUSTRE_PROGRAM__CONSTANTS:
        getConstants().clear();
        return;
      case LustrePackage.LUSTRE_PROGRAM__TYPES:
        getTypes().clear();
        return;
      case LustrePackage.LUSTRE_PROGRAM__EXTERNALS:
        getExternals().clear();
        return;
      case LustrePackage.LUSTRE_PROGRAM__NODES:
        getNodes().clear();
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
      case LustrePackage.LUSTRE_PROGRAM__INCLUDES:
        return includes != null && !includes.isEmpty();
      case LustrePackage.LUSTRE_PROGRAM__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case LustrePackage.LUSTRE_PROGRAM__TYPES:
        return types != null && !types.isEmpty();
      case LustrePackage.LUSTRE_PROGRAM__EXTERNALS:
        return externals != null && !externals.isEmpty();
      case LustrePackage.LUSTRE_PROGRAM__NODES:
        return nodes != null && !nodes.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (includes: ");
    result.append(includes);
    result.append(')');
    return result.toString();
  }

} //LustreProgramImpl
