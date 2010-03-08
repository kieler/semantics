package de.cau.cs.kieler.core.ui.figures.layout.container;


/** An instance of this class acts as a container for the layoutinformation. */
public class ExtendedTable {
    /** Constants defining the alignment */
    public final static int CENTER = 0;
    public final static int JUSTIFY = 1;
    public final static int SEPARATOR = 4;

    /**
     * The table-array holds the single layout-cells and provides the structure of the table-layout.
     */
    public Cell[][] table;

    /** Provides the alignment for every row and for the whole table. */
    public int[] horizontalAlignment;
    public int verticalAlignment;

    /** Defines the one cell which shall be adjustable resp. variable in size. */
    public int adjustableCanvas;

    /** Defines the minimum height and width ob the table. */
    private int minHeight;
    private int minWidth;

    /**
     * The padding defines the space between the outer border and the content, atm has only effect
     * on separators.
     */
    public int padding;

    /**
     * Defines if a Layout can be freely resized, ie. the user can enlarge a figure.
     */
    private boolean userResizeable;

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

    /** Some kind of fluent interface/builder pattern for constructing layouts */
    public static ExtendedTable build() {
        return new ExtendedTable();
    }

    /** Initializes the class-variables according to the given table. */
    public ExtendedTable tableLayout(int[][] tableLayout) {
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

    public int getMinHeight() {
        return minHeight;
    }

    public ExtendedTable setMinHeight(int minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public int getMinWidth() {
        return minWidth;
    }

    public ExtendedTable setMinWidth(int minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    public boolean isUserResizeable() {
        return userResizeable;
    }

    public ExtendedTable setUserResizeable(boolean userResizeable) {
        this.userResizeable = userResizeable;
        return this;
    }

    public int getVerticalAlignment() {
        return verticalAlignment;
    }

    public ExtendedTable setVerticalAlignment(int verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    public int getAdjustableCanvas() {
        return adjustableCanvas;
    }

    public ExtendedTable setAdjustableCanvas(int adjustableCanvas) {
        this.adjustableCanvas = adjustableCanvas;
        return this;
    }

    public void padding(int padding) {
        this.padding = padding;
    }
}
