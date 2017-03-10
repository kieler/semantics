/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Scope
import de.cau.cs.kieler.scl.scl.Statement
import java.util.LinkedList
import javax.xml.transform.TransformerException
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.ScopeStatement
import de.cau.cs.kieler.scl.scl.Label

/**
 * Collection of methods and shortcuts to ease the Esterel to SCL transformation. Besides methds to
 * abbreviate the creation of SCL elements, a method to check whether an Esterel statement may not
 * terminate can be found here.
 * 
 * @author krat
 * @kieler.rating yellow 2015-03-14 review KI-63 by ssm, ima, cmot
 */
class EsterelToSclExtensions {

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension EsterelToSclTransformation
    
    extension SclFactory = SclFactory.eINSTANCE

    // Current labelSuffix ensures the creation of fresh labels, i.e. labels are numbered (l1, l2,...)
    var static labelSuffix = 0;

    /**
     * Searches a valuedObject in a declarations list by its name
     * 
     * @param sclDeclarationList List of declarations
     * @param searchedName The string to search for
     * @return The ValuedObject with name n
     */
    def getValuedObjectByName(EList<Declaration> sclDeclarationList, String searchedName) {
        for (sclDeclaration : sclDeclarationList) {
            val valuedObject = sclDeclaration.valuedObjects.findFirst[name == searchedName]
            if (valuedObject != null)
                return valuedObject
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + searchedName)
    }

    /**
     * Searches a valuedObject by name in the signalToVariableMap of the EsterelToSclTransformation class
     * 
     * @param searchedName The ValuedObject name to search for
     */
    def getValuedObjectByName(String searchedName) {
        val valuedObject = signalToVariableMap.findLast[key == searchedName]
        if (valuedObject != null)
            return valuedObject.value
        val retExit = exitToLabelMap.filter[p1, p2| p1.name == searchedName].values.last
        if (retExit != null)
            return retExit.key
        throw new TransformerException("getValuedObject: Signal not declared: " + searchedName)
    }

