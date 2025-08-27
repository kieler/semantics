/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.timing;

/**
 * @author ima
 *
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


    public class FileWriter {
        public void writeToFile(String content, String uri) {
 
                FileOutputStream fop = null;
                File file;
 
                try {
 
                        file = new File(uri);
                        fop = new FileOutputStream(file);
 
                        // create the file, if not already existent
                        if (!file.exists()) {
                                file.createNewFile();
                        }
 
                        // get the content in bytes
                        byte[] contentInBytes = content.getBytes();
 
                        fop.write(contentInBytes);
                        fop.flush();
                        fop.close();
 
                } catch (IOException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (fop != null) {
                                        fop.close();
                                }
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }
}

