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
//import org.yakindu.sct.model.stext.stext.ConditionalExpression
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
//import org.yakindu.sct.model.stext.stext.AdditiveOperator

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
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.HashMap

import org.yakindu.sct.model.stext.stext.AssignmentOperator

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
        
        //adds the workaround to reset regsters
        addRegisterResetToModel(program)
        
        //to use the register reset workaround, all _pre's must be replaced by _reg's
        replacePreByReg(program)
        
        //get the name for vhdl component from file name
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
   
   // all occurences of _pre variables on the left side of an expression must be replaced by the register output
    // _reg
    def replacePreByReg(Program program) { 
          
        //search in all instruction for an _pre on the left sida of an assignment an replaced it
        // with the _reg variable
        program.statements.forEach[ instr |
            if((instr.isAssignment )){
                val assExp = (((instr.instruction as Assignment).assignment)as AssignmentExpression)
                val varName = (((assExp.varRef as ElementReferenceExpression).reference) as VariableDefinition).name
                if(varName.contains("_pre")){
                    val newVarName = (varName.subSequence(0, varName.lastIndexOf("_pre")).toString) + "_reg"
                    
                    assExp.varRef = program.getDefinitionByNameAsElemRef(newVarName)                    
                }      
            }
        ] 
    }

    // add register reset workaround to SCL Model
    // register could not be reseted with the reset signals which also starts the transformed SCChart
    // that results in register which always outputs false
    // therefore create a reset bypass with an multiplexer, it bypasses the reset value (normaly false)
    // around the register when the reset is present, otherwise the Mux put out the register value
    def addRegisterResetToModel(Program program) { 
        
        // The register reset workaround results in an SCL conditional
        // e.g: O_reg = RESET ? false : O_pre
        val newStms = new ArrayList<Statement>
        val newElseStms = new ArrayList<Statement>
        
        val newCond = SCL.createConditional
        //Reset is the conditionals expression
        val condExp = SCLExpressionExtensions.createElementReferenceExpression(program.getDefinitionByName("RESET"))
        newCond.setExpression(condExp)
        
        // The register reset workaround is needed for all variables which contains a _pre
        // because they will be registers later
        val allPreDefs = new ArrayList<VariableDefinition> 
        program.definitions.forEach[ definition  | if(definition.name.contains("_pre")) allPreDefs.add(definition.copy)  ]
        
        //add a _reg variable for each _pre variable to the model definition
        allPreDefs.forEach[ definition | 
            val name = definition.name.subSequence(0, definition.name.lastIndexOf("_pre")).toString + "_reg"
//            val type = definition.type.name
            program.definitions.add(createVariableDefinition(name, "boolean"))
        ]
  
        //
        allPreDefs.forEach[ definition | 
//          BUG 383373, is already fixed in newer xtend versions         
//          var assignmentExp = createAssignmentExpression(program.getDefinitionByNameAsElemRef(definition.name),
//                  SText.createBoolLiteral.setValue(false) as Expression)

            //create the false assignment if the reset take place
            // e.g: O1_pre = false
            val newAssignment1 = SCL.createAssignment()
            var assignmentExp = SText.createAssignmentExpression()
            assignmentExp.setVarRef(program.getDefinitionByNameAsElemRef(definition.name))
            assignmentExp.setOperator(AssignmentOperator::ASSIGN)
            val bool = SText.createBoolLiteral
            bool.setValue(false)
            val primValExp = SText.createPrimitiveValueExpression
            primValExp.setValue(bool)
            assignmentExp.setExpression(primValExp)
            newAssignment1.assignment = assignmentExp
            newStms.add(newAssignment1.createStatement)
            
            // create the assignment if the reset doesn't take place
            // e.g: O1_pre = O1_reg
            val newAssignment = SCL.createAssignment()
            newAssignment.assignment = createAssignmentExpression(program.getDefinitionByNameAsElemRef
                (definition.name), program.getDefinitionByNameAsElemRef(definition.name.subSequence
                    (0, definition.name.lastIndexOf("_pre")).toString + "_reg"))
            newElseStms.add(newAssignment.createStatement)
        ]
        
        //build the conditional
        // add the reset assignment
        newCond.statements.addAll(newStms)
        //add the normal assignment
        newCond.elseStatements.addAll(newElseStms)
        
        // The reset workaround must be placed at at the beginning of the SCL Model
        // to keep the sequential SW program flow, in HW it doesen't matter where to place
        val allStms = new ArrayList<Statement>
        allStms.add(newCond.createStatement)
        allStms.addAll(program.statements.copyAll)

        //add the new statement list to the program
        program.statements.clear
        program.statements.addAll(allStms)
    }
    
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
     
    // input, output and local variables from model
    val modelInputs = new ArrayList<Variables>
    val modelOutputs = new ArrayList<Variables>
    val modelLocalVariables = new ArrayList<Variables>
        
    val name = modelname
    val vars = program.definitions
    val newVariables = new ArrayList<VariableDefinition>
    
    //
    vars.forEach[ variable |        
        if(variable.input && variable.output){
            
            val vari = variable.copy 
            vari.setInput(false)
            vari.name = vari.name + "_out"
            modelOutputs.add(createVariableFromModel(vari, true, false))
            newVariables.add(vari)
            
            modelInputs.add(createVariableFromModel(variable, true, true))
        }
        else if(variable.input)                      
             modelInputs.add(createVariableFromModel(variable, true, false)) 
        else if(variable.output)                   
             modelOutputs.add(createVariableFromModel(variable, false, true)) 
        else if(!(variable.input || variable.output))
            if(!variable.name.equals("RESET"))
                modelLocalVariables.add(createVariableFromModel(variable, false, false)) 
        ]
        program.definitions.addAll(newVariables)     
    
    
    //The main vhdl code generation
    // at first: create the entity
    // then generate architecture which includes all needed local signals, the main functionality 
    // and all needed registers
    '''
    «generateEntity(modelInputs, modelOutputs, name)»
    
    ARCHITECTURE behavior OF «name» IS
    
    --local signals
    «genarateLocalSignals(modelLocalVariables)»
    «addLocalSignalsForInputs(program.definitions)»
    
    begin
        -- -------------------------
        -- main program
        -- -------------------------
        «generateMainProcess(program.statements,program)»
        
        -- -------------------------
        -- registers
        -- -------------------------
        «generateRegister()»
        
        «generateInputRegister(program.definitions)»
        
    end behavior;
    '''
   }
   
    // generates local signals for the argument
    def genarateLocalSignals(ArrayList<Variables> variables) { 
        
        val localVar = variables.map(lVar | '''«generateVhdlSignalFromVariableWithInitialValue(lVar,"")»''').join('\n')
        
        //else must be an empty String, when not null is written into the file
        if(!(localVar.nullOrEmpty))
            return localVar + '\n'
        else 
            return ''''''
    }
    
    // an internal signal as needed for every input register,
    // to pass the value from the register to the logic
    def addLocalSignalsForInputs(EList<VariableDefinition> variables) { 
        
        //Get all inputs
        val inVars = variables.filter[ vari | vari.input ]
        
        //generate signal vhdl code
        var vhdlCode = inVars.map[vari | '''signal «vari.name»_int : boolean := false;''' ].join('\n')
        
        // every SCCHart has a RESET signal
        return vhdlCode = vhdlCode + '\n' + "signal Reset_int : boolean := false;" + '\n'
    }
    
    //generates the main functionality vhdl code
    def generateMainProcess(EList<Statement> stmList, Program program) { 
        
        vhdlCode = ''''''
        
        //for every stm create vhdl code
        vhdlCode = stmList.map[stm | 
            
            //if it is an assignment, create vhdl assignment
            if(stm.assignment){
                val instr = stm.getInstruction 
                val ass = instr as Assignment
                '''«(ass).transformAssignmentToVHDL(program)»'''
            }
            //if is is a conditional, expand the code to an vhdl code fragment
            else if(stm.conditional){
                '''«stm.expand»'''
            }
        ].join('\n')
        
        return vhdlCode
    }

    // Generates the pause and output registers
    def generateRegister() { 

    //for every element in the register list the vhdl code for a register is created
    '''
        register: process
        begin
        wait until rising_edge(tick);
           «ffList.map[ instr | 
                val varleft = (((instr.instruction.asAssignment.assignment as 
                    AssignmentExpression).varRef as ElementReferenceExpression).reference) 
                    as VariableDefinition
                val varright = (((instr.instruction.asAssignment.assignment as 
                    AssignmentExpression).expression as ElementReferenceExpression).reference) 
                    as VariableDefinition
                
                '''«varleft.name» <= «varright.name»;'''
           ].join('\n')»
        end process;
    '''  
    }

    // Generate input register
   // the inputs signals must be stable during a tick period
    def generateInputRegister(EList<VariableDefinition> variables) { 
        
        //get all input variables
        val inVars = variables.filter[ vari | vari.input ]
        
        //generate the input register vhdl code
        var vhdlCode = '''
            inputRegister: process
            begin
            wait until rising_edge(tick);
               «inVars.map[ vari | 
                    '''«vari.name»_int <= «vari.name»;'''
               ].join('\n')»
        '''
        //every SCCHart has a reset variable, the reset must also be stored
        return vhdlCode = vhdlCode + '''   Reset_int <= RESET;''' + '\n' + '''end process;'''
    }
    
    // transform assignemts to vhdl code
    def transformAssignmentToVHDL(Assignment assignment,Program program) { 
        
        var vhdlCode = ''''''
        
        //Get variable name
        val assExp = assignment.assignment as AssignmentExpression
        val elemRefExp = assExp.varRef as ElementReferenceExpression
        val vardef = elemRefExp.reference as VariableDefinition
        val varName = vardef.name
        
        if(varName.endsWith("_reg")){
            //it is a register assignment, for this assignment a register will be created later
            ffList.add(assignment.copy.createStatement)
            vhdlCode = "--Assignment transformed to a register"
        }else{
            // for all other stm crate a vhdl assignment
            var leftVar = ""
            var rightVar = ''''''
            
            // get left operator vhdl code
            if(vardef.input && vardef.output){
                //if it is an input output variable, than the value should be assigned to the output
                leftVar = vardef.name + "_out"
            }else if(vardef.name == "RESET"){
                //if it is the local Reset signal, than use the register value from the RESET
                leftVar = vardef.name + "_int"
            }else{
                //else take the variable name
                leftVar = vardef.name
            }
            
            //get the vhdl code for the right operator
            if(!(assExp.expression instanceof ElementReferenceExpression)){
                // if it is an complex assignment, expand it
                 rightVar = assExp.expression.expand
            }else{ 
                // if it is only a variable, create vhdl code for this one
                val vari = ((assExp.expression as ElementReferenceExpression).reference as VariableDefinition)
                if(vari.input || (vari.input && vari.output)){
                    //if it is an input or an input output take the register value from this input/input output
                    rightVar = vari.name + "_int"
                }else if(vari.name.equals("RESET")){
                    //do the same to the reset, take the register reset value 
                    rightVar = vari.name + "_int"
                 }else{
                   // for all other variables take the name
                   rightVar = vari.name
                }
            }
            // create the vhdl assignment
            vhdlCode = leftVar + " <= " + rightVar + ";" 
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

      val conditionString = cond.expression.expand
      
      // create a Hashmap which contains the left hand variable name from the assignment as key and the right hand expression as value
      // this is needed because we must find the corresponding else-case assignment
      val trueCaseHm = new HashMap<String, Expression>
      cond.statements.forEach[ stm | 
          val vari = ((((stm.instruction.asAssignment.assignment as AssignmentExpression).varRef) as ElementReferenceExpression).reference) as VariableDefinition
          val exp =  (stm.instruction.asAssignment.assignment as AssignmentExpression).expression.copy
          trueCaseHm.put(vari.name, exp)
      ]
      // create the conditional assignment
      // e.g: if(g3) B = true else end if; will be transformed to
      //      B <= true WHEN g3 ELSE B_pre
      // we need the true assignment (B=true) from true case and the other case from the else case
      var vhdlCode = cond.elseStatements.map[ stm |
          val vari = ((((stm.instruction.asAssignment.assignment as AssignmentExpression).varRef) as ElementReferenceExpression).reference) as VariableDefinition
          val falseExp =  (stm.instruction.asAssignment.assignment as AssignmentExpression).expression.copy
          val trueExp = trueCaseHm.get(vari.name)
          trueCaseHm.remove(vari.name)
          
          if(trueExp != null){
              '''«vari.name» <= «trueExp.expand» WHEN «conditionString» ELSE «falseExp.expand»;'''
          }else{
              //No matching true expression, transform only false case
              '''«vari.name» <= «falseExp.expand» WHEN not «conditionString»»;'''
          }    
              
      ].join('\n')

       //If there are any assignments left in true case? then there where no corresponding statement
          if(!trueCaseHm.empty){
              vhdlCode = vhdlCode + '''assignment left'''
             
              // should not take place, because there are phi functions the always contain an assignment
              // in both cases to the same variable   
          }
       
      return vhdlCode      
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
        
        if(vari.input && vari.output) return vari.name + "_int" 
        else if(vari.input) return vari.name + "_int"  
        else if(vari.name == "RESET") return vari.name + "_int"
        else return vari.name
//        vari.name
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
   
    // --------------------------------------------------------------------------------------------
    // F R O M   S T E V E N   = >  A D D   T O   E X T E N S I O N S
    //---------------------------------------------------------------------------------------------
    def VariableDefinition getDefinitionByName(Program program, String name) {
        program.definitions.filter(e | e.getName() == name).head
    }
    
    // --------------------------------------------------------------------------------------------
    // F R O M   S T E V E N   = >  A D D   T O   E X T E N S I O N S
    //---------------------------------------------------------------------------------------------
    def ElementReferenceExpression getDefinitionByNameAsElemRef(Program program, String name) {
        val varRef = program.getDefinitionByName(name)
        val expression = SText.createElementReferenceExpression
        expression.setReference(varRef)
        expression        
    }
}