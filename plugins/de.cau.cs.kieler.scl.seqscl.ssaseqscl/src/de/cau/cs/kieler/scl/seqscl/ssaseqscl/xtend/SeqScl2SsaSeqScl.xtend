package de.cau.cs.kieler.scl.seqscl.ssaseqscl.xtend

import com.google.inject.Guice
import java.util.List
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.VariableDefinition
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Assignment
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import java.io.File
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SeqScl2SsaSeqScl {
    
    val ssaIndexMap = new HashMap<String,Integer>()
    
    extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
    
    //---------------------------------------------------------------------------------------------      
    def doTransform (Program program, File modelFile) {
   
        //Get the Hashmap to store the current SSA index for every variable
        fillSSAIndexHashmap(program.definitions)
        
        //Do SSA Transformation
        return doSSATransformation(program) 
    }

    //---------------------------------------------------------------------------------------------
    def doSSATransformation(Program program) { 
        
        //the new SSA SCL Program       
        val targetProgram = SCL.createProgram()

        //set the program name
        targetProgram.setName(program.getName + "_ssa")

        //add all definitions from the current program to the target program, respectively to their usage
        targetProgram.createDefinitions(program)
 
        //transform all statements to an SSA form
        program.statements.forEach[ stm |
           //the seqSCL Version only contains assignment and conditionals
           
            if(stm.assignment){
                val assignment = computeSSAForAssignment((stm as InstructionStatement).instruction as Assignment, targetProgram ,program)
                targetProgram.statements.add(assignment)
                                
            }else if(stm.conditional){                
                val stmList = computeSSAForConditional(((stm as InstructionStatement).instruction as Conditional), targetProgram, program )
                targetProgram.statements.addAll(stmList)
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
    def createDefinitions(Program targetProgram, Program program) {
        
        //add all variables
        program.definitions.forEach[ definition |
            
            if(definition.input && definition.output){
              
                targetProgram.definitions.add(definition.copy)       
            }
            else if(definition.input){
                
                //Inputs are read only, so there are no SSA form needed
                targetProgram.definitions.add(definition.copy)
            
            }else if(definition.output){
                
                //add a pre version from all outputs, because all outputs will
                //get a feedback loop in hardware including a flip flop (register)
                targetProgram.definitions.add(definition.copy)
                targetProgram.getDefinitionByName(definition.name).setOutput(false)
                targetProgram.getDefinitionByName(definition.name).name = definition.name + "__" + 0
                
                //original output definition is also needed
                //that will be the hardware output pin
                targetProgram.definitions.add(definition.copy)      
            }
            else{
                if(definition.name.equals("RESET")){
                    //add the initial GO, in hardware it will be used as input
                    targetProgram.definitions.add(definition.copy)
                }else{
                    //local variables are not copied
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
            
            val varName = definition.name
            
            if(varName.contains("__0")){
                
                //get the hashmap key, the key has no '__x' extension
                val hmKey = varName.subSequence(0,varName.indexOf("__")).toString
                
                //get the latest assignment
                val lastSSAIndexedVariable = getLastSSAIndexedVariableName(targetProgram, program, hmKey)
                
                //assign the latest assignment to the pre value ('__0')
                val assignment = SCL.createAssignment()
                val assignmentExp = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef(varName),
                    targetProgram.getDefinitionByNameAsElemRef(lastSSAIndexedVariable))
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
    def getLastSSAIndexedVariableName(Program targetProgram, Program program, String varName){
        
        var ssaIndexedVarName = ""
        
        //Inputs are read only, there are no SSA variables
        if(program.getDefinitionByName(varName).input && ! program.getDefinitionByName(varName).output){
            ssaIndexedVarName = varName
        }
//        else if(program.getDefinitionByName(varName).input && program.getDefinitionByName(varName).output){
//            
//        }
        else if(varName.equals("RESET")){
            ssaIndexedVarName = varName
        }else{
           //if the ssa index still -1 then there was no assignment until now, return the pre variable
           if(ssaIndexMap.get(varName) == -1){
               if(program.getDefinitionByName(varName).input){
                   ssaIndexedVarName = varName
               }else{
                    ssaIndexedVarName = varName + "__" + 0
               }

                //create pre variable if is does not exist
               if( targetProgram.getDefinitionByName(ssaIndexedVarName) == null){
                    targetProgram.definitions.add(createVariableDefinition(ssaIndexedVarName, 'boolean'))
                    ssaIndexMap.put(varName,0) 
               }                
           }else{
               //return the last assignment
               ssaIndexedVarName = varName + "__" + ssaIndexMap.get(varName)
           }
        }
        
        return ssaIndexedVarName
    }
    
    //---------------------------------------------------------------------------------------------
    // compute all SSA variables that are used in assignments
    // eg: g0 = g1 || g2
    // for g0 a new SSA variable will be created with the next highest index
    // for g1 and g2 the latest SSA index will be looked up and used
    def Statement computeSSAForAssignment(Assignment assignment, Program targetProgram, Program program) { 
        
        //Get variable name
        val assExp = assignment.assignment as AssignmentExpression
        val elemRefExp = assExp.varRef as ElementReferenceExpression
        val vardef = elemRefExp.reference as VariableDefinition
        
        // --------------------------------------        
        // Compute left Operator Expression
        // a new SSA variable will be created
        // --------------------------------------
        
        //get last SSA index
        var int varSSAIndex = ssaIndexMap.get(vardef.name)
        if(varSSAIndex == -1){
            // if the index is lower than 0 than only the preValue __0 exists
            // for the new Variable change index to 1
            varSSAIndex = 1
        }else{
            //Index is higher 0, just take the next higher one
            varSSAIndex = varSSAIndex + 1
        }
                
        //create new variable with ssa index
        val newSSAIndexedVariable = vardef.name + "__" + varSSAIndex
        targetProgram.definitions.add(createVariableDefinition(newSSAIndexedVariable, 'boolean'))
          
        // --------------------------------------        
        // Compute right Operator Expression
        // --------------------------------------
        val newAssignmentExpression = assExp.copy
        //if there are more then only a variable reference, than transform all
        //used variable references in the right operand
        if(!(newAssignmentExpression.expression instanceof ElementReferenceExpression)){
            
            //set all variable usages in the right operand to new SSA variable
            newAssignmentExpression.expression.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[eRefExp |
                  val varName = (eRefExp.reference as VariableDefinition).name
                  val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)
                  eRefExp.reference = targetProgram.getDefinitionByName(ssaVariable)
            ]
        }else{ //right operator is only a variable expression, set this one to the current SSA index
            val varName = ((newAssignmentExpression.expression as ElementReferenceExpression).reference as VariableDefinition).name
            val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)
            (newAssignmentExpression.expression as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(ssaVariable)
        }
           
        //save current index here, because g2 = g2 || true should result in g2__1 = g2__0 || true
        //if you assign it earlier it results in g2__1 = g2__1 || true that is false
        ssaIndexMap.put(vardef.name,varSSAIndex)   
           
        //Create new Assignment statement
        val newAssignment = SCL.createAssignment()
        newAssignment.assignment = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef
            (newSSAIndexedVariable), newAssignmentExpression.expression)

        return newAssignment.createStatement    
    }

    //---------------------------------------------------------------------------------------------^
    // transform conditional and compute phi function
    def List<Statement> computeSSAForConditional(Conditional conditional, Program targetProgram, Program program) { 
       
//       val newCond = SCL.createConditional
//       val stmList = createNewStatementList
//       val trueStms = conditional.statements
//       
//       //transform the condition expression
//       val newCondExp = conditional.expression.copy 
//       //more than one ElementReferenceExpression
//       if(!(newCondExp instanceof ElementReferenceExpression)){
//           
//            //set all variable usages in the condition expression to the latest SSA variable
//            newCondExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[exp |
//                  val varName = (exp.reference as VariableDefinition).name
//                  val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)                    
//                  exp.reference = targetProgram.getDefinitionByName(ssaVariable)
//            ]
//        }else{ //conditional expression has only one variable expression
//            val varName = ((newCondExp as ElementReferenceExpression).reference as VariableDefinition).name
//            val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)
//            (newCondExp as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(ssaVariable)
//        }
//       
//       //Safe Hashmap to see the changes which were made in the true case from the conditional
//       val ssaIndexedMapSave = new HashMap<String,Integer>()
//       ssaIndexedMapSave.putAll(ssaIndexMap)
//       
//       // create new conditional, the condition is the same as in the old one
//       newCond.setExpression(newCondExp) 
//       
//       // transform all assignments from the true case
//       // until now (!): only assignments exists in true case, no other statements
//       trueStms.forEach[ stm | 
//            val ssaAssignment = computeSSAForAssignment((stm as InstructionStatement).instruction as Assignment, targetProgram, program)
//            
//            //Add transformed assignment to the new SSA conditional
//            newCond.statements.add(ssaAssignment)    
//       ]       
//       
//        //add the new SSA conditional the the return statement list
//        stmList.add(newCond.createStatement) 
//       
//       // compute Phi function
//       stmList.add(computePhiFunction(ssaIndexMap, ssaIndexedMapSave, newCondExp.copy, targetProgram))
//       
//       stmList


//---------------------------------------------------------------------------------------------
// N E W   V E R S I O N S
//---------------------------------------------------------------------------------------------

        val newCond = SCL.createConditional
        val stmList = createNewStatementList
        val trueStms = conditional.statements
 
//C O N D I T I O N    E X P R E S S I O N        
        //transform the condition expression
        val newCondExp = conditional.expression.copy 
        //more than one ElementReferenceExpression
        if(!(newCondExp instanceof ElementReferenceExpression)){
           
            //set all variable usages in the condition expression to the latest SSA variable
            newCondExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[exp |
                  val varName = (exp.reference as VariableDefinition).name
                  val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)                    
                  exp.reference = targetProgram.getDefinitionByName(ssaVariable)
            ]
            }else{ //conditional expression has only one variable expression
                val varName = ((newCondExp as ElementReferenceExpression).reference as VariableDefinition).name
                val ssaVariable = getLastSSAIndexedVariableName(targetProgram, program, varName)
                (newCondExp as ElementReferenceExpression).reference = targetProgram.getDefinitionByName(ssaVariable)
            }
       
        //Safe Hashmap to see the changes which were made in the true case from the conditional
        val ssaIndexedMapSave = new HashMap<String,Integer>()
        ssaIndexedMapSave.putAll(ssaIndexMap)
       
        // create new conditional, the condition is the same as in the old one
        newCond.setExpression(newCondExp) 

//T R U E   S T A T E M E N T      
        // transform all assignments from the true case
        // until now (!): only assignments exists in true case, no other statements
        trueStms.forEach[ stm | 
            val ssaAssignment = computeSSAForAssignment((stm as InstructionStatement).instruction as Assignment, targetProgram, program)
            
            //Add transformed assignment to the new SSA conditional
            newCond.statements.add(ssaAssignment)    
        ]       
        
// -----------------------------------------------------------------------------------------------------
//F I R S T   V E R S I O N 
// original version with two condition
//      
//       //add the new SSA conditional the the return statement list
//        stmList.add(newCond.createStatement) 
//       
//       // compute Phi function
//       stmList.add(computePhiFunction(ssaIndexMap, ssaIndexedMapSave, newCondExp.copy, targetProgram))
//       
//       stmList

//F I R S T   V E R S I O N   E N D

// -----------------------------------------------------------------------------------------------------
// S E C O N D   V E R S I O N  
// Just combine phi function and else statement
//
//        //compute Phi function
//        val stms = (computeInternalPhiFunction(ssaIndexMap, ssaIndexedMapSave, conditional, targetProgram))
//       
//        newCond.elseStatements.addAll(stms)
//
//        //add the new SSA conditional the the return statement list
//        stmList.add(newCond.createStatement) 
//       
//        stmList     
// S E C O N D   V E R S I O N   E N D
 
// -----------------------------------------------------------------------------------------------------
// T H I R D   V E R S I O N  
// optimized second Version, here only the variables inside the true case are checked 
//    
        //Variables could be assign more than one time in the true statement sequence(g1 = true; g1 = false),
        //so only compute one phi function for one all assignments (definition g1__1, g1__2) 
        val alreadyChecked = new ArrayList<String>
        
        newCond.statements.forEach[ stm |
                    
            val varName = ((((stm.instruction as Assignment).assignment as AssignmentExpression).varRef 
                as ElementReferenceExpression).reference as VariableDefinition).name
            
            var hmKey = "" 
            if(varName.contains("__")){
                hmKey = varName.subSequence(0,varName.indexOf("__")).toString
            }else{
                //if it contains no '__' then it is an input/output variable
                hmKey = varName
            }
            
            var oldSSAIndex = ssaIndexedMapSave.get(hmKey)
            var currentSSAIndex = ssaIndexMap.get(hmKey)
            
            var oldSSAIndex2 = "__" + oldSSAIndex.toString
//            var currentSSAIndex2 = ""
                  
            //If the old variable was never assigned, then take pre value (__0)
            if((oldSSAIndex == -1)){
                val definition = program.getDefinitionByName(hmKey)
                if(definition.input){
                    //variable is input output, so take the 
                    oldSSAIndex2 = ""
                }else{
                   oldSSAIndex2 = "__0"
                }
            }
            
            //create pre variable if is does not exist
           if( targetProgram.getDefinitionByName(hmKey + oldSSAIndex2) == null){
                targetProgram.definitions.add(createVariableDefinition(hmKey + oldSSAIndex2, 'boolean'))
                ssaIndexMap.put(varName,0) 
           }
            
            if(!alreadyChecked.contains(hmKey)){
                //add current hashmap key to the visited ones
                alreadyChecked.add(hmKey)

                val newAssignment = SCL.createAssignment()
                newAssignment.assignment = createAssignmentExpression(targetProgram.getDefinitionByNameAsElemRef
                    (hmKey + "__" + currentSSAIndex),targetProgram.getDefinitionByNameAsElemRef(hmKey + oldSSAIndex2))

                newCond.elseStatements.add(newAssignment.createStatement)                        
            }
        ]
        
        //add the new SSA conditional the the return statement list
        stmList.add(newCond.createStatement) 
       
        stmList

// T H I R D   V E R S I O N   E N D   
    
    }
    
    //---------------------------------------------------------------------------------------------
    // S E C O N D   V E R S I O N
    //---------------------------------------------------------------------------------------------
    //Computes the Phi Function (that is a conditional)
    def EList<Statement> computeInternalPhiFunction(HashMap<String,Integer> currentHm, HashMap<String,Integer> oldHm, Conditional condition, Program targetProgram) {
        
        val stms = SCL.createStatementSequence
        val elseStms = stms.statements
        
        //Variables could be assign more than one time in the true statement sequence(g1 = true; g1 = false),
        //so only compute one phi function for one all assignments (definition g1__1, g1__2) 
        val alreadyChecked = new ArrayList<String>
        
        //check, for which variables a phi function must be computed  
        targetProgram.definitions.forEach[ definition |
            
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
            var currentSSAIndex = currentHm.get(hmKey)
            
            //if there are two different SSA index to the same variable, a phi function must be create
            if(!alreadyChecked.contains(hmKey)){
                if(oldSSAIndex < currentSSAIndex){
                    
                    //add current hashmap key to the visited ones
                    alreadyChecked.add(hmKey)
                                        
                    //If the old variable was never assigned, then take pre value (__0)
                    if((oldSSAIndex == -1)){
                        oldSSAIndex = 0
                    }
                    
                    //create the to possible assignments from the phi function
                    val falsePhiAssignment = createSCLAssignment(targetProgram.getDefinitionByName(hmKey + "__" + currentSSAIndex),targetProgram.getDefinitionByName(hmKey + "__" + oldSSAIndex))
                    
                    //add them to the conditional
                    elseStms.add(falsePhiAssignment.createStatement)
                }
            }
        ]
        
        //return the phi function conditional
        elseStms   
    }
        
    //---------------------------------------------------------------------------------------------
    //Computes the Phi Function (that is a conditional)
    def Statement computePhiFunction(HashMap<String,Integer> currentHm, HashMap<String,Integer> oldHm, Expression conditionExpression, Program targetProgram) {
        
        val phiFunc = SCL.createConditional
        
        //The phi function has the same condition as the predecessor conditional
        phiFunc.setExpression(conditionExpression)
        
        // make a copy from all definitions, because this function adds new definitions
        val tempDefinitions = targetProgram.definitions.copyAll
        
        //copy current hashmap, because the original hashmap will be changed in this function
        val tempHm = new HashMap<String,Integer>()
        tempHm.putAll(currentHm)
        
        //Variables could be assign more than one time in the true statement sequence(g1 = true; g1 = false),
        //so only compute one phi function for one all assignments (definition g1__1, g1__2) 
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
                    
                    //create new variable (new ssa index)
                    val int ssaIndex = currentSSAIndex + 1
                    currentHm.put(hmKey,ssaIndex)
                    val phiVariable = hmKey + "__" + ssaIndex
                    targetProgram.definitions.add(createVariableDefinition(phiVariable, 'boolean'))
                    
                    //If the old variable was never assigned, then take pre value (__0)
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
                val lastAssignment = getLastSSAIndexedVariableName(targetProgram, program, definition.name)
                      
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
    def fillSSAIndexHashmap(EList<VariableDefinition> vars){
       
       vars.forEach[ variable | ssaIndexMap.put(variable.name, -1) ]      
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