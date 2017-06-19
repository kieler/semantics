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
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
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
import java.util.LinkedList
import javax.xml.transform.TransformerException
import de.cau.cs.kieler.esterel.scest.transformations.SCEstTransformation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.EsterelThread
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * @author mrb
 *
 */



/**
 * Collection of methods and shortcuts to ease the Esterel to SCL transformation. Besides methds to
 * abbreviate the creation of SCL elements, a method to check whether an Esterel statement may not
 * terminate can be found here.
 * 
 * @author krat
 * @kieler.rating yellow 2015-03-14 review KI-63 by ssm, ima, cmot
 */
class SCEstExtension {

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension SCEstTransformation

    // Current labelSuffix ensures the creation of fresh labels, i.e. labels are numbered (l1, l2,...)
    var static labelSuffix = 0;
    
    var static constantSuffix = 0;
    
    var static variableSuffix = 0;
    
    var static flagSuffix = 0;

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
//    def getValuedObjectByName(String searchedName) {
//        val valuedObject = signalToVariableMap.findLast[key == searchedName]
//        if (valuedObject != null)
//            return valuedObject.value
//        val retExit = exitToLabelMap.filter[p1, p2| p1.name == searchedName].values.last
//        if (retExit != null)
//            return retExit.key
//        throw new TransformerException("getValuedObject: Signal not declared: " + searchedName)
//    }

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
//    def getValuedObjectReferenceByName(String searchedName) {
//        searchedName.getValuedObjectByName.createValuedObjectReference
//    }

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
        variableSuffix = 0;
    }
    
    /**
     * Returns an unused constant by appending the constantCount to "_l" and incrementing constantCount.
     * 
     * @return An unused constant
     */
    def createNewUniqueConstantName() {
        constantSuffix++

        "_c" + constantSuffix
    }

    /**
     * Returns a new variable, i.e., one with a name which is not already on the signalToVariableMap
     * 
     * @param name The desired name, "_" will be appended until it is unqiue
     * @return A new ValuedObject with an unused name
     */
//    def ValuedObject createNewUniqueVariable(String designatedName) {
//        val newUniqueVariable = createValuedObject(uniqueName(designatedName))
//        signalToVariableMap.add(name -> newUniqueVariable)
//        signalToVariableMap.add(newUniqueVariable.name -> newUniqueVariable)
//
//        newUniqueVariable
//    }
    
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
     * Returns an unused variable name. String: ( "_v" + counter )
     * @return Returns an unused variable name. String: ( "_v" + counter )
     */
    def createNewUniqueVariableName() {
        variableSuffix++
        "_v" + variableSuffix
    }
    
    /**
     * Returns an unused flag name. String: ( "_f" + counter )
     * @return Returns an unused flag name. String: ( "_f" + counter )
     */
    def createNewUniqueFlagName() {
        flagSuffix++
        "_f" + flagSuffix
    }

    /**
     * Returns a unused variable and adds it to given ScopeStatement
     * 
     * @param ScopeStatement The ScopeStatement to add it to
     * @param designatedName The desired name, "_" may be added to make it unique
     * @param designatedName The type of the variable
     * @return A new ValuedObject with an unused name
     */
//    def ValuedObject createFreshVar(ScopeStatement ScopeStatement, String designatedName, ValueType valueType) {
//        val newUniqueVariable = createValuedObject(uniqueName(designatedName))
//        ScopeStatement.declarations += createDeclaration => [
//            valuedObjects += newUniqueVariable
//            type = valueType
//        ]
//        signalToVariableMap.add(designatedName -> newUniqueVariable)
//        signalToVariableMap.add(newUniqueVariable.name -> newUniqueVariable)
//
//        newUniqueVariable
//    }

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
     * Takes a variable name and adds "_" until variable name is new
     * 
     * @param designatedName Desired variable name
     * @return  An unused variable name
     */
