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
 package de.cau.cs.kieler.scl.vhdl.xtend

import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment

/**
 * Transformation of SCL code into VHDL code.
 * 
 * @author gjo
 */
class SCL2VHDL { 
    
    // General method to create the c simulation interface.
	def transform (Program program) {
       '''
	   «/* Generate the header */»
       «header(program)»

	   «/* Generate the tick function */»
	   «tickFunction(program)»
       '''
   } 	

   // -------------------------------------------------------------------------   
   
   // Generate the header.
   def header(Program program) {
   	'''
	/*****************************************************************************/
	/*               G E N E R A T E D     V H D L    C O D E                    */
	/*****************************************************************************/
	/* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
	/*                                                                           */
	/* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
	/* Copyright 2013 by                                                         */
	/* + Christian-Albrechts-University of Kiel                                  */
	/*   + Department of Computer Science                                        */
	/*     + Real-Time and Embedded Systems Group                                */
	/*                                                                           */
	/* This code is provided under the terms of the Eclipse Public License (EPL).*/
	/*****************************************************************************/
	''' 
   }
   
   // -------------------------------------------------------------------------
   
   // Generate the  tick function.
   def tickFunction(Program program) {
       val statementSequence = program as StatementSequence;
       val statements = statementSequence.statements;
   	'''    int tick(){
       «FOR statement : statements»
       «statement.expand»
       «ENDFOR»
	   TICKEND;
    }
	'''
   }
   
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------
   
   // Expand an empty statement
   def dispatch expand(EmptyStatement statement) {
   		'''noop'''
   }

   // Expand an instruction statement
   def dispatch expand(InstructionStatement statement) {
        '''«statement.instruction.expand»'''
   }
   
   // Expand a PAUSE instruction.
   def dispatch expand(Pause pauseInstruction) {
   	'''PAUSE;'''
   }   

   // Expand all other instructions.
   def dispatch expand(Instruction elseInstruction) {
    '''OTHERINSTRUCTION;'''
   }   
   
   // -------------------------------------------------------------------------   
}
