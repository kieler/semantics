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
package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import de.cau.cs.kieler.core.ui.figures.DoubleRoundedRectangle;
import de.cau.cs.kieler.core.ui.figures.IAttributeAwareFigure;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;

/**
 * A special layout for states: If the state is simple, its name is written in the center and the
 * compartments are reduced in size to zero. If the state is complex, the name is written on top and
 * the compartments are laid out in a column below the name.
 * 
 * @kieler.rating 2010-01-27 proposed yellow msp
 * @author schm
 * @author haf
 * @author msp
 */
public class StateLayout extends AbstractHintLayout {

    /** minimal height for normal states. */
    public static final int MIN_HEIGHT = 30;
    /** minimal width for normal states. */
    public static final int MIN_WIDTH = 30;
    /** minimal height for conditional states. */
    public static final int COND_HEIGHT = 20;
    /** minimal width for conditional states. */
    public static final int COND_WIDTH = 20;
    
    private static final String REGION_COMP_NAME = "RegionCompartment";
    private static final String SIGNAL_COMP_NAME = "Signal";
    private static final String VARIABLE_COMP_NAME = "Variable";
    private static final String ENTRY_ACTION_COMP_NAME = "OnEntryAction";
    private static final String INSIDE_ACTION_COMP_NAME = "OnInsideAction";
    private static final String EXIT_ACTION_COMP_NAME = "OnExitAction";
    private static final String SUSP_COMP_NAME = "Suspend";

    private boolean containsRegions;
    private boolean containsSignals;
    private boolean containsVariables;
    private boolean containsEntryActions;
    private boolean containsInsideActions;
    private boolean containsExitActions;
    private boolean containsSuspensionTrigger;

    /**
     * Creates a state layout.
     */
    public StateLayout() {
        isObservingVisibility = true;
    }
    
    /**
     * {@inheritDoc}
     */
    public void layout(final IFigure stateFigure) {
        if (isObservingVisibility && !stateFigure.isVisible()) {
            return;
        }

        // check whether the figure is an attribute aware state and whether it is
        // a simple or a complex state
        if (stateFigure instanceof IAttributeAwareFigure) {
            AttributeAwareStateFigure attrStateFigure = (AttributeAwareStateFigure) stateFigure;
            Notifier modelElement = attrStateFigure.getTarget();
            if (modelElement instanceof State) {
                State state = (State) modelElement;
                // check the size of the state and correct it if required
                checkSize(attrStateFigure, state);
                
                invalidateLabels(stateFigure);
                if (checkComplex(state)) {
                    complexLayout(stateFigure, state);
                } else {
                    simpleLayout(stateFigure, state);
                }
            }
        }
    }

    /**
     * Invalidate all child labels of the given figure. This will cause
     * all cached size values to be reset. This is necessary because of an
     * GMF bug that does not invalidate a label when a font has changed.
     * Hence all minimum and preferred sizes are cached wrongly.
     * 
     * @param parent figure for which labels are invalidated
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
     * @param parent figure for which children are invalidated
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
     * Check whether the currently watched state is a complex state.
     * 
     * @param state the checked state
     * @return {@code true} if complex, {@code false} otherwise
     */
    private boolean checkComplex(final State state) {
        containsRegions = state.getRegions().size() > 0;
        containsSignals = state.getSignals().size() > 0;
        containsVariables = false;
        containsEntryActions = state.getEntryActions().size() > 0;
        containsInsideActions = state.getInnerActions().size() > 0;
        containsExitActions = state.getExitActions().size() > 0;
        containsSuspensionTrigger = state.getSuspensionTrigger() != null;
        
        return (containsRegions || containsSignals || containsVariables
                || containsEntryActions || containsInsideActions || containsExitActions
                || containsSuspensionTrigger) && state.getType() != StateType.CONDITIONAL;
    }

    /**
     * Apply layout for complex states.
     * 
     * @param stateFigure the state figure
     * @parem state the state model object
     */
    private void complexLayout(final IFigure stateFigure, final State state) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = stateFigure.getChildren();
        Rectangle clientArea = stateFigure.getClientArea();

