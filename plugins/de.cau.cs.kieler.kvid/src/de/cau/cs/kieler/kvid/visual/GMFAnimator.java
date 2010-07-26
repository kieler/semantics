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

        AnimatingCommand anima = new AnimatingCommand();
        CompoundCommand cc = new CompoundCommand();
        boolean allPathsExeeded = false;
        int pathCounter = 0;
        
        while(!allPathsExeeded) {
            allPathsExeeded = true;
            for (KViDGMFFigure figure : figuresAndPath.keySet()) {
                if (pathCounter == 0) {
                    anima.initializeAnimatedElement(figure, diagram.getViewer());
                }
                if (pathCounter < figuresAndPath.get(figure).size()) {      
                    anima.specifyStep(figure, figuresAndPath.get(figure).get(pathCounter));
                    if ((pathCounter + 1) < figuresAndPath.get(figure).size()) {
                        allPathsExeeded = false;
                    }
                }
            }
            if (!allPathsExeeded) {
                anima.nextStep();
            }
            pathCounter++;
        }
        
        cc.add(anima);
        diagram.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
    }
    
}
