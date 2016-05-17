/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.testcaseprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.ITestcaseProvider;
import de.cau.cs.kieler.comparison.core.Language;
import de.cau.cs.kieler.comparison.core.LanguageException;

/**
 * The CsvTestcaseProvider is used to augment test cases with properties specified in a CSV file.
 * 
 * @author nfl
 */
public class CsvTestcaseProvider implements ITestcaseProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "CSV Testcase Provider";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getExtension() {
        return ".csv";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<ITestcase> createTestcases(final File file) {
        ArrayList<ITestcase> ret = new ArrayList<ITestcase>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            // each line specifies the properties of one test case
            for (String testcaseLine = br.readLine(); testcaseLine != null; testcaseLine =
                    br.readLine()) {
                Testcase test = Testcase.fromCsvString(file, testcaseLine);
                if (test != null) {
                    String fileName = test.getPath().getFileName().toString();
                    int index = fileName.lastIndexOf(".");
                    if (index != -1) {
                        String extension = fileName.substring(index);
                        try {
                            test.setLanguage(Language.fromExtension(extension));
                            ret.add(test);
                        } catch (LanguageException e) {
                            // Language unknown
                            // TODO better error logging
                            System.out.println("Language of test case " + test.getID() + " ("
                                    + test.getPath() + ") could not be parsed");
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // File not found -> return empty collection
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                // not much to do in this case, except maybe logging
            }
        }

        return ret;
    }
}
