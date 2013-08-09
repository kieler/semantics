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

import com.google.inject.Guice
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Conditional
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
import org.yakindu.sct.model.stext.stext.AdditiveOperator

import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import java.io.File
import org.eclipse.emf.common.util.URI

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.vhdl.util.VHDLUtil

/**
 * Transformation of SCL code into VHDL code.
 * 
 * @author gjo
 */
class SCL2VHDL {
    
     extension de.cau.cs.kieler.scl.vhdl.util.VHDLUtil VHDLExtension = 
         Guice::createInjector().getInstance(typeof(VHDLUtil))
     extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
     extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
     extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
     extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
             
    String modelname
    
    // General method to create the c simulation interface.
	def transform (Program program, File modelFile) {
          
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
//    val modelInOutsHm = new HashMap<String,String>()
    val modelInputs = new ArrayList<VariableDefinition>
    val modelOutputs = new ArrayList<VariableDefinition>
    val modelLocalVariables = new ArrayList<VariableDefinition>
        
    val name = modelname
    val vars = program.definitions
    
    val newVariables = new ArrayList<VariableDefinition> 
    
    vars.forEach[ variable |        
        if(variable.input && variable.output){
            
            val vari = variable.copy 
            variable.setName(vari.name)
            modelInputs.add(vari)
            newVariables.add(vari)
            
            val variableOutName = variable.name + "_out"
            variable.setName(variableOutName)
//            variable.setInput(false)
            modelOutputs.add(variable)
//            modelInOutsHm.put(variable.name,variableOutName)
        }
        else if(variable.input)                      
             modelInputs.add(variable) 
        else if(variable.output)                   
             modelOutputs.add(variable) 
        else if(!(variable.input || variable.output))
             modelLocalVariables.add(variable) 
        ]
        
        program.definitions.addAll(newVariables)
             
    '''
    «generateEntity(modelInputs, modelOutputs, name)»
    
    ARCHITECTURE behavior OF «name» IS
    
    signal reset_reg : boolean := false;
        
    begin
    p: process
        
    --local in/out Variables
    «genarateLocalVariables(modelInputs)»
    «genarateLocalVariables(modelOutputs)»
    --local variables
    «genarateLocalVariables(modelLocalVariables)»
    
    begin
    
        wait until rising_edge(tick);
        if(reset = true) then
                
            «setAllLocalVariables(modelInputs,false)»
            «setAllLocalVariables(modelOutputs,false)»
            «setAllLocalVariables(modelLocalVariables,false)»
        else
            
            --update local variables
            «signalToVariable(modelInputs)»
            RUNNING_local := RUNNING_reg;
        
            --main program
            «generateMainProcess(program.statements)»
        
            --set outputs
            «variableToSignal(modelOutputs)»
        end if;
    end process p;
        
        «generateBootRegister()»
        
    end behavior;
    '''
       
   }
    def generateBootRegister() { 
        
        '''
        bootRegister: process
        begin
            wait until rising_edge(tick);
            if(reset = true) then
                RUNNING_reg <= true;
             else
                RUNNING_reg <= reset;
             end if;
        end process;
        ''' 
    }

    def setAllLocalVariables(ArrayList<VariableDefinition> variables, boolean value) { 
        
        variables.map[ variable | 
            if(variable.input || variable.output){
                '''«variable.name + "_local"» := «value»;'''
            }else if(variable.name.equals("RESET")){
                 '''«variable.name + "_local"» := «value»;'''   
            }else{
                '''«variable.name» := «value»;'''
            }
        ].join('\n')
        
    }

   
//    def generateInitialTickProcess() { 
//     '''
//     -- create initial Tick
//     initialTick: process
//        variable u_notInitial : boolean := false;
//        variable u_notInitialDetect : boolean:= true;
//        variable u_entry : boolean;
//
//        begin
//            wait until rising_edge(tick);
//        
//            if (reset = '1') then
//                u_notInitial := false;
//                u_notInitialDetect := true;
//                entry_local <= false;
//            else 
//                u_entry := not u_notInitial;
//                u_notInitial := u_notInitial or u_notInitialDetect;
//                entry_local <= u_entry;
//            end if;
//     end process;
//     '''
//    }

