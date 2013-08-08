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

import com.google.inject.Guice
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sim.eso.eso.tracelist
import de.cau.cs.kieler.sim.eso.eso.trace
import de.cau.cs.kieler.sim.eso.eso.EsoInt
import de.cau.cs.kieler.sim.eso.eso.EsoBool
import de.cau.cs.kieler.core.model.util.ModelUtil
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.VariableDefinition
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.sim.eso.eso.kvpair
import de.cau.cs.kieler.scl.vhdl.extensions.VHDLExtension
import java.io.File
import java.lang.Character

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * This class transforms a given core ESO tracelist to a VHDL testbench.
 * The proper SCl model is needed for this transformation
 * 
 * With the aid of the SCL model the whole entity declaration, the interface declaration
 * of the tested component and the instantiation of the Unit Under Test (UUT) is done.
 * The core ESO tracelist is needed to created the simulation process. It contains for each
 * tick in each trace: set the input signals and test if the output signals have the correct
 * value in each tick. 
 * 
 * A complete runnable VHDL instance is created.
 * 
 * Convention: 
 *      - the SCL and ESO file must have the same name
 *      - the entity name from the unit under test is derived from the model name
 *        So in the VHDL file which specifies the uut, the entity must have the model name too
 *      - the testbench entity gets the model name with an '_tb' extension (TestBench)   
 * 
 * 
 * @author gjo
 * 
 */
class ESO2VHDL {
//    boolean resetWasSet
    
    extension de.cau.cs.kieler.scl.vhdl.extensions.VHDLExtension VHDLExtension = 
         Guice::createInjector().getInstance(typeof(VHDLExtension))
    	
	/** contains the current trace number */
	int traceCnt
	/** contains the current tick number */
	int tickCnt
	
	/** VHDL code variables */
	/** contain the code thats sets all variables in each tick */
	String setInputs   
	/** contains the code that holds all assertions for each tick */
	String asserts     
	/** contains the code which sets variables and the assertions for all ticks of a trace */ 
	String simTick     
	/** contains the simulation code for all traces */
	String simTraces   
	
	/**
	 * Transforms an ESO tracelist to a VHDL testbench 
	 * 
	 * @param tl
	 *         the ESO file tracelist
	 * 
	 * @param modelFile
	 *         the proper SCL model file
	 * 
	 */
	def transformESO2VHDL (tracelist tl, File modelFile) {
		
		var String modelname
		
		// generate entity name from model filename
		// only take the first letters until the first dot and
		// if the name looks like 0-xyz.scl take only xyz
		// ?!? delete leading numbers
		// BE CAREFULL!! TO CHANGE THIS COMPUTATION
        // the same computation take place in the automated JUnit test, these two names must match:
        // the entityname in vhdl file (here) and the name which will be used for the generated batch file
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
        
//        //the entityname
//        var String name
//        // If there is no name, use a dummy name
//        // should never take place, the compiling will still fail
//        if(modelname.nullOrEmpty){
//   			name = "NONAME"
//       	}else{name = modelname}
//        
        // load the proper SCL model
       	var sclModel = loadModel(modelFile)
       	
       	//eliminate input outputs
       	transformInputOutputs(tl.traces, sclModel.definitions)
       	
       	'''
		«/* Generate the header */»
		«generateHeader()»
		«/*Generate entity */»
		«createEntity(tl.traces, modelname, sclModel.definitions)»
       	'''
   	}
   	
   	
    def transformInputOutputs(EList<trace> traces, EList<VariableDefinition> modelVariables) { 
        
        traces.forEach[ trace |
            trace.ticks.forEach[ tick |
                tick.extraInfosOutput.forEach[ output |
                    modelVariables.forEach[ vari |
                        if(vari.name.equals(output.key)){
                            if(vari.input && vari.output){
                                output.key = output.key + "_out"
                            } 
                        }
                    ] 
                ]
            ]
        ]
        
    }


