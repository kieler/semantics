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
        
        val trans = doSSATransformation(program, hmInputs, hmOutputs, hmLocals )
        
        getAllVariables(program.definitions, hmInputs, hmOutputs, hmLocals )
        
//        return program
        return trans
        
    }
    
    def doSSATransformation(Program program, HashMap hmInputs, HashMap hmOutputs, HashMap hmLocals) { 
        
        val targetProgram = SCL.createProgram()

        targetProgram.setName(program.getName + "_ssa")
//        targetProgram.definitions.addAll(program.definitions.copyAll)
        //only copy inputs and outputs, all other variables will be changed
        program.definitions.forEach[definition | 
            if(definition.input || definition.output){
                targetProgram.definitions.add(definition.copy)
            }
//            else{
                //it is not needed to create initial variables with __0 because
                //every variable must be written before it could be read!!!
//                val ssaIndex = hmAll.get(definition.name)
//                val newSSAName = definition.name + "__" + ssaIndex
//                hmAll.put(definition.name,ssaIndex)  
//                //definition.name = newSSAName
//                targetProgram.definitions.add(definition.copy)
//                targetProgram.getDefinitionByName(definition.name).name = newSSAName
//            }
        ]
        
        targetProgram.definitions.add(createVariableDefinition('GO__0', 'boolean'))
       
        
        program.statements.forEach[ stm |
            
//            targetProgram.statements.add(stm.copy)

            if(stm.assignment){
                val assignment = doSSA((stm as InstructionStatement).instruction as Assignment, targetProgram)
                targetProgram.statements.add(assignment)
                
//                val ass  = (stm as InstructionStatement).instruction as Assignment
//                val assExp = ass.assignment as AssignmentExpression
//                val elemRefExp = assExp.varRef as ElementReferenceExpression
//                val vardef = elemRefExp.reference as VariableDefinition
//                
//                val name = ((assExp.expression as ElementReferenceExpression).reference as VariableDefinition).name
//                
//                val int ssaIndex = hmAll.get(vardef.name) + 1
//                hmAll.put(vardef.name,ssaIndex)
//           
////                vardef.setName(vardef.name + "__" + ssaIndex)
//           
//                val ssaName = vardef.name + "__" + ssaIndex
//                targetProgram.definitions.add(createVariableDefinition(ssaName, 'boolean'))
//                
//                val temp = stm.copy
//                val t = ((((temp as InstructionStatement).instruction as Assignment).assignment) as AssignmentExpression)
//               
//               val ssaName2 = name + "__" + hmAll.get(name)
//               
//               val assignment = createSCLAssignment(
//                    targetProgram.getDefinitionByName(ssaName),
//                    targetProgram.getDefinitionByName(ssaName2)              
//                ).createStatement
//               
////                val assignment = createSCLAssignment(
////                    createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(ssaName),
////                        targetProgram.getDefinitionByNameAsElemRef(ssaName) as Expression
////                    ),
////                    program.getDefinitionByName(ssaName)              
////                ).createStatement
////                
//                targetProgram.statements.add(assignment)
                
       
//               
////                targetProgram.statements.add(stm.copy) 
//                               
//                val temp4 = SText.createElementReferenceExpression()  as Expression
//                (temp4 as ElementReferenceExpression).setReference(vardef)
//                
//        //        val temp4 = SclFactory::eINSTANCE.createAssignment()
//        //        temp4.setAssignment(createAssignmentExpression(temp2,temp.expression))
//        //        
//        //        targetProgram.statements.add(createStatement(temp4) )
//                
//                val stmList = createNewStatementList
//                stmList.add(createSCLAssignment(createAssignmentExpression(elemRefExp,assExp.expression),vardef).createStatement)
//               
//                targetProgram.statements.addAll(stmList)
                
            }else if(stm.conditional){
                //doSSAtoConditional(stm as Conditional)
            }
            //nothing to do with other types
            
        ]

        return targetProgram
        
    }
    
    def Statement doSSA(Assignment ass, Program targetProgram) { 
        
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
                  val newName = name + "__" + hmAll.get(name)   
                  targetProgram.definitions.add(createVariableDefinition(newName, 'boolean'))
                  
                  eRefExp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression
            val name = ((copyAssExp.expression as ElementReferenceExpression).reference as VariableDefinition).name
            val newName = name + "__" + hmAll.get(name)
            (copyAssExp.expression as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
        
        //Set newSSA index for left operator
        val int ssaIndexVarDaf = hmAll.get(vardef.name) + 1
        hmAll.put(vardef.name,ssaIndexVarDaf)
        
        //create new variable with ssa index
        val ssaName = vardef.name + "__" + ssaIndexVarDaf
        targetProgram.definitions.add(createVariableDefinition(ssaName, 'boolean'))
                
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
   
    
    def void doSSAtoConditional(Conditional cond) { 
        
    }
    
   def getAllVariables(EList<VariableDefinition> vars, HashMap hmInputs, HashMap hmOutputs, HashMap hmLocals ){
       
       vars.forEach[ variable | 
            if(variable.input)                      
                 hmInputs.put(variable.name, 0)
            if(variable.output)                   
                 hmOutputs.put(variable.name, 0)
            if(!(variable.input || variable.output))
                 hmLocals.put(variable.name, 0)
            ] 
   } 
   
   
   
   
   
}