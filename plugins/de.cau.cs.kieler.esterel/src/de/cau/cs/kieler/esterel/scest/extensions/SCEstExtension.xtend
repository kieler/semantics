/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.scest.extensions

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import com.google.common.collect.Multimap
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.ScopeStatement
import de.cau.cs.kieler.scl.scl.Thread
import java.util.LinkedList
import javax.xml.transform.TransformerException
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.EsterelThread
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.DelayExpr
import de.cau.cs.kieler.kexpressions.CombineOperator
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.esterel.PresentCase
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelAssignment
import de.cau.cs.kieler.esterel.esterel.ElsIf
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.TrapSignal
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.IVariable
import de.cau.cs.kieler.esterel.scest.scest.Set
import java.util.List
import de.cau.cs.kieler.esterel.esterel.SignalReferenceExpr
import de.cau.cs.kieler.esterel.esterel.TrapHandler
import de.cau.cs.kieler.esterel.scest.scest.ScestFactory
import de.cau.cs.kieler.esterel.esterel.Output

/**
 * Methods and static variables which are used by the transformations which
 * transform a given Esterel/SCEst program into a SCL program.
 * @author mrb
 * @author krat
 *
 */
class SCEstExtension {

    @Inject
    extension KExpressionsValuedObjectExtensions

    var static labelSuffix = 0;
    
    var static constantSuffix = 0;
    
    var static variableSuffix = 0;
    
    var static flagSuffix = 0;
    
    var static abortFlagSuffix = 0;
    
    var static depthFlagSuffix = 0;
    
    var static trapSuffix = 0;
    
    var static signalSuffix = 0;
    
    final private static String generatedAnnotation = "depth"
    
    final private static String interfaceScope = "IScope"
    
    // for valued singals: signal S will be transformed to s, s_set, s_cur, s_val => new NewSignals(s, s_set, s_cur, s_val)
    var static HashMap<ISignal, NewSignals> newSignals = new HashMap<ISignal, NewSignals>()

    def getNewSignals() {
        newSignals
    }
    
    def getGeneratedAnnotation() {
        generatedAnnotation
    }
    
    def getInterfaceScope() {
        interfaceScope
    }

