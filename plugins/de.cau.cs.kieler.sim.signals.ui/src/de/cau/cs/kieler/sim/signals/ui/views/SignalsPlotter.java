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

package de.cau.cs.kieler.sim.signals.ui.views;

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

/**
 * The class SignalsPlotter implements the basic plotter for the synchronous
 * signals. It can be zoomed using a zoom level (in percent).
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class SignalsPlotter {

	final int XSPACE = 25;
	final int YOFFSET = 40;
	final int YSPACE = 40;
	final int XOFFSET = 60;

	int zoomedXSpace = 25;
	int zoomedYOffset = 40;
	int zoomedYSpace = 40;
	int zoomedXOffset = 60;

	SignalList signalList = null;
	Composite parent = null;
	Panel signalContents = null;
	ScrolledComposite outerScrolledComposite = null;
	FigureCanvas outerCanvas = null;

	RGB backgroundColor = new RGB(0, 0, 0); // black
	RGB backgroundColor2 = new RGB(10, 10, 50); // black
	RGB signalColor1 = new RGB(100, 100, 255); // light blue
	RGB signalColor2 = new RGB(200, 200, 255); // lighter blue
	RGB signalColor0 = new RGB(0, 0, 50); // dark blue
	RGB signalColorMarker = new RGB(255, 0, 0); // red

	Dimension signalNameSize = new Dimension(100, 40);

	public SignalsPlotter(Composite parent) {
		setParent(parent);
	}

	public void setSignalList(SignalList signalList) {
		this.signalList = signalList;
	}

	public void setParent(Composite parent) {
		this.parent = parent;
	}

	public void setFocus() {
		// contents.setFocusTraversable(true);
	}

	private void zoom(int zoomLevel) {
		zoomedXSpace = (XSPACE * zoomLevel) / 100;
		zoomedYOffset = (YOFFSET * zoomLevel) / 100;
		zoomedYSpace = (YSPACE * zoomLevel) / 100;
		zoomedXOffset = (XOFFSET * 1) / 100;
	}

	// public void plot(){
	// //if no place to plot, or no data to plot, return.
	// if(parent == null || signalList == null)
	// return;
	//
	// if (signalContents == null) {
	//
	// signalContents = new Panel();
	// signalContents.setLayoutManager(new XYLayout());
	// signalContents.setBackgroundColor(new Color(Display.getCurrent(),
	// backgroundColor));
	//
	// presentContents = new Panel();
	// presentContents.setLayoutManager(new XYLayout());
	// presentContents.setBackgroundColor(new Color(Display.getCurrent(),
	// backgroundColor2));
	//
	//
	// outerScrolledComposite = new ScrolledComposite(parent, SWT.BORDER |
	// SWT.H_SCROLL | SWT.V_SCROLL);
	// outerScrolledComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
	// outerScrolledComposite.setMinSize(0, 0);
	// outerScrolledComposite.setExpandHorizontal(true);
	// outerScrolledComposite.setExpandVertical(true);
	//
	// Composite outerComposite = new Composite(outerScrolledComposite,
	// SWT.NONE);
	// // Layout layout = new RowLayout(SWT.HORIZONTAL); //new
	// FillLayout(SWT.HORIZONTAL);//new GridLayout(2, true);
	//
	// Layout layout = new FillLayout(SWT.HORIZONTAL);
	// outerComposite.setLayout(layout);
	// outerScrolledComposite.setContent(outerComposite);
	//
	// Composite outerComposite1 = new Composite(outerComposite, SWT.NONE);
	// outerComposite1.setLayout(new FillLayout(SWT.HORIZONTAL));
	// // outerComposite1.setSize(200, 200);
	// outerComposite1.setSize(200, outerComposite1.getSize().y);
	// Composite outerComposite2 = new Composite(outerComposite, SWT.NONE);
	// outerComposite2.setLayout(new FillLayout(SWT.HORIZONTAL));
	// // outerComposite2.setSize(200, 200);
	//
	// innerScrolledComposite = new ScrolledComposite(outerComposite2, SWT.NONE
	// | SWT.H_SCROLL );
	// innerScrolledComposite.setLayout(new FillLayout());
	// innerScrolledComposite.setMinSize(0, 0);
	// innerScrolledComposite.setExpandHorizontal(true);
	// innerScrolledComposite.setExpandVertical(true);
	//
	//
	// Composite innerComposite = new Composite(innerScrolledComposite,
	// SWT.NONE);
	// innerComposite.setLayout(new FillLayout());
	// innerScrolledComposite.setContent(innerComposite);
	//
	// //innerComposite.setLocation(40, 250);
	//
	//
	// FigureCanvas innerCanvas = new FigureCanvas(innerComposite);
	// innerCanvas.setContents(presentContents);
	//
	// FigureCanvas outerCanvas = new FigureCanvas(outerComposite1);
	// outerCanvas.setContents(signalContents);
	// }
	//
	// signalContents.removeAll();
	// presentContents.removeAll();
	// drawSignalNames(signalContents);
	// drawSignals(presentContents);
	//
	// }

	public void plot(int zoomLevel) {
		zoom(zoomLevel);

		// if no place to plot, or no data to plot, return.
		if (parent == null || signalList == null)
			return;

		if (signalContents == null) {

			signalContents = new Panel();
			signalContents.setLayoutManager(new XYLayout());
			signalContents.setBackgroundColor(new Color(Display.getCurrent(),
					backgroundColor));

			outerScrolledComposite = new ScrolledComposite(parent, SWT.BORDER
					| SWT.H_SCROLL | SWT.V_SCROLL);
			outerScrolledComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
			outerScrolledComposite.getHorizontalBar().setIncrement(20);
			outerScrolledComposite.getHorizontalBar().setPageIncrement(200);
			outerScrolledComposite.getVerticalBar().setIncrement(20);
			outerScrolledComposite.getVerticalBar().setPageIncrement(200);
			outerScrolledComposite.setMinSize(0, 0);
			outerScrolledComposite.setExpandHorizontal(true);
			outerScrolledComposite.setExpandVertical(true);

			Composite outerComposite = new Composite(outerScrolledComposite,
					SWT.NONE);

			Layout layout = new FillLayout(SWT.HORIZONTAL);
			outerComposite.setLayout(layout);
			outerScrolledComposite.setContent(outerComposite);

			Composite outerComposite1 = new Composite(outerComposite, SWT.NONE);
			outerComposite1.setLayout(new FillLayout(SWT.HORIZONTAL));
			outerComposite1.setSize(200, outerComposite1.getSize().y);

			outerCanvas = new FigureCanvas(outerComposite1);
			outerCanvas.setContents(signalContents);
		}

		Panel buffer = new Panel();
		buffer.setLayoutManager(new XYLayout());
		buffer.setBackgroundColor(new Color(Display.getCurrent(),
				backgroundColor));

		// signalContents.removeAll();
		drawSignals(buffer);
		drawSignalNames(buffer, 0, Label.RIGHT);
		drawSignalNames(buffer, outerScrolledComposite.getMinWidth()
				- signalNameSize.width, Label.LEFT);
		outerCanvas.setContents(buffer);

		// scroll to the center of selected tick
		long currentTick = signalList.getCurrentTick();
		long minTick = signalList.getMinTick();
		int visibleWidth = outerScrolledComposite.getParent().getSize().y;
		int xScroll = ((int) (currentTick - minTick + 1) * zoomedXSpace
				- (visibleWidth / 1) + 2 + signalNameSize.width);
		int yScroll = outerScrolledComposite.getOrigin().y;
		outerScrolledComposite.setOrigin(xScroll, yScroll);

	}

	private void drawSignals(IFigure contents) {
		int y = zoomedYOffset;
		long maxTick = signalList.getMaxTick();
		long minTick = signalList.getMinTick();
		long currentTick = signalList.getCurrentTick();
		RGB signalColor = signalColor1;

		outerScrolledComposite.setMinSize((int) (maxTick - minTick)
				* zoomedXSpace + 2 * signalNameSize.width,
				outerScrolledComposite.getMinHeight());

		for (Signal signal : signalList) {
			Node lastNode = null;

			for (long tick = minTick; tick < maxTick; tick++) {
				int presentOffset = 0;
				int presentOffsetInverse = -(zoomedYOffset / 2);
				if (signal.isPresent(tick)) {
					presentOffset = -(zoomedYOffset / 2);
					presentOffsetInverse = 0;
				}
				Node nodeS = new Node();
				nodeS.x = ((int) (tick - minTick) * zoomedXSpace + 2 + signalNameSize.width);
				nodeS.y = y + presentOffset + zoomedYOffset / 11;
				nodeS.data = signal;
				Node nodeE = new Node();
				nodeE.x = ((int) (tick - minTick) * zoomedXSpace + zoomedXSpace
						+ 2 + signalNameSize.width);
				nodeE.y = y + presentOffset + zoomedYOffset / 11;
				nodeE.data = signal;

				Node node = new Node();
				Node nodeInverse = new Node();
				node.x = ((int) (tick - minTick) * zoomedXSpace
						+ (zoomedXSpace / 2) + signalNameSize.width);
				node.y = y + presentOffset;
				node.data = signal;
				nodeInverse.x = ((int) (tick - minTick) * zoomedXSpace
						+ (zoomedXSpace / 2) + signalNameSize.width);
				nodeInverse.y = y + presentOffsetInverse;
				nodeInverse.data = signal;

				drawNode(contents, nodeS, signalColor, 0, tick, null);
				drawNode(contents, nodeE, signalColor, 0, tick, null);

				if (lastNode == null) {
					lastNode = nodeE;
				}
				drawEdge(contents, lastNode, nodeS, signalColor);
				drawEdge(contents, nodeS, nodeE, signalColor);
				lastNode = nodeE;

				if (tick != currentTick) {
					drawNode(contents, node, signalColor, zoomedYOffset / 8,
							tick, signal.getName());
				} else {
					node.y = node.y - zoomedYOffset / 14;
					node.x = node.x - zoomedYOffset / 20;
					drawNode(contents, node, signalColorMarker,
							zoomedYOffset / 5, tick, signal.getName());
				}

				drawNode(contents, nodeInverse, signalColor0,
						zoomedYOffset / 8, tick, signal.getName());

			}

			// toggle color
			if (signalColor == signalColor1) {
				signalColor = signalColor2;
			} else {
				signalColor = signalColor1;
			}

			y += zoomedYSpace;
		}

	}

	/**
	 * Gets the maximum text widt.
	 * 
	 * @param font
	 *            the font
	 * @return the maximum text widt
	 */
	private Dimension getMaximumTextWidth(Font font) {
		int maxWidth = 0;
		Dimension maxDimension = signalNameSize;
		for (Signal signal : signalList) {
			Dimension currentDimension = TextUtilities.INSTANCE.getTextExtents(
					"    " + signal.getName() + "    ", font);
			int currentWidth = currentDimension.width;
			if (currentWidth > maxWidth) {
				maxWidth = currentWidth;
				maxDimension = currentDimension;
			}
		}
		return maxDimension;
	}

	/**
	 * Draw signal names.
	 * 
	 * @param contents
	 *            the contents
	 * @param x
	 *            the x
	 */
	private void drawSignalNames(IFigure contents, int x, int align) {

		outerScrolledComposite.setMinSize(outerScrolledComposite.getMinWidth(),
				signalList.size() * zoomedYSpace + (zoomedYOffset / 2));
		Font font = new Font(Display.getCurrent(), "Arial",
				(zoomedYOffset / 4), SWT.NORMAL);

		// update signal name width again
		signalNameSize = getMaximumTextWidth(font);

		int y = zoomedYOffset / 2;
		RGB signalColor = signalColor1;
		for (Signal signal : signalList) {
			Label labelFigure = new Label();
			labelFigure.setText("    " + signal.getName() + "    ");
			labelFigure.setVisible(true);
			labelFigure.setFont(font);
			labelFigure.setLabelAlignment(align);
			labelFigure.setSize(signalNameSize.width, signalNameSize.height);
			labelFigure.setForegroundColor(new Color(Display.getCurrent(),
					signalColor));
			labelFigure.setLocation(new Point(x - zoomedXOffset, y));
			contents.add(labelFigure);
			y += zoomedYSpace;
			// toggle color
			if (signalColor == signalColor1) {
				signalColor = signalColor2;
			} else {
				signalColor = signalColor1;
			}
		}
	}

	private void drawNode(IFigure contents, Node node, RGB signalColor,
			int size, long tick, String signalName) {
		RectangleFigure dotFigure = new RectangleFigure();
		node.data = dotFigure;
		int xPos = node.x;
		int yPos = node.y;
		dotFigure.setVisible(true);
		dotFigure.setSize(size, size);
		dotFigure.setBackgroundColor(new Color(Display.getCurrent(),
				signalColor));
		dotFigure.setForegroundColor(new Color(Display.getCurrent(),
				signalColor));
		dotFigure.setLocation(new Point(xPos, yPos));
		contents.add(dotFigure);

		if (signalName != null) {
			Label toolTipLabel = new Label();
			toolTipLabel.setText(" " + tick + " / " + signalName + " ");
			dotFigure.setToolTip(toolTipLabel);
		}

		contents.setConstraint(dotFigure, new Rectangle(xPos, yPos, -1, -1));
	}

	private void drawEdge(IFigure contents, Node node1, Node node2,
			RGB signalColor) {
		PolylineConnection wireFigure = new PolylineConnection();
		wireFigure.setVisible(true);
		wireFigure.setForegroundColor(new Color(Display.getCurrent(),
				signalColor));
		// edge.source is the Node to the left of this edge
		EllipseAnchor sourceAnchor = new EllipseAnchor(
				(RectangleFigure) node1.data);

		// edge.target is the Node to the right of this edge
		EllipseAnchor targetAnchor = new EllipseAnchor(
				(RectangleFigure) node2.data);
		wireFigure.setSourceAnchor(sourceAnchor);
		wireFigure.setTargetAnchor(targetAnchor);
		contents.add(wireFigure);
	}

}
