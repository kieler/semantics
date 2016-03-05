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
package de.cau.cs.kieler.kex.model.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.cau.cs.kieler.kex.model.Category;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.model.ExampleCollector;
import de.cau.cs.kieler.kex.model.SourceType;

/**
 * this is an example for extending KEX with online examples.
 * 
 * @author pkl
 * 
 */
public class DBExampleCollector extends ExampleCollector {

    private final Map<String, Example> examplePool = new HashMap<String, Example>();

    private final List<Category> categories = new ArrayList<Category>();

    // private final DatabaseHandler dbHandler;

    /**
     * Creates a new DBExampleCollector.
     */
    public DBExampleCollector() {
        // dbHandler = new DatabaseHandler();
    }

    @Override
    public Map<String, Example> getExamplePool() {
        return examplePool;

    }

    @Override
    public void load() {
        // database.loadExample();
    }

    /**
     * searches an example for a examle title.
     * 
     * @param exampleTitle
     *            , String
     * @return {@link Example}
     */
    public static Example getExample(final String exampleTitle) {
        // to implement
        return null;
    }

    /**
     * Getter for categories.
     * 
     * @return {@link List} of {@link String}
     */
    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public SourceType getSourceType() {
        return SourceType.PUBLIC;
    }

}
