/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.util;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.esterel.kexpressions.*;

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
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage
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
            case KExpressionsPackage.COMPLEX_EXPRESSION: {
                ComplexExpression complexExpression = (ComplexExpression)theEObject;
                T result = caseComplexExpression(complexExpression);
                if (result == null) result = caseExpression(complexExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.TEXTUAL_CODE: {
                TextualCode textualCode = (TextualCode)theEObject;
                T result = caseTextualCode(textualCode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.SIGNAL: {
                Signal signal = (Signal)theEObject;
                T result = caseSignal(signal);
                if (result == null) result = caseValuedObject(signal);
                if (result == null) result = caseAnnotatable(signal);
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
            case KExpressionsPackage.VARIABLE: {
                Variable variable = (Variable)theEObject;
                T result = caseVariable(variable);
                if (result == null) result = caseValuedObject(variable);
                if (result == null) result = caseAnnotatable(variable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VALUED_OBJECT_REFERENCE: {
                ValuedObjectReference valuedObjectReference = (ValuedObjectReference)theEObject;
                T result = caseValuedObjectReference(valuedObjectReference);
                if (result == null) result = caseComplexExpression(valuedObjectReference);
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
            case KExpressionsPackage.BOOLEAN_VALUE: {
                BooleanValue booleanValue = (BooleanValue)theEObject;
                T result = caseBooleanValue(booleanValue);
                if (result == null) result = caseValue(booleanValue);
                if (result == null) result = caseExpression(booleanValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.OPERATOR_EXPRESSION: {
                OperatorExpression operatorExpression = (OperatorExpression)theEObject;
                T result = caseOperatorExpression(operatorExpression);
                if (result == null) result = caseComplexExpression(operatorExpression);
                if (result == null) result = caseExpression(operatorExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.TEXT_EXPRESSION: {
                TextExpression textExpression = (TextExpression)theEObject;
                T result = caseTextExpression(textExpression);
                if (result == null) result = caseComplexExpression(textExpression);
                if (result == null) result = caseTextualCode(textExpression);
                if (result == null) result = caseExpression(textExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INTERFACE_DECLARATION: {
                InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
                T result = caseInterfaceDeclaration(interfaceDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL: {
                InterfaceSignalDecl interfaceSignalDecl = (InterfaceSignalDecl)theEObject;
                T result = caseInterfaceSignalDecl(interfaceSignalDecl);
                if (result == null) result = caseInterfaceDeclaration(interfaceSignalDecl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.ISIGNAL: {
                ISignal iSignal = (ISignal)theEObject;
                T result = caseISignal(iSignal);
                if (result == null) result = caseSignal(iSignal);
                if (result == null) result = caseValuedObject(iSignal);
                if (result == null) result = caseAnnotatable(iSignal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.CHANNEL_DESCRIPTION: {
                ChannelDescription channelDescription = (ChannelDescription)theEObject;
                T result = caseChannelDescription(channelDescription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.TYPE_IDENTIFIER: {
                TypeIdentifier typeIdentifier = (TypeIdentifier)theEObject;
                T result = caseTypeIdentifier(typeIdentifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INTERFACE_VARIABLE_DECL: {
                InterfaceVariableDecl interfaceVariableDecl = (InterfaceVariableDecl)theEObject;
                T result = caseInterfaceVariableDecl(interfaceVariableDecl);
                if (result == null) result = caseInterfaceDeclaration(interfaceVariableDecl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.VARIABLE_DECL: {
                VariableDecl variableDecl = (VariableDecl)theEObject;
                T result = caseVariableDecl(variableDecl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.IVARIABLE: {
                IVariable iVariable = (IVariable)theEObject;
                T result = caseIVariable(iVariable);
                if (result == null) result = caseVariable(iVariable);
                if (result == null) result = caseValuedObject(iVariable);
                if (result == null) result = caseAnnotatable(iVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INPUT: {
                Input input = (Input)theEObject;
                T result = caseInput(input);
                if (result == null) result = caseInterfaceSignalDecl(input);
                if (result == null) result = caseInterfaceDeclaration(input);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.OUTPUT: {
                Output output = (Output)theEObject;
                T result = caseOutput(output);
                if (result == null) result = caseInterfaceSignalDecl(output);
                if (result == null) result = caseInterfaceDeclaration(output);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.INPUT_OUTPUT: {
                InputOutput inputOutput = (InputOutput)theEObject;
                T result = caseInputOutput(inputOutput);
                if (result == null) result = caseInterfaceSignalDecl(inputOutput);
                if (result == null) result = caseInterfaceDeclaration(inputOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case KExpressionsPackage.RETURN: {
                Return return_ = (Return)theEObject;
                T result = caseReturn(return_);
                if (result == null) result = caseInterfaceSignalDecl(return_);
                if (result == null) result = caseInterfaceDeclaration(return_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexExpression(ComplexExpression object) {
        return null;
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
     * Returns the result of interpreting the object as an instance of '<em>Textual Code</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Textual Code</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualCode(TextualCode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignal(Signal object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(Variable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanValue(BooleanValue object) {
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
    public T caseInterfaceDeclaration(InterfaceDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Signal Decl</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Signal Decl</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceSignalDecl(InterfaceSignalDecl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISignal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISignal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISignal(ISignal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Channel Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Channel Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChannelDescription(ChannelDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeIdentifier(TypeIdentifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Variable Decl</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Variable Decl</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceVariableDecl(InterfaceVariableDecl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDecl(VariableDecl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IVariable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IVariable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIVariable(IVariable object) {
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
    public T caseInput(Input object) {
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
    public T caseOutput(Output object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputOutput(InputOutput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Return</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReturn(Return object) {
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
