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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kvid.data.KViDDataObject;
import de.cau.cs.kieler.kvid.datadistributor.KViDDataDistributor;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * 
 * Drawer class implementation for GMF.
 * 
 * @author jjc
 *
 */
public class GMFDrawer implements IDrawer {
    
    private HashMap<String, IKViDFigure> figuresByURI = new HashMap<String, IKViDFigure>();
 
    public void draw(final HashMap<String, KViDDataObject> dataSet) {
        //clearing phase
        //clearDrawing();
        
        //update data phase
        int figureCounter = 1; 
        String path = "/home/jjc/workspace/kieler/de.cau.cs.kieler.kvid/images/drawing.svg";
        RenderedImage image = RenderedImageFactory.getInstance(path);
        figuresByURI.put(".model.test", new GMFGraphicsFigure(new KViDDataObject(".model.test", "blub"), image));
        for (String key : dataSet.keySet()) {
            
            if (figuresByURI.containsKey(key)) {
                figuresByURI.get(key).updateData(dataSet.get(key));
                figuresByURI.get(key).setLocation(new Point(300, figureCounter*50));
            } else {
                figuresByURI.put(key, new KViDGMFFigure(dataSet.get(key)));
                figuresByURI.get(key).setLocation(new Point(300, figureCounter*50));
            }
            figureCounter++;
        }
        
        final IEditorPart editor = KViDDataDistributor.getInstance().getActiveEditor();
        if (editor instanceof DiagramEditor) {
            //drawing phase
            final IFigure canvas = ((DiagramEditor) editor).getDiagramEditPart()
                                    .getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
            for (final String key : figuresByURI.keySet()) {
                PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                    public void run() {
                        canvas.add(figuresByURI.get(key));
                    }
                });
                canvas.repaint();
            }
            
            //animating phase
            final HashMap<IKViDFigure, List<Point>> animatables = 
                                                      new HashMap<IKViDFigure, List<Point>>();
            for (final String key : dataSet.keySet()) {
                if (dataSet.get(key).getPath() != null) {
                    animatables.put(figuresByURI.get(key), dataSet.get(key).getPath());
                }
            }
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    //TODO still not satisfying, maybe check if data is by KIEM and use it then
                    GMFAnimator.animate(animatables, ((DiagramEditor) editor).getDiagramEditPart(),
                                        KiemPlugin.getDefault().getAimedStepDuration());
                }
            }); 
        }        
    }

    public void clearDrawing() {
        IEditorPart editor = KViDDataDistributor.getInstance().getActiveEditor();
        if (editor instanceof DiagramEditor) {
            final IFigure canvas = ((DiagramEditor) editor).getDiagramEditPart()
                                    .getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
            for (String key : figuresByURI.keySet()) {
                IKViDFigure figure = figuresByURI.get(key);
                figure.invalidate();
            }
            canvas.revalidate();
            canvas.repaint();
        }
        figuresByURI = new HashMap<String, IKViDFigure>();
    }

}
