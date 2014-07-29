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
package de.cau.cs.kieler.core.model.gmf.figures.layout.container;

/**
 * Represents a single cell of a table layout, used in ExtendedTable.
 * 
 * @author abl
 * @kieler.ignore (excluded from review process)
 */
public class Cell {
    
    // CHECKSTYLEOFF VisibilityModifier
    /** whether it is empty. */
    public boolean isEmpty;
    /** the figure index. */
    public int figure;

    /**
     * Create a cell.
     * 
     * @param figureIndex the figure index
     * @param isEmpty whether it is empty
     */
    public Cell(final int figureIndex, final boolean isEmpty) {
        this.isEmpty = isEmpty;
        this.figure = figureIndex;
    }

    /**
     * Create a cell.
     */
    public Cell() {
        figure = -1;
        isEmpty = true;
    }
}
