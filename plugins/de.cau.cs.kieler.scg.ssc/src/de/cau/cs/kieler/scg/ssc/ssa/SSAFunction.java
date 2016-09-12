/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa;

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public enum SSAFunction {
    
	PHI("de.cau.cs.kieler.scg.ssc.ssa.phi", "\u03A6"),
	INIT("de.cau.cs.kieler.scg.ssc.ssa.init", "I"), //"\u03A0"
	UPDATE("de.cau.cs.kieler.scg.ssc.ssa.update", "U"), //"\u03A8"
	READ("de.cau.cs.kieler.scg.ssc.ssa.read", "R"), //"\u03A6"
	JOIN("de.cau.cs.kieler.scg.ssc.ssa.join", "R"), //"\u03A6"
	SEQ("de.cau.cs.kieler.scg.ssc.ssa.seq", "seq"),
	CONC("de.cau.cs.kieler.scg.ssc.ssa.conc", "conc"),
	COMBINE("de.cau.cs.kieler.scg.ssc.ssa.combine", "combine");

	private SSAFunction(String id, String symbol) {
		this.id = id;
		this.symbol = symbol;
	}

	private final String id;
	private final String symbol;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
}
