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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.ui.figures.layout;

import java.util.List;

import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import de.cau.cs.kieler.core.ui.figures.IAttributeAwareFigure;
import de.cau.cs.kieler.core.ui.figures.layout.container.Cell;
import de.cau.cs.kieler.core.ui.figures.layout.container.ExtendedTable;
import de.cau.cs.kieler.core.ui.figures.layout.container.LayoutSizes;

/*
 * TODO : Wie im alten Layouter uU eine CachedSize nutzen.
 */
/*
 * TODO : Es herrscht noch Uneinigkeit ueber preferredSize und minimumSize. Die groesser des zu
 * layoutenden Elements wird derzeit ueber getMinimumSize festgelegt. Dies sollte uU. auf
 * getPreferredSize umgeaendert werden, da die dahinterliegende Logik zur Berechnung der aeusseren
 * Groesse zumeist die preferredSize der inneren Elemente abfragt und nicht die minimumSize. Dies
 * sollte sauber getrennt werden.
 * Auch ist die Nutzung von getMinimumSize nicht konsistent mit der ueblichen Verwendung, da zb bei 
 * einem WrappingLabel getMinimumSize das abgekuerzte Label liefert waehrend getPreferredSize das
 * ausgeschriebene Label liefert, welches wir nutzen wollen.
 * Falls das Regioncompartment mal nicht das adjustabkeCompartment sein sollte, ist die Berechnung
 * mit getMinimumSize nicht korrekt, da die Region die preferredSize braucht um ohne Scrollbalken
 * angezeigt zu werden. 
 */
/*
 * TODO : checkNweSize und correctSize haben fast die gleiche Wirkung sollten zusammengefasst werden
 */
/* TODO : wegen setBounds, setBoundsDirect in CorrectSize sind wir derzeit noch auf 
 * AttributeAwareFigures festgelegt 
 * 
 */

//   +====================================+
//   =        aCenteredTitleLabel         =
//   +------------------------------------+
//   = aAlignedCompartment                =
//   +------------------------------------+
//   = compartment2 | compartment3        =
//   +------------------------------------+
//   = anotherWrappingLabel               =
//   +====================================+ <- a Separator
//   = aotherCompartment                  =
//   +------------------------------------+
//   =                                    =
//   = aResizableCompartment              =
//   =                                    =
//   +====================================+
/**
 * A generic configurable table layout for figures: Inner elements are laid out in a tabular style.
 * See example above.
 * 
 * The exact configuration for the tableLayout is passed through the GMFTableLayoutConfiguration. To
 * use this layouter one have to implement a configuration.
 * 
 * @author schm
 * @author haf
 * @author msp
 * @author abl
 */
public abstract class AbstractTableLayout extends AbstractHintLayout {

    /**
     * Creates a state layout.
     */
    public AbstractTableLayout() {
        isObservingVisibility = true;
    }

    /** @return the Layout for the given IFigure */
    public ExtendedTable getCorrespondingLayout(IFigure stateFigure) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public final void layout(final IFigure stateFigure) {
        if (isObservingVisibility && !stateFigure.isVisible()) {
            return;
        }

        // check whether the figure is an attribute aware figure
        if (stateFigure instanceof IAttributeAwareFigure) {
            IAttributeAwareFigure attrStateFigure = (IAttributeAwareFigure) stateFigure;

            invalidateLabels(stateFigure);

            // trigger the actual layout-process
            doTableLayout(attrStateFigure, getCorrespondingLayout(attrStateFigure));
        }
    }

    /**
     * Table-Layout will center the upper parts (hori. and vert.) while the lower parts are
     * stretched vertically over the whole space.
     * 
     * @param stateFigure
     *            The graphical element which is about to be layouted
     * @param state
     *            The associated model element
     */
    private void doTableLayout(final IAttributeAwareFigure stateFigure,
            final ExtendedTable tableLayout) {
        /* first set all children to zero size */
        setChildrenToZeroSize(stateFigure);

        /*
         * now calculate the new dimensions for the child-figures of the stateFigure on the basis of
         * the given tableLayout
         */
        LayoutSizes layoutSizes = calculateLayoutSizes(tableLayout, stateFigure);

        /*
         * If the state had been resized manually, we have to set the sizes correct and pretend that
         * the user-given size is the preferredSize
         */
        Rectangle clientArea = stateFigure.getClientArea();
        if (layoutSizes.getPreferredHeight() < clientArea.height) {
            layoutSizes.setPreferredHeight(clientArea.height);
        }
        if (layoutSizes.getPreferredWidth() < clientArea.width) {
            layoutSizes.setPreferredWidth(clientArea.width);
        }
        
        /* Set the figure to correct outer bounds for figures with static bounds */
        correctSize(stateFigure, new Dimension(layoutSizes.getMinimumWidth(), layoutSizes
                .getMinimumHeight()));

        /* Assign the calculated dimensions to the stateFigure */
        setAlignedLayout(tableLayout, stateFigure, layoutSizes);
    }

