package de.cau.cs.kieler.ssascl.vhdl.xtend


import com.google.inject.Guice
import de.cau.cs.kieler.scl.scl.Program
//import de.cau.cs.kieler.scl.scl.StatementSequence
//import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Statement
//import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
//import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
//import de.cau.cs.kieler.scl.scl.Goto
//import de.cau.cs.kieler.scl.scl.Parallel
//import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.VariableDefinition

import org.yakindu.sct.model.stext.stext.IntLiteral
import org.yakindu.sct.model.stext.stext.BoolLiteral
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ConditionalExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.LogicalOrExpression
import org.yakindu.sct.model.stext.stext.LogicalAndExpression
import org.yakindu.sct.model.stext.stext.LogicalNotExpression
import org.yakindu.sct.model.stext.stext.LogicalRelationExpression
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression
import org.yakindu.sct.model.stext.stext.NumericalAddSubtractExpression
import org.yakindu.sct.model.stext.stext.NumericalMultiplyDivideExpression
import org.yakindu.sct.model.stext.stext.ShiftExpression
//import org.yakindu.sct.model.stext.stext.AssignmentOperator
import org.yakindu.sct.model.stext.stext.AdditiveOperator

import java.util.ArrayList
import de.cau.cs.kieler.scl.vhdl.Variables
import org.eclipse.emf.common.util.EList
//import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping
//import org.yakindu.sct.model.stext.stext.AssignmentOperator
//import org.yakindu.sct.model.stext.stext.AssignmentOperator
//import org.yakindu.sct.model.stext.stext.AssignmentOperator
import java.io.File
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.scl.vhdl.extensions.VHDLExtension
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions

class SSASCL2VHDL {
    
    Object vhdlCode
    
    
    extension de.cau.cs.kieler.scl.vhdl.extensions.VHDLExtension VHDLExtension = 
         Guice::createInjector().getInstance(typeof(VHDLExtension))
    extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
    
    val ffList = createNewStatementList     
    
    def transform (Program program, File modelFile) {
        
        ffList.clear
        
        var String modelname
        
        if(modelFile != null){
            val input = URI::createFileURI(modelFile.getName());
            modelname = input.toString
            val temp = modelname.subSequence(0, modelname.indexOf("."))
            modelname = temp.toString         
            modelname = modelname.replace("-","_")
            
            var firstChar = modelname.charAt(0)
            
            while( Character::isDigit(firstChar) || (firstChar == "_")){
                if(!modelname.nullOrEmpty){
                     firstChar = modelname.charAt(0)
                     val tempp = modelname.subSequence(1, modelname.length).toString
                     modelname = tempp
                }else{
                    modelname = "no_valid_name"
                }
            }
        } 
       
       '''
       «/* Generate the header */»
       «generateHeader()»
       «/* Generate the tick function */»
       «generateCode(program, modelname)»
       
       «generateHeader()»
       '''
    }
    
    // -------------------------------------------------------------------------   
   
   // Generate the header.
   def generateHeader() {
    '''
    --/*****************************************************************************/
    --/*               G E N E R A T E D     V H D L    C O D E                    */
    --/*****************************************************************************/
    --/* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
    --/*                                                                           */
    --/* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
    --/* Copyright 2013 by                                                         */
    --/* + Christian-Albrechts-University of Kiel                                  */
    --/*   + Department of Computer Science                                        */
    --/*     + Real-Time and Embedded Systems Group                                */
    --/*                                                                           */
    --/* This code is provided under the terms of the Eclipse Public License (EPL).*/
    --/*****************************************************************************/
    
    library IEEE;
    use IEEE.STD_LOGIC_1164.ALL;
    ''' 
   }
    
   // -------------------------------------------------------------------------   
   
   def generateCode(Program program, String modelname){
     
     
    //Get Input and Output from Model
    val modelInputs = new ArrayList<Variables>
    val modelOutputs = new ArrayList<Variables>
    val modelLocalVariables = new ArrayList<Variables>
        
    val name = modelname
    val vars = program.definitions
    
    vars.forEach[ variable | 
        if(variable.input)                      
             modelInputs.add(createVariableFromModel(variable, true, false)) 
        if(variable.output)                   
             modelOutputs.add(createVariableFromModel(variable, false, true)) 
        if(!(variable.input || variable.output))
             modelLocalVariables.add(createVariableFromModel(variable, false, false)) 
        ]
             
    '''
    «generateEntity(modelInputs, modelOutputs, name)»
    
    ARCHITECTURE behavior OF «name» IS
    
    --signal declaration
    signal entry_int : boolean := false;
    
    --local in/out Signals
    «genarateLocalVariables(modelInputs)»
    «genarateLocalVariables(modelOutputs)»
    --local signals
    «genarateLocalVariables(modelLocalVariables)»
    
    begin

        --update local signals
        «signalToVariable(modelInputs)»
        GO_int <= entry_int;
        
        --main program
        «generateMainProcess(program.statements,program)»
    
        --set outputs
        «intSignalToSignal(modelOutputs)»
        
        --tick process
        «generateInitialTickProcess()»
        
        --generate Flips Flops
        «generateFlipFlops()»
    end behavior;
    '''
     
   }
    def generateFlipFlops() { 

        '''
            flipflop: process
            
            
            begin
            wait until rising_edge(tick);
                if(reset = '1') then
                   «ffList.map[ instr |
                   val ass = instr.instruction as Assignment 
                   val assExp = ass.assignment as AssignmentExpression
                   val elemRefExp = assExp.varRef as ElementReferenceExpression
                   val vardef = elemRefExp.reference as VariableDefinition
                   val varName = vardef.name
                   
                   '''«varName» <= false;'''
                    
                ].join('\n')»
                else
                    «ffList.map[ ass | 
                        '''«ass.expand»'''
                    ].join('\n')»
                end if;
            end process;
            «generateHeader()»
        '''  
    }
   
