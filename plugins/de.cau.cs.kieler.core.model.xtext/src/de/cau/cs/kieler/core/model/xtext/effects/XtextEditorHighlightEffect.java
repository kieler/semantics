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
package de.cau.cs.kieler.core.model.xtext.effects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.model.xtext.ModelXtextPlugin;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * Initial implementation of a highlight effect for Xtext editors.
 * 
 * @author chsch
 */
public class XtextEditorHighlightEffect extends AbstractEffect {

    private EObject element = null;
    
    /**
     * Constructor.
     * @param theElement element
     */
    public XtextEditorHighlightEffect(final EObject theElement) {
        this.element = theElement;
    }
    
    /**
     * {@inheritDoc}
     */
    public void execute() {

        // determine the workbench resource path of 'element's definition document
        final IPath path = new Path(this.element.eResource().getURI().toPlatformString(false));
        final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                IWorkbenchPage page =
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                
                // find an editor maintaining the document that defines 'element'
                //  if some is open in the current page
                Object editor = ResourceUtil.findEditor(page, file);
                
                // if no such xtext editor exists open a new one 
                if (!(editor instanceof XtextEditor)) {
                    try {
                        IEditorPart part = IDE.openEditor(page, file);
                        if (part instanceof XtextEditor) {
                            editor = part;
                            
                        }
                    } catch (PartInitException e) {
                        StatusManager.getManager().handle(
                                new Status(IStatus.WARNING, ModelXtextPlugin.PLUGIN_ID,
                                        "Error occured while opening the model element definition"
                                                + "in an Xtext based editor", e));
                        return;
                    }                    
                    
                } 
                XtextEditor xEditor = (XtextEditor) editor;
                
                // query the editor library for the position of the elements definition                
                Integer[] elementData = xEditor.getDocument().readOnly(
                        new IUnitOfWork<Integer[], XtextResource>() {
                            public Integer[] exec(final XtextResource state) throws Exception {
                                INode node = NodeModelUtils.findActualNodeFor(element);
                                return new Integer[] { node.getOffset(), node.getLength() };
                            }
                        });
                
                // set the selection to that area
                xEditor.getInternalSourceViewer().setSelectedRange(elementData[0], elementData[1]);
                xEditor.getInternalSourceViewer().revealRange(elementData[0], elementData[1]);
                
                // bring it to foreground
                page.bringToTop(xEditor);
            }
        }, true);
            
    }

}
