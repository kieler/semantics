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

import de.cau.cs.kieler.sccharts.timing.TimingAnnotationProvider;

/**
 * Postprocessing of the generated Code so that the kta tool can work with it
 * 
 * @author ima
 *
 */
public class KTACodePreparer implements ICodePreparer {
	
	private TimingAnnotationProvider timingAnnotationProvider = new TimingAnnotationProvider();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String adaptCode(String code, String uriString) {
		String codeInt = code.replace("char", "int");
		code = codeInt;

		// Code additions to make the code stand-alone-executable
		StringBuilder codeAdditionBuilder = new StringBuilder();
		codeAdditionBuilder.append("\n\n/* Header file for Timing program points */" 
		    + "\n#include \"../tpp.h\"");
		String assumptionFile = uriString.replace(".sct", ".asu");
		String assumptionFilePath = assumptionFile.replace("file:", "");
		timingAnnotationProvider.writeStubs(assumptionFilePath, 
				codeAdditionBuilder);
		String codeAdapted = code.replace("***/\nint", "***/" + codeAdditionBuilder.toString() 
		      + "\nint");
		return codeAdapted;
	}

}
