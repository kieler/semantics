/**
 */
package de.cau.cs.kieler.kivis.kivis.util;

import de.cau.cs.kieler.kivis.kivis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage
 * @generated
 */
public class KivisAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KivisPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KivisAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KivisPackage.eINSTANCE;
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
  protected KivisSwitch<Adapter> modelSwitch =
    new KivisSwitch<Adapter>()
    {
      @Override
      public Adapter caseVisualizationConfiguration(VisualizationConfiguration object)
      {
        return createVisualizationConfigurationAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseInteraction(Interaction object)
      {
        return createInteractionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseAnimation(Animation object)
      {
        return createAnimationAdapter();
      }
      @Override
      public Adapter caseAttributeMapping(AttributeMapping object)
      {
        return createAttributeMappingAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseInterval(Interval object)
      {
        return createIntervalAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseModelReference(ModelReference object)
      {
        return createModelReferenceAdapter();
      }
      @Override
      public Adapter caseBooleanOperator(BooleanOperator object)
      {
        return createBooleanOperatorAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseKibuild_AttributeMapping(de.cau.cs.kieler.prom.kibuild.AttributeMapping object)
      {
        return createKibuild_AttributeMappingAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration <em>Visualization Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration
   * @generated
   */
  public Adapter createVisualizationConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Interaction
   * @generated
   */
  public Adapter createInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Animation <em>Animation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Animation
   * @generated
   */
  public Adapter createAnimationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.AttributeMapping <em>Attribute Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.AttributeMapping
   * @generated
   */
  public Adapter createAttributeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.Interval
   * @generated
   */
  public Adapter createIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.ModelReference
   * @generated
   */
  public Adapter createModelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.BooleanOperator <em>Boolean Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.BooleanOperator
   * @generated
   */
  public Adapter createBooleanOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kivis.kivis.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kivis.kivis.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
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
  public Adapter createKibuild_AttributeMappingAdapter()
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

} //KivisAdapterFactory
