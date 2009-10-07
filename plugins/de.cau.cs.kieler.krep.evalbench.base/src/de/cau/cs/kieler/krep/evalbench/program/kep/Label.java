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

public class Label extends Identifer {
	int line;
	public Label(String name, Integer addr,int line) {
		super(name, addr);
		this.line=line;
	}

	public Label(String name, Integer addr) {
		super(name, addr);

	}

	public String toString(){
		return name;
	}

	public String encode(){
		return super.encode(Program.constants.addr_width);
	}

	public String info() {
		String  result ="";
		while (result.length()<Program.constants.addr_width) result+="A";
		return result;
	}
	public String print(){
		return super.print()+"\t["+this.line+"]";
	}
	
	public String printLabel(){
		String result =name;
		while (result.length()<Constants.max_LabelPrint) result+=" ";
		return result;
	}

	public int length(){
		return Program.constants.addr_width;
	}
}