        // collect preferred widths and heights
        int numChildren = children.size();
        int totalWidth = 0;
        int totalHeight = 0;
        int[] prefWidths = new int[numChildren];
        int[] prefHeights = new int[numChildren];
        Rectangle newBounds = new Rectangle();
        int regionSeparatorHeight = 0;
        int i = 0;
        for (IFigure childFigure : children) {
            if (!(childFigure instanceof Polyline)) {
                Dimension size;
                // empty compartments are not considered
                if (childFigure instanceof ResizableCompartmentFigure) {
                    ResizableCompartmentFigure compartment =
                        (ResizableCompartmentFigure) childFigure;
                    String compartmentName = getName(compartment);
                    if (compartmentName.equals(REGION_COMP_NAME)) {
                        if (containsRegions) {
                            size = compartment.getPreferredSize();
                        } else {
                            size = new Dimension();
                        }
                        // set the y position of the region separator polyline to the current
                        // calculated total height = y position of region compartment
                        regionSeparatorHeight = totalHeight;
                    } else if (isEmptyCompartment(compartmentName) || !compartment.isExpanded()) {
                        size = new Dimension();
                        setTitleVisibility(compartment, false);
                    } else {
                        size = compartment.getContentPane().getPreferredSize(clientArea.width - 2, -1);
                        // make title label visible if the compartment is not a region compartment
                        // and has more than the title label as content
                        setTitleVisibility(compartment, true);
                    }
                } else {
                    size = childFigure.getPreferredSize();
                }
    
                // take maximum width and sum of heights
                prefWidths[i] = size.width;
                prefHeights[i] = size.height;
                totalHeight += size.height;
                if (size.width > totalWidth) {
                    totalWidth = size.width;
                }
            }
            i++;
        }

        if (totalHeight < clientArea.height) {
            totalHeight = clientArea.height;
        }
        if (totalWidth < clientArea.width) {
            totalWidth = clientArea.width;
        }

