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
