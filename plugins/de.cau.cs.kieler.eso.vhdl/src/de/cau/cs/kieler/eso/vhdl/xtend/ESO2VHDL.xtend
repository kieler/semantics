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
import de.cau.cs.kieler.sim.eso.eso.tracelist
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.signal
import de.cau.cs.kieler.sim.eso.eso.EsoInt
import de.cau.cs.kieler.sim.eso.eso.EsoBool

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
	def transformESO2VHDL (tracelist tl, String name) {

       	if(name.nullOrEmpty){
       		name2 = "noname_tb";
       	}
       	else{
       		name2 = name.subSequence(0,name.indexOf(".")).toString()
       		//name2 = name;
       	}
       	
       	'''
		«/* Generate the header */»
		«generateHeader()»

		«/*Generate entiy */»
		«createEntity(tl.traces ,name2)»
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
   	def createEntity(EList<trace> traces, String name){
    
    val inputArray = new ArrayList<signal>
    val outputArray = new ArrayList<signal>
    val signalAlreadyHandled = new ArrayList<String>
        
    //Get inputs and outputs of all traces
    traces.forEach[trace |
    	trace.ticks.forEach[ tick |
    		tick.input.forEach[ input | 
    			if(!signalAlreadyHandled.contains(input.name)){
    				signalAlreadyHandled.add(input.name)
    				inputArray.add(input) 
    			}
    		]
    		//All output get an "_out" additional
    		tick.output.forEach[ output |
    			if(!signalAlreadyHandled.contains(output.name.concat("_out"))){	
    			
    				signalAlreadyHandled.add(output.name.concat("_out"))
    			
    				output.setName(output.name.concat(("_out")))
    				outputArray.add(output)	
    			}
    			else{
    				output.setName(output.name.concat(("_out")))
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
	«inputArray.map( in |'''signal «in.name» : «getTypeAndInitValue(in)»''').join('\n')»
	
	--Outputs
	«outputArray.map( out |'''signal «out.name» : «getTypeAndInitValue(out)»''').join('\n')»
		
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
	def generateComponent(ArrayList<signal> inputArray, ArrayList<signal> outputArray, String componentName) { 
	
		//compute the component 
		//e.g. A_in : IN boolean; 		
		val ins = inputArray.map(input | '''«input.name»: IN «getTypeString(input)»''').join(';\n')
		val outs = outputArray.map(output | '''«output.name» : OUT «getTypeString(output)»''').join(';\n')
		
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
	def generateUUT(ArrayList<signal> inputArray, ArrayList<signal> outputArray) {
		 
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
	def generateSimulation(EList<trace> traces) { 
	
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
	def generateSimProcess(EList<trace> traces) { 
		
		val String wait = '''wait for tick_period;''' + '\n' 
		simTicks = ""
		simTraces = ""
		traceCnt = 1
	
		//for all traces and all ticks generate simulation code
		traces.forEach[ trace | 
//			simTicks = "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
			simTicks = ""
			tickCnt = 1
			setInputs = ""
			
			trace.ticks.forEach[ tick | 
				
				//Set inputs according to the tick
				//setInputs = tick.input.map( in | '''«in.name» <= true''' + (';\n')).join('')
				setInputs = getEsoString(tick.input,"-- ESO: ")
				setInputs = setInputs + tick.input.map[ in | '''«in.name» <= «getValue(in)»''' + (';\n') 
				].join('')
				
				if(setInputs.nullOrEmpty)
					setInputs = ""
				
				//check if all outputs are set, use asserts
				asserts = getEsoString(tick.output,"--ESO: %Output ")
				asserts = asserts + tick.output.map[ out | 
					'''
					assert( «out.name» = «getValue(out)» )
						report "«numberToString(traceCnt)» trace: «numberToString(tickCnt)» tick: «out.name» should have been «getValue(out)»"
						severity ERROR;''' + '\n'
				].join('')
				
				//Set all inputs back to initial value
				//setInputsBack = tick.input.map( in | '''«in.name» <= false''' + (';\n')).join('')
				setInputsBack = tick.input.map[ in | if(!(in.name.endsWith("_value"))){
														'''«in.name» <= false''' + (';\n')}else ''''''
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
	def String getEsoString(EList<signal> list, String startString) { 
		'''«startString»«list.map[s | '''«s.name»«if(true){'''(«getValue(s)»)'''}else " "»'''].join(' ').concat("\n")»'''
	}

	//Returns the value as String
	def getValue(signal s) {
		
		val EObject value = s.^val

		if(value instanceof EsoInt){
            var EsoInt intVal = value as EsoInt
            str = intVal.value.toString
        }
        if(value instanceof EsoBool){
            var EsoBool boolVal = value as EsoBool
            str = boolVal.value.toString
        }
		str			
	}
	
	//Returns a vhdl String according to the type of the kvpair
	def getTypeAndInitValue(signal s) { 

		val value = s.^val
		if(value instanceof EsoInt){
			"integer range 31 downto 0 := 0;"
		}
		else
			"boolean := false;"			
	}
	
	//Return the kvpair type as a string
	def getTypeString(signal s) { 
		
		val value = s.^val
		if(value instanceof EsoBool)
			inOut = "boolean"
		else{
			inOut = "integer range 31 downto 0"
		}
	}

}