        // labels are centered in the upper area while compartments share the
        // rest of the space, always using the full available width
        int offsetY = 0;
        i = 0;
        for (IFigure childFigure : children) {
            if (childFigure instanceof Polyline) {
                // handle region separator
                Polyline regionSeparator = (Polyline) childFigure;
                PointList points = new PointList();
                int left = 1;
                int right = totalWidth - 1;
                if (state.isIsFinal()) {
                    left += DoubleRoundedRectangle.BORDER_WIDTH;
                    right -= DoubleRoundedRectangle.BORDER_WIDTH;
                }
                points.addPoint(new Point(left, regionSeparatorHeight));
                points.addPoint(new Point(Math.max(left, right), regionSeparatorHeight));
                regionSeparator.setPoints(points);
            } else if (childFigure instanceof WrappingLabel) {
                newBounds.x = clientArea.x + (clientArea.width - prefWidths[i]) / 2;
                newBounds.y = clientArea.y;
                newBounds.width = prefWidths[i];
                newBounds.height = prefHeights[i];
                childFigure.setBounds(newBounds);
            } else if (childFigure instanceof ShapeCompartmentFigure) {
                // leave a little border so that transition anchors
                // can be moved freely by the user
                newBounds.x = clientArea.x + 1;
                newBounds.y = clientArea.y + offsetY;
                if (prefWidths[i] == 0) {
                    newBounds.width = 0;
                } else {
                    newBounds.width = totalWidth - 2;
                }
                // stretch the last element over the remaining space
                if (i == (numChildren - 1)) {
                    newBounds.height = totalHeight - offsetY;
                } else {
                    newBounds.height = prefHeights[i];
                }
                childFigure.setBounds(newBounds);
            }
            offsetY += prefHeights[i];
            i++;
        }
    }
    
    /**
     * Set the visibility of a compartment's title label.
     * 
     * @param compartment a compartment figure
     * @param visible true if visible, false otherwise
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
     * Retrieve the name of a figure by searching for a label.
     * 
     * @param figure a figure
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
    
    /**
     * Checks whether the compartment with given name is empty.
     * 
     * @param compartmentName name of the compartment
     * @return true if the compartment has no children
     */
    private boolean isEmptyCompartment(final String compartmentName) {
        return (compartmentName.startsWith(SIGNAL_COMP_NAME) && (!containsSignals))
            || (compartmentName.startsWith(VARIABLE_COMP_NAME) && (!containsVariables))
            || (compartmentName.startsWith(ENTRY_ACTION_COMP_NAME) && (!containsEntryActions))
            || (compartmentName.startsWith(INSIDE_ACTION_COMP_NAME) && (!containsInsideActions))
            || (compartmentName.startsWith(EXIT_ACTION_COMP_NAME) && (!containsExitActions))
            || (compartmentName.startsWith(SUSP_COMP_NAME) && (!containsSuspensionTrigger));
    }

    /**
     * Apply layout for simple states.
     * 
     * @param stateFigure the state figure
     * @param state the state model object
     */
    private void simpleLayout(final IFigure stateFigure, final State state) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = stateFigure.getChildren();
        Rectangle clientArea = stateFigure.getClientArea();
        
        int prefWidth = 0;
        int prefHeight = 0;
        for (IFigure childFigure : children) {
            if (childFigure instanceof WrappingLabel) {
                Dimension preferredSize = childFigure.getPreferredSize();
                if (preferredSize.width > prefWidth) {
                    prefWidth = preferredSize.width;
                }
                if (preferredSize.height > prefHeight) {
                    prefHeight = preferredSize.height;
                }
            }
        }

        // the label is centered in the middle, and the compartments are hidden
        // by setting their size to 0
        for (IFigure childFigure : children) {
            if (childFigure instanceof WrappingLabel) {
                Rectangle newBounds = new Rectangle();
                Dimension preferredSize = childFigure.getPreferredSize();
                newBounds.x = clientArea.x + (clientArea.width / 2) - (preferredSize.width / 2);
                newBounds.y = clientArea.y + (clientArea.height / 2) - (preferredSize.height / 2);
                newBounds.width = preferredSize.width + 2;
                newBounds.height = preferredSize.height;
                childFigure.setBounds(newBounds);
            } else if (childFigure instanceof ResizableCompartmentFigure) {
                Rectangle newBounds = new Rectangle();
                newBounds.x = clientArea.x;
                newBounds.y = clientArea.y;
                newBounds.width = 0;
                newBounds.height = 0;
                childFigure.setBounds(newBounds);
            } else if (childFigure instanceof Polyline) {
                // hide region separator line by setting an empty point list
                ((Polyline) childFigure).setPoints(new PointList());
            }
        }
    }

    /**
     * Returns the minimum size of the figure. The minimum size of a simple state
     * is fixed. The minimum height of complex states is the sum of all its
     * children's minimum heights, while its minimum width is the maximum of all
     * its children's minimum sizes. However, empty compartments are not considered.
     * 
     * @param stateFigure the figure on which this layout is installed
     * @param whint the width hint
     * @param hhint the height hint
     * @return the layout's minimum size
     */
    @Override
    public Dimension calculateMinimumSize(final IFigure stateFigure, final int whint, final int hhint) {
        if (!(stateFigure instanceof IAttributeAwareFigure)) {
            return super.calculateMinimumSize(stateFigure, whint, hhint);
        }
        Notifier modelElement = ((IAttributeAwareFigure) stateFigure).getTarget();
        if (modelElement instanceof State) {
            State state = (State) modelElement;
            @SuppressWarnings("unchecked")
            List<IFigure> children = stateFigure.getChildren();

            if (state.getType() == StateType.CONDITIONAL) {
                return new Dimension(COND_WIDTH, COND_HEIGHT);
            } else if (checkComplex(state)) {
                int minWidth = MIN_WIDTH;
                int minHeight = 0;
                for (IFigure childFigure : children) {
                    if (childFigure instanceof ShapeCompartmentFigure) {
                        String compartmentName = getName((ShapeCompartmentFigure) childFigure);
                        if (compartmentName.equals(REGION_COMP_NAME)) {
                            // add a default minimum size so that the region compartment
                            // is visible after all
                            minHeight += StateLayout.MIN_HEIGHT;
                        } else  {
                            Rectangle childBounds = childFigure.getBounds();
                            // if we have manually set the bounds to zero, ignore
                            // the bounds for minimal size calculations
                            if (childBounds.height > 0 && childBounds.width > 0) {
                                Dimension minimumSize = ((ShapeCompartmentFigure) childFigure)
                                        .getContentPane().getMinimumSize();
                                if (minimumSize.width >= minWidth) {
                                    // add 1 pixel to avoid scroll bars (this was added
                                    // during layout above)
                                    minWidth = minimumSize.width + 2;
                                }
                                minHeight += minimumSize.height;
                            }
                        }
                    } else if (childFigure instanceof WrappingLabel) {
                        Dimension preferredSize = childFigure.getPreferredSize();
                        if (preferredSize.width >= minWidth) {
                            minWidth = preferredSize.width;
                        }
                        minHeight += preferredSize.height;
                    }
                }
                return new Dimension(minWidth, minHeight);
            } else {
                for (IFigure childFigure : children) {
                    // set the minimal size of a state with a label
                    // increase the size a bit such that the text looks proper even
                    // for a final state
                    if (childFigure instanceof WrappingLabel) {
                        Dimension preferredSize = childFigure.getPreferredSize();
                        return new Dimension(
                                Math.max(preferredSize.width, MIN_WIDTH),
                                Math.max(preferredSize.height, MIN_HEIGHT));
                    }
                }
            }
        }
        return new Dimension(StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT);
    }


    /**
     * Calculate the preferred size of the figure.
     * 
     * @param stateFigure the figure
     * @param whint the width hint
     * @param hhint the height hint
     * @return the preferred size
     */
    @Override
    protected Dimension calculatePreferredSize(final IFigure stateFigure,
            final int whint, final int hhint) {
        Dimension size = calculateMinimumSize(stateFigure, whint, hhint);
        return size;
    }
    
    /** size of the state figure as cached from the last size check. */
    private Dimension cachedSize;
    
    /**
     * Checks the current size of the state figure.
     * 
     * @param stateFigure the state figure
     * @param state the corresponding model element
     */
    private void checkSize(final AttributeAwareStateFigure stateFigure, final State state) {
        Rectangle bounds = stateFigure.getBounds();
        if (state.getType() == StateType.CONDITIONAL) {
            if (bounds.width != StateLayout.COND_WIDTH || bounds.height != StateLayout.COND_HEIGHT) {
                cachedSize = bounds.getSize();
                bounds.width = StateLayout.COND_WIDTH;
                bounds.height = StateLayout.COND_HEIGHT;
                stateFigure.getParent().setBounds(bounds);
                stateFigure.setBoundsDirect(bounds);
            }
        } else {
            Dimension minSize = calculateMinimumSize(stateFigure, -1, -1);
            if (bounds.width < minSize.width || bounds.height < minSize.height) {
                if (cachedSize == null) {
                    bounds.width = Math.max(bounds.width, minSize.width);
                    bounds.height = Math.max(bounds.height, minSize.height);
                } else {
                    bounds.width = cachedSize.width;
                    bounds.height = cachedSize.height;
                }
                stateFigure.getParent().setBounds(bounds);
                stateFigure.setBoundsDirect(bounds);
            }
        }
    }
    
    /**
     * Checks the new size of the state figure.
     * 
     * @param stateFigure the state figure
     * @param state the corresponding model element
     * @param newBounds the new bounds of the state figure
     */
    public void checkNewSize(final IFigure stateFigure, final State state, final Rectangle newBounds) {
        if (state.getType() == StateType.CONDITIONAL) {
            if (newBounds.width != StateLayout.COND_WIDTH
                    || newBounds.height != StateLayout.COND_HEIGHT) {
                cachedSize = newBounds.getSize();
                newBounds.width = StateLayout.COND_WIDTH;
                newBounds.height = StateLayout.COND_HEIGHT;
                stateFigure.getParent().setBounds(newBounds);
            }
        }
    }
    
}
