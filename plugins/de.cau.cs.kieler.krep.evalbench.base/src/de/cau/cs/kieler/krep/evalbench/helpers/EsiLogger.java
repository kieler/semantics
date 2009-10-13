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
package de.cau.cs.kieler.krep.evalbench.helpers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EsiLogger {

	BufferedWriter esi = null;

	public EsiLogger(String fileName) {
		super();
		if (fileName != null && fileName.length() > 0) {
			File f = new File(fileName);
			try {
				esi = new BufferedWriter(new FileWriter(f));
				reset();
			} catch (IOException e) {
				e.printStackTrace();
				esi = null;
			}
		}
	}

	public void reset() {
		if (esi != null) {
			try {
				esi.write("!reset;\n");
			} catch (IOException e) {
				e.printStackTrace();
				esi = null;
			}
		}
	}

	public void write(String io) {
		if (esi != null) {
			try {
				esi.write(io);
				esi.flush();
			} catch (IOException e) {
				e.printStackTrace();
				esi = null;
			}
		}
	}

	public void comment(String comment) {
		if (esi != null) {
			try {
				esi.write("% ");

				esi.write(comment);
				esi.write('\n');
			} catch (IOException e) {
				e.printStackTrace();
				esi = null;
			}
		}
	}

}
