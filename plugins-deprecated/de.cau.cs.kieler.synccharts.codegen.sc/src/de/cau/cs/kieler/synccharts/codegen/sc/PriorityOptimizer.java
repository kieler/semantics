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
 *
 *****************************************************************************/

package de.cau.cs.kieler.synccharts.codegen.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class to optimize the priority numbers of a given SC-File.
 * The optimization includes only the reduction of used integers.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 */
public class PriorityOptimizer {

    private static ArrayList<Integer> priorities = new ArrayList<Integer>();
    private static LineReplacer lineReplacer = new LineReplacer();
    private static File file;

    /**
     * Constructor that sets the file.
     * 
     * @param f
     *            file to optimize priorities for
     */
    public PriorityOptimizer(final File f) {
        file = f;
    }

    /**
     * Starts the optimization of the given file and replaces all unoptimized priorities.
     * 
     * @throws IOException
     *             if file does not exist
     */
    public void optimize() throws IOException {
        priorities.clear();
        insertPriorities();
        setRules();
        lineReplacer.setFile(file);
        lineReplacer.replace();
    }

    /**
     * Returns the maximal number of thread id's.
     * 
     * @return max thread id
     */
    public int getMaxThreadPrio() {
        return priorities.size() + 1;
    }

    /*
     * Adds the needed rules to the list of rules.
     */
    private static void setRules() {
        lineReplacer.clearRules();
        for (Integer priority : priorities) {
            int newPriority = priorities.indexOf(priority) + 1;
            String prioToReplace = "PRIO\\s*\\(\\s*" + priority + "\\s*\\)";
            String prioReplacement = "PRIO\\(" + newPriority + "\\)";
            lineReplacer.addRule("PRIO", prioToReplace, prioReplacement);

            String tickstartToReplace = "TICKSTART\\s*\\(\\s*" + priority + "\\s*\\)";
            String tickstartReplacement = "TICKSTART\\(" + newPriority + "\\)";
            lineReplacer.addRule("TICKSTART", tickstartToReplace, tickstartReplacement);

            String forkToReplace = ",\\s*" + priority + "\\s*\\)";
            String forkReplacement = ", " + newPriority + "\\)";
            lineReplacer.addRule("FORK", forkToReplace, forkReplacement);
        }
    }

    /*
     * Inserts the computed priorities into the list of priorities. 
     */
    private static void insertPriorities() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = in.readLine()) != null) {
            int prio = getPriority(line);
            if (prio > 0 && !priorities.contains(prio)) {
                addSort(prio);
            }
        }
    }

    /*
     * Inserts an integer into a sorted list.
     */
    private static void addSort(final int add) {
        boolean added = false;
        for (int i = 0; i < priorities.size(); i++) {
            if (priorities.get(i) > add) {
                priorities.add(i, add);
                added = true;
                break;
            }
        }
        if (!added) {
            priorities.add(priorities.size(), add);
        }
    }

    /*
     * Returns the priority a String has a corresponding statement. 
     */
    private static int getPriority(final String line) {
        String newLine = "";
        int out = 0;
        if (line.contains("PRIO")) {
            newLine = line.replaceAll(".*PRIO\\(\\s*", "");
            newLine = newLine.replaceAll("[\\D\\s]*\\).*", "");
        } else if (line.contains("TICKSTART")) {
            newLine = line.replaceAll(".*TICKSTART\\(\\s*", "");
            newLine = newLine.replaceAll("[\\D\\s]*\\).*", "");
        } else if (line.contains("FORK(")) {
            newLine = line.replaceAll(".*FORK\\(.*,\\s*", "");
            newLine = newLine.replaceAll("[\\D\\s]*\\).*", "");
        }
        if (!newLine.equals("")) {
            out = Integer.parseInt(newLine);
        }
        return out;
    }
}