   // -------------------------------------------------------------------------   
   /**
    * Generate the header for generated VHDl code
    * 
    * @return VHDL header comment and library include
    * 
    */
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
    /**
     * Generates the whole VHDL testbench entity with the whole functionality
     * 
     * @param esotracelist
     *          the whole ESO tracelist for which the testbench should be created
     * 
     * @param entityName
     *          the name for the testbench entity
     * 
     * @param vars
     *          the variable declaration from the proper SCL model  
     * 
     * @return the complete VHDL entity including simulation process 
     */
   	def createEntity(EList<trace> esoTracelist, String entityName, EList<VariableDefinition> vars){

    // Store input and output variables from SCL model
    val modelInputs = new ArrayList<VariableDefinition>
    val modelOutputs = new ArrayList<VariableDefinition>
    
    // Get Input and Output from Model and save them
    vars.forEach[ variable | 
    	if(variable.input && variable.output){
    	    modelInputs.add(variable)
    	    var tempVar = variable.copy
    	    tempVar.name = variable.name + "_out"
    	    modelOutputs.add(tempVar)
    	} else if(variable.input) {
    	    modelInputs.add(variable)
    	} else if(variable.output){
    	    modelOutputs.add(variable)
    	}
		// local variables (variable.input == false and variable.output == false) not needed here
		// modelInput and modelOutput are mainly used to generate VHDL interfaces
    ]
    
    // start creating testbench
    
	'''«/* Entity declaration from testbench entity */»
	ENTITY «entityName»_tb IS    
	END «entityName»_tb;
	
	ARCHITECTURE behavior OF «entityName»_tb IS
	«/* Generate component port declaration from the to tested VHDL component  */»
	«generateComponent(modelInputs, modelOutputs, entityName)»
	
	--Inputs«/* Declare local signals for all input signals */»
	«modelInputs.map( in |'''«generateVhdlSignalFromVariableWithInitialValue(in,"")»''').join('\n')»
	
	--Outputs«/* Declare local signals for all output signals*/»
	«modelOutputs.map( out |'''«generateVhdlSignalFromVariableWithInitialValue(out,"")»''').join('\n')»
	
	--Control«/* Generate control signals, every component (generated from SCL) need a tick and reset port */»
	signal reset : boolean := false;
	signal tick : std_logic := '0';
	signal term : boolean := false;
	constant tick_period : time := 100 ns;
	
	BEGIN«/* fill testbench with functionality */»
	    «/* instantiate the Unit Under Test (SCL-VHDL-model)  */»
		«generateUUT(modelInputs, modelOutputs, entityName)»
	    
	    «/* The testbench simulates the tick, generate that process */»
		«generateTickProcess()»

	    «/* Here the simulation process is created */»
		«generateSimulation(esoTracelist, modelInputs, modelOutputs)»
	
	END;
    '''
	}
		
	//-------------------------------------------------------------------------
	/**
     * Generate Unit Under Test (UUT) instantiation from the to tested VHDL component
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     ** @param uutName
     *         the name for the UUT, this name must be the same like the component name from 
     *         generated component from the SCL model and from the component declaration in the testbench
     * 
     * @return a String which contains VHDL code for the component declaration
     */
	def generateUUT(ArrayList<VariableDefinition> inputArray, ArrayList<VariableDefinition> outputArray, String uutName) {
		 
		// compute the mapping from the component to local signals
		// e.g. A_in => A_in (the component signal name and the local single name are equal)
		val ins = inputArray.map( input |'''«input.name» => «input.name»''').join(',\n');
		val outs = outputArray.map( output |'''«output.name» => «output.name»''').join(',\n');
		
		// compute the whole signal mapping, the last entry in the Port map has no ',' (VHDL syntax)
		// if there are no inputs and output res should be empty, 
		// not null (null will be a String in VHDL code)
		val res =  if(!(ins.nullOrEmpty && outs.nullOrEmpty))
						ins + (if(!(outs.nullOrEmpty || ins.nullOrEmpty)){ ',\n'}else{'\n'}) + 
						'''--Outputs''' + '\n' + outs
		
		// Generate VHDL code
		'''
		uut: «uutName» PORT MAP(
			tick => tick,
			reset => reset,
			term => term«if(!res.nullOrEmpty)',\n' + '''--Inputs'''+ '\n' + res»
		);
	    '''
	}
	
	//-------------------------------------------------------------------------
	/**
	 * Generates the tick process.
	 * The tick will be simulated in the testbench
	 * 
	 * @return the VHDl code for the tick process
	 * 
	 */
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
	/**
     * Generate the simulation process
     * Generate a simulation process which sets all inputs according to the ESO tracelist and test
     * if all outputs carry their values according to the ESO tracelist else a assertion is hurt
     * 
     * @param esoTracelist
     *         the whole tracelist from ESO file
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     * @return a String which contains VHDL code for the simulation process
     */
	def generateSimulation(EList<trace> esoTracelist, ArrayList<VariableDefinition> inputArray, ArrayList<VariableDefinition> outputArray) { 
	
	'''
	-- Stimulus process
	stim_proc: process
	begin		
		wait for 1 ps;
		
		--simulation process
		«generateSimulationAssertions(esoTracelist, inputArray, outputArray)»
		wait;
	end process;
	'''
	}
	
