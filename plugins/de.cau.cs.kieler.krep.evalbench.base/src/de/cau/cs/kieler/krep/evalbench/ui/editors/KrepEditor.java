package de.cau.cs.kieler.krep.evalbench.ui.editors;

import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.program.KrepAssembler;

/**
 * An editor for KREP assembler files that uses the functionality of the
 * abstract <code>AssemblerEditor</code>.
 * 
 * @author  ctr
 */
public class KrepEditor extends AssemblerEditor {

    /**
     * Creates a KASM editor using the external assembler.
     */
    public KrepEditor() {
	assembler = new KrepAssembler();
    }

    @Override
    public String getProtocolType() {
	return ICommunicationProtocol.P_KREP;
    }

}
