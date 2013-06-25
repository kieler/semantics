/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scl.vhdl.xtend

import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.VariableDeclaration

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
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression
import org.yakindu.sct.model.stext.stext.AssignmentOperator

import java.util.ArrayList
import de.cau.cs.kieler.eso.vhdl.Variables
import org.eclipse.emf.common.util.EList

/**
 * Transformation of SCL code into VHDL code.
 * 
 * @author gjo
 */
class SCL2VHDL {
    Object modelOutput 
    
    // General method to create the c simulation interface.
	def transform (Program program) {
       '''
	   «/* Generate the header */»
	   «header()»
	   «/* Generate the tick function */»
	   «generateCode(program)»
       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the header.
   def header() {
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
   
   // Generate the  tick function.
   def tickFunction(Program program) {
       val statementSequence = program as StatementSequence;
       val statements = statementSequence.statements;
   	'''    int tick(){
       «FOR statement : statements»
       «statement.expand»
       «ENDFOR»
	   TICKEND;
    }
	'''
   }
   
   // -------------------------------------------------------------------------   
   
   def generateCode(Program program){
       
       //Get Input and Output from Model
    val modelInputs = new ArrayList<Variables>
    val modelOutputs = new ArrayList<Variables>
    val modelLocalVariables = new ArrayList<Variables>
        
    val name = program.name
    val vars = program.declarations
    
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
    
    begin
    prog: process
    
    --local in/out Variables
    «genarateLocalVariables(modelInputs)»
    «genarateLocalVariables(modelOutputs)»
    --local variables
    «genarateLocalVariables(modelLocalVariables)»
    
    begin
    
        -- do some stuff
        wait until rising_edge(tick);
        «signalToVariable(modelInputs)»
        
        «generateMainProcess(program.statements)»
        
        «variableToSignal(modelOutputs)»
        
    end process prog;
    
        «generateInitialTickProcess()»
    
    end behavior;
    '''
       
   }
   
    def generateInitialTickProcess() { 
     '''
     -- create initial Tick
     initialTick: process
        variable u_notInitial : boolean := false;
        variable u_notInitialDetect : boolean:= true;
        variable u_entry : boolean;

        begin
            wait until rising_edge(tick);
        
            if (reset = '1') then
                u_notInitial := false;
                u_notInitialDetect := true;
                entry_int <= false;
            else 
                u_entry := not u_notInitial;
                u_notInitial := u_notInitial or u_notInitialDetect;
                entry_int <= u_entry;
            end if;
     end process;
     '''
    }

