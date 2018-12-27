/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.csv;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ssm
 * @kieler.design 2018-10-12 proposed
 * @kieler.rating 2018-10-12 proposed yellow
 */
class CSVTable {
    
    private String[][] table;
    
    CSVTable(String source, char delim, int cols) {
        List<String[]> tLines = new LinkedList<String[]>();
            
        StringBuilder builder = new StringBuilder();
        String[] line = new String[cols];
        boolean inQuotes = false;
        int col = 0;
        for(int i = 0; i<source.length(); i++) {
            char c = source.charAt(i);
            
            if ((c == delim || c == '\n' ) && !inQuotes) {
                line[col] =  builder.toString();
                builder.setLength(0);
                if (c == '\n') {
                    tLines.add(line);
                    line = new String[cols];
                    col = 0;                    
                } else {
                    col++;
                }
            } else if (c == '"') {
                inQuotes = !inQuotes;
            } else {
                builder.append(c);
            }
        }
        
        table = tLines.toArray(new String[tLines.size()][cols]);
    }

    public String[][] getTable() {
        return table;
    }

}