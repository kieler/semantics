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
    
//    val hmInputs = new HashMap<String,Integer>()
//    val hmOutputs = new HashMap<String,Integer>()
//    val hmLocals = new HashMap<String,Integer>()
    val hmAll = new HashMap<String,Integer>()
    
    extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
//    extension de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions SCLBasicBlockExtensions = 
//         Guice::createInjector().getInstance(typeof(SCLBasicBlockExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
    
    //---------------------------------------------------------------------------------------------      
    def doTransform (Program program, File modelFile) {
   
        //Get the Hashmap to store the current SSA index for every variable
        getSSAIndexHashmap(program.definitions)
        
        //Do SSA Transformation
        return doSSATransformation(program) 
    }

    //---------------------------------------------------------------------------------------------
    def doSSATransformation(Program program) { 
        
        //the new SSA SCL Program       
        val targetProgram = SCL.createProgram()

        //set the program name
        targetProgram.setName(program.getName + "_ssa")

        //add all definitions from the curretn program to the target program, respectively to their usage
        targetProgram.setAlldefinitions(program)
 
        //transform all statements to an SSA form
        program.statements.forEach[ stm |
           //the seqSCL Version only contains assignment and conditionals
           
            if(stm.assignment){
                val assignment = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram ,program)
                targetProgram.statements.add(assignment)
                                
            }else if(stm.conditional){                
                val conditionalSSAList = doConditionalSSA(((stm as InstructionStatement).instruction as Conditional), targetProgram, program )
                targetProgram.statements.addAll(conditionalSSAList)
            }
            //nothing to do with other types, because there are no other types
        ]

        //Assign all Pre Values
        assignSSAPreValues(targetProgram, program)
        
        //Assign Outputs
        assingSSAVariableToOutput(targetProgram, program)
        
        return targetProgram
    }
    
    //---------------------------------------------------------------------------------------------
    //copy all definitions from the original program to the target program according to the new use case
    def setAlldefinitions(Program targetProgram, Program program) {
        
        //add all variables
        program.definitions.forEach[ definition |
             
            if(definition.input){
                
                //Inputs are read only, so there are no SSA form needed
                targetProgram.definitions.add(definition.copy)
            
            }else if(definition.output){
                
                //add a pre version from all outputs, because all outputs will
                //get a feedback loop in hardware
                val newSSAName = definition.name + "__" + 0
                targetProgram.definitions.add(definition.copy)
                targetProgram.getDefinitionByName(definition.name).setOutput(false)
                targetProgram.getDefinitionByName(definition.name).name = newSSAName
                
                //original output definition is also needed
                //that will be the hardware output pin
                targetProgram.definitions.add(definition.copy)      
            }
            else{
                if(definition.name.equals("GO")){
                    //add the initial GO, in hardware it will be used as input
                    targetProgram.definitions.add(definition.copy)
                }else{
                    //local variables
                    // all local variables are copied as a pre value, because
                    // every assignment creates a new SSA variable, so only pre value are needed
                    // can be optimized, add only pre values that are needed, that means pre values
                    // are needed if a variable is read before it was written
                    //do this in assignment method
                    
// compute only needed __0
//                    val newSSAName = definition.name + "__" + 0
//                    targetProgram.definitions.add(definition.copy)
//                    targetProgram.getDefinitionByName(definition.name).name = newSSAName
                }
            }
        ]
    }

    
    //---------------------------------------------------------------------------------------------
    //at the end of the program all pre values must be assigned with the latest assignment
    def assignSSAPreValues(Program targetProgram, Program program) { 
        
        val stmList = createNewStatementList
        
        //create an assignment for every definition that has a '__0'
        targetProgram.definitions.forEach[ definition |
            
            val defName = definition.name
            
            if(defName.contains("__0")){
                
                //get the hashmap key, the key has no '__' extension
                val hmKey = defName.subSequence(0,defName.indexOf("__")).toString
                
                //get the latest assingment
                val latestAssignment = getSSAVariableName(targetProgram, program, hmKey)
                
                //assign the latest assignment to the pre value ('__0')
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(defName),
                    targetProgram.getDefinitionByNameAsElemRef(latestAssignment))
                assignment.assignment = assignmentExp

                //add the assignment to the List
                stmList.add(assignment.createStatement)
            }  
        ]
        
        //add all assignments to the target program
        targetProgram.statements.addAll(stmList)
    }

    //---------------------------------------------------------------------------------------------
    //returns the SSA name of the last assignment
    def getSSAVariableName(Program targetProgram, Program program, String name){
        
        var newName = ""
        
        //Inputs are read only, there are no SSA variables
        if(program.getDefinitionByName(name).input){
            newName = name
        }else if(name.equals("GO")){
            newName = name
        }else{
           //if the ssa index still -1 then there was no assignment until now, return the pre variable
           if(hmAll.get(name) == -1){
               newName = name + "__" + 0
// !!!!!
                val temp = targetProgram.getDefinitionByName(newName)
               if( temp == null){
                    targetProgram.definitions.add(createVariableDefinition(newName, 'boolean'))
                    hmAll.put(name,0) 
               }
// !!!!!                   
           }else{
               //return the last assignment
               newName = name + "__" + hmAll.get(name)
           }
        }
        
        return newName
    }
    
    //---------------------------------------------------------------------------------------------
    // compute all SSA variables that are used in assignments
    // eg: g0 = g1 || g2
    // for g0 a new SSA variable will be created with the next highest index
    // for g1 and g2 the latest SSA index will be looked up and used
    def Statement doAssignmentSSA(Assignment ass, Program targetProgram, Program program) { 
        
        //Get variable name
        val assExp = ass.assignment as AssignmentExpression
        val elemRefExp = assExp.varRef as ElementReferenceExpression
        val vardef = elemRefExp.reference as VariableDefinition
        
        // --------------------------------------        
        // Compute left Operator Expression
        // a new SSA variable will be created
        // --------------------------------------
        
        //get last SSA index
        var int ssaIndexVarDef = hmAll.get(vardef.name)
        if(ssaIndexVarDef == -1){
            // if the index is lower than 0 than only the preValue __0 exists
            // for the new Variable change index to 1
            ssaIndexVarDef = 1
        }else{
            //Index is higher 0, just take the next higher one
            ssaIndexVarDef = ssaIndexVarDef + 1
        }
        
        //save current index
//        hmAll.put(vardef.name,ssaIndexVarDef)
        
        //create new variable with ssa index
        val ssaName = vardef.name + "__" + ssaIndexVarDef
        
        //if the index is 0, do not add a new definition because all __0 definitions are already added
        //can be optimized (!)
  //      if(!(ssaIndexVarDef == 0)){
            targetProgram.definitions.add(createVariableDefinition(ssaName, 'boolean'))
  //      }
          
        // --------------------------------------        
        // Compute right Operator Expression
        // --------------------------------------
        val copyAssExp = assExp.copy
        //if there are more then only a variable reference, than transform all
        //used variable references in the right operand
        if(!(copyAssExp.expression instanceof ElementReferenceExpression)){
            
            //set all variable usages in the right operand to new SSA variable
            copyAssExp.expression.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[eRefExp |
                  val name = (eRefExp.reference as VariableDefinition).name
                  val newName = getSSAVariableName(targetProgram, program, name)
                  eRefExp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //right operator is only a variable expression, set this one to the current SSA index
            val name = ((copyAssExp.expression as ElementReferenceExpression).reference as VariableDefinition).name
            val newName = getSSAVariableName(targetProgram, program, name)
            (copyAssExp.expression as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
           
        //save current index here, because g2 = g2 || true should result in g2__1 = g2__0 || true
        //if you assign it earlier it results in g2__1 = g2__1 || true that is false
        hmAll.put(vardef.name,ssaIndexVarDef)   
           
        //Create new Assignment statement
        val assignment = SCL.createAssignment()
        val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(ssaName),
            copyAssExp.expression)
        assignment.assignment = assignmentExp

        return assignment.createStatement    
    }

    //---------------------------------------------------------------------------------------------^
    // transform conditional and compute phi function
    def List<Statement> doConditionalSSA(Conditional cond, Program targetProgram, Program program) { 
       
       val returnList = createNewStatementList
       val trueStms = cond.statements
       
       //transform the condition expression
       val condExp = cond.expression.copy 
       //more than one ElementReferenceExpression
       if(!(condExp instanceof ElementReferenceExpression)){
           
            //set all variable usages in the condition expression to the latest SSA variable
            condExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[exp |
                  val name = (exp.reference as VariableDefinition).name
                  val newName = getSSAVariableName(targetProgram, program, name)                    
                  exp.reference = targetProgram.getDefinitionByName(newName)
            ]
        }else{ //conditional expression has only one variable expression
            val name = ((condExp as ElementReferenceExpression).reference as VariableDefinition).name
            val newName = getSSAVariableName(targetProgram, program, name)
            (condExp as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(newName)
        }
       
       //Safe Hashmap to see the changes which were made in the true case from the conditional
       val hmSave = new HashMap<String,Integer>()
       hmSave.putAll(hmAll)
       
       // create new conditional, the condition is the same as in the old one
       val newCond = SCL.createConditional
       newCond.setExpression(condExp) 
       
       // transform all assignments from the true case
       // until now (!): only assignments exists in true case, no other statements
       trueStms.forEach[ stm | 
            val assStm = doAssignmentSSA((stm as InstructionStatement).instruction as Assignment, targetProgram, program)
            
            //Add transformed assignment to the new SSA conditional
            newCond.statements.add(assStm)    
       ]       
       
        //add the new SSA conditional the the return statement list
        returnList.add(newCond.createStatement) 
       
       // compute Phi function
       returnList.add(computePhiFunction(hmAll, hmSave, condExp.copy, targetProgram))
       
       returnList
    }
    
    //---------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------
    //Computes the Phi Function (that is a conditional)
    def Statement computePhiFunction(HashMap<String,Integer> currentHm, HashMap<String,Integer> oldHm, Expression conditionExpression, Program targetProgram) {
        
        val phiFunc = SCL.createConditional
        
        //The phi function has the same condition as the predecessor conditional
        phiFunc.setExpression(conditionExpression)
        
        // maka a copy from all definitions, becuase this function adds new definitions
        val tempDefinitions = targetProgram.definitions.copyAll
        
        //copy current hashmap, because the original hashmap will be changesd in this function
        val tempHm = new HashMap<String,Integer>()
        tempHm.putAll(currentHm)
        
        //Variables could be assign more than one time in the true statement sequence,
        //so only compute one phi function for one all assignments 
        val alreadyChecked = new ArrayList<String>
        
        //check, for which variables a phi function must be computed  
        tempDefinitions.forEach[ definition |
            
            //Compute hashmap key, the hashmap key is the variable name without '__' extension
            var hmKey = "" 
            val name = definition.name
            if(name.contains("__")){
                hmKey = name.subSequence(0,name.indexOf("__")).toString
            }else{
                //if it contains no '__' then it is an input/output variable
                hmKey = name
            }
                        
            var oldSSAIndex = oldHm.get(hmKey)
            var currentSSAIndex = tempHm.get(hmKey)
            
            //if there are two different SSA index to the same variable, a phi function must be create
            if(!alreadyChecked.contains(hmKey)){
                if(oldSSAIndex < currentSSAIndex){
                    
                    //add current hashmap key to the visited ones
                    alreadyChecked.add(hmKey)
                    
                    //create new variable
                    val int ssaIndex = currentSSAIndex + 1
                    currentHm.put(hmKey,ssaIndex)
                    val phiVariable = hmKey + "__" + ssaIndex
                    targetProgram.definitions.add(createVariableDefinition(phiVariable, 'boolean'))
                    
                    //If this variable was never assigned, then take pre value (__0)
                    if((oldSSAIndex == -1)){
                        oldSSAIndex = 0
                    }
                    
                    //create the to possible assignments from the phi function
                    val truePhiAssignment = createSCLAssignment(targetProgram.getDefinitionByName(phiVariable),targetProgram.getDefinitionByName(hmKey + "__" + currentSSAIndex))
                    val falsePhiAssignment = createSCLAssignment(targetProgram.getDefinitionByName(phiVariable),targetProgram.getDefinitionByName(hmKey + "__" + oldSSAIndex))
                    
                    //add them to the conditional
                    phiFunc.statements.add(truePhiAssignment.createStatement)
                    phiFunc.elseStatements.add(falsePhiAssignment.createStatement)
                }
            }
        ]
        
        //return the phi function conditional
        phiFunc.createStatement   
    }

    //---------------------------------------------------------------------------------------------
    //take all output variables an assign the last (highest SSA index) assignment
    def assingSSAVariableToOutput(Program targetProgram, Program program) { 
        
        program.definitions.forEach[ definition |
            //only assign output definitions
            if(definition.output){
                
                //get the last assignment               
                val lastAssignment = getSSAVariableName(targetProgram, program, definition.name)
                      
                //create the assignment to the output variable
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(definition.name),
                    targetProgram.getDefinitionByNameAsElemRef(lastAssignment))
                assignment.assignment = assignmentExp
                
                //add assignment to target program
                targetProgram.statements.add(assignment.createStatement)
            }
        ]
    }
    
    //---------------------------------------------------------------------------------------------
    def getSSAIndexHashmap(EList<VariableDefinition> vars){
       
       vars.forEach[ variable | 
//            if(variable.input)                      
//                 hmInputs.put(variable.name, -1)
//            if(variable.output)                   
//                 hmOutputs.put(variable.name, -1)
//            if(!(variable.input || variable.output))
//                 hmLocals.put(variable.name, -1)
//            
                hmAll.put(variable.name, -1)
            ]      
    } 
   
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