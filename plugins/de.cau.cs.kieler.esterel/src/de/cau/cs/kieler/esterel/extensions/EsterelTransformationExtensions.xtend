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
package de.cau.cs.kieler.esterel.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.ConstantDeclaration
import de.cau.cs.kieler.esterel.ConstantRenaming
import de.cau.cs.kieler.esterel.DelayExpression
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.ElsIf
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.Exec
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.FunctionRenaming
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Procedure
import de.cau.cs.kieler.esterel.ProcedureDeclaration
import de.cau.cs.kieler.esterel.ProcedureRenaming
import de.cau.cs.kieler.esterel.Repeat
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.esterel.SignalReference
import de.cau.cs.kieler.esterel.SignalRenaming
import de.cau.cs.kieler.esterel.Sustain
import de.cau.cs.kieler.esterel.Task
import de.cau.cs.kieler.esterel.TaskDeclaration
import de.cau.cs.kieler.esterel.TaskRenaming
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TrapHandler
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.esterel.TypeDefinition
import de.cau.cs.kieler.esterel.TypeIdentifier
import de.cau.cs.kieler.esterel.TypeRenaming
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Goto
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import de.cau.cs.kieler.scl.Thread
import java.util.HashMap
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.esterel.PresentCase
import de.cau.cs.kieler.esterel.TickReference

/**
 * Methods and static variables which are used by the transformations which
 * transform a given Esterel/SCEst program into a SCL program.
 * @author mrb
 * @author krat
 *
 */
class EsterelTransformationExtensions {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension EsterelExtensions

    var static labelSuffix = 0;
    
    var static constantSuffix = 0;
    
    var static variableSuffix = 0;
    
    var static flagSuffix = 0;
    
    var static abortFlagSuffix = 0;
    
    var static depthFlagSuffix = 0;
    
    var static trapSuffix = 0;
    
    var static signalSuffix = 0;
    
    var static moduleSuffix = 0;
    
    final private static String s_cur = "s_cur"
    
    final private static String s_val = "s_val"
    
    final private static String s_set = "s_set"
    
    final private static String conditionals_above = "conditional_above"
    
    final private static String generatedAnnotation = "depth"
    
    final private static String interfaceScope = "IScope"
    
    final private static String generatedModule = "generatedModuleForRun"
    
    // for valued singals: signal S will be transformed to s, s_set, s_cur, s_val => new NewSignals(s, s_set, s_cur, s_val)
    var static HashMap<Signal, NewSignals> newSignals = new HashMap<Signal, NewSignals>()

    def getNewSignals() {
        newSignals
    }
    
    def getGeneratedAnnotation() {
        generatedAnnotation
    }
    
    def getInterfaceScope() {
        interfaceScope
    }
    
    def getGeneratedModule() {
        generatedModule
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
        EsterelTransformationExtensions.labelSuffix = EsterelTransformationExtensions.labelSuffix + 1

        "_l" + EsterelTransformationExtensions.labelSuffix
    }
    
