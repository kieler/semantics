/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.util;

import de.cau.kieler.scc.model.scctext.sccexp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yakindu.base.base.NamedElement;

import org.yakindu.sct.model.sgraph.Reaction;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.sgraph.Trigger;

import org.yakindu.sct.model.stext.stext.StatechartScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage
 * @generated
 */
public class SccexpSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SccexpPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SccexpSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SccexpPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SccexpPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = caseStext_Root(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.DEF_ROOT:
      {
        DefRoot defRoot = (DefRoot)theEObject;
        T result = caseDefRoot(defRoot);
        if (result == null) result = caseStext_DefRoot(defRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.STATE_ROOT:
      {
        StateRoot stateRoot = (StateRoot)theEObject;
        T result = caseStateRoot(stateRoot);
        if (result == null) result = caseDefRoot(stateRoot);
        if (result == null) result = caseStext_StateRoot(stateRoot);
        if (result == null) result = caseStext_DefRoot(stateRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.TRANSITION_ROOT:
      {
        TransitionRoot transitionRoot = (TransitionRoot)theEObject;
        T result = caseTransitionRoot(transitionRoot);
        if (result == null) result = caseDefRoot(transitionRoot);
        if (result == null) result = caseStext_TransitionRoot(transitionRoot);
        if (result == null) result = caseStext_DefRoot(transitionRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.STATE_SCOPE:
      {
        StateScope stateScope = (StateScope)theEObject;
        T result = caseStateScope(stateScope);
        if (result == null) result = caseScope(stateScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INTERFACE_SCOPE_ROOT:
      {
        InterfaceScopeRoot interfaceScopeRoot = (InterfaceScopeRoot)theEObject;
        T result = caseInterfaceScopeRoot(interfaceScopeRoot);
        if (result == null) result = caseStateScope(interfaceScopeRoot);
        if (result == null) result = caseScope(interfaceScopeRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INTERFACE_SCOPE:
      {
        InterfaceScope interfaceScope = (InterfaceScope)theEObject;
        T result = caseInterfaceScope(interfaceScope);
        if (result == null) result = caseStext_InterfaceScope(interfaceScope);
        if (result == null) result = caseStatechartScope(interfaceScope);
        if (result == null) result = caseNamedElement(interfaceScope);
        if (result == null) result = caseScope(interfaceScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INTERFACE_DECLARATION:
      {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
        T result = caseInterfaceDeclaration(interfaceDeclaration);
        if (result == null) result = caseInterfaceScope(interfaceDeclaration);
        if (result == null) result = caseStext_InterfaceScope(interfaceDeclaration);
        if (result == null) result = caseStatechartScope(interfaceDeclaration);
        if (result == null) result = caseNamedElement(interfaceDeclaration);
        if (result == null) result = caseScope(interfaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.SCC_VARIABLE_DECLARATION:
      {
        SCCVariableDeclaration sccVariableDeclaration = (SCCVariableDeclaration)theEObject;
        T result = caseSCCVariableDeclaration(sccVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.LOCAL_VARIABLE_DECLARATION:
      {
        LocalVariableDeclaration localVariableDeclaration = (LocalVariableDeclaration)theEObject;
        T result = caseLocalVariableDeclaration(localVariableDeclaration);
        if (result == null) result = caseSCCVariableDeclaration(localVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.IN_OUT_VARIABLE_DECLARATION:
      {
        InOutVariableDeclaration inOutVariableDeclaration = (InOutVariableDeclaration)theEObject;
        T result = caseInOutVariableDeclaration(inOutVariableDeclaration);
        if (result == null) result = caseSCCVariableDeclaration(inOutVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.OUTPUT_VARIABLEECLARATION:
      {
        OutputVariableeclaration outputVariableeclaration = (OutputVariableeclaration)theEObject;
        T result = caseOutputVariableeclaration(outputVariableeclaration);
        if (result == null) result = caseSCCVariableDeclaration(outputVariableeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INPUT_VARIABLE_DECLARATION:
      {
        InputVariableDeclaration inputVariableDeclaration = (InputVariableDeclaration)theEObject;
        T result = caseInputVariableDeclaration(inputVariableDeclaration);
        if (result == null) result = caseSCCVariableDeclaration(inputVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.ACTION_DECLARATION:
      {
        ActionDeclaration actionDeclaration = (ActionDeclaration)theEObject;
        T result = caseActionDeclaration(actionDeclaration);
        if (result == null) result = caseInterfaceScope(actionDeclaration);
        if (result == null) result = caseStext_InterfaceScope(actionDeclaration);
        if (result == null) result = caseStatechartScope(actionDeclaration);
        if (result == null) result = caseNamedElement(actionDeclaration);
        if (result == null) result = caseScope(actionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.EXIT_ACTION_DECLARATION:
      {
        ExitActionDeclaration exitActionDeclaration = (ExitActionDeclaration)theEObject;
        T result = caseExitActionDeclaration(exitActionDeclaration);
        if (result == null) result = caseActionDeclaration(exitActionDeclaration);
        if (result == null) result = caseInterfaceScope(exitActionDeclaration);
        if (result == null) result = caseStext_InterfaceScope(exitActionDeclaration);
        if (result == null) result = caseStatechartScope(exitActionDeclaration);
        if (result == null) result = caseNamedElement(exitActionDeclaration);
        if (result == null) result = caseScope(exitActionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INSIDE_ACTION_DECLARATION:
      {
        InsideActionDeclaration insideActionDeclaration = (InsideActionDeclaration)theEObject;
        T result = caseInsideActionDeclaration(insideActionDeclaration);
        if (result == null) result = caseActionDeclaration(insideActionDeclaration);
        if (result == null) result = caseInterfaceScope(insideActionDeclaration);
        if (result == null) result = caseStext_InterfaceScope(insideActionDeclaration);
        if (result == null) result = caseStatechartScope(insideActionDeclaration);
        if (result == null) result = caseNamedElement(insideActionDeclaration);
        if (result == null) result = caseScope(insideActionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.ENTRY_ACTION_DECLARATION:
      {
        EntryActionDeclaration entryActionDeclaration = (EntryActionDeclaration)theEObject;
        T result = caseEntryActionDeclaration(entryActionDeclaration);
        if (result == null) result = caseActionDeclaration(entryActionDeclaration);
        if (result == null) result = caseInterfaceScope(entryActionDeclaration);
        if (result == null) result = caseStext_InterfaceScope(entryActionDeclaration);
        if (result == null) result = caseStatechartScope(entryActionDeclaration);
        if (result == null) result = caseNamedElement(entryActionDeclaration);
        if (result == null) result = caseScope(entryActionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.ACTION_VARIABLE_DECLARATION:
      {
        ActionVariableDeclaration actionVariableDeclaration = (ActionVariableDeclaration)theEObject;
        T result = caseActionVariableDeclaration(actionVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.SUSPEND_DECLARATION:
      {
        SuspendDeclaration suspendDeclaration = (SuspendDeclaration)theEObject;
        T result = caseSuspendDeclaration(suspendDeclaration);
        if (result == null) result = caseInterfaceScope(suspendDeclaration);
        if (result == null) result = caseStext_InterfaceScope(suspendDeclaration);
        if (result == null) result = caseStatechartScope(suspendDeclaration);
        if (result == null) result = caseNamedElement(suspendDeclaration);
        if (result == null) result = caseScope(suspendDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.SUSPEND_VARIABLE_DECLARATION:
      {
        SuspendVariableDeclaration suspendVariableDeclaration = (SuspendVariableDeclaration)theEObject;
        T result = caseSuspendVariableDeclaration(suspendVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.TRANSITION_REACTION:
      {
        TransitionReaction transitionReaction = (TransitionReaction)theEObject;
        T result = caseTransitionReaction(transitionReaction);
        if (result == null) result = caseStext_TransitionReaction(transitionReaction);
        if (result == null) result = caseReaction(transitionReaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.LOCAL:
      {
        Local local = (Local)theEObject;
        T result = caseLocal(local);
        if (result == null) result = caseLocalVariableDeclaration(local);
        if (result == null) result = caseSCCVariableDeclaration(local);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseInOutVariableDeclaration(input);
        if (result == null) result = caseSCCVariableDeclaration(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseOutputVariableeclaration(output);
        if (result == null) result = caseSCCVariableDeclaration(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.IN_OUT:
      {
        InOut inOut = (InOut)theEObject;
        T result = caseInOut(inOut);
        if (result == null) result = caseInputVariableDeclaration(inOut);
        if (result == null) result = caseSCCVariableDeclaration(inOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SccexpPackage.MY_TRIGGER:
      {
        MyTrigger myTrigger = (MyTrigger)theEObject;
        T result = caseMyTrigger(myTrigger);
        if (result == null) result = caseTrigger(myTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefRoot(DefRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateRoot(StateRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionRoot(TransitionRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateScope(StateScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Scope Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Scope Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceScopeRoot(InterfaceScopeRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceScope(InterfaceScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDeclaration(InterfaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SCC Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SCC Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSCCVariableDeclaration(SCCVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariableDeclaration(LocalVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOutVariableDeclaration(InOutVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Variableeclaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Variableeclaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputVariableeclaration(OutputVariableeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputVariableDeclaration(InputVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDeclaration(ActionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Action Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitActionDeclaration(ExitActionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inside Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inside Action Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsideActionDeclaration(InsideActionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Action Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryActionDeclaration(EntryActionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionVariableDeclaration(ActionVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suspend Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suspend Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuspendDeclaration(SuspendDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suspend Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suspend Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuspendVariableDeclaration(SuspendVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionReaction(TransitionReaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocal(Local object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOut(InOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>My Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>My Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMyTrigger(MyTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_Root(org.yakindu.sct.model.stext.stext.Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_DefRoot(org.yakindu.sct.model.stext.stext.DefRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_StateRoot(org.yakindu.sct.model.stext.stext.StateRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_TransitionRoot(org.yakindu.sct.model.stext.stext.TransitionRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statechart Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statechart Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatechartScope(StatechartScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_InterfaceScope(org.yakindu.sct.model.stext.stext.InterfaceScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReaction(Reaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStext_TransitionReaction(org.yakindu.sct.model.stext.stext.TransitionReaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SccexpSwitch
