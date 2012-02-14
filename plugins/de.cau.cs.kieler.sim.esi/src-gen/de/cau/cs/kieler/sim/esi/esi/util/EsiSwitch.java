/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.sim.esi.esi.util;

import de.cau.cs.kieler.sim.esi.esi.*;

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
 * @see de.cau.cs.kieler.sim.esi.esi.EsiPackage
 * @generated
 */
public class EsiSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EsiPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsiSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EsiPackage.eINSTANCE;
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
      case EsiPackage.TRACELIST:
      {
        tracelist tracelist = (tracelist)theEObject;
        T result = casetracelist(tracelist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.TRACE:
      {
        trace trace = (trace)theEObject;
        T result = casetrace(trace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.TICK:
      {
        tick tick = (tick)theEObject;
        T result = casetick(tick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.SIGNAL:
      {
        signal signal = (signal)theEObject;
        T result = casesignal(signal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.KVPAIR:
      {
        kvpair kvpair = (kvpair)theEObject;
        T result = casekvpair(kvpair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.ESO_INT:
      {
        EsoInt esoInt = (EsoInt)theEObject;
        T result = caseEsoInt(esoInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.ESO_STRING:
      {
        EsoString esoString = (EsoString)theEObject;
        T result = caseEsoString(esoString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.ESO_FLOAT:
      {
        EsoFloat esoFloat = (EsoFloat)theEObject;
        T result = caseEsoFloat(esoFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.ESO_BOOL:
      {
        EsoBool esoBool = (EsoBool)theEObject;
        T result = caseEsoBool(esoBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsiPackage.ESO_JSON:
      {
        EsoJson esoJson = (EsoJson)theEObject;
        T result = caseEsoJson(esoJson);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tracelist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tracelist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetracelist(tracelist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>trace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>trace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetrace(trace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetick(tick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesignal(signal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>kvpair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>kvpair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casekvpair(kvpair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eso Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eso Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsoInt(EsoInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eso String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eso String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsoString(EsoString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eso Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eso Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsoFloat(EsoFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eso Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eso Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsoBool(EsoBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eso Json</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eso Json</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsoJson(EsoJson object)
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

} //EsiSwitch
