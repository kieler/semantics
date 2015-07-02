/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.eso.vhdl.xtend

import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sim.eso.eso.tracelist
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.EsoInt
import de.cau.cs.kieler.sim.eso.eso.EsoBool
import de.cau.cs.kieler.core.model.util.ModelUtil
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath
//import org.eclipse.core.internal.resources.File
import org.eclipse.emf.common.util.URI
import org.yakindu.sct.model.stext.stext.impl.IntLiteralImpl
import org.yakindu.sct.model.stext.stext.impl.BoolLiteralImpl
import de.cau.cs.kieler.eso.vhdl.Variables
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import de.cau.cs.kieler.sim.eso.eso.kvpair
import java.util.List
import org.yakindu.sct.model.stext.stext.Expression
import java.io.File;

/*
 * ----- T O D O ---------
 * 
 * optimize model loading -> with multiple files loaded from fileHandler ???
 * 
 */

class ESO2VHDL {
	
	URI input
	String name
	String modelname
    
	int traceCnt
	int tickCnt
	
	String setInputs
	String setInputsBack
	String asserts
	String simTicks
	String simTraces
	
	Program sclModel
	
	 // General method to create the c simulation interface.
	def transformESO2VHDL (tracelist tl, File modelFile) {
		
		if(modelFile != null){
			input = URI::createFileURI(modelFile.getName());
			modelname = input.trimFileExtension.toString
        }    
        
        if(modelname.nullOrEmpty){
   			name = "noname_tb";
       	}
       	else{name = modelname;}
        
       	sclModel = loadModel(modelFile)
       	if(sclModel == null){
       		//throw failed exception, exit transformation
       	}
       	
       	'''
		«/* Generate the header */»
		«generateHeader()»
		«/*Generate entity */»
		«createEntity(tl.traces ,name, sclModel.declarations)»
       	'''
   	}
   	
	def Program loadModel(File input) { 

	    val IPath iPath = new Path(input.toString())
				
		val EObject eobject = ModelUtil::loadEObjectFromModelFile(iPath)
		if(eobject instanceof Program){
			val Program sclModel = eobject as Program
			sclModel
		}else{
			return null
		}	
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
	--/* + Kiel University                                  */
	--/*   + Department of Computer Science                                        */
	--/*     + Real-Time and Embedded Systems Group                                */
	--/*                                                                           */
	--/* This code is provided under the terms of the Eclipse Public License (EPL).*/
	--/*****************************************************************************/
	
	LIBRARY ieee;
	USE ieee.std_logic_1164.ALL;
	''' 
   }
   
    //-------------------------------------------------------------------------
   	def createEntity(EList<trace> traces, String name, EList<VariableDeclaration> vars){

    //Get Input and Output from Model
    val modelInputs = new ArrayList<Variables>
    val modelOutputs = new ArrayList<Variables>
    
    vars.forEach[ variable | 
    	
    	if(variable.input) {						
//			if(value != null){
//				modelInputs.add(createVariableFromModel(variable.name, true, variable.initialValue))
//			} else{	
//				modelInputs.add(createVariableFromModel(variable.name, true, false))
//			}
			//every time a present variable is needed
			modelInputs.add(createVariableFromModel(variable, true)) 
		}
		if(variable.output){					
//			if(value != null){
//				modelOutputs.add(createVariableFromModel(variable.name, false, variable.initialValue))	
//			} else{	
//				modelOutputs.add(createVariableFromModel(variable.name, false, false))			
//			}
			//every time a present variable is needed
			modelOutputs.add(createVariableFromModel(variable, false))
		}	
    ]
    
    '''
	ENTITY «name»_tb IS
	END «name»_tb;
	
	ARCHITECTURE behavior OF «name»_tb IS
	
	«generateComponent(modelInputs, modelOutputs, name)»
	
	--Inputs
	«modelInputs.map( in |'''signal «in.name» : «getTypeAndInitValue(in)»''').join('\n')»
	
	--Outputs
	«modelOutputs.map( out |'''signal «out.name» : «getTypeAndInitValue(out)»''').join('\n')»
		
	--Control
	signal reset : std_logic := '0';
	signal tick : std_logic := '0';
	constant tick_period : time := 100 ns;
	
	BEGIN
		«generateUUT(modelInputs, modelOutputs)»
	
		«generateTickProcess()»

		«generateSimulation(traces, modelInputs, modelOutputs)»
	
	END;
    '''
	}
	
	//-------------------------------------------------------------------------
	def generateComponent(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray, String componentName) { 
	
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
		COMPONENT «componentName»
		PORT(
			 tick : IN  std_logic;
			 reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
			);
		END COMPONENT;
		'''
	}
	
	//-------------------------------------------------------------------------
	def generateUUT(ArrayList<Variables> inputArray, ArrayList<Variables> outputArray) {
		 
		//compute the mapping from the entity to simulation signals
		//e.g. A_in => A_in 
		val ins = inputArray.map( input |'''«input.name» => «input.name»''').join(',\n');
		val outs = outputArray.map( output |'''«output.name» => «output.name»''').join(',\n');
		
		//compute the whole port mapping, the last entry in the Port map has no ','
		//if there are no inputs and output res should be empty, not null (null will be a String in vhdl)
		val res =  if(!(ins.nullOrEmpty && outs.nullOrEmpty))
						ins + (if (!outs.nullOrEmpty) ',\n') + '''--Outputs''' + '\n' + outs
		
		'''
		uut: Main_Abo PORT MAP(
			tick => tick,
			reset => reset«if(!res.nullOrEmpty)',\n' + '''--Inputs'''+ '\n' + res»
		);
	    '''
	}
	
