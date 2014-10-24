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

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.AwaitInstance
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.AwaitCase
import de.cau.cs.kieler.esterel.esterel.PresentCaseList
import de.cau.cs.kieler.esterel.esterel.PresentCase
import de.cau.cs.kieler.esterel.esterel.ElsePart
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.kexpressions.Input
import de.cau.cs.kieler.esterel.kexpressions.Output
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import java.util.LinkedList
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.esterel.kexpressions.Signal
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.LocalSignal
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.esterel.esterel.AbortInstance
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.formatting.SCLFormatter

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {
    // Global variables
    var variables = new LinkedList<ValuedObject>
    
    // Indicates, if currently an abort body is transformed and holds the 
    // corresponding expression; null if not
    var Expression abortF = null
    
    // Label at the end of currently transformed thread
    var String threadEnd

    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension EsterelToSclExtensions
    
    // KiCO
    override EObject transform(EObject eObject, KielerCompilerContext contex) {
        return transform(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }
    
    
    public def Program transform(de.cau.cs.kieler.esterel.esterel.Program esterelProgram) {
        System.out.println("Transforming to SCL...")
        // Create the SCL program
        val program = SclFactory::eINSTANCE.createProgram()
        // TODO handle several modules
        val esterelMod = esterelProgram.modules.head
        program.name = esterelMod.name
     
        // Interface transformations
        // Transform signals to bool variables
        for (sigs : esterelMod.interface.intSignalDecls) {
            val decl = createDeclaration => [
                input = sigs instanceof Input
                output = sigs instanceof Output
                type = ValueType::BOOL
            ]
            for (sig : sigs.signals) {
                val variable = createValuedObject(sig.name)
                variables.add(variable)
                decl.valuedObjects.add(variable)
            }
            program.declarations.add(decl)
        }
        




        // Body transformations
        val body = SclFactory::eINSTANCE.createStatementSequence
        for (stm : esterelMod.body.statements) {
            //TODO later
            body.statements.addAll(transformStm(stm).statements);
        }
        
        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName(variables, "f_term"))
        val decl = createDeclaration => [
            type = ValueType::BOOL
            valuedObjects.add(f_term)
        ]
        program.declarations.add(decl)
        
        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(program.declarations, f_term))
        par.threads.add(SclFactory::eINSTANCE.createThread => [
            statements.addAll(body.statements)
            statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
        ])
        
        program.statements.add(createStmFromInstr(par))
        
        // Reset labelcount
        resetLabelCount
        

        // Return the transformed program 
        System.out.println("Transformed")
        program
    }
    
    
    /*
     * Creates thread to set output signals to false at the start
     * of every tick
     */
    def de.cau.cs.kieler.scl.scl.Thread handleOutputs(EList<Declaration> decls, ValuedObject f_term) {
        val th = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel
        
        th.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
             label = l
        ])
        
        for (decl : decls) {
            if (decl.output == true && decl.input == false) {
                for (value : decl.valuedObjects) {
                    th.statements.add(createStmFromInstr(createAssignment(value, createBoolValue(false))))
                }
            }
        }
        
        
        th.statements.add(createStmFromInstr(
            SclFactory::eINSTANCE.createConditional => [
                expression = createOperatorExpression(OperatorType::NOT) => [
                    subExpressions.add(KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
                        valuedObject = f_term
                    ])
                ]
                statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
                statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                     targetLabel = l
                ]))
            ]))

        
       th
    }
    
    
    /*
     * Transformation rules
     */ 
    
    /*
     * emit s
     */
    def dispatch StatementSequence transformStm(Emit emit) {   
        val variable = getValuedObject(variables, emit.signal.name)
        
        val variableRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = variable    
        ]      
        
        val op = createOperatorExpression(OperatorType::OR) => [
             add(variableRef)
             add(createBoolValue(true))
        ]
              
        createSseq(createStmFromInstr(createAssignment(variable,op)))
    }
    
    
    /*
     * p || q
     */
    def dispatch StatementSequence transformStm(Parallel par) {
        val sclPar = SclFactory::eINSTANCE.createParallel
        
        if (abortF == null) {
            for (th : par.list) {
                sclPar.threads.add(SclFactory::eINSTANCE.createThread => [
                    statements.addAll(transformStm(th).statements)
                ])
            }
            return createSseq(createStmFromInstr(sclPar))
        }
        
        else {
            val oldEnd = threadEnd
            for (th : par.list) {
                val l = createFreshLabel
                threadEnd = l
                sclPar.threads.add(SclFactory::eINSTANCE.createThread => [
//                    statements.add(createStmFromInstr(ifThenGoto(transformExp(abortF), l)))
                    statements.addAll(transformStm(th).statements)
                    statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
                        label = l
                    ])
                ])
            }
            threadEnd = oldEnd
            val res = createSseq(createStmFromInstr(sclPar))
            
            res.statements.add(createStmFromInstr(ifThenGoto(transformExp(abortF), threadEnd)))
            res
        }

    }
    
    
    /*
     * p; q
     */
    def dispatch StatementSequence transformStm(Sequence seq) {
        SclFactory::eINSTANCE.createStatementSequence => [
            for (stm : seq.list) {
                statements.addAll(transformStm(stm).statements)
            }    
        ]    
    }
    
    
    /*
     * await (immediate) s
     * TODO await case
     */
    def dispatch StatementSequence transformStm(Await await) {
        if (await.body instanceof AwaitCase) {
            return transformStm(awaitToPresentCase(await.body as AwaitCase))
        }
        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        
        val l = createFreshLabel
        
        stmSeq.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
            label = l
        ])
        
        if(!(await.body as AwaitInstance).delay.isImmediate) {
            stmSeq.statements.addAll(transformStm(EsterelFactory::eINSTANCE.createPause).statements)
        }       
        
        
        val gotoStm = SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ]
        ]        
        
        val b = createOperatorExpression(OperatorType::NOT) => [
            //TODO beautify
            subExpressions.add(getValuedObjectRef(variables, 
                ((await.body as AwaitInstance).delay.event.expr as ValuedObjectReference).valuedObject.name
            ))
        ]
        
        val cond = SclFactory::eINSTANCE.createConditional => [
            expression = b
            if((await.body as AwaitInstance).delay.isImmediate) {
                statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
            }
            statements.add(gotoStm)
        ]
        
        val instr = SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = cond
        ]

        stmSeq.statements.add(instr)
        
        stmSeq
        
    }
    
    
    /*
     * TODO fix
     */
    def Present awaitToPresentCase(AwaitCase cases) {
        val pres = EsterelFactory::eINSTANCE.createPresent
        val body = EsterelFactory::eINSTANCE.createPresentCaseList
        System.out.println("1!!!!")
        for (singleCase : cases.cases) {
            body.cases.add(EsterelFactory::eINSTANCE.createPresentCase => [
                event = EsterelFactory::eINSTANCE.createPresentEvent => [
                    expression = singleCase.delay.expr
                ]
                System.out.println("singleCase.delay " + singleCase.delay)
                statement = singleCase.statement
            ])
        }
        System.out.println("3")
        pres.body = body
        
        pres
    }
    
    
    /*
     * loop p end
     */
    def dispatch StatementSequence transformStm(Loop loop) {
        val l = createFreshLabel
        
        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        stmSeq.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
            label = l
        ])
         
        stmSeq.statements.addAll(transformStm(loop.body.statement).statements)
        
        // TODO Remove pseudo conditional when scg unreachable code is fixed
        stmSeq.statements.add(createStmFromInstr(SclFactory::eINSTANCE.createConditional => [
            expression = createBoolValue(true)
            statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ]))
        ]))
        
        stmSeq
    }
    
    
    /*
     * pause
     */
    def dispatch StatementSequence transformStm(Pause pause) {
        if (abortF == null) {
            return createSseq(createStmFromInstr(SclFactory::eINSTANCE.createPause))
        }
        else {
            return SclFactory::eINSTANCE.createStatementSequence => [
                statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
                statements.add(createStmFromInstr(ifThenGoto(transformExp(abortF), threadEnd)))
        ]
        }
    }
    
    
    /*
     * nothing
     */
     def dispatch StatementSequence transformStm(Nothing nothing) {
        SclFactory::eINSTANCE.createStatementSequence
    }
    
    
    /*
     * halt
     */
     def dispatch StatementSequence transformStm(Halt halt) {
         val l = createFreshLabel
         SclFactory::eINSTANCE.createStatementSequence => [
             statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
                 label = l
             ])
             statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
             statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                 targetLabel = l
             ]))
         ]
     }
    
    
    /*
     * [ ... ]
     */
    def dispatch StatementSequence transformStm(Block block) {
        transformStm(block.statement)
    }
    
    
    /*
     * present
     */
    def dispatch StatementSequence transformStm(Present pres) {
        //present s then p (else q)
        if (pres.body instanceof PresentEventBody) {
            val cond = SclFactory::eINSTANCE.createConditional => [
                expression = transformExp((pres.body as PresentEventBody).event.expression)
                statements.addAll(transformStm((pres.body as PresentEventBody).thenPart.statement).statements)
                if (pres.elsePart != null) {
                    elseStatements.addAll(transformStm(pres.elsePart.statement).statements)
                }
            ]
            return createSseq(createStmFromInstr(cond))
            
        }
        //present case s do ...
        else if (pres.body instanceof PresentCaseList) {
            val cond = handleCaseList((pres.body as PresentCaseList).cases, 0, pres.elsePart)
            return createSseq(createStmFromInstr(cond))
        }
    }
    
    
    /*
     * Creates nested conditional equivalent to cases list
     */
    def Conditional handleCaseList(EList<PresentCase> cases, int idx, ElsePart elsePart) {
        if (cases.length > idx+1) {
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression)
                statements.addAll(transformStm(cases.get(idx).statement).statements)
                elseStatements.addAll(createStmFromInstr(handleCaseList(cases, idx+1, elsePart)))
            ]
        }
        else {
            System.out.println("else case")
            return SclFactory::eINSTANCE.createConditional => [
                expression = transformExp(cases.get(idx).event.expression)
                statements.addAll(transformStm(cases.get(idx).statement).statements)
                if (elsePart != null) {
                    elseStatements.addAll(transformStm(elsePart.statement).statements)
                }
            ]
        }
    }
    
    
    /*
     * signal
     * Local signals are handled as global output signals
     * TODO: local signals in xtext
     */