    def variableToSignal(ArrayList<VariableDefinition> variables) { 
        
        val localVar = variables.map[lVar | 
        
            // is it an input output variable
            if(lVar.input && lVar.output){
                //yes, set the output from such variable
                var originalName = lVar.name.subSequence(0,lVar.name.indexOf("_out")).toString
                '''«lVar.name» <= «originalName»_local;'''
            }else{
                '''«lVar.name» <= «lVar.name»_local;'''
            }
            
        ].join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

    def signalToVariable(ArrayList<VariableDefinition> variables) { 
        
        val localVar = variables.map(lVar | '''«lVar.name»_local := «lVar.name»;''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

    def generateMainProcess(EList<Statement> stmList) { 
        
        var vhdlCode = stmList.map(stm | '''«stm.expand»''').join('\n')
        vhdlCode  
    }

//    def genarateLocalSignals(ArrayList<VariableDefinition> variables) { 
//        
//        val localVar = variables.map(lVar | '''«generateVhdlSignalFromVariableWithInitialValue(lVar,"_local")»''').join('\n')
//        
//        //else must be an empty String, when not null is written into the file
//        if(!(localVar.nullOrEmpty))
//            return localVar + '\n'
//        else 
//            return ''''''
//    }
    
    def genarateLocalVariables(ArrayList<VariableDefinition> variables) { 
        
        val localVar = variables.map[lVar | 
            if(lVar.input || lVar.output){
                '''«generateVhdlVariabelFromVariableWithInitialValue(lVar,"_local")»'''
            }else if(lVar.name.equals("RESET")){
                '''«generateVhdlVariabelFromVariableWithInitialValue(lVar,"_local")»'''
            }else{
                '''«generateVhdlVariabelFromVariableWithInitialValue(lVar,"")»'''
            }
        ].join('\n')
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }

//   //-------------------------------------------------------------------------
//    def generateEntity(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray, String entityName) { 
//    
//        //compute the component 
//        //e.g. A_in : IN boolean;       
//        val ins = inputArray.map(input | '''«input.name»: IN «getTypeString(input)»''').join(';\n')
//        val outs = outputArray.map(output | '''«output.name» : OUT «getTypeString(output)»''').join(';\n')
//        
//        //compute the whole component, the last entry in the component has no ';'
//        //if there are no inputs and output res should be empty, not null (null will be a String in vhdl)
//        val res = if(!(ins.nullOrEmpty && outs.nullOrEmpty))
//                     '''--inputs''' + '\n'  + ins + (if(!outs.nullOrEmpty) ';\n') + 
//                     '''--outputs'''+ '\n' + outs        
//        
//        '''
//        ENTITY «entityName» IS
//        PORT(
//             tick : IN  std_logic;
//             reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
//            );
//        END «entityName»;
//        '''
//    }
    
    
//    //Returns a vhdl String according to the type of the kvpair
//    def getTypeAndInitValue(Variables v) { 
//
//        val value = v.value
//        if(value instanceof Integer){
//            return "integer range 31 downto 0 := " + value.toString + ";"
//        }
//        else if(value instanceof Boolean)
//            return "boolean := " + value.toString + ";"         
//    }
    
//    //Return the kvpair type as a string
//    def getTypeString(Variables v) { 
//        
//        val value = v.value
//        if(value instanceof Integer)
//            return "integer range 31 downto 0"
//        else if(value instanceof Boolean){
//            return "boolean"
//        }
//    }
    
   // -------------------------------------------------------------------------
   
//    def createVariableFromModel(VariableDeclaration variable, boolean isInput, boolean isOutput) {
//        
//        val Expression initialValue = variable.initialValue
//        val name = variable.name
//        
//        // Initial Value
//        // Better to look first after an initial value, because the grammer 
//        // allows: input signal A : integer = false; !!!
//        if(initialValue != null){
//            val value1 = initialValue as PrimitiveValueExpression
//            if(value1.value instanceof IntLiteral){
//                val value2 = value1.value as IntLiteral
//                val value3 = value2.value
//                new Variables(name,isInput,isOutput,value3)
//            }else if (value1.value instanceof BoolLiteral){
//                val value2 = value1.value as BoolLiteral
//                val value3 = value2.value
//                new Variables(name,isInput,isOutput,value3)
//            }   
//        }
//        //no initial value
//        else{
//            if(variable.type != null){
//                val String type = variable.type.name
//                //In VHDL simulation all used signals should have an initial value
//                if(type == "integer"){
//                    new Variables(name,isInput,isOutput,0)
//                }
//                else if(type == "boolean") {
//                    new Variables(name,isInput,isOutput,false)
//                }
//                //other values are not supported
//                // TODO  throw exception for unsupported type
//            }//no type specified -> set to boolean
//            else{
//                new Variables(name,isInput,isOutput,false)
//            }
//        }
//        
//    }
   // -------------------------------------------------------------------------

   //not used
   def dispatch expand(Expression exp) {
    '''«exp.expand»'''
   }  
   
   //not used     
   def dispatch expand(AdditiveOperator addOp) {
    '''«addOp.literal»'''
   }
   
   //not used
   def dispatch expand(ConditionalExpression condExp) {
    '''
        if («condExp.condition.expand») then
            «condExp.trueCase.expand»
        else
            «condExp.falseCase.expand»
«««        «if(condExp.falseCase != null){'''else«condExp.falseCase.expand»'''}»
        end if;
    '''
   }
   
   //---------------------------------------------------------------------------
   
   // Expand an Assignment
   def dispatch expand(Assignment assign) {
   		'''«assign.assignment.expand»;'''
   }

   // Expand an conditional statement
   def dispatch expand(Conditional cond) {
        '''if («cond.expression.expand») then
              «cond.statements.map(stm | stm.expand).join('\n')»
              «if(!cond.elseStatements.nullOrEmpty){"else\n" + cond.elseStatements.map(stm | stm.expand).join('\n')}»
            end if;'''
   }
   
   // Expand an Assignment Expression
   // all stext operators are expanded, >>= and <<= are converted to arithmetic shifts (right ?)
   def dispatch expand(AssignmentExpression exp) {
        if      (exp.operator.literal ==  "="){'''«exp.varRef.expand» := «exp.expression.expand»'''}
        else if (exp.operator.literal == "+="){'''«exp.varRef.expand» := «exp.varRef.expand» + «exp.expression.expand»'''}
        else if (exp.operator.literal == "-="){'''«exp.varRef.expand» := «exp.varRef.expand» - «exp.expression.expand»'''}
        else if (exp.operator.literal == "*="){'''«exp.varRef.expand» := «exp.varRef.expand» * «exp.expression.expand»'''}
        else if (exp.operator.literal == "/="){'''«exp.varRef.expand» := «exp.varRef.expand» / «exp.expression.expand»'''}
        else if (exp.operator.literal == "%="){'''«exp.varRef.expand» := «exp.varRef.expand» mod «exp.expression.expand»'''}
        else if (exp.operator.literal == "<<="){'''«exp.varRef.expand» := «exp.varRef.expand» sla «exp.expression.expand»'''}
        else if (exp.operator.literal == ">>="){'''«exp.varRef.expand» := «exp.varRef.expand» sla «exp.expression.expand»'''}
        else if (exp.operator.literal == "&="){'''«exp.varRef.expand» := «exp.varRef.expand» and «exp.expression.expand»'''}
        else if (exp.operator.literal == "|="){'''«exp.varRef.expand» := «exp.varRef.expand» or «exp.expression.expand»'''}
   }

   // Expand a Element Reference Expression
   def dispatch expand(ElementReferenceExpression exp) {
   	'''«exp.reference.expand»'''
   }   

   // Expand all other instructions.
   def dispatch expand(InstructionStatement inst) {
    '''«inst.instruction.expand»'''
   }  
   
   // Expand a Variable Declaration, all internal signals have an "_local" at the end
   def dispatch expand(VariableDefinition vari) {
        if(vari.input || vari.output){
            '''«vari.name»_local'''
        }else if(vari.name.equals("RUNNING")){
            '''«vari.name»_local'''
        }else{
            '''«vari.name»'''
        }
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