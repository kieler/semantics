/**
 */
package de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.util;

import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.sgraph.Effect;
import org.yakindu.sct.model.sgraph.Reaction;
import org.yakindu.sct.model.sgraph.ScopedElement;
import org.yakindu.sct.model.sgraph.Trigger;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpPackage
 * @generated
 */
public class KidsexpAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KidsexpPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KidsexpAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KidsexpPackage.eINSTANCE;
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
  protected KidsexpSwitch<Adapter> modelSwitch =
    new KidsexpSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseDefRoot(DefRoot object)
      {
        return createDefRootAdapter();
      }
      @Override
      public Adapter caseStatechartRoot(StatechartRoot object)
      {
        return createStatechartRootAdapter();
      }
      @Override
      public Adapter caseStateRoot(StateRoot object)
      {
        return createStateRootAdapter();
      }
      @Override
      public Adapter caseTransitionRoot(TransitionRoot object)
      {
        return createTransitionRootAdapter();
      }
      @Override
      public Adapter caseTransitionSpecification(TransitionSpecification object)
      {
        return createTransitionSpecificationAdapter();
      }
      @Override
      public Adapter caseStatechartSpecification(StatechartSpecification object)
      {
        return createStatechartSpecificationAdapter();
      }
      @Override
      public Adapter caseStateSpecification(StateSpecification object)
      {
        return createStateSpecificationAdapter();
      }
      @Override
      public Adapter caseTransitionReaction(TransitionReaction object)
      {
        return createTransitionReactionAdapter();
      }
      @Override
      public Adapter caseReactionTrigger(ReactionTrigger object)
      {
        return createReactionTriggerAdapter();
      }
      @Override
      public Adapter caseReactionEffect(ReactionEffect object)
      {
        return createReactionEffectAdapter();
      }
      @Override
      public Adapter caseStext_Root(org.yakindu.sct.model.stext.stext.Root object)
      {
        return createStext_RootAdapter();
      }
      @Override
      public Adapter caseStext_DefRoot(org.yakindu.sct.model.stext.stext.DefRoot object)
      {
        return createStext_DefRootAdapter();
      }
      @Override
      public Adapter caseStext_StatechartRoot(org.yakindu.sct.model.stext.stext.StatechartRoot object)
      {
        return createStext_StatechartRootAdapter();
      }
      @Override
      public Adapter caseStext_StateRoot(org.yakindu.sct.model.stext.stext.StateRoot object)
      {
        return createStext_StateRootAdapter();
      }
      @Override
      public Adapter caseStext_TransitionRoot(org.yakindu.sct.model.stext.stext.TransitionRoot object)
      {
        return createStext_TransitionRootAdapter();
      }
      @Override
      public Adapter caseStext_TransitionSpecification(org.yakindu.sct.model.stext.stext.TransitionSpecification object)
      {
        return createStext_TransitionSpecificationAdapter();
      }
      @Override
      public Adapter caseScopedElement(ScopedElement object)
      {
        return createScopedElementAdapter();
      }
      @Override
      public Adapter caseStext_StatechartSpecification(org.yakindu.sct.model.stext.stext.StatechartSpecification object)
      {
        return createStext_StatechartSpecificationAdapter();
      }
      @Override
      public Adapter caseStext_StateSpecification(org.yakindu.sct.model.stext.stext.StateSpecification object)
      {
        return createStext_StateSpecificationAdapter();
      }
      @Override
      public Adapter caseReaction(Reaction object)
      {
        return createReactionAdapter();
      }
      @Override
      public Adapter caseStext_TransitionReaction(org.yakindu.sct.model.stext.stext.TransitionReaction object)
      {
        return createStext_TransitionReactionAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.DefRoot <em>Def Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.DefRoot
   * @generated
   */
  public Adapter createDefRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartRoot <em>Statechart Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartRoot
   * @generated
   */
  public Adapter createStatechartRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateRoot <em>State Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateRoot
   * @generated
   */
  public Adapter createStateRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionRoot <em>Transition Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionRoot
   * @generated
   */
  public Adapter createTransitionRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionSpecification
   * @generated
   */
  public Adapter createTransitionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartSpecification <em>Statechart Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartSpecification
   * @generated
   */
  public Adapter createStatechartSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateSpecification
   * @generated
   */
  public Adapter createStateSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionReaction <em>Transition Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionReaction
   * @generated
   */
  public Adapter createTransitionReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionTrigger
   * @generated
   */
  public Adapter createReactionTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionEffect
   * @generated
   */
  public Adapter createReactionEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.Root
   * @generated
   */
  public Adapter createStext_RootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.DefRoot <em>Def Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.DefRoot
   * @generated
   */
  public Adapter createStext_DefRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.StatechartRoot <em>Statechart Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.StatechartRoot
   * @generated
   */
  public Adapter createStext_StatechartRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.StateRoot <em>State Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.StateRoot
   * @generated
   */
  public Adapter createStext_StateRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.TransitionRoot <em>Transition Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.TransitionRoot
   * @generated
   */
  public Adapter createStext_TransitionRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.TransitionSpecification
   * @generated
   */
  public Adapter createStext_TransitionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.ScopedElement <em>Scoped Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.sgraph.ScopedElement
   * @generated
   */
  public Adapter createScopedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.StatechartSpecification <em>Statechart Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.StatechartSpecification
   * @generated
   */
  public Adapter createStext_StatechartSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.StateSpecification
   * @generated
   */
  public Adapter createStext_StateSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.sgraph.Reaction
   * @generated
   */
  public Adapter createReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.stext.stext.TransitionReaction <em>Transition Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.stext.stext.TransitionReaction
   * @generated
   */
  public Adapter createStext_TransitionReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.sgraph.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.sct.model.sgraph.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.sct.model.sgraph.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
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

} //KidsexpAdapterFactory
