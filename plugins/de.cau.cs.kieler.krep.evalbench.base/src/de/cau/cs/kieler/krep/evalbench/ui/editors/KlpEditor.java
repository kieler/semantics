package de.cau.cs.kieler.krep.evalbench.ui.editors;

import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;

/**
 * 
 * @author ctr
 *
 */
public class KlpEditor extends AssemblerEditor {
    /** 
     * generate empty editor
     */
    public KlpEditor() {
	super();
	assembler = new KlpAssembler();
    }

    @Override
    public String getProtocolType() {
	return ICommunicationProtocol.P_KREP;
    }

}
