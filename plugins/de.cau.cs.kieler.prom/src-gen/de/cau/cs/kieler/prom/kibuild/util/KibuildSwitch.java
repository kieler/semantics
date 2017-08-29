/**
 */
package de.cau.cs.kieler.prom.kibuild.util;

import de.cau.cs.kieler.prom.kibuild.*;

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
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage
 * @generated
 */
public class KibuildSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KibuildPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KibuildSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = KibuildPackage.eINSTANCE;
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
      case KibuildPackage.BUILD_CONFIGURATION:
      {
        BuildConfiguration buildConfiguration = (BuildConfiguration)theEObject;
        T result = caseBuildConfiguration(buildConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.MODEL_COMPILER:
      {
        ModelCompiler modelCompiler = (ModelCompiler)theEObject;
        T result = caseModelCompiler(modelCompiler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.SIMULATION_COMPILER:
      {
        SimulationCompiler simulationCompiler = (SimulationCompiler)theEObject;
        T result = caseSimulationCompiler(simulationCompiler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.TEMPLATE_PROCESSOR:
      {
        TemplateProcessor templateProcessor = (TemplateProcessor)theEObject;
        T result = caseTemplateProcessor(templateProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.ATTRIBUTE_MAPPING:
      {
        AttributeMapping attributeMapping = (AttributeMapping)theEObject;
        T result = caseAttributeMapping(attributeMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.SIGNED_FLOAT:
      {
        SignedFloat signedFloat = (SignedFloat)theEObject;
        T result = caseSignedFloat(signedFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.SIGNED_INT:
      {
        SignedInt signedInt = (SignedInt)theEObject;
        T result = caseSignedInt(signedInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.TEXT_VALUE:
      {
        TextValue textValue = (TextValue)theEObject;
        T result = caseTextValue(textValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.NORMAL_TEMPLATE_PROCESSOR:
      {
        NormalTemplateProcessor normalTemplateProcessor = (NormalTemplateProcessor)theEObject;
        T result = caseNormalTemplateProcessor(normalTemplateProcessor);
        if (result == null) result = caseTemplateProcessor(normalTemplateProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.SIMULATION_TEMPLATE_PROCESSOR:
      {
        SimulationTemplateProcessor simulationTemplateProcessor = (SimulationTemplateProcessor)theEObject;
        T result = caseSimulationTemplateProcessor(simulationTemplateProcessor);
        if (result == null) result = caseTemplateProcessor(simulationTemplateProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KibuildPackage.WRAPPER_CODE_TEMPLATE_PROCESSOR:
      {
        WrapperCodeTemplateProcessor wrapperCodeTemplateProcessor = (WrapperCodeTemplateProcessor)theEObject;
        T result = caseWrapperCodeTemplateProcessor(wrapperCodeTemplateProcessor);
        if (result == null) result = caseTemplateProcessor(wrapperCodeTemplateProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuildConfiguration(BuildConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Compiler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Compiler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelCompiler(ModelCompiler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simulation Compiler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simulation Compiler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimulationCompiler(SimulationCompiler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateProcessor(TemplateProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeMapping(AttributeMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedFloat(SignedFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedInt(SignedInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextValue(TextValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Template Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Template Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalTemplateProcessor(NormalTemplateProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simulation Template Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simulation Template Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimulationTemplateProcessor(SimulationTemplateProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wrapper Code Template Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wrapper Code Template Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWrapperCodeTemplateProcessor(WrapperCodeTemplateProcessor object)
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

} //KibuildSwitch
