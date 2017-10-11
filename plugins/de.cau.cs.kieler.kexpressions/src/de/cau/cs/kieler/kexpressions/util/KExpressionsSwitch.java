/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.kexpressions.*;

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
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage
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
     * @param ePackage the package in question.
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
                if (result == null) result = caseSchedulable(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUED_OBJECT: {
                ValuedObject valuedObject = (ValuedObject)theEObject;
                T result = caseValuedObject(valuedObject);
                if (result == null) result = caseNamedObject(valuedObject);
                if (result == null) result = caseAnnotatable(valuedObject);
                if (result == null) result = caseReferenceable(valuedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUED_OBJECT_REFERENCE: {
                ValuedObjectReference valuedObjectReference = (ValuedObjectReference)theEObject;
                T result = caseValuedObjectReference(valuedObjectReference);
                if (result == null) result = caseExpression(valuedObjectReference);
                if (result == null) result = caseSchedulable(valuedObjectReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUE: {
                Value value = (Value)theEObject;
                T result = caseValue(value);
                if (result == null) result = caseExpression(value);
                if (result == null) result = caseSchedulable(value);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INT_VALUE: {
                IntValue intValue = (IntValue)theEObject;
                T result = caseIntValue(intValue);
                if (result == null) result = caseValue(intValue);
                if (result == null) result = caseExpression(intValue);
                if (result == null) result = caseSchedulable(intValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.FLOAT_VALUE: {
                FloatValue floatValue = (FloatValue)theEObject;
                T result = caseFloatValue(floatValue);
                if (result == null) result = caseValue(floatValue);
                if (result == null) result = caseExpression(floatValue);
                if (result == null) result = caseSchedulable(floatValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.BOOL_VALUE: {
                BoolValue boolValue = (BoolValue)theEObject;
                T result = caseBoolValue(boolValue);
                if (result == null) result = caseValue(boolValue);
                if (result == null) result = caseExpression(boolValue);
                if (result == null) result = caseSchedulable(boolValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.STRING_VALUE: {
                StringValue stringValue = (StringValue)theEObject;
                T result = caseStringValue(stringValue);
                if (result == null) result = caseValue(stringValue);
                if (result == null) result = caseExpression(stringValue);
                if (result == null) result = caseSchedulable(stringValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VECTOR_VALUE: {
                VectorValue vectorValue = (VectorValue)theEObject;
                T result = caseVectorValue(vectorValue);
                if (result == null) result = caseValue(vectorValue);
                if (result == null) result = caseExpression(vectorValue);
                if (result == null) result = caseSchedulable(vectorValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.IGNORE_VALUE: {
                IgnoreValue ignoreValue = (IgnoreValue)theEObject;
                T result = caseIgnoreValue(ignoreValue);
                if (result == null) result = caseValue(ignoreValue);
                if (result == null) result = caseExpression(ignoreValue);
                if (result == null) result = caseSchedulable(ignoreValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.OPERATOR_EXPRESSION: {
                OperatorExpression operatorExpression = (OperatorExpression)theEObject;
                T result = caseOperatorExpression(operatorExpression);
                if (result == null) result = caseExpression(operatorExpression);
                if (result == null) result = caseSchedulable(operatorExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.TEXT_EXPRESSION: {
                TextExpression textExpression = (TextExpression)theEObject;
                T result = caseTextExpression(textExpression);
                if (result == null) result = caseExpression(textExpression);
                if (result == null) result = caseSchedulable(textExpression);
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
            case KExpressionsPackage.VARIABLE_DECLARATION: {
                VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
                T result = caseVariableDeclaration(variableDeclaration);
                if (result == null) result = caseDeclaration(variableDeclaration);
                if (result == null) result = caseAnnotatable(variableDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.REFERENCE_DECLARATION: {
                ReferenceDeclaration referenceDeclaration = (ReferenceDeclaration)theEObject;
                T result = caseReferenceDeclaration(referenceDeclaration);
                if (result == null) result = caseDeclaration(referenceDeclaration);
                if (result == null) result = caseAnnotatable(referenceDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.SCHEDULE_DECLARATION: {
                ScheduleDeclaration scheduleDeclaration = (ScheduleDeclaration)theEObject;
                T result = caseScheduleDeclaration(scheduleDeclaration);
                if (result == null) result = caseDeclaration(scheduleDeclaration);
                if (result == null) result = caseAnnotatable(scheduleDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.SCHEDULE_PRIORITY: {
                SchedulePriority schedulePriority = (SchedulePriority)theEObject;
                T result = caseSchedulePriority(schedulePriority);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.SCHEDULE_OBJECT_REFERENCE: {
                ScheduleObjectReference scheduleObjectReference = (ScheduleObjectReference)theEObject;
                T result = caseScheduleObjectReference(scheduleObjectReference);
                if (result == null) result = caseValuedObjectReference(scheduleObjectReference);
                if (result == null) result = caseExpression(scheduleObjectReference);
                if (result == null) result = caseSchedulable(scheduleObjectReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.CALL: {
                Call call = (Call)theEObject;
                T result = caseCall(call);
                if (result == null) result = caseExpression(call);
                if (result == null) result = caseSchedulable(call);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.REFERENCE_CALL: {
                ReferenceCall referenceCall = (ReferenceCall)theEObject;
                T result = caseReferenceCall(referenceCall);
                if (result == null) result = caseValuedObjectReference(referenceCall);
                if (result == null) result = caseCall(referenceCall);
                if (result == null) result = caseExpression(referenceCall);
                if (result == null) result = caseSchedulable(referenceCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.FUNCTION_CALL: {
                FunctionCall functionCall = (FunctionCall)theEObject;
                T result = caseFunctionCall(functionCall);
                if (result == null) result = caseCall(functionCall);
                if (result == null) result = caseExpression(functionCall);
                if (result == null) result = caseSchedulable(functionCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.PRINT_CALL: {
                PrintCall printCall = (PrintCall)theEObject;
                T result = casePrintCall(printCall);
                if (result == null) result = caseCall(printCall);
                if (result == null) result = caseExpression(printCall);
                if (result == null) result = caseSchedulable(printCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.REFERENCEABLE: {
                Referenceable referenceable = (Referenceable)theEObject;
                T result = caseReferenceable(referenceable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.SCHEDULABLE: {
                Schedulable schedulable = (Schedulable)theEObject;
                T result = caseSchedulable(schedulable);
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
     * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDeclaration(VariableDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceDeclaration(ReferenceDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedule Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedule Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduleDeclaration(ScheduleDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedule Priority</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedule Priority</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulePriority(SchedulePriority object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedule Object Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedule Object Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduleObjectReference(ScheduleObjectReference object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Print Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Print Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrintCall(PrintCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referenceable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenceable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceable(Referenceable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedulable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedulable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulable(Schedulable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedObject(NamedObject object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Vector Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vector Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVectorValue(VectorValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ignore Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ignore Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIgnoreValue(IgnoreValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCall(Call object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceCall(ReferenceCall object) {
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
