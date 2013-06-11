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
package de.cau.cs.kieler.eso.vhdl.xtend

import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sim.coreeso.coreEso.coreTracelist
import de.cau.cs.kieler.sim.coreeso.coreEso.coreTrace
import de.cau.cs.kieler.sim.coreeso.coreEso.coreKvpair
import de.cau.cs.kieler.sim.coreeso.coreEso.CoreEsoInt
import de.cau.cs.kieler.sim.coreeso.coreEso.CoreEsoBool

//import org.eclipse.xtext.formatting.INodeModelFormatter$IFormattedRegion
//import com.google.common.base.Joiner
//import java.util.List

class ESO2VHDL {
	String name2
	String str
	String inOut
    
	int traceCnt
	int tickCnt
	
	String setInputs
	String setInputsBack
	String asserts
	String simTicks
	String simTraces
	
	
	 // General method to create the c simulation interface.
	def transformESO2VHDL (coreTracelist tracelist, String name) {

       	if(name.nullOrEmpty){
       		name2 = "noname_tb";
       	}
       	else{
       		name2 = name;
       	}
       	
       	'''
		«/* Generate the header */»
		«generateHeader()»

		«/*Generate entiy */»
		«createEntity(tracelist.traces ,name2)»
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
	
	LIBRARY ieee;
	USE ieee.std_logic_1164.ALL;
	''' 
   }
   
    //-------------------------------------------------------------------------
   	def createEntity(EList<coreTrace> traces, String name){
    
    val inputArray = new ArrayList<coreKvpair>
    val outputArray = new ArrayList<coreKvpair>
    val signalAlreadyHandled = new ArrayList<String>
        
    //Get inputs and outputs of all traces
    traces.forEach[trace |
    	trace.ticks.forEach[ tick |
    		tick.input.forEach[ input | 
    			if(!signalAlreadyHandled.contains(input.key)){
    				signalAlreadyHandled.add(input.key)
    				inputArray.add(input) 
    			}
    		]
    		//All output get an "_out" additional
    		tick.output.forEach[ output |
    			if(!signalAlreadyHandled.contains(output.key.concat("_out"))){	
    			
    				signalAlreadyHandled.add(output.key.concat("_out"))
    			
    				output.setKey(output.key.concat(("_out")))
    				outputArray.add(output)	
    			}
    			else{
    				output.setKey(output.key.concat(("_out")))
    			}
    		]
    	]
    ]

    
    '''
	ENTITY tb_«name» IS
	END tb_«name»;
	
	ARCHITECTURE behavior OF tb_«name» IS
	
	«generateComponent(inputArray, outputArray, name)»
	
	--Inputs
	«inputArray.map( in |'''signal «in.key» : «getTypeAndInitValue(in)»''').join('\n')»
	
	--Outputs
	«outputArray.map( out |'''signal «out.key» : «getTypeAndInitValue(out)»''').join('\n')»
		
	--Control
	signal reset : std_logic := '0';
	signal tick : std_logic := '0';
	constant tick_period : time := 100 ns;
	
	BEGIN

		«generateUUT(inputArray,outputArray)»
	
		«generateTickProcess()»

		«generateSimulation(traces)»
	
	END;
    '''
	}
	
	//-------------------------------------------------------------------------
	def generateComponent(ArrayList<coreKvpair> inputArray, ArrayList<coreKvpair> outputArray, String componentName) { 
	
		//compute the component 
		//e.g. A_in : IN boolean; 		
		val ins = inputArray.map(input | '''«input.key»: IN «getTypeString(input)»''').join(';\n')
		val outs = outputArray.map(output | '''«output.key» : OUT «getTypeString(output)»''').join(';\n')
		
		//compute the whole component, the last entry in the component has no ';'
		//if there are no inputs and output res should be empty, not null (null will be a String in vhdl)
		val res = if(!(ins.nullOrEmpty && outs.nullOrEmpty))
					 '''--inputs''' + '\n'  + ins + (if(!outs.nullOrEmpty) ';\n') + 
					 '''--outputs'''+ '\n' + outs 		 
		
		//«componentName»
		
		'''
		COMPONENT Main_Abo
		PORT(
			 tick : IN  std_logic;
			 reset : IN std_logic«if(!res.nullOrEmpty)';\n' + res»
			);
		END COMPONENT;
		'''
	}
	
