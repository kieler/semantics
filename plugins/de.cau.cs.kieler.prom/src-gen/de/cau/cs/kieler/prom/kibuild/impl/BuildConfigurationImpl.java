/**
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration;
import de.cau.cs.kieler.prom.kibuild.KibuildPackage;
import de.cau.cs.kieler.prom.kibuild.ModelCompiler;
import de.cau.cs.kieler.prom.kibuild.SimulationCompiler;
import de.cau.cs.kieler.prom.kibuild.TemplateProcessor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl#getModelCompilers <em>Model Compilers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl#getSimulationCompilers <em>Simulation Compilers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl#getTemplateProcessors <em>Template Processors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildConfigurationImpl extends MinimalEObjectImpl.Container implements BuildConfiguration
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeMapping> attributes;

  /**
   * The cached value of the '{@link #getModelCompilers() <em>Model Compilers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelCompilers()
   * @generated
   * @ordered
   */
  protected EList<ModelCompiler> modelCompilers;

  /**
   * The cached value of the '{@link #getSimulationCompilers() <em>Simulation Compilers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimulationCompilers()
   * @generated
   * @ordered
   */
  protected EList<SimulationCompiler> simulationCompilers;

  /**
   * The cached value of the '{@link #getTemplateProcessors() <em>Template Processors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateProcessors()
   * @generated
   * @ordered
   */
  protected EList<TemplateProcessor> templateProcessors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildConfigurationImpl()
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
    return KibuildPackage.Literals.BUILD_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeMapping> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelCompiler> getModelCompilers()
  {
    if (modelCompilers == null)
    {
      modelCompilers = new EObjectContainmentEList<ModelCompiler>(ModelCompiler.class, this, KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS);
    }
    return modelCompilers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimulationCompiler> getSimulationCompilers()
  {
    if (simulationCompilers == null)
    {
      simulationCompilers = new EObjectContainmentEList<SimulationCompiler>(SimulationCompiler.class, this, KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS);
    }
    return simulationCompilers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateProcessor> getTemplateProcessors()
  {
    if (templateProcessors == null)
    {
      templateProcessors = new EObjectContainmentEList<TemplateProcessor>(TemplateProcessor.class, this, KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS);
    }
    return templateProcessors;
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
      case KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS:
        return ((InternalEList<?>)getModelCompilers()).basicRemove(otherEnd, msgs);
      case KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS:
        return ((InternalEList<?>)getSimulationCompilers()).basicRemove(otherEnd, msgs);
      case KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS:
        return ((InternalEList<?>)getTemplateProcessors()).basicRemove(otherEnd, msgs);
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
      case KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES:
        return getAttributes();
      case KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS:
        return getModelCompilers();
      case KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS:
        return getSimulationCompilers();
      case KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS:
        return getTemplateProcessors();
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
      case KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeMapping>)newValue);
        return;
      case KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS:
        getModelCompilers().clear();
        getModelCompilers().addAll((Collection<? extends ModelCompiler>)newValue);
        return;
      case KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS:
        getSimulationCompilers().clear();
        getSimulationCompilers().addAll((Collection<? extends SimulationCompiler>)newValue);
        return;
      case KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS:
        getTemplateProcessors().clear();
        getTemplateProcessors().addAll((Collection<? extends TemplateProcessor>)newValue);
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
      case KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES:
        getAttributes().clear();
        return;
      case KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS:
        getModelCompilers().clear();
        return;
      case KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS:
        getSimulationCompilers().clear();
        return;
      case KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS:
        getTemplateProcessors().clear();
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
      case KibuildPackage.BUILD_CONFIGURATION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case KibuildPackage.BUILD_CONFIGURATION__MODEL_COMPILERS:
        return modelCompilers != null && !modelCompilers.isEmpty();
      case KibuildPackage.BUILD_CONFIGURATION__SIMULATION_COMPILERS:
        return simulationCompilers != null && !simulationCompilers.isEmpty();
      case KibuildPackage.BUILD_CONFIGURATION__TEMPLATE_PROCESSORS:
        return templateProcessors != null && !templateProcessors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BuildConfigurationImpl
