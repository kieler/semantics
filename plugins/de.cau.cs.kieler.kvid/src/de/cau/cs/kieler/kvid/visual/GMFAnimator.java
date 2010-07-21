package de.cau.cs.kieler.kvid.visual;

import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.geometry.Point;

public class GMFAnimator {
    
    public static void animate(HashMap<KViDGMFFigure, List<Point>> figuresAndPath, IFigure canvas){
        Animation.markBegin();
        for (KViDGMFFigure figure : figuresAndPath.keySet()) {
            /*ArrangeRequest request = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
            CompoundCommand cc = new CompoundCommand();
            cc.add(part.getCommand(request));
            part.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
            part.getContentPane().revalidate();
            part.getContentPane().repaint();*/
            figure.setLocation(figuresAndPath.get(figure).get(0));
            LayoutAnimator.getDefault().init(figure);
            figure.setLocation(figuresAndPath.get(figure).get(1));
            LayoutAnimator.getDefault().capture(figure);
            canvas.revalidate();
            canvas.repaint();
        }
        Animation.run(1000);
    }
    
}
