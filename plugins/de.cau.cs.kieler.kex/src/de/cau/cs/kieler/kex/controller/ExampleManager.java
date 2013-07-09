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
 */
package de.cau.cs.kieler.kex.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.kex.controller.util.ExampleExport;
import de.cau.cs.kieler.kex.controller.util.ExampleImport;
import de.cau.cs.kieler.kex.model.Category;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.model.SourceType;
import de.cau.cs.kieler.kex.model.database.DBExampleCollector;
import de.cau.cs.kieler.kex.model.plugin.PluginExampleCollector;
import de.cau.cs.kieler.kex.model.plugin.PluginExampleCreator;

/**
 * This class manages the import and export in kex. It represents the bridge from kex.ui to kex
 * code.
 * 
 * @author pkl
 * 
 */
public final class ExampleManager {

    private static ExampleManager instance = new ExampleManager();

    /**
     * set true, if examples has been loaded, otherwise false.
     */
    private boolean isLoaded;

    private final PluginExampleCollector extensionCollector;
    private final DBExampleCollector databaseCollector;

    private final PluginExampleCreator extensionCreator;

    private ExampleManager() {
        this.extensionCollector = new PluginExampleCollector();
        this.extensionCreator = new PluginExampleCreator();
        this.databaseCollector = new DBExampleCollector();
    }

    /**
     * Singleton call of {@link ExampleManager}.
     * 
     * @return {@link ExampleManager}
     */
    public static synchronized ExampleManager get() {
        return instance;
    }

    /**
     * Loads examples, if not loaded before.
     * 
     * @param forceLoad
     *            , set this parameter to force loading of examples
     */
    public void load(final boolean forceLoad) {
        if (!this.isLoaded || forceLoad) {
            load();
            // after completely loaded
            this.isLoaded = true;
        }
    }

    /**
     * searches the examplepool of a source for a special example.
     * 
     * @param type
     *            , {@link SourceType}
     * @param exampleId
     *            , {@link String}
     * @return {@link Example}
     */
    public Example getExample(final SourceType type, final String exampleId) {
        if (type == SourceType.KIELER) {
            if (isLoaded) {
                Map<String, Example> examplePool = extensionCollector.getExamplePool();
                Example example = examplePool.get(exampleId);
                if (example != null) {
                    return example;
                } else {
                    // FIXME throw a more specific exception
                    throw new RuntimeException(ErrorMessage.NO_EXAMPLE_FOUND + exampleId);
                }
            } else {
                return PluginExampleCollector.getExample(exampleId);
            }
        }
        if (type == SourceType.PUBLIC) {
            // search in online interface for example
            return DBExampleCollector.getExample(exampleId);
        }
        return null;
    }

    private void load() {
        this.extensionCollector.load();
        // TODO test impl of an online interface.
        this.databaseCollector.load();
    }

    /**
     * Adds all examples of a the collectors to the result map.
     * 
     * @return {@link Map} with {@link String} as key and {@link Example} as value.
     */
    public Map<String, Example> getExamples() {
        Map<String, Example> result = this.extensionCollector.getExamplePool();
        result.putAll(databaseCollector.getExamplePool());
        return result;
    }

    /**
     * Creates a resultlist with categories of collectors.
     * 
     * @return {@link List} of {@link String}.
     */
    public List<Category> getCategories() {
        List<Category> result = new ArrayList<Category>();
        result.addAll(databaseCollector.getCategories());
        result.addAll(extensionCollector.getCategories());
        return result;
    }

    /**
     * This method calls an validate and uses the {@link ExampleImport} to import examples.
     * 
     * @param selectedResource
     *            , {@link IPath}
     * @param selectedExamples
     *            , {@link List} of {@link Example}
     * @param checkDuplicate
     *            , boolean
     * @return {@link List} of {@link String}
     * @throws Exception
     *             if anything goes wrong.
     */
    public List<String> importExamples(final IPath selectedResource,
            final List<Example> selectedExamples, final boolean checkDuplicate) throws Exception {
        ExampleImport.validate(selectedResource, selectedExamples, checkDuplicate);
        return ExampleImport.importExamples(selectedResource, selectedExamples, checkDuplicate);
    }

    /**
     * Validates the import and imports the given example.
     * 
     * @param destination
     *            path to import the example to.
     * @param example
     *            the example to import.
     * @param checkDuplicate
     *            whether to check for import duplicates or not.
     * @return list of resources to open.
     * @throws Exception
     *             if anything goes wrong.
     */
    public List<String> importExample(final IPath destination, final Example example,
            final boolean checkDuplicate) throws Exception {

        ExampleImport.validate(destination, Lists.newArrayList(example), checkDuplicate);
        return ExampleImport.importExample(destination, example, checkDuplicate);
    }

    /**
     * Exports a given example. Created and deleted categories will managed, too.
     * 
     * @param properties
     *            , {@link Map} with {@link ExampleElement} as key and {@link Object} as value.
     */
    public void export(final Map<ExampleElement, Object> properties) {
        if (SourceType.KIELER.equals(properties.get(ExampleElement.SOURCETYPE))) {
            ExampleExport.exportInPlugin(properties, this.extensionCreator);
            // } else if
            // (SourceType.PUBLIC.equals(properties.get(ExampleElement.SOURCETYPE)))
            // {
            // // TODO build online interface
        } else {
            // FIXME throw a more specific exception
            throw new RuntimeException(ErrorMessage.NO_SOURCETYPE);
        }
    }

    /**
     * Loads a default picture.
     * 
     * @return {@link InputStream}
     */
    public InputStream getEmptyPic() {
        return ExampleImport.getEmptyPic();
    }

    /**
     * Checks if an project is accessible. If not, checks if exists, if not a new project with first
     * segment of resourcePath becomes create. Then the project becomes open.
     * 
     * @param resourcePath
     *            , IPath of import location.
     */
    public void generateProject(final IPath resourcePath) {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject(resourcePath.segment(0));
        if (!project.isAccessible()) {
            IProgressMonitor progressMonitor = new NullProgressMonitor();
            try {
                if (!root.exists(Path.fromPortableString(project.getName()))) {
                    project.create(progressMonitor);
                }
                project.open(progressMonitor);
            } catch (CoreException e) {
                // should not happen :-)
            }
        }
    }
}
