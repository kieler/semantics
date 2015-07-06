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
package de.cau.cs.kieler.core.model.codegeneration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Java Application for simple C Beautifier.
 * 
 * @author cmot
 * 
 */
public class SimpleCBeautifier {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out
                    .println("\njava -jar SimpleCBeautifier.jar <filename> [-[o|a] filename] [-n] [-loc] [-t] [-s] [-d ,] [-i \"  \"] [-v]");
            System.out.println("");
            System.out.println("The first argument always specifies the input file name.");
            System.out.println("-o filename   : Write output to an output file");
            System.out.println("-a filename   : Append output to an output file");
            System.out.println("-n            : Output file name");
            System.out.println("-loc          : Output file size (lines of code)");
            System.out.println("-t            : Output beautifying time in ms");
            System.out.println("-s            : Skip the beautify process, output is input");
            System.out.println("-d delimiter  : Delimiter for separating n|loc|t, default ';'");
            System.out.println("-i indentpart : Indent part, default is \"   \" (3 spaces)");
            System.out.println("-v            : Verbose output information (not written in file)");
            System.out.println("");
            System.out.println("If -n, -loc, or -t are chosen then the output is NOT the c code.");
            return;
        }
        boolean verbose = false;
        boolean append = false;
        String outputFile = null;
        boolean skip = false;
        String delemiter = ";";
        String indentPart = "   ";

        ArrayList<String> outputs = new ArrayList<String>();

        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                String arg = args[i];

                if (arg.toLowerCase().equals("-o")) {
                    append = false;
                    if (args.length >= i + 1) {
                        outputFile = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-a")) {
                    append = true;
                    if (args.length >= i + 1) {
                        outputFile = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-d")) {
                    if (args.length >= i + 1) {
                        delemiter = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-i")) {
                    if (args.length >= i + 1) {
                        indentPart = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-loc")) {
                    outputs.add("loc");
                } else if (arg.toLowerCase().equals("-t")) {
                    outputs.add("time");
                } else if (arg.toLowerCase().equals("-n")) {
                    outputs.add("name");
                } else if (arg.toLowerCase().equals("-s")) {
                    skip = true;
                } else if (arg.toLowerCase().equals("-v")) {
                    verbose = true;
                }
            }
        }

        // System.out.println("loc=" + loc + ", skip=" + skip + ", outputFile="+outputFile);

        String inputFilePath = args[0];
        String inputFileName = "";

        try {
            File f = new File(inputFilePath);
            inputFileName = f.getName();

            verbosePrint("Reading", verbose, false);
            Scanner scanner = new Scanner(f);
            String input = scanner.useDelimiter("\\Z").next();
            scanner.close();

            verbosePrint(" DONE", verbose);

            verbosePrint("Beautifying ...", verbose, false);

            String output = "";
            long start = System.currentTimeMillis();
            if (!skip) {
                output = beautify(input, indentPart);
            } else {
                output = input;
            }
            long locNumber = output.split("\n").length;
            long resultTime = System.currentTimeMillis() - start;

            verbosePrint(" DONE", verbose);

            verbosePrint("Writing output ...", verbose, false);
            if (outputs.size() > 0) {
                output = "";
                for (String outputType : outputs) {
                    if (outputType.equals("name")) {
                        if (output.length() > 0) {
                            output += delemiter;
                        }
                        output += inputFileName;
                    }
                    if (outputType.equals("loc")) {
                        if (output.length() > 0) {
                            output += delemiter;
                        }
                        output += locNumber + "";
                    }
                    if (outputType.equals("time")) {
                        if (output.length() > 0) {
                            output += delemiter;
                        }
                        output += resultTime + "";
                    }
                }
                output += "\n";
            }

            if (outputFile != null) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, append));
                writer.write(output);
                // Close writer
                writer.close();
                verbosePrint(" DONE", verbose);
            } else {
                if (verbose) {

                }
                verbosePrint(" DONE", verbose);
                System.out.print(output);
            }

        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void verbosePrint(String text, boolean verbose, boolean linebreak) {
        if (verbose) {
            if (!linebreak) {
                System.out.print(text);
            } else {
                System.out.println(text);
            }
        }
    }

    static void verbosePrint(String text, boolean verbose) {
        verbosePrint(text, verbose, true);
    }

    // -------------------------------------------------------------------------

    private static HashMap<Integer, String> indentStringCache = null;
    private static String indentPartChache = null;

    /**
     * Gets the indent string using a specific indentPart. This method builds up a cache in order to
     * be able to quickly respond. If the indentPart changes this method automatically revokes the
     * cache.
     * 
     * @param indent
     *            the indent
     * @param indentPart
     *            the indent part
     * @return the indent string
     */
    private static String getIndentString(int indent, String indentPart) {
        if (indentPart != indentPartChache) {
            indentPartChache = indentPart;
            indentStringCache = null; // revoke cache
        }
        if (indentStringCache == null || !indentStringCache.containsKey(indent)) {
            if (indentStringCache == null) {
                indentStringCache = new HashMap<Integer, String>();
            }
            String indentStringTmp = "";
            while (indent > 0) {
                indentStringTmp += indentPart;
                indent--;
            }
            indentStringCache.put(indent, indentStringTmp);
        }
        return indentStringCache.get(indent);
    }

    // -------------------------------------------------------------------------

    /** The characters before which we want to prevent a space character. */
    static private char[] noSpaceBeforeCharacters = { ';', '(', ')', '&', '|', '!', ',' };

    /** The characters after which we want to prevent a space character. */
    static private char[] noSpaceAfterCharacters = { ';', '(', ')', '&', '|', '!', ',' };

    // /** The characters before which we want to assure a space character. */
    // static private char[] spaceBeforeCharacters = {'='};
    //
    // /** The characters after which we want to assure a space character. */
    // static private char[] spaceAfterCharacters = {'='};

    /**
     * Beautify incoming C code. Do this by using Java reflection to access String's internal char
     * array for best performance. Need setAccessible(true) because the char array is private. Use
     * StringBuilder for building the new String. Supports indention
     * 
     * @param text
     *            the text
     * @return the string
     * @throws NoSuchFieldException
     *             the no such field exception
     * @throws SecurityException
     *             the security exception
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public static String beautify(String text, String indentPart) throws NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {

        StringBuilder modifiedOutput = new StringBuilder();

        int indent = 0;

        boolean stringMode = false;

        int brackets = 0;

        boolean spaceBefore = false;

        // if true, then set spaceBefore to TRUE in the next iteration (because we want to eliminate
        // MORE spaces)
        boolean nextSpaceBefore = false;

        char[] chars = null;

        // flag indicating an active long comment '/*' => leave next line break, do not indent or
        // remove spaces
        // stop ONLY at comment end '*/'
        boolean longComment = false;

        // if a long comment ended, we want to accept the NEXT line break. if this flag is true this
        // means we
        // have an ended long comment without a next line break yet which we are searching for
        boolean lineBreakAfterLongComment = false;

        // flag indicating an active short comment '//' => leave next line break, do not indent or
        // remove spaces
        // stop at next line break
        boolean shortComment = false;

        int indentPartLength = indentPart.length();

        // Field field = (Field) String.class.getField("value");
        Class<String> c = String.class;
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true); // bye-bye "private"

            // ALthough String.class.getField("value") throws a
            // NoSuchField exception, this way works, alas.
            if ("value" == f.getName()) {
                chars = (char[]) f.get(text);
                break;
            }
        }

        final int len = chars.length;
        for (int i = 0; i < len; i++) {
            char character = chars[i];

            if (!stringMode) {
                if (character == '(') {
                    brackets++;
                }
                if (character == ')') {
                    brackets--;
                }
            }

            if (nextSpaceBefore) {
                nextSpaceBefore = false;
                spaceBefore = true;
            }

            // Comment handling start
            char nextCharacter = '.';
            if (i + 1 < len) {
                nextCharacter = chars[i + 1];
            }
            if (character == '/' && nextCharacter == '*') {
                longComment = true;
            } else if (character == '/' && nextCharacter == '/' && !longComment) {
                shortComment = true;
            } else if (character == '*' && nextCharacter == '/' && longComment) {
                longComment = false;
                lineBreakAfterLongComment = true;
                i++;
                modifiedOutput.append(character);
                modifiedOutput.append(nextCharacter);
                continue;
            } else if (character == '\n' && shortComment) {
                shortComment = false;
                modifiedOutput.append(character);
                continue;
            } else if (character == '\n' && lineBreakAfterLongComment) {
                lineBreakAfterLongComment = false;
                // accept this line break
                modifiedOutput.append(character);
                continue;
            }

            if (shortComment || longComment) {
                modifiedOutput.append(character);
                continue;
            }
            // Comment handling end

            // handle strings
            if (character == '"' && !stringMode) {
                stringMode = true;
            }
            if (stringMode) {
                if (character == '"' && stringMode) {
                    stringMode = false;
                }
                // in stringMode, just copy the characters
                modifiedOutput.append(character);
                continue;
            }

            // eliminate superfluous space characters
            if (character == ' ') {
                boolean found = false;
                for (char noSpaceBeforeCharacter : noSpaceBeforeCharacters) {
                    if (nextCharacter == noSpaceBeforeCharacter) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    i++; // skip space
                    character = nextCharacter;
                    if (i + 1 < len) {
                        nextCharacter = chars[i + 1];
                    }
                }
            }
            if (nextCharacter == ' ') {
                boolean found = false;
                for (char noSpaceAfterCharacter : noSpaceAfterCharacters) {
                    if (character == noSpaceAfterCharacter) {
                        nextSpaceBefore = true;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    i++; // skip space
                }
            }

            if (character == '\n' || character == '\r') {
                // if (c > 2 && text.substring(c - 2, c).equals("*/")) {
                // modifiedOutput += "\n";
                // }
                spaceBefore = true; // no space at line begin
                continue;
            } else if (character == ' ') {
                if (!spaceBefore) {
                    spaceBefore = true;
                    modifiedOutput.append(" ");
                }
                continue;
            } else if (character == '{') {
                modifiedOutput.append("{\n");
                indent++;
                if (indent > 0) {
                    modifiedOutput.append(getIndentString(indent, indentPart));
                }
                spaceBefore = true; // no space at line begin
            } else if (character == '}') {
                // now we must erase one INDENTPART from the tail of modifiedOUtput
                // modifiedOutput = modifiedOutput.substring(0, modifiedOutput.length() -
                // INDENTPART.length());
                modifiedOutput.delete(modifiedOutput.length() - indentPartLength,
                        modifiedOutput.length());

                modifiedOutput.append("}\n");
                indent--;
                if (indent > 0) {
                    modifiedOutput.append(getIndentString(indent, indentPart));
                }
                spaceBefore = true; // no space at line begin
            } else if (character == ';' && brackets <= 0) { // && brackets == 0 because we do not
                                                            // want to break within for loops
                modifiedOutput.append(";\n");
                if (indent > 0) {
                    modifiedOutput.append(getIndentString(indent, indentPart));
                }
                spaceBefore = true; // no space at line begin
            } else if (character == ';' && brackets > 0) { // && brackets == 0 because we do not
                                                           // want to break within for loops
                modifiedOutput.append("; ");
                spaceBefore = true; // no space at line begin
            } else {
                spaceBefore = false;
                modifiedOutput.append(character);
            }
        }

        return modifiedOutput.toString();
    }

    // -------------------------------------------------------------------------

}

