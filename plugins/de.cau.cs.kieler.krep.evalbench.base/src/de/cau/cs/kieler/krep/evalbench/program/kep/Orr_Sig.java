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

public class Orr_Sig extends SigRegInst {

	public Orr_Sig(Register reg,KepSignal sig, SCLine sc) {
		super(Constants.ORR_SIG.getOpcode(),Constants.ORR_SIG.getInfo(),reg, sig, sc);

	}
}
