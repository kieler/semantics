package de.cau.cs.kieler.kvid.visual;

import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kvid.data.KViDDataObject;
import de.cau.cs.kieler.kvid.datadistributor.KViDDataDistributor;

public class GMFDrawer implements IDrawer {
    
    private HashMap<String, KViDGMFFigure> figuresByURI = new HashMap<String, KViDGMFFigure>();
 
    public void draw(HashMap<String, KViDDataObject> dataSet) {
        //clearing phase
        //clearDrawing();
        
        //update data phase
        int figureCounter = 1; 
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
            final IFigure canvas = ((DiagramEditor) editor).getDiagramEditPart().getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
            for (final String key : figuresByURI.keySet()) {
                PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                    public void run() {
                        canvas.add(figuresByURI.get(key));
                    }
                });
                canvas.repaint();
            }
            
            //animating phase
            final HashMap<KViDGMFFigure, List<Point>> animatables = new HashMap<KViDGMFFigure, List<Point>>();
            for (final String key : dataSet.keySet()) {
                if (dataSet.get(key).getPath() != null) {
                    animatables.put(figuresByURI.get(key), dataSet.get(key).getPath());
                }
            }
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    GMFAnimator.animate(animatables, ((DiagramEditor) editor).getDiagramEditPart());
                }
            }); 
        }        
    }

    public void clearDrawing() {
        IEditorPart editor = KViDDataDistributor.getInstance().getActiveEditor();
        if (editor instanceof DiagramEditor) {
            final IFigure canvas = ((DiagramEditor) editor).getDiagramEditPart().getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
            for (String key : figuresByURI.keySet()) {
                KViDGMFFigure figure = figuresByURI.get(key);
                figure.invalidate();
            }
            canvas.revalidate();
            canvas.repaint();
        }
    }

}
