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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.kex.controller.ErrorMessage;

/**
 * This class provides all methods to access I/O.
 * 
 * @author pkl
 * 
 */
public final class IOHandler {

    /**
     * The variable holds project filename.
     */
    public static final String PROJECT_FILE = ".project";

    /**
     * The variable holds manifest_mf filename.
     */
    public static final String MANIFEST_MF = "MANIFEST.MF";

    /**
     * The variable holds plugin.xml filename.
     */
    public static final String PLUGIN_XML = "plugin.xml";

    private static final int BUFFER_SIZE = 1024;

    private IOHandler() {
        // should not called.
    }

    /**
     * writes the resource from sourceFile to destFile.
     * 
     * @param sourceFile
     *            , {@link File}
     * @param destFile
     *            , {@link File}
     * @throws IOException
     *             , if sourcefile not exists.
     */
    public static void writeResource(final File sourceFile, final File destFile) throws IOException {
        if (!sourceFile.exists()) {
            // FIXME Problem, if user imports a project from another locations
            // as it's workspace.
            // the sourcepath is generated from workspace location and local
            // path. BANG!
            throw new IOException(ErrorMessage.NO_SOURCE_FILE + sourceFile.getPath());
        }

        // is directory works only on absolute paths.
        if (sourceFile.isDirectory()) {
            try {
                destFile.mkdir();
            } catch (SecurityException se) {
                se.printStackTrace();
            }
        } else {
            InputStream is = new FileInputStream(sourceFile);
            OutputStream os = new FileOutputStream(destFile);
            byte[] buf = new byte[IOHandler.BUFFER_SIZE];
            int len;
            while ((len = is.read(buf)) > 0) {
                os.write(buf, 0, len);
            }
            is.close();
            os.close();
        }
    }

    /**
     * deletes a file or a directory. If a directory is choosen, all subdirectories and files will
     * be deleted.
     * 
     * @param deletable
     *            , File
     * @return true, if deleting success, otherwise false.
     */
    public static boolean deleteFile(final File deletable) {
        if (!deletable.exists()) {
            return true;
        }
        if (deletable.isDirectory()) {
            String[] entries = deletable.list();
            for (int i = 0; i < entries.length; i++) {
                deleteFile(new File(deletable.getPath(), entries[i]));
            }
        }
        return deletable.delete();
    }

    /**
     * searches for a java project, therefore the ".project" file is searched.
     * 
     * @param location
     *            , File into a plugin project.
     * @return File, plugin project
     */
    public static File filterPluginProject(final File location) {
        File childDir = searchUP(location, IOHandler.PROJECT_FILE);
        if (childDir == null) {
            // FIXME throw a more specific exception
            throw new RuntimeException("Could not find any java project.");
        }
        File project = childDir.getParentFile();
        if (project == null) {
            // FIXME throw a more specific exception
            throw new RuntimeException("Could not find any java project.");
        }
        return project;
    }

    /**
     * 
     * filters the plugin.xml of plugin project for given destination.<br>
     * Searches first for a java project by checking parent dirs for containing ".project" file. <br>
     * Searches than in found project for "manifest.mf" file of an plugin project and if that found,
     * finally searches the plugin.xml.
     * 
     * @param location
     *            , folder in an plugin project.
     * @return plugin.xml if found otherwise parent java project directory
     */
    public static File filterPluginXML(final File location) {
        File project = filterPluginProject(location);
        if (getFile(project, IOHandler.MANIFEST_MF) != null) {
            File result = getFile(project, IOHandler.PLUGIN_XML);
            if (result != null) {
                return result;
            } else {
                return project;
            }
        } else {
            // FIXME throw a more specific exception
            throw new RuntimeException("The choosen destination contains no manifest.mf.");
        }
    }

    /**
     * Searches for given fileName in given directory and subdirectories.
     * 
     * @param sourceDir
     * @param fileName
     * @return true, if exactly one file is found, otherwise false
     */
    private static File getFile(final File sourceDir, final String fileName) {
        List<File> resultList = new ArrayList<File>();
        collectFiles(sourceDir, fileName, resultList);
        return filterFoundFile(resultList, fileName, sourceDir);

    }

    /**
     * adds a file with machting filename to given result list.
     * 
     * @param sourceDir
     * @param fileName
     * @param resultList
     */
    private static void collectFiles(final File sourceDir, final String fileName,
            final List<File> resultList) {
        for (File file : sourceDir.listFiles()) {
            if (fileName.equals(file.getName())) {
                resultList.add(file);
            } else if (file.isDirectory()) {
                collectFiles(file, fileName, resultList);
            }
        }
    }

    /**
     * Searches for an file with matching fileName in parent folders of source directory.
     * 
     * @param sourceDir
     *            , File
     * @param fileName
     *            , String
     * @return File, if exactly one file is found otherwise null;
     */
    public static File searchUP(final File sourceDir, final String fileName) {
        File parent = sourceDir;
        File[] foundFiles = null;
        while (parent != null && parent.exists() && parent.isDirectory()) {
            foundFiles = parent.listFiles(new FilenameFilter() {

                public boolean accept(final File dir, final String name) {
                    return fileName.equals(name);
                }
            });
            if (foundFiles.length > 0) {
                break;
            }
            parent = parent.getParentFile();
        }
        return filterFoundFile(foundFiles, fileName, parent);

    }

    private static File filterFoundFile(final List<File> foundFiles, final String searchName,
            final File source) {
        int fileCount = foundFiles.size();
        if (fileCount == 0) {
            return null;
        }
        if (fileCount > 1) {
            // FIXME throw a more specific exception
            throw new RuntimeException(new StringBuffer()
                    .append("There are more than one file with name \"" + searchName + "\" in")
                    .append(source.getPath()).toString());
        }
        return foundFiles.get(0);
    }

    private static File filterFoundFile(final File[] foundFiles, final String searchName,
            final File source) {
        int fileCount = foundFiles.length;
        if (fileCount == 0) {
            return null;
        }
        if (fileCount > 1) {
            // FIXME throw a more specific exception
            throw new RuntimeException(new StringBuffer()
                    .append("There are more than one file with name \"" + source + "\" in")
                    .append(source.getPath()).toString());
        }
        return foundFiles[0];

    }

    /**
     * 
     * @param sourceUrl
     *            , source URL
     * @param destPath
     *            , destination path as String
     * @param checkDuplicate
     *            , boolean
     * @throws IOException
     *             , can occur while io writing.
     */
    public static void writeFile(final URL sourceUrl, final String destPath,
            final boolean checkDuplicate) throws IOException {
        File target = new File(destPath);
        if (checkDuplicate && target.exists()) {
            // FIXME throw a more specific exception
            throw new RuntimeException(target.getName());
        }
        InputStream is = sourceUrl.openStream();
        OutputStream os = new FileOutputStream(target, false);
        byte[] buf = new byte[BUFFER_SIZE];
        int len;
        while ((len = is.read(buf)) > 0) {
            os.write(buf, 0, len);
        }
        is.close();
        os.close();
    }

    /**
     * creates a folder with given parameter.
     * 
     * @param destFolder
     *            , pathname of destination folder.
     */
    public static void createFolder(final String destFolder) {
        try {
            new File(destFolder).mkdir();
        } catch (SecurityException se) {
            se.printStackTrace();
        }
    }
}
