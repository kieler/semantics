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
package de.cau.cs.kieler.kvid.visual;

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.data.KvidUri;
import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.datadistributor.IDataListener;
import de.cau.cs.kieler.kvid.datadistributor.Property;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * 
 * Drawer class implementation for GMF.
 * 
 * @author jjc
 * 
 */
public final class GmfDrawer implements IDrawer, IDataListener {

    /** A map associating drawn figures with their data producing model elements. */
    private HashMap<KvidUri, IKvidFigure> figuresByURI = new HashMap<KvidUri, IKvidFigure>();
    
    /** The instance of the distributor. See Singleton Design Pattern. */
    private static final GmfDrawer INSTANCE = new GmfDrawer();
    
    /**
     * Private constructor to prevent external instatiation.
     */
    private GmfDrawer() { }
    
    /**
     * Gives the single instance of the GmfDrawer.
     * 
     * @return The single instance of the GmfDrawer
     */
    public static GmfDrawer getInstance() {
        return INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    public void draw(final HashMap<KvidUri, DataObject> dataSet) {
        // clearing phase
        // clearDrawing();

        // update data phase
        for (KvidUri key : dataSet.keySet()) {

            if (figuresByURI.containsKey(key)) {
                figuresByURI.get(key).updateData(dataSet.get(key));
            } else {
                figuresByURI.put(key, new GmfFigure(dataSet.get(key)));
            }
            if (RuntimeConfiguration.getInstance()
                    .currentValueOfProperty("Animation enabled").equals("true")) {
                if (dataSet.get(key).getPaths() != null) {
                    for (List<Point> path : dataSet.get(key).getPaths()) {
                        figuresByURI.get(key).setLocation(
                                centerFigureOnPoint(path.get(0),
                                        figuresByURI.get(key)));
                    }
                } else {
                    throw new RuntimeException("Could not find any path information");
                }
            } else {
                // TODO
            }
        }

        final IEditorPart editor = KvidUtil.getActiveEditor();
        if (editor instanceof DiagramEditor) {
            // drawing phase
            
            final IFigure canvas = ((DiagramEditor) editor)
                    .getDiagramEditPart().getLayer(
                            DiagramRootEditPart.CONNECTION_LAYER);
            for (final KvidUri key : figuresByURI.keySet()) {
                PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                    public void run() {
                        try {
                            figuresByURI.get(key).setVisible(false);
                            canvas.add(figuresByURI.get(key));
                        } catch (NullPointerException nex) {
                            //do nothing, only happens when visualization is too fast
                            //figures are gone then before this could work with them
                        }
                    }
                });
                canvas.repaint();
            }

            // animating phase
            if (RuntimeConfiguration.getInstance()
                    .currentValueOfProperty("Animation enabled").equals("true")) {
                final HashMap<IKvidFigure, List<Point>> animatables = 
                                new HashMap<IKvidFigure, List<Point>>();
                for (final KvidUri key : dataSet.keySet()) {
                    IKvidFigure currentFigure = figuresByURI.get(key);
                    if (dataSet.get(key).getPaths() != null && dataSet.get(key).getPaths().size() > 0) {
                        for (Property property : RuntimeConfiguration
                                .getInstance().getKnownProperties()) {
                            if (property.getName()
                                    .startsWith("Display status ")) {
                                String uriPart = property.getName().replace(
                                        "Display status ", "");
                                if (uriPart.equals(key.getElementUri())) {
                                    if (property.getCurrentValue().equals(
                                            "Animating")) {
                                        animatables.put(currentFigure,
                                                dataSet.get(key).getPaths()
                                                        .get(0));
                                        currentFigure.setVisible(true);
                                    } else if (property.getCurrentValue()
                                            .equals("Static on Source Node")) {
                                        Point newPoint = centerFigureOnPoint(dataSet.get(key).getPaths()
                                                .get(0).get(0), currentFigure);
                                        currentFigure.setLocation(newPoint);
                                        currentFigure.setVisible(true);
                                    } else if (property.getCurrentValue()
                                            .equals("Static on middlemost Bend Point")) {
                                        int middle = dataSet.get(key).getPaths()
                                                .get(0).size() / 2;
                                        Point newPoint = centerFigureOnPoint(dataSet.get(key).getPaths()
                                                .get(0).get(middle), currentFigure);
                                        currentFigure.setLocation(newPoint);
                                        currentFigure.setVisible(true);
                                    } else if (property.getCurrentValue()
                                            .equals("Static on Target Node")) {
                                        int last = dataSet.get(key).getPaths()
                                                .get(0).size();
                                        last--;
                                        Point newPoint = centerFigureOnPoint(dataSet.get(key).getPaths()
                                                .get(0).get(last), currentFigure);
                                        currentFigure.setLocation(newPoint);
                                        currentFigure.setVisible(true);
                                    } else if (property.getCurrentValue()
                                            .equals("Invisible")) {
                                        currentFigure.setVisible(false);
                                    }
                                }
                            }
                        }
                    }
                }
                PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        // TODO still not satisfying, maybe check if data is by
                        // KIEM and use it then
                        try {
                            GmfAnimator.animate(animatables,
                                    ((DiagramEditor) editor).getDiagramEditPart(),
                                    KiemPlugin.getDefault().getAimedStepDuration());
                        } catch (NullPointerException nex) {
                            //do nothing, only happens when visualization is too fast
                            //figures are gone then before this could work with them
                        }
                    }
                });
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void clearDrawing() {
        //FIXME doesnt do what it is supposed to!
        IEditorPart editor = KvidUtil.getActiveEditor();
        if (editor instanceof DiagramEditor) {
            for (KvidUri key : figuresByURI.keySet()) {
                IKvidFigure figure = figuresByURI.get(key);
                IFigure parent = figure.getParent();
                parent.remove(figure);
                parent.repaint();
            }
        }
        figuresByURI = new HashMap<KvidUri, IKvidFigure>();
    }
    
    /**
     * Use this to center a figure on a certain {@link Point}.
     * Otherwise, the figure will be placed with it's upper left corner on the Point.
     * 
     * @param thepoint The {@link Point} to center on
     * @param thefigure The {@link IFigure} to center
     * @return A {@link Point} where to put the {@link IFigure} so that 
     *          the figure is centered on the given point
     */
    public Point centerFigureOnPoint(final Point thepoint, final IFigure thefigure) {
        Point result = new Point(thepoint);
        result.x -= thefigure.getBounds().width / 2;
        result.y -= thefigure.getBounds().height / 2;
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public void triggerDataChanged() {
        try {
            draw(DataDistributor.getInstance().getData());
        } catch (NullPointerException nex) {
            //do nothing, only happens when visualization is too fast
            //figures are gone then before this could work with them
        }
    }

    /**
     * {@inheritDoc}
     */
    public void triggerWrapup() {
        clearDrawing();
        GmfAnimator.stopReplay();
    }

}