	//-------------------------------------------------------------------------
	def generateUUT(ArrayList<coreKvpair> inputArray, ArrayList<coreKvpair> outputArray) {
		 
		//compute the mapping from the entity to simulation signals
		//e.g. A_in => A_in 
		val ins = inputArray.map( input |'''«input.key» => «input.key»''').join(',\n');
		val outs = outputArray.map( output |'''«output.key» => «output.key»''').join(',\n');
		
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
	def generateSimulation(EList<coreTrace> traces) { 
	
	'''
	-- Stimulus process
	stim_proc: process
	begin		
		wait for 1 ps;
		
		--sim Process
		«generateSimProcess(traces)»
		wait;
	end process;
	'''
	}
	
	//-------------------------------------------------------------------------
	def generateSimProcess(EList<coreTrace> traces) { 
		
		val String wait = '''wait for tick_period;''' + '\n' 
		simTicks = ""
		simTraces = ""
		traceCnt = 1
	
		//for all traces and all ticks generate simulation code
		traces.forEach[ t | 
//			simTicks = "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
			simTicks = ""
			tickCnt = 1
			setInputs = ""
			
			t.ticks.forEach[ tick | 
				
				//Set inputs according to the tick
				//setInputs = tick.input.map( in | '''«in.name» <= true''' + (';\n')).join('')
				setInputs = getEsoString(tick.input,"-- ESO: ")
				setInputs = setInputs + tick.input.map[ in | '''«in.key» <= «getValue(in)»''' + (';\n') 
				].join('')
				
				if(setInputs.nullOrEmpty)
					setInputs = ""
				
				//check if all outputs are set, use asserts
				asserts = getEsoString(tick.output,"--ESO: %Output ")
				asserts = asserts + tick.output.map[ out | 
					'''
					assert( «out.key» = «getValue(out)» )
						report "«numberToString(traceCnt)» trace: «numberToString(tickCnt)» tick: «out.key» should have been «getValue(out)»"
						severity ERROR;''' + '\n'
				].join('')
				
				//Set all inputs back to initial value
				//setInputsBack = tick.input.map( in | '''«in.name» <= false''' + (';\n')).join('')
				setInputsBack = tick.input.map[ in | if(!(in.key.contains("value"))){
														'''«in.key» <= false''' + (';\n')}else ''''''
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
			simTraces =  simTraces + "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
						
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
	def String getEsoString(EList<coreKvpair> list, String startString) { 
		'''«startString»«list.map[kvpair | '''«kvpair.key.toString»«if(true){'''(«getValue(kvpair)»)'''}else " "»'''].join(' ').concat("\n")»'''
	}

	//Returns the value as String
	def getValue(coreKvpair kv) {
		
		val EObject value = kv.value

		if(value instanceof CoreEsoInt){
            var CoreEsoInt intVal = value as CoreEsoInt
            str = intVal.value.toString
        }
        if(value instanceof CoreEsoBool){
            var CoreEsoBool boolVal = value as CoreEsoBool
            str = boolVal.value.toString
        }
		str			
	}
	
	//Returns a vhdl String according to the type of the kvpair
	def getTypeAndInitValue(coreKvpair kv) { 

		val value = kv.value
		if(value instanceof CoreEsoInt){
			"integer range 31 downto 0 := 0;"
		}
		else
			"boolean := false;"			
	}
	
	//Return the kvpair type as a string
	def getTypeString(coreKvpair kv) { 
		
		val value = kv.getValue()
		if(value instanceof CoreEsoBool)
			inOut = "boolean"
		else{
			inOut = "integer range 31 downto 0"
		}
	}

}