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

import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.Declaration
import javax.xml.transform.TransformerException
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Instruction
import java.util.LinkedList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitInstance
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.LocalSignal
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl

/**
 * @author krat
 *
 */
class EsterelToSclExtensions {
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension EsterelToSclTransformation
    
    var static labelCount = 0;
    
    /*
     * Searches a valuedObject in a declarations list
     */
    def dispatch getValuedObject(EList<Declaration> decls, String n) {
        for (decl : decls) {
            val ret = decl.valuedObjects.findFirst[name == n]
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }
    
    def dispatch getValuedObject(LinkedList<Pair<String, ValuedObject>> variables, String n) {
        for (varaible : variables) {
            val ret = variables.findLast[key == n].value
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }
    
    def getValuedObjectRef(EList<Declaration> decls, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(decls, n)
        ]
    }
    
    def getValuedObjectRef(LinkedList<Pair<String, ValuedObject>> variables, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(variables, n)
        ]
    }
    
    def createValuedObjectRef(ValuedObject valObj) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = valObj
        ]
    }
    
    def createAssignment(ValuedObject obj, Expression exp) {
        SclFactory::eINSTANCE.createAssignment => [
            valuedObject = obj
            expression = exp
        ]
    }
    
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
    
    /*
     * Returns a fresh label
     */
    def createFreshLabel() {
        labelCount = labelCount + 1
        
        "l" + labelCount
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
     * Takes a variable name and a list of exisiting variables and
     * adds "_" until variable name is new
     */
     def String uniqueName(LinkedList<Pair<String,ValuedObject>> variables, String s) {
         if (variables.findFirst[value.name == s] == null) {
             return s
         }
         else {
             return uniqueName(variables, s + "_")
         }
     }
     
     def String uniqueNameByList(LinkedList<String> variables, String s) {
         if (!variables.contains(s)) {
             return s;
         }
         else {
             return uniqueNameByList(variables, s + "_")
         }
     }
     
     /*
      * Creates "if s then (pause;) goto l"
      */
      def Conditional ifThenGoto(Expression s, String l, boolean isImmediate) {
          System.out.println("ExpType: " + (s))
          SclFactory::eINSTANCE.createConditional => [
              expression = s//createBoolValue(true)
              if (!isImmediate) {
                  statements.addAll(createSclPause.statements)
              }
              statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                  targetLabel = l
              ]))
          ]
      }
      
      /*
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
       
       /*
        * Adds a new goto instruction to a StatementSequence
        * @param sSeq The StatementSequence to add the empty statement
        * @param l The target label 
        */
        def addGoto(StatementSequence sSeq, String l) {
            sSeq.statements.add(createGotoStm(l))
        }
        
        /*
         * Returns a gotoj l: Jumps to l if l is in the current thread and to the end of the
         * thread otherwise
         * @param l The target label
         * @param curLabel Label at the end of the current thread
         * @param labelMap Map of which label is in which thread
         */
         def createGotoj(String l, String curLabel, Multimap<String, String> labelMap) {
             if (labelMap.get(curLabel).contains(l)) {
                 return createGotoStm(l)
             } else {
                 return createGotoStm(curLabel)
             }
         }
        
        /*
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
        
        /*
        * Creates an InstructionStatement containing a goto
        * @param l The target label 
        */
        def createGotoStm(String l) {
                    createStmFromInstr(
                        SclFactory::eINSTANCE.createGoto => [
                            targetLabel = l
                        ])
        }
        
        /*
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
         
         /*
          * Adds an instruction to a StatementSeqeuence
          */
          def add(StatementSequence sSeq, Instruction instr) {
              sSeq.statements.add(createStmFromInstr(instr))
              
              sSeq
          }

       /*
        * Checks whether an Esterel statement terminates. Not complete: May return true even
        * if a program does not terminate.
        * TODO finish
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
                    return presBody.thenPart.checkTerminate && pres.elsePart.checkTerminate
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
        
        def dispatch boolean checkTerminate(EList<Statement> stms) {
            var terms = true;
            for (stm : stms) {
                terms = terms && stm.checkTerminate
            }
            
            terms
        }
        
        def dispatch boolean checkTerminate(Void x) {
            return true;
        }
        
}

/*
 * Represents a preemptive hull, can be used to be put on a stack to keep track of nested
 * preemptive statements.
 */
public class PreemptiveElement {
    public String type;
    public String endLabel;
    public de.cau.cs.kieler.esterel.kexpressions.Expression expression;
    public ValuedObject flag1;
    public ValuedObject flag2;
    
    /*
     * Constructs new PreemptiveElement
     * @param t String representation of the type of the preemptive statement
     * @param l Optional label representing where to jump to, if preemption happens. null if none
     * @param expr Esterel expression denoting when preemption happens
     * @param f1 Optional flag. null if none
     * @param f2 Optional flag. null if none
     */
    public new (String t, String l, de.cau.cs.kieler.esterel.kexpressions.Expression expr, ValuedObject f1, ValuedObject f2) {
        type = t
        endLabel = l
        expression = expr
        flag1 = f1
        flag2 = f2
    }
}