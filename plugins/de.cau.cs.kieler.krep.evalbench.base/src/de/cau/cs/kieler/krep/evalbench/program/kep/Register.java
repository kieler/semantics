/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Register extends Identifer {

	public Register(String name, Integer reg) {
		super(name, reg);
	}
	@Override
	public String toString(){
		return name;
	}
	@Override
	public String encode(){
		return super.encode(Constants.reg_width);
	}
	
	@Override
	public String info(){
		String result ="";
		while (result.length()<Constants.reg_width) result+="R";
		return result;
	}
	@Override
	public int length(){
		return Constants.reg_width;
	}
	public String printlst(){
		return "% ["+this.toString()+"]     ("+this.id+")  "+this.name;
	}
}
