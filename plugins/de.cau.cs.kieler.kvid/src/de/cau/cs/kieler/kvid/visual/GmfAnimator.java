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

import de.tu_berlin.cs.tfs.muvitorkit.animation.AnimatingCommand;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;

/**
 * 
 * Class handling the animation of data figures in GMF.
 * 
 * @author jjc
 *
 */
public final class GmfAnimator {
    
    private static volatile boolean replay = false;
    
    private GmfAnimator() { }
    
    /**
     * 
     * Call this method to animate the given objects.
     * 
     * @param figuresAndPath Hashmap holding the KViDFigures and the path to follow
     * @param diagram The diagram in which the animation should take place
     * @param animationTime The time an animation may use to perform
     */
    @SuppressWarnings("static-access")
    public static void animate(final HashMap<IKvidFigure, List<Point>> figuresAndPath,
                               final DiagramEditPart diagram,
                               final int animationTime) {
        
        final IFigure canvas = diagram.getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);

        AnimatingCommand anima = new AnimatingCommand();
        if (RuntimeConfiguration.getInstance()
                .currentValueOfProperty("Debug drawing activated").equals("true")) {
            anima.setDebug(true);
        } 
        CompoundCommand cc = new CompoundCommand();
        boolean allPathsExeeded = false;
        int pathCounter = 0;
        
        while (!allPathsExeeded) {
            allPathsExeeded = true;
            for (IKvidFigure figure : figuresAndPath.keySet()) {
                if (pathCounter == 0) {
                    anima.initializeAnimatedElement(figure, diagram.getViewer());
                }
                if (pathCounter < figuresAndPath.get(figure).size()) {      
                    anima.specifyStep(figure, figuresAndPath.get(figure).get(pathCounter));
                    if ((pathCounter + 1) < figuresAndPath.get(figure).size()) {
                        allPathsExeeded = false;
                    }
                } else {
                    anima.specifyStep(figure,
                            figuresAndPath.get(figure).get(figuresAndPath.get(figure).size() - 1));
                }
            }
            if (!allPathsExeeded) {
                anima.nextStep();
            }
            pathCounter++;
        }
        
        anima.setCompleteDuration(animationTime / 2);
        cc.add(anima);
        diagram.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
        
        if (RuntimeConfiguration.getInstance()
                .currentValueOfProperty("Behavior after Animation")
                .equals("Stay at last location")) {
            for (final IKvidFigure figure : figuresAndPath.keySet()) {
                Point lastLocation = anima.getFinalLocation(figure);
                lastLocation.x -= figure.getBounds().width / 2;
                lastLocation.y -= figure.getBounds().height / 2;
                figure.setLocation(lastLocation);
                PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                    public void run() {
                        canvas.add(figure);
                    }
                });
                canvas.repaint();
            }
        } else if (RuntimeConfiguration.getInstance()
                .currentValueOfProperty("Behavior after Animation")
                .equals("Replay")) {
            replay = true;
            while (replay) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                diagram.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
            }
        }
    }
    
    public static synchronized void stopReplay() {
        replay = false;
    }
    
}
