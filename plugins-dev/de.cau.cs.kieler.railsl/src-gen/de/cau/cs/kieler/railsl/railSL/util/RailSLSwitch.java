/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.railsl.railSL.util;

import de.cau.cs.kieler.railsl.railSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.cau.cs.kieler.railsl.railSL.RailSLPackage
 * @generated
 */
public class RailSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RailSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RailSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
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
      case RailSLPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.SET_STATEMENT:
      {
        SetStatement setStatement = (SetStatement)theEObject;
        T result = caseSetStatement(setStatement);
        if (result == null) result = caseStatement(setStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.TRACK_STATEMENT:
      {
        TrackStatement trackStatement = (TrackStatement)theEObject;
        T result = caseTrackStatement(trackStatement);
        if (result == null) result = caseSetStatement(trackStatement);
        if (result == null) result = caseStatement(trackStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.POINT_STATEMENT:
      {
        PointStatement pointStatement = (PointStatement)theEObject;
        T result = casePointStatement(pointStatement);
        if (result == null) result = caseSetStatement(pointStatement);
        if (result == null) result = caseStatement(pointStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.WAIT_STATEMENT:
      {
        WaitStatement waitStatement = (WaitStatement)theEObject;
        T result = caseWaitStatement(waitStatement);
        if (result == null) result = caseStatement(waitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.TIME_WAIT_STATEMENT:
      {
        TimeWaitStatement timeWaitStatement = (TimeWaitStatement)theEObject;
        T result = caseTimeWaitStatement(timeWaitStatement);
        if (result == null) result = caseWaitStatement(timeWaitStatement);
        if (result == null) result = caseStatement(timeWaitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.CONTACT_WAIT_STATEMENT:
      {
        ContactWaitStatement contactWaitStatement = (ContactWaitStatement)theEObject;
        T result = caseContactWaitStatement(contactWaitStatement);
        if (result == null) result = caseWaitStatement(contactWaitStatement);
        if (result == null) result = caseStatement(contactWaitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.OP_STATEMENT:
      {
        OpStatement opStatement = (OpStatement)theEObject;
        T result = caseOpStatement(opStatement);
        if (result == null) result = caseStatement(opStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.CROSSING_STATEMENT:
      {
        CrossingStatement crossingStatement = (CrossingStatement)theEObject;
        T result = caseCrossingStatement(crossingStatement);
        if (result == null) result = caseOpStatement(crossingStatement);
        if (result == null) result = caseStatement(crossingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.LIGHT_STATEMENT:
      {
        LightStatement lightStatement = (LightStatement)theEObject;
        T result = caseLightStatement(lightStatement);
        if (result == null) result = caseOpStatement(lightStatement);
        if (result == null) result = caseStatement(lightStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.CONDITIONAL_STATEMENT:
      {
        ConditionalStatement conditionalStatement = (ConditionalStatement)theEObject;
        T result = caseConditionalStatement(conditionalStatement);
        if (result == null) result = caseStatement(conditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.CONDITIONAL_LINE:
      {
        ConditionalLine conditionalLine = (ConditionalLine)theEObject;
        T result = caseConditionalLine(conditionalLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RailSLPackage.PARALLEL_STATEMENT:
      {
        ParallelStatement parallelStatement = (ParallelStatement)theEObject;
        T result = caseParallelStatement(parallelStatement);
        if (result == null) result = caseStatement(parallelStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetStatement(SetStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Track Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Track Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrackStatement(TrackStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointStatement(PointStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWaitStatement(WaitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Wait Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Wait Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeWaitStatement(TimeWaitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contact Wait Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contact Wait Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContactWaitStatement(ContactWaitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpStatement(OpStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Crossing Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Crossing Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossingStatement(CrossingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Light Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLightStatement(LightStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalStatement(ConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalLine(ConditionalLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallelStatement(ParallelStatement object)
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

} //RailSLSwitch