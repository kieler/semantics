package de.cau.cs.kieler.krep.evalbench.ui.editors;

import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.program.KasmAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;

public class LstEditor extends AssemblerEditor {

	/**
	 * Creates a KASM editor using the external assembler.
	 */
	public LstEditor() {
		assembler = new KasmAssembler();
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