	//-------------------------------------------------------------------------
	def generateTickProcess() {
	'''
	tick_process: process
	begin
		tick <= '0';
		wait for tick_period/2;
		tick <= '1';
		wait for tick_period/2;
	end process;
	'''
	}
	
	//-------------------------------------------------------------------------
	def generateSimulation(EList<trace> traces, ArrayList<Variables> inputArray, ArrayList<Variables> outputArray) { 
	
	'''
	-- Stimulus process
	stim_proc: process
	begin		
		wait for 1 ps;
		
		--sim Process
		«generateSimProcess(traces, inputArray, outputArray)»
		wait;
	end process;
	'''
	}
	
	//-------------------------------------------------------------------------
	def generateSimProcess(EList<trace> traces, ArrayList<Variables> inputArray, ArrayList<Variables> outputArray) { 
		
		val String wait = '''wait for tick_period;''' + '\n' 
		simTicks = ""
		simTraces = ""
		traceCnt = 1
	
		val List<String> inputString = getStringList(inputArray)
		val List<String> outputString = getStringList(outputArray)
	
		//for all traces and all ticks generate simulation code
		traces.forEach[ trace | 
			simTicks = "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
//			simTicks = ""
			tickCnt = 1
			
			trace.ticks.forEach[ tick | 
				//Set inputs according to the tick
//				setInputs = getEsoString(tick.extraInfos,"-- ESO: ")
				setInputs = ""
				setInputs = setInputs + tick.extraInfos.map[ kvp | 
					if(inputString.contains(kvp.key)){
						'''«kvp.key» <= «getValueFromKvPair(kvp)»''' + (';\n')
					}else''''''
				].join('')
								
				if(setInputs.nullOrEmpty)
					setInputs = ""
				
				//check if all outputs are set, use asserts
//				asserts = getEsoString(tick.extraInfos,"--ESO: %Output ")
				asserts = ""
				asserts = asserts + tick.extraInfos.map[ kvp | 
					if(outputString.contains(kvp.key)){
						'''
						assert( «kvp.key» = «getValueFromKvPair(kvp)» )
							report "«numberToString(traceCnt)» trace: «numberToString(tickCnt)» tick: «kvp.key» should have been «getValueFromKvPair(kvp)»"
							severity ERROR;''' + '\n'
					}else''''''
				].join('')
				
				//Set all inputs back to initial value
				setInputsBack = tick.extraInfos.map[ kvp | 
					if(inputString.contains(kvp.key)){
						if(!(kvp.key.endsWith("_value"))){
							'''«kvp.key» <= false''' + (';\n')
						}else ''''''
					}else ''''''
				].join('')
				
				//Compute code that is needed for one tick
				//simTicks contains (at the end) the complete tick code for ONE trace
				simTicks =  simTicks + ("\n--".concat(" tick ").concat(tickCnt.toString).concat('\n')) 
							+ setInputs + wait + asserts + setInputsBack 
							
				//tick counter shows the current tick in the current trace
				tickCnt = tickCnt + 1
			]
			//simTrace contains (at the end) the simulation code for all traces
			simTraces = simTraces + simTicks 
//			simTraces =  simTraces + "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
						
			//counter for number of traces
			traceCnt = traceCnt + 1
		]
		//Return simulation code for all traces (included all ticks)
		simTraces
	}

    //-------------------------------------------------------------------------
    //------------- H E L P E R - M E T H O D S -------------------------------
	//-------------------------------------------------------------------------
	
	//Computes a String to a given trace number
	def numberToString(int number) { 
		switch number{	
			case number == 1: number.toString + "st"
			case number == 2: number.toString + "nd"
			case number == 3: number.toString + "rd"
			default         : number.toString + "th" 
		}
	}
	
	//Generates vhdl code for a reset
	def String generateVhdlResetCode(String wait) { 
		"reset <= '1';\n".concat(wait).concat("reset <= '0';\n");
	}
	
	//Return the ESO instructions as a String
	def String getEsoString(EList<kvpair> list, String startString) { 
		'''«startString»«list.map[kvp | '''«kvp.key»«if(true){'''(«getValueFromKvPair(kvp)»)'''}else " "»'''].join(' ').concat("\n")»'''
	}

	//Returns the value as String
	def String getValueFromKvPair(kvpair kvp) {
		
		val EObject value =  kvp.value
		if(value instanceof EsoInt){
            var EsoInt intVal = value as EsoInt
            return intVal.value.toString
        }
        if(value instanceof EsoBool){
            var EsoBool boolVal = value as EsoBool
            return boolVal.value.toString
        }
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
	
	//
	def List<String> getStringList(ArrayList<Variables> vari) { 
	
		val ArrayList<String> temp = newArrayList
		for(i : vari){
			temp.add(i.name)
		}
		return temp
	}
	
//	//create a new instance from variables to save the model variables in a more useable way
//	def dispatch createVariableFromModel(String name, boolean isinput, Expression initialValue) {
//
//			val value1 = initialValue as PrimitiveValueExpression
//			if(value1.value instanceof IntLiteralImpl){
//				val value2 = value1.value as IntLiteralImpl
//				val value3 = value2.value
//				new Variables(name,true,value3)
//			}else if (value1.value instanceof BoolLiteralImpl){
//				val value2 = value1.value as BoolLiteralImpl
//				val value3 = value2.value
//				new Variables(name,true,value3)
//			}		
//	}
//	
//	//create a new instance from variables to save the model variables in a more useable way
//	def dispatch createVariableFromModel(String name, boolean isinput, boolean initialValue) {
//		
//		new Variables(name,isinput,initialValue)
//	}


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

}