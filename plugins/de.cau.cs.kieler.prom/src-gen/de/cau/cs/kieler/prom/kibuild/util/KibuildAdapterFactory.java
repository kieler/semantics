/**
 */
package de.cau.cs.kieler.prom.kibuild.util;

import de.cau.cs.kieler.prom.kibuild.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage
 * @generated
 */
public class KibuildAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KibuildPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KibuildAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KibuildPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KibuildSwitch<Adapter> modelSwitch =
    new KibuildSwitch<Adapter>()
    {
      @Override
      public Adapter caseBuildConfiguration(BuildConfiguration object)
      {
        return createBuildConfigurationAdapter();
      }
      @Override
      public Adapter caseModelCompiler(ModelCompiler object)
      {
        return createModelCompilerAdapter();
      }
      @Override
      public Adapter caseSimulationCompiler(SimulationCompiler object)
      {
        return createSimulationCompilerAdapter();
      }
      @Override
      public Adapter caseTemplateProcessor(TemplateProcessor object)
      {
        return createTemplateProcessorAdapter();
      }
      @Override
      public Adapter caseAttributeMapping(AttributeMapping object)
      {
        return createAttributeMappingAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseSignedFloat(SignedFloat object)
      {
        return createSignedFloatAdapter();
      }
      @Override
      public Adapter caseSignedInt(SignedInt object)
      {
        return createSignedIntAdapter();
      }
      @Override
      public Adapter caseTextValue(TextValue object)
      {
        return createTextValueAdapter();
      }
      @Override
      public Adapter caseNormalTemplateProcessor(NormalTemplateProcessor object)
      {
        return createNormalTemplateProcessorAdapter();
      }
      @Override
      public Adapter caseSimulationTemplateProcessor(SimulationTemplateProcessor object)
      {
        return createSimulationTemplateProcessorAdapter();
      }
      @Override
      public Adapter caseWrapperCodeTemplateProcessor(WrapperCodeTemplateProcessor object)
      {
        return createWrapperCodeTemplateProcessorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration <em>Build Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration
   * @generated
   */
  public Adapter createBuildConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler <em>Model Compiler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.ModelCompiler
   * @generated
   */
  public Adapter createModelCompilerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.SimulationCompiler <em>Simulation Compiler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationCompiler
   * @generated
   */
  public Adapter createSimulationCompilerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.TemplateProcessor <em>Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.TemplateProcessor
   * @generated
   */
  public Adapter createTemplateProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping <em>Attribute Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping
   * @generated
   */
  public Adapter createAttributeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat <em>Signed Float</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.SignedFloat
   * @generated
   */
  public Adapter createSignedFloatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.SignedInt <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.SignedInt
   * @generated
   */
  public Adapter createSignedIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.TextValue <em>Text Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.TextValue
   * @generated
   */
  public Adapter createTextValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor <em>Normal Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor
   * @generated
   */
  public Adapter createNormalTemplateProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor <em>Simulation Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor
   * @generated
   */
  public Adapter createSimulationTemplateProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor <em>Wrapper Code Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor
   * @generated
   */
  public Adapter createWrapperCodeTemplateProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //KibuildAdapterFactory
