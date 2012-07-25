/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui.views;

import java.util.LinkedList;

import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;

import de.cau.cs.kieler.sim.signals.Signal;
import de.cau.cs.kieler.sim.signals.SignalList;

/**
 * The class SignalsPlotter implements the basic plotter for the synchronous signals. It can be
 * zoomed using a zoom level (in percent).
 * 
 * TODO: For a possible re-implementation, consider extending
 * org.eclipse.jface.viewers.ContentViewer and working with a content provider.
 * 
 * @kieler.rating 2012-07-25 yellow KI-21
 * 
 * @author cmot
 */
public class SignalsPlotter {

    /** The fixed size constants. */
    private static final int XSPACE = 25;

    /** The YOFFSET. */
    private static final int YOFFSET = 40;

    /** The YSPACE. */
    private static final int YSPACE = 40;

    /** The XOFFSET. */
    private static final int XOFFSET = 60;

    /** The SIGNALLABELSAFETYMARGINSPACE. */
    private static final String SIGNALLABELSAFETYMARGINSPACE = "  ";

    /** The zoomed size variables. */
    private static final int DEFAULT_ZOOMEDXPACE = 25;
    private int zoomedXSpace = DEFAULT_ZOOMEDXPACE;

    /** The zoomed y offset. */
    private static final int DEFAULT_ZOOMEDYOFFSET = 40;
    private int zoomedYOffset = DEFAULT_ZOOMEDYOFFSET;

    /** The zoomed y space. */
    private static final int DEFAULT_ZOOMEDYSPACE = 40;
    private int zoomedYSpace = DEFAULT_ZOOMEDYSPACE;

    /** The zoomed x space. */
    private static final int DEFAULT_ZOOMEDXSPACETIMELINE = 5;
    private int zoomedXSpaceTimeLine = DEFAULT_ZOOMEDXSPACETIMELINE;

    /** The zoomed x offset. */
    private static final int DEFAULT_ZOOMEDXOFFSET = 60;
    private int zoomedXOffset = DEFAULT_ZOOMEDXOFFSET;

    /** The signal list. */
    private SignalList signalList;

    /** The SWT parent. */
    private Composite parent;

    /** The signal contents. */
    private Panel signalContents;

    /** The outer scrolled composite. */
    private ScrolledComposite outerScrolledComposite;

    /** The outer canvas. */
    private FigureCanvas outerCanvas;

    /** The colors for disposal list. */
    private LinkedList<Color> colorsForDisposalList = new LinkedList<Color>();

    /** The fonts for disposal list. */
    private LinkedList<Font> fontsForDisposalList = new LinkedList<Font>();

    /**
     * The initial signal name size. This is re-calculated with the maximal label size each time
     * plot() is called.
     */
    private static final Dimension DEFAULT_SIGNAL_NAME_SIZE = new Dimension(100, 40);
    private Dimension signalNameSize = DEFAULT_SIGNAL_NAME_SIZE;

