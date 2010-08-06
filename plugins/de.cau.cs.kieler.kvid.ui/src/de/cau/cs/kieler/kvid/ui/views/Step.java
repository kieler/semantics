/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.ui.views;

import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.dataprovider.IDataProvider;

/**
 * @author jjc
 *
 */
public class Step extends Action {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getText() {
        return "Step";
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        IDataProvider currentProvider = DataDistributor.getInstance().getCurrentProvider();
        currentProvider.step();
    }

}
