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
package de.cau.cs.kieler.kvid.dataprovider;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.datadistributor.IProviderListener;

/**
 * Data source which is a {@link IDataProvider} and uses CSV files 
 * to provide the data. 
 * 
 * @author jjc
 *
 */
public class CsvDataProvider implements IDataProvider {
    
    /** List of registered {@link IProviderListener}s. */
    private List<IProviderListener> listeners = new LinkedList<IProviderListener>();
    
    /** The CSV file to read from. */
    private IFile inputCsvFile;
    
    /** All lines of the CSV file. */
    private String[] csvLines;
    
    /** The URIs of the referred model elements. */
    private String[] uris;
    
    /** Point on the next line to read. */
    private int linePointer;
    
    /**
     * Constructor for a CsvDataProvider.
     * Use a new CsvDataProvider for each new CSV file.
     * 
     * @param pathToCsv Path to the CSV file relative to the current workspace
     */
    public CsvDataProvider(final String pathToCsv) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot workspaceRoot = workspace.getRoot();
        
        IPath path = new Path(pathToCsv);
        this.inputCsvFile = workspaceRoot.getFile(path);
        csvLines = getCsvLines();
        if (csvLines.length > 0) {
            uris = csvLines[0].split(";");
            linePointer = 1;
        } else {
            throw new RuntimeException("Loaded empty CSV file");
        }
    }
    
    private String[] getCsvLines() {
        String cache = "";
        if (inputCsvFile.exists()) {
            try {
                String line = null;
                InputStream input = inputCsvFile.getContents();
                InputStreamReader reader = new InputStreamReader(input);
                BufferedReader buf = new BufferedReader(reader);
                while ((line = buf.readLine()) != null) {
                    cache += line + "\n";
                }
                cache = cache.trim();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            throw new RuntimeException("Tried to open a non-existing file: "
                    + inputCsvFile.getFullPath());
        }
        return cache.split("\n");
    }
    
    /**
     * {@inheritDoc}
     */
    public void start() {
        linePointer = 1;
        DataDistributor.getInstance().initialize();
        for (IProviderListener listener : listeners) {
            listener.triggerInitialization();
        }
    }
    
    /**
     * {@inheritDoc}
     */
    public void step() {
        String[] currentValues = csvLines[linePointer].split(";");
        try {
            JSONObject stepData = new JSONObject();
            for (int i = 0; i < uris.length; i++) {
                stepData.accumulate(uris[i], currentValues[i]);
            }
            for (IProviderListener listener : listeners) {
                listener.update(stepData);
            }
            linePointer++;
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    
   /**
    * {@inheritDoc}
    */
   public void stop() {
       for (IProviderListener listener : listeners) {
           listener.triggerWrapup();
       }
   }
    
   /**
    * {@inheritDoc}
    */
    public void registerProviderListener(final IProviderListener listener) {
        listeners.add(DataDistributor.getInstance());
    }

    /**
     * {@inheritDoc}
     */
    public void removeProviderListener(final IProviderListener listener) {
        listeners.remove(listener);
    }

}
