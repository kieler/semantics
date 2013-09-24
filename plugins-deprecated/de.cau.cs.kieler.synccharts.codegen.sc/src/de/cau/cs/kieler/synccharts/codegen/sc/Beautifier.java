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

/**
 * 
 * A utility class to beautify the generated SC-code. After generating code the file will be read in
 * and written out by formating it with some rules.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 */
public class Beautifier {

    private static File inFile;
    private static File outFile;
    private static BufferedReader in;
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static String seperator = "%_@__END_OF_LINE__@_%";

    /**
     * 
     * The constructor to set the input- and output file.
     * 
     * @param input
     *            input file
     * @param output
     *            output file
     * 
     */
    public Beautifier(final File input, final File output) {
        inFile = input;
        outFile = output;
    }

    /**
     * Starts the beautifying mechanism.
     * 
     * @throws IOException if file does not exist or writing into a file fails
     * 
     */
    public void bueatify() throws IOException {
        writeOutputFile();
    }

    /*
     * write the output file after applying some formating rules
     */
    private static void writeOutputFile() throws IOException {
        String[] lines = setNewLines().split("\n");
        fw = new FileWriter(outFile);
        bw = new BufferedWriter(fw);
        int tabNumber = 0;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (line.endsWith("}")) {
                tabNumber--;
            }
            newLineEnd(line, "TICKEND;");

            newLineBegin(line, "void");
            newLineBegin(line, "typedef enum");
            newLineBegin(line, "int");
            newLineBegin(line, "const char");
            newLineBegin(line, "#define");
            newLineBegin(line, "#ifndef");
            newLineBegin(line, "#include");

            if (!line.endsWith(":")) {
                bw.write(tabs(tabNumber));
            } else {
                bw.newLine();
            }
            bw.write(line);
            bw.newLine();
            newLineEnd(line, "isInit){");
            newLineEnd(line, "misc.h\"");

            if (line.endsWith("{")) {
                tabNumber++;
            }
        }
        bw.close();
    }

    /*
     * Some rules to set a new line
     */
    private static String setNewLines() throws IOException {
        String line = getCleanString(inFile);
        line = line.replaceAll(seperator + "int", "\nint");
        line = line.replaceAll(seperator + "void", "\nvoid");
        line = line.replaceAll(seperator + "unsigned", "\nunsigned");
        line = line.replaceAll(";" + seperator, ";\n");
        line = line.replaceAll(":" + seperator, ":\n");
        line = line.replaceAll("\\)\\{", ") {");
        line = line.replaceAll("\\) \\{" + seperator, ") {\n");
        line = line.replaceAll("\\}" + seperator, "}\n");
        line = line.replaceAll("\\*\\/" + seperator, "*/\n");
        line = line.replaceAll("h\"" + seperator, "h\"\n");
        line = line.replaceAll("c\"" + seperator, "c\"\n");
        line = line.replaceAll(">" + seperator, ">\n");
        line = line.replaceAll(";\\}", ";\n}");
        line = line.replaceAll("\t", "");
        line = addSurroundingSpaces(line, "==");
        line = addSurroundingSpaces(line, "\\|\\|");
        line = addSurroundingSpaces(line, "&&");
        line = line.replaceAll(seperator, "");
        return line;
    }

    /*
     * add a space before and after a given sign in a given line
     */
    private static String addSurroundingSpaces(final String line, final String sign) {
        String out = line;
        while (out.contains(" " + sign)) {
            out = out.replaceAll(" " + sign, sign);
        }
        while (out.contains(sign + " ")) {
            out = out.replaceAll(sign + " ", sign);
        }
        out = out.replaceAll(sign, " " + sign + " ");
        return out;
    }

    /*
     * add tabs with help of given tabNumber
     */
    private static String tabs(final int tabNumber) {
        String out = "";
        for (int i = 0; i < tabNumber; i++) {
            out += "\t";
        }
        return out;
    }

    /*
     * add a new line command at the end of a given string
     */
    private static void newLineEnd(final String line, final String s) throws IOException {
        if (line.endsWith(s)) {
            bw.newLine();
        }
    }
    
    /*
     * add a new line command at the beginning of a given string
     */
    private static void newLineBegin(final String line, final String s) throws IOException {
        if (line.startsWith(s)) {
            bw.newLine();
        }
    }

    /*
     * removes leading white spaces
     */
    private static String removeLeadingWhitespaces(final String line) {
        String out = line;
        while (out.startsWith("\t") || out.startsWith(" ")) {
            out = out.substring(1);
        }
        return out;
    }

    /*
     * removes white spaces at the end of a line
     */
    private static String removeRetailWhitespaces(final String line) {
        String out = line;
        while (out.endsWith("\t") || out.endsWith(" ")) {
            out = out.substring(0, out.length() - 1);
        }
        return out;
    }

    /*
     * returns the file content as clean (reduces white spaces) string
     */
    private static String getCleanString(final File fileName) throws IOException {
        String out = "";
        String line;

        in = new BufferedReader(new FileReader(fileName));

        while ((line = in.readLine()) != null) {
            line = removeLeadingWhitespaces(line);
            line = removeRetailWhitespaces(line);
            if (!line.isEmpty()) {
                out += line + seperator;
            }
        }
        return out;
    }
}
