/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.textcount;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Java Application for evaluation of text files.
 * 
 * @author cmot
 * 
 */
public class TextCount {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out
                    .println("\njava -jar TextCount.jar <filename> [-[o|a] filename] [-c key1 key2 ... keyn] [-d ;] [-ncs]");
            System.out.println("");
            System.out.println("The first argument always specifies the input file name.");
            System.out.println("-o filename   : Write output to an output file");
            System.out.println("-a filename   : Append output to an output file");
            System.out.println("-c key        : Count number of occurrences of key");
            System.out.println("-d delimiter  : Delimiter for separating n|loc|t, default ','");
            System.out.println("-ncs          : No case sensitivity");
            System.out.println("");
            return;
        }
        boolean ncs = false;
        boolean append = false;
        String outputFile = null;
        boolean keymode = false;
        String delemiter = ",";
        ArrayList<String> keys = new ArrayList<String>();

        ArrayList<String> outputs = new ArrayList<String>();

        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                String arg = args[i];

                if (arg.toLowerCase().equals("-o")) {
                    keymode = false;
                    append = false;
                    if (args.length >= i + 1) {
                        outputFile = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-a")) {
                    keymode = false;
                    append = true;
                    if (args.length >= i + 1) {
                        outputFile = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-d")) {
                    keymode = false;
                    if (args.length >= i + 1) {
                        delemiter = args[i + 1];
                        i++;
                        continue;
                    }
                } else if (arg.toLowerCase().equals("-c")) {
                    keymode = true;
                    continue;
                } else if (arg.toLowerCase().equals("-ncs")) {
                    keymode = false;
                    ncs = true;
                } else if (keymode) {
                    keys.add(arg);
                }
            }
        }

        // System.out.println("loc=" + loc + ", skip=" + skip + ", outputFile="+outputFile);

        String inputFilePath = args[0];
        String inputFileName = "";

        try {
            File f = new File(inputFilePath);
            inputFileName = f.getName();

            Scanner scanner = new Scanner(f);
            String input = scanner.useDelimiter("\\Z").next();
            scanner.close();

            if (ncs) {
                input = input.toLowerCase();
                
                ArrayList<String> newKeys = new ArrayList<String>();
                for (int c = 0; c < keys.size(); c++) {
                    newKeys.add(keys.get(c).toLowerCase());
                }
                keys = newKeys;
            }
            HashMap<String, Integer> numbers = count(input, keys);

            String output = "";
            output += inputFileName;
            for (String key : keys) {
                int number = numbers.get(key);
                if (output.length() > 0) {
                    output += delemiter;
                }
                output += number;
            }
            output += "\n";

            if (outputFile != null) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, append));
                writer.write(output);
                // Close writer
                writer.close();
            } else {
                System.out.print(output);
            }

        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Count keys and output an hashmap with resulting numbers.
     *
     * @param text the text
     * @param keys the keys
     * @return the string
     * @throws NoSuchFieldException the no such field exception
     * @throws SecurityException the security exception
     * @throws IllegalArgumentException the illegal argument exception
     * @throws IllegalAccessException the illegal access exception
     */
    public static HashMap<String, Integer> count(String text, List<String> keys)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException,
            IllegalAccessException {

        char[] chars = null;
        
        HashMap<String, Integer> returnMap = new HashMap<String, Integer>();
        for (String key : keys) {
            returnMap.put(key, 0);
        }

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
        for (String key : keys) {

            char[] keyChar = key.toCharArray();
            int keyLen = keyChar.length;
            int ok = 0;

            for (int i = 0; i < len; i++) {

                char character = chars[i];

                if (chars.length > i - ok + keyLen) {
                    if (character == keyChar[ok]) {
                        ok++;
                        if (ok == keyLen) {
                            ok = 0;
                            add(key, returnMap);
                        }
                    } else {
                        ok = 0;
                    }

                }
            }
        }

        return returnMap;
    }

    static void add(String key, HashMap<String, Integer> map) {
        int c = map.get(key) + 1;
        map.put(key, c);
    }

    // -------------------------------------------------------------------------

}
