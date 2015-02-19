/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitCase
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
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementScope
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import java.util.LinkedList
import javax.xml.transform.TransformerException
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.EmptyStatement

/**
 * @author krat
 * 
 * Collection of methods and shortcuts to ease the Esterel to SCL transformation
 *
 */
class EsterelToSclExtensions {

    @Inject
    extension KExpressionsExtension

    @Inject
    extension EsterelToSclTransformation

    // Current lablecount ensures the creation of fresh labels, i.e. labels are numbered (l1, l2,...)
    var static labelCount = 0;

    /**
     * Searches a valuedObject in a declarations list by its name
     * 
     * @param getValuedObject List of declarations
     * @param searchedName    The string to search for
     * @return                The ValuedObject with name n
     */
    def getValuedObjectByName(EList<Declaration> sclDeclarationList, String searchedName) {
        for (sclDeclaration : sclDeclarationList) {
            val ret = sclDeclaration.valuedObjects.findFirst[name == searchedName]
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + searchedName)
    }

    /**
     * Searches a valuedObject by name in the signalMap of EsterelToSclTransformation class
     * 
     * @param searchedName The ValuedObject name to search for
     */
    def getValuedObjectByName(String searchedName) {
        for (variable : signalToVariableMap) {
            val ret = signalToVariableMap.findLast[key == searchedName]
            if (ret != null)
                return ret.value
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + searchedName)
    }

    /**
     * Returns a reference to a valued objects name
     * 
     * @param  decls List of declarations
     * @param  valObj 
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
     * @param  searchedName The valued objects name
     * @return ValuedObjectReference to given name
     */
    def getValuedObjectReferenceByName(String searchedName) {
        searchedName.getValuedObjectByName.createValObjRef
    }

