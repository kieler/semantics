/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.s.sj.xtend

import de.cau.cs.kieler.core.kexpressions.BooleanValue
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.HostCodeInstruction
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.s.s.LocalSignal
import de.cau.cs.kieler.s.s.Continuation
import java.util.List

/**
 * Transformation of S code into SS code that can be executed using the GCC.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
class S2SJ { 
    
    // General method to create the c simulation interface.
    def transform (Program program, String outputFolder) {
       '''
«/* Generate the C header */»
       «sjHeader(outputFolder, program)»

       «/* Signal Reset, Output */»
       «sResetSignals(program)»

       «/* Generate the main function */»
       «mainFunction(program)»

       «/* Generate the tick function */»
       «sTickFunction(program)»
       '''
   }     

   // -------------------------------------------------------------------------   
   
   def String listContinuations(List<Continuation> continuationList) {
       '''
    «FOR continuation : continuationList SEPARATOR ","» 
         «continuation.name»
    «ENDFOR»
       '''
   }
   
   // -------------------------------------------------------------------------   

   def String listSignals(List<Signal> signalList) {
       '''
    «FOR signal : signalList SEPARATOR ""»
        public boolean «signal.name» = false;
    «ENDFOR»
       '''
   }
   
   // -------------------------------------------------------------------------   

   // Generate the Java header.
   def sjHeader(String outputFolderm, Program program) {
       '''
/*
 *****************************************************************************
 *                 G E N E R A T E D     S J    C O D E                      *
 *****************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        *
 *                                                                           *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/                           *
 * Copyright 2013 by                                                         *
 * + Christian-Albrechts-University of Kiel                                  *
 *   + Department of Computer Science                                        *
 *     + Real-Time and Embedded Systems Group                                *
 *                                                                           *
 * This code is provided under the terms of the Eclipse Public License (EPL).*
 *****************************************************************************
 */

import java.io.IOException;
import de.cau.cs.kieler.sjl.SJLProgram;

import ''' + program.name + '''.State;
import static ''' + program.name + '''.State.*;
    
public class ''' + program.name + ''' extends SJLProgram<State> {

    enum State {
        ''' + program.eAllContents.filter(typeof(Continuation)).toList.listContinuations + '''
    }

''' + program.signals.listSignals + ''' 

    public ''' + program.name + '''() {
        super(''' + program.states.head.name + ''', ''' + program.priority + ''', ''' + program.priority + ''');
    }
    
    ''' 
   }
   
   // -------------------------------------------------------------------------

   // Generate reset signals
   def sResetSignals(Program program) {
    '''
    public void resetSignals() {    
    «FOR signal : program.signals SEPARATOR ""»
        «signal.name» = false;
    «ENDFOR»
    }
    ''';
   }

   
   // -------------------------------------------------------------------------

   // Generate the main function.
   def mainFunction(Program program) {
       '''int main(int argc, const char* argv[]) {
        reset();
        output = cJSON_CreateObject();
        RESET();
        totalResetSignals();
        setInputs();
        emitCount = 0;
        tick();
        while(1) {
            callOutputs();
            char* outString = cJSON_Print(output);
            strip_white_spaces(outString);
            printf("%s\n", outString);
            fflush(stdout);
            resetSignals();
            output = cJSON_CreateObject();
            setInputs();
            emitCount = 0;
            tick();
        }
    }
    
