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
 */
package de.cau.cs.kieler.kex.controller.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.w3c.dom.Node;

import de.cau.cs.kieler.kex.controller.ErrorMessage;
import de.cau.cs.kieler.kex.controller.ExampleElement;
import de.cau.cs.kieler.kex.controller.ExportResource;
import de.cau.cs.kieler.kex.model.Category;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.model.ExampleResource;
import de.cau.cs.kieler.kex.model.ExampleResource.Type;
import de.cau.cs.kieler.kex.model.SourceType;
import de.cau.cs.kieler.kex.model.plugin.PluginExampleCreator;

/**
 * A collection of example export functions.
 * 
 * @author pkl
 * 
 */
public final class ExampleExport {

    private static final String PROJECT_CLASS = "org.eclipse.core.internal.resources.Project";
    private static final String FOLDER_CLASS = "org.eclipse.core.internal.resources.Folder";
    private static final String FILE_CLASS = "org.eclipse.core.internal.resources.File";

    private static final String IMAGES_FOLDER = "images";

    private ExampleExport() {
        // should not called
    }

    /**
     * extends a plugin with a new example.
     * 
     * @param properties
     *            , {@link Map} with {@link ExampleElement} as key and an {@link Object} as value.
     * @param extensionCreator
     *            , {@link PluginExampleCreator}
     */
    @SuppressWarnings("unchecked")
    public static void exportInPlugin(final Map<ExampleElement, Object> properties,
            final PluginExampleCreator extensionCreator) {

        File destFile = new File((String) properties.get(ExampleElement.DEST_LOCATION));
        if (!destFile.exists()) {
            // FIXME throw a more specific exception
            throw new RuntimeException(ErrorMessage.DESTFILE_NOT_EXIST + destFile.getPath());
        }

        Example mappedExample = ExampleExport.mapToExample(properties);
        List<Category> creatableCategories = (List<Category>) properties
                .get(ExampleElement.CREATE_CATEGORIES);

        extensionCreator.setPluginXML(IOHandler.filterPluginXML(destFile));
        Node extensionKEX = extensionCreator.filterExtensionKEX(extensionCreator.getPluginNode());
        extensionCreator.checkDuplicate(extensionKEX, mappedExample.getId(), creatableCategories);

        File project = IOHandler.filterPluginProject(destFile);
        List<ExportResource> exportResources = (List<ExportResource>) properties
                .get(ExampleElement.RESOURCES);
        List<IPath> finishedResources = new ArrayList<IPath>();
        try {

            extensionCreator.copyResources(destFile, exportResources, finishedResources);
            mappedExample.addResources(ExampleExport.mapToExampleResource(exportResources));
            String picPath = (String) properties.get(ExampleElement.OVERVIEW_PIC);
            String absOverviewPic = null;
            if (picPath != null && picPath.length() > 1) {
                absOverviewPic = copyOverviewPic(picPath, extensionCreator, project,
                        finishedResources);
            }

            extensionCreator.addExtension(extensionKEX, destFile, mappedExample,
                    (List<Category>) properties.get(ExampleElement.CREATE_CATEGORIES),
                    absOverviewPic);
        } catch (RuntimeException e) {
            extensionCreator.deleteExampleResources(finishedResources);
            throw e;
        }
    }

    private static String copyOverviewPic(final String overviewPic,
            final PluginExampleCreator extensionCreator, final File projectFile,
            final List<IPath> finishedResources) {

        StringBuilder stringBuilder = new StringBuilder();
        File destFile = new File(stringBuilder.append(projectFile.getPath())
                .append(File.separatorChar).append(IMAGES_FOLDER).toString());
        if (!destFile.exists()) {
            try {
                destFile.mkdir();
            } catch (SecurityException se) {
                se.printStackTrace();
            }
        }
        String absolutePath = extensionCreator.copyOverviewPic(destFile.getPath(), overviewPic,
                finishedResources);
        return absolutePath;
    }

    /**
     * mapping of properties onto an example.
     * 
     * @param properties
     *            , Map<String, Object>
     * @param rootResource
     * @return Example
     */
    public static Example mapToExample(final Map<ExampleElement, Object> properties) {
        String title = (String) properties.get(ExampleElement.TITLE);
        String catId = ((Category) properties.get(ExampleElement.CATEGORY)).getId();
        Example result = new Example(ExampleExport.exampleIDCreator(catId, title), title, catId,
                SourceType.KIELER);
        result.setDescription((String) properties.get(ExampleElement.DESCRIPTION));
        result.setContact((String) properties.get(ExampleElement.CONTACT));
        result.setAuthor((String) properties.get(ExampleElement.AUTHOR));
        result.setRootDir((String) properties.get(ExampleElement.DEST_LOCATION));
        result.setOverviewPic((String) properties.get(ExampleElement.OVERVIEW_PIC));
        return result;
    }

    private static String exampleIDCreator(final String category, final String title) {
        return category + title.trim().replace(' ', '_');
    }

    private static List<ExampleResource> mapToExampleResource(
            final List<ExportResource> exportResources) {
        List<ExampleResource> result = new ArrayList<ExampleResource>();
        for (ExportResource exRe : exportResources) {
            ExampleResource.Type st = filterSourceType(exRe.getResource().getClass().getName());
            ExampleResource resultItem = new ExampleResource(
                    exRe.getLocalPath().toPortableString(), st);
            resultItem.setDirectOpen(exRe.isDirectOpen());
            result.add(resultItem);
        }
        return result;
    }

    private static ExampleResource.Type filterSourceType(final String name) {
        if (PROJECT_CLASS.equals(name)) {
            return Type.PROJECT;
        }
        if (FOLDER_CLASS.equals(name)) {
            return Type.FOLDER;
        }
        if (FILE_CLASS.equals(name)) {
            return Type.FILE;
        }
        return null;
    }
}
