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


public class RegisterInst extends Instruction{
	
	Register target;
	
	public RegisterInst (String id, String name,Register target, SCLine sc) {
		super(id, name, sc);
		this.target = target;
	}
	
	public String encode(){
		return super.encode()+target.encode();
	}
	@Override
	public String toString(){
		return super.toString() + target.toString();
	}
	public String info(){
		return super.info()+" "+target.info();
	}
	public int length(){
		return super.length()+target.length();
	}
}