//    def String uniqueName(String designatedName) {
//
//        // The variable should not be on the current signalMap
//        if (signalToVariableMap.filter[ key == designatedName ].nullOrEmpty) {
//            return designatedName
//        } else {
//            return uniqueName(designatedName + "_")
//        }
//    }

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
        createAssignment(valuedObjectToIncrement,
            KExpressionsFactory::eINSTANCE.createOperatorExpression => [
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
                intSignalDecls.forEach [
                    signals.forEach [
                        if (it.name.endsWith("_val"))
                            throw new IllegalArgumentException("Variables should not have the suffix _val")
                    ]
                ]

                intSensorDecls.forEach [
                    sensors.forEach [
                        if (it.sensor.name.endsWith("_val"))
                            throw new IllegalArgumentException("Variables should not have the suffix _val")
                    ]
                ]
                intConstantDecls.forEach [
                    constants.forEach [
                        it.constants.forEach [
                            if (it.name.endsWith("_val"))
                                throw new IllegalArgumentException("Variables should not have the suffix _val")
                        ]
                    ]
                ]
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
//    def boolean alreadyDefined(String variableName) {
//        if ((!signalToVariableMap.filter[key == variableName].nullOrEmpty) || 
//            (!signalToValueMap.values.filter[name == variableName].nullOrEmpty))
//            return true
//        false
//    }

    /**
      * Removes possibly instantaneous reachable gotos. Used for the transformation of traps and
      * delayed weak abort to avoid unnecessary potentially instantaneous loops.
      * 
      * @param statementSequence The list of statements to process
      * @param label The label to remove all instantaneous gotos to
      * @param exitObject The ValuedObject triggering the trap
      * @return True if list has an instantaneous path
      */
    def boolean removeInstantaneousGotos(EList<Statement> statementSequence, String label, LinkedList<ValuedObject> exitObjects) {
        var index = 0
        var continue = true
        while (index < statementSequence.length && continue) {
            if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof Pause) {
                continue = false
            } else if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof Goto &&
                ((statementSequence.get(index) as Statement) as Goto).target == label) {
                statementSequence.remove(index)
            } else if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof Conditional) {
                val conditional = (statementSequence.get(index) as Statement) as Conditional
                continue = conditional.statements.removeInstantaneousGotos(label, exitObjects)
                continue = conditional.getElse().statements.removeInstantaneousGotos(label, exitObjects) && continue
                index++
            } else if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof ScopeStatement) {
                continue = ((statementSequence.get(index) as Statement) as ScopeStatement).statements.
                    removeInstantaneousGotos(label, exitObjects)
                index++
            } else if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                    for (thread : ((statementSequence.get(index) as Statement) as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                        for (exitObject : exitObjects) {
                            if (isAssignedInInitialTick(thread.statements, exitObject))
                                continue = false
                        }
                    }
                    if (continue) {
                        for (thread : ((statementSequence.get(index) as Statement) as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                            if (thread.statements.getSequenceEndLabel != null) {
                                continue = thread.statements.removeInstantaneousGotos(thread.statements.getSequenceEndLabel, exitObjects) && continue
                            }
                    }
                    }
                    index++
            } else if (statementSequence.get(index) instanceof Statement &&
                (statementSequence.get(index) as Statement) instanceof Assignment &&
                exitObjects.contains(((statementSequence.get(index) as Statement) as Assignment).valuedObject)) {
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
            if (statementList.get(index) instanceof Statement &&
                (statementList.get(index) as Statement) instanceof Assignment &&
                ((statementList.get(index) as Statement) as Assignment).valuedObject == valuedObject) {
                return true
            } else if (statementList.get(index) instanceof Statement &&
                (statementList.get(index) as Statement) instanceof Pause) {
                return false
            } else if (statementList.get(index) instanceof Statement &&
                (statementList.get(index) as Statement) instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                for (thread : ((statementList.get(index) as Statement) as de.cau.cs.kieler.scl.scl.Parallel).
                    threads)
                    wasAssigned = wasAssigned || thread.statements.isAssignedInInitialTick(valuedObject)
            } else if (statementList.get(index) instanceof Statement &&
                (statementList.get(index) as Statement) instanceof Conditional) {
                val cond = (statementList.get(index) as Statement) as Conditional
                wasAssigned = cond.getElse().statements.isAssignedInInitialTick(valuedObject) ||
                    cond.statements.isAssignedInInitialTick(valuedObject)
            } else if (statementList.get(index) instanceof Statement &&
                (statementList.get(index) as Statement) instanceof ScopeStatement) {
                val sScope = (statementList.get(index) as Statement) as ScopeStatement
                wasAssigned = sScope.statements.isAssignedInInitialTick(valuedObject)
            }
            index++

        }

        wasAssigned
    }
    
    /**
     * Returns the label at the end of a StatementSequence if there is one
     * 
     * @param thread The thread
     * @return       The label at the end of the given StatementSequence
     */
     def getSequenceEndLabel(EList<Statement> statements) {
         val endLabel = statements.findLast[ it instanceof Label ]
         if (endLabel != null)
            return (endLabel as Label).name
            
         null
     }
     
     /**
      * Counts the amount of statements in a given Esterel Program
      * 
      * @param esterelProgram The given Esterel program
      * @return Amount of stamtents
      */
      def countStatements(Program esterelProgram) {
          esterelProgram.eAllContents.toList.filter(de.cau.cs.kieler.scl.scl.Statement).length
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
    def dispatch boolean checkTerminate(Statement statement) {
        var terminates = true;
        if (statement instanceof Halt) {
            return false;
        } else if (statement instanceof Loop) {
            return false;
        } else if (statement instanceof Sustain) {
            return false;
        } else if (statement instanceof EsterelParallel) {
            val parallel = statement as EsterelParallel
            for (thread : parallel.threads) {
                terminates = terminates && thread.checkTerminate
            }
            return terminates
        } else if (statement instanceof Present) {
            val present = statement as Present
            if (present.cases == null) {
                if (present.thenStatements != null)
                    terminates = present.thenStatements.checkTerminate
                if (present.elseStatements != null)
                    terminates = terminates && present.elseStatements.checkTerminate

                return terminates
            } else {
                for (singleCase : present.cases) {
                    terminates = terminates && singleCase.statements.checkTerminate
                }
                if (present.elseStatements != null)
                    terminates = terminates && present.elseStatements.checkTerminate
                return terminates
            }
        } else if (statement instanceof EveryDo) {
            return false;
        } else if (statement instanceof LocalSignalDecl) {
            return (statement as LocalSignalDecl).statements.checkTerminate
        } else if (statement instanceof Await) {
            val await = statement as Await
            if (await.cases != null) {
                for (singleCase : await.cases) {
                    terminates = terminates && singleCase.statements.checkTerminate
                }
                return terminates
            }
            else {
                terminates = terminates && await.statements.checkTerminate
                return terminates
            }
        } else if (statement instanceof Run) {
            return (statement as Run).module.module.statements.checkTerminate
        } else if (statement instanceof LocalVariable) {
            return (statement as LocalVariable).statements.checkTerminate
        } else if (statement instanceof Suspend) {
            return (statement as Suspend).statements.checkTerminate
        } else if (statement instanceof Block) {
            return (statement as Block).statements.checkTerminate
        }
        return true;
    }

    def dispatch boolean checkTerminate(Program esterelProgram) {
        var terminates = true;
        for (th : esterelProgram.modules.head.statements) {
            terminates = terminates && th.checkTerminate
        }
        return terminates
    }

    def dispatch boolean checkTerminate(EList<de.cau.cs.kieler.scl.scl.Statement> statements) {
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
        SclFactory::eINSTANCE.createConditional => [
            expression = EcoreUtil.copy(condition)
            if (isImmediate) {
                statements.addAll(SclFactory::eINSTANCE.createPause)
//                statements.addAll(createPause.statements)
            }
            statements.add(
                    SclFactory::eINSTANCE.createGoto => [
                        it.target = targetLabel
                    ])
        ]
    }
    
    def Conditional newIfStatement(Expression expr) {
        SclFactory::eINSTANCE.createConditional => [
            expression = EcoreUtil.copy(expr)
        ]
    }

    /**
     * Adds a new empty statement to a StatementSequence
     * 
     * @param statementSequence The StatementSequence to add the empty statement
     * @param label The label
     */
    def addLabel(EList<Statement> statementSequence, String label) {
        statementSequence.add(
            SclFactory::eINSTANCE.createLabel => [
                it.name = label
            ])
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
     * Returns a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * 
     * @param label The target label
     * @param currentThreadEndLabel Label at the end of the currently transformed thread
     * @param labelToThreadMap Map of which label is in which thread
         */
    def createGotoj(Label label, Label currentThreadEndLabel, Multimap<String, String> labelToThreadMap) {
        if (labelToThreadMap.get(currentThreadEndLabel.name).contains(label)) {
            return createGotoStatement(label)
        } else {
            return createGotoStatement(currentThreadEndLabel)
        }
    }

    /**
     * Adds a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * 
     * @param statementSeqeuence The StatementSequence to add the gotoj
     * @paramt targetLabel The target label
     * @param currentThreadEndLabel Label at the end of the current thread
     * @param labelToThreadMap Map of which label is in which thread
     */
    def addGotoj(EList<Statement> statementSeqeuence, Label targetLabel, Label currentThreadEndLabel, 
        Multimap<String, String> labelToThreadMap
    ) {
        if (labelToThreadMap.get(currentThreadEndLabel.name).contains(targetLabel)) {
            statementSeqeuence.addGoto(targetLabel)
        } else {
            statementSeqeuence.addGoto(currentThreadEndLabel)
        }

        statementSeqeuence
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
            it.expression = expr
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
     * @param value The wanted value for BoolValue.
     * @return A KExpression Bool Value
     */
    def createBoolValue(boolean value) {
        KExpressionsFactory::eINSTANCE.createBoolValue => [
            it.value = value
        ]
    }
    
    /**
     * Creates an Esterel Constant
     * 
     * @param name The name of the Constant
     * @param value The Value of the Constant
     * @return A KExpression ValuedObject
     */
    def createConstant(String name, String value) {
        EsterelFactory::eINSTANCE.createConstant => [
            it.name = name
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
     * Adds all statements of a StatementSequence to another StatementSequence
     * 
     * @param statementSequence The StatementSequence to add the other to
     * @param statementSequenceToAdd The StatementSequence which should be added to the other one
     * @return The StatementSequence with the statements of the other one added
     */
    def dispatch add(EList<Statement> statementSequence, int pos, EList<Statement> statementSequenceToAdd) {
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
     * Creates an assignment
     * 
     * @param objectToAssign The ValuedObject to be assigned with something
     * @param expression The expression that should be assigned
     * @return An assignment instruction
     */
    def createAssignment(ValuedObject objectToAssign, Expression expression) {
        SclFactory::eINSTANCE.createAssignment => [
            valuedObject = objectToAssign
            it.expression = expression
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
            subExpressions.add(expr1)
            subExpressions.add(expr2)
        ]
    }

    /**
     * Creates a new SCL ScopeStatement
     * 
     * @param decls Already existing declarations for the Scope statement.
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
     * Creates a new SCL Thread
     * 
     * @return The newly created SCL Thread
     */
    def createThread() {
        SclFactory::eINSTANCE.createThread
    }

    /**
     * Creates a new SCL Instruction
     * 
     * @return The newly created SCL Instruction
     */
    def createThread(Statement statement) {
        SclFactory::eINSTANCE.createThread => [
            statements += statement
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
      * Creates "if c then pause; goto l"
      * 
      * @param condition The condition
      * @param targetLabel The targetlabel
      * @param pause With or without a Pause Statement
      * @return The created IfTest
      */
    def IfTest newIfThenPauseGoto(de.cau.cs.kieler.esterel.esterel.DelayExpr condition, Label targetLabel, boolean pause) {
        EsterelFactory::eINSTANCE.createIfTest => [
            // TODO delayExpr also includes a counter expression: Signal A: ( suspend 3 A ...) or (suspend 3*X A)
            // TODO delayExpr also includes a "Tick" delayExpr.tick
            expr = (condition.signalExpr as Expression)
            if (pause) {
                thenStatements.addAll(SclFactory::eINSTANCE.createPause)                
            }
            thenStatements.add(
                    SclFactory::eINSTANCE.createGoto => [
                        it.target = targetLabel
                    ])
        ]
    }
    
    /**
     * Creates a new Annotation
     * 
     * @param layer The name of the Annotation
     * @return The newly created Annotation
     */
    def createAnnotation(int layer) {
        AnnotationsFactory::eINSTANCE.createIntAnnotation => [
            name = "generated_ifTest"
            value = layer
        ]
    }
    
    /**
     * Check whether in an annotation list there is an annotation named "generated_ifTest".
     * 
     * @param annotations
     * @return Is there an annotation which is named "generated_ifTest"?
     */
    def isGenerated(EList<Annotation> annotations) {
        var generated = false
        for (a : annotations) {
            generated = generated || a.name.equals("generated_ifTest") 
        }
        return generated
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
            it.expr = sustain.expression
        ]
    }
    
    /**
     * Insert a Conditional at the right position after a pause statement.
     * 
     * @param statements
     * @param conditional
     * @param pos
     * @param counter
     */
    def insertConditional(EList<Statement> statements, Conditional conditional, int pos, int counter) {
        for (var i=1; pos+i<statements.length; i++) {
            if (statements.get(pos+i) instanceof Conditional) {
                var ifTest2 = statements.get(pos+i) as Conditional
                if (!ifTest2.annotations.empty) {
                    var isGenerated = false
                    for (var j=0; j<ifTest2.annotations.length; j++) {
                        var a = ifTest2.annotations.get(j)
                        if (a.name.equals("generated_ifTest")) {
                            isGenerated = true
                            var layer = (a as IntAnnotation).value
                            if (counter<layer) {
                                statements.add(pos+i, conditional)
                                i = statements.length
                                j = ifTest2.annotations.length
                            }
                        }
                        
                    }
                    if (!isGenerated) {
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
        }
    }
    
    /**
     * Returns the given label or the thread end label. Depends on which comes first.
     * 
     * @param label
     * @param statement
     * @return Returns the given label or the thread end label. Depends on which comes first.
     */
    def Label findClosestLabel(Label label, Statement statement) {
        var parent = statement.eContainer
        var labelParent = label.eContainer
        while (true) {
            if (parent == labelParent) {
                return label
            }
            else if (parent instanceof Thread ||  parent instanceof EsterelThread) {
                if ((parent as StatementContainer).statements.last instanceof Label) {
                    return (parent as StatementContainer).statements.last as Label
                }
                else { 
                    return null
                }
            }
            else if (parent instanceof SCEstModule) {
                return null // shouldn't be possible
            }
        }
    }
    
    def scopeWithDecl(EList<Statement> statements, int pos, Expression expr, Expression signalExpr, Label label, int counter) {
        var variable = createNewUniqueVariable(createIntValue(0))
        var decl = createDeclaration(ValueType.INT, variable)
        var scope = createScopeStatement(decl)
        var conditional = newIfStatement(signalExpr)
        conditional.statements.add(incrementInt(variable))
        conditional.annotations.add(createAnnotation(-1))
        statements.add(pos+1, conditional)
        var conditional2 = newIfThenGoto(createLT(createValuedObjectReference(variable), expr), label, false)
        insertConditional(statements, conditional2, pos, counter)
        scope.statements.add(statements)
        statements.add(scope)
        return scope
    }
 
 
 
}
