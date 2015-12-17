/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.testcases.sccharts;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.core.Language;

/**
 * @author nfl
 *
 */
public class AO implements ITestcase {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return "SCCharts - AO";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getLanguage() {
        return Language.SCCharts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTestcase() {

        String path = "";
        String test = "tests/sccharts/ao.sct";

        try {
            URL url = new URL("platform:/plugin/de.cau.cs.kieler.comparison.testcases/" + test);
            path = FileLocator.resolve(url).getPath().toString();
        } catch (IOException e) {
            // should never happen
            e.printStackTrace();
        }

        return path;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getInputTrace() {
        // TODO Auto-generated method stub
        return null;
    }

}
