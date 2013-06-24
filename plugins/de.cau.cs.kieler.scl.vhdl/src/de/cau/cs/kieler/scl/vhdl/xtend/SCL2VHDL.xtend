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

import java.util.ArrayList
import org.yakindu.sct.model.stext.stext.impl.IntLiteralImpl
import org.yakindu.sct.model.stext.stext.impl.BoolLiteralImpl
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.Expression
import de.cau.cs.kieler.eso.vhdl.Variables

/**
 * Transformation of SCL code into VHDL code.
 * 
 * @author gjo
 */
class SCL2VHDL { 
    
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
        
    val name = program.name
    val vars = program.declarations
    
    vars.forEach[ variable | 
        if(variable.input)                      
             modelInputs.add(createVariableFromModel(variable, true)) 
        if(variable.output)                   
             modelOutputs.add(createVariableFromModel(variable, false))   
        ]
        
        
    '''
    «generateEntity(modelInputs, modelOutputs, name)»
    
    ARCHITECTURE behavior OF «name» IS
    
    --signal declaration
    --signals
    
    begin
    
    
    end Behavioral;
    '''
       
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
   
    def createVariableFromModel(VariableDeclaration variable, boolean isInput) {
        
        val Expression initialValue = variable.initialValue
        val name = variable.name
        
        // Initial Value
        // Better to look first after an initial value, because the grammer 
        // allows: input signal A : integer = false; !!!
        if(initialValue != null){
            val value1 = initialValue as PrimitiveValueExpression
            if(value1.value instanceof IntLiteralImpl){
                val value2 = value1.value as IntLiteralImpl
                val value3 = value2.value
                new Variables(name,isInput,value3)
            }else if (value1.value instanceof BoolLiteralImpl){
                val value2 = value1.value as BoolLiteralImpl
                val value3 = value2.value
                new Variables(name,isInput,value3)
            }   
        }
        //no initial value
        else{
            if(variable.type != null){
                val String type = variable.type.name
                //In VHDL simulation all used signals should have an initial value
                if(type == "integer"){
                    new Variables(name,isInput,0)
                }
                else if(type == "boolean") {
                    new Variables(name,isInput,false)
                }
                //other values are not supported
                // TODO  throw exception for unsupported type
            }//no type specified -> set to boolean
            else{
                new Variables(name,isInput,false)
            }
        }
        
    }
   // -------------------------------------------------------------------------
   
   // Expand an empty statement
   def dispatch expand(EmptyStatement statement) {
   		'''noop'''
   }

   // Expand an instruction statement
   def dispatch expand(InstructionStatement statement) {
        '''«statement.instruction.expand»'''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(Pause pauseInstruction) {
   	'''PAUSE;'''
   }   

   // Expand all other instructions.
   def dispatch expand(Instruction elseInstruction) {
    '''OTHERINSTRUCTION;'''
   }   
   
   // -------------------------------------------------------------------------   
 
 
 
  
   
}