    /**
     * Returns a reference to a valued objects name
     * 
     * @param sclDeclarationList List of declarations
     * @param searchedName The name of the searched ValuedObject
     * @return ValuedObjectReference to given name
     */
    def getValuedObjectReferenceByName(EList<Declaration> sclDeclarationList, String searchedName) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObjectByName(sclDeclarationList, searchedName)
        ]
    }

    /**
     * Returns a reference to a valued objects name
     * 
     * @param searchedName The valued objects name
     * @return ValuedObjectReference to given name
     */
    def getValuedObjectReferenceByName(String searchedName) {
        searchedName.getValuedObjectByName.createValuedObjectReference
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
     * Returns an unused label by appending the labelCount to "l" and incrementing label count. As all labels
     * used for the transformation are generated by this model, no label is used multiple times.
     * 
     * @return An unused label
     */
    def createNewUniqueLabel() {
        EsterelToSclExtensions.labelSuffix = EsterelToSclExtensions.labelSuffix + 1

        "l" + EsterelToSclExtensions.labelSuffix
    }

    /**
     * Resets the label count, should be called when the transformation is finished
     */
    def resetLabelSuffix() {
        labelSuffix = 0;
    }

    /**
     * Returns a new variable, i.e., one with a name which is not already on the signalToVariableMap
     * 
     * @param name The desired name, "_" will be appended until it is unqiue
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createNewUniqueVariable(String designatedName, ValueType valueType) {
        val newUniqueVariable = createValuedObject(uniqueName(designatedName))
        signalToVariableMap.add(name -> newUniqueVariable)
        signalToVariableMap.add(newUniqueVariable.name -> newUniqueVariable)

        newUniqueVariable
    }

    /**
     * Returns a unused variable and adds it to given StatementScope
     * 
     * @param statementScope The StatementScope to add it to
     * @param designatedName The desired name, "_" may be added to make it unique
     * @param designatedName The type of the variable
     * @return A new ValuedObject with an unused name
     */
    def ValuedObject createFreshVar(Scope scope, String designatedName, ValueType valueType) {
        val newUniqueVariable = createValuedObject(uniqueName(designatedName))
        scope.declarations += createDeclaration => [
            valuedObjects += newUniqueVariable
            type = valueType
        ]
        signalToVariableMap.add(designatedName -> newUniqueVariable)
        signalToVariableMap.add(newUniqueVariable.name -> newUniqueVariable)

        newUniqueVariable
    }

    /**
     * Takes a variable name and adds "_" until variable name is new
     * 
     * @param designatedName Desired variable name
     * @return  An unused variable name
     */
    def String uniqueName(String designatedName) {

        // The variable should not be on the current signalMap
        if (signalToVariableMap.filter[ key == designatedName ].nullOrEmpty) {
            return designatedName
        } else {
            return uniqueName(designatedName + "_")
        }
    }

    /**
     * Creates name that is not on the given list
     * 
     * @param definedVariables List of variable names
     * @param designatedName The desired String, "_" are added until unique
     * @return Name that is not already in the list
     */
    def String uniqueNameByList(LinkedList<String> definedVariables, String designatedName) {
        if (!definedVariables.contains(designatedName)) {
            return designatedName;
        } else {
            return uniqueNameByList(definedVariables, designatedName + "_")
        }
    }

    /**
     * Creates a statement which increments a valued object by 1
     * 
     * @param valuedObject The valued object to increment
     * @return A statement which increments valObj
     */
    def Statement incrementInt(ValuedObject valuedObjectToIncrement) {
       return createAssignment(valuedObjectToIncrement, KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::ADD
            subExpressions += createValuedObjectReference(valuedObjectToIncrement)
            subExpressions += createIntValue(1)
        ])
    }

    /**
     * Checks for valid names. The suffix "_val" is reserved for valued signals. Exception is thrown
     * if the suffix is used.
     * 
     * @param esterelProgram The Esterel Program to validate
     * @return True if no invalid names
     * @throws IllegalArgumentException if variable ending with "_val" exists
     */
    def boolean validateNames(Program esterelProgram) {
        esterelProgram.modules.forEach [
            if (interface != null) {
                interface.intSignalDecls.forEach [
                    signals.forEach [
                        if (it.name.endsWith("_val"))
                            throw new IllegalArgumentException("Variables should not have the suffix _val")
                    ]
                ]

                interface.intSensorDecls.forEach [
                    sensors.forEach [
                        if (it.sensor.name.endsWith("_val"))
                            throw new IllegalArgumentException("Variables should not have the suffix _val")
                    ]
                ]
                interface.intConstantDecls.forEach [
                    constants.forEach [
                        it.constants.forEach [
                            if (it.constant.name.endsWith("_val"))
                                throw new IllegalArgumentException("Variables should not have the suffix _val")
                        ]
                    ]
                ]
            }
        ]

        return true;
    }

    /**
     * Checks, whether a variable is already declared either in the signalToVariableMap or in the
     * signalToValueMap.
     * 
     * @param  variableName The to-be-checked variable name
     * @return Whether the name is already declared
     */
    def boolean alreadyDefined(String variableName) {
        if ((!signalToVariableMap.filter[key == variableName].nullOrEmpty) || 
            (!signalToValueMap.values.filter[name == variableName].nullOrEmpty))
            return true
        false
    }

    /**
      * Removes possibly instantaneous reachable gotos. Used for the transformation of traps and
      * delayed weak abort to avoid unnecessary potentially instantaneous loops.
      * 
      * @param scope The list of statements to process
      * @param label The label to remove all instantaneous gotos to
      * @param exitObject The ValuedObject triggering the trap
      * @return True if list has an instantaneous path
      */
    def boolean removeInstantaneousGotos(EList<Statement> scope, Label label, LinkedList<ValuedObject> exitObjects) {
        if (scope == null)
            return true
        var index = 0
        var continue = true
        while (index < scope.length && continue) {
            if (scope.get(index) instanceof Pause) {
                continue = false
            } else if (scope.get(index) instanceof Goto &&
                (scope.get(index) as Goto).target == label) {
                scope.remove(index)
            } else if (scope.get(index) instanceof Conditional) {
                val conditional = scope.get(index) as Conditional
                continue = conditional.statements.removeInstantaneousGotos(label, exitObjects)
                continue = conditional.^else?.statements.removeInstantaneousGotos(label, exitObjects) && continue
                index++
            } else if (scope.get(index) instanceof ScopeStatement) {
                continue = (scope.get(index) as ScopeStatement).statements.
                    removeInstantaneousGotos(label, exitObjects)
                index++
            } else if (scope.get(index) instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                    for (thread : (scope.get(index) as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                        for (exitObject : exitObjects) {
                            if (isAssignedInInitialTick(thread.statements, exitObject))
                                continue = false
                        }
                    }
                    if (continue) {
                        for (thread : (scope.get(index) as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                            if (thread.getSequenceEndLabel != null) {
                                continue = thread.statements.removeInstantaneousGotos(thread.getSequenceEndLabel, exitObjects) && continue
                            }
                    }
                    }
                    index++
            } else if (scope.get(index) instanceof Assignment &&
                exitObjects.contains((scope.get(index) as Assignment).valuedObject)) {
                continue = false
            } 
            else {         
                   index++
            }
        }

        return continue
    }

    /**
       * Checks whether an ValuedObject is assigned in the initial tick
       * 
       * @param statementList The list of statements
       * @param valObj        The ValuedObject
       * @return              True if the ValuedObject is assigned in the initial tick
       */
    def boolean isAssignedInInitialTick(EList<Statement> statementList, ValuedObject valuedObject) {
        var index = 0
        var boolean wasAssigned = false
        while (index < statementList.length && !wasAssigned) {
            if (statementList.get(index) instanceof Assignment &&
                (statementList.get(index) as Assignment).valuedObject == valuedObject) {
                return true
            } else if (statementList.get(index) instanceof Pause) {
                return false
            } else if (statementList.get(index) instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                for (thread : (statementList.get(index) as de.cau.cs.kieler.scl.scl.Parallel).
                    threads)
                    wasAssigned = wasAssigned || thread.statements.isAssignedInInitialTick(valuedObject)
            } else if (statementList.get(index) instanceof Conditional) {
                val cond = statementList.get(index) as Conditional
                wasAssigned = cond.^else?.statements.isAssignedInInitialTick(valuedObject) ||
                    cond.statements.isAssignedInInitialTick(valuedObject)
            } else if (statementList.get(index) instanceof ScopeStatement) {
                val sScope = statementList.get(index) as ScopeStatement
                wasAssigned = sScope.statements.isAssignedInInitialTick(valuedObject)
            }
            index++

        }

        wasAssigned
    }
    
    /**
     * Returns the label at the end of a Scope if there is one
     * 
     * @param thread The thread
     * @return       The label at the end of the given Scope
     */
     def getSequenceEndLabel(Scope sSeq) {
         val endLabel = sSeq.statements.findLast[ it instanceof Label ]
         if (endLabel != null)
            return (endLabel as Label)
            
         null
     }
     
     /**
      * Counts the amount of statements in a given Esterel Program
      * 
      * @param esterelProgram The given Esterel program
      * @return Amount of stamtents
      */
      def countStatements(Program esterelProgram) {
          esterelProgram.eAllContents.toList.filter(de.cau.cs.kieler.esterel.esterel.Statement).length
      }
      
      /**
      * Counts the amount of statements in a given SCL Program
      * 
      * @param esterelProgram The given SCL program
      * @return Amount of stamtents
      */
      def countStatements(SCLProgram sclProgram) {
          sclProgram.eAllContents.toList.filter(Statement).length
      }

    // -------------------------------------------------------------------------
    // -- Esterel Termination Check
    // -------------------------------------------------------------------------
    /**
    * Checks whether an Esterel statement terminates. The check works inductively: E.g. a halt or a loop
    * statement does not terminate, whilst an abort or pause statement does. A conditional does not
    * terminate if none of its branches do so. The analysis is not complete: E.g. if a branch of a
    * conditional is never executed as the condition alway evaluates the same, it is considered for the
    * termination check nontheless. A full analysis would be way too expensive.
    * 
    * @param stm The statement to check
    * @return True if program terminates, else false
    */
    def dispatch boolean checkTerminate(de.cau.cs.kieler.esterel.esterel.Statement statement) {
        var terminates = true;
        if (statement instanceof Halt) {
            return false;
        } else if (statement instanceof Loop) {
            return false;
        } else if (statement instanceof Sustain) {
            return false;
        } else if (statement instanceof Parallel) {
            val parallel = statement as Parallel
            for (thread : parallel.list) {
                terminates = terminates && thread.checkTerminate
            }
            return terminates
        } else if (statement instanceof Sequence) {
            val sequence = statement as Sequence
            for (singleStatement : sequence.list) {
                terminates = terminates && singleStatement.checkTerminate
            }
            return terminates
        } else if (statement instanceof Present) {
            val present = statement as Present
            if (present.body instanceof PresentEventBody) {
                val presentBody = present.body as PresentEventBody
                if (presentBody.thenPart != null)
                    terminates = presentBody.thenPart.statement.checkTerminate
                if (present.elsePart != null)
                    terminates = terminates && present.elsePart.statement.checkTerminate

                return terminates
            } else if (present.body instanceof PresentCaseList) {
                val presentBody = present.body as PresentCaseList
                for (singleCase : presentBody.cases) {
                    terminates = terminates && singleCase.statement.checkTerminate
                }
                terminates = terminates && present.elsePart.checkTerminate
                return terminates
            }
        } else if (statement instanceof EveryDo) {
            return false;
        } else if (statement instanceof LocalSignalDecl) {
            return (statement as LocalSignalDecl).statement.checkTerminate
        } else if (statement instanceof Await) {
            val await = statement as Await
            if (await.body instanceof AwaitCase) {
                val awaitCase = await.body as AwaitCase
                for (singleCase : awaitCase.cases) {
                    terminates = terminates && singleCase.statement.checkTerminate
                }
                return terminates
            }
        } else if (statement instanceof Run) {
            return (statement as Run).module.module.body.statements.checkTerminate
        } else if (statement instanceof LocalVariable) {
            return (statement as LocalVariable).statement.checkTerminate
        } else if (statement instanceof Suspend) {
            return (statement as Suspend).statement.checkTerminate
        } else if (statement instanceof Block) {
            return (statement as Block).statement.checkTerminate
        }
        return true;
    }

    def dispatch boolean checkTerminate(Program esterelProgram) {
        var terminates = true;
        for (th : esterelProgram.modules.head.body.statements) {
            terminates = terminates && th.checkTerminate
        }
        return terminates
    }

    def dispatch boolean checkTerminate(EList<de.cau.cs.kieler.esterel.esterel.Statement> statements) {
        var terminates = true;
        for (statement : statements) {
            terminates = terminates && statement.checkTerminate
        }

        terminates
    }

    def dispatch boolean checkTerminate(Void x) {
        return true;
    }

    // -------------------------------------------------------------------------
    // -- SCL Shortcuts
    // -------------------------------------------------------------------------

    /**
      * Creates "if c then (pause;) goto l"
      * 
      * @param condition The condition
      * @param targetLabel The targetlabel
      * @param isImmediate When false a pause statement is added prior to the jump
      */
    def Conditional newIfThenGoto(Expression condition, Label targetLabel, boolean isImmediate) {
        createConditional => [
            expression = condition
            if (!isImmediate) {
                statements.addAll(createSclPause.statements)
            }
            statements.add(
                createGoto => [
                    it.target = targetLabel
                ])
        ]
    }

    /**
     * Adds a new goto instruction to a Scope
     * 
     * @param scope The Scope to add the empty statement
     * @param label The target label 
     */
    def addGoto(Scope scope, Label label) {
        scope.add(createGotoStatement(label))
    }

    /**
     * Adds a new goto instruction to a Scope
     * 
     * @param statementList The Statement EList to add the empty statement
     * @param label The target label 
     */
    def addGoto(EList<Statement> statementList, Label label) {
        statementList.add(createGotoStatement(label))
    }

    /**
     * Returns a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * 
     * @param label The target label
     * @param currentThreadEndLabel Label at the end of the currently transformed thread
     * @param labelToThreadMap Map of which label is in which thread
         */
    def createGotoj(Label label, Label currentThreadEndLabel, Multimap<Label, Label> labelToThreadMap) {
        if (labelToThreadMap.get(currentThreadEndLabel).contains(label)) {
            return createGotoStatement(label)
        } else {
            return createGotoStatement(currentThreadEndLabel)
        }
    }

    /**
     * Adds a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * 
     * @param statementSeqeuence The Scope to add the gotoj
     * @paramt targetLabel The target label
     * @param currentThreadEndLabel Label at the end of the current thread
     * @param labelToThreadMap Map of which label is in which thread
     */
    def addGotoj(Scope statementSeqeuence, Label targetLabel, Label currentThreadEndLabel, 
        Multimap<Label, Label> labelToThreadMap
    ) {
        if (labelToThreadMap.get(currentThreadEndLabel).contains(targetLabel)) {
            statementSeqeuence.addGoto(targetLabel)
        } else {
            statementSeqeuence.addGoto(currentThreadEndLabel)
        }

        statementSeqeuence
    }

    /**
    * Creates an InstructionStatement containing a goto
    * 
    * @param targetLabel The target label 
    */
    def createGotoStatement(Label targetLabel) {
        return createGoto => [
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
     * Adds a Statement to a Scope
     * 
     * @param scope The Scope to add the statement to
     * @param statement The statement to add
     * @return The Scope with added statement
     */
    def dispatch add(Scope scope, Statement statement) {
        scope.statements.add(statement)

        scope
    }

    /**
     * Adds all statements of a Scope to another Scope
     * 
     * @param scope The Scope to add the other to
     * @param scopeToAdd The Scope which should be added to the other one
     * @return The Scope with the statements of the other one added
     */
    def dispatch add(Scope scope, Scope scopeToAdd) {
        scope.statements.addAll(scopeToAdd.statements)

        scope
    }

    /**
     * Creates an assignment
     * 
     * @param objectToAssign The ValuedObject to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createAssignment(ValuedObject objectToAssign, Expression expression) {
        createAssignment => [
            valuedObject = objectToAssign
            it.expression = expression
        ]
    }

    /**
     * Creates a new SCL Instruction
     * 
     * @return The newly created SCL Instruction
     */
    def createThread(Statement statement) {
        createThread => [
            statements += statement
        ]
    }
}
