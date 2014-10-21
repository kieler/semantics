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
//TODO Sequence

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

/**
 * @author krat
 *
 */
class EsterelToSclTransformation extends Transformation {
    var variables = new LinkedList<ValuedObject>

    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension EsterelToSclExtensions
    
    // For KiCo
    override EObject transform(EObject eObject, KielerCompilerContext contex) {
        return transform(eObject as de.cau.cs.kieler.esterel.esterel.Program) as EObject
    }
    
    
    public def Program transform(de.cau.cs.kieler.esterel.esterel.Program esterelProgram) {
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
                System.out.println("sig: " + sig)
                val variable = createValuedObject(sig.name)
                variables.add(variable)
                decl.valuedObjects.add(variable)
            }
            program.declarations.add(decl)  
        }




        // Body transformations
        // TODO combine with output reset thread creations
        for (stm : esterelMod.body.statements) {
            System.out.println("transofmring" + stm)
            program.statements.addAll(transformStm(stm).statements);
        }
        
        // Add reset thread for outputs
        val f_term = createValuedObject(uniqueName(variables, "f_term"))
        val decl = createDeclaration => [
            type = ValueType::BOOL
            valuedObjects.add(f_term)
        ]
        program.declarations.add(decl)
        
        val par = SclFactory::eINSTANCE.createParallel
        par.threads.add(handleOutputs(program, f_term))
        par.threads.add(SclFactory::eINSTANCE.createThread => [
            statements.addAll(program.statements)
            statements.add(createStmFromInstr(createAssignment(f_term, createBoolValue(true))))
        ])
        
        
        program.statements.add(createStmFromInstr(par))
     
        // Reset labelcount
        resetLabelCount

        // Return the transformed program        
        program
    }
    
    
    /*
     * Creates thread to set former output signals to false at the start
     * of every tick
     */
    def de.cau.cs.kieler.scl.scl.Thread handleOutputs(Program program, ValuedObject f_term) {
        val th = SclFactory::eINSTANCE.createThread
        val l = createFreshLabel
        
        th.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
             label = l
        ])
        
        for (decl : program.declarations) {
            if (decl.output == true) {
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
        
        for (th : par.list) {
            val sclTh = SclFactory::eINSTANCE.createThread
            
            sclTh.statements.addAll(transformStm(th).statements)
            sclTh.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
            ])
            
            sclPar.threads.add(sclTh)
        }

        createSseq(createStmFromInstr(sclPar))
    }
    
    
    /*
     * p; q
     */
    def dispatch StatementSequence transformStm(Sequence seq) {
        System.out.println("transofmring" + seq.list.length)
        SclFactory::eINSTANCE.createStatementSequence => [
            for (stm : seq.list) {
                System.out.println("transofmring" + stm)
                statements.addAll(transformStm(stm).statements)
            }    
        ]    
    }
    
    
    /*
     * await (immediate) s
     * TODO await case
     */
    def dispatch StatementSequence transformStm(Await await) {
        System.out.println("await");
        if (await.body instanceof AwaitCase) {
            return transformStm(awaitToPresentCase(await.body as AwaitCase))
        }
        val stmSeq = SclFactory::eINSTANCE.createStatementSequence
        
        val l = createFreshLabel
        
        stmSeq.statements.add(SclFactory::eINSTANCE.createEmptyStatement => [
            label = l
        ])
        
        if(!(await.body as AwaitInstance).delay.isImmediate) {
            stmSeq.statements.add(createStmFromInstr(SclFactory::eINSTANCE.createPause))
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
    
    def Present awaitToPresentCase(AwaitCase cases) {
        val pres = EsterelFactory::eINSTANCE.createPresent
        val body = EsterelFactory::eINSTANCE.createPresentCaseList
        System.out.println("1")
        for (singleCase : cases.cases) {
            System.out.println(singleCase.delay.event.expr)
            body.cases.add(EsterelFactory::eINSTANCE.createPresentCase => [
//                event.expression = singleCase.delay.expr
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
        
        stmSeq.statements.add(SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = SclFactory::eINSTANCE.createGoto => [
                targetLabel = l
            ]
        ])
        
        stmSeq
    }
    
    
    /*
     * pause
     */
    def dispatch StatementSequence transformStm(Pause pause) {
        createSseq(createStmFromInstr(SclFactory::eINSTANCE.createPause))
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
     * abort p when s
     */
     def dispatch StatementSequence transformStm(Abort abort) {
         val p = transformStm(abort.statement)
         
         p
     }
     
     /*
      * Inserts abortion after pauses
      */
//      def StatementSequence insertGotoAfterPause(StatementSequence sSeq) {
//          val res = SclFactory::eINSTANCE.createStatementSequence;
//          for (stm : sSeq.statements) {
//              res.statements.add(insertGotoAfterPause(stm))
//          }
//          
//          res
//      }
    
    
    /*
     * Transform Expression
     */
     def de.cau.cs.kieler.core.kexpressions.Expression transformExp(Expression exp) {
         if (exp instanceof OperatorExpression) {
             return transformOperatorExp(exp as OperatorExpression)
         } 
         else if (exp instanceof ValuedObjectReference) {
             return transformValObjRef(exp as ValuedObjectReference)
         }
         
         createExpression
     }
     
     def de.cau.cs.kieler.core.kexpressions.Expression transformOperatorExp(OperatorExpression exp) {
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
     
     def de.cau.cs.kieler.core.kexpressions.Expression transformCompExp(ComplexExpression comp) {
         if (comp instanceof ValuedObjectReference) {
             transformValObjRef(comp as ValuedObjectReference)
         }
     }
     
     def de.cau.cs.kieler.core.kexpressions.Expression transformValObjRef(ValuedObjectReference ref) {
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