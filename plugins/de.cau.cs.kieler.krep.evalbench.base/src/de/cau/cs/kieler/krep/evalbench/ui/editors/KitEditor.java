/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui.editors;

import de.cau.cs.kieler.krep.evalbench.comm.*;
import de.cau.cs.kieler.krep.evalbench.program.*;

/**
 * An editor for KEP assembler files that uses the functionality of the abstract
 * <code>AssemblerEditor</code>.
 * 
 * @author ctr
 */
public class KitEditor extends AssemblerEditor {

	/**
	 * Creates a KASM editor using the external assembler.
	 */
	public KitEditor() {
		// assembler = new KasmAssembler();
		assembler = new KitAssembler();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see krep.evalbench.ui.editors.AssemblerEditor#getProtocolType()
	 */
	@Override
	public String getProtocolType() {
		// KASM files are related to the KEP protocol
		return ICommunicationProtocol.P_KEP;
	}

}
