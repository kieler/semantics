package de.cau.cs.kieler.core.ui.figures.layout.container;

import org.eclipse.draw2d.geometry.Dimension;

/** Class used as container by GenericTableLayout. */
public class LayoutSizes {
    private Dimension[][] preferredSizes;
    private int preferredHeight;
    private int preferredWidth;
    private int minimumHeight;
    private int minimumWidth;

    public LayoutSizes(Dimension[][] preferredSizes, int preferredHeight, int preferredWidth,
            int minimumHeight, int minimumWidth) {
        this.preferredSizes = preferredSizes;
        this.preferredHeight = preferredHeight;
        this.preferredWidth = preferredWidth;
        this.minimumHeight = minimumHeight;
        this.minimumWidth = minimumWidth;
    }

    public LayoutSizes() {
        this.preferredSizes = new Dimension[0][0];
        this.preferredHeight = 0;
        this.preferredWidth = 0;
        this.minimumHeight = 0;
        this.minimumWidth = 0;
    }

    public final Dimension[][] getPreferredSizes() {
        return preferredSizes;
    }

    public final void setPreferredSizes(Dimension[][] preferredSizes) {
        this.preferredSizes = preferredSizes;
    }

    public final int getPreferredHeight() {
        return preferredHeight;
    }

    public final void setPreferredHeight(int preferredHeight) {
        this.preferredHeight = preferredHeight;
    }

    public final int getPreferredWidth() {
        return preferredWidth;
    }

    public final void setPreferredWidth(int preferredWidth) {
        this.preferredWidth = preferredWidth;
    }

    public final int getMinimumHeight() {
        return minimumHeight;
    }

    public final void setMinimumHeight(int minimumHeight) {
        this.minimumHeight = minimumHeight;
    }

    public final int getMinimumWidth() {
        return minimumWidth;
    }

    public final void setMinimumWidth(int minimumWidth) {
        this.minimumWidth = minimumWidth;
    }
}