    void printOutputs() {
        printf("%s \n", cJSON_Print(output));
    }
    '''
   }
      
   // -------------------------------------------------------------------------   
   
   // Generate the  tick function.
   def sTickFunction(Program program) {
       '''   @Override
    public final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
       «FOR state : program.states»
       «state.expand»
       «ENDFOR»
       
            }
        }       
    }
    '''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand a state traversing all instructions of that state.
   def dispatch expand(State state) {
           '''      case «state.name»:  
           «FOR instruction : state.instructions»
           «instruction.expand»
           «ENDFOR»
           break;'''
   }
   
   // Expand an IF instruction traversing all instructions of that IF instruction.
   def dispatch expand(If ifInstruction) {
       '''if («ifInstruction.expression.expand») { 
           «FOR instruction : ifInstruction.instructions»
               «instruction.expand»
           «ENDFOR»
         }'''
   }   
   
   // -------------------------------------------------------------------------   

   // Host code without "..."
   def extractCode(String hostCodeString) {
        hostCodeString.substring(1, hostCodeString.length-1);
   }
   
   // Expand Host code.
   def dispatch expand(HostCodeInstruction hostCodeInstruction) {
        '''«hostCodeInstruction.hostCode.extractCode»;'''
   }
   // Expand Text Expression
   def dispatch expand(TextExpression expression) {
        '''(«expression.code.extractCode»)'''
   }

   // -------------------------------------------------------------------------   
      
   // Expand a PAUSE instruction.
   def dispatch expand(Pause pauseInstruction) {
       '''pauseB();'''
   }   
   
   // Expand a TERM instruction.
   def dispatch expand(Term termInstruction) {
       '''termB();'''
   }   
   
   // Expand a HALT instruction.
   def dispatch expand(Halt haltInstruction) {
       '''haltB();'''
   }   
   
   // Expand a JOIN instruction.
   def dispatch expand(Join joinInstruction) {
       '''if(!join()) {
               gotoB(«joinInstruction.continuation.name»);
               break;
          };'''
   } 
   
   // Expand an ABORT instruction.  
   def dispatch expand(Abort abortInstruction) {
       '''abortB();'''
   }   
   
   // Retrieve the last FORK instruction because in SC the last fork
   // will become a FORKE statement.
   def getLastFork(Fork forkInstruction) {
        val instructionListContainer = ((forkInstruction).eContainer);
        if (instructionListContainer instanceof State) {
            return (instructionListContainer as State).instructions.filter(typeof(Fork)).toList.last;
        }
        if (instructionListContainer instanceof If) {
            return (instructionListContainer as If).instructions.filter(typeof(Fork)).toList.last;
        }
   }
   
   // Expand a FORK instruction.
   def dispatch expand(Fork forkInstruction) {
       '''«IF forkInstruction.getLastFork != forkInstruction» 
             fork(«forkInstruction.thread.name»,«forkInstruction.priority»);
          «ENDIF»
          «IF forkInstruction.getLastFork == forkInstruction» 
             gotoB(«forkInstruction.thread.name»);
          «ENDIF»
       '''
   }   

   // Expand a TRANS instruction.    
   def dispatch expand(Trans transInstruction) {
       '''gotoB(«transInstruction.continuation.name»);'''
   }   
   
   // Expand an AWAIT instruction.
   def dispatch expand(Await awaitInstruction) {
       '''AWAIT;'''
   }   
   
   // Expand a PRIO instruction.
   def dispatch expand(Prio prioInstruction) {
       '''prioB(«prioInstruction.priority»);'''
   }   
   
   // Expand SIGNAL instruction. This takes care of reincarnation
   // by resetting local signals when the state is re-entered.
   // Also reset the value of valued signals (test 139).
   def dispatch expand(LocalSignal signalInstruction) {
       '''presentSigInt[«signalInstruction.signal.name»] = 0;
          valSigInt[«signalInstruction.signal.name»] = «signalInstruction.signal.combineOperator.initialValue»;'''   
   }
   
   // Expand an EMIT instruction.
   def dispatch expand(Emit emitInstruction) {
       if (emitInstruction.value != null) {
           '''EMIT_VAL_SCC(«emitInstruction.signal.name», «emitInstruction.value.expand»,
               «emitInstruction.signal.combineOperator.macro», 
               «emitInstruction.signal.combineOperator.initialValue»);'''
       }
       else {
           '''«emitInstruction.signal.name» = true;'''
       }
   }   
   
   // Expand fall back for other instructions: Do nothing.
   def dispatch expand(Instruction instruction) {
   }   
   
   // -------------------------------------------------------------------------   
   
   // Combine operator
   def macro(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return '''COMBINE_ADD'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''COMBINE_MULT'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''COMBINE_MAX'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''COMBINE_MIN'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''COMBINE_OR'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''COMBINE_AND'''
       }
       // default case combine with +
       return '''COMBINE_ADD''';
   }

   def initialValue(CombineOperator combineOperator) {
       if (combineOperator.equals(CombineOperator::ADD)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::MULT)) {
          return '''1'''
       }
       else if (combineOperator.equals(CombineOperator::MAX)) {
          return '''-999999'''
       }
       else if (combineOperator.equals(CombineOperator::MIN)) {
          return '''999999'''
       }
       else if (combineOperator.equals(CombineOperator::OR)) {
          return '''0'''
       }
       else if (combineOperator.equals(CombineOperator::AND)) {
          return '''1'''
       }
       // default case combine with +
       return '''0''';
   }

   // -------------------------------------------------------------------------
   
   //Expand a complex expression.
   def dispatch expand(OperatorExpression expression) {
        '''
    «IF expression.operator  == OperatorType::EQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " == "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::LT»
        («FOR subexpression : expression.subExpressions SEPARATOR "  <  "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::LEQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " <= "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::GT»
        («FOR subexpression : expression.subExpressions SEPARATOR " > "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::GEQ»
        («FOR subexpression : expression.subExpressions SEPARATOR " >= "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::NOT»
        (!(«expression.subExpressions.toList.head.expand»))
    «ENDIF»
    «IF expression.operator  == OperatorType::VAL»
        VAL_SCC(«expression.subExpressions.toList.head.expand_val»)
    «ENDIF»
    «IF expression.operator  == OperatorType::PRE»
    (PRE_«expression.subExpressions.toList.head.expand_val»)
    «ENDIF»
    «IF expression.operator  == OperatorType::NE»
        («FOR subexpression : expression.subExpressions SEPARATOR " != "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::AND»
        («FOR subexpression : expression.subExpressions SEPARATOR " && "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::OR»
        («FOR subexpression : expression.subExpressions SEPARATOR " || "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::ADD»
        («FOR subexpression : expression.subExpressions SEPARATOR " + "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::SUB»
        («FOR subexpression : expression.subExpressions SEPARATOR " - "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::MULT»
        («FOR subexpression : expression.subExpressions SEPARATOR " * "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::DIV»
        («FOR subexpression : expression.subExpressions SEPARATOR " / "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
    «IF expression.operator  == OperatorType::MOD»
        («FOR subexpression : expression.subExpressions SEPARATOR " % "»
            «subexpression.expand»
        «ENDFOR»)
    «ENDIF»
            '''
   }

   // -------------------------------------------------------------------------
    
   // Expand a signal.
   def dispatch expand(Signal signal) {
        '''«signal.name»'''
   }
   // Expand a signal within a value reference
   def dispatch expand_val(Signal signal) {
        '''«signal.name»'''
   }
   def dispatch expand_val(ValuedObjectReference valuedObjectReference) {
        '''«valuedObjectReference.valuedObject.expand_val»'''
   }   
   def dispatch expand_val(Expression other) {
        other.expand;
   }
   
   // Expand a int expression value.
   def dispatch expand(IntValue expression) {
        '''«expression.value.toString»'''
   }

   // Expand a float expression value.
   def dispatch expand(FloatValue expression) {
        '''«expression.value.toString»'''
   }

   // Expand a boolean expression value (true or false).
   def dispatch expand(BooleanValue expression) {
        '''«IF expression.value == true »1«ENDIF»«IF expression.value == false»0«ENDIF»'''
   }

   
   // Expand an object reference.
   def dispatch expand(ValuedObjectReference valuedObjectReference) {
        '''«valuedObjectReference.valuedObject.expand»'''
   }
   
   // Expand a valued object.
   def dispatch expand(ValuedObject valuedObject) {
        ''''''
   }

   // -------------------------------------------------------------------------   
}