    /**
     * Returns an unused label by appending the labelCount to "l" and incrementing label count. As all labels
     * used for the transformation are generated by this model, no label is used multiple times.
     * 
     * @return An unused label
     */
    def createNewUniqueLabelOptimization() {
        EsterelTransformationExtensions.labelSuffix = EsterelTransformationExtensions.labelSuffix + 1

        "l" + EsterelTransformationExtensions.labelSuffix
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
     * Resets the module count, should be called before a transformation.
     */
    def resetModuleSuffix() {
        moduleSuffix = 0;
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
    def ValuedObject createTrapVariable(Signal trap) {
        if (trap !== null) {
            createValuedObject(createNewUniqueTrapName(trap.name)) => [
                it.initialValue = trap.initialValue
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
        if (name !== null) {
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
        if (name !== null) {
            createValuedObject(name) => [
                it.initialValue = EcoreUtil.copy(expr)
                it.combineOperator = op
            ]
        }
        else {
            createValuedObject(createNewUniqueSignalName(null)) => [
            it.initialValue = EcoreUtil.copy(expr)
            it.combineOperator = op
        ]
        }
        
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
        if (name !== null) {
            return name + "_sig"
        }
        else {
            signalSuffix++
            "s" + signalSuffix
        }
    }
    
    /**
     * Returns an unused constant name. String: ( name + "_" + "C" + counter )
     * @param name The name of the previous constant
     * @return Returns an unused constant name. String: ( name + "_" + "C" + counter )
     */
    def createNewUniqueConstantName(String name) {
        constantSuffix++
        name + "_" + "C" + constantSuffix 
    }
    
    /**
     * Returns an unused sensor name. String: ( name + "_S" + counter )
     * @param name The name of the previous sensor
     * @return Returns an unused sensor name. String: ( name + "_S" + counter )
     */
    def createNewUniqueSensorName(String name) {
        signalSuffix++
        name + "_S" + signalSuffix
    }
    
    /**
     * Returns an unused module name. String: ( name + "_" + counter )
     * @param name The name of the previous module
     * @return Returns an unused module name. String: ( name + "_" + counter )
     */
    def createNewUniqueModuleName(String name) {
        moduleSuffix++
        name + "_" + moduleSuffix
    }
    
    /**
     * Returns an unused type name. String: ( name + "_" + counter )
     * @param name The name of the previous type
     * @return Returns an unused type name. String: ( name + "_" + counter )
     */
    def createNewUniqueTypeName(String name) {
        moduleSuffix++
        name + "_type" + moduleSuffix
    }

    /**
     * Creates a new Label
     * 
     * @param label The label of the EmptyStatement
     * @return The created EmptyStatement
     */
    def createLabel(String label) {
        SCLFactory::eINSTANCE.createLabel => [
            it.name = label
        ]
    }
    
    /**
     * Creates a new unique Label
     * 
     * @return The created EmptyStatement
     */
    def createLabel() {
        SCLFactory::eINSTANCE.createLabel => [
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
        createAssignment(valuedObjectToIncrement.createValuedObjectReference,
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
      * @param isImmediate When true a pause statement is added prior to the jump
      */
    def Conditional newIfThenGoto(Expression condition, Label targetLabel, boolean isImmediate) {
        SCLFactory::eINSTANCE.createConditional => [
            expression = EcoreUtil.copy(condition)
            if (isImmediate) {
                statements.addAll(SCLFactory::eINSTANCE.createPause)
            }
            statements.add(
                    SCLFactory::eINSTANCE.createGoto => [
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
        SCLFactory::eINSTANCE.createGoto => [
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
        SCLFactory::eINSTANCE.createConditional => [
            it.expression = EcoreUtil.copy(expr)
        ]
    }
    
    /**
     * Creates a KExpression Declaration
     * @param type The ValueTypeDefinition of the declaration
     * @param object A ValuedObject to the previous type
     * @return A KExpression Declaration
     */
    def createDeclaration(ValueType type, ValuedObject object) {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration => [
            it.type = type
            if (object !== null) {
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
     * Returns the list in which the given Module is contained.
     * 
     * @param module A Module which is in the returned list 
     * @return The Module list which includes the given Module
     */
    def getContainingList(Module module) {
        if (module === null || module.eContainer === null || module.eContainingFeature === null) {
            throw new Exception("The module " + module.name + " does not have a containing list.\n"
                + "module: " + module
                + "\neContainer: " + module.eContainer
                + "\nContainingFeature:" + module.eContainingFeature
            )
        }
        module.eContainer.eGet(module.eContainingFeature) as EList<Module>
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
     * Returns the list in which the given thread is contained.
     * 
     * @param thread A thread which is in the returned list 
     * @return The thread list which includes the given thread
     */
    def getContainingList(Thread thread) {
        thread.eContainer.eGet(thread.eContainingFeature) as EList<Thread>
    }
    
    /**
     * Returns the list in which the given PresentCase is contained.
     * 
     * @param pCase A PresentCase which is in the returned list 
     * @return The cases list which includes the given case
     */
    def getContainingList(PresentCase pCase) {
        pCase.eContainer.eGet(pCase.eContainingFeature) as EList<PresentCase>
    }
    
    /**
     * Returns the list in which the given Elsif is contained.
     * 
     * @param elsif A ElsIf which is in the returned list 
     * @return The ElsIf list which includes the given ElsIf
     */
    def getContainingList(ElsIf elsif) {
        elsif.eContainer.eGet(elsif.eContainingFeature) as EList<ElsIf>
    }
    
    /**
     * Returns the list in which the given EObject is contained.
     * 
     * @param obj A EObject which is in the returned list 
     * @return The EObject list which includes the given EObject
     */
    def getContainingList(EObject obj) {
        obj.eContainer.eGet(obj.eContainingFeature) as EList<EObject>
    }
    
    /**
     * Returns the list in which the given TrapHandler is contained.
     * 
     * @param handler A TrapHandler which is in the returned list 
     * @return The Handler list which includes the given TrapHandler
     */
    def getContainingList(TrapHandler handler) {
        handler.eContainer.eGet(handler.eContainingFeature) as EList<TrapHandler>
    }

    /**
     * Creates an assignment
     * 
     * @param objectToAssign The valued object to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createAssignment(ValuedObject objectToAssign, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.reference = objectToAssign.createValuedObjectReference
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    /**
     * Creates an assignment with a SignalReference instead of a ValuedObjectReference.
     * 
     * @param objectToAssign The valued object to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createSignalAssignment(ValuedObject objectToAssign, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.reference = objectToAssign.createSignalReference
            it.expression = EcoreUtil.copy(expression)
        ]
    }

    /**
     * Creates an assignment
     * 
     * @param reference The ValuedObjectReference representing the vo to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createAssignment(ValuedObjectReference reference, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.reference = reference
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    def createSCLAssignment(ValuedObject objectToAssign, Expression expression) {
        createAssignment(objectToAssign, expression) 
    }
    
    /**
     * Creates an assignment for the 's_cur' variable which does not exist yet
     * therefore the signal is temporarily used for the assignment 
     * 
     * @param sigRef The SignalReference representing the signal to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createCurAssignment(SignalReference sigRef, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.annotations += createAnnotation(s_cur)
            it.reference = sigRef
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    /**
     * Creates an assignment for the 's_set' variable which does not exist yet
     * therefore the signal is temporarily used for the assignment 
     * 
     * @param sigRef The SignalReference representing the signal to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createSetAssignment(SignalReference sigRef, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.annotations += createAnnotation(s_set)
            it.reference = sigRef
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    /**
     * Creates an assignment for the 's_val' variable which does not exist yet
     * therefore the signal is temporarily used for the assignment 
     * 
     * @param sigRef The SignalReference representing the signal to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createValAssignment(SignalReference sigRef, Expression expression) {
        SCLFactory::eINSTANCE.createAssignment => [
            it.annotations += createAnnotation(s_val)
            it.reference = sigRef
            it.expression = EcoreUtil.copy(expression)
        ]
    }
    
    /**
     * Creates a OperatorExpression
     * 
     * @param expr1 The first Expression which is combined by the operator
     * @param expr2 The second Expression which is combined by the operator
     * @param oTypeDefinition The OperatorType
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
        SCLFactory::eINSTANCE.createScopeStatement => [
            if (decl !== null) {
                it.declarations.add(decl)
            }
        ]
    }
    
    /**
     * Creates a new SCL ScopeStatement
     * 
     * @param statements Already existing statements for the Scope statement.
     * @return The newly created SCL ScopeStatement
     */
    def createScopeStatement(EList<Statement> statements) {
        SCLFactory::eINSTANCE.createScopeStatement => [
            if (statements !== null) {
                it.statements.addAll(statements)
            }
        ]
    }
    
    /**
     * Creates a new SCL ScopeStatement
     * 
     * @return The newly created SCL ScopeStatement
     */
    def createScopeStatement() {
        SCLFactory::eINSTANCE.createScopeStatement
    }

    /**
     * Creates a new SCL Thread
     * 
     * @return The newly created SCL Thread
     */
    def createThread() {
        SCLFactory::eINSTANCE.createThread
    }

    /**
     * Creates a new SCL Thread
     * 
     * @param statement A statement for the thread
     * @return The newly created SCL Thread
     */
    def createThread(Statement statement) {
        SCLFactory::eINSTANCE.createThread => [
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
        SCLFactory::eINSTANCE.createThread => [
            it.statements.add(statements)
        ]
    }
    
    /**
     * Creates a new SCL Parallel
     * 
     * @return The newly created SCL Parallel
     */
    def createParallel() {
        SCLFactory::eINSTANCE.createParallel
    }
    
    /**
     * Creates a new SCL Pause
     * 
     * @return The newly created SCL Pause
     */
    def createPause() {
        SCLFactory::eINSTANCE.createPause
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
    def createAbort(DelayExpression delay) {
        EsterelFactory::eINSTANCE.createAbort => [
            it.delay = EcoreUtil.copy(delay)
        ]
    }
    
    /**
     * Adds the functionality of a halt statement at the end of a list.
     * 
     * @param statements The list of statements which needs the halt functionality at the end 
     */
    def addHaltFunctionality(EList<Statement> statements) {
        val label = createLabel
        statements.add(label)
        statements.add(createPause)
        statements.add(label.createGotoStatement)
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
    
//    /**
//     * Creates a new IntAnnotation with a specific value
//     * 
//     * @param depth The depth of the statement which includes this annotation
//     * @return The newly created Annotation
//     */
//    def createAnnotation(int depth) {
//        AnnotationsFactory::eINSTANCE.createIntAnnotation => [
//            name = generatedAnnotation
//            value = depth
//        ]
//    }
    
    /**
     * Creates a new Annotation with a specific name
     * 
     * @param name The name of this annotation
     * @return The newly created Annotation
     */
    def createAnnotation(String name) {
        AnnotationsFactory::eINSTANCE.createAnnotation => [
            it.name = name
        ]
    }
    
    /**
     * Creates a new Annotation with says that the module was generated
     * 
     * @return The newly created Annotation
     */
    def createModuleAnnotation() {
        AnnotationsFactory::eINSTANCE.createAnnotation => [
            it.name = generatedModule
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
    
//    /**
//     * Insert a Conditional at the right position after a pause/parallel statement.
//     * 
//     * @param statements The list of statements
//     * @param conditional The conditional which has to be added after a pause/parallel
//     * @param pos The position of the pause/parallel statement
//     * @param depth The depth of statement which caused the transformation 
//     */
//    def void insertConditional(EList<Statement> statements, Conditional conditional, int pos, int depth) {
//        // Look for already existing Conditionals after Pause.
//        // Check whether they have a higher priority than the transformed statement.
//        // Place the Conditional at the correct position.
//        // Because there is no 'break' in Xtend "i = statements.length" is used to end the for loop.
//        if (pos+1>=statements.length) {
//            statements.add(conditional)
//        }
//        else {
//            for (var i=1; pos+i<statements.length; i++) {
//                if (statements.get(pos+i) instanceof Conditional) {
//                    var ifTest2 = statements.get(pos+i) as Conditional
//                    if (!ifTest2.annotations.empty) {
//                        var deeper = false
//                        for (var j=0; j<ifTest2.annotations.length; j++) {
//                            var a = ifTest2.annotations.get(j)
//                            if (a.name.equals(generatedAnnotation)) {
//                                deeper = true
//                                var layer = (a as IntAnnotation).value
//                                if (depth<layer) {
//                                    deeper = false
//                                    j = ifTest2.annotations.length
//                                }
//                            }
//                            
//                        }
//                        if (!deeper) {
//                            statements.add(pos+i, conditional)
//                            i = statements.length
//                        }
//                    }
//                    else {
//                        statements.add(pos+i, conditional)
//                        i = statements.length
//                    }
//                }
//                else {
//                    statements.add(pos+i, conditional)
//                    i = statements.length
//                }
//                if (pos+i+1==statements.length) {
//                    statements.add(conditional)
//                }
//            }
//        }
//    }
//    
//    /**
//     * Insert a Conditional at the right position above a pause statement.
//     * 
//     * @param statements The list of statements
//     * @param conditional The conditional which has to be added above a pause
//     * @param pos The position of the pause statement
//     * @param depth The depth of statement which caused the pause transformation 
//     */
//    def void insertConditionalAbove(EList<Statement> statements, Conditional conditional, int pos, int depth) {
//        // Look for already existing Conditionals above Pause.
//        // Check whether they have a higher priority than the transformed statement.
//        // Place the Conditional at the correct position.
//        // Because there is no 'break' in Xtend "i = statements.length" is used to end the for loop.
//        if (pos == 0) {
//            statements.add(0, conditional)
//        }
//        else {
//            for (var i=1; pos-i>=0; i++) {
//                if (statements.get(pos-i) instanceof Conditional) {
//                    var conditional2 = statements.get(pos-i) as Conditional
//                    if (!conditional2.annotations.empty) {
//                        var deeper = false
//                        for (var j=0; j<conditional2.annotations.length; j++) {
//                            var a = conditional2.annotations.get(j)
//                            if (a.name.equals(generatedAnnotation)) {
//                                deeper = true
//                                var layer = (a as IntAnnotation).value
//                                if (layer<=depth) {
//                                    deeper = false
//                                    j = conditional2.annotations.length
//                                }
//                            }
//                            
//                        }
//                        if (!deeper) {
//                            statements.add(pos+1-i, conditional)
//                            i = statements.length
//                        }
//                    }
//                    else {
//                        statements.add(pos+1-i, conditional)
//                        i = statements.length
//                    }
//                }
//                else {
//                    statements.add(pos+1-i, conditional)
//                    i = statements.length
//                }
//                if (pos-i==0) {
//                    statements.add(0, conditional)
//                }
//            }
//        }
//    }

    /**
     * Insert a conditional above a statement.
     * 
     * @param statement The statement
     * @param conditional The conditional statement
     */
    def insertConditionalAbove(Statement statement, Conditional conditional) {
        val statements = statement.containingList
        val pos = statements.indexOf(statement)
        if (existsPauseScope(statement)) {
            (statements.get(pos-1) as ScopeStatement).statements.add(0, conditional)
        }
        else {
            statements.add(pos, createPauseScope(statement, conditional))
        }
    }
    
    /**
     * Create a scope statement, including a conditional and 
     * an annotations named 'conditionals_above',
     * and insert it above a given statement.
     * 
     * @param statement The statement
     * @param conditional The conditional statement
     */
    def ScopeStatement createPauseScope(Statement statement, Conditional conditional) {
        createScopeStatement => [
            it.annotations.add(createAnnotation(conditionals_above))
            it.statements.add(conditional)
        ]
    }
    
    /**
     * Check if a scope before a given statement exists and if so
     * if it has an annotation named 'conditionals_above'.
     * 
     * @param statement The statement
     */
    def existsPauseScope(Statement statement) {
        val pos = statement.containingList.indexOf(statement)
        if (pos > 0) {
            val scope = statement.containingList.get(pos-1)
            if (scope instanceof ScopeStatement) {
                for (a : scope.annotations) {
                    if (a.name.equals(conditionals_above)) return true
                }
            }
        }
        return false
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
            else if (parent instanceof Module) {
                // shouldn't be possible
                var module = parent as Module
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
        SCLFactory::eINSTANCE.createElseScope => [
            if (statements !== null) {
                it.statements.add(statements)
            }
        ]
    }
    
    /**
     * Create an ElseScope for a Conditional.
     * 
     * @param statement The statement which belongs in the ElseScope
     * @return An ElseScope with a statement
     */
    def createElseScope(Statement statement) {
        SCLFactory::eINSTANCE.createElseScope => [
            if (statement !== null) {
                it.statements.add(statement)
            }
        ]
    }
    
//    /**
//     * Copies the generated Annotations of the annotation list to a specific statement.
//     * 
//     * @param annotations The list of annotations
//     * @param statement The statement which will have a copy of the generated annotations.
//     */
//    def void copyAnnotations (EList<Annotation> annotations, Annotatable statement) {
//        for (a : annotations) {
//            if (isGenerated(a)) {
//                statement.annotations.add(EcoreUtil.copy(a))
//            }
//        }
//    }
//    
//    /**
//     * Returns the depth of the given statement, when it has one in its annotations.
//     * 
//     * @param statement The statement in question
//     * @return The depth of the given statement.
//     */
//    def int getDepth(Annotatable statement) {
//        for (Annotation a : statement.annotations) {
//            if (isGenerated(a)) {
//                return (a as IntAnnotation).value
//            }
//        }
//        return 0;
//    }
    
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
        else if (statement instanceof Present) {
            checkGotos((statement as Present).statements)
            (statement as Present).cases?.forEach[ c | checkGotos(c.statements)]
            checkGotos((statement as Present).elseStatements)
        }
        else if (statement instanceof IfTest) {
            checkGotos((statement as IfTest).statements)
            (statement as IfTest).elseif?.forEach [ elsif | checkGotos(elsif.statements)]
            checkGotos((statement as IfTest).elseStatements)
        }
        else if (statement instanceof EsterelParallel) {
            (statement as EsterelParallel).threads.forEach [ t |
                checkGotos(t.statements)
            ]
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
        else if (statement instanceof Parallel) {
            (statement as Parallel).threads.forEach [ t |
                checkGotos(t.statements)
            ]
        }
        else if (statement instanceof Run) {
            statement.module.module.statements.checkGotos
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
     * Transform all references to signals in the scope of the given EObject.
     * 
     * @param obj The object which contains references to signals
     * @param newSignals A map for all transformed signals and their new representative
     */
    def transformReferences(EObject obj, HashMap<Signal, NewSignals> newSignals) {
        
        val references = obj.eAllContents.filter(SignalReference).toList
        if (obj instanceof SignalReference) {
            references += obj
        }
        for (ref : references) {
            if (ref instanceof TickReference) {
                // TODO after run transformation: e.g. "module _2 [signal tick/A]" and an "emit A" in the submodule _2 
                // would later lead to an assignment "true = true || true"
                ref.replace(createTrue)
            }
            else if (ref.valuedObject instanceof Signal){
                val signal = ref.valuedObject as Signal
                // if the SignalReference references a transformed signal
                if (newSignals.containsKey(signal)) {
                    val parent = ref.eContainer
                    if ( (parent instanceof OperatorExpression) && 
                         ((parent as OperatorExpression).operator == OperatorType.VAL)
                    ) {
                        if (newSignals.get(signal).s_val === null) {
                            throw new UnsupportedOperationException("The '?' expression is not valid because of a missing 's_val' valued object for the following Signal! " + signal.name)
                        }
                        parent.replace(createValuedObjectReference(newSignals.get(signal).s_val))
                    }
                    else if (parent instanceof Assignment) {
                        if (parent.isCurAssignment) {
                            parent.annotations.clear
                            ref.replace(createValuedObjectReference(newSignals.get(signal).s_cur))
                            val localRefs = parent.expression.eAllContents.filter(SignalReference).toList
                            if (!localRefs.empty) {
                                for (localRef : localRefs) {
                                    if (localRef.valuedObject == signal) {
                                        localRef.replace(createValuedObjectReference(newSignals.get(signal).s_cur))
                                    }
                                }
                            }
                        }
                        else if (parent.isSetAssignment) {
                            parent.annotations.clear
                            ref.replace(createValuedObjectReference(newSignals.get(signal).s_set))
                        }
                        else if (parent.isValAssignment) {
                            parent.annotations.clear
                            ref.replace(createValuedObjectReference(newSignals.get(signal).s_val))
                        }
                        else {
                            ref.replace(createValuedObjectReference(newSignals.get(signal).s))
                        }
                    }
                    else {
                        ref.replace(createValuedObjectReference(newSignals.get(signal).s))
                    }
                }
            }
        }
    }
    
    /**
     * Returns 'true' if the assignment was created for the 's_cur' value of a signal 's'.
     * 
     * @param assignment The assignment in question
     * 
     */
    def isCurAssignment(Assignment assignment) {
        for (a : assignment.annotations) {
            if (a.name.equals(s_cur)) return true
        }
        return false
    }    
    
    /**
     * Returns 'true' if the assignment was created for the 's_val' value of a signal 's'.
     * 
     * @param assignment The assignment in question
     * 
     */
    def isValAssignment(Assignment assignment) {
        for (a : assignment.annotations) {
            if (a.name.equals(s_val)) return true
        }
        return false
    }
    
    /**
     * Returns 'true' if the assignment was created for the 's_set' value of a signal 's'.
     * 
     * @param assignment The assignment in question
     * 
     */
    def isSetAssignment(Assignment assignment) {
        for (a : assignment.annotations) {
            if (a.name.equals(s_set)) return true
        }
        return false
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
     * Removes the value test operator if the given operator expression is of type VAL
     * 
     * @param expr The operator expression in question 
     */
    def removeValueTestOperator(EObject expr) {
        if (expr instanceof OperatorExpression) {
            if (expr.operator == OperatorType.VAL) {
                expr.replace(expr.subExpressions.get(0))
            }
        }
    }
    
    /**
     * Creates a SCLProgam
     */
    def createSCLProg() {
        SCLFactory::eINSTANCE.createSCLProgram
    }
    
    /**
     * Creates a SCLProgam
     */
    def createSCLModule() {
        SCLFactory::eINSTANCE.createModule
    }
        
//    /**
//     * Renames an interface scope to the module name
//     * 
//     * @param scope The scope which should be renamed
//     * @param name The name of the module 
//     */
//    def renameIScope(ScopeStatement scope, String name) {
//        var list = newLinkedList
//        for (a : scope.annotations) {
//            if (a.name.equals(interfaceScope)) {
//                list.add(a)
//            }
//        }
//        list.forEach[a | scope.annotations.remove(a)]
//        scope.annotations.add( 
//            AnnotationsFactory::eINSTANCE.createAnnotation => [
//                it.name = name
//            ])
//    } 
    
    /**
     * Create new constant declaration with a TypeIdentifier and Constant
     * 
     * @param constant The constant
     * @param type The TypeIdentifier
     */
    def createConstantDecl(Constant constant, TypeIdentifier type) {
        EsterelFactory::eINSTANCE.createConstantDeclaration => [
            valuedObjects += constant
            constant.type = EcoreUtil.copy(type)
        ]
    }
    
    /**
     * Create new sensor declaration with a given sensor with type
     * 
     * @param swt The SensorWithTypeDefinition object
     */
    def createSensorDecl(Sensor swt) {
        EsterelFactory::eINSTANCE.createSensorDeclaration => [
            it.valuedObjects.add(swt)
        ]
    }
    
    /**
     * Checks if the given annotation is named "generatedModuleForRun"
     * 
     * @param annotation The annotation in question
     */
    def isGeneratedModuleAnnotation(Annotation annotation) {
        annotation.name.equals(generatedModule)
    } 
    
    /**
     * Check whether in an annotation list there is an annotation named "generatedModuleForRun".
     * 
     * @param annotations
     * @return Is there an annotation which is named "generatedModuleForRun"?
     */
    def isGeneratedModule(EList<Annotation> annotations) {
        var generated = false
        for (a : annotations) {
            generated = generated || a.name.equals(generatedModule) 
        }
        return generated
    }
    
    /**
     * Update the renamings of the run statement since a copy of the module was created
     * 
     * @run The run statement 
     */
    def transformRenamingsAfterModuleCopy(Run run) {
        // SIGNALS
        var signalList = new LinkedList<Signal>
        for (d : run.module.module.declarations.filter(SignalDeclaration)) {
            signalList.addAll(d.eAllContents.filter(Signal).toList)
        }
        
        // CONSTANTS
        var constantList = new LinkedList<Constant>
        for (d : run.module.module.declarations.filter(ConstantDeclaration)) {
            constantList.addAll(d.eAllContents.filter(Constant).toList)
        }
        // FUNCTIONS
        var functionList = new LinkedList<Function>
        for (d : run.module.module.declarations.filter(FunctionDeclaration)) {
            functionList.addAll(d.eAllContents.filter(Function).toList)
        }
        // PROCEDURE
        var procedureList = new LinkedList<Procedure>
        for (d : run.module.module.declarations.filter(ProcedureDeclaration)) {
            procedureList.addAll(d.eAllContents.filter(Procedure).toList)
        }
        // TYPES
        var typeList = new LinkedList<TypeDefinition>
        for (d : run.module.module.declarations.filter(TypeDeclaration)) {
            typeList.addAll(d.eAllContents.filter(TypeDefinition).toList)
        }
        // TASKS
        var taskList = new LinkedList<Task>
        for (d : run.module.module.declarations.filter(TaskDeclaration)) {
            taskList.addAll(d.eAllContents.filter(Task).toList)
        }
        // update references of the renamings
        if (run.renamings !== null && !run.renamings.empty) {
            for (oneTypeRenaming : run.renamings) {
                for (renaming : oneTypeRenaming.renamings) {
                    switch renaming {
                        SignalRenaming: {
                            for (var i=0; i<signalList.length; i++) {
                                var s = signalList.get(i)
                                if (s.name.equals(renaming.oldName.valuedObject.name)) {
                                    renaming.oldName = s.createSignalReference
                                    i = signalList.length
                                }
                            }
                        }
                        ConstantRenaming: {
                            for (var i=0; i<constantList.length; i++) {
                                var c = constantList.get(i)
                                if (c.name.equals(renaming.oldName.name)) {
                                    renaming.oldName = c
                                    i = constantList.length
                                }
                            }
                        }
                        FunctionRenaming: {
                            for (var i=0; i<functionList.length; i++) {
                                var f = functionList.get(i)
                                if (f.name.equals(renaming.oldName.name)) {
                                    renaming.oldName = f
                                    i = functionList.length
                                }
                            }
                        }
                        ProcedureRenaming: {
                            for (var i=0; i<procedureList.length; i++) {
                                var p = procedureList.get(i)
                                if (p.name.equals(renaming.oldName.name)) {
                                    renaming.oldName = p
                                    i = procedureList.length
                                }
                            }
                        }
                        TypeRenaming: {
                            for (var i=0; i<typeList.length; i++) {
                                var t = typeList.get(i)
                                if (t.name.equals(renaming.oldName.name)) {
                                    renaming.oldName = t
                                    i = typeList.length
                                }
                            }
                        }
                        TaskRenaming: {
                            for (var i=0; i<taskList.length; i++) {
                                var t = taskList.get(i)
                                if (t.name.equals(renaming.oldName.name)) {
                                    renaming.oldName = t
                                    i = taskList.length
                                }
                            }
                        }
                    }
                    
                }
            }
        }
    }
    
    /**
     * Creates a new TypeDecl with a given type
     * 
     * @param type The already existing type
     */
    def createTypeDecl(TypeDefinition type) {
        EsterelFactory::eINSTANCE.createTypeDeclaration => [
            it.valuedObjects += type
        ]
    }
    
    /**
     * Creates a new FunctionDecl with a given function
     * 
     * @param function The already existing function
     */
    def createFunctionDecl(Function function) {
        EsterelFactory::eINSTANCE.createFunctionDeclaration => [
            it.valuedObjects += function
        ]
    }
    
    /**
     * Change SignalReferenceExpr to ValuedObjectReference.
     * 
     * @param object The object containing an arbitrary number of SignalReferenceExpr
     */
    def changeSignalRefExprToVORef(EObject obj) {
        var references = obj.eAllContents.filter(SignalReference).toList
        for (ref : references) {
            // if "ref" is still a SignalReferenceExpr it must be transformed into a ValuedObjectReference
            if (ref.eContainer !== null && ref instanceof SignalReference && ref.valuedObject !== null) {
                ref.replace(createValuedObjectReference(ref.valuedObject))
            }
        }
    }
    
    /**
     * Create a SignalReference
     * 
     * @param signal the signal for the reference
     * @return a SignalReference
     */
    def createSignalReference(ValuedObject signal) {
        EsterelFactory::eINSTANCE.createSignalReference => [
            it.valuedObject = signal
        ]
    }
    
    /**
     * Create a TickReference
     * 
     * @param signal The tick signal
     */
    def createTickReference(Signal signal) {
        EsterelFactory::eINSTANCE.createTickReference => [
            it.valuedObject = signal
        ]
    }
 
}
