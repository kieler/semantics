package de.cau.cs.kieler.synccharts.codegen.sc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Beautifier {

    private static File inFile;
    private static File outFile;
    private static BufferedReader in;
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static String seperator = "%_@__END_OF_LINE__@_%";

    public Beautifier(File input, File output) {
        inFile = input;
        outFile = output;
    }

    public void bueatify() {
        try {
            writeOutputFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeOutputFile() throws Exception {
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
            if (!line.startsWith("int valSigInt")) {
                newLineBegin(line, "int");
            }
            if (!line.endsWith(":")) {
                bw.write(tabs(tabNumber));
            } else {
                bw.newLine();
            }
            bw.write(line);
            bw.newLine();
            newLineEnd(line, "isInit){");
            newLineEnd(line, "misc.h\"");
            newLineEnd(line, "char*);");
            newLineEnd(line, "};");

            if (line.endsWith("{")) {
                tabNumber++;
            }
        }
        bw.close();
    }

    private static String setNewLines() throws Exception {
        String line = getCleanString(inFile);
        line = line.replaceAll(";" + seperator, ";\n");
        line = line.replaceAll(":" + seperator, ":\n");
        line = line.replaceAll("\\)\\{", ") {");
        line = line.replaceAll("\\) \\{" + seperator, ") {\n");
        line = line.replaceAll("\\}" + seperator, "}\n");
        line = line.replaceAll("\\*\\/" + seperator, "*/\n");
        line = line.replaceAll("h\"" + seperator, "h\"\n");
        line = line.replaceAll(">" + seperator, ">\n");
        line = line.replaceAll(";\\}", ";\n}");
        line = line.replaceAll("\t", "");
        line = addSurroundingSpaces(line, "==");
        line = addSurroundingSpaces(line, "\\|\\|");
        line = addSurroundingSpaces(line, "&&");
        line = addSurroundingSpaces(line, "<=");
        line = addSurroundingSpaces(line, ">=");
        line = line.replaceAll(seperator, "");
        return line;
    }

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
    
    private static String tabs(final int tabNumber) {
        String out = "";
        for (int i = 0; i < tabNumber; i++) {
            out += "\t";
        }
        return out;
    }

    private static void newLineEnd(String line, String s) throws Exception {
        if (line.endsWith(s)) {
            bw.newLine();
        }
    }

    private static void newLineBegin(String line, String s) throws Exception {
        if (line.startsWith(s)) {
            bw.newLine();
        }
    }

    private static String removeLeadingWhitespaces(String line) {
        while (line.startsWith("\t") || line.startsWith(" ")) {
            line = line.substring(1);
        }
        return line;
    }

    private static String removeRetailWhitespaces(String line) {
        while (line.endsWith("\t") || line.endsWith(" ")) {
            line = line.substring(0, line.length() - 1);
        }
        return line;
    }

    private static String getCleanString(File fileName) throws Exception {
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
