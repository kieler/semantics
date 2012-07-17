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
 * An instance of this class acts as a container for the layout information.
 * 
 * @author abl
 */
public class ExtendedTable {
    
    // CHECKSTYLEOFF VisibilityModifier
    
    /** Center alignment. */
    public static final int CENTER = 0;
    /** Justify alignment. */
    public static final int JUSTIFY = 1;
    /** Separator alignment. */
    public static final int SEPARATOR = 4;

    /**
     * The table-array holds the single layout-cells and provides the structure of the table-layout.
     */
    public Cell[][] table;

    /** Provides the alignment for every row and for the whole table. */
    private int[] horizontalAlignment;
    /** vertical alignment. */
    private int verticalAlignment;

    /** Defines the one cell which shall be adjustable resp. variable in size. */
    private int adjustableCanvas;

    /** Defines the minimum height and width ob the table. */
    private int minHeight;
    private int minWidth;

    /**
     * The padding defines the space between the outer border and the content, atm has only effect
     * on separators.
     */
    private int padding;

    /**
     * Defines if a Layout can be freely resized, ie. the user can enlarge a figure.
     */
    private boolean userResizeable;

    /**
     * Create an extended table.
     */
    public ExtendedTable() {
        // populate default values
        table = new Cell[0][0];
        horizontalAlignment = new int[0];
        verticalAlignment = CENTER;
        minHeight = 0;
        minWidth = 0;
        userResizeable = true;
        adjustableCanvas = -1;
        padding = 0;
    }

    /**
     * Some kind of fluent interface/builder pattern for constructing layouts.
     * 
     * @return an extended table
     */
    public static ExtendedTable build() {
        return new ExtendedTable();
    }

    /**
     * Initializes the class-variables according to the given table.
     * 
     * @param tableLayout the table layout
     * @return an extended table
     */
    public ExtendedTable tableLayout(final int[][] tableLayout) {
        if (tableLayout != null) {
            int length = tableLayout.length / 2;
            table = new Cell[length][];
            horizontalAlignment = new int[length];
            int i = 0;
            for (int row = 0; row < tableLayout.length; row = row + 2) {
                // save the different figure kinds
                table[i] = new Cell[tableLayout[row].length];
                for (int j = 0; j < tableLayout[row].length; j++) {
                    table[i][j] = new Cell(tableLayout[row][j], false);
                }
                // save the alignment
                horizontalAlignment[i] = tableLayout[row + 1][0];
                i++;
            }
        } else {
            table = new Cell[0][0];
            horizontalAlignment = new int[0];
        }
        return this;
    }

    /**
     * The minimal height.
     * 
     * @return the minimal height
     */
    public int getMinHeight() {
        return minHeight;
    }

    /**
     * Set the minimal height.
     * 
     * @param theminHeight the minimal height
     * @return this
     */
    public ExtendedTable setMinHeight(final int theminHeight) {
        this.minHeight = theminHeight;
        return this;
    }

    /**
     * The minimal width.
     * 
     * @return the minimal width
     */
    public int getMinWidth() {
        return minWidth;
    }

    /**
     * Set the minimal width.
     * 
     * @param theminWidth the minimal width
     * @return this
     */
    public ExtendedTable setMinWidth(final int theminWidth) {
        this.minWidth = theminWidth;
        return this;
    }

    /**
     * Whether the user can resize.
     * 
     * @return is user resizable
     */
    public boolean isUserResizeable() {
        return userResizeable;
    }

    /**
     * Set whether the user can resize.
     * 
     * @param theuserResizeable is user resizable
     * @return this
     */
    public ExtendedTable setUserResizeable(final boolean theuserResizeable) {
        this.userResizeable = theuserResizeable;
        return this;
    }
    
    /**
     * The Vertical alignment.
     * 
     * @return the vertical alignment
     */
    public int getVerticalAlignment() {
        return verticalAlignment;
    }
    
    /**
     * Set the vertical alignment.
     * 
     * @param theverticalAlignment the vertical alignment
     * @return this
     */
    public ExtendedTable setVerticalAlignment(final int theverticalAlignment) {
        this.verticalAlignment = theverticalAlignment;
        return this;
    }
    
    /**
     * The adjustable canvas, that is the cell index of the cell that is variable in size.
     * 
     * @return the adjustable canvas
     */
    public int getAdjustableCanvas() {
        return adjustableCanvas;
    }
    
    /**
     * Set the adjustable canvas.
     * 
     * @param theadjustableCanvas the adjustable canvas
     * @return this
     */
    public ExtendedTable setAdjustableCanvas(final int theadjustableCanvas) {
        this.adjustableCanvas = theadjustableCanvas;
        return this;
    }
    
    /**
     * The horizontal alignment for each row.
     * 
     * @return the horizontal alignment
     */
    public int[] getHorizontalAlignment() {
        return horizontalAlignment;
    }
    
    /**
     * Set the horizontal alignment.
     * 
     * @param theHorizontalAlignment the horizontal alignment
     * @return this
     */
    public ExtendedTable setHorizontalAlignment(final int[] theHorizontalAlignment) {
        this.horizontalAlignment = theHorizontalAlignment;
        return this;
    }
    
    /**
     * The padding.
     * 
     * @return the padding
     */
    public int getPadding() {
        return padding;
    }
    
    /**
     * Set the padding.
     * 
     * @param thepadding the padding
     * @return this
     */
    public ExtendedTable setPadding(final int thepadding) {
        this.padding = thepadding;
        return this;
    }
    
}
