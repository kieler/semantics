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

import java.util.Locale;


public abstract class Identifer {

	String name;
	Integer id;

	public Identifer(){}

	public Identifer(String name, Integer id) {
		this.name = name;
		if(id==null){
		  if(this.name.toUpperCase(Locale.ENGLISH).equals("TICK")){
		      id = 0;
		  }
		}
		this.id=id;
	}

	public abstract int length();
	public abstract String encode();
	public abstract String info();

	public String toString(){
		return name;
	}

	public String print(){
		StringBuffer result = new StringBuffer();
		result.append(name);
		while (result.length()<Constants.instr_width) result.append(" ");
		return result.toString()+"\t\t"+this.id+"\t"+this.encode();
	}

	public String getValidName() {
		if ((name.equals("_COUNT"))
		    ||(name.equals("R0"))
			||(name.equals("R1"))
			||(name.equals("R2"))
			||(name.equals("R3"))
			||(name.equals("TICK"))
			||(name.equals("_TICKLEN"))
			)
			return "";
		else
		return name;
		}
	public String getName() {return name;}

	public Integer getId() {return id;}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String encode(int width){
		String result ="";
		result = Integer.toBinaryString(this.id);
		while (result.length()<width) result="0"+result;
		assert result.length()==width: "Opcode length for "+name+" should be "+width+" but is "+result.length()+"!";

		return result;
	}
}
