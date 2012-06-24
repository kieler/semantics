/*
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
 */
package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The Class MOMLBuilder.
 * 
 * @author cmot
 */
public class MOMLBuilder {

    // ----------------------------------------------------------------------------

    /**
     * Instantiates a new mOML builder.
     */
    public MOMLBuilder() {
        // content = new TypedCompositeActor();
    }

    // ----------------------------------------------------------------------------

    /**
     * Write MOML to.
     * 
     * @param file
     *            the file
     * @return true, if successful
     */
    public boolean writeMomlTo(final File file) {
        try {
            FileWriter fstream = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("<?xml version=\"1.0\" standalone=\"no\"?>");
            out.write("<!DOCTYPE entity PUBLIC \"-//UC Berkeley//DTD"
                    + " MoML 1//EN\" \n \"http://ptolemy.eecs.berkeley."
                    + "edu/xml/dtd/MoML_1.dtd\">");

            // out.write(this.content.exportMoMLPlain());

            out.flush();
            out.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // ----------------------------------------------------------------------------

}