    /**
     * Calculates the layout sizes for a given table-layout. This means we calculate for every cell
     * of our table-layout the preferred size and and the minimum size. Additionally we take this
     * cell-sizes to calculate the preferred- and minimum-size of the whole table.
     * 
     * @return Returns the preferred- and minimum-size for the given layout
     */
    private LayoutSizes calculateLayoutSizes(final ExtendedTable layout, final IFigure stateFigure) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = stateFigure.getChildren();
        Cell[][] table = layout.table;
        IFigure child = null;
        int preferredStateHeight = 0, preferredStateWidth = 0;
        int minimumStateHeight = 0, minimumStateWidth = 0;

        /*
         * collect preferred widths and heights Do not consider empty figures traverse the table
         * first row-wise
         */
        Dimension[][] layoutSizes = new Dimension[table.length][];
        for (int row = 0; row < table.length; row++) {
            /*
             * We have to calculate the width for every row because we allow elements side by side
             */
            int preferredRowWidth = 0, preferredRowHeight = 0;
            int minimumRowWidth = 0, minimumRowHeight = 0;

            /* Now go through every column */
            layoutSizes[row] = new Dimension[table[row].length];
            for (int column = 0; column < table[row].length; column++) {
                /* default all elements are considered empty */
                Dimension preferredSize = new Dimension();
                Dimension minimumSize = new Dimension();

                /* get the the layout-cell and its associated figure */
                Cell cell = table[row][column];
                child = children.get(cell.figure);

                /*
                 * If the figure is the adjustable layout-element then assign a statically minimum
                 * size if it is empty
                 */
                if (cell.figure == layout.adjustableCanvas) {
                    if (cell.isEmpty) {
                        minimumSize = new Dimension(layout.getMinWidth(), layout.getMinHeight());
                    } else if (child instanceof ResizableCompartmentFigure 
                            && !((ResizableCompartmentFigure)child).isExpanded()) {
                        /*Collapsed Compartments should just get space for their expand-trigger*/
                        minimumSize = child.getMinimumSize();
                        /* TODO : For regions we normaly would need here getPreferredSize.*/
                        preferredSize = child.getMinimumSize(); 
                    } else {
                        preferredSize = child.getPreferredSize();

                        /*
                         * ATM we use preferredSize for calculation the minimum size here, as the
                         * resulting minimum size is used for the Dimension of the outer borders and
                         * in fact we want the inner elements to have theier preferred sizes.
                         */
                        if (child instanceof WrappingLabel) {
                            minimumSize = child.getPreferredSize();
                        } else {
                            minimumSize = new Dimension(layout.getMinWidth(), layout.getMinHeight());
                        }
                    }

                    /* Resizeable elements are only visible if not empty */
                } else if (child instanceof ResizableCompartmentFigure) {
                    ResizableCompartmentFigure compartment = (ResizableCompartmentFigure) child;
                    if (cell.isEmpty) {
                        setTitleVisibility(compartment, false); 
                    } else if (! compartment.isExpanded()) {
                        /*Collapsed Compartments should just get space for their expand-trigger*/
                        minimumSize = compartment.getMinimumSize();
                        /* TODO : For regions we normaly would need here getPreferredSize.*/
                        preferredSize = compartment.getMinimumSize(); 
                    } else {
                    
                        minimumSize = compartment.getContentPane().getMinimumSize();
                        /* TODO : For regions we normaly would need here getPreferredSize.*/
                        preferredSize = compartment.getContentPane().getMinimumSize();
                        
                        setTitleVisibility(compartment, true);
                    }

                    /*
                     * Separators have no height and no width, all others get their preferred ones
                     */
                } else if (layout.horizontalAlignment[row] != ExtendedTable.SEPARATOR) {
                    if (!cell.isEmpty) {
                        preferredSize = child.getPreferredSize();

                        /*
                         * Take the preferred size as minimum size for wrapping labels, as we want
                         * labels to be always written out.
                         */
                        if (child instanceof WrappingLabel) {
                            minimumSize = child.getPreferredSize();
                        } else {
                            minimumSize = child.getMinimumSize();
                        }
                    }
                }

                /* we sum up the width of every cell to get the row width */
                preferredRowWidth += preferredSize.width;
                minimumRowWidth += minimumSize.width;

                /* take maximum height of row */
                if (preferredSize.height > preferredRowHeight) {
                    preferredRowHeight = preferredSize.height;
                }
                if (minimumSize.height > minimumRowHeight) {
                    minimumRowHeight = minimumSize.height;
                }

                /* save the preferred and minimum sizez for every cell */
                layoutSizes[row][column] = preferredSize;
            }

            /* Set the widths for the complete row, to avoid scrollbars we add 1 pix each side. */
            preferredRowWidth += 2;
            if (preferredRowWidth > preferredStateWidth) {
                preferredStateWidth = preferredRowWidth ;
            }
            
            minimumRowWidth += 2;
            if (minimumRowWidth > minimumStateWidth) {
                minimumStateWidth = minimumRowWidth ;
            }

            /* Set the height for the complete row */
            preferredStateHeight += preferredRowHeight;
            minimumStateHeight += minimumRowHeight;
        }
        return new LayoutSizes(layoutSizes, preferredStateHeight, preferredStateWidth,
                minimumStateHeight, minimumStateWidth);
    }

    /**
     * Layout the inner elements of stateFigure (resp. its children) to positions resulting from
     * layoutSizes with dimensions taken direct from layoutSizes. To get the x,y-position for every
     * inner element, the method has to iterate over the layoutSizes with the given layout.
     * 
     * @param layout
     *            Container for the corresponding layout about to be applied to the stateFigure
     * 
     * @param stateFigure
     *            The graphical element about to be layouted
     * 
     * @param layoutSizes
     *            Container for the calculated sizes of the inner elements of stateFigure
     */
    private void setAlignedLayout(final ExtendedTable layout, final IFigure stateFigure,
            final LayoutSizes layoutSizes) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = stateFigure.getChildren();
        Cell[][] table = layout.table;
        int minimumStateHeight = layoutSizes.getMinimumHeight();
        int stateWidth = layoutSizes.getPreferredWidth();
        Dimension[][] prefSize = layoutSizes.getPreferredSizes();
        Rectangle clientArea = stateFigure.getClientArea();
        int offsetY;

        /*
         * Vertical Alignment is only concerned state-wide, which means that all cells can be
         * vertically centered or justified from top to bottom
         */
        if (layout.verticalAlignment == ExtendedTable.JUSTIFY) {
            offsetY = 0;
        } else {
            offsetY = clientArea.height / 2 - minimumStateHeight / 2;
        }

        /* Start row-wise to set the correct cell-bounds */
        for (int row = 0; row < table.length; row++) {

            /* We leave a little border for anchors */
            int offsetX = 1;
            Rectangle newBounds = new Rectangle();
            int rowHeight = 0;

            /* Decide which layout we have for this row */
            if (layout.horizontalAlignment[row] == ExtendedTable.JUSTIFY) {

                /*
                 * If justify then we have to search the last cell of the row which is not empty and
                 * therefore should be stretched to the right border
                 */
                int lastExpanded = 0;
                for (int i = table[row].length - 1; i > 0; i--) {
                    if (prefSize[row][i].width > 0) {
                        lastExpanded = i;
                        break;
                    }
                }

                /*
                 * now set column-wise the preferred size for each cell, last one stretched
                 */
                for (int column = 0; column < table[row].length; column++) {
                    Cell cell = table[row][column];
                    newBounds.x = clientArea.x + offsetX;
                    newBounds.y = clientArea.y + offsetY;

                    int width = prefSize[row][column].width;
                    if (width == 0) {
                        newBounds.width = 0;
                    } else if (column == lastExpanded) {
                        newBounds.width = stateWidth - 1 - offsetX;
                    } else {
                        newBounds.width = width;
                    }
                    newBounds.height = prefSize[row][column].height;

                    /* Set the new bounds to the referenced cell */
                    children.get(cell.figure).setBounds(newBounds);

                    /*
                     * increase the offset as the next cells shall be next to each other
                     */
                    offsetX += newBounds.width;

                    /* Update the rowheight to the height of the biggest cell */
                    if (rowHeight < newBounds.height) {
                        rowHeight = newBounds.height;
                    }
                }

                /*
                 * For centric row-layout we have to calculate the sum of all cell-widths
                 */
            } else if (layout.horizontalAlignment[row] == ExtendedTable.CENTER) {
                /* sum up column-wise */
                int rowWidth = 0;
                for (int column = 0; column < layout.table[row].length; column++) {
                    rowWidth += prefSize[row][column].width;
                }

                /*
                 * now set column-wise the preferred size for each cell, start at the calculated
                 * x-value to center them
                 */
                offsetX = ((clientArea.width - rowWidth) / 2);
                for (int column = 0; column < table[row].length; column++) {
                    Cell cell = table[row][column];
                    newBounds.x = clientArea.x + offsetX;
                    newBounds.y = clientArea.y + offsetY;
                    newBounds.width = prefSize[row][column].width;
                    newBounds.height = prefSize[row][column].height;
                    children.get(cell.figure).setBounds(newBounds);
                    offsetX += newBounds.width;

                    /* Update the rowheight to the height of the biggest cell */
                    if (rowHeight < newBounds.height) {
                        rowHeight = newBounds.height;
                    }
                }

                /*
                 * Separators get their size set depending on the calculated state-width and the
                 * right x-position
                 */
            } else if (layout.horizontalAlignment[row] == ExtendedTable.SEPARATOR) {
                /* get the referenced separator */
                Cell cell = table[row][0];
                Polyline regionSeparator = (Polyline) children.get(cell.figure);
                PointList points = new PointList();

                /* full expanded from left to right */
                int left = 1 + layout.padding;
                /* TODO : had problems with old calculation via stateWidth, therefore fallback to
                 * getParent().getBounds() as this gives right result. Old calculation resulted in 
                 * separator overhanging the (right) state-border*/
                int right = regionSeparator.getParent().getBounds().width - 1 - layout.padding;

                /* It gets layouted direct under the predecessing row */
                int regionSeparatorHeight = clientArea.y + offsetY;
                
                /*For ie RoundedRectangles the shape has rounded corners, therefore we have to introduce
                 * a padding when we paint the separator next to the corners.*/
                if(regionSeparatorHeight < layout.getMinHeight() / 2){
                	left++;
                	right--;
                }
                	
                points.addPoint(new Point(left, regionSeparatorHeight));
                points.addPoint(new Point(Math.max(left, right), regionSeparatorHeight));
                regionSeparator.setPoints(points);
            }

            /* Increase the y-offset by the calculated maximum rowHeight */
            offsetY += rowHeight;
        }
    }

    /** Set all children of given stateFigure to zero size. */
    private void setChildrenToZeroSize(final IFigure stateFigure) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = stateFigure.getChildren();
        for (IFigure childFigure : children) {
            if (childFigure instanceof Polyline) {
                /* hide region separator line by setting an empty point list */
                ((Polyline) childFigure).setPoints(new PointList());
            } else {
                childFigure.setBounds(new Rectangle());
            }
        }
    }

    @Override
    public Dimension calculateMinimumSize(final IFigure stateFigure, final int whint,
            final int hhint) {
        if (!(stateFigure instanceof IAttributeAwareFigure)) {
            return super.calculateMinimumSize(stateFigure, whint, hhint);
        }
        ExtendedTable layout = getCorrespondingLayout(stateFigure);
        LayoutSizes layoutSizes = calculateLayoutSizes(layout, stateFigure);
        return new Dimension(Math.max(layoutSizes.getMinimumWidth(), layout.getMinWidth()), Math
                .max(layoutSizes.getMinimumHeight(), layout.getMinHeight()));
    }

    /**
     * Calculate the preferred size of the figure.
     * 
     * @param stateFigure
     *            the figure
     * @param whint
     *            the width hint
     * @param hhint
     *            the height hint
     * @return the preferred size
     */
    @Override
    protected Dimension calculatePreferredSize(final IFigure stateFigure, final int whint,
            final int hhint) {
        if (!(stateFigure instanceof IAttributeAwareFigure)) {
            return super.calculateMinimumSize(stateFigure, whint, hhint);
        }
        LayoutSizes layoutSizes = calculateLayoutSizes(getCorrespondingLayout(stateFigure),
                stateFigure);
        return new Dimension(layoutSizes.getPreferredWidth(), layoutSizes.getPreferredHeight());
    }

    /**
     * Invalidate all child labels of the given figure. This will cause all cached size values to be
     * reset. This is necessary because of an GMF bug that does not invalidate a label when a font
     * has changed. Hence all minimum and preferred sizes are cached wrongly.
     * 
     * This one? https://bugs.eclipse.org/bugs/show_bug.cgi?id=235549
     * 
     * @param parent
     *            figure for which labels are invalidated
     */
    private static void invalidateLabels(final IFigure parent) {
        for (Object child : parent.getChildren()) {
            if (child instanceof WrappingLabel) {
                ((WrappingLabel) child).invalidate();
                invalidateChildren((IFigure) child);
            }
        }
    }

    /**
     * Invalidate all child figures of the given figure.
     * 
     * @param parent
     *            figure for which children are invalidated
     */
    private static void invalidateChildren(final IFigure parent) {
        for (Object child : parent.getChildren()) {
            if (child instanceof IFigure) {
                ((IFigure) child).invalidate();
                invalidateChildren((IFigure) child);
            }
        }
    }

    /**
     * Set the visibility of a compartment's title label.
     * 
     * @param compartment
     *            a compartment figure
     * @param visible
     *            true if visible, false otherwise
     */
    private void setTitleVisibility(final ResizableCompartmentFigure compartment,
            final boolean visible) {
        for (Object child : compartment.getContentPane().getChildren()) {
            if (child instanceof WrappingLabel) {
                ((WrappingLabel) child).setVisible(visible);
            }
        }
    }

    /**
     * Method is called by the layout-routine, to correct the size of the stateFigure if need (ie.
     * for non userResizeable states like CONDITIONAL in SyncCharts, or for too small states)
     */
    private void correctSize(final IAttributeAwareFigure stateFigure, final Dimension minimumSize) {
        ExtendedTable layout = getCorrespondingLayout(stateFigure);
        Rectangle bounds = stateFigure.getBounds();

        /*
         * If state is resizeable but too small we want it to have the given minimum size
         */
        if (layout.isUserResizeable()
                && (bounds.width < minimumSize.width || bounds.height < minimumSize.height)) {

            bounds.width = Math.max(bounds.width, minimumSize.width);
            bounds.height = Math.max(bounds.height, minimumSize.height);

            stateFigure.getParent().setBounds(bounds);
            // stateFigure.setBoundsDirect(bounds);

            /*
             * If the state is not resizeable we want it to get set to minimum size
             */
        } else if (!layout.isUserResizeable()) {
            /*
             * TODO : Normally should be the dynamically calculated minSize not the static one.
             */
            bounds.width = layout.getMinWidth();
            bounds.height = layout.getMinHeight();
            stateFigure.getParent().setBounds(bounds);
            // stateFigure.setBoundsDirect(bounds);
        }
    }

    /**
     * Checks the new size of the state figure.
     * 
     * @param stateFigure
     *            the state figure
     * @param state
     *            the corresponding model element
     * @param newBounds
     *            the new bounds of the state figure
     */
    public void checkNewSize(final IFigure stateFigure, final EObject state,
            final Rectangle newBounds) {
        ExtendedTable layout = getCorrespondingLayout(stateFigure);
        if (!layout.isUserResizeable()) {
            newBounds.width = layout.getMinWidth();
            newBounds.height = layout.getMinHeight();
            stateFigure.getParent().setBounds(newBounds);
        }
    }

    /**
     * Helper method for printing out all children of a figure to the terminal. Usefull if the gmf
     * figure changes and we have to observe/verify the new child-indices.
     */
    @SuppressWarnings("unused")
    private void printChildOverview(final IFigure state) {
        System.out.println("Overview for : " + state);
        System.out.println("-------------------------------------------------");
        int index = 0;
        for (Object child : state.getChildren()) {
            if (child instanceof ResizableCompartmentFigure) {
                System.out.println(index + " : " + getName((ResizableCompartmentFigure) child));
            } else {
                System.out.println(index + " : " + child.toString());
            }
            index++;
        }
    }

    /**
     * Helper-method used by printChildOverview.
     * 
     * Retrieve the name of a figure by searching for a label.
     * 
     * @param figure
     *            a figure
     * @return the name of the figure
     */
    private static String getName(final IFigure figure) {
        for (Object child : figure.getChildren()) {
            if (child instanceof WrappingLabel) {
                return ((WrappingLabel) child).getText();
            } else {
                String childName = getName((IFigure) child);
                if (childName.length() > 0) {
                    return childName;
                }
            }
        }
        return "";
    }
}
