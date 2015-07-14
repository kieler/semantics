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

package de.cau.cs.kieler.karma;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;

/**
 * Class for providing figures represented by a string.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public interface IRenderingProvider {

    /**
     * Returns a figure according to a given string.
     * 
     * @param input
     *            a string representation of the figure
     * @param oldFigure
     *            the old figure
     * @param object
     *            the model element
     * @param part
     *            the corresponding editPart
     * @return the figure
     */
    IFigure getFigureByString(final String input, final IFigure oldFigure, final EObject object,
            final EditPart part);
    
    /**
     * Returns the size of a figure according to a given string. The fixed size given in the
     * extension point has priority over the one given here. If no fixed size shall be set or
     * the fixed size is defined in the plugin extension, this method returns {@code null}.
     * The string input is the same as the one for
     * {@link #getFigureByString(String, IFigure, EObject, EditPart) getFigureByString}.
     * 
     * @param input
     *            a string representation of the figure
     * @param object
     *            the model element
     * @param part
     *            the corresponding editPart
     * @return the fixed size, or {@code null} if no fixed size shall be set
     */
    Dimension getSizeByString(final String input, final EObject object, final EditPart part);

    /**
     * Returns a LayoutManager according to a given string.
     * 
     * @param input
     *            a string representation of the LayoutManager
     * @param oldLayoutManager
     *            the old LayoutManager
     * @param object
     *            the model element
     * @return the new LayoutManager
     */
    LayoutManager getLayoutManagerByString(final String input,
            final LayoutManager oldLayoutManager, final EObject object);

    /**
     * Returns a BorderItemLocator according to a given string.
     * 
     * @param input
     *            a string representation of the BorderItemLocator
     * @param parentFigure
     *            the parentFigure
     * @param locator
     *            the old BorderItemLocator
     * @param object
     *            the model element
     * @param collapseStatus
     *            transmits whether the parent node has been recently collapsed or expaned
     * @return the new BorderItemLocator
     */
    IBorderItemLocator getBorderItemLocatorByString(final String input, final IFigure parentFigure,
            final Object locator, final EObject object, CollapseStatus collapseStatus);

    /**
     * The different states a model element can have as far as collapsing and expanding is concerned. 
     * @author ckru
     *
     */
    public enum CollapseStatus {
        /**
         * The model element is currently collapsing.
         */
        COLLAPSING,
        /**
         * The model element is currently expanding.
         */
        EXPANDING,
        /**
         * The model element is not changing.
         */
        UNCHANGED
    }
    
}
