/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Main class for an example collector.
 * 
 * @author pkl
 * 
 */
public abstract class ExampleCollector {

    /**
     * Loads the examples.
     * 
     */
    public abstract void load();

    /**
     * Returns the loaded examplePool.
     * 
     * @return a Map with exampleId as key and example as value.
     */
    public abstract Map<String, Example> getExamplePool();

    /**
     * Getter for {@link SourceType}. Every collector should have one.
     * 
     * @return {@link SourceType}
     */
    public abstract SourceType getSourceType();

    /**
     * Makes a {@link String} representation of examples.
     * 
     * @return {@link List} of {@link String}
     */
    public List<String> getExamplesAsStrings() {
        List<String> examplesAsString = new ArrayList<String>();
        for (Example example : getExamplePool().values()) {
            examplesAsString.add(example.toString());
        }
        return examplesAsString;
    }

}
