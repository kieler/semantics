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
package de.cau.cs.kieler.sccharts.timing;

/**
 * A code preparer is used to postprocess the generated code so that a special timing analysis tool can 
 * work with it. 
 * 
 * @author ima
 *
 */
public interface ICodePreparer {
	
	/**
	 * Method postprocesses the code code string for a given analysis tool.
	 * @param code
	 * @return
	 */
	public String adaptCode(String code, String uriString);

}
