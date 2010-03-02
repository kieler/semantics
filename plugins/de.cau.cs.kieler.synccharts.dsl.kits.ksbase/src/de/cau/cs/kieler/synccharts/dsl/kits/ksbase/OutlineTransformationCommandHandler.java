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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.dsl.kits.ksbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.util.concurrent.IEObjectHandle;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;
import de.cau.cs.kieler.core.model.transformation.xtend.XtendTransformationFramework;
import de.cau.cs.kieler.ksbase.core.EditorTransformationSettings;
import de.cau.cs.kieler.ksbase.core.KSBasETransformation;
import de.cau.cs.kieler.ksbase.core.TransformationManager;
import de.cau.cs.kieler.ksbase.ui.KSBasEUIPlugin;

/**
 * The generic transformation handler used for all UI actions.
 * 
 * @author mim
 * 
 * @kieler.rating 2009-12-15 proposed yellow
 */
public class OutlineTransformationCommandHandler extends AbstractHandler {

    /**
     * The list of classes an editor has to implement/extend to be valid for
     * this framework.
     **/
    public static final String EDITOR_PARAM = "de.cau.cs.kieler.ksbase.editorParameter";
    /**
     * The list of classes a diagram element has to implement/extend to be valid
     * for this framework.
     **/
    public static final String TRANSFORMATION_PARAM = "de.cau.cs.kieler.ksbase.transformationParameter";

    private final ITransformationFramework framework;
    protected LinkedList<EObject> targetList;

    /**
     * Creates a new command handler.
     */
    public OutlineTransformationCommandHandler() {
        framework = new XtendTransformationFramework();
        targetList = new LinkedList<EObject>();
    }

    private LinkedList<EObject> getObjectsFromXtextOutline() {
        if (PlatformUI.getWorkbench() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getSelectionService() != null) {
            ISelection sel = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getSelectionService()
                    .getSelection();
            LinkedList<EObject> eo = new LinkedList<EObject>();
            if (sel instanceof StructuredSelection) {
                Iterator<?> it = ((StructuredSelection) sel).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof ContentOutlineNode) {

                        // NodeUtil.getASTElementForRootNode(null);
                        IEObjectHandle<EObject> handle = ((ContentOutlineNode) next)
                                .getEObjectHandle();

                        handle.readOnly(new IUnitOfWork<Object, EObject>() {

                            public Object exec(EObject state) throws Exception {
                                targetList.add(state);
                                return null;
                            }

                        });

                    }
                }
            }
            return eo;
        } else {
            return null;
        }
    }

    /**
     * Executes a transformation. The editor and transformation settings are
     * given by the extension point parameters Uses the TransformationUI manager
     * to create and execute the transformation.
     * 
     * @param event
     *            The source event
     * @throws ExecutionException
     *             If the execution failed.
     * @return Nothing
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {

        EditorTransformationSettings editor = TransformationManager.INSTANCE
                .getEditorById(event.getParameter(EDITOR_PARAM));
        if (editor != null) {
            targetList.clear();
            KSBasETransformation t = editor.getTransformationByName(event
                    .getParameter(TRANSFORMATION_PARAM));
            // Selection
            getObjectsFromXtextOutline();
            framework.setParameters(targetList.toArray(new Object[targetList
                    .size()]));

            framework.initializeTransformation(editor.getTransformationFile(),
                    t.getTransformation(), editor.getModelPackageClass());
            Object res = framework.executeTransformation();

            Resource x = targetList.get(0).eResource().getContents().get(0)
                    .eResource();

            try {
                x.save(null);
                x.load(x.getResourceSet().getLoadOptions());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            InputStream in;
            try {
                org.eclipse.emf.common.util.URI eUri = x.getURI();
                String platformString = eUri.toPlatformString(true);

                in = new FileInputStream(ResourcesPlugin.getWorkspace()
                        .getRoot().findMember(platformString).getLocation()
                        .toFile());

                ((XtextResource) x).getParser().parse(in);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else {
            KSBasEUIPlugin.getDefault().logError(
                    "Could not find " + event.getParameter(EDITOR_PARAM)
                            + ". Please check transformation settings for "
                            + event.getParameter(TRANSFORMATION_PARAM));
        }
        return null;
    }
}
