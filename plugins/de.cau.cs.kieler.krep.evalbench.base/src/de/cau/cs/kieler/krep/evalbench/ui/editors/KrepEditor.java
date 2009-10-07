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
