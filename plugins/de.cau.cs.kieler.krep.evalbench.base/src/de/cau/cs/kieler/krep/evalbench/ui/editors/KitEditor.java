package de.cau.cs.kieler.krep.evalbench.ui.editors;

import de.cau.cs.kieler.krep.evalbench.comm.*;
import de.cau.cs.kieler.krep.evalbench.program.*;

/**
 * An editor for KEP assembler files that uses the
 * functionality of the abstract <code>AssemblerEditor</code>.
 * 
 * @author ctr
 */
public class KitEditor extends AssemblerEditor {

	/**
	 * Creates a KASM editor using the external assembler.
	 */
	public KitEditor() {
	//	assembler = new KasmAssembler();
	    assembler = new KitAssembler();
	}

	/*
	 * (non-Javadoc)
	 * @see krep.evalbench.ui.editors.AssemblerEditor#getProtocolType()
	 */
	@Override
	public String getProtocolType() {
		// KASM files are related to the KEP protocol
		return ICommunicationProtocol.P_KEP;
	}
	
}
