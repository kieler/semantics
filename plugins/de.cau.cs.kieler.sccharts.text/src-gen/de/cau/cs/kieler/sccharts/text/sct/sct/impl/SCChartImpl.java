/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct.impl;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import de.cau.cs.kieler.sccharts.impl.StateImpl;

import de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl;
import de.cau.cs.kieler.sccharts.text.sct.sct.SCChart;
import de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage;

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
 * An implementation of the model object '<em><b>SC Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCChartImpl extends StateImpl implements SCChart
{
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDecl> imports;

  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SCChartImpl()
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
    return SctPackage.Literals.SC_CHART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SctPackage.SC_CHART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDecl> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDecl>(ImportDecl.class, this, SctPackage.SC_CHART__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclaration()
  {
    if (declaration == null)
    {
      declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, SctPackage.SC_CHART__DECLARATION);
    }
    return declaration;
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
      case SctPackage.SC_CHART__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SctPackage.SC_CHART__DECLARATION:
        return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
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
      case SctPackage.SC_CHART__NAME:
        return getName();
      case SctPackage.SC_CHART__IMPORTS:
        return getImports();
      case SctPackage.SC_CHART__DECLARATION:
        return getDeclaration();
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
      case SctPackage.SC_CHART__NAME:
        setName((String)newValue);
        return;
      case SctPackage.SC_CHART__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDecl>)newValue);
        return;
      case SctPackage.SC_CHART__DECLARATION:
        getDeclaration().clear();
        getDeclaration().addAll((Collection<? extends Declaration>)newValue);
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
      case SctPackage.SC_CHART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SctPackage.SC_CHART__IMPORTS:
        getImports().clear();
        return;
      case SctPackage.SC_CHART__DECLARATION:
        getDeclaration().clear();
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
      case SctPackage.SC_CHART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SctPackage.SC_CHART__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SctPackage.SC_CHART__DECLARATION:
        return declaration != null && !declaration.isEmpty();
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

} //SCChartImpl