    // Some factors used for calculating the right position of elements
    private static final int FACTOR_2 = 2;
    private static final int FACTOR_4 = 4;
    private static final int FACTOR_5 = 5;
    private static final int FACTOR_8 = 8;
    private static final int FACTOR_11 = 11;
    private static final int FACTOR_14 = 14;
    private static final int FACTOR_20 = 20;
    private static final int FACTOR_100 = 100;
    private static final int FACTOR_200 = 200;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signals plotter.
     * 
     * @param parent
     *            the parent
     */
    public SignalsPlotter(final Composite parent) {
        setParent(parent);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal list.
     * 
     * @param signalList
     *            the new signal list
     */
    public void setSignalList(final SignalList signalList) {
        this.signalList = signalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the parent.
     * 
     * @param parent
     *            the new parent
     */
    public void setParent(final Composite parent) {
        this.parent = parent;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the focus.
     */
    public void setFocus() {
        outerScrolledComposite.setFocus();
    }

    // -------------------------------------------------------------------------

    /**
     * Disposes all used resources (colors and fonts) of this plotter. This must be called after
     * each call to plot.
     */
    public void dispose() {
        for (Color color : this.colorsForDisposalList) {
            color.dispose();
        }
        colorsForDisposalList.clear();
        for (Font font : this.fontsForDisposalList) {
            font.dispose();
        }
        fontsForDisposalList.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the outerScrolledComposite.
     * 
     * @return the scrolled composite
     */
    public ScrolledComposite getOuterScrolledComposite() {
        return this.outerScrolledComposite;
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate zoomed values relative to a zoomLevel.
     * 
     * @param zoomLevel
     *            the zoom level
     */
    private void zoom(final int zoomLevel) {
        zoomedXSpace = (XSPACE * zoomLevel) / FACTOR_100;
        zoomedYOffset = (YOFFSET * zoomLevel) / FACTOR_100;
        zoomedYSpace = (YSPACE * zoomLevel) / FACTOR_100;
        zoomedXOffset = (XOFFSET * zoomLevel) / FACTOR_100;
        zoomedXSpaceTimeLine = (signalNameSize.width * zoomLevel) / FACTOR_100;
    }

    // -------------------------------------------------------------------------

    /**
     * Plot with a defined zoomLevel.
     * 
     * @param zoomLevel
     *            the zoom level
     * @param colors
     *            the colors
     * @param defaultMode
     *            the default mode
     */
    public void plot(final int zoomLevel, final Colors colors, final boolean defaultMode) {
        // initially dispose old Color and Font objects
        dispose();

        // re-calculate zoomed values
        zoom(zoomLevel);

        // if no place to plot, or no data to plot, return.
        if (parent == null || signalList == null) {
            return;
        }

        // if no panel exists yet, create a new one
        if (signalContents == null) {
            signalContents = new Panel();
            signalContents.setLayoutManager(new XYLayout());
            Color color = new Color(Display.getCurrent(), colors.getBackgroundColor());
            signalContents.setBackgroundColor(color);

            outerScrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL
                    | SWT.V_SCROLL);
            outerScrolledComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
            outerScrolledComposite.getHorizontalBar().setIncrement(FACTOR_20);
            outerScrolledComposite.getHorizontalBar().setPageIncrement(FACTOR_200);
            outerScrolledComposite.getVerticalBar().setIncrement(FACTOR_20);
            outerScrolledComposite.getVerticalBar().setPageIncrement(FACTOR_200);
            outerScrolledComposite.setMinSize(0, 0);
            outerScrolledComposite.setExpandHorizontal(true);
            outerScrolledComposite.setExpandVertical(true);

            Composite outerComposite = new Composite(outerScrolledComposite, SWT.NONE);

            Layout layout = new FillLayout(SWT.HORIZONTAL);
            outerComposite.setLayout(layout);
            outerScrolledComposite.setContent(outerComposite);

            Composite outerComposite1 = new Composite(outerComposite, SWT.NONE);
            outerComposite1.setLayout(new FillLayout(SWT.HORIZONTAL));
            outerComposite1.setSize(FACTOR_200, outerComposite1.getSize().y);

            outerCanvas = new FigureCanvas(outerComposite1);
            outerCanvas.setContents(signalContents);
        }

        // draw signal view content buffered
        Panel buffer = new Panel();
        // FIXME: Possible improvement comment: Is it right that all Draw2D figures are created from
        // scratch each time the content is plotted? Isn't that quite inefficient? Couldn't the same
        // be achieved more efficiently by drawing directly on a GC?
        // Yes, this is true (first question). Draw2D figures are used to store additional
        // information like the tick number for mouse hover tool-tips and possibly for being able to
        // select a tick one day. Maybe an alternative implementation w/o this functionality could
        // draw directly to GC. left a comment.
        buffer.setLayoutManager(new XYLayout());
        Color color = new Color(Display.getCurrent(), colors.getBackgroundColor());
        colorsForDisposalList.add(color);
        buffer.setBackgroundColor(color);

        if (defaultMode) {
            // DRAW THE DEFAULT MODE
            drawSignals(buffer, colors);
            drawSignalNames(buffer, 0, Label.RIGHT, colors);
            if (signalList.size() > 0 && (signalList.getMaxTick() - signalList.getMinTick() > 0)) {
                // only draw left signal names if there is already data to be
                // displayed
                drawSignalNames(buffer,
                        outerScrolledComposite.getMinWidth() - signalNameSize.width, Label.LEFT,
                        colors);
            }
        } else {
            // DRAW THE TIMELINE MODE 2776
            drawTimeLine(buffer, colors, zoomLevel);

        }

        outerCanvas.setContents(buffer);

        // scroll to the center of selected tick
        long currentTick = signalList.getCurrentTick();
        long minTick = signalList.getMinTick();
        int visibleWidth = outerScrolledComposite.getParent().getSize().y;

        int xScroll = ((int) (currentTick - minTick) * zoomedXSpace 
                - (visibleWidth / FACTOR_2) + signalNameSize.width);
        if (!defaultMode) {
            // Scrolling in Time Line Mode
            xScroll = ((int) (currentTick - minTick) * zoomedXSpaceTimeLine
                    - (visibleWidth / FACTOR_2) + signalNameSize.width);

        }
        int yScroll = outerScrolledComposite.getOrigin().y;
        outerScrolledComposite.setOrigin(xScroll, yScroll);

    }

    // -------------------------------------------------------------------------

    /**
     * Calculate top position for time line.
     * 
     * @param font
     *            the font
     * @param signal
     *            the signal
     * @param space
     *            the space
     * @return the int
     */
    private int calculateTopPositionForTimeLine(final Font font, final Signal signal,
            final int space) {
        int totalHeight = calculateTotalHightForTimeLine(font, space);
        int index = signalList.indexOf(signal);
        int length = signalList.size();
        return ((totalHeight * index) / length) + space / 2;
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate top position for time line.
     * 
     * @param font
     *            the font
     * @param signal
     *            the signal
     * @param space
     *            the space
     * @return the int
     */
    private int calculateTopPositionForTimeLine(final Font font, final int space) {
        int totalHeight = calculateTotalHightForTimeLine(font, space);
        return totalHeight;
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate left position for time line.
     * 
     * @param font
     *            the font
     * @param signal
     *            the signal
     * @param tickXPos
     *            the tick x pos
     * @return the int
     */
    private int calculateLeftPositionForTimeLine(final Font font, final Signal signal,
            final int tickXPos) {
        Dimension currentDimension = TextUtilities.INSTANCE.getTextExtents(
                SIGNALLABELSAFETYMARGINSPACE + signal.getName() + SIGNALLABELSAFETYMARGINSPACE,
                font);
        return tickXPos - (currentDimension.width / 2);
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate width of a label.
     * 
     * @param font
     *            the font
     * @param text
     *            the text
     * @return the int
     */
    private int calculateLabelWidth(final Font font, final String text) {
        Dimension currentDimension = TextUtilities.INSTANCE.getTextExtents(text, font);
        return currentDimension.width;
    }

    // -------------------------------------------------------------------------

    /**
     * Calculate total hight for time line signal names to be displayed on top of each other.
     * 
     * @param font
     *            the font
     * @param space
     *            the space
     * @return the int
     */
    private int calculateTotalHightForTimeLine(final Font font, final int space) {
        int totalHeight = 0;
        for (Signal signal : signalList) {
            Dimension currentDimension = TextUtilities.INSTANCE.getTextExtents(
                    SIGNALLABELSAFETYMARGINSPACE + signal.getName() + SIGNALLABELSAFETYMARGINSPACE,
                    font);
            totalHeight += currentDimension.height;
        }
        return totalHeight;
    }

    // -------------------------------------------------------------------------

    /**
     * Draw all signal present data.
     * 
     * @param contents
     *            the contents
     */
    private void drawTimeLine(final IFigure contents, final Colors colors, final int zoomLevel) {
        Font fontDefault = new Font(Display.getCurrent(), "Arial", (zoomedYOffset / FACTOR_4),
                SWT.NORMAL);
        fontsForDisposalList.add(fontDefault);
        Font fontMarker = new Font(Display.getCurrent(), "Arial", (zoomedYOffset / FACTOR_4),
                SWT.BOLD);
        fontsForDisposalList.add(fontMarker);

        // update signal name width again
        signalNameSize = getMaximumTextWidth(fontDefault);
        // re-calculate zoomed values
        zoom(zoomLevel);

        // calculate the top position of the time line
        int y = zoomedYOffset + calculateTopPositionForTimeLine(fontDefault, zoomedYSpace);

        long maxTick = signalList.getMaxTick();
        long minTick = Math.max(1, signalList.getMinTick());
        long currentTick = signalList.getCurrentTick();
        RGB timeLineColor = colors.getSignalColor1();
        RGB tickColor = colors.getSignalColor2();

        outerScrolledComposite.setMinSize((int) (maxTick + 1 - minTick) * zoomedXSpaceTimeLine
                + zoomedXOffset, y + zoomedYSpace);

        Node lastNode = null;
        Font font = null;
        RGB color = null;

        for (long tick = minTick; tick <= maxTick; tick++) {

            // if this is the current tick then mark the node in the
            // signalColorMarker color
            if (tick == currentTick) {
                font = fontMarker;
                color = colors.getSignalColorMarker();
            } else {
                font = fontDefault;
                color = colors.getSignalColor2();
            }

            int tickXPos = ((int) (tick - minTick) * zoomedXSpaceTimeLine + zoomedXOffset
                    / FACTOR_2 + (zoomedXSpaceTimeLine / FACTOR_2));
            // Draw all Signals
            for (Signal signal : signalList) {

                // find the appropriate color, default spare color
                RGB signalColor = colors.getSignalSpareColor();
                if (signal.isPresent(tick)) {
                    signalColor = colors.getSignalColor(signal.getName(), tick, color);
                }

                int xSignal = calculateLeftPositionForTimeLine(font, signal, tickXPos);
                int ySignal = calculateTopPositionForTimeLine(font, signal, zoomedYSpace);

                Label labelFigure = new Label();
                String labelText = SIGNALLABELSAFETYMARGINSPACE + signal.getName()
                        + SIGNALLABELSAFETYMARGINSPACE;
                int labelWidth = calculateLabelWidth(font, labelText);
                labelFigure.setText(labelText);
                labelFigure.setVisible(true);
                labelFigure.setFont(font);
                labelFigure.setSize(labelWidth, signalNameSize.height);
                Color labelColor = new Color(Display.getCurrent(), signalColor);
                colorsForDisposalList.add(labelColor);
                labelFigure.setForegroundColor(labelColor);
                labelFigure.setLocation(new Point(xSignal, ySignal));
                contents.add(labelFigure);
            }

            int presentOffset = 0;

            Node nodeS = new Node();
            nodeS.x = ((int) (tick - minTick) * zoomedXSpaceTimeLine + FACTOR_2 + zoomedXOffset
                    / FACTOR_2);
            nodeS.y = y + presentOffset + zoomedYOffset / FACTOR_11;
            nodeS.data = null;
            Node nodeE = new Node();
            nodeE.x = ((int) (tick - minTick) * zoomedXSpaceTimeLine + zoomedXSpaceTimeLine
                    + FACTOR_2 + zoomedXOffset / FACTOR_2);
            nodeE.y = y + presentOffset + zoomedYOffset / FACTOR_11;
            nodeE.data = null;

            Node node = new Node();
            node.x = tickXPos;
            node.y = y + presentOffset;
            node.data = null;

            drawNode(contents, nodeS, timeLineColor, 0, tick, null);
            drawNode(contents, nodeE, timeLineColor, 0, tick, null);

            if (lastNode == null) {
                lastNode = nodeE;
            }
            drawEdge(contents, lastNode, nodeS, timeLineColor, colors);
            drawEdge(contents, nodeS, nodeE, timeLineColor, colors);
            lastNode = nodeE;

            Label labelFigure = new Label();
            String labelText = SIGNALLABELSAFETYMARGINSPACE + tick + SIGNALLABELSAFETYMARGINSPACE;
            int labelWidth = calculateLabelWidth(font, labelText);
            labelFigure.setText(labelText);
            labelFigure.setVisible(true);
            labelFigure.setFont(font);
            labelFigure.setSize(labelWidth, signalNameSize.height);
            Color labelColor = new Color(Display.getCurrent(), tickColor);
            colorsForDisposalList.add(labelColor);
            labelFigure.setForegroundColor(labelColor);
            labelFigure.setLocation(new Point(tickXPos - (labelWidth / 2), zoomedYSpace / 2 + y));
            contents.add(labelFigure);

            // if this is the current tick then mark the node in the
            // signalColorMarker color
            if (tick != currentTick) {
                drawNode(contents, node, timeLineColor, zoomedYOffset / FACTOR_8, tick, null);
            } else {
                node.y = node.y - zoomedYOffset / FACTOR_14;
                node.x = node.x - zoomedYOffset / FACTOR_20;
                drawNode(contents, node, colors.getSignalColorMarker(), zoomedYOffset / FACTOR_5,
                        tick, null);
                Color labelColor2 = new Color(Display.getCurrent(), colors.getSignalColorMarker());
                colorsForDisposalList.add(labelColor2);
                labelFigure.setForegroundColor(labelColor2);
            }

        }

    }

    // -------------------------------------------------------------------------

    /**
     * Draw all signal present data.
     * 
     * @param contents
     *            the contents
     */
    private void drawSignals(final IFigure contents, final Colors colors) {
        int y = zoomedYOffset;
        long maxTick = signalList.getMaxTick();
        long minTick = Math.max(1, signalList.getMinTick());
        long currentTick = signalList.getCurrentTick();
        RGB signalColor = colors.getSignalColor1();

        outerScrolledComposite.setMinSize((int) (maxTick + 1 - minTick) * zoomedXSpace + 2
                * signalNameSize.width, outerScrolledComposite.getMinHeight());

        for (Signal signal : signalList) {
            Node lastNode = null;

            // set a specific color if a color is set for this signal
            if (colors.getSignalColor().containsKey(signal.getName())) {
                signalColor = colors.getSignalColor().get(signal.getName());
            }

            for (long tick = minTick; tick <= maxTick; tick++) {
                int presentOffset = 0;
                int presentOffsetInverse = -(zoomedYOffset / FACTOR_2);
                if (signal.isPresent(tick)) {
                    presentOffset = -(zoomedYOffset / FACTOR_2);
                    presentOffsetInverse = 0;
                }
                Node nodeS = new Node();
                nodeS.x = ((int) (tick - minTick) * zoomedXSpace + FACTOR_2 + signalNameSize.width);
                nodeS.y = y + presentOffset + zoomedYOffset / FACTOR_11;
                nodeS.data = signal;
                Node nodeE = new Node();
                nodeE.x = ((int) (tick - minTick) * zoomedXSpace + zoomedXSpace 
                        + FACTOR_2 + signalNameSize.width);
                nodeE.y = y + presentOffset + zoomedYOffset / FACTOR_11;
                nodeE.data = signal;

                Node node = new Node();
                Node nodeInverse = new Node();
                node.x = ((int) (tick - minTick) * zoomedXSpace 
                        + (zoomedXSpace / FACTOR_2) + signalNameSize.width);
                node.y = y + presentOffset;
                node.data = signal;
                nodeInverse.x = ((int) (tick - minTick) * zoomedXSpace 
                        + (zoomedXSpace / FACTOR_2) + signalNameSize.width);
                nodeInverse.y = y + presentOffsetInverse;
                nodeInverse.data = signal;

                drawNode(contents, nodeS, signalColor, 0, tick, null);
                drawNode(contents, nodeE, signalColor, 0, tick, null);

                if (lastNode == null) {
                    lastNode = nodeE;
                }
                // get possibly adapted signal color
                RGB drawColor = colors.getSignalColor(signal.getName(), tick, signalColor);

                drawEdge(contents, lastNode, nodeS, drawColor, colors);
                drawEdge(contents, nodeS, nodeE, drawColor, colors);
                lastNode = nodeE;

                // if this is the current tick then mark the node in the
                // signalColorMarker color
                if (tick != currentTick) {
                    drawNode(contents, node, drawColor, zoomedYOffset / FACTOR_8, tick,
                            signal.getName());
                } else {
                    node.y = node.y - zoomedYOffset / FACTOR_14;
                    node.x = node.x - zoomedYOffset / FACTOR_20;
                    drawNode(contents, node, colors.getSignalColorMarker(), zoomedYOffset
                            / FACTOR_5, tick, signal.getName());
                }

                drawNode(contents, nodeInverse, colors.getSignalSpareColor(), zoomedYOffset
                        / FACTOR_8, tick, signal.getName());

            }

            // toggle color
            if (signalColor == colors.getSignalColor1()) {
                signalColor = colors.getSignalColor2();
            } else {
                signalColor = colors.getSignalColor1();
            }

            y += zoomedYSpace;
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Draw a node include a tooltip text if the signalName is not null.
     * 
     * @param contents
     *            the contents
     * @param node
     *            the node
     * @param signalColor
     *            the signal color
     * @param size
     *            the size
     * @param tick
     *            the tick
     * @param signalName
     *            the signal name
     */
    private void drawNode(final IFigure contents, final Node node, final RGB signalColor,
            final int size, final long tick, final String signalName) {
        RectangleFigure dotFigure = new RectangleFigure();
        node.data = dotFigure;
        int xPos = node.x;
        int yPos = node.y;
        dotFigure.setVisible(true);
        dotFigure.setSize(size, size);
        Color bgColor = new Color(Display.getCurrent(), signalColor);
        colorsForDisposalList.add(bgColor);
        Color fgColor = new Color(Display.getCurrent(), signalColor);
        colorsForDisposalList.add(fgColor);
        dotFigure.setBackgroundColor(bgColor);
        dotFigure.setForegroundColor(fgColor);
        dotFigure.setLocation(new Point(xPos, yPos));
        contents.add(dotFigure);

        if (signalName != null) {
            Label toolTipLabel = new Label();
            toolTipLabel.setText(" " + tick + " / " + signalName + " ");
            dotFigure.setToolTip(toolTipLabel);
        }

        contents.setConstraint(dotFigure, new Rectangle(xPos, yPos, -1, -1));
    }

    // -------------------------------------------------------------------------

    /**
     * Draw an edge between two nodes.
     * 
     * @param contents
     *            the contents
     * @param node1
     *            the node1
     * @param node2
     *            the node2
     * @param signalColor
     *            the signal color
     * @param colors
     *            the colors
     */
    private void drawEdge(final IFigure contents, final Node node1, final Node node2,
            final RGB signalColor, final Colors colors) {
        PolylineConnection wireFigure = new PolylineConnection();
        wireFigure.setVisible(true);

        // if error signal then draw a thick line
        if (signalColor == colors.getSignalColorError()) {
            wireFigure.setLineWidth(2);
        }
        Color color = new Color(Display.getCurrent(), signalColor);
        this.colorsForDisposalList.add(color);
        wireFigure.setForegroundColor(color);
        // edge.source is the Node to the left of this edge
        EllipseAnchor sourceAnchor = new EllipseAnchor((RectangleFigure) node1.data);

        // edge.target is the Node to the right of this edge
        EllipseAnchor targetAnchor = new EllipseAnchor((RectangleFigure) node2.data);
        wireFigure.setSourceAnchor(sourceAnchor);
        wireFigure.setTargetAnchor(targetAnchor);
        contents.add(wireFigure);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximum text width of all signal names including safety margin space.
     * 
     * @param font
     *            the font
     * @return the maximum text width
     */
    private Dimension getMaximumTextWidth(final Font font) {
        int maxWidth = 0;
        Dimension maxDimension = signalNameSize;
        for (Signal signal : signalList) {
            Dimension currentDimension = TextUtilities.INSTANCE.getTextExtents(
                    SIGNALLABELSAFETYMARGINSPACE + signal.getName() + SIGNALLABELSAFETYMARGINSPACE,
                    font);
            int currentWidth = currentDimension.width;
            if (currentWidth > maxWidth) {
                maxWidth = currentWidth;
                maxDimension = currentDimension;
            }
        }
        return maxDimension;
    }

    // -------------------------------------------------------------------------

    /**
     * Draw the signal names. Ensure safety margin space left and right.
     * 
     * @param contents
     *            the contents
     * @param xPos
     *            the xPos
     * @param align
     *            the align
     * @param colors
     *            the colors
     */
    private void drawSignalNames(final IFigure contents, final int xPos, final int align,
            final Colors colors) {

        outerScrolledComposite.setMinSize(outerScrolledComposite.getMinWidth(), signalList.size()
                * zoomedYSpace + (zoomedYOffset / FACTOR_2));
        Font font = new Font(Display.getCurrent(), "Arial", (zoomedYOffset / FACTOR_4), SWT.NORMAL);
        fontsForDisposalList.add(font);

        // update signal name width again
        signalNameSize = getMaximumTextWidth(font);

        int y = zoomedYOffset / 2;
        RGB signalColor = colors.getSignalColor1();
        for (Signal signal : signalList) {
            // set a specific color if a color is set for this signal
            if (colors.getSignalColor().containsKey(signal.getName())) {
                signalColor = colors.getSignalColor().get(signal.getName());
            }

            Label labelFigure = new Label();
            labelFigure.setText(SIGNALLABELSAFETYMARGINSPACE + signal.getName()
                    + SIGNALLABELSAFETYMARGINSPACE);
            labelFigure.setVisible(true);
            labelFigure.setFont(font);
            labelFigure.setLabelAlignment(align);
            labelFigure.setSize(signalNameSize.width, signalNameSize.height);
            Color color = new Color(Display.getCurrent(), signalColor);
            this.colorsForDisposalList.add(color);
            labelFigure.setForegroundColor(color);
            labelFigure.setLocation(new Point(xPos - 0, y));
            contents.add(labelFigure);
            y += zoomedYSpace;
            // toggle color (iff default colors, otherwise starte with color1)
            if (signalColor != colors.getSignalColor1()) {
                signalColor = colors.getSignalColor1();
            } else {
                signalColor = colors.getSignalColor2();
            }
        }
    }

    // -------------------------------------------------------------------------

}
