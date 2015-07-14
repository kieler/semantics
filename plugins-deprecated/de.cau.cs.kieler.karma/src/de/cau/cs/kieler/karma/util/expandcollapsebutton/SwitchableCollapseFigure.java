/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/

package de.cau.cs.kieler.karma.util.expandcollapsebutton;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ImageFigureEx;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.karma.SwitchableFigure;

/**
 * A SwitchableFigure that switches the displayed figure according to collapse status change.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
//Its necessary here to use some internal draw 2d figures
@SuppressWarnings("restriction")
public class SwitchableCollapseFigure extends SwitchableFigure {

    private boolean collapsed = false;

    private static boolean isWinOS = SWT.getPlatform().equals("win32");

    private IFigure collapseFigure = getDefaultCollapseFigure();

    private IFigure expandFigure = getDefaultExpandFigure();

    /**
     * the constructor.
     * 
     * @param parent
     *            the parent of this figure. Should probably be a collapse handle.
     */
    public SwitchableCollapseFigure(final IFigure parent) {
        super();
        this.setParent(parent);
        if (collapsed) {
            setCurrentFigure(expandFigure);
        } else {
            setCurrentFigure(collapseFigure);
        }
        this.setBounds(getCurrentFigure().getBounds());
        this.setLayoutManager(new StackLayout());
    }

    /**
     * set a custom collapse figure.
     * 
     * @param figure
     *            the new collapse figure
     */
    public void setCollapseFigure(final IFigure figure) {
        collapseFigure = figure;
    }

    /**
     * set a custom expand figure.
     * 
     * @param figure
     *            the new expand figure
     */
    public void setExpandFigure(final IFigure figure) {
        expandFigure = figure;
    }

    // taken from original gmf, blame them
    @SuppressWarnings("deprecation")
    @Override
    public void paint(final Graphics graphics) {
        // Hack for image because gmf normally can't display image figures in a collapse handle.
        // The default gmf CollapseFigure pretty much does the same.
        if (getCurrentFigure() instanceof ImageFigureEx) {
            if (getLocalBackgroundColor() != null) {
                graphics.setBackgroundColor(getLocalBackgroundColor());
            }
            if (getLocalForegroundColor() != null) {
                graphics.setForegroundColor(getLocalForegroundColor());
            }
            if (font != null) {
                graphics.setFont(font);
            }

            graphics.pushState();
            try {
                paintFigure(graphics);
                graphics.restoreState();
                paintClientArea(graphics);
                paintBorder(graphics);
            } finally {
                graphics.popState();
            }
        } else {
            super.paint(graphics);
        }
    }

    /*
     * Default gmf collapse button figure.
     */
    private IFigure getDefaultCollapseFigure() {
        Image img;
        if (isWinOS) {
            img = DiagramUIPluginImages.get(DiagramUIPluginImages.IMG_HANDLE_COLLAPSE_WIN);
        } else {
            img = DiagramUIPluginImages.get(DiagramUIPluginImages.IMG_HANDLE_COLLAPSE);
        }
        ImageFigureEx imageFigure = new ImageFigureEx(img);
        imageFigure.getBounds().height = img.getBounds().height;
        imageFigure.getBounds().width = img.getBounds().width;
        return imageFigure;
    }

    /*
     * Default gmf expand button figure.
     */
    private IFigure getDefaultExpandFigure() {
        Image img;
        if (isWinOS) {
            img = DiagramUIPluginImages.get(DiagramUIPluginImages.IMG_HANDLE_EXPAND_WIN);
        } else {
            img = DiagramUIPluginImages.get(DiagramUIPluginImages.IMG_HANDLE_EXPAND);
        }
        ImageFigureEx imageFigure = new ImageFigureEx(img);
        imageFigure.getBounds().height = img.getBounds().height;
        imageFigure.getBounds().width = img.getBounds().width;
        return imageFigure;
    }

    /**
     * isCollapsed Utility method to determine if the IFigure is collapse or not.
     * 
     * @return true if collapse, false otherwise.
     */
    public boolean isCollapsed() {
        return collapsed;
    }

    /**
     * setCollapsed Setter method to change collapsed state of the figure. Will force update to
     * repaint the figure to reflect the changes.
     * 
     * @param b
     *            boolean true to set collapsed, false to uncollapse.
     */
    public void setCollapsed(final boolean b) {
        collapsed = b;
        if (collapsed) {
            setCurrentFigure(expandFigure);
        } else {
            setCurrentFigure(collapseFigure);
        }
        revalidate();
        repaint();
    }
    
    @Override
    public void setCurrentFigure(final IFigure figure) {
        currentFigure = figure;
        currentFigure.setParent(this.getParent());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.Shape#outlineShape(org.eclipse.draw2d.Graphics)
     * 
     * part of the image hack
     */
    @Override
    protected void outlineShape(final Graphics graphics) {
        if (!(getCurrentFigure() instanceof ImageFigureEx)) {
            super.outlineShape(graphics);
        } 
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics)
     * 
     * part of the image hack
     */
    @Override
    protected void fillShape(final Graphics graphics) {
        if (getCurrentFigure() instanceof ImageFigureEx) {
            Image img = ((ImageFigureEx) getCurrentFigure()).getImage();
            graphics.drawImage(img, getBounds().x, getBounds().y);
        } else {
            super.outlineShape(graphics);
        }
    }

}
