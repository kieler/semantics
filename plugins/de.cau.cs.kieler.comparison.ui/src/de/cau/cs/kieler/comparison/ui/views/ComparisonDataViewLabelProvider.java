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

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.comparison.exchange.Testbench;

/**
 * The ComparisonDataViewLabelProvider is used to display the measurings in the
 * {@link ComparisonDataView} provided by the {@link ComparisonDataViewContentProvider}.
 * 
 * @author nfl
 */
public class ComparisonDataViewLabelProvider implements ITableLabelProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addListener(ILabelProviderListener listener) {

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
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeListener(ILabelProviderListener listener) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getColumnText(Object element, int columnIndex) {
        if (element instanceof Testbench) {
            Testbench bench = (Testbench) element;
            if (columnIndex == 0) {
                return bench.getCriterion();
            } else if (columnIndex == 1) {
                return bench.getCompiler();
            } else if (columnIndex == 2) {
                return bench.getTestcase();
            } else if (columnIndex == 3) {
                return bench.getData().toString();
            }
        }
        return "";
    }
}