    def variableToSignal(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«lVar.name» <= «lVar.name»_int;''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

    def signalToVariable(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«lVar.name»_int := «lVar.name»;''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

    def generateMainProcess(EList<Statement> stmList) { 
        
        var str = stmList.map(stm | '''«stm.expand»''').join('\n')
        str
        
    }

    def genarateLocalSignals(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''signal «lVar.name»_int : «getTypeAndInitValue(lVar)»''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }
    
    def genarateLocalVariables(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''variable «lVar.name»_int : «getTypeAndInitValue(lVar)»''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

   //-------------------------------------------------------------------------
    def generateEntity(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray, String entityName) { 
    
        //compute the component 
        //e.g. A_in : IN boolean;       
        val ins = inputArray.map(input | '''«input.name»: IN «getTypeString(input)»''').join(';\n')
        val outs = outputArray.map(output | '''«output.name» : OUT «getTypeString(output)»''').join(';\n')
        
        //compute the whole component, the last entry in the component has no ';'
        //if there are no inputs and output res should be empty, not null (null will be a String in vhdl)
        val res = if(!(ins.nullOrEmpty && outs.nullOrEmpty))
                     '''--inputs''' + '\n'  + ins + (if(!outs.nullOrEmpty) ';\n') + 
                     '''--outputs'''+ '\n' + outs        
        
        '''
        ENTITY «entityName» IS
        PORT(
             tick : IN  std_logic;
             reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
            );
        END «entityName»;
        '''
    }
    
    
    //Returns a vhdl String according to the type of the kvpair
    def getTypeAndInitValue(Variables v) { 

        val value = v.value
        if(value instanceof Integer){
            return "integer range 31 downto 0 := " + value.toString + ";"
        }
        else if(value instanceof Boolean)
            return "boolean := " + value.toString + ";"         
    }
    
    //Return the kvpair type as a string
    def getTypeString(Variables v) { 
        
        val value = v.value
        if(value instanceof Integer)
            return "integer range 31 downto 0"
        else if(value instanceof Boolean){
            return "boolean"
        }
    }
    
   // -------------------------------------------------------------------------
   
    def createVariableFromModel(VariableDeclaration variable, boolean isInput, boolean isOutput) {
        
        val Expression initialValue = variable.initialValue
        val name = variable.name
        
        // Initial Value
        // Better to look first after an initial value, because the grammer 
        // allows: input signal A : integer = false; !!!
        if(initialValue != null){
            val value1 = initialValue as PrimitiveValueExpression
            if(value1.value instanceof IntLiteral){
                val value2 = value1.value as IntLiteral
                val value3 = value2.value
                new Variables(name,isInput,isOutput,value3)
            }else if (value1.value instanceof BoolLiteral){
                val value2 = value1.value as BoolLiteral
                val value3 = value2.value
                new Variables(name,isInput,isOutput,value3)
            }   
        }
        //no initial value
        else{
            if(variable.type != null){
                val String type = variable.type.name
                //In VHDL simulation all used signals should have an initial value
                if(type == "integer"){
                    new Variables(name,isInput,isOutput,0)
                }
                else if(type == "boolean") {
                    new Variables(name,isInput,isOutput,false)
                }
                //other values are not supported
                // TODO  throw exception for unsupported type
            }//no type specified -> set to boolean
            else{
                new Variables(name,isInput,isOutput,false)
            }
        }
        
    }
   // -------------------------------------------------------------------------
     
   
   // Expand an empty statement
   def dispatch expand(Assignment assign) {
   		'''«assign.assignment.expand»;'''
   }

   // Expand an instruction statement
   def dispatch expand(Conditional cond) {
        '''if («cond.expression.expand»=true) then
              «cond.statements.map(stm | stm.expand).join('\n')»
            end if;'''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(Expression exp) {
    '''«exp.toString»'''
   }
   
      // Expand a PAUSE instruction.
   def dispatch expand(AssignmentExpression exp) {
    '''«exp.varRef.expand» «exp.operator.expand» «exp.expression.expand»'''
   }
   
   def dispatch expand(AssignmentOperator assOp) {
    ''':='''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(ConditionalExpression exp) {
    '''«exp.toString»'''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(ElementReferenceExpression exp) {
   	'''«exp.reference.expand»'''
   }   

   // Expand all other instructions.
   def dispatch expand(InstructionStatement inst) {
    '''«inst.instruction.expand»'''
   }  
   
   // Expand all other instructions.
   def dispatch expand(VariableDeclaration vari) {
    '''«vari.name»_int'''
   }
   
   // Expand all other instructions.
   def dispatch expand(PrimitiveValueExpression primVal) {
    '''«primVal.value.expand»'''
   }
   
   // Expand all other instructions.
   def dispatch expand(BoolLiteral bool) {
    '''«bool.value»'''
   }
   
   // Expand all other instructions.
   def dispatch expand(LogicalOrExpression orExp) {
    '''«orExp.leftOperand.expand» or «orExp.rightOperand.expand»'''
   }
   
   // Expand all other instructions.
   def dispatch expand(LogicalAndExpression andExp) {
    '''«andExp.leftOperand.expand» and «andExp.rightOperand.expand»'''
   }
   
   // Expand all other instructions.
   def dispatch expand(LogicalNotExpression notExp) {
    '''not «notExp.operand.expand»'''
   }
   
   
      // Expand all other instructions.
   def dispatch expand(ParenthesizedExpression parenthesizedExp) {
    '''(«parenthesizedExp.expression.expand»)'''
   }
   // -------------------------------------------------------------------------   
 
 
 
  
   
}




