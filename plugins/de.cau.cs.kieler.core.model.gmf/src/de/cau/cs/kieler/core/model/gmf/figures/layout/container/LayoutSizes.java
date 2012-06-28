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

import org.eclipse.draw2d.geometry.Dimension;

/**
 * Class used as container by GenericTableLayout.
 * 
 * @author abl
 */
public class LayoutSizes {
    
    private Dimension[][] preferredSizes;
    private int preferredHeight;
    private int preferredWidth;
    private int minimumHeight;
    private int minimumWidth;

    /**
     * Constructor.
     * 
     * @param preferredSizes preferred sizes
     * @param preferredHeight preferred height
     * @param preferredWidth preferred width
     * @param minimumHeight minimum height
     * @param minimumWidth minimum width
     */
    public LayoutSizes(final Dimension[][] preferredSizes, final int preferredHeight,
            final int preferredWidth, final int minimumHeight, final int minimumWidth) {
        this.preferredSizes = preferredSizes;
        this.preferredHeight = preferredHeight;
        this.preferredWidth = preferredWidth;
        this.minimumHeight = minimumHeight;
        this.minimumWidth = minimumWidth;
    }

    /**
     * Constructor.
     */
    public LayoutSizes() {
        this.preferredSizes = new Dimension[0][0];
        this.preferredHeight = 0;
        this.preferredWidth = 0;
        this.minimumHeight = 0;
        this.minimumWidth = 0;
    }

    /**
     * The preferred sizes.
     * 
     * @return the preferred sizes
     */
    public final Dimension[][] getPreferredSizes() {
        return preferredSizes;
    }

    /**
     * Set the preferred sizes.
     * 
     * @param preferredSizes the preferred sizes
     */
    public final void setPreferredSizes(final Dimension[][] preferredSizes) {
        this.preferredSizes = preferredSizes;
    }

    /**
     * The preferred height.
     * 
     * @return the preferred height
     */
    public final int getPreferredHeight() {
        return preferredHeight;
    }

    /**
     * Set the preferred height.
     * 
     * @param preferredHeight the preferred height
     */
    public final void setPreferredHeight(final int preferredHeight) {
        this.preferredHeight = preferredHeight;
    }

    /**
     * The preferred width.
     * 
     * @return the preferred width
     */
    public final int getPreferredWidth() {
        return preferredWidth;
    }

    /**
     * Set the preferred width.
     * 
     * @param preferredWidth the preferred width.
     */
    public final void setPreferredWidth(final int preferredWidth) {
        this.preferredWidth = preferredWidth;
    }

    /**
     * The minimum height.
     * 
     * @return the minimum height
     */
    public final int getMinimumHeight() {
        return minimumHeight;
    }

    /**
     * Set the minimum height.
     * 
     * @param minimumHeight the minimum height
     */
    public final void setMinimumHeight(final int minimumHeight) {
        this.minimumHeight = minimumHeight;
    }

    /**
     * The minimum width.
     * 
     * @return the minimum width
     */
    public final int getMinimumWidth() {
        return minimumWidth;
    }

    /**
     * Set the minimum width.
     * 
     * @param minimumWidth the minimum width
     */
    public final void setMinimumWidth(final int minimumWidth) {
        this.minimumWidth = minimumWidth;
    }
    
}
