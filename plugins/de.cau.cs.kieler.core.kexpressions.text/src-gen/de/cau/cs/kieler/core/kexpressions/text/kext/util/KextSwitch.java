/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext.util;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.kexpressions.text.kext.*;

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
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage
 * @generated
 */
public class KextSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static KextPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public KextSwitch()
  {
		if (modelPackage == null) {
			modelPackage = KextPackage.eINSTANCE;
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
		switch (classifierID) {
			case KextPackage.KEXT: {
				Kext kext = (Kext)theEObject;
				T result = caseKext(kext);
				if (result == null) result = caseKEXTScope(kext);
				if (result == null) result = caseDeclarationScope(kext);
				if (result == null) result = caseIdentifiable(kext);
				if (result == null) result = caseAnnotatable(kext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KextPackage.TEST_ENTITY: {
				TestEntity testEntity = (TestEntity)theEObject;
				T result = caseTestEntity(testEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KextPackage.ANNOTATED_EXPRESSION: {
				AnnotatedExpression annotatedExpression = (AnnotatedExpression)theEObject;
				T result = caseAnnotatedExpression(annotatedExpression);
				if (result == null) result = caseAnnotatable(annotatedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KextPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = caseAnnotatable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KextPackage.DECLARATION_SCOPE: {
				DeclarationScope declarationScope = (DeclarationScope)theEObject;
				T result = caseDeclarationScope(declarationScope);
				if (result == null) result = caseIdentifiable(declarationScope);
				if (result == null) result = caseAnnotatable(declarationScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KextPackage.KEXT_SCOPE: {
				KEXTScope kextScope = (KEXTScope)theEObject;
				T result = caseKEXTScope(kextScope);
				if (result == null) result = caseDeclarationScope(kextScope);
				if (result == null) result = caseIdentifiable(kextScope);
				if (result == null) result = caseAnnotatable(kextScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Kext</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseKext(Kext object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Test Entity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTestEntity(TestEntity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnnotatedExpression(AnnotatedExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIdentifiable(Identifiable object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationScope(DeclarationScope object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>KEXT Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEXT Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEXTScope(KEXTScope object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAnnotatable(Annotatable object) {
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

} //KextSwitch
