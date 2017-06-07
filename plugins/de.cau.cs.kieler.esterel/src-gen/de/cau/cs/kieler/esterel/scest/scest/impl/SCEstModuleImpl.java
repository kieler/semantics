/**
 */
package de.cau.cs.kieler.esterel.scest.scest.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;

import de.cau.cs.kieler.esterel.scest.scest.SCEstModule;
import de.cau.cs.kieler.esterel.scest.scest.ScestPackage;

import de.cau.cs.kieler.kexpressions.Declaration;

import de.cau.cs.kieler.scl.scl.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC Est Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCEstModuleImpl extends MinimalEObjectImpl.Container implements SCEstModule
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
   * The cached value of the '{@link #getIntSignalDecls() <em>Int Signal Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSignalDecls()
   * @generated
   * @ordered
   */
  protected EList<InterfaceSignalDecl> intSignalDecls;

  /**
   * The cached value of the '{@link #getIntTypeDecls() <em>Int Type Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntTypeDecls()
   * @generated
   * @ordered
   */
  protected EList<TypeDecl> intTypeDecls;

  /**
   * The cached value of the '{@link #getIntSensorDecls() <em>Int Sensor Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSensorDecls()
   * @generated
   * @ordered
   */
  protected EList<SensorDecl> intSensorDecls;

  /**
   * The cached value of the '{@link #getIntConstantDecls() <em>Int Constant Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntConstantDecls()
   * @generated
   * @ordered
   */
  protected EList<ConstantDecls> intConstantDecls;

  /**
   * The cached value of the '{@link #getIntRelationDecls() <em>Int Relation Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntRelationDecls()
   * @generated
   * @ordered
   */
  protected EList<RelationDecl> intRelationDecls;

  /**
   * The cached value of the '{@link #getIntTaskDecls() <em>Int Task Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntTaskDecls()
   * @generated
   * @ordered
   */
  protected EList<TaskDecl> intTaskDecls;

  /**
   * The cached value of the '{@link #getIntFunctionDecls() <em>Int Function Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntFunctionDecls()
   * @generated
   * @ordered
   */
  protected EList<FunctionDecl> intFunctionDecls;

  /**
   * The cached value of the '{@link #getIntProcedureDecls() <em>Int Procedure Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntProcedureDecls()
   * @generated
   * @ordered
   */
  protected EList<ProcedureDecl> intProcedureDecls;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SCEstModuleImpl()
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
    return ScestPackage.Literals.SC_EST_MODULE;
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
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ScestPackage.SC_EST_MODULE__ANNOTATIONS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScestPackage.SC_EST_MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceSignalDecl> getIntSignalDecls()
  {
    if (intSignalDecls == null)
    {
      intSignalDecls = new EObjectContainmentEList<InterfaceSignalDecl>(InterfaceSignalDecl.class, this, ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS);
    }
    return intSignalDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDecl> getIntTypeDecls()
  {
    if (intTypeDecls == null)
    {
      intTypeDecls = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS);
    }
    return intTypeDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SensorDecl> getIntSensorDecls()
  {
    if (intSensorDecls == null)
    {
      intSensorDecls = new EObjectContainmentEList<SensorDecl>(SensorDecl.class, this, ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS);
    }
    return intSensorDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDecls> getIntConstantDecls()
  {
    if (intConstantDecls == null)
    {
      intConstantDecls = new EObjectContainmentEList<ConstantDecls>(ConstantDecls.class, this, ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS);
    }
    return intConstantDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationDecl> getIntRelationDecls()
  {
    if (intRelationDecls == null)
    {
      intRelationDecls = new EObjectContainmentEList<RelationDecl>(RelationDecl.class, this, ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS);
    }
    return intRelationDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskDecl> getIntTaskDecls()
  {
    if (intTaskDecls == null)
    {
      intTaskDecls = new EObjectContainmentEList<TaskDecl>(TaskDecl.class, this, ScestPackage.SC_EST_MODULE__INT_TASK_DECLS);
    }
    return intTaskDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDecl> getIntFunctionDecls()
  {
    if (intFunctionDecls == null)
    {
      intFunctionDecls = new EObjectContainmentEList<FunctionDecl>(FunctionDecl.class, this, ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS);
    }
    return intFunctionDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcedureDecl> getIntProcedureDecls()
  {
    if (intProcedureDecls == null)
    {
      intProcedureDecls = new EObjectContainmentEList<ProcedureDecl>(ProcedureDecl.class, this, ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS);
    }
    return intProcedureDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, ScestPackage.SC_EST_MODULE__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, ScestPackage.SC_EST_MODULE__DECLARATIONS);
    }
    return declarations;
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
      case ScestPackage.SC_EST_MODULE__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS:
        return ((InternalEList<?>)getIntSignalDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS:
        return ((InternalEList<?>)getIntTypeDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS:
        return ((InternalEList<?>)getIntSensorDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS:
        return ((InternalEList<?>)getIntConstantDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS:
        return ((InternalEList<?>)getIntRelationDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_TASK_DECLS:
        return ((InternalEList<?>)getIntTaskDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS:
        return ((InternalEList<?>)getIntFunctionDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS:
        return ((InternalEList<?>)getIntProcedureDecls()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case ScestPackage.SC_EST_MODULE__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case ScestPackage.SC_EST_MODULE__ANNOTATIONS:
        return getAnnotations();
      case ScestPackage.SC_EST_MODULE__NAME:
        return getName();
      case ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS:
        return getIntSignalDecls();
      case ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS:
        return getIntTypeDecls();
      case ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS:
        return getIntSensorDecls();
      case ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS:
        return getIntConstantDecls();
      case ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS:
        return getIntRelationDecls();
      case ScestPackage.SC_EST_MODULE__INT_TASK_DECLS:
        return getIntTaskDecls();
      case ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS:
        return getIntFunctionDecls();
      case ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS:
        return getIntProcedureDecls();
      case ScestPackage.SC_EST_MODULE__STATEMENTS:
        return getStatements();
      case ScestPackage.SC_EST_MODULE__DECLARATIONS:
        return getDeclarations();
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
      case ScestPackage.SC_EST_MODULE__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__NAME:
        setName((String)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        getIntSignalDecls().addAll((Collection<? extends InterfaceSignalDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        getIntTypeDecls().addAll((Collection<? extends TypeDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        getIntSensorDecls().addAll((Collection<? extends SensorDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        getIntConstantDecls().addAll((Collection<? extends ConstantDecls>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        getIntRelationDecls().addAll((Collection<? extends RelationDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        getIntTaskDecls().addAll((Collection<? extends TaskDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        getIntFunctionDecls().addAll((Collection<? extends FunctionDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS:
        getIntProcedureDecls().clear();
        getIntProcedureDecls().addAll((Collection<? extends ProcedureDecl>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case ScestPackage.SC_EST_MODULE__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Declaration>)newValue);
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
      case ScestPackage.SC_EST_MODULE__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case ScestPackage.SC_EST_MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS:
        getIntProcedureDecls().clear();
        return;
      case ScestPackage.SC_EST_MODULE__STATEMENTS:
        getStatements().clear();
        return;
      case ScestPackage.SC_EST_MODULE__DECLARATIONS:
        getDeclarations().clear();
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
      case ScestPackage.SC_EST_MODULE__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case ScestPackage.SC_EST_MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScestPackage.SC_EST_MODULE__INT_SIGNAL_DECLS:
        return intSignalDecls != null && !intSignalDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_TYPE_DECLS:
        return intTypeDecls != null && !intTypeDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_SENSOR_DECLS:
        return intSensorDecls != null && !intSensorDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_CONSTANT_DECLS:
        return intConstantDecls != null && !intConstantDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_RELATION_DECLS:
        return intRelationDecls != null && !intRelationDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_TASK_DECLS:
        return intTaskDecls != null && !intTaskDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_FUNCTION_DECLS:
        return intFunctionDecls != null && !intFunctionDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__INT_PROCEDURE_DECLS:
        return intProcedureDecls != null && !intProcedureDecls.isEmpty();
      case ScestPackage.SC_EST_MODULE__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case ScestPackage.SC_EST_MODULE__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
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

} //SCEstModuleImpl
