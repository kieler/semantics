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

public class AddrSigInstruction extends AddrInstruction {

	KepSignal sig;

	public AddrSigInstruction(String id, String name, KepSignal sig, Label addr, SCLine sc) {
		super(id,name,addr,sc);
		this.sig=sig;

	}
	@Override
	public String toString(){
		return mnemonic + " " + sig.toString() + ", " + addr.toString();
	}
	@Override
	public String encode(){
		return ""+super.encode()+sig.encode();
	}

	@Override
	public String info() {
		return super.info()+" "+sig.info();
	}

	/* (non-Javadoc)
	 * @see kasm.classes.Instruction#length()
	 */
	@Override
	public int length() {
		return super.length()+sig.length();
	}



}