//     def dispatch StatementSequence transformStm(LocalSignalDecl signal) {
//         for (s : (signal.signalList as LocalSignal).signal) {
//             val obj = createValuedObject(s.name)
//             variables.add(obj)
//         }
//          
//         transformStm(signal.statement)
//     }
    
    
    /*
     * abort p when s
     * TODO Integrate to Esterel to SCL transformation
     * immediate?
     */
     def dispatch StatementSequence transformStm(Abort abort) {
         abortF = (abort.body as AbortInstance).delay.event.expr
         val l = createFreshLabel()
         threadEnd = l
         val res = transformStm(abort.statement)
         res.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
             label = l
         ])
         abortF = null
         
         res
     }
     
      /*
       * Statement Sequence
       */
//       def StatementSequence handleAbort(StatementSequence sSeq, Expression expr, String label) {
//           System.out.println("HandleAbort: Handle Sequence")
//           abortF = true;
//           val res = transformStm()
//           sSeq
//       }
       
     /*
      * Inserts abortion after pauses
      * Statements
      */
//      def StatementSequence handleAbort(Statement stm, Expression expr, String label) {
//          System.out.println("HandleAbort: Statement is" + stm)
//          
//          // Empty statement
//          if (stm instanceof EmptyStatement) {
//              System.out.println("HandleAbort: Empty Stm")
//              return createSseq(stm)
//          }
//          
//          // Instruction
//          else if (stm instanceof InstructionStatement) {
//              System.out.println("HandleAbort: Instruction Stm")
//              return handleAbort((stm as InstructionStatement).instruction, expr, label)
//          }
//          
//          System.out.println("!!! HandleAbort: Statements not handlebar: " + stm)
//          createSseq(stm)
//      }
      
      
      /*
       * Instructions
       */
