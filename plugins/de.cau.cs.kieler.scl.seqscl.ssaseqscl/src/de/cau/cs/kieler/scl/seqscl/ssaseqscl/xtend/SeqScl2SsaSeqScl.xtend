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
    String newName
    
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
        
        val trans = doSSATransformation(program, hmInputs, hmOutputs, hmLocals )
        
        getAllVariables(program.definitions, hmInputs, hmOutputs, hmLocals )
        
//        return program
        return trans
        
    }

// !!! Outputs failure

    
    def doSSATransformation(Program program, HashMap hmInputs, HashMap hmOutputs, HashMap hmLocals) { 
        
        val targetProgram = SCL.createProgram()

        targetProgram.setName(program.getName + "_ssa")
//        targetProgram.definitions.addAll(program.definitions.copyAll)
        //only copy inputs and outputs, all other variables will be changed
        program.definitions.forEach[ definition | 
            if(definition.input || definition.output){
                
                val ssaIndex = hmAll.get(definition.name) + 1
                hmAll.put(definition.name,ssaIndex)
                
                val newSSAName = definition.name + "__" + ssaIndex
                targetProgram.definitions.add(definition.copy)
                targetProgram.getDefinitionByName(definition.name).setInput(false)
                targetProgram.getDefinitionByName(definition.name).name = newSSAName
                 
                targetProgram.definitions.add(definition.copy)
                
                //map Inputs to local Variables
//     !!! Inputs read only ??? Definition           
                if(definition.input){
                   //Create new Assignment statement
                    val assignment = SCL.createAssignment()
                    val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(newSSAName),
                        targetProgram.getDefinitionByNameAsElemRef(definition.name))
                    assignment.assignment = assignmentExp

                    

                    targetProgram.statements.add(assignment.createStatement) 
                }      
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
            
//            targetProgram.statements.add(stm.copy)

            if(stm.assignment){
                val assignment = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram)
                targetProgram.statements.add(assignment)
                                
            }else if(stm.conditional){
                //doSSAtoConditional(stm as Conditional)
                
                val conditionalSSAList = doConditionalSSA(((stm as InstructionStatement).instruction as Conditional), targetProgram )
                targetProgram.statements.addAll(conditionalSSAList)
            }
            //nothing to do with other types
        ]

        //Assign Outputs
        assingSSAVariableToOutput(targetProgram, program)


        return targetProgram
        
    }
    
    def assingSSAVariableToOutput(Program targetProgram, Program program) { 
        
        val tempProgram = targetProgram.copy
        
        program.definitions.forEach[ definition |
            if(definition.output){
                
                val lastIndex = hmAll.get(definition.name)
                val ssaName = definition.name + "__" + lastIndex
                
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(definition.name),
                    targetProgram.getDefinitionByNameAsElemRef(ssaName))
                assignment.assignment = assignmentExp
                
                targetProgram.statements.add(assignment.createStatement)
            }
        ]
        
        
        
    }



    
    def Statement doAssignmentSSA(Assignment ass, Program targetProgram) { 
        
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
                  if(name.equals("GO")){
                    newName = name
                  }else{
                      if(hmAll.get(name) == -1){
                            newName = name + "__" + 0                     
                      }else{
                          newName = name + "__" + hmAll.get(name)
                      }
                  }
                  eRefExp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression
            val name = ((copyAssExp.expression as ElementReferenceExpression).reference as VariableDefinition).name
            if(name.equals("GO")){
                    newName = name
            }else{
              if(hmAll.get(name) == -1){
                        newName = name + "__" + 0                     
                  }else{
                      newName = name + "__" + hmAll.get(name)
                  }                     
            }
            (copyAssExp.expression as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
        
        //Set newSSA index for left operator
        val int ssaIndexVarDaf = hmAll.get(vardef.name) + 1
        hmAll.put(vardef.name,ssaIndexVarDaf)
        
        //create new variable with ssa index
        val ssaName = vardef.name + "__" + ssaIndexVarDaf
        
        //if the index is 0, do not add a new definition because all 0 definitions are already added
        if(!(ssaIndexVarDaf == 0)){
            targetProgram.definitions.add(createVariableDefinition(ssaName, 'boolean'))
        }
                
        //Create new Assignment statement
        val assignment = SCL.createAssignment()
        val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(ssaName),
            copyAssExp.expression)
        assignment.assignment = assignmentExp

        return assignment.createStatement    
    }
  
    def VariableDefinition getDefinitionByName(Program program, String name) {
        program.definitions.filter(e | e.getName() == name).head
    }
    
    def ElementReferenceExpression getDefinitionByNameAsElemRef(Program program, String name) {
        val varRef = program.getDefinitionByName(name)
        val expression = SText.createElementReferenceExpression
        expression.setReference(varRef)
        expression        
    }
   
    
    def List<Statement> doConditionalSSA(Conditional cond, Program targetProgram) { 
       
       val returnList = createNewStatementList
       val condE = cond.expression
       val trueStms = cond.statements
       
       val condExp = condE.copy 
       if(!(condExp instanceof ElementReferenceExpression)){
            //set all variable usage in exp to new ssa variable
            condExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[exp |
                  val name = (exp.reference as VariableDefinition).name
                  //val newName = name + "__" + hmAll.get(name)
                  if(name.equals("GO")){
                    newName = name
                  }else{
                        if(hmAll.get(name) == -1){
                            newName = name + "__" + 0                     
                         }else{
                             newName = name + "__" + hmAll.get(name)
                         }                     
                  }                    
                  exp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression
            val name = ((condExp as ElementReferenceExpression).reference as VariableDefinition).name
            //val newName = name + "__" + hmAll.get(name)
            if(name.equals("GO")){
              newName = name
            }else{
                if(hmAll.get(name) == -1){
                    newName = name + "__" + 0                     
                }else{
                    newName = name + "__" + hmAll.get(name)
                }                     
            }
            (condExp as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
       
       //Safe Hashmap to see the changes which was made in the true case from the conditional
       val hmSave = new HashMap<String,Integer>()
       hmSave.putAll(hmAll)
       
       val newCond = SCL.createConditional
       trueStms.forEach[ stm | 
           val assStm = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram)
        
           newCond.statements.add(assStm)    
       ]       
       
       newCond.setExpression(condExp)       
       returnList.add(newCond.createStatement) 
       
       //Insert Phi function here
       returnList.add(computePhiFunction(hmAll, hmSave, condExp.copy, targetProgram))
       
       returnList
    }
    
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
                        
            val oldSSAIndex = oldHm.get(hmKey)
            val currentSSAIndex = tempHm.get(hmKey)
            
            if(!alreadyChecked.contains(hmKey)){
                if(oldSSAIndex < currentSSAIndex){
                
                alreadyChecked.add(hmKey)
                //new Assignment, SSA variable has changed
                
                //createNesVariable
                val int ssaIndex = currentHm.get(hmKey) + 1
                currentHm.put(hmKey,ssaIndex)
                val phiVariable = hmKey + "__" + ssaIndex
                targetProgram.definitions.add(createVariableDefinition(phiVariable, 'boolean'))
                
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
   
   
   
   
   
}