    def generateInitialTickProcess() { 
        
        '''
        initialTick: process
        variable u_notInitial : boolean := false;
        variable u_notInitialDetect : boolean := true;
        variable u_entry : boolean;

        begin
            wait until rising_edge(tick);
            if(reset = '1') then
                u_notInitial := false;
                u_notInitialDetect := true;
                u_entry := false;
                
            else
                u_entry := not u_notInitial;
                u_notInitial := u_notInitial or u_notInitialDetect;
            
                entry_int <= u_entry;
            end if;
        end process;

        '''
    }

    def genarateLocalVariables(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«generateVhdlSignalFromVariableWithInitialValue(lVar,"_int")»''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }
    
    def setAllLocalVariables(ArrayList<Variables> variables, boolean value) { 
        
        variables.map[ variable | 
            '''«variable.name + "_int"» <= «value»;'''
        ].join('\n')
        
    }
    
   def signalToVariable(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«lVar.name»_int <= «lVar.name»;''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }
    
    def intSignalToSignal(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«lVar.name» <= «lVar.name»_int;''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }
    
    def generateMainProcess(EList<Statement> stmList, Program program) { 
        
        vhdlCode = ''''''
        
        stmList.forEach[stm | 
            
            if(stm.assignment){
                val instr = stm.getInstruction 
                val ass = instr as Assignment
                vhdlCode = vhdlCode + (ass).transformAssignmentToVHDL(program).toString
            }
            else if(stm.conditional){
                
            }
        ]
        
        return vhdlCode
    }
    
    def transformAssignmentToVHDL(Assignment assignment,Program program) { 
        
        var vhdlCode = '''''' 
        
        //Get variable name
        val assExp = assignment.assignment as AssignmentExpression
        val elemRefExp = assExp.varRef as ElementReferenceExpression
        val vardef = elemRefExp.reference as VariableDefinition
        val varName = vardef.name
        
        if(varName.endsWith("0")){
            
            //it is an pre value, this assignment will be a ff later
            ffList.add(assignment.createStatement)
            //not longer needed
            program.statements.remove(assignment)
        }else{

            //found normal assignment
            vhdlCode = assignment.expand
        }
        
        return vhdlCode
    }

    
      //---------------------------------------------------------------------------
   
   // Expand an Assignment
   def dispatch expand(Assignment assign){ 
        '''«assign.assignment.expand»'''
   }

   // Expand an conditional statement
   def dispatch expand(Conditional cond) {

       var ifstm = ''''''

       ifstm = ifstm + cond.statements.map( stm | '''«stm.expand» WHEN «cond.expression.expand»''').join(';\n')
   
       if(!(cond.elseStatements.nullOrEmpty))
            ifstm = ifstm + ';\n' 
        else 
            ifstm = ifstm + '' 
            
       ifstm = ifstm + cond.elseStatements.map( stm | '''«stm.expand» WHEN not «cond.expression.expand»''').join(';\n')
       
       return ifstm
            
   }
   
