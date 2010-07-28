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
package de.cau.cs.kieler.kvid.datadistributor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kvid.data.KViDDataObject;
import de.cau.cs.kieler.kvid.visual.GMFDrawer;
import de.cau.cs.kieler.kvid.visual.IDrawer;

/**
 * This class organizes the distribution of the collected data to the object that
 * visualize it.
 * 
 * @author jjc
 *
 */
public class KViDDataDistributor implements IProviderListener {
    
    private static final KViDDataDistributor INSTANCE = new KViDDataDistributor();
    
    private HashMap<String, EditPart> editPartsByURI = new HashMap<String, EditPart>();
    
    private HashMap<String, KViDDataObject> dataByURI = new HashMap<String, KViDDataObject>();
    
    private IDrawer drawer = new GMFDrawer();
    
    public static KViDDataDistributor getInstance() {
        return INSTANCE;
    }
    
    public void initialize() {
        IEditorPart activeEditor = getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            DiagramEditPart dep = ((DiagramEditor) activeEditor).getDiagramEditPart();
            Collection<?> editParts = dep.getViewer().getEditPartRegistry()
                    .values();
            for (Object object : editParts) {
                EditPart part = (EditPart) object;
                if (part.getModel() instanceof EObject) {
                    EObject eObject = (EObject) part.getModel();
                    Resource resource = eObject.eResource();
                    System.out.println(eObject.toString());
                    String uri = EcoreUtil.getURI(eObject).toString();
                    editPartsByURI.put(uri, part);
                    System.out.println(uri);
                }
            }
        }
    }
    
    public JSONObject update(final JSONObject data) {
        Iterator allKeys = data.keys();
        int figureCounter = 1;
        final int horizontalConstant = 300;
        final int movementWidth = 100;
        final int objectSpacing = 50;
        while (allKeys.hasNext()) {
            List<Point> randomPath = new LinkedList<Point>();
            randomPath.add(new Point(horizontalConstant, figureCounter * objectSpacing));
            randomPath.add(new Point(horizontalConstant + movementWidth, figureCounter * objectSpacing));
            randomPath.add(new Point(horizontalConstant, figureCounter * objectSpacing));
            Object o = allKeys.next();
            try {
                String key = o.toString();
                dataByURI.put(o.toString(), new KViDDataObject(key, data.getString(key), randomPath));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            figureCounter++;
        }
        drawer.draw(dataByURI);
        return null;
    }
    
    public void cleanup() {
        drawer.clearDrawing();
    }
    
    public void markPartByURI(String fragmentURI) {
        EditPart marked = getEditPartByURI(fragmentURI);
        if (marked instanceof GraphicalEditPart) {
            IFigure markable = ((GraphicalEditPart) marked).getFigure();
            markable.setBackgroundColor(ColorConstants.blue);
        }
    }
    
    public EditPart getEditPartByURI(String fragmentURI) {
        return editPartsByURI.get(fragmentURI);
    }
    
    public IEditorPart getActiveEditor() {
        IEditorPart editor = null;
        IWorkbenchWindow[] activeWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
        for (int i = 0; i < activeWindows.length; i++) {
            IWorkbenchPage page = activeWindows[i].getActivePage();
            if (page.getActiveEditor() != null) {
                editor = page.getActiveEditor();
            }
        }
        return editor;        
    }

    public void triggerInitialization() {
        initialize();
    }

    public void triggerWrapup() {
        cleanup();
        editPartsByURI = new HashMap<String, EditPart>();
        dataByURI = new HashMap<String, KViDDataObject>();
    }

}
