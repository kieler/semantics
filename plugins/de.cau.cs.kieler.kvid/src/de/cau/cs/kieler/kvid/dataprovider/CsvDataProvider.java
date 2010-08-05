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

import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.datadistributor.IProviderListener;

/**
 * @author jjc
 *
 */
public class CsvDataProvider implements IDataProvider {
    
    private List<IProviderListener> listeners = new LinkedList<IProviderListener>();
    
    private IFile inputCsvFile;
    
    private String[] csvLines;
    
    private String[] uris;
    
    /**
     * 
     */
    public CsvDataProvider(final String pathToCsv) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot workspaceRoot = workspace.getRoot();
        
        IPath path = new Path(pathToCsv);
        this.inputCsvFile = workspaceRoot.getFile(path);
        csvLines = getCsvLines();
        if (csvLines.length > 0) {
            uris = csvLines[0].split(";");
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
            throw new RuntimeException("Tried to open a non-existing file: " + inputCsvFile.getFullPath());
        }
        return cache.split("\n");
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kvid.dataprovider.IDataProvider#registerProviderListener(de.cau.cs.kieler.kvid.datadistributor.IProviderListener)
     */
    public void registerProviderListener(IProviderListener listener) {
        listeners.add(DataDistributor.getInstance());
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kvid.dataprovider.IDataProvider#removeProviderListener(de.cau.cs.kieler.kvid.datadistributor.IProviderListener)
     */
    public void removeProviderListener(IProviderListener listener) {
        listeners.remove(listener);
    }

}
