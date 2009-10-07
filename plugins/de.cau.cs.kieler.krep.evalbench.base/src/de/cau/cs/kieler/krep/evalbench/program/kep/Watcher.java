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

public class Watcher extends Identifer {

    public Watcher(int ident) {

	if (ident > Program.constants.max_watcher)
	    throw new IllegalArgumentException("Watcher ID (" + ident
		    + ") is greater then " + Program.constants.max_watcher);
	this.id = ident;

    }

    public String encode() {
	{
	    String result = "";
	    if (this.id != null) {
		result = super.encode(Program.constants.watcher_width);
	    } else
		while (result.length() < Program.constants.watcher_width)
		    result += "0";
	    assert result.length() == Program.constants.watcher_width : "Opcode length for watcher should be "
		    + Program.constants.watcher_width
		    + " but is "
		    + result.length() + "!";

	    return result;
	}

    }

    @Override
    public String toString() {
	return String.valueOf(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#info()
     */
    @Override
    public String info() {
	String result = "";
	while (result.length() < Program.constants.watcher_width)
	    result += "W";
	return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#length()
     */
    @Override
    public int length() {
	return Program.constants.watcher_width;
    }

}