	//-------------------------------------------------------------------------
	/**
     * Generate simulation assertions
     * Here are all inputs set according to the ESO tracelist and tested
     * if all outputs carry their values according to the ESO tracelist else a assertion is hurt
     * This setting and testing is done for every tick. Between the ticks a reset is generated
     * 
     * @param esoTracelist
     *         the whole tracelist from ESO file
     * 
     * @param inputArray 
     *         contains all input variables from SCL model
     *
     * @param outputArray 
     *         contains all output variables from SCL model
     * 
     * @return a String which contains VHDL code for the assertions for all ticks
     */
	def generateSimulationAssertions(EList<trace> esoTracelist, ArrayList<VariableDefinition> inputArray, ArrayList<VariableDefinition> outputArray) { 
		
		// VHDL code which waits a certain time
		val String wait = '''wait for tick_period;''' + '\n' 
		
		// contains VHDL code for each tick
		simTick = ""
		// contains the VHDL code all traces 
		simTraces = ""
		// a counter, contains the number of the current trace
		traceCnt = 1
	
		// for all traces and all ticks generate simulation code
		esoTracelist.forEach[ trace | 
			
			// at each new trace generate  the reset code which resets the model
			simTick = "\n--NEW TRACE\n" + generateVhdlResetCode(wait)	//Reset on every new Trace
            
            // a counter, it contains the number of the current tick
			tickCnt = 1
			
			// for all ticks inside a trace generate VHDL simulation code
			trace.ticks.forEach[ tick | 
			    
				// clear field bevor genarate new code
                setInputs = ""
			    
			    // Generate VHDL code 
				setInputs = setInputs + tick.extraInfos.map[ kvp |
                    '''«kvp.key» <= «kvp.valueFromKvPair»;'''].join('\n')				
					
				// if setInputs is null or empty, set it to an empty string, otherwise if it is null
				// there will be a null written in the VHDL code.					
				if(setInputs.nullOrEmpty)
					setInputs = ""
				
				// Generate VHDL code
				// The assertion contains the following failing info: in which trace, in which tick, 
				// which signal and the expected value
				asserts = ""
                asserts = asserts + tick.extraInfosOutput.map[ kvp |
                    '''
                        assert( «kvp.key» = «kvp.valueFromKvPair» )
                            report "«numberToString(traceCnt)» trace: «numberToString(tickCnt)» tick: «kvp.key» should have been «kvp.valueFromKvPair»"
                            severity ERROR;''' + ''
                ].join('\n')	
				
				// Compute code that is needed for one tick
				// simTicks contains (at the end) the complete tick code for ONE trace
				// add some additional comments 
				simTick =  simTick + ("\n--" + " tick " + tickCnt.toString + '\n')+ setInputs + '\n' + wait + asserts + '\n'
														
				// the tick counter shows the current tick in the current trace
				tickCnt = tickCnt + 1
			]
			// simTrace contains (at the end) the simulation code for all traces
			simTraces = simTraces + simTick 
						
			// counter for the number of traces
			traceCnt = traceCnt + 1
		]
		// Return simulation code for all traces (including all ticks)
		simTraces
	}
	
    //-------------------------------------------------------------------------
    //------------- H E L P E R - M E T H O D S -------------------------------
	//-------------------------------------------------------------------------
	
	/**
	 * loads the SCL model from a given file
	 * 
	 * @param modelile
	 *             contains the file which holds the SCL model
	 * 
	 * @return the SCL model from file 
	 */
	def Program loadModel(File modelFile) { 

        val IPath iPath = new Path(modelFile.toString())
                
        val EObject eobject = ModelUtil::loadEObjectFromModelFile(iPath)
        
        //check if the file contains an SCL model
        if(eobject instanceof Program){
            val Program sclModel = eobject as Program
            sclModel
        }else{
            return null
        }   
    }
    
	/**
	 * Computes a string to a given number
	 * e.g. 1 will be transformed to 1st
	 * 
	 * @param number
	 *         the number which should be transformed to a string
	 * 
	 * @return the string number 
	 */
	def numberToString(int number) { 
		switch number{	
			case number == 1: number.toString + "st"
			case number == 2: number.toString + "nd"
			case number == 3: number.toString + "rd"
			default         : number.toString + "th" 
		}
	}
	
	/**
	 * Generates VHDL code for a reset
	 * 
	 * @return the VHDL code for a reset
	 */
	def String generateVhdlResetCode(String wait) { 
		"reset <= true;\n".concat(wait).concat("reset <= false;\n");
	}
	
	/**
	 * Returns the kvpair value as String
	 * 
	 * @param kvp
	 *         the ESO KeyValuePair
	 * 
	 * @return the KeyValuePair value as a string
	 * 
	 */
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
	
}