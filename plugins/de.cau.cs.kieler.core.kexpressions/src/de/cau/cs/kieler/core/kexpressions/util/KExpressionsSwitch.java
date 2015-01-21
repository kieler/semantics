/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage
 * @generated
 */
public class KExpressionsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static KExpressionsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExpressionsSwitch() {
        if (modelPackage == null) {
            modelPackage = KExpressionsPackage.eINSTANCE;
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
    protected boolean isSwitchFor(EPackage ePackage) {
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
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case KExpressionsPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUED_OBJECT: {
                ValuedObject valuedObject = (ValuedObject)theEObject;
                T result = caseValuedObject(valuedObject);
                if (result == null) result = caseAnnotatable(valuedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUED_OBJECT_REFERENCE: {
                ValuedObjectReference valuedObjectReference = (ValuedObjectReference)theEObject;
                T result = caseValuedObjectReference(valuedObjectReference);
                if (result == null) result = caseExpression(valuedObjectReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUE: {
                Value value = (Value)theEObject;
                T result = caseValue(value);
                if (result == null) result = caseExpression(value);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INT_VALUE: {
                IntValue intValue = (IntValue)theEObject;
                T result = caseIntValue(intValue);
                if (result == null) result = caseValue(intValue);
                if (result == null) result = caseExpression(intValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.FLOAT_VALUE: {
                FloatValue floatValue = (FloatValue)theEObject;
                T result = caseFloatValue(floatValue);
                if (result == null) result = caseValue(floatValue);
                if (result == null) result = caseExpression(floatValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.BOOL_VALUE: {
                BoolValue boolValue = (BoolValue)theEObject;
                T result = caseBoolValue(boolValue);
                if (result == null) result = caseValue(boolValue);
                if (result == null) result = caseExpression(boolValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.OPERATOR_EXPRESSION: {
                OperatorExpression operatorExpression = (OperatorExpression)theEObject;
                T result = caseOperatorExpression(operatorExpression);
                if (result == null) result = caseExpression(operatorExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.TEXT_EXPRESSION: {
                TextExpression textExpression = (TextExpression)theEObject;
                T result = caseTextExpression(textExpression);
                if (result == null) result = caseExpression(textExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.DECLARATION: {
                Declaration declaration = (Declaration)theEObject;
                T result = caseDeclaration(declaration);
                if (result == null) result = caseAnnotatable(declaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.FUNCTION_CALL: {
                FunctionCall functionCall = (FunctionCall)theEObject;
                T result = caseFunctionCall(functionCall);
                if (result == null) result = caseExpression(functionCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.STRING_VALUE: {
                StringValue stringValue = (StringValue)theEObject;
                T result = caseStringValue(stringValue);
                if (result == null) result = caseValue(stringValue);
                if (result == null) result = caseExpression(stringValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Valued Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Valued Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValuedObject(ValuedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Valued Object Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Valued Object Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValuedObjectReference(ValuedObjectReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValue(Value object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntValue(IntValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Float Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Float Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFloatValue(FloatValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoolValue(BoolValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatorExpression(OperatorExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextExpression(TextExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeclaration(Declaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionCall(FunctionCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter(Parameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringValue(StringValue object) {
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
    public T defaultCase(EObject object) {
        return null;
    }

} //KExpressionsSwitch
