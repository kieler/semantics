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
 * 
 */
public class LineReplacer {

    static private ArrayList<Tuple<String, String>> rules;
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
    public LineReplacer(final ArrayList<Tuple<String, String>> replacingRules) {
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
        rules = new ArrayList<Tuple<String, String>>();
    }

    /**
     * @return the replacingRules
     */
    public ArrayList<Tuple<String, String>> getReplacingRules() {
        return rules;
    }

    /**
     * @param replacingRules
     *            the replacingRules to set
     */
    public void setReplacingRules(final ArrayList<Tuple<String, String>> replacingRules) {
        rules = replacingRules;
    }

    /**
     * @param file
     *            the file to set
     */
    public void setFile(File replacingFile) {
        this.file = replacingFile;
    }

    /**
     * @return the rules
     */
    public static ArrayList<Tuple<String, String>> getRules() {
        return rules;
    }

    /**
     * Adds a rule to the list of rules.
     * 
     * @param rule
     *            the rule to add
     */
    public void addRule(final Tuple<String, String> rule) {
        rules.add(rule);
    }

    /**
     * Adds a rule to the list of rules.
     * 
     * @param toReplace
     *            the string that will be replaced
     * @param replacement
     *            the replacement
     */
    public void addRule(final String toReplace, final String replacement) {
        Tuple<String, String> rule = new Tuple<String, String>();
        rule.setO1(toReplace);
        rule.setO2(replacement);
        rules.add(rule);
    }

    /**
     * Applies the replacing rules to the set file.
     * 
     * @throws IOException
     */
    public void replace() throws IOException {
        File tempFile = new File("temp");
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
        tempFile.renameTo(file);
    }

    private static String replaceLine(String line) {
        String out = line;
        for (Tuple<String, String> rule : rules) {
            String toReplace = rule.getO1();
            String replacement = rule.getO2();
            if (line.matches(".*" + toReplace + ".*")) {
                out = line.replaceAll(toReplace, replacement);
                break;
            }
        }
        return out;
    }

}
