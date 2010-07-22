package de.cau.cs.kieler.kvid.visual;

import java.util.HashMap;
import java.util.List;

import muvitorkit.animation.AnimatingCommand;

import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

import de.cau.cs.kieler.kvid.datadistributor.KViDDataDistributor;

public class GMFAnimator {
    
    public static void animate(HashMap<KViDGMFFigure, List<Point>> figuresAndPath, DiagramEditPart diagram){
        //Animation.markBegin();
        for (KViDGMFFigure figure : figuresAndPath.keySet()) {
            /*ArrangeRequest request = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
            CompoundCommand cc = new CompoundCommand();
            cc.add(part.getCommand(request));
            part.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
            part.getContentPane().revalidate();
            part.getContentPane().repaint();
            figure.setLocation(figuresAndPath.get(figure).get(0));
            LayoutAnimator.getDefault().init(figure);
            figure.setLocation(figuresAndPath.get(figure).get(1));
            LayoutAnimator.getDefault().capture(figure);
            */
        	AnimatingCommand anima = new AnimatingCommand();
        	anima.initializeAnimatedElement(figure, diagram.getViewer());
        	anima.specifyStep(figure, figuresAndPath.get(figure).get(0));
        	anima.nextStep();
        	anima.specifyStep(figure, new Point(100, 300));
        	anima.nextStep();
        	anima.specifyStep(figure, new Point(300, 300));
        	CompoundCommand cc = new CompoundCommand();
        	cc.add(anima);
        	diagram.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
        }
        //Animation.run(1000);
    }
    
}
