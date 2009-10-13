/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.evalbench.comm.*;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;

/**
 * Interface for assemblers that transform assembler files into binary object
 * code.
 * 
 * @author msp, ctr
 */

public interface IAssembler {

	public String getName();

	/**
	 * Assemble a given program string and return object code information in
	 * readable hex coded format. In the returned array each string represents
	 * an instruction.
	 * 
	 * @param name
	 *            Name of the program
	 * @param program
	 *            assembler program
	 * @throws ParseException
	 *             when the input string has an invalid format
	 */
	public void assemble(String name, String program) throws ParseException;

	/**
	 * Assemble a given program string and generated object code in readable hex
	 * coded format and instruction array
	 * 
	 * @param name
	 *            Name of the program
	 * @param program
	 *            assembler program
	 * @throws ParseException
	 *             when the input string has an invalid format
	 */
	public void assemble(String name, Reader program) throws ParseException;

	/**
	 * After a program has been assembled, a list of input signals can be
	 * extracted.
	 * 
	 * @return list of input signals of the last assembled program
	 */
	public LinkedList<Signal> getInputs();

	/**
	 * After a program has been assembled, a list of output signals can be
	 * extracted.
	 * 
	 * @return list of output signals of the last assembled program
	 */
	public LinkedList<Signal> getOutputs();

	/**
	 * After a program has been assembled, an array with the contained
	 * instructions can be extracted. Each array element is a triple of strings;
	 * the first string contains the instruction index; the second one contains
	 * a label name, e.g. <code>"loop0:"<code>,
	 * or an empty string if there is no label for that instruction.
	 * The third string contains the readable assembler instruction code.
	 * 
	 * @return array with instructions (nr., label, code)
	 */
	public String[][] getInstructions();

	/**
	 * After a program has been assembled, an array with the contained
	 * object-code can be extracted.
	 * 
	 * @param c
	 *            configuration of the current processor
	 * 
	 * @return array with hex-code
	 */
	public String[] getObj(Config c);

	/**
	 * Check whether the Assembler can be executed on the current processor This
	 * should check, whether the correct processor (KEP/KReP) is used, and
	 * whether it has enough resources, like number of signals, etc.
	 * 
	 * @param c
	 *            the configuration
	 * @return null if processor can execute this program. Otherwise a detailed
	 *         message why the execution is not possible is returned.
	 * */
	public String canExecute(Config c);

	/**
	 * @return mapping to get signal index for each valid signal in the program
	 */
	public HashMap<String, Integer> getSignalIndex();

	/**
	 * compute at which line in the assembler code a absolute pc is displayed.
	 * This takes label into account.
	 * 
	 * @param i
	 *            absolute address in memory
	 * @return the line in the source code
	 */
	public int adr2row(int i);

	/**
	 * The number of instructions in the program. This value is only available
	 * after the assembling took place.
	 * 
	 * @return size of the program in instructions.
	 */
	public int size();

}