    /**
     * Creates a reference to a ValuedObject
     * 
     * @param  valObj The ValuedObject
     * @reutrn ValuedObjectReference to given ValuedObject
     */
    def createValObjRef(ValuedObject valObj) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = valObj
        ]
    }

    /**
     * Returns a fresh label by appending the labelCount to "l" and incrementing label count
     * 
     * @return A fresh label
     */
    def createFreshLabel() {
        labelCount = labelCount + 1

        "l" + labelCount
    }

    /**
     * Resets the label count, should be called when the transformation is finished
     */
    def resetLabelCount() {
        labelCount = 0;
    }

    /**
     * Returns a fresh variable, i.e. one with a name which is not already on the signalMap
     * 
     * @param name The desired name, "_" will be appended until it is unqiue
     * @return     A new ValuedObject with an unused name
     */
    def createFreshVar(String name, ValueType t) {
        val ret = createValuedObject(uniqueName(name))
        signalToVariableMap.add(name -> ret)
        signalToVariableMap.add(ret.name -> ret)

        ret
    }

    /**
     * Returns a fresh variable and adds it to give sScope
     * 
     * @param sScope The StatementScope to add it to
     * @param name   The desired name
     * @param t      The type of the variable
     * @return       A new ValuedObject with an unused name
     */
    def createFreshVar(StatementScope sScope, String name, ValueType t) {
        val ret = createValuedObject(uniqueName(name))
        sScope.declarations += createDeclaration => [
            valuedObjects += ret
            type = t
        ]
        signalToVariableMap.add(name -> ret)
        signalToVariableMap.add(ret.name -> ret)

        ret
    }

    /**
     * Creates an EmptyStatement
     * 
     * @param l The label of the EmptyStatement
     */
    def createEmptyStm(String l) {
        SclFactory::eINSTANCE.createEmptyStatement => [
            label = l
        ]
    }

    /**
     * Takes a variable name and adds "_" until variable name is new
     * 
     * @param s Desired variable name
     * @return  An unused variable name
     */
    def String uniqueName(String s) {

        // The variable should not be on the current signalMap
        if (signalToVariableMap.filter[key == s].nullOrEmpty) {
            return s
        } else {
            return uniqueName(s + "_")
        }
    }

    /**
     * Creates name that is not on the given list
     * 
     * @param variables List of variable names
     * @param s         The desired String, "_" are added until unique
     * @return          Name that is not already in the list
     */
    def String uniqueNameByList(LinkedList<String> variables, String s) {
        if (!variables.contains(s)) {
            return s;
        } else {
            return uniqueNameByList(variables, s + "_")
        }
    }

    /**
     * Creates a statement which increments a valued object by 1
     * 
     * @param valObj The valued object to increment
     * @return       A statement which increments valObj
     */
    def Statement incrementInt(ValuedObject valObj) {
        createStmFromInstr(
            createAssignment(valObj,
                KExpressionsFactory::eINSTANCE.createOperatorExpression => [
                    operator = OperatorType::ADD
                    subExpressions += createValObjRef(valObj)
                    subExpressions += createIntValue(1)
                ]))
    }

    /**
     * Checks for valid names. The suffix "_val" is reserved for valued signals.
     * 
     * @param esterelProgram The Esterel Program to validate
     * @return               True if no invalid names
     * @throws               IllegalArgumentException if variable ending with "_val" exists
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
     * Checks, whether a variable is already declared even in the signalMap or as a value
     * 
     * @param  n The to-be-checked variable name
     * @return Whether the name is already declared
     */
    def boolean alreadyDefined(String n) {
        if ((!signalToVariableMap.filter[key == n].nullOrEmpty) || (!signalToValueMap.values.filter[name == n].nullOrEmpty))
            return true
        false
    }

    /**
      * Removes possible instantaneous reachable gotos.
      * 
      * @param sSeq       The list of statements to process
      * @param label      The label to remove all instantaneous gotos to
      * @param exitObject The ValuedObject triggering the trap
      * @return           True if list has an instantaneous path
      */
    def boolean removeInstantaneousGotos(EList<Statement> sSeq, String label, ValuedObject exitObject) {
        var index = 0
        var continue = true
        while (index < sSeq.length && continue) {
            println("is " + sSeq.get(index))
            if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof Pause) {
                continue = false
            } else if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof Goto &&
                ((sSeq.get(index) as InstructionStatement).instruction as Goto).targetLabel == label) {
                sSeq.remove(index)
            } else if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof Conditional) {
                val conditional = (sSeq.get(index) as InstructionStatement).instruction as Conditional
                continue = conditional.statements.removeInstantaneousGotos(label, exitObject)
                continue = conditional.elseStatements.removeInstantaneousGotos(label, exitObject) && continue
                index++
            } else if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof StatementScope) {
                continue = ((sSeq.get(index) as InstructionStatement).instruction as StatementScope).statements.
                    removeInstantaneousGotos(label, exitObject)
                index++
            } else if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                    println("par")
                    for (thread : ((sSeq.get(index) as InstructionStatement).instruction as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                        println("isAssigned " + isAssignedInInitialTick(thread.statements, exitObject))
                        if (isAssignedInInitialTick(thread.statements, exitObject))
                            continue = false
                    }
                    if (continue) {
                        println("lets continue")
                        for (thread : ((sSeq.get(index) as InstructionStatement).instruction as de.cau.cs.kieler.scl.scl.Parallel).threads) {
                            println("endlabel " + thread.getSequenceEndLabel)
                            if (thread.getSequenceEndLabel != null) {
                                continue = thread.statements.removeInstantaneousGotos(thread.getSequenceEndLabel, exitObject) && continue
                            }
                            println("return: " + continue)
                    }
                    }
                    index++
            } else if (sSeq.get(index) instanceof InstructionStatement &&
                (sSeq.get(index) as InstructionStatement).instruction instanceof Assignment &&
                ((sSeq.get(index) as InstructionStatement).instruction as Assignment).valuedObject == exitObject) {
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
    def boolean isAssignedInInitialTick(EList<Statement> statementList, ValuedObject valObj) {
        var index = 0
        var boolean wasAssigned = false
        while (index < statementList.length && !wasAssigned) {
            if (statementList.get(index) instanceof InstructionStatement &&
                (statementList.get(index) as InstructionStatement).instruction instanceof Assignment &&
                ((statementList.get(index) as InstructionStatement).instruction as Assignment).valuedObject == valObj) {
                return true
            } else if (statementList.get(index) instanceof InstructionStatement &&
                (statementList.get(index) as InstructionStatement).instruction instanceof Pause) {
                return false
            } else if (statementList.get(index) instanceof InstructionStatement &&
                (statementList.get(index) as InstructionStatement).instruction instanceof de.cau.cs.kieler.scl.scl.Parallel) {
                for (thread : ((statementList.get(index) as InstructionStatement).instruction as de.cau.cs.kieler.scl.scl.Parallel).
                    threads)
                    wasAssigned = wasAssigned || thread.statements.isAssignedInInitialTick(valObj)
            } else if (statementList.get(index) instanceof InstructionStatement &&
                (statementList.get(index) as InstructionStatement).instruction instanceof Conditional) {
                val cond = (statementList.get(index) as InstructionStatement).instruction as Conditional
                wasAssigned = cond.elseStatements.isAssignedInInitialTick(valObj) ||
                    cond.statements.isAssignedInInitialTick(valObj)
            } else if (statementList.get(index) instanceof InstructionStatement &&
                (statementList.get(index) as InstructionStatement).instruction instanceof StatementScope) {
                val sScope = (statementList.get(index) as InstructionStatement).instruction as StatementScope
                wasAssigned = sScope.statements.isAssignedInInitialTick(valObj)
            }
            index++

        }

        wasAssigned
    }
    
    /**
     * Returns the label at the end of a StatementSequence
     * 
     * @param thread The thread
     * @return       The label at the end of the given StatementSequence
     */
     def getSequenceEndLabel(StatementSequence sSeq) {
         val endLabel = sSeq.statements.findLast[ it instanceof EmptyStatement ]
         if (endLabel != null)
            return (endLabel as EmptyStatement).label
            
         null
     }

    // -------------------------------------------------------------------------
    // -- Esterel Termination Check
    // -------------------------------------------------------------------------
    /**
    * Checks whether an Esterel statement terminates. Not complete: May return true even
    * if a program does not terminate.
    * 
    * @param stm The statement to check
    * @return True if program terminates, else false
    */
    def dispatch boolean checkTerminate(de.cau.cs.kieler.esterel.esterel.Statement stm) {
        var terms = true;
        if (stm instanceof Halt) {
            return false;
        } else if (stm instanceof Loop) {
            return false;
        } else if (stm instanceof Sustain) {
            return false;
        } else if (stm instanceof Parallel) {
            val par = stm as Parallel
            for (th : par.list) {
                terms = terms && th.checkTerminate
            }
            return terms
        } else if (stm instanceof Sequence) {
            val seq = stm as Sequence
            for (s : seq.list) {
                terms = terms && s.checkTerminate
            }
            return terms
        } else if (stm instanceof Present) {
            val pres = stm as Present
            if (pres.body instanceof PresentEventBody) {
                val presBody = pres.body as PresentEventBody
                if (presBody.thenPart != null)
                    terms = presBody.thenPart.statement.checkTerminate
                if (pres.elsePart != null)
                    terms = terms && pres.elsePart.statement.checkTerminate

                return terms
            } else if (pres.body instanceof PresentCaseList) {
                val presBody = pres.body as PresentCaseList
                for (singleCase : presBody.cases) {
                    terms = terms && singleCase.statement.checkTerminate
                }
                terms = terms && pres.elsePart.checkTerminate
                return terms
            }
        } else if (stm instanceof EveryDo) {
            return false;
        } else if (stm instanceof LocalSignalDecl) {
            return (stm as LocalSignalDecl).statement.checkTerminate
        } else if (stm instanceof Await) {
            val await = stm as Await
            if (await.body instanceof AwaitCase) {
                val awaitCase = await.body as AwaitCase
                for (singleCase : awaitCase.cases) {
                    terms = terms && singleCase.statement.checkTerminate
                }
                return terms
            }
        } else if (stm instanceof Run) {
            return (stm as Run).module.module.body.statements.checkTerminate
        } else if (stm instanceof LocalVariable) {
            return (stm as LocalVariable).statement.checkTerminate
        } else if (stm instanceof Suspend) {
            return (stm as Suspend).statement.checkTerminate
        } else if (stm instanceof Block) {
            return (stm as Block).statement.checkTerminate
        }
        return true;
    }

    def dispatch boolean checkTerminate(Program program) {
        var terms = true;
        for (th : program.modules.head.body.statements) {
            terms = terms && th.checkTerminate
        }
        return terms
    }

    def dispatch boolean checkTerminate(EList<de.cau.cs.kieler.esterel.esterel.Statement> stms) {
        var terms = true;
        for (stm : stms) {
            terms = terms && stm.checkTerminate
        }

        terms
    }

    def dispatch boolean checkTerminate(Void x) {
        return true;
    }

    // -------------------------------------------------------------------------
    // -- SCL Shortcuts
    // -------------------------------------------------------------------------
    def StatementSequence newSseq() {
        SclFactory::eINSTANCE.createStatementSequence
    }

    def StatementScope newSscope() {
        SclFactory::eINSTANCE.createStatementScope
    }

    def Thread newThread() {
        SclFactory::eINSTANCE.createThread
    }

    /**
      * Creates "if s then (pause;) goto l"
      * @param s The condition
      * @param l The targetlabel
      * @param isImmediate When false a pause statement is added prior to the jump
      */
    def Conditional ifThenGoto(Expression s, String l, boolean isImmediate) {
        SclFactory::eINSTANCE.createConditional => [
            expression = s
            if (!isImmediate) {
                statements.addAll(createSclPause.statements)
            }
            statements.add(
                createStmFromInstr(
                    SclFactory::eINSTANCE.createGoto => [
                        targetLabel = l
                    ]))
        ]
    }

    /**
     * Adds a new empty statement to a StatementSequence
     * @param sSeq The StatementSequence to add the empty statement
     * @param l The label
     */
    def addLabel(StatementSequence sSeq, String l) {
        sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])
    }

    /**
     * Adds a new goto instruction to a StatementSequence
     * @param sSeq The StatementSequence to add the empty statement
     * @param l The target label 
     */
    def addGoto(StatementSequence sSeq, String l) {
        sSeq.add(createGotoStm(l))
    }

    /**
     * Adds a new goto instruction to a StatementSequence
     * @param sSeq The Statement EList to add the empty statement
     * @param l The target label 
     */
    def addGoto(EList<Statement> sSeq, String l) {
        sSeq.add(createGotoStm(l))
    }

    /**
     * Returns a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * @param l The target label
     * @param curLabel Label at the end of the currently transformed thread
     * @param labelMap Map of which label is in which thread
         */
    def createGotoj(String l, String curLabel, Multimap<String, String> labelMap) {
        if (labelMap.get(curLabel).contains(l)) {
            return createGotoStm(l)
        } else {
            return createGotoStm(curLabel)
        }
    }

    /**
     * Adds a gotoj l: Jumps to l if l is in the current thread and to the end of the
     * thread otherwise
     * @param sSeq The StatementSequence to add the gotoj
     * @param l The target label
     * @param curLabel Label at the end of the current thread
     * @param labelMap Map of which label is in which thread
     */
    def addGotoj(StatementSequence sSeq, String l, String curLabel, Multimap<String, String> labelMap) {
        if (labelMap.get(curLabel).contains(l)) {
            sSeq.addGoto(l)
        } else {
            sSeq.addGoto(curLabel)
        }

        sSeq
    }

    /**
    * Creates an InstructionStatement containing a goto
    * @param l The target label 
    */
    def createGotoStm(String l) {
        createStmFromInstr(
            SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ])
    }

    /**
     * Create an AND expression
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createAnd(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::AND
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an OR expression
     * @param arg1 first argument
     * @param arg2 second argument
     */
    def createOr(Expression arg1, Expression arg2) {
        KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            operator = OperatorType::OR
            subExpressions.add(arg1)
            subExpressions.add(arg2)
        ]
    }

    /**
     * Create an NOT expression
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

    def createConditional() {
        SclFactory::eINSTANCE.createConditional
    }

    /*
     * Adds an instruction to a StatementSeqeuence
     */
    def dispatch add(StatementSequence sSeq, Instruction instr) {
        sSeq.statements.add(createStmFromInstr(instr))

        sSeq
    }

    def dispatch add(StatementSequence sSeq, Statement stm) {
        sSeq.statements.add(stm)

        sSeq
    }

    def dispatch add(StatementSequence sSeq, StatementSequence stm) {
        sSeq.statements.addAll(stm.statements)

        sSeq
    }

    /**
     * Creates an assignment
     * 
     * @param obj The ValuedObject to be assigned with something
     * @param ex  The expression that should be assigned
     * @return    An assignment instruction
     */
    def createAssignment(ValuedObject obj, Expression exp) {
        SclFactory::eINSTANCE.createAssignment => [
            valuedObject = obj
            expression = exp
        ]
    }

    /*
     * Creates a Statement from an Instruction
     */
    def createStmFromInstr(Instruction instr) {
        SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = instr
        ]
    }

    def createSclStatementSequence(Statement stm) {
        SclFactory::eINSTANCE.createStatementSequence => [
            statements.add(stm)
        ]
    }

    def createSseq(Instruction instr) {
        SclFactory::eINSTANCE.createStatementSequence => [
            statements.add(createStmFromInstr(instr))
        ]
    }

    def createSclStatementSequence() {
        SclFactory::eINSTANCE.createStatementSequence
    }

    def createThread() {
        SclFactory::eINSTANCE.createThread
    }

    def createThread(Instruction instr) {
        SclFactory::eINSTANCE.createThread => [
            statements += createStmFromInstr(instr)
        ]
    }

    def createParallel() {
        SclFactory::eINSTANCE.createParallel
    }
}
