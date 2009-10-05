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
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr Configuration of the different processors
 */
public abstract class Config {
	protected enum Kind {
		KEP, KRP, KLP
	}

	protected Kind kind;

	/**
	 * @return true if the current processor is a Lustre processor
	 */
	public boolean isKLP() {
		return kind == Kind.KLP;
	}

	/**
	 * @return true if the current processor is a Kiel Esterel processor
	 */
	public boolean isKEP() {
		return kind == Kind.KEP;
	}

	/**
	 * 
	 * @return true if the current processor is a Multicore reactive processor
	 */
	public boolean isKRP() {
		return kind == Kind.KRP;
	}

}
