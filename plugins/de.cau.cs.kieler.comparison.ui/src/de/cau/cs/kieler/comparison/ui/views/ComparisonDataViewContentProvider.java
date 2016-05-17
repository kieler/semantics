/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.comparison.datahandler.AbstractDataHandler;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.exchange.GeneralComparisonMeasurement;

/**
 * The ComparisonDataViewContentProvider is used to provide the {@link ComparisonDataView} with
 * measurings.
 * 
 * @author nfl
 */
public class ComparisonDataViewContentProvider implements IStructuredContentProvider {

    /**
     * The comparison containing the data.
     */
    private String comparison;

    /**
     * The measurings obtained from a comparison.
     */
    private GeneralComparisonMeasurement measurement;

    /**
     * The constructor for this class using the comparison identifier. The {@link DataHandler} is
     * used to obtain a {@link GeneralComparisonMeasurement} object using that comparison
     * identifier.
     * 
     * @param comparison
     *            filePath for the model to display
     */
    public ComparisonDataViewContentProvider(final String comparison) {
        this.comparison = comparison;
    }

    /**
     * The constructor for this class using a {@link GeneralComparisonMeasurement} object containing
     * the measuring results of a comparison.
     * 
     * @param measurement
     *            file path of the model to display
     */
    public ComparisonDataViewContentProvider(final GeneralComparisonMeasurement measurement) {
        this.measurement = measurement;
    }

    /**
     * The empty constructor.
     */
    public ComparisonDataViewContentProvider() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] getElements(final Object inputElement) {

        // constructed using a comparison string
        if (measurement == null && comparison != null) {
            AbstractDataHandler dataHandler = DataHandler.getDataHandler();
            measurement = dataHandler.getData(comparison);
        }
        // return the measurings
        if (measurement != null && measurement.getTestbenches() != null) {
            return measurement.getTestbenches().toArray();
        }

        // nothing to display
        return new Object[0];
    }
}
