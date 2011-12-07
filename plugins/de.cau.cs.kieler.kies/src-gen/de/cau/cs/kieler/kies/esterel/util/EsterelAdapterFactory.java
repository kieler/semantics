/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.ComplexExpression;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kies.esterel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage
 * @generated
 */
public class EsterelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EsterelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EsterelPackage.eINSTANCE;
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
  protected EsterelSwitch<Adapter> modelSwitch =
    new EsterelSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleBody(ModuleBody object)
      {
        return createModuleBodyAdapter();
      }
      @Override
      public Adapter caseModuleInterface(ModuleInterface object)
      {
        return createModuleInterfaceAdapter();
      }
      @Override
      public Adapter caseChannelDescription(ChannelDescription object)
      {
        return createChannelDescriptionAdapter();
      }
      @Override
      public Adapter caseTypeIdentifier(TypeIdentifier object)
      {
        return createTypeIdentifierAdapter();
      }
      @Override
      public Adapter caseLocalSignalDecl(LocalSignalDecl object)
      {
        return createLocalSignalDeclAdapter();
      }
      @Override
      public Adapter caseLocalSignalList(LocalSignalList object)
      {
        return createLocalSignalListAdapter();
      }
      @Override
      public Adapter caseSensorDecl(SensorDecl object)
      {
        return createSensorDeclAdapter();
      }
      @Override
      public Adapter caseSensorWithType(SensorWithType object)
      {
        return createSensorWithTypeAdapter();
      }
      @Override
      public Adapter caseRelationDecl(RelationDecl object)
      {
        return createRelationDeclAdapter();
      }
      @Override
      public Adapter caseRelationType(RelationType object)
      {
        return createRelationTypeAdapter();
      }
      @Override
      public Adapter caseRelationImplication(RelationImplication object)
      {
        return createRelationImplicationAdapter();
      }
      @Override
      public Adapter caseRelationIncompatibility(RelationIncompatibility object)
      {
        return createRelationIncompatibilityAdapter();
      }
      @Override
      public Adapter caseTypeDecl(TypeDecl object)
      {
        return createTypeDeclAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseConstantDecls(ConstantDecls object)
      {
        return createConstantDeclsAdapter();
      }
      @Override
      public Adapter caseOneTypeConstantDecls(OneTypeConstantDecls object)
      {
        return createOneTypeConstantDeclsAdapter();
      }
      @Override
      public Adapter caseConstantWithValue(ConstantWithValue object)
      {
        return createConstantWithValueAdapter();
      }
      @Override
      public Adapter caseFunctionDecl(FunctionDecl object)
      {
        return createFunctionDeclAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseProcedureDecl(ProcedureDecl object)
      {
        return createProcedureDeclAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseTaskDecl(TaskDecl object)
      {
        return createTaskDeclAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseStatementContainer(StatementContainer object)
      {
        return createStatementContainerAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseAbort(Abort object)
      {
        return createAbortAdapter();
      }
      @Override
      public Adapter caseAbortBody(AbortBody object)
      {
        return createAbortBodyAdapter();
      }
      @Override
      public Adapter caseAbortInstance(AbortInstance object)
      {
        return createAbortInstanceAdapter();
      }
      @Override
      public Adapter caseAbortCase(AbortCase object)
      {
        return createAbortCaseAdapter();
      }
      @Override
      public Adapter caseAbortCaseSingle(AbortCaseSingle object)
      {
        return createAbortCaseSingleAdapter();
      }
      @Override
      public Adapter caseWeakAbortBody(WeakAbortBody object)
      {
        return createWeakAbortBodyAdapter();
      }
      @Override
      public Adapter caseWeakAbortEnd(WeakAbortEnd object)
      {
        return createWeakAbortEndAdapter();
      }
      @Override
      public Adapter caseWeakAbortEndAlt(WeakAbortEndAlt object)
      {
        return createWeakAbortEndAltAdapter();
      }
      @Override
      public Adapter caseAwait(Await object)
      {
        return createAwaitAdapter();
      }
      @Override
      public Adapter caseAwaitBody(AwaitBody object)
      {
        return createAwaitBodyAdapter();
      }
      @Override
      public Adapter caseAwaitInstance(AwaitInstance object)
      {
        return createAwaitInstanceAdapter();
      }
      @Override
      public Adapter caseAwaitCase(AwaitCase object)
      {
        return createAwaitCaseAdapter();
      }
      @Override
      public Adapter caseProcCall(ProcCall object)
      {
        return createProcCallAdapter();
      }
      @Override
      public Adapter caseDo(Do object)
      {
        return createDoAdapter();
      }
      @Override
      public Adapter caseDoUpto(DoUpto object)
      {
        return createDoUptoAdapter();
      }
      @Override
      public Adapter caseDoWatching(DoWatching object)
      {
        return createDoWatchingAdapter();
      }
      @Override
      public Adapter caseDoWatchingEnd(DoWatchingEnd object)
      {
        return createDoWatchingEndAdapter();
      }
      @Override
      public Adapter caseEmit(Emit object)
      {
        return createEmitAdapter();
      }
      @Override
      public Adapter caseEveryDo(EveryDo object)
      {
        return createEveryDoAdapter();
      }
      @Override
      public Adapter caseExit(Exit object)
      {
        return createExitAdapter();
      }
      @Override
      public Adapter caseHalt(Halt object)
      {
        return createHaltAdapter();
      }
      @Override
      public Adapter caseIfTest(IfTest object)
      {
        return createIfTestAdapter();
      }
      @Override
      public Adapter caseElsIf(ElsIf object)
      {
        return createElsIfAdapter();
      }
      @Override
      public Adapter caseThenPart(ThenPart object)
      {
        return createThenPartAdapter();
      }
      @Override
      public Adapter caseElsePart(ElsePart object)
      {
        return createElsePartAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseEndLoop(EndLoop object)
      {
        return createEndLoopAdapter();
      }
      @Override
      public Adapter caseLoopEach(LoopEach object)
      {
        return createLoopEachAdapter();
      }
      @Override
      public Adapter caseLoopDelay(LoopDelay object)
      {
        return createLoopDelayAdapter();
      }
      @Override
      public Adapter caseLoopBody(LoopBody object)
      {
        return createLoopBodyAdapter();
      }
      @Override
      public Adapter caseNothing(Nothing object)
      {
        return createNothingAdapter();
      }
      @Override
      public Adapter casePause(Pause object)
      {
        return createPauseAdapter();
      }
      @Override
      public Adapter casePresent(Present object)
      {
        return createPresentAdapter();
      }
      @Override
      public Adapter casePresentBody(PresentBody object)
      {
        return createPresentBodyAdapter();
      }
      @Override
      public Adapter casePresentEventBody(PresentEventBody object)
      {
        return createPresentEventBodyAdapter();
      }
      @Override
      public Adapter casePresentCaseList(PresentCaseList object)
      {
        return createPresentCaseListAdapter();
      }
      @Override
      public Adapter casePresentCase(PresentCase object)
      {
        return createPresentCaseAdapter();
      }
      @Override
      public Adapter casePresentEvent(PresentEvent object)
      {
        return createPresentEventAdapter();
      }
      @Override
      public Adapter caseRepeat(Repeat object)
      {
        return createRepeatAdapter();
      }
      @Override
      public Adapter caseRun(Run object)
      {
        return createRunAdapter();
      }
      @Override
      public Adapter caseModuleRenaming(ModuleRenaming object)
      {
        return createModuleRenamingAdapter();
      }
      @Override
      public Adapter caseRenamingList(RenamingList object)
      {
        return createRenamingListAdapter();
      }
      @Override
      public Adapter caseRenaming(Renaming object)
      {
        return createRenamingAdapter();
      }
      @Override
      public Adapter caseTypeRenaming(TypeRenaming object)
      {
        return createTypeRenamingAdapter();
      }
      @Override
      public Adapter caseConstantRenaming(ConstantRenaming object)
      {
        return createConstantRenamingAdapter();
      }
      @Override
      public Adapter caseFunctionRenaming(FunctionRenaming object)
      {
        return createFunctionRenamingAdapter();
      }
      @Override
      public Adapter caseProcedureRenaming(ProcedureRenaming object)
      {
        return createProcedureRenamingAdapter();
      }
      @Override
      public Adapter caseTaskRenaming(TaskRenaming object)
      {
        return createTaskRenamingAdapter();
      }
      @Override
      public Adapter caseSignalRenaming(SignalRenaming object)
      {
        return createSignalRenamingAdapter();
      }
      @Override
      public Adapter caseSuspend(Suspend object)
      {
        return createSuspendAdapter();
      }
      @Override
      public Adapter caseSustain(Sustain object)
      {
        return createSustainAdapter();
      }
      @Override
      public Adapter caseTrap(Trap object)
      {
        return createTrapAdapter();
      }
      @Override
      public Adapter caseTrapDeclList(TrapDeclList object)
      {
        return createTrapDeclListAdapter();
      }
      @Override
      public Adapter caseTrapHandler(TrapHandler object)
      {
        return createTrapHandlerAdapter();
      }
      @Override
      public Adapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableAdapter();
      }
      @Override
      public Adapter caseDelayExpr(DelayExpr object)
      {
        return createDelayExprAdapter();
      }
      @Override
      public Adapter caseDelayEvent(DelayEvent object)
      {
        return createDelayEventAdapter();
      }
      @Override
      public Adapter caseExec(Exec object)
      {
        return createExecAdapter();
      }
      @Override
      public Adapter caseExecBody(ExecBody object)
      {
        return createExecBodyAdapter();
      }
      @Override
      public Adapter caseExecCase(ExecCase object)
      {
        return createExecCaseAdapter();
      }
      @Override
      public Adapter caseEsterelTypeIdentifier(EsterelTypeIdentifier object)
      {
        return createEsterelTypeIdentifierAdapter();
      }
      @Override
      public Adapter caseEsterelType(EsterelType object)
      {
        return createEsterelTypeAdapter();
      }
      @Override
      public Adapter caseLocalSignal(LocalSignal object)
      {
        return createLocalSignalAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseWeakAbort(WeakAbort object)
      {
        return createWeakAbortAdapter();
      }
      @Override
      public Adapter caseWeakAbortInstance(WeakAbortInstance object)
      {
        return createWeakAbortInstanceAdapter();
      }
      @Override
      public Adapter caseWeakAbortCase(WeakAbortCase object)
      {
        return createWeakAbortCaseAdapter();
      }
      @Override
      public Adapter caseTrapDecl(TrapDecl object)
      {
        return createTrapDeclAdapter();
      }
      @Override
      public Adapter caseTrapExpression(TrapExpression object)
      {
        return createTrapExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionExpression(FunctionExpression object)
      {
        return createFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseConstantExpression(ConstantExpression object)
      {
        return createConstantExpressionAdapter();
      }
      @Override
      public Adapter caseTrapReferenceExpr(TrapReferenceExpr object)
      {
        return createTrapReferenceExprAdapter();
      }
      @Override
      public Adapter caseKExpressions_ChannelDescription(de.cau.cs.kieler.core.kexpressions.ChannelDescription object)
      {
        return createKExpressions_ChannelDescriptionAdapter();
      }
      @Override
      public Adapter caseKExpressions_TypeIdentifier(de.cau.cs.kieler.core.kexpressions.TypeIdentifier object)
      {
        return createKExpressions_TypeIdentifierAdapter();
      }
      @Override
      public Adapter caseAnnotatable(Annotatable object)
      {
        return createAnnotatableAdapter();
      }
      @Override
      public Adapter caseValuedObject(ValuedObject object)
      {
        return createValuedObjectAdapter();
      }
      @Override
      public Adapter caseSignal(Signal object)
      {
        return createSignalAdapter();
      }
      @Override
      public Adapter caseISignal(ISignal object)
      {
        return createISignalAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseComplexExpression(ComplexExpression object)
      {
        return createComplexExpressionAdapter();
      }
      @Override
      public Adapter caseValuedObjectReference(ValuedObjectReference object)
      {
        return createValuedObjectReferenceAdapter();
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
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ModuleBody <em>Module Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ModuleBody
   * @generated
   */
  public Adapter createModuleBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ModuleInterface <em>Module Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ModuleInterface
   * @generated
   */
  public Adapter createModuleInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ChannelDescription <em>Channel Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ChannelDescription
   * @generated
   */
  public Adapter createChannelDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TypeIdentifier <em>Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TypeIdentifier
   * @generated
   */
  public Adapter createTypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LocalSignalDecl <em>Local Signal Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LocalSignalDecl
   * @generated
   */
  public Adapter createLocalSignalDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LocalSignalList <em>Local Signal List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LocalSignalList
   * @generated
   */
  public Adapter createLocalSignalListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.SensorDecl <em>Sensor Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.SensorDecl
   * @generated
   */
  public Adapter createSensorDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.SensorWithType <em>Sensor With Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.SensorWithType
   * @generated
   */
  public Adapter createSensorWithTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.RelationDecl <em>Relation Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.RelationDecl
   * @generated
   */
  public Adapter createRelationDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.RelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.RelationType
   * @generated
   */
  public Adapter createRelationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.RelationImplication <em>Relation Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.RelationImplication
   * @generated
   */
  public Adapter createRelationImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.RelationIncompatibility <em>Relation Incompatibility</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.RelationIncompatibility
   * @generated
   */
  public Adapter createRelationIncompatibilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TypeDecl
   * @generated
   */
  public Adapter createTypeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ConstantDecls <em>Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ConstantDecls
   * @generated
   */
  public Adapter createConstantDeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.OneTypeConstantDecls <em>One Type Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.OneTypeConstantDecls
   * @generated
   */
  public Adapter createOneTypeConstantDeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ConstantWithValue <em>Constant With Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ConstantWithValue
   * @generated
   */
  public Adapter createConstantWithValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.FunctionDecl
   * @generated
   */
  public Adapter createFunctionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ProcedureDecl <em>Procedure Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ProcedureDecl
   * @generated
   */
  public Adapter createProcedureDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TaskDecl <em>Task Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TaskDecl
   * @generated
   */
  public Adapter createTaskDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.StatementContainer <em>Statement Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.StatementContainer
   * @generated
   */
  public Adapter createStatementContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Abort
   * @generated
   */
  public Adapter createAbortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AbortBody <em>Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AbortBody
   * @generated
   */
  public Adapter createAbortBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AbortInstance <em>Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AbortInstance
   * @generated
   */
  public Adapter createAbortInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AbortCase <em>Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AbortCase
   * @generated
   */
  public Adapter createAbortCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AbortCaseSingle <em>Abort Case Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AbortCaseSingle
   * @generated
   */
  public Adapter createAbortCaseSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbortBody <em>Weak Abort Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbortBody
   * @generated
   */
  public Adapter createWeakAbortBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbortEnd <em>Weak Abort End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbortEnd
   * @generated
   */
  public Adapter createWeakAbortEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbortEndAlt <em>Weak Abort End Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbortEndAlt
   * @generated
   */
  public Adapter createWeakAbortEndAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Await <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Await
   * @generated
   */
  public Adapter createAwaitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AwaitBody <em>Await Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AwaitBody
   * @generated
   */
  public Adapter createAwaitBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AwaitInstance <em>Await Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AwaitInstance
   * @generated
   */
  public Adapter createAwaitInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.AwaitCase <em>Await Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.AwaitCase
   * @generated
   */
  public Adapter createAwaitCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ProcCall <em>Proc Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ProcCall
   * @generated
   */
  public Adapter createProcCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Do <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Do
   * @generated
   */
  public Adapter createDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.DoUpto <em>Do Upto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.DoUpto
   * @generated
   */
  public Adapter createDoUptoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.DoWatching <em>Do Watching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.DoWatching
   * @generated
   */
  public Adapter createDoWatchingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.DoWatchingEnd <em>Do Watching End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.DoWatchingEnd
   * @generated
   */
  public Adapter createDoWatchingEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Emit <em>Emit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Emit
   * @generated
   */
  public Adapter createEmitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.EveryDo <em>Every Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.EveryDo
   * @generated
   */
  public Adapter createEveryDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Exit
   * @generated
   */
  public Adapter createExitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Halt <em>Halt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Halt
   * @generated
   */
  public Adapter createHaltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.IfTest <em>If Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.IfTest
   * @generated
   */
  public Adapter createIfTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ElsIf <em>Els If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ElsIf
   * @generated
   */
  public Adapter createElsIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ThenPart
   * @generated
   */
  public Adapter createThenPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ElsePart <em>Else Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ElsePart
   * @generated
   */
  public Adapter createElsePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.EndLoop <em>End Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.EndLoop
   * @generated
   */
  public Adapter createEndLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LoopEach <em>Loop Each</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LoopEach
   * @generated
   */
  public Adapter createLoopEachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LoopDelay <em>Loop Delay</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LoopDelay
   * @generated
   */
  public Adapter createLoopDelayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LoopBody <em>Loop Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LoopBody
   * @generated
   */
  public Adapter createLoopBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Nothing <em>Nothing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Nothing
   * @generated
   */
  public Adapter createNothingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Pause
   * @generated
   */
  public Adapter createPauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Present <em>Present</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Present
   * @generated
   */
  public Adapter createPresentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.PresentBody <em>Present Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.PresentBody
   * @generated
   */
  public Adapter createPresentBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.PresentEventBody <em>Present Event Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.PresentEventBody
   * @generated
   */
  public Adapter createPresentEventBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.PresentCaseList <em>Present Case List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.PresentCaseList
   * @generated
   */
  public Adapter createPresentCaseListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.PresentCase <em>Present Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.PresentCase
   * @generated
   */
  public Adapter createPresentCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.PresentEvent <em>Present Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.PresentEvent
   * @generated
   */
  public Adapter createPresentEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Repeat
   * @generated
   */
  public Adapter createRepeatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Run
   * @generated
   */
  public Adapter createRunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ModuleRenaming <em>Module Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ModuleRenaming
   * @generated
   */
  public Adapter createModuleRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.RenamingList <em>Renaming List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.RenamingList
   * @generated
   */
  public Adapter createRenamingListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Renaming
   * @generated
   */
  public Adapter createRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TypeRenaming <em>Type Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TypeRenaming
   * @generated
   */
  public Adapter createTypeRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ConstantRenaming <em>Constant Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ConstantRenaming
   * @generated
   */
  public Adapter createConstantRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming <em>Function Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.FunctionRenaming
   * @generated
   */
  public Adapter createFunctionRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ProcedureRenaming <em>Procedure Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ProcedureRenaming
   * @generated
   */
  public Adapter createProcedureRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TaskRenaming <em>Task Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TaskRenaming
   * @generated
   */
  public Adapter createTaskRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.SignalRenaming <em>Signal Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.SignalRenaming
   * @generated
   */
  public Adapter createSignalRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Suspend <em>Suspend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Suspend
   * @generated
   */
  public Adapter createSuspendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Sustain <em>Sustain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Sustain
   * @generated
   */
  public Adapter createSustainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Trap <em>Trap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Trap
   * @generated
   */
  public Adapter createTrapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TrapDeclList <em>Trap Decl List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TrapDeclList
   * @generated
   */
  public Adapter createTrapDeclListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TrapHandler <em>Trap Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TrapHandler
   * @generated
   */
  public Adapter createTrapHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LocalVariable
   * @generated
   */
  public Adapter createLocalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.DelayExpr <em>Delay Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.DelayExpr
   * @generated
   */
  public Adapter createDelayExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.DelayEvent <em>Delay Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.DelayEvent
   * @generated
   */
  public Adapter createDelayEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Exec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Exec
   * @generated
   */
  public Adapter createExecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ExecBody <em>Exec Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ExecBody
   * @generated
   */
  public Adapter createExecBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ExecCase <em>Exec Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ExecCase
   * @generated
   */
  public Adapter createExecCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.EsterelTypeIdentifier <em>Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.EsterelTypeIdentifier
   * @generated
   */
  public Adapter createEsterelTypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.EsterelType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.EsterelType
   * @generated
   */
  public Adapter createEsterelTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.LocalSignal <em>Local Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.LocalSignal
   * @generated
   */
  public Adapter createLocalSignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbort <em>Weak Abort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbort
   * @generated
   */
  public Adapter createWeakAbortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbortInstance <em>Weak Abort Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbortInstance
   * @generated
   */
  public Adapter createWeakAbortInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.WeakAbortCase <em>Weak Abort Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.WeakAbortCase
   * @generated
   */
  public Adapter createWeakAbortCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TrapDecl <em>Trap Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TrapDecl
   * @generated
   */
  public Adapter createTrapDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TrapExpression <em>Trap Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TrapExpression
   * @generated
   */
  public Adapter createTrapExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.FunctionExpression
   * @generated
   */
  public Adapter createFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.ConstantExpression
   * @generated
   */
  public Adapter createConstantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.kies.esterel.TrapReferenceExpr <em>Trap Reference Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.kies.esterel.TrapReferenceExpr
   * @generated
   */
  public Adapter createTrapReferenceExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.ChannelDescription <em>Channel Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.ChannelDescription
   * @generated
   */
  public Adapter createKExpressions_ChannelDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.TypeIdentifier <em>Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.TypeIdentifier
   * @generated
   */
  public Adapter createKExpressions_TypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.annotations.Annotatable <em>Annotatable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.annotations.Annotatable
   * @generated
   */
  public Adapter createAnnotatableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.ValuedObject
   * @generated
   */
  public Adapter createValuedObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.Signal
   * @generated
   */
  public Adapter createSignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.ISignal <em>ISignal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.ISignal
   * @generated
   */
  public Adapter createISignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.ComplexExpression <em>Complex Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.ComplexExpression
   * @generated
   */
  public Adapter createComplexExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.kexpressions.ValuedObjectReference <em>Valued Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
   * @generated
   */
  public Adapter createValuedObjectReferenceAdapter()
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

} //EsterelAdapterFactory
