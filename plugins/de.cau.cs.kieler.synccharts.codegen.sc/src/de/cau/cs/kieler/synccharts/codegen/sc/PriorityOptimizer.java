package de.cau.cs.kieler.synccharts.codegen.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
