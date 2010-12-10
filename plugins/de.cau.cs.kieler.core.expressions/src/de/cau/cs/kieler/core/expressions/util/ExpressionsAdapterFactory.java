/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions.util;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.expressions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ExpressionsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpressionsPackage.eINSTANCE;
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
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
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
    protected ExpressionsSwitch<Adapter> modelSwitch =
        new ExpressionsSwitch<Adapter>() {
            @Override
            public Adapter caseComplexExpression(ComplexExpression object) {
                return createComplexExpressionAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseTextualCode(TextualCode object) {
                return createTextualCodeAdapter();
            }
            @Override
            public Adapter caseSignal(Signal object) {
                return createSignalAdapter();
            }
            @Override
            public Adapter caseValuedObject(ValuedObject object) {
                return createValuedObjectAdapter();
            }
            @Override
            public Adapter caseVariable(Variable object) {
                return createVariableAdapter();
            }
            @Override
            public Adapter caseValuedObjectReference(ValuedObjectReference object) {
                return createValuedObjectReferenceAdapter();
            }
            @Override
            public Adapter caseValue(Value object) {
                return createValueAdapter();
            }
            @Override
            public Adapter caseIntValue(IntValue object) {
                return createIntValueAdapter();
            }
            @Override
            public Adapter caseFloatValue(FloatValue object) {
                return createFloatValueAdapter();
            }
            @Override
            public Adapter caseBooleanValue(BooleanValue object) {
                return createBooleanValueAdapter();
            }
            @Override
            public Adapter caseOperatorExpression(OperatorExpression object) {
                return createOperatorExpressionAdapter();
            }
            @Override
            public Adapter caseTextExpression(TextExpression object) {
                return createTextExpressionAdapter();
            }
            @Override
            public Adapter caseInterfaceDeclaration(InterfaceDeclaration object) {
                return createInterfaceDeclarationAdapter();
            }
            @Override
            public Adapter caseInterfaceSignalDecl(InterfaceSignalDecl object) {
                return createInterfaceSignalDeclAdapter();
            }
            @Override
            public Adapter caseISignal(ISignal object) {
                return createISignalAdapter();
            }
            @Override
            public Adapter caseChannelDescription(ChannelDescription object) {
                return createChannelDescriptionAdapter();
            }
            @Override
            public Adapter caseTypeIdentifier(TypeIdentifier object) {
                return createTypeIdentifierAdapter();
            }
            @Override
            public Adapter caseInterfaceVariableDecl(InterfaceVariableDecl object) {
                return createInterfaceVariableDeclAdapter();
            }
            @Override
            public Adapter caseVariableDecl(VariableDecl object) {
                return createVariableDeclAdapter();
            }
            @Override
            public Adapter caseIVariable(IVariable object) {
                return createIVariableAdapter();
            }
            @Override
            public Adapter caseInput(Input object) {
                return createInputAdapter();
            }
            @Override
            public Adapter caseOutput(Output object) {
                return createOutputAdapter();
            }
            @Override
            public Adapter caseInputOutput(InputOutput object) {
                return createInputOutputAdapter();
            }
            @Override
            public Adapter caseReturn(Return object) {
                return createReturnAdapter();
            }
            @Override
            public Adapter caseAnnotatable(Annotatable object) {
                return createAnnotatableAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
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
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.ComplexExpression <em>Complex Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.ComplexExpression
     * @generated
     */
    public Adapter createComplexExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.TextualCode <em>Textual Code</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.TextualCode
     * @generated
     */
    public Adapter createTextualCodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Signal
     * @generated
     */
    public Adapter createSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject
     * @generated
     */
    public Adapter createValuedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.ValuedObjectReference <em>Valued Object Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.ValuedObjectReference
     * @generated
     */
    public Adapter createValuedObjectReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Value
     * @generated
     */
    public Adapter createValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.IntValue <em>Int Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.IntValue
     * @generated
     */
    public Adapter createIntValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.FloatValue <em>Float Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.FloatValue
     * @generated
     */
    public Adapter createFloatValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.BooleanValue <em>Boolean Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.BooleanValue
     * @generated
     */
    public Adapter createBooleanValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.OperatorExpression <em>Operator Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.OperatorExpression
     * @generated
     */
    public Adapter createOperatorExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.TextExpression <em>Text Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.TextExpression
     * @generated
     */
    public Adapter createTextExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.InterfaceDeclaration <em>Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.InterfaceDeclaration
     * @generated
     */
    public Adapter createInterfaceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.InterfaceSignalDecl <em>Interface Signal Decl</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.InterfaceSignalDecl
     * @generated
     */
    public Adapter createInterfaceSignalDeclAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.ISignal <em>ISignal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.ISignal
     * @generated
     */
    public Adapter createISignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.ChannelDescription <em>Channel Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.ChannelDescription
     * @generated
     */
    public Adapter createChannelDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier <em>Type Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.TypeIdentifier
     * @generated
     */
    public Adapter createTypeIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.InterfaceVariableDecl <em>Interface Variable Decl</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.InterfaceVariableDecl
     * @generated
     */
    public Adapter createInterfaceVariableDeclAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.VariableDecl <em>Variable Decl</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.VariableDecl
     * @generated
     */
    public Adapter createVariableDeclAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.IVariable <em>IVariable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.IVariable
     * @generated
     */
    public Adapter createIVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Input <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Input
     * @generated
     */
    public Adapter createInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Output <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Output
     * @generated
     */
    public Adapter createOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.InputOutput <em>Input Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.InputOutput
     * @generated
     */
    public Adapter createInputOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.core.expressions.Return <em>Return</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cau.cs.kieler.core.expressions.Return
     * @generated
     */
    public Adapter createReturnAdapter() {
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
	public Adapter createAnnotatableAdapter() {
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
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ExpressionsAdapterFactory
