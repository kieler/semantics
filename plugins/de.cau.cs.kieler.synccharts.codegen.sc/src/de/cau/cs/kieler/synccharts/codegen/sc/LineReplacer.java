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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class to replace lines by rules in text files.
 * 
 * @author tam
 */
public class LineReplacer {

    private static ArrayList<Tuple<String, Tuple<String, String>>> rules;
    private static File file;
    private static BufferedReader in;
    private static FileWriter fw;
    private static BufferedWriter bw;

    /**
     * The constructor with a list of rules for replacement as argument.
     * 
     * @param replacingRules
     *            list of rules for replacement.
     */
    public LineReplacer(final ArrayList<Tuple<String, Tuple<String, String>>> replacingRules) {
        super();
        rules = replacingRules;
    }

    /**
     * Clears the list of rules.
     */
    public void clearRules() {
        rules.clear();
    }

    /**
     * The constructor without arguments. It creates an empty rule list.
     * 
     */
    public LineReplacer() {
        super();
        rules = new ArrayList<Tuple<String, Tuple<String, String>>>();
    }

    /**
     * @return the replacingRules
     */
    public ArrayList<Tuple<String, Tuple<String, String>>> getReplacingRules() {
        return rules;
    }

    /**
     * @param replacingRules
     *            the replacingRules to set
     */
    public void setReplacingRules(
            final ArrayList<Tuple<String, Tuple<String, String>>> replacingRules) {
        rules = replacingRules;
    }

    /**
     * @param replacingFile
     *            the file to set
     */
    public void setFile(final File replacingFile) {
        file = replacingFile;
    }

    /**
     * @return the rules
     */
    public static ArrayList<Tuple<String, Tuple<String, String>>> getRules() {
        return rules;
    }

    /**
     * Adds a rule to the list of rules.
     * 
     * @param rule
     *            the rule to add
     */
    public void addRule(final Tuple<String, Tuple<String, String>> rule) {
        rules.add(rule);
    }

    /**
     * Adds a rule to the list of rules.
     * 
     * @param contains
     *            the string, the line must contain to replace something
     * 
     * @param toReplace
     *            the string that will be replaced
     * @param replacement
     *            the replacement
     */
    public void addRule(final String contains, final String toReplace, final String replacement) {
        Tuple<String, String> rule = new Tuple<String, String>();
        Tuple<String, Tuple<String, String>> completeRule = new Tuple<String, Tuple<String, String>>();
        rule.setO1(toReplace);
        rule.setO2(replacement);
        completeRule.setO1(contains);
        completeRule.setO2(rule);
        rules.add(completeRule);
    }

    /**
     * Applies the replacing rules to the set file.
     * 
     * @throws IOException for file operations
     */
    public void replace() throws IOException {
        String newFile = file.getParent() + File.separator + "temp.c";
        newFile.replaceAll("[/\\\\]+", "\\" + File.separator);
        File tempFile = new File(newFile);
        String line;

        fw = new FileWriter(tempFile);
        bw = new BufferedWriter(fw);

        in = new BufferedReader(new FileReader(file));
        while ((line = in.readLine()) != null) {
            line = replaceLine(line);
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        //FIXME: renaming does not work on windows?
        tempFile.renameTo(file);
    }

    /*
     * Replaces a given string if a rule from the list rules matches.
     */
    private static String replaceLine(final String line) {
        String out = line;
        for (Tuple<String, Tuple<String, String>> rule : rules) {
            String contains = rule.getO1();
            Tuple<String, String> onlyRule = rule.getO2();
            String toReplace = onlyRule.getO1();
            String replacement = onlyRule.getO2();
            if (line.contains(contains)) {
                if (line.matches(".*" + toReplace + ".*")) {
                    out = line.replaceAll(toReplace, replacement);
                    break;
                }
            }
        }
        return out;
    }

}