//      def StatementSequence handleAbort(Instruction instr, Expression expr, String label) {
//          System.out.println("Handle Instruction: Instruction is: " + instr)
//          
//          // Pause
//          if (instr instanceof de.cau.cs.kieler.scl.scl.Pause) {
//              System.out.println("HandleAbort: Instruction Stm: Pause")
//              return SclFactory::eINSTANCE.createStatementSequence => [
//                  statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
//                  statements.add(createStmFromInstr(ifThenGoto(transformExp(expr), label)))
//              ]
//          }
//          
//          // Conditional
//          else if (instr instanceof Conditional) {
//              System.out.println("HandleAbort: Instruction Stm: Conditional")
//              val cond = SclFactory::eINSTANCE.createConditional => [
//                  expression = (instr as Conditional).expression
//              ]
//              for (singleStm : (instr as Conditional).statements) {
//                  cond.statements.addAll(handleAbort(singleStm, expr, label).statements)
//              }
//              for (singleStm : (instr as Conditional).elseStatements) {
//                  cond.elseStatements.addAll(handleAbort(singleStm, expr, label).statements)
//              }
//              return createSseq(createStmFromInstr(cond))
//          }
//          
//          // Parallel
//          else if (instr instanceof de.cau.cs.kieler.scl.scl.Parallel) {
//              System.out.println("HandleAbort: Instruction Stm: Parallel")
//              val res = SclFactory::eINSTANCE.createParallel
//              for (th : (instr as de.cau.cs.kieler.scl.scl.Parallel).threads) {
//                  val l = createFreshLabel()
//                  res.threads.add(SclFactory::eINSTANCE.createThread => [
//                      statements.addAll(handleAbort(th, expr, l).statements)
//                      statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
//                          it.label = l
//                      ])
//                  ])
//              }
//              return SclFactory::eINSTANCE.createStatementSequence => [
//                  statements.add(createStmFromInstr(res))
//                  statements.add(createStmFromInstr(ifThenGoto(transformExp(expr), label)))
//              ]
//          }
//          
//          System.out.println("!!! HandleAbort: Handle Instruction: Instruction not handlebar: " + instr)
//          
//          createSseq(createStmFromInstr(instr))
//      }
      
      
      
    
    /*
     * Transform Expression
     */
     def de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression exp) {
         if (exp instanceof OperatorExpression) {
             System.out.println("transformExp: OperatorExpression")
             return transformOperatorExp(exp as OperatorExpression)
         } 
         else if (exp instanceof ValuedObjectReference) {
             System.out.println("transformExp: ValuedObjectReference")
             return transformValObjRef(exp as ValuedObjectReference)
         }
         
         System.out.println("transformExp: Unknown Expression: " + exp)
         createExpression
     }
     
     def de.cau.cs.kieler.core.kexpressions.OperatorExpression transformOperatorExp(OperatorExpression exp) {
         //TODO beautify; complete
         val opType = 
             switch exp.operator {
                 case OperatorType::NOT: de.cau.cs.kieler.core.kexpressions.OperatorType::NOT
                 case OperatorType::AND: de.cau.cs.kieler.core.kexpressions.OperatorType::AND
                 case OperatorType::OR: de.cau.cs.kieler.core.kexpressions.OperatorType::OR
             }
         System.out.println("exptype :" + exp.subExpressions.head)
         KExpressionsFactory::eINSTANCE.createOperatorExpression => [
             operator = opType
             for (subExp : exp.subExpressions) {
                 subExpressions.add(transformExp(subExp))
             }
         ]
     }
     
     def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformCompExp(ComplexExpression comp) {
         if (comp instanceof ValuedObjectReference) {
             System.out.println("transformCompExp: " + comp)
             transformValObjRef(comp as ValuedObjectReference)
         }
     }
     
     def de.cau.cs.kieler.core.kexpressions.ValuedObjectReference transformValObjRef(ValuedObjectReference ref) {
         System.out.println("transformValObjRef: " + ref)
         getValuedObjectRef(variables, ref.valuedObject.name)
     }
    
    override getDependencies() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override getId() {
        "ESTERELTOSCL"
    }
    
    override getName() {
        "SCL"
    }
    
   
    
}