    /**
     * Creates a reference to a ValuedObject
     * 
     * @param  valuedObjects The ValuedObject
     * @reutrn ValuedObjectReference to given ValuedObject
     */
    def createValuedObjectReference(ValuedObject valuedObject) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            it.valuedObject = valuedObject
        ]
    }

    /**
     * Returns an unused label by appending the labelCount to "_l" and incrementing label count. As all labels
     * used for the transformation are generated by this model, no label is used multiple times.
     * 
     * @return An unused label
     */
    def createNewUniqueLabel() {
        SCEstExtension.labelSuffix = SCEstExtension.labelSuffix + 1

        "_l" + SCEstExtension.labelSuffix
    }
    
    /**
     * Returns an unused label by appending the labelCount to "l" and incrementing label count. As all labels
     * used for the transformation are generated by this model, no label is used multiple times.
     * 
     * @return An unused label
     */
    def createNewUniqueLabelOptimization() {
        SCEstExtension.labelSuffix = SCEstExtension.labelSuffix + 1

        "l" + SCEstExtension.labelSuffix
    }

    /**
     * Resets the label count, should be called before a transformation.
     */
    def resetLabelSuffix() {
        labelSuffix = 0;
    }
    
    /**
     * Resets the constant count, should be called before a transformation.
     */
    def resetConstantSuffix() {
        constantSuffix = 0;
    }
    
    /**
     * Resets the variable count, should be called before a transformation.
     */
    def resetVariableSuffix() {
        variableSuffix = 0;
    }
    
    /**
     * Resets the flag count, should be called before a transformation.
     */
    def resetFlagSuffix() {
        flagSuffix = 0;
    }
    
    /**
     * Resets the abortFlag count, should be called before a transformation.
     */
    def resetAbortFlagSuffix() {
        abortFlagSuffix = 0;
    }
    
    /**
     * Resets the depthFlag count, should be called before a transformation.
     */
    def resetDepthFlagSuffix() {
        depthFlagSuffix = 0;
    }
    
    /**
     * Resets the trap count, should be called before a transformation.
     */
    def resetTrapSuffix() {
        trapSuffix = 0;
    }
    
    /**
     * Resets the signal count, should be called before a transformation.
     */
    def resetSignalSuffix() {
        signalSuffix = 0;
    }
    
    /**
     * Clear the newSignals map
     */
    def clearNewSignalsMap() {
        newSignals.clear
    }
    
    /**
     * Returns a new variable.
     * 
     * @param exp The value of the variable. Can be null.
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueVariable(Expression exp) {
        if (exp instanceof Expression) {
            createValuedObject(createNewUniqueVariableName) => [
                it.initialValue = exp
            ]
        }
        else {
            createValuedObject(createNewUniqueVariableName)
        }
    }
    
    /**
     * Returns a new trap variable.
     * 
     * @param exp The value of the variable. Can be null.
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createTrapVariable(ISignal trap) {
        if (trap != null) {
            createValuedObject(createNewUniqueTrapName(trap.name)) => [
                it.initialValue = trap.expression
                it.combineOperator = trap.combineOperator
            ]
        }
        else {
            createValuedObject(createNewUniqueTrapName)
        }
    }
    
    /**
     * Returns a new trap variable.
     * 
     * @param exp The value of the variable. Can be null.
     * @param name The name of the variable. Can be null.
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createTrapVariable(Expression expr, String name) {
        if (name != null) {
            createValuedObject(createNewUniqueTrapName(name)) => [
                it.initialValue = expr 
            ]
        }
        else {
            createValuedObject(createNewUniqueTrapName)
        }
    }
    
    /**
     * Returns a new signal variable.
     * 
     * @param exp The value of the variable. Can be null.
     * @param name The name of the variable. Can be null.
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createSignalVariable(Expression expr, CombineOperator op, String name) {
        createValuedObject(createNewUniqueSignalName(name)) => [
            it.initialValue = EcoreUtil.copy(expr)
            it.combineOperator = op
        ]
    }
    
    /**
     * Returns a new flag.
     * 
     * @param exp The value of the flag. true or false
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueFlag(Expression exp) {
        if (exp instanceof Expression) {
            createValuedObject(createNewUniqueFlagName) => [
                it.initialValue = exp
            ]
        }
        else {
            createValuedObject(createNewUniqueFlagName)
        }
    }
    
    /**
     * Returns a new abortFlag.
     * 
     * @param exp The value of the abortFlag. true or false
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueAbortFlag(Expression exp) {
        if (exp instanceof Expression) {
            createValuedObject(createNewUniqueAbortFlagName) => [
                it.initialValue = exp
            ]
        }
        else {
            createValuedObject(createNewUniqueAbortFlagName)
        }
    }
    
    /**
     * Returns a new depthFlag.
     * 
     * @param exp The value of the flag. true or false
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueDepthFlag(Expression exp) {
        if (exp instanceof Expression) {
            createValuedObject(createNewUniqueDepthFlagName) => [
                it.initialValue = exp
            ]
        }
        else {
            createValuedObject(createNewUniqueDepthFlagName)
        }
    }
    
    /**
     * Returns a new termFlag.
     * 
     * @param exp The value of the flag. true or false
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueTermFlag(Expression exp) {
        if (exp instanceof Expression) {
            createValuedObject(createNewUniqueTermFlagName) => [
                it.initialValue = exp
            ]
        }
        else {
            createValuedObject(createNewUniqueTermFlagName)
        }
    }
    
    /**
     * Returns an unused variable name. String: ( "_v" + counter )
     * @return Returns an unused variable name. String: ( "_v" + counter )
     */
    def createNewUniqueVariableName() {
        variableSuffix++
        "v" + variableSuffix
    }
    
    /**
     * Returns an unused flag name. String: ( "f" + counter )
     * @return Returns an unused flag name. String: ( "f" + counter )
     */
    def createNewUniqueFlagName() {
        flagSuffix++
        "f" + flagSuffix
    }
    
    /**
     * Returns an unused abortFag name. String: ( "abort" + counter )
     * @return Returns an unused abortFlag name. String: ( "abort" + counter )
     */
    def createNewUniqueAbortFlagName() {
        abortFlagSuffix++
        "abort" + abortFlagSuffix
    }
    
    /**
     * Returns an unused depthFlag name. String: ( "depth" + counter )
     * @return Returns an unused depthFlag name. String: ( "depth" + counter )
     */
    def createNewUniqueDepthFlagName() {
        depthFlagSuffix++
        "depth" + depthFlagSuffix
    }
    
    /**
     * Returns an unused termFlag name. String: ( "term" + counter )
     * @return Returns an unused termFlag name. String: ( "term" + counter )
     */
    def createNewUniqueTermFlagName() {
        flagSuffix++
        "term" + flagSuffix
    }
    
    /**
     * Returns an unused trap name. String: ( "T"  + counter )
     * @return Returns an unused trap name. String: ( "T"  + counter )
     */
    def createNewUniqueTrapName() {
        trapSuffix++
        "T" + trapSuffix
    }
    
    /**
     * Returns an unused trap name. String: ( name + "_" + "T" + counter )
     * @param name The name of the previous trap signal
     * @return Returns an unused trap name. String: ( name + "_" + "T" + counter )
     */
    def createNewUniqueTrapName(String name) {
        trapSuffix++
        name + "_" + "T" + trapSuffix 
    }
    
    /**
     * Returns an unused signal name. String: ( name + "_s" + counter)
     * @param name The name of the previous signal
     * @return Returns an unused signal name. String: ( name + "_s" + counter)
     */
    def createNewUniqueSignalName(String name) {
        signalSuffix++
        if (name != null) {
            return name + "_s" + signalSuffix
        }
        else {
            "s" + signalSuffix
        }
    }

    /**
     * Creates a new Label
     * 
     * @param label The label of the EmptyStatement
     * @return The created EmptyStatement
     */
    def createLabel(String label) {
        SclFactory::eINSTANCE.createLabel => [
            it.name = label
        ]
    }
    
    /**
     * Creates a new unique Label
     * 
     * @return The created EmptyStatement
     */
    def createLabel() {
        SclFactory::eINSTANCE.createLabel => [
            it.name = createNewUniqueLabel
        ]
    }

    /**
     * Creates a statement which increments a valued object by 1
     * 
     * @param valuedObject The valued object to increment
     * @return A statement which increments valObj
     */
    def Statement incrementInt(ValuedObject valuedObjectToIncrement) {
        createAssignment(valuedObjectToIncrement,
            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                operator = OperatorType::ADD
                subExpressions += createValuedObjectReference(valuedObjectToIncrement)
                subExpressions += createIntValue(1)
            ])
    }

    /**
      * Creates "if c then (pause;) goto l"
      * 
      * @param condition The condition
      * @param targetLabel The targetlabel
      * @param isImmediate When false a pause statement is added prior to the jump
      */
    def Conditional newIfThenGoto(Expression condition, Label targetLabel, boolean isImmediate) {
        SclFactory::eINSTANCE.createConditional => [
            expression = EcoreUtil.copy(condition)
            if (isImmediate) {
                statements.addAll(SclFactory::eINSTANCE.createPause)
            }
            statements.add(
                    SclFactory::eINSTANCE.createGoto => [
                        it.target = targetLabel
                    ])
        ]
    }

    /**
     * Adds a new goto instruction to a StatementSequence
     * 
     * @param statementSequence The StatementSequence to add the empty statement
     * @param label The target label 
     */
    def addGoto(EList<Statement> statementSequence, Label label) {
        statementSequence.add(createGotoStatement(label))
    }

    /**
    * Creates an Statement containing a goto
    * 
    * @param targetLabel The target label 
    */
    def createGotoStatement(Label targetLabel) {
        SclFactory::eINSTANCE.createGoto => [
            it.target = targetLabel
        ]
    }

    /**
     * Create an AND expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createAnd(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::LOGICAL_AND
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an OR expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createOr(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::LOGICAL_OR
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an NOT expression
     * 
     * @param arg1 first argument
     */
    def createNot(Expression arg1) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::NOT
            subExpressions.add(arg1)
        ]
    }

    /**
     * Create an Equals expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createEquals(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::EQ
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an greater than expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createGT(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::GT
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an greater equal than expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createGEQ(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::GEQ
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an less equal than expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createLEQ(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::LEQ
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }
    
    /**
     * Create an less than expression
     * 
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createLT(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::LT
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Creates a SCL conditional
     * 
     * @param expr The condition for the conditional statement.
     * @return A SCL conditional
     */
    def createConditional(Expression expr) {
        SclFactory::eINSTANCE.createConditional => [
            it.expression = EcoreUtil.copy(expr)
        ]
    }
    
    /**
     * Creates a KExpression Declaration
     * @param type The ValueType of the declaration
     * @param object A ValuedObject to the previous type
     * @return A KExpression Declaration
     */
    def createDeclaration(ValueType type, ValuedObject object) {
        KExpressionsFactory::eINSTANCE.createDeclaration => [
            it.type = type
            if (object != null) {
                it.valuedObjects.add(object)
            }
        ]
    }
    
    /**
     * Creates a KExpression Int Value
     * 
     * @param value The wanted value for IntValue.
     * @return A KExpression Int Value
     */
    def createIntValue(int value) {
        KExpressionsFactory::eINSTANCE.createIntValue => [
            it.value = value
        ]
    }
    
    /**
     * Creates a KExpression Bool Value
     * 
     * @param value The wanted value for Bool Value.
     * @return A KExpression Bool Value
     */
    def createBoolValue(boolean value) {
        KExpressionsFactory::eINSTANCE.createBoolValue => [
            it.value = value
        ]
    }
    
    /**
     * Creates a KExpression String Value
     * 
     * @param value The wanted value for String Value.
     * @return A KExpression String Value
     */
    def createStringValue(String value) {
        KExpressionsFactory::eINSTANCE.createStringValue => [
            it.value = value
        ]
    }
  
    /**
     * Adds a Statement to a StatementSequence
     * 
     * @param statementSequence The StatementSequence to add the statement to
     * @param statement The statement to add
     * @return The StatementSequence with added statement
     */
    def dispatch add(EList<Statement> statementSequence, Statement statement) {
        statementSequence.add(statement)
        statementSequence
    }

    /**
     * Adds all statements of a StatementSequence to another StatementSequence
     * 
     * @param statementSequence The StatementSequence to add the other to
     * @param statementSequenceToAdd The StatementSequence which should be added to the other one
     * @return The StatementSequence with the statements of the other one added
     */
    def dispatch add(EList<Statement> statementSequence, EList<Statement> statementSequenceToAdd) {
        statementSequence.addAll(statementSequenceToAdd)
        statementSequence
    }
    
    /**
     * Adds all statements of a StatementSequence to another StatementSequence at a specific position
     * 
     * @param statementSequence The StatementSequence to add the other to
     * @param pos The position where the statements should be added
     * @param statementSequenceToAdd The StatementSequence which should be added to the other one
     * @return The StatementSequence with the statements of the other one added
     */
    def add(EList<Statement> statementSequence, int pos, EList<Statement> statementSequenceToAdd) {
        var length = statementSequenceToAdd.length
        for (var i=0; i<length; i++) {
            statementSequence.add(pos+i, statementSequenceToAdd.get(0))
        }
        statementSequence
    }
    
    /**
     * Returns the list in which the given Statement is contained.
     * 
     * @param statement A Statement which is in the returned list 
     * @return The Statement list which includes the given Statement
     */
    def getContainingList(Statement statement) {
        statement.eContainer.eGet(statement.eContainingFeature) as EList<Statement>
    }
    
    /**
     * Returns the list in which the given Annotation is contained.
     * 
     * @param annotation An annotation which is in the returned list 
     * @return The annotation list which includes the given annotation
     */
    def getContainingList(Annotation annotation) {
        annotation.eContainer.eGet(annotation.eContainingFeature) as EList<Annotation>
    }

    /**
     * Creates an assignment
     * 
     * @param objectToAssign The ValuedObject to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createAssignment(ValuedObject objectToAssign, Expression expression) {
        SclFactory::eINSTANCE.createAssignment => [
            it.valuedObject = objectToAssign
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    /**
     * Creates a OperatorExpression
     * 
     * @param expr1 The first Expression which is combined by the operator
     * @param expr2 The second Expression which is combined by the operator
     * @param oType The OperatorType
     * @return An operator expression
     */
    def createOperatorExpression(Expression expr1, Expression expr2, OperatorType oType) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = oType
            subExpressions.add(EcoreUtil.copy(expr1))
            subExpressions.add(EcoreUtil.copy(expr2))
        ]
    }

    /**
     * Creates a new SCL ScopeStatement
     * 
     * @param decl Already existing declaration for the Scope statement.
     * @return The newly created SCL ScopeStatement
     */
    def createScopeStatement(Declaration decl) {
        SclFactory::eINSTANCE.createScopeStatement => [
            if (decl != null) {
                it.declarations.add(decl)
            }
        ]
    }
    
    /**
     * Creates a new SCL ScopeStatement
     * 
     * @return The newly created SCL ScopeStatement
     */
    def createScopeStatement() {
        SclFactory::eINSTANCE.createScopeStatement
    }

    /**
     * Creates a new SCL Thread
     * 
     * @return The newly created SCL Thread
     */
    def createThread() {
        SclFactory::eINSTANCE.createThread
    }

    /**
     * Creates a new SCL Thread
     * 
     * @param statement A statement for the thread
     * @return The newly created SCL Thread
     */
    def createThread(Statement statement) {
        SclFactory::eINSTANCE.createThread => [
            statements += statement
        ]
    }
    
    /**
     * Creates a new SCL Thread
     * 
     * @param statements A list of statements for the thread
     * @return The newly created SCL Thread
     */
    def createThread(EList<Statement> statements) {
        SclFactory::eINSTANCE.createThread => [
            it.statements.add(statements)
        ]
    }
    
    /**
     * Creates a new SCL Parallel
     * 
     * @return The newly created SCL Parallel
     */
    def createParallel() {
        SclFactory::eINSTANCE.createParallel
    }
    
    /**
     * Creates a new SCL Pause
     * 
     * @return The newly created SCL Pause
     */
    def createPause() {
        SclFactory::eINSTANCE.createPause
    }
    
    /**
     * Creates a new Esterel Abort
     * 
     * @return The newly created Esterel Abort
     */
    def createAbort() {
        EsterelFactory::eINSTANCE.createAbort
    }
    
    /**
     * Creates a new Esterel Abort
     * 
     * @param delay The delay expression for the abort statement
     * @return The newly created Esterel Abort
     */
    def createAbort(DelayExpr delay) {
        EsterelFactory::eINSTANCE.createAbort => [
            it.delay = EcoreUtil.copy(delay)
        ]
    }
    
    /**
     * Creates a new Esterel Halt
     * 
     * @return The newly created Esterel Halt
     */
    def createHalt() {
        EsterelFactory::eINSTANCE.createHalt
    }
    
    /**
     * Creates a new Esterel Loop/LoopEach
     * 
     * @return The newly created Esterel Loop/LoopEach
     */
    def createLoop() {
        EsterelFactory::eINSTANCE.createLoop
    }
    
    /**
     * Creates a new Esterel Await
     * 
     * @return The newly created Esterel Await
     */
    def createAwait() {
        EsterelFactory::eINSTANCE.createAwait
    }
    
    /**
     * Creates a new IntAnnotation with a specific value
     * 
     * @param depth The depth of the statement which includes this annotation
     * @return The newly created Annotation
     */
    def createAnnotation(int depth) {
        AnnotationsFactory::eINSTANCE.createIntAnnotation => [
            name = generatedAnnotation
            value = depth
        ]
    }
    
    /**
     * Check whether in an annotation list there is an annotation named "depth".
     * 
     * @param annotations
     * @return Is there an annotation which is named "generated_ifTest"?
     */
    def isGenerated(EList<Annotation> annotations) {
        var generated = false
        for (a : annotations) {
            generated = generated || a.name.equals(generatedAnnotation) 
        }
        return generated
    }
    
    /**
     * Is the annotation generated?
     * 
     * @param annotation The annotation in question
     * @return Is the annotation generated?
     */
    def isGenerated(Annotation annotation) {
        return annotation.name.equals(generatedAnnotation)
    }
    
    /**
     * Creates a new Emit Statement
     * 
     * @param sustain The sustain statement which is being transformed
     * @return The newly created emit statement
     */
    def createEmit(Sustain sustain) {
        EsterelFactory::eINSTANCE.createEmit => [
            it.signal = sustain.signal
            it.expression = sustain.expression
        ]
    }
    
    /**
     * Insert a Conditional at the right position after a pause/parallel statement.
     * 
     * @param statements The list of statements
     * @param conditional The conditional which has to be added after a pause/parallel
     * @param pos The position of the pause/parallel statement
     * @param depth The depth of statement which caused the transformation 
     */
    def void insertConditional(EList<Statement> statements, Conditional conditional, int pos, int depth) {
        // Look for already existing Conditionals after Pause.
        // Check whether they have a higher priority than the transformed statement.
        // Place the Conditional at the correct position.
        // Because there is no 'break' in Xtend "i = statements.length" is used to end the for loop.
        if (pos+1>=statements.length) {
            statements.add(conditional)
        }
        else {
            for (var i=1; pos+i<statements.length; i++) {
                if (statements.get(pos+i) instanceof Conditional) {
                    var ifTest2 = statements.get(pos+i) as Conditional
                    if (!ifTest2.annotations.empty) {
                        var deeper = false
                        for (var j=0; j<ifTest2.annotations.length; j++) {
                            var a = ifTest2.annotations.get(j)
                            if (a.name.equals(generatedAnnotation)) {
                                deeper = true
                                var layer = (a as IntAnnotation).value
                                if (depth<layer) {
                                    deeper = false
                                    j = ifTest2.annotations.length
                                }
                            }
                            
                        }
                        if (!deeper) {
                            statements.add(pos+i, conditional)
                            i = statements.length
                        }
                    }
                    else {
                        statements.add(pos+i, conditional)
                        i = statements.length
                    }
                }
                else {
                    statements.add(pos+i, conditional)
                    i = statements.length
                }
                if (pos+i+1==statements.length) {
                    statements.add(conditional)
                }
            }
        }
    }
    
    /**
     * Insert a Conditional at the right position above a pause statement.
     * 
     * @param statements The list of statements
     * @param conditional The conditional which has to be added above a pause
     * @param pos The position of the pause statement
     * @param depth The depth of statement which caused the pause transformation 
     */
    def void insertConditionalAbove(EList<Statement> statements, Conditional conditional, int pos, int depth) {
        // Look for already existing Conditionals above Pause.
        // Check whether they have a higher priority than the transformed statement.
        // Place the Conditional at the correct position.
        // Because there is no 'break' in Xtend "i = statements.length" is used to end the for loop.
        if (pos == 0) {
            statements.add(0, conditional)
        }
        else {
            for (var i=1; pos-i>=0; i++) {
                if (statements.get(pos-i) instanceof Conditional) {
                    var conditional2 = statements.get(pos-i) as Conditional
                    if (!conditional2.annotations.empty) {
                        var deeper = false
                        for (var j=0; j<conditional2.annotations.length; j++) {
                            var a = conditional2.annotations.get(j)
                            if (a.name.equals(generatedAnnotation)) {
                                deeper = true
                                var layer = (a as IntAnnotation).value
                                if (layer<=depth) {
                                    deeper = false
                                    j = conditional2.annotations.length
                                }
                            }
                            
                        }
                        if (!deeper) {
                            statements.add(pos+1-i, conditional)
                            i = statements.length
                        }
                    }
                    else {
                        statements.add(pos+1-i, conditional)
                        i = statements.length
                    }
                }
                else {
                    statements.add(pos+1-i, conditional)
                    i = statements.length
                }
                if (pos-i==0) {
                    statements.add(0, conditional)
                }
            }
        }
    }
    
    /**
     * Returns the given label or the thread end label. Depends on which comes first.
     * 
     * @param label The label which is the current target
     * @param statement The statement which is the starting point of the search
     * @return Returns the given label or the thread end label. Depends on which comes first.
     */
    def Label findClosestLabel(Label label, Statement statement) {
        var parent = statement.eContainer
        var labelParent = label.eContainer
        while (true) {
            if (parent == labelParent) {
                return label
            }
            else if (parent instanceof Thread) {
                var thread = parent as Thread
                if (thread.statements.last instanceof Label) {
                    return thread.statements.last as Label
                }
                else { 
                    var newLabel = createLabel
                    thread.statements.add(newLabel)
                    return newLabel
                }
            }
            else if (parent instanceof EsterelThread) {
                var thread = parent as EsterelThread
                if (thread.statements.last instanceof Label) {
                    return thread.statements.last as Label
                }
                else { 
                    var newLabel = createLabel
                    thread.statements.add(newLabel)
                    return newLabel
                }
            }
            else if (parent instanceof SCEstModule) {
                // shouldn't be possible
                var module = parent as SCEstModule
                var newLabel = createLabel
                module.statements.add(newLabel)
                return newLabel 
            }
            parent = parent.eContainer
        }
    }
    
    /**
     * Create an ElseScope for a Conditional.
     * 
     * @param statements The statements which belong in the ElseScope
     * @return An ElseScope with statements
     */
    def createElseScope(EList<Statement> statements) {
        SclFactory::eINSTANCE.createElseScope => [
            if (statements != null) {
                it.statements.add(statements)
            }
        ]
    }
    
    /**
     * Create an ElseScope for a Conditional.
     * 
     * @param statement The statement which belong in the ElseScope
     * @return An ElseScope with a statement
     */
    def createElseScope(Statement statement) {
        SclFactory::eINSTANCE.createElseScope => [
            if (statement != null) {
                it.statements.add(statement)
            }
        ]
    }
    
    /**
     * Copies the generated Annotations of the annotation list to a specific statement.
     * 
     * @param annotations The list of annotations
     * @param statement The statement which will have a copy of the generated annotations.
     */
    def void copyAnnotations (EList<Annotation> annotations, Annotatable statement) {
        for (a : annotations) {
            if (isGenerated(a)) {
                statement.annotations.add(EcoreUtil.copy(a))
            }
        }
    }
    
    /**
     * Returns the depth of the given statement, when it has one in its annotations.
     * 
     * @param statement The statement in question
     * @return The depth of the given statement.
     */
    def int getDepth(Annotatable statement) {
        for (Annotation a : statement.annotations) {
            if (isGenerated(a)) {
                return (a as IntAnnotation).value
            }
        }
        return 0;
    }
    
    /**
     * Check for every Goto statement if its target is still inside its Thread
     * 
     * @param statements The statements which need to be checked
     */
    def void checkGotos(EList<Statement> statements) {
        statements?.forEach [ s |
            s.checkGoto
        ]
    }
    
    /**
     * Check if 'statement' is a Goto statement and when it is, check if its target is still inside its Thread
     * 
     * @param statement A statement which needs to be checked
     */
    def void checkGoto(Statement statement) {
        if (statement instanceof Goto) {
            var goto = (statement as Goto)
            goto.target = findClosestLabel(goto.target, statement)
        }
        else if (statement instanceof StatementContainer) {
            
            checkGotos((statement as StatementContainer).statements)
            
            if (statement instanceof Trap) {
                (statement as Trap).trapHandler?.forEach[h | checkGotos(h.statements)]
            }
            else if (statement instanceof Abort) {
                checkGotos((statement as Abort).doStatements)
                (statement as Abort).cases?.forEach[ c | checkGotos(c.statements)]
            }
            else if (statement instanceof Await) {
                (statement as Await).cases?.forEach[ c | checkGotos(c.statements)]
            }
            else if (statement instanceof Exec) {
                (statement as Exec).execCaseList?.forEach[ c | checkGotos(c.statements)]
            }
            else if (statement instanceof Do) {
                checkGotos((statement as Do).watchingStatements)
            }
            else if (statement instanceof Conditional) {
                checkGotos((statement as Conditional).getElse()?.statements)
            }
        }
        else if (statement instanceof Present) {
            checkGotos((statement as Present).thenStatements)
            (statement as Present).cases?.forEach[ c | checkGotos(c.statements)]
            checkGotos((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            checkGotos((statement as IfTest).thenStatements)
            (statement as IfTest).elseif?.forEach [ elsif | checkGotos(elsif.thenStatements)]
            checkGotos((statement as IfTest).elseStatements)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                checkGotos(t.statements)
            ]
        }
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                checkGotos(t.statements)
            ]
        }
    }
    
    /**
     * Check the combine operator and return a corresponding operator of type 'OperatorType' or throw Exception
     * 
     * @param operator The combine operator to check
     * @return The corresponding OperatorType
     */
    def OperatorType getOperator(CombineOperator operator) {
        var OperatorType newOperator
        if (operator == CombineOperator.ADD) {
            newOperator = OperatorType.ADD
        }
        else if (operator == CombineOperator.MULT) {
            newOperator = OperatorType.MULT
        }
        else if (operator == CombineOperator.OR) {
            newOperator = OperatorType.LOGICAL_OR
        }
        else if (operator == CombineOperator.AND) {
            newOperator = OperatorType.LOGICAL_AND
        }
        else {
            throw new UnsupportedOperationException("The following combine operator is not supported! " + operator.toString)
        }
        return newOperator
    }
    
    /**
     * Create a bool expression 'true'
     */
    def createTrue() {
        createBoolValue(true)
    }
    
    /**
     * Create a bool expression 'false'
     */
    def createFalse() {
        createBoolValue(false)
    }
    
    /**
     * Return the neutral element for a specific combine function
     * 
     * @param op The combine operator which specifies the combine function
     */
    def Expression getNeutral(CombineOperator op) {
        switch op {
            case CombineOperator.ADD:
                return createIntValue(0)
            case CombineOperator.MULT:
                return createIntValue(1)
            case CombineOperator.OR :
                return createFalse
            case CombineOperator.AND :
                return createTrue
// TODO          case CombineOperator.NONE:
            default : {
                throw new UnsupportedOperationException(
                        "No neutral Element for: " + op.toString)
            }
        }
    }
    
    /**
     * Transform all references to ISignals in the scope of the given statement.
     * 
     * @param statement The statement which sets the scope
     */
    def transformReferences(Statement statement) {
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed signal then set the reference to the new signal
        var references = statement.eAllContents.filter(ValuedObjectReference).toList
        for (ref : references) {
            if (ref.valuedObject instanceof ISignal) {
                var signal = ref.valuedObject as ISignal
                // if the valued object reference references a transformed signal
                if (newSignals.containsKey(signal)) {
                    var parent = ref.eContainer
                    if (parent instanceof OperatorExpression) {
                        if ( (parent as OperatorExpression).operator == OperatorType.VAL) {
                            if (newSignals.get(signal).s_val == null) {
                                throw new UnsupportedOperationException("The '?' expression is not valid because of a missing 's_val' valued object for the following Signal! " + signal.name)
                            }
                            ref.valuedObject = newSignals.get(signal).s_val
                            removeValueTestOperator(parent)
                        }
                        else if ( (parent as OperatorExpression).operator == OperatorType.PRE) { 
                            if (ref instanceof SignalReferenceExpr){
                                var list = ref.eContainer.eGet(ref.eContainingFeature) as EList<Expression>
                                var pos = list.indexOf(ref)
                                list.set(pos, createValuedObjectReference(newSignals.get(signal).s))
                            }
                            else {
                                if (newSignals.get(signal).s_val == null) {
                                    throw new UnsupportedOperationException("The 'pre()' expression is not valid because of a missing 's_val' valued object for the following Signal! " + signal.name)
                                }
                                ref.valuedObject = newSignals.get(signal).s_val 
                            }
                        }
                        else {
                            ref.valuedObject = newSignals.get(signal).s
                        }
                    }
                    else {
                        ref.valuedObject = newSignals.get(signal).s
                    }
                }
            }
            // if "ref" is still a SignalReferenceExpr it must be transformed into a ValuedObjectReference
            if (ref.eContainer != null && ref instanceof SignalReferenceExpr && ref.valuedObject != null) {
                if(ref.eContainer.eGet(ref.eContainingFeature) instanceof EList) {
                    var list = ref.eContainer.eGet(ref.eContainingFeature) as EList<Expression>
                    var pos = list.indexOf(ref)
                    list.set(pos, createValuedObjectReference(ref.valuedObject))
                }
                else {
                    var voRef = createValuedObjectReference(ref.valuedObject)
                    setExpression(voRef, ref.eContainer, true)
                    System.out.println(voRef)
                }
            }
        }
    }
    
    /**
     * Return a KExpression Function
     * 
     * @param name The name of the new function
     * @return The created function
     */
    def createFunction(String name) {
        KExpressionsFactory::eINSTANCE.createFunctionCall => [
            it.functionName = name
        ]
    }
    
    /**
     * Return a KExpression Parameter
     * 
     * @param expr The expression of the new parameter
     * @param reference Is the parameter a call by reference?
     * @return The created parameter
     */
    def createParameter(Expression expr, boolean reference) {
        KExpressionsFactory::eINSTANCE.createParameter => [
            it.callByReference = reference
            it.expression = expr
        ]
    }
    
    /**
     * Set the given expression where it belongs in the given obj.
     * If 'o' instanceof ISignal => signal.expression = expr
     * 
     * @param expr The expression which needs to be placed somewhere
     * @param o The object which should be able to hold an expression
     * @param signalExpr set a previous signalExpression
     */
    def setExpression(Expression expr, EObject o, boolean signalExpr) {
        if (o instanceof ISignal) {
            (o as ISignal).expression = expr
        }
        else if (o instanceof Emit) {
            (o as Emit).expression = expr
        }
        else if (o instanceof Sustain) {
            (o as Sustain).expression = expr
        }
        else if (o instanceof EsterelAssignment) {
            (o as EsterelAssignment).expression = expr
        }
        else if (o instanceof IfTest) {
            (o as IfTest).expression = expr
        }
        else if (o instanceof ElsIf) {
            (o as ElsIf).expression = expr
        }
        else if (o instanceof Repeat) {
            (o as Repeat).expression = expr
        }
        else if (o instanceof Exit) {
            (o as Exit).expression = expr
        }
        else if (o instanceof IVariable) {
            (o as IVariable).expression = expr
        }
        else if (o instanceof DelayExpr) {
            if (signalExpr) {
                (o as DelayExpr).signalExpr = expr                
            }
            else {
                (o as DelayExpr).expression = expr
            }
        }
        else if (o instanceof Conditional) {
            (o as Conditional).expression = expr
        }
        else if (o instanceof Assignment) {
            (o as Assignment).expression = expr
        }
        else if (o instanceof Set) {
            (o as Set).expression = expr
        }
        else if (o instanceof Present) {
            (o as Present).expression = expr
        }
        else if (o instanceof TrapHandler) {
            (o as TrapHandler).trapExpr = expr
        }
        else {
            throw new UnsupportedOperationException("The following expression will be homeless! " + expr.toString)
        }
        
    }
    
    /**
     * Checks if the given scope has the interfaceScope annotation
     * 
     * @param scope The scope in question
     */
    def isInterfaceScope(Statement statement) {
        if (statement instanceof ScopeStatement) {
            var scope = statement as ScopeStatement
            for (a : scope.annotations) {
                if (a.name.equals(interfaceScope)) {
                    return true
                }
            }
        }
        return false
    }
    
    /**
     * Checks if the given annotation is named "IScope"
     * 
     * @param annotation The annotation in question
     */
    def isInterfaceAnnotation(Annotation annotation) {
        annotation.name.equals(interfaceScope)
    } 
    
    /**
     * Adds the specific interfaceScope annotation to the given scope
     * 
     * @param scope The scope which needs an annotation
     */
    def markInterfaceScope(ScopeStatement scope) {
        scope.annotations.add(createScopeAnnotation)
    }
    
    /**
     * Creates an annotation which has the specific interfaceScope name
     */
    def createScopeAnnotation() {
        AnnotationsFactory::eINSTANCE.createAnnotation => [
            it.name = interfaceScope
        ]
    }
    
    /**
     * Returns a new interface scope or an already existing
     * 
     * @param module The module which is searched for the interface scope
     */
    def ScopeStatement getIScope(SCEstModule module) {
        var ScopeStatement scope
        // check whether there is already a scope for the interface declarations or not
        if (module.statements.length == 1 && module.statements.get(0).isInterfaceScope() ) {
            scope = module.statements.get(0) as ScopeStatement
        }
        else {
            scope = createScopeStatement
            scope.markInterfaceScope
            scope.statements.add(module.statements)
            module.statements.add(scope)
        }
        return scope
    }
    
    /**
     * Removes the value test operator if the given operator expression is of type VAL
     * 
     * @param expr The operator expression in question 
     */
    def removeValueTestOperator(EObject expr) {
        if (expr instanceof OperatorExpression) {
            if (expr.operator == OperatorType.VAL) {
                if(expr.eContainer.eGet(expr.eContainingFeature) instanceof EList) {
                    var list = expr.eContainer.eGet(expr.eContainingFeature) as EList<Expression>
                    var pos = list.indexOf(expr)
                    list.set(pos, expr.subExpressions.get(0))
                }
                else {
                    setExpression(expr.subExpressions.get(0), expr.eContainer, false)
                }
            }
        }
    }
    
    /**
     * Creates a SCLProgam
     */
    def createSCLProg() {
        SclFactory::eINSTANCE.createSCLProgram
    }
    
    /**
     * Creates a SCEstProgram
     */
     def createSCEstProgram() {
         ScestFactory::eINSTANCE.createSCEstProgram
     }
     
     /**
      * Creates a SCEstModule
      */
     def createSCEstModule() {
         ScestFactory::eINSTANCE.createSCEstModule
     }
    
    /**
     * Renames an interface scope to the module name
     * 
     * @param scope The scope which should be renamed
     * @param name The name of the module 
     */
    def renameIScope(ScopeStatement scope, String name) {
        var list = newLinkedList
        for (a : scope.annotations) {
            if (a.name.equals(interfaceScope)) {
                list.add(a)
            }
        }
        list.forEach[a | scope.annotations.remove(a)]
        scope.annotations.add( 
            AnnotationsFactory::eINSTANCE.createAnnotation => [
                it.name = name
            ])
    } 
    
    /**
     * Checks if the given ValueType is of type PURE
     * 
     * @param type The ValueType in question
     */
    def isPure(ValueType type) {
         type == ValueType.PURE
     }
     
     /**
      * Checks if an emit is allowed for a specific signal
      * 
      * @param signal The signal in question
      */
     def emitAllowed(ISignal signal) {
         (signal.eContainer instanceof Output || signal.eContainer instanceof LocalSignalDecl
         || signal.eContainer instanceof InputOutput)
     }
     
     /**
      * Checks if combine operator fits value type
      * 
      * @param type The type of the valued object
      * @param the combine operator of the valued object
      */
     def combineOperatorFitsType(ValueType type, CombineOperator operator) {
         if (type == ValueType.DOUBLE || type == ValueType.FLOAT ||
             type == ValueType.INT || type == ValueType.UNSIGNED 
             ) {
                 if (operator == CombineOperator.ADD || operator == CombineOperator.MULT ||
                     operator == CombineOperator.MIN || operator == CombineOperator.MAX  ||
                     operator == CombineOperator.NONE
                 ) {
                     return true
                 }
                 else {
                     return false
                 }
         }
         else if (type == ValueType.BOOL) {
             if (operator == CombineOperator.AND || operator == CombineOperator.OR ||
                     operator == CombineOperator.NONE 
                 ) {
                     return true
                 }
                 else {
                     return false
                 }
         }
         else {
             return true
         }
     }
 
}
