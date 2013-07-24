package de.cau.cs.kieler.scl.vhdl.extensions

import de.cau.cs.kieler.scl.vhdl.Variables
import de.cau.cs.kieler.scl.scl.VariableDefinition
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.impl.BoolLiteralImpl
import org.yakindu.sct.model.stext.stext.impl.IntLiteralImpl
import java.util.ArrayList

class VHDLExtension {
    
    
    //-------------------------------------------------------------------------
    /**
     * Generate entity port declaration
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     ** @param entityName
     *          the name for the VHDL entity, this name must be the same like the component name from 
     *          generated component from the SCL model 
     * 
     * @return a String which contains VHDL code for the entity declaration
     */
    def generateEntity(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray, String entityName) { 
    
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
        
         val res = getInputOutputDeclaration(inputArray, outputArray)
        
        '''
        ENTITY «entityName» IS
        PORT(
             tick : IN  std_logic;
             reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
            );
        END «entityName»;
        '''
    }
    
    
    //-------------------------------------------------------------------------
    /**
     * Generate component port declaration from the to tested VHDL component
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     ** @param componentName
     *          the name for the VHDL component, this name must be the same like the component name from 
     *          generated component from the SCL model 
     * 
     * @return a String which contains VHDL code for the component declaration
     */
    def generateComponent(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray, String componentName) { 
    
//        // compute the component input and output ports including its type  
//        // e.g. A_in : IN boolean;      
//        val ins = inputArray.map(input | '''«input.name»: IN «getTypeString(input)»''').join(';\n')
//        val outs = outputArray.map(output | '''«output.name» : OUT «getTypeString(output)»''').join(';\n')
//        
//        // compute the whole component, the last entry in the component has no ';' (VHDL syntax)
//        // if there are no inputs and output res should be empty, 
//        // not null (null will be a String in the VHDL code)
//        val res = if(!(ins.nullOrEmpty && outs.nullOrEmpty))
//                     '''--inputs''' + '\n'  + ins + (if(!outs.nullOrEmpty) ';\n') + 
//                     '''--outputs'''+ '\n' + outs        
        
        val res = getInputOutputDeclaration(inputArray, outputArray)
        
        // Generate VHDL code
        '''
        COMPONENT «componentName»
        PORT(
             tick : IN  std_logic;
             reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
            );
        END COMPONENT;
        '''
    }
    
    //-------------------------------------------------------------------------
    /**
     * Generates the input and output declaration to the given input and output Lists
     * 
     * normally used for entity and component declaration.
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     * @return VHDL code which contains the input and output signal declaration
     * 
     */
    def getInputOutputDeclaration(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray){
        
        // compute the component input and output ports including its type  
        // e.g. A_in : IN boolean;      
        val ins = inputArray.map(input | '''«input.name»: IN «getTypeString(input)»''').join(';\n')
        val outs = outputArray.map(output | '''«output.name» : OUT «getTypeString(output)»''').join(';\n')
        
        // compute the whole component, the last entry in the component has no ';' (VHDL syntax)
        // if there are no inputs and output res should be empty, 
        // not null (null will be a String in the VHDL code)
        val res = if(!(ins.nullOrEmpty && outs.nullOrEmpty))
                     '''--inputs''' + '\n'  + ins + (if(!(outs.nullOrEmpty || ins.nullOrEmpty)){ ';\n'}else{'\n'}) + 
                     '''--outputs'''+ '\n' + outs
        
        return res
    }
    
     //-------------------------------------------------------------------------
     /**
     * Generates a VHDL signal declaration string according to the given variable
     * 
     * @param variable
     *             the variable for which a signal should be generated
     * 
     * @param nameExtension
     *              a string to extend to signal name
     * 
     * @return the VHDl code for a signal declaration
     *             
     */
    def generateVhdlSignalFromVariableWithInitialValue(Variables variable, String nameExtension) { 
        
        return "signal " + generateNameAndType(variable, nameExtension)            
    }
    
    //-------------------------------------------------------------------------
    /**
     * Generates a VHDL variable declaration string according to the given variable
     * 
     * @param variable
     *             the variable for which a variable should be generated
     * 
     * @param nameExtension
     *              a string to extend to variable name
     * 
     * @return the VHDl code for a variable declaration
     *             
     */
    def generateVhdlVariabelFromVariableWithInitialValue(Variables variable, String nameExtension) { 
        
        return "variable " + generateNameAndType(variable, nameExtension)           
    }
    
    //-------------------------------------------------------------------------
    /**
     * Generates a name, type and initialization VHDL string
     * 
     * It can be used to generate a variable or a signal. 
     * Just by writing signal or variable in front of it.
     * 
     * @param variable
     *             the variable for which a name, type and initial value should be generated
     * 
     * @param nameExtension
     *              a string to extend to variable/signal name
     * 
     * @return a name, type, initial value string
     */
    def generateNameAndType(Variables variable, String nameExtension){
        val value = variable.value
        if(value instanceof Integer){
            return variable.name + nameExtension + " : integer range 31 downto 0 := " + value.toString + ";"
        }
        else if(value instanceof Boolean)
            return variable.name + nameExtension + " : boolean := " + value.toString + ";"    
    }
    
    
    //-------------------------------------------------------------------------
    /**
     * Generates VHDL code for type initiation for a given variable
     * 
     * @param variable  
     *             the variable for which the VHDl type should returned
     * 
     * @return the VHDL type
     */
    def getTypeString(Variables v) { 
        
        val value = v.value
        if(value instanceof Integer)
            return "integer range 31 downto 0"
        else if(value instanceof Boolean){
            return "boolean"
        }
    }
    
    //-------------------------------------------------------------------------
    /**
     * create a variable according to a given SCL variable declaration
     * 
     * @param variable
     *          a variable declaration from a SCL model
     * 
     * @param isInput
     *          specifies if the new variable is an input variable
     * 
     * @param isOutput
     *          specifies if the new variable is an output variable
     * 
     * @return a new variable
     * 
     */
    def createVariableFromModel(VariableDefinition variable, boolean isInput, boolean isOutput) {
        
        val Expression initialValue = variable.initialValue
        val name = variable.name
        
        // The variable has an initial value, so generate a variable with the same name and 
        // the initial value. The value will be saved as normal int or boolean and not as a
        // stext type 
        if(initialValue != null){
            
            val value1 = initialValue as PrimitiveValueExpression
            
            if(value1.value instanceof IntLiteralImpl){
                //value is a kind of an integer format
                val value2 = value1.value as IntLiteralImpl
                val value3 = value2.value
                new Variables(name,isInput,isOutput,value3)
                
            }else if (value1.value instanceof BoolLiteralImpl){
                //the variable is a kind of a boolean type
                val value2 = value1.value as BoolLiteralImpl
                val value3 = value2.value
                new Variables(name,isInput,isOutput,value3)
            }   
        }
        // no initial value present
        // generate a initial value according to the type of the variable
        // a type must be specified (rvh: synchronous meeting)
        else{
            //Problem: in seqSCL local signals have no type :-/ Steven
            if(variable.type != null){
                val String type = variable.type.name
                // All used signals should have an initial value in a VHDL simulation
                // otherwise may cause incorrect simulation results
                if(type == "integer"){
                    new Variables(name,isInput,isOutput,0)
                }
                else if(type == "boolean") {
                    new Variables(name,isInput,isOutput,false)
                }//no type specified -> set to boolean
            }
            else{
                new Variables(name,isInput,isOutput,false)
            }
        }
    }
}