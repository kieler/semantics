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
package de.cau.cs.kieler.comparison.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.datahandler.IDataHandler;
import de.cau.cs.kieler.comparison.exchange.AbstractComparisonMeasurement;

/**
 * @author nfl
 *
 */
public class ComparisonDataViewContentProvider implements IStructuredContentProvider {

    private String filePath;
    
    /**
     * 
     * @param filePath filePath for the model to display
     */
    public ComparisonDataViewContentProvider(final String filePath){
        this.filePath = filePath;
    }

    /**
     * 
     */
    public ComparisonDataViewContentProvider() {
        // TODO Auto-generated constructor stub
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        // TODO Auto-generated method stub
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] getElements(Object inputElement) {
        
        if (filePath == null)
            return new Object[0];
        
        IDataHandler dataHandler = DataHandler.getDataHandler();
        AbstractComparisonMeasurement cm = dataHandler.getData(filePath);
        
        return cm.getTestbenches().toArray();
    }
}
