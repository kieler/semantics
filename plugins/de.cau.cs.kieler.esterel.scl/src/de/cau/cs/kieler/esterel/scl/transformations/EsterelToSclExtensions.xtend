/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
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
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.LinkedList
import javax.xml.transform.TransformerException
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.xbase.lib.Pair

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

    // Current lablecount ensures the creation of fresh labels
    var static labelCount = 0;

    /*
     * Searches a valuedObject in a declarations list
     */
    def getValuedObject(EList<Declaration> decls, String n) {
        for (decl : decls) {
            val ret = decl.valuedObjects.findFirst[name == n]
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }

    def getValuedObject(String n) {
        for (variable : signalMap) {
            val ret = signalMap.findLast[key == n]
            if (ret != null)
                return ret.value
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }

    /*
     * Returns a references to valued object valObj
     */
    def getValuedObjectRef(EList<Declaration> decls, String valObj) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(decls, valObj)
        ]
    }

    def getValuedObjectRef(String valObj) {
        valObj.getValuedObject.createValObjRef
    }

    def createValObjRef(ValuedObject valObj) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = valObj
        ]
    }

    /*
     * Returns a fresh label
     */
    def createFreshLabel() {
        labelCount = labelCount + 1

        "l" + labelCount
    }

    /*
     * Returns a fresh variable and registers the local declaration
     */
    def createFreshVar(String name, ValueType t) {
        val ret = createValuedObject(uniqueName(signalMap, name))

        localDeclarations.add(
            KExpressionsFactory::eINSTANCE.createDeclaration => [
                type = t
                valuedObjects.add(ret)
            ])
        signalMap.add(name -> ret)

        ret
    }

    def resetLabelCount() {
        labelCount = 0;
    }

    def createEmptyStm(String l) {
        SclFactory::eINSTANCE.createEmptyStatement => [
            label = l
        ]
    }

    /*
     * Takes a variable name and a list of existing variables and
     * adds "_" until variable name is new
     */
    def String uniqueName(LinkedList<Pair<String, ValuedObject>> variables, String s) {

        // The variable should neither be on the current signalMap nor locally defined
        if ((variables.findFirst[value.name == s] == null) &&
            (localDeclarations.filter[valuedObjects.findFirst[name == s] != null].empty)) {
            return s
        } else {
            return uniqueName(variables, s + "_")
        }
    }

    def String uniqueNameByList(LinkedList<String> variables, String s) {
        if (!variables.contains(s)) {
            return s;
        } else {
            return uniqueNameByList(variables, s + "_")
        }
    }



    /**
    * Checks whether an Esterel statement terminates. Not complete: May return true even
    * if a program does not terminate.
    * @param stm The statement to check
    * @return True if program terminates, else false
    */
    def dispatch boolean checkTerminate(de.cau.cs.kieler.esterel.esterel.Statement stm) {
        if (stm instanceof Halt) {
            return false;
        } else if (stm instanceof Loop) {
            return false;
        } else if (stm instanceof Sustain) {
            return false;
        } else if (stm instanceof Parallel) {
            val par = stm as Parallel
            var terms = true;
            for (th : par.list) {
                terms = terms && th.checkTerminate
            }
            return terms
        } else if (stm instanceof Sequence) {
            val seq = stm as Sequence
            var terms = true;
            for (s : seq.list) {
                terms = terms && s.checkTerminate
            }
            return terms
        } else if (stm instanceof Present) {
            val pres = stm as Present
            if (pres.body instanceof PresentEventBody) {
                val presBody = pres.body as PresentEventBody
                var terms = true
                if (presBody.thenPart != null)
                    terms = presBody.thenPart.statement.checkTerminate
                if (pres.elsePart != null)
                    terms = terms && pres.elsePart.statement.checkTerminate

                return terms
            } else if (pres.body instanceof PresentCaseList) {
                val presBody = pres.body as PresentCaseList
                var terms = true
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
                var terms = true
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

    
    /**
     * Creates a statement which increments a valued object by 1
     * @param valObj The valued object to increment
     * @return A statement which increments valObj
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
    
    /*
     * Checks for valid names. The suffix "_val" is reserved for valued signals.
     */
    def boolean validateNames(Program esterelProgram) {
        System.out.println("Name: " + esterelProgram.modules.head.name)
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
    
    /*
     * Checks, whether a variable is already declared
     */
     def boolean alreadyDefined(String n) {
         for (decl : localDeclarations) {
             for (valObj : decl.valuedObjects) {
                 if (valObj.name == n) {
                    return true
                 }
             }
         }
         if (!signalMap.filter[ key == n ].nullOrEmpty)
            return true
         false
     }
     
    // -------------------------------------------------------------------------
    // -- SCL Shortcuts
    // -------------------------------------------------------------------------
    
    def StatementSequence newSseq() {
        SclFactory::eINSTANCE.createStatementSequence
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
        sSeq.statements.add(createGotoStm(l))
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
    
    /*
     * Creates an assignment
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

    def createSseq(Statement stm) {
        SclFactory::eINSTANCE.createStatementSequence => [
            statements.add(stm)
        ]
    }

    def createSseq() {
        SclFactory::eINSTANCE.createStatementSequence
    }
    
    def createThread() {
        SclFactory::eINSTANCE.createThread
    }
    
    def createParallel() {
        SclFactory::eINSTANCE.createParallel
    }
}