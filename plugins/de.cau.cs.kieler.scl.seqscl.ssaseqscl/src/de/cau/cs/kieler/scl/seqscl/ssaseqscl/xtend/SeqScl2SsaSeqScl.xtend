package de.cau.cs.kieler.scl.seqscl.ssaseqscl.xtend

import com.google.inject.Guice
import com.google.common.collect.ImmutableList
import java.util.List
import javax.inject.Inject
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.VariableDefinition
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Assignment
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
import java.io.File
import de.cau.cs.kieler.scl.seqscl.ssaseqscl.SSAElement
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.SclFactory
import org.yakindu.sct.model.stext.stext.AssignmentOperator

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SeqScl2SsaSeqScl {
    
    val hmInputs = new HashMap<String,Integer>()
    val hmOutputs = new HashMap<String,Integer>()
    val hmLocals = new HashMap<String,Integer>()
    val hmAll = new HashMap<String,Integer>()
    
    extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions SCLBasicBlockExtensions = 
         Guice::createInjector().getInstance(typeof(SCLBasicBlockExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
            
    def doTransform (Program program, File modelFile) {
   
        getAllVariables(program.definitions, hmInputs, hmOutputs, hmLocals )
        
        hmAll.putAll(hmInputs)
        hmAll.putAll(hmOutputs)
        hmAll.putAll(hmLocals)
        
        val trans = doSSATransformation(program)
        
        return trans
        
    }

// !!! Outputs failure

    def doSSATransformation(Program program) { 
        
        val targetProgram = SCL.createProgram()

        targetProgram.setName(program.getName + "_ssa")
//        targetProgram.definitions.addAll(program.definitions.copyAll)
        //only copy inputs and outputs, all other variables will be changed
        program.definitions.forEach[ definition |
             
            if(definition.input){
                
                //Inputs are read only, so there are no SSA form needed
                targetProgram.definitions.add(definition.copy)
            
            }else if(definition.output){
                
                
//                val ssaIndex = hmAll.get(definition.name)// + 1
//                hmAll.put(definition.name,ssaIndex)
                
                val newSSAName = definition.name + "__" + 0
                targetProgram.definitions.add(definition.copy)
                targetProgram.getDefinitionByName(definition.name).setInput(false)
                targetProgram.getDefinitionByName(definition.name).name = newSSAName
                
                //output definition is also needed
                targetProgram.definitions.add(definition.copy)
                    
                //map Inputs to local Variables
//     !!! Inputs read only ??? Definition           
//                if(definition.input){
//                   //Create new Assignment statement
//                    val assignment = SCL.createAssignment()
//                    val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(newSSAName),
//                        targetProgram.getDefinitionByNameAsElemRef(definition.name))
//                    assignment.assignment = assignmentExp
//
//                    targetProgram.statements.add(assignment.createStatement) 
//                }      
            }
            else{
                if(definition.name.equals("GO")){
                    targetProgram.definitions.add(definition.copy)
                }else{
                    //it is not needed to create initial variables with __0 because
                    //every variable must be written before it could be read!!!
                    //val ssaIndex = hmAll.get(definition.name)
                    val newSSAName = definition.name + "__" + 0
                    //hmAll.put(definition.name,ssaIndex)  
                    //definition.name = newSSAName
                    targetProgram.definitions.add(definition.copy)
                    targetProgram.getDefinitionByName(definition.name).name = newSSAName
                }
            }
        ]
        
//        targetProgram.definitions.add(createVariableDefinition('GO__0', 'boolean'))
 
        program.statements.forEach[ stm |
           
            if(stm.assignment){
                val assignment = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram ,program)
                targetProgram.statements.add(assignment)
                                
            }else if(stm.conditional){                
                val conditionalSSAList = doConditionalSSA(((stm as InstructionStatement).instruction as Conditional), targetProgram, program )
                targetProgram.statements.addAll(conditionalSSAList)
            }
            //nothing to do with other types
        ]

        //Assign Outputs
        assingSSAVariableToOutput(targetProgram, program)
    
        //Assign all Pre Values
        assignSSAPreValues(targetProgram, program)
        
        return targetProgram  
    }
    
    def assignSSAPreValues(Program targetProgram, Program program) { 
        val stmList = createNewStatementList
        
        targetProgram.definitions.forEach[ definition |
            
            val defName = definition.name
            
            if(defName.contains("__0")){
                
                val hmKey = defName.subSequence(0,defName.indexOf("__")).toString
                val latestAssignment = getSSAVariableName(targetProgram, program, hmKey)
                
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(defName),
                    targetProgram.getDefinitionByNameAsElemRef(latestAssignment))
                assignment.assignment = assignmentExp

                stmList.add(assignment.createStatement)
            }
            
        ]
        
        targetProgram.statements.addAll(stmList)
    }

    
    def getSSAVariableName(Program targetProgram, Program program, String name){
        
        var newName = ""
        
        //Inputs are read only, there are no SSA variables
        if(program.getDefinitionByName(name).input){
            newName = name
        }else if(name.equals("GO")){
            newName = name
        }else{
           if(hmAll.get(name) == -1){
                newName = name + "__" + 0                     
           }else{
               newName = name + "__" + hmAll.get(name)
           }
        }
        
        return newName
    }
    
    def Statement doAssignmentSSA(Assignment ass, Program targetProgram, Program program) { 
        
        //Get variable name
        val assExp = ass.assignment as AssignmentExpression
        val elemRefExp = assExp.varRef as ElementReferenceExpression
        val vardef = elemRefExp.reference as VariableDefinition
                
        //Compute left Operator Expression
        val copyAssExp = assExp.copy
        if(!(copyAssExp.expression instanceof ElementReferenceExpression)){
            //set all variable usage in exp to new ssa variable
            copyAssExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[eRefExp |
                  val name = (eRefExp.reference as VariableDefinition).name
                  val newName = getSSAVariableName(targetProgram, program, name)
                  eRefExp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression
            val name = ((copyAssExp.expression as ElementReferenceExpression).reference as VariableDefinition).name
            val newName = getSSAVariableName(targetProgram, program, name)
            (copyAssExp.expression as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
        
        //Set newSSA index for left operator
        var int ssaIndexVarDef = hmAll.get(vardef.name)
        if(ssaIndexVarDef == -1){
            // if it is lower than 0 then only the preValue __0 exists
            //for the new Variable change index to 1
            ssaIndexVarDef = 1
        }else{
            //Index is higher 0, just take the next one
            ssaIndexVarDef = ssaIndexVarDef + 1
        }
        //save current index
        hmAll.put(vardef.name,ssaIndexVarDef)
        
        //create new variable with ssa index
        val ssaName = vardef.name + "__" + ssaIndexVarDef
        
        //if the index is 0, do not add a new definition because all __0 definitions are already added
        if(!(ssaIndexVarDef == 0)){
            targetProgram.definitions.add(createVariableDefinition(ssaName, 'boolean'))
        }
                
        //Create new Assignment statement
        val assignment = SCL.createAssignment()
        val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(ssaName),
            copyAssExp.expression)
        assignment.assignment = assignmentExp

        return assignment.createStatement    
    }

    def List<Statement> doConditionalSSA(Conditional cond, Program targetProgram, Program program) { 
       
       val returnList = createNewStatementList
       val condE = cond.expression
       val trueStms = cond.statements
       
       val condExp = condE.copy 
       //more than one ElementReferenceExpression
       if(!(condExp instanceof ElementReferenceExpression)){
            //set all variable usage in exp to new ssa variable
            condExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[exp |
                  val name = (exp.reference as VariableDefinition).name
                  //val newName = name + "__" + hmAll.get(name)
                  val newName = getSSAVariableName(targetProgram, program, name)                    
                  exp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression
            val name = ((condExp as ElementReferenceExpression).reference as VariableDefinition).name
            //val newName = name + "__" + hmAll.get(name)
            val newName = getSSAVariableName(targetProgram, program, name)
            (condExp as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
       
       //Safe Hashmap to see the changes which were made in the true case from the conditional
       val hmSave = new HashMap<String,Integer>()
       hmSave.putAll(hmAll)
       
       val newCond = SCL.createConditional
       trueStms.forEach[ stm | 
           val assStm = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram, program)
        
           newCond.statements.add(assStm)    
       ]       
       
       newCond.setExpression(condExp)       
       returnList.add(newCond.createStatement) 
       
       //Insert Phi function
       returnList.add(computePhiFunction(hmAll, hmSave, condExp.copy, targetProgram))
       
       returnList
    }
    
    //---------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------
    def Statement computePhiFunction(HashMap<String,Integer> currentHm, HashMap<String,Integer> oldHm, Expression conditionExpression, Program targetProgram) {
        
        val phiFunc = SCL.createConditional
        
        val tempDefinitions = targetProgram.definitions.copyAll
        val tempHm = new HashMap<String,Integer>()
        tempHm.putAll(currentHm)
        val alreadyChecked = new ArrayList<String>
        
        tempDefinitions.forEach[ definition |
            
            var hmKey = "" 
            
            val name = definition.name
            if(name.contains("__")){
                hmKey = name.subSequence(0,name.indexOf("__")).toString
            }else{
                hmKey = name
            }
                        
            var oldSSAIndex = oldHm.get(hmKey)
            var currentSSAIndex = tempHm.get(hmKey)
            
            if(!alreadyChecked.contains(hmKey)){
                if(oldSSAIndex < currentSSAIndex){
                    
                    alreadyChecked.add(hmKey)
                    
                    //createNewVariable
                    val int ssaIndex = currentSSAIndex + 1
                    currentHm.put(hmKey,ssaIndex)
                    val phiVariable = hmKey + "__" + ssaIndex
                    targetProgram.definitions.add(createVariableDefinition(phiVariable, 'boolean'))
                    
                    //If this variable was never assigned, then take pre value (__0)
                    if((oldSSAIndex == -1)){
                        oldSSAIndex = 0
                    }
                    
                    val truePhiAssignment = createSCLAssignment(targetProgram.getDefinitionByName(phiVariable),targetProgram.getDefinitionByName(hmKey + "__" + currentSSAIndex))
                    val falsePhiAssignment = createSCLAssignment(targetProgram.getDefinitionByName(phiVariable),targetProgram.getDefinitionByName(hmKey + "__" + oldSSAIndex))
                    
                    phiFunc.statements.add(truePhiAssignment.createStatement)
                    phiFunc.elseStatements.add(falsePhiAssignment.createStatement)
                    

                }
            }
        ]
        
        phiFunc.setExpression(conditionExpression)
        phiFunc.createStatement
        
    }

    //---------------------------------------------------------------------------------------------
    def assingSSAVariableToOutput(Program targetProgram, Program program) { 
        
        program.definitions.forEach[ definition |
            
            if(definition.output){
                
//                val lastIndex = hmAll.get(definition.name)
//                val ssaName = definition.name + "__" + lastIndex
                
                val ssaName = getSSAVariableName(targetProgram, program, definition.name)
                
                
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(definition.name),
                    targetProgram.getDefinitionByNameAsElemRef(ssaName))
                assignment.assignment = assignmentExp
                
                targetProgram.statements.add(assignment.createStatement)
            }
        ]
    }
    
    //---------------------------------------------------------------------------------------------
    def getAllVariables(EList<VariableDefinition> vars, HashMap hmInputs, HashMap hmOutputs, HashMap hmLocals ){
       
       vars.forEach[ variable | 
            if(variable.input)                      
                 hmInputs.put(variable.name, -1)
            if(variable.output)                   
                 hmOutputs.put(variable.name, -1)
            if(!(variable.input || variable.output))
                 hmLocals.put(variable.name, -1)
            ] 
    } 
   
    //---------------------------------------------------------------------------------------------
    def VariableDefinition getDefinitionByName(Program program, String name) {
        program.definitions.filter(e | e.getName() == name).head
    }
    
    //---------------------------------------------------------------------------------------------
    def ElementReferenceExpression getDefinitionByNameAsElemRef(Program program, String name) {
        val varRef = program.getDefinitionByName(name)
        val expression = SText.createElementReferenceExpression
        expression.setReference(varRef)
        expression        
    }
   
   
   
   
}