   // Expand an Assignment Expression
   // all stext operators are expanded, >>= and <<= are converted to arithmetic shifts (right ?)
   def dispatch expand(AssignmentExpression exp) {
        if      (exp.operator.literal ==  "="){'''«exp.varRef.expand» <= «exp.expression.expand»'''}
        else if (exp.operator.literal == "+="){'''«exp.varRef.expand» <= «exp.varRef.expand» + «exp.expression.expand»'''}
        else if (exp.operator.literal == "-="){'''«exp.varRef.expand» <= «exp.varRef.expand» - «exp.expression.expand»'''}
        else if (exp.operator.literal == "*="){'''«exp.varRef.expand» <= «exp.varRef.expand» * «exp.expression.expand»'''}
        else if (exp.operator.literal == "/="){'''«exp.varRef.expand» <= «exp.varRef.expand» / «exp.expression.expand»'''}
        else if (exp.operator.literal == "%="){'''«exp.varRef.expand» <= «exp.varRef.expand» mod «exp.expression.expand»'''}
        else if (exp.operator.literal == "<<="){'''«exp.varRef.expand» <= «exp.varRef.expand» sla «exp.expression.expand»'''}
        else if (exp.operator.literal == ">>="){'''«exp.varRef.expand» <= «exp.varRef.expand» sla «exp.expression.expand»'''}
        else if (exp.operator.literal == "&="){'''«exp.varRef.expand» <= «exp.varRef.expand» and «exp.expression.expand»'''}
        else if (exp.operator.literal == "|="){'''«exp.varRef.expand» <= «exp.varRef.expand» or «exp.expression.expand»'''}
   }

   // Expand a Element Reference Expression
   def dispatch expand(ElementReferenceExpression exp) {
    '''«exp.reference.expand»'''
   }   

   // Expand all other instructions.
   def dispatch expand(InstructionStatement inst) {
    '''«inst.instruction.expand»'''
   }  
   
   // Expand a Variable Declaration, all internal signals have an "_int" at the end
   def dispatch expand(VariableDefinition vari) {
    '''«vari.name»_int'''
   }
   
   // Expand a Primitive Value Expression
   def dispatch expand(PrimitiveValueExpression primVal) {
    '''«primVal.value.expand»'''
   }
   
   // Expand a Bool Literal
   def dispatch expand(BoolLiteral bool) {
    '''«bool.value»'''
   }
   
   // Expand an Int Literal.
   def dispatch expand(IntLiteral integer) {
    '''«integer.value»'''
   }
   
   // Expand a Logical Or Expression
   def dispatch expand(LogicalOrExpression orExp) {
    '''«orExp.leftOperand.expand» or «orExp.rightOperand.expand»'''
   }
   
   // Expand a Logical And Expression
   def dispatch expand(LogicalAndExpression andExp) {
    '''«andExp.leftOperand.expand» and «andExp.rightOperand.expand»'''
   }
   
   // Expand a Logical Relation Expression
   // all stext Expressions will be transformed
   def dispatch expand(LogicalRelationExpression relExp) {
    
    if      (relExp.operator.literal ==  "<"){'''«relExp.leftOperand.expand» «relExp.operator» «relExp.rightOperand.expand»'''}
    else if (relExp.operator.literal == "<="){'''«relExp.leftOperand.expand» «relExp.operator» «relExp.rightOperand.expand»'''}
    else if (relExp.operator.literal == ">"){'''«relExp.leftOperand.expand» «relExp.operator» «relExp.rightOperand.expand»'''}
    else if (relExp.operator.literal == ">="){'''«relExp.leftOperand.expand» «relExp.operator» «relExp.rightOperand.expand»'''}
    else if (relExp.operator.literal == "=="){'''«relExp.leftOperand.expand» = «relExp.rightOperand.expand»'''}
    else if (relExp.operator.literal == "!="){'''«relExp.leftOperand.expand» /= «relExp.rightOperand.expand»'''}
   }
   
   //Expand a Numerical Add Sub Expression
   // only + and - are included
   def dispatch expand(NumericalAddSubtractExpression numAddSubExp) {
    '''«numAddSubExp.leftOperand.expand» «numAddSubExp.operator.literal» «numAddSubExp.rightOperand.expand»'''
   }
   
   //Expand an shift operator
   //left and right shift are transformed to logical shifts
   def dispatch expand(ShiftExpression shiftExp) {
    
    if      (shiftExp.operator.literal == "<<"){'''«shiftExp.leftOperand.expand» sll «shiftExp.rightOperand.expand»'''}
    else if (shiftExp.operator.literal == ">>"){'''«shiftExp.leftOperand.expand» srl «shiftExp.rightOperand.expand»'''}
   }
   
   //Expand Numerical Multiply Divide Expression and modulo
   //only modulo must be adapted to vhdl. Multiplication and division are the same
   def dispatch expand(NumericalMultiplyDivideExpression numMultDivExp) {
    //Others *, /
    if (numMultDivExp.operator.literal == "%"){'''«numMultDivExp.leftOperand.expand» mod «numMultDivExp.rightOperand.expand»'''}
    else{'''«numMultDivExp.leftOperand.expand» «numMultDivExp.operator.literal» «numMultDivExp.rightOperand.expand»'''}
   }
   
   // Expand a Logical not Expression
   def dispatch expand(LogicalNotExpression notExp) {
    '''not «notExp.operand.expand»'''
   }
   
   // Expand a Parenthesized Expression
   def dispatch expand(ParenthesizedExpression parenthesizedExp) {
    '''(«parenthesizedExp.expression.expand»)'''
   }
   
   // ------------------------------------------------------------------------- 
    